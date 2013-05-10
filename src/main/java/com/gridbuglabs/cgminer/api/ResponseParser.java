package com.gridbuglabs.cgminer.api;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: craig
 * Date: 5/8/13
 * Time: 10:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class ResponseParser {

    private static String rhs(String value) {
        if (value.contains("=")) {
            String[] splits = value.split("=");
            if (splits.length > 1) return splits[1];
            else return null;
        }
        else return value;
    }

    public static <E>  E parse(String response, Class<E> type, Class<?> subtype) {
        // there are two segments to a reply: the portion before the first | and the portion between |s. In some responses,
        // there are multiple pipe-delimited records (pools, gpus, etc.) We handle those with an array of subtype class.
        String preamble = response.split("\\|")[0];
        String[] records = response.substring(preamble.length()+1).trim().split("\\|");

        if (subtype == null) return parseSingleRecordType(preamble, records[0], type);
        else return parseMultiRecordType(preamble, records, type, subtype);
    }

    @SuppressWarnings("unchecked")
    private static <E> E parseSingleRecordType(String preamble, String record, Class<E> type) {
        String[] values = record.split(",");
        Class<?>[] ptypes = type.getConstructors()[0].getParameterTypes();

        Object[] preambleargs = handlePreamble(preamble, ptypes);

        // we are going to use the constructor to set up the object. our parameters are in response order,
        // so it's only a matter of pulling them off and coercing the types where necessary
        Object[] args = new Object[ptypes.length];
        System.arraycopy(preambleargs, 0, args, 0, preambleargs.length);
        for (int ri = 0, i = preambleargs.length; i < ptypes.length; i++, ri++) {
            args[i] = interpretOneValue(ptypes[i], values[ri]);
        }
        try {
            return (E)type.getConstructors()[0].newInstance(args);
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @SuppressWarnings("unchecked")
    private static <E> E parseMultiRecordType(String preamble, String[] records, Class<E> type, Class<?> subtype) {
        Class<?>[] ptypes = type.getConstructors()[0].getParameterTypes();

        Object[] preambleargs = handlePreamble(preamble, ptypes);
        // we are going to use the constructor to set up the object. our parameters are in response order,
        // so it's only a matter of pulling them off and coercing the types where necessary
        Object[] args = new Object[ptypes.length];
        System.arraycopy(preambleargs, 0, args, 0, preambleargs.length);

        // for all the multi-record types, after the preamble is just a | separated list of subtype records
        List subrecords = new ArrayList();

        for (String record : records) {
            subrecords.add(parseSubrecord(record, subtype));
        }
        args[preambleargs.length] = subrecords;

        try {
            return (E)type.getConstructors()[0].newInstance(args);
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @SuppressWarnings("unchecked")
    private static <E> E parseSubrecord(String record, Class<E> type) {
        String[] values = record.split(",");
        Class<?>[] ptypes = type.getConstructors()[0].getParameterTypes();
        Object[] args = new Object[ptypes.length];
        for (int i = 0; i < ptypes.length; i++) {
            args[i] = interpretOneValue(ptypes[i], values[i]);
        }
        try {
            return (E)type.getConstructors()[0].newInstance(args);
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static Object interpretOneValue(Class ctype, String value) {
        if (ctype.equals(String.class)) return rhs(value.trim());
        if (ctype.equals(Integer.class)) return Integer.parseInt(rhs(value.trim()));
        if (ctype.equals(Long.class)) return Long.parseLong(rhs(value.trim()));
        if (ctype.equals(Float.class)) return Float.parseFloat(rhs(value.trim()));
        if (ctype.equals(Boolean.class)) return Boolean.parseBoolean(rhs(value.trim()));
        else return null;
    }

    private static Object[] handlePreamble(String preamble, Class<?>[] ptypes) {
        String[] preamblevalues = preamble.split(",");
        Object[] args = new Object[preamblevalues.length];
        for (int i = 0; i < preamblevalues.length; i++) {
            args[i] = interpretOneValue(ptypes[i], preamblevalues[i]);
        }
        return args;
    }


}
