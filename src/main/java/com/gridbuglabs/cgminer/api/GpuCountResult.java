package com.gridbuglabs.cgminer.api;

/**
 * Created with IntelliJ IDEA.
 * User: craig
 * Date: 5/9/13
 * Time: 9:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class GpuCountResult {

    private final String status;
    private final Long when;
    private final Integer code;
    private final String msg;
    private final String description;
    private final String call;
    private final Integer count;

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

    public Integer getCount() {
        return count;
    }

    public GpuCountResult(String status, Long when, Integer code, String msg, String description, String call, Integer count) {
        this.status = status;
        this.when = when;
        this.code = code;
        this.msg = msg;
        this.description = description;
        this.call = call;
        this.count = count;
    }

    @Override
    public String toString() {
        return "GpuCountResult{" +
                "status='" + status + '\'' +
                ", when=" + when +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                ", description='" + description + '\'' +
                ", call='" + call + '\'' +
                ", count=" + count +
                '}';
    }
}
