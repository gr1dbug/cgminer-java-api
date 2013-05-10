package com.gridbuglabs.cgminer.api;

/**
 * Created with IntelliJ IDEA.
 * User: craig
 * Date: 5/8/13
 * Time: 9:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class VersionResult {

    private final String status;
    private final Long when;
    private final Integer code;
    private final String msg;
    private final String description;
    private final String call;
    private final String cgminer;
    private final String api;

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

    public String getCgminer() {
        return cgminer;
    }

    public String getApi() {
        return api;
    }

    public String getStatus() {
        return status;
    }

    public Long getWhen() {
        return when;
    }

    public VersionResult(String status, Long when, Integer code, String msg, String description, String call, String cgminer, String api) {
        this.status = status;
        this.when = when;
        this.code = code;
        this.msg = msg;
        this.description = description;
        this.call = call;
        this.cgminer = cgminer;
        this.api = api;
    }

    @Override
    public String toString() {
        return "VersionResult{" +
                "status='" + status + '\'' +
                ", when=" + when +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                ", description='" + description + '\'' +
                ", call='" + call + '\'' +
                ", cgminer='" + cgminer + '\'' +
                ", com.gridbuglabs.cgminer.api.api='" + api + '\'' +
                '}';
    }

}
