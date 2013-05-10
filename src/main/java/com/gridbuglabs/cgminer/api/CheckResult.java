package com.gridbuglabs.cgminer.api;

/**
 * Created with IntelliJ IDEA.
 * User: craig
 * Date: 5/9/13
 * Time: 11:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class CheckResult {

    private final String status;
    private final Long when;
    private final Integer code;
    private final String msg;
    private final String description;
    private final String call;
    private final String exists;
    private final String access;

    public String getStatus() {
        return status;
    }

    public Long getWhen() {
        return when;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public String getDescription() {
        return description;
    }

    public String getCall() {
        return call;
    }

    public String getExists() {
        return exists;
    }

    public String getAccess() {
        return access;
    }

    public CheckResult(String status, Long when, Integer code, String msg, String description, String call, String exists, String access) {
        this.status = status;
        this.when = when;
        this.code = code;
        this.msg = msg;
        this.description = description;
        this.call = call;
        this.exists = exists;
        this.access = access;
    }

    @Override
    public String toString() {
        return "CheckResult{" +
                "status='" + status + '\'' +
                ", when=" + when +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                ", description='" + description + '\'' +
                ", call='" + call + '\'' +
                ", exists='" + exists + '\'' +
                ", access='" + access + '\'' +
                '}';
    }
}
