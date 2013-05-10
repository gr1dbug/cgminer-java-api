package com.gridbuglabs.cgminer.api;

/**
 * Created with IntelliJ IDEA.
 * User: craig
 * Date: 5/9/13
 * Time: 11:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class CoinResult {
    private final String status;
    private final Long when;
    private final Integer code;
    private final String msg;
    private final String description;
    private final String call;
    private final String hashMethod;
    private final Float currentBlockTime;
    private final String currentBlockHash;
    private final Boolean lp;
    private final Float networkDifficulty;

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

    public String getHashMethod() {
        return hashMethod;
    }

    public Float getCurrentBlockTime() {
        return currentBlockTime;
    }

    public String getCurrentBlockHash() {
        return currentBlockHash;
    }

    public Boolean getLp() {
        return lp;
    }

    public Float getNetworkDifficulty() {
        return networkDifficulty;
    }

    public CoinResult(String status, Long when, Integer code, String msg, String description, String call, String hashMethod, Float currentBlockTime, String currentBlockHash, Boolean lp, Float networkDifficulty) {
        this.status = status;
        this.when = when;
        this.code = code;
        this.msg = msg;
        this.description = description;
        this.call = call;
        this.hashMethod = hashMethod;
        this.currentBlockTime = currentBlockTime;
        this.currentBlockHash = currentBlockHash;
        this.lp = lp;
        this.networkDifficulty = networkDifficulty;
    }

    @Override
    public String toString() {
        return "CoinResult{" +
                "status='" + status + '\'' +
                ", when=" + when +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                ", description='" + description + '\'' +
                ", call='" + call + '\'' +
                ", hashMethod='" + hashMethod + '\'' +
                ", currentBlockTime=" + currentBlockTime +
                ", currentBlockHash='" + currentBlockHash + '\'' +
                ", lp=" + lp +
                ", networkDifficulty=" + networkDifficulty +
                '}';
    }
}
