package com.gridbuglabs.cgminer.api;

/**
 * Created with IntelliJ IDEA.
 * User: craig
 * Date: 5/9/13
 * Time: 9:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class StatusOnlyResult {
    private final String status;
    private final Long when;
    private final Integer code;
    private final String msg;
    private final String description;

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

    public StatusOnlyResult(String status, Long when, Integer code, String msg, String description) {
        this.status = status;
        this.when = when;
        this.code = code;
        this.msg = msg;
        this.description = description;
    }

    @Override
    public String toString() {
        return "EnablePoolResult{" +
                "status='" + status + '\'' +
                ", when=" + when +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                ", description='" + description + '\'' +
                '}';
    }}
