package com.gridbuglabs.cgminer.api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created with IntelliJ IDEA.
 * User: craig
 * Date: 5/8/13
 * Time: 9:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class CGMinerApi {

    private String host;
    private int port;

    public CGMinerApi() {
        this("localhost", 4028);
    }

    public CGMinerApi(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public VersionResult version() {
        return singleRecordCall("version", null, VersionResult.class);
    }

    public SummaryResult summary() {
        return singleRecordCall("summary", null, SummaryResult.class);
    }

    public PoolsResult pools() {
        return multiRecordCall("pools", null, PoolsResult.class, PoolsResult.PoolRecord.class);
    }

    public ConfigResult config() {
        return singleRecordCall("config", null, ConfigResult.class);
    }

    public DevsResult devs() {
        return multiRecordCall("devs", null, DevsResult.class, DevsResult.DevRecord.class);
    }

    public GpuResult gpu(int num) {
        return singleRecordCall("gpu", String.valueOf(num), GpuResult.class);
    }

    public GpuCountResult gpucount() {
        return singleRecordCall("gpucount", null, GpuCountResult.class);
    }

    public StatusOnlyResult switchpool(int num) {
        return singleRecordCall("switchpool", String.valueOf(num), StatusOnlyResult.class);
    }

    public StatusOnlyResult enablepool(int num) {
        return singleRecordCall("enablepool", String.valueOf(num), StatusOnlyResult.class);
    }

    public StatusOnlyResult addpool(String url, String user, String pass) {
        return singleRecordCall("addpool", url + "," + user + "," + pass, StatusOnlyResult.class);
    }

    public StatusOnlyResult disablepool(int num) {
        return singleRecordCall("disablepool", String.valueOf(num), StatusOnlyResult.class);
    }

    public StatusOnlyResult removepool(int num) {
        return singleRecordCall("removepool", String.valueOf(num), StatusOnlyResult.class);
    }

    public StatusOnlyResult gpuenable(int num) {
        return singleRecordCall("gpuenable", String.valueOf(num), StatusOnlyResult.class);
    }

    public StatusOnlyResult gpudisable(int num) {
        return singleRecordCall("gpudisable", String.valueOf(num), StatusOnlyResult.class);
    }

    public StatusOnlyResult gpurestart(int num) {
        return singleRecordCall("gpurestart", String.valueOf(num), StatusOnlyResult.class);
    }

    public StatusOnlyResult gpuintensity(int num, int intensity) {
        return singleRecordCall("gpuintensity", String.valueOf(num) + "," + String.valueOf(intensity), StatusOnlyResult.class);
    }

    public StatusOnlyResult gpumem(int num, int memclock) {
        return singleRecordCall("gpumem", String.valueOf(num) + "," + String.valueOf(memclock), StatusOnlyResult.class);
    }

    public StatusOnlyResult gpuengine(int num, int coreclock) {
        return singleRecordCall("gpuengine", String.valueOf(num) + "," + String.valueOf(coreclock), StatusOnlyResult.class);
    }

    public StatusOnlyResult gpufan(int num, int fanpct) {
        return singleRecordCall("gpufan", String.valueOf(num) + "," + String.valueOf(fanpct), StatusOnlyResult.class);
    }

    public StatusOnlyResult gpuvddc(int num, float voltage) {
        return singleRecordCall("gpuvddc", String.valueOf(num) + "," + String.valueOf(voltage), StatusOnlyResult.class);
    }

    public StatusOnlyResult save(int num, String filename) {
        return singleRecordCall("save", String.valueOf(num) + "," + filename, StatusOnlyResult.class);
    }

    public String quit() {
        return stringResultCall("quit", null);
    }

    public NotifyResult notifications() {
        return multiRecordCall("notify", null, NotifyResult.class, NotifyResult.NotifyRecord.class);
    }

    public StatusOnlyResult privileged() {
        return singleRecordCall("privileged", null, StatusOnlyResult.class);
    }

    public StatusOnlyResult pgaenable(int num) {
        return singleRecordCall("pgaenable", String.valueOf(num), StatusOnlyResult.class);
    }

    public StatusOnlyResult pgadisable(int num) {
        return singleRecordCall("pgadisable", String.valueOf(num), StatusOnlyResult.class);
    }

    public StatusOnlyResult pgaidentify(int num) {
        return singleRecordCall("pgaidentify", String.valueOf(num), StatusOnlyResult.class);
    }

    public String restart() {
        return stringResultCall("restart", null);
    }

    public CheckResult check(String command) {
        return singleRecordCall("check", command, CheckResult.class);
    }

    public StatusOnlyResult failoveronly(boolean value) {
        return singleRecordCall("failover-only", String.valueOf(value), StatusOnlyResult.class);
    }

    public CoinResult coin() {
        return singleRecordCall("coin", null, CoinResult.class);
    }

    public StatusOnlyResult setconfig(String name, int num) {
        return singleRecordCall("setconfig", name + "," + String.valueOf(num), StatusOnlyResult.class);
    }

    public StatusOnlyResult zero(String which, boolean value) {
        return singleRecordCall("zero", which + "," + String.valueOf(value), StatusOnlyResult.class);
    }

    public StatusOnlyResult hotplug(int num) {
        return singleRecordCall("hotplug", String.valueOf(num), StatusOnlyResult.class);
    }


    public String stringResultCall(String method, String params) {
        return call(method, params);
    }

    public <E> E singleRecordCall(String method, String params, Class<?> returnType) {
        String response = call(method, params);
        if (response != null) return (E)ResponseParser.parse(response, returnType, null);
        else return null;
    }

    public <E> E multiRecordCall(String method, String params, Class<?> returnType, Class<?> subtype) {
        String response = call(method, params);
        if (response != null) return (E)ResponseParser.parse(response, returnType, subtype);
        else return null;
    }

    protected String call(String method, String params) {
        try {
            Socket socket = new Socket(host, port);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out.println(method + "|" + params);
            return in.readLine();
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        try {
            CGMinerApi api = new CGMinerApi();

/*
            SummaryResult result = com.gridbuglabs.cgminer.api.api.summary();
            System.out.println("result: " + result);


            PoolsResult pr = com.gridbuglabs.cgminer.api.api.pools();
            System.out.println("pools: " + pr);

            ConfigResult c = com.gridbuglabs.cgminer.api.api.config();
            System.out.println("c: " + c);

            DevsResult pr = com.gridbuglabs.cgminer.api.api.devs();
            System.out.println("devs: " + pr);

*/

            GpuResult pr = api.gpu(2);
            System.out.println("devs: " + pr);

            System.out.println(api.call("coin", null));

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
