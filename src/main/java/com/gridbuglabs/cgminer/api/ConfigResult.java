package com.gridbuglabs.cgminer.api;

/**
 * Created with IntelliJ IDEA.
 * User: craig
 * Date: 5/9/13
 * Time: 1:46 AM
 * To change this template use File | Settings | File Templates.
 */
public class ConfigResult {

    private final String status;
    private final Long when;
    private final Integer code;
    private final String msg;
    private final String description;
    private final String call;
    private final Integer gpucount;
    private final Integer asccount;
    private final Integer pgacount;
    private final Integer cpucount;
    private final Integer poolcount;
    private final String adl;
    private final String adlInUse;
    private final String strategy;
    private final Integer logInterval;
    private final String deviceCode;
    private final String os;
    private final Boolean failoverOnly;
    private final Integer scanTime;
    private final Integer queue;
    private final Integer expiry;
    private final Integer hotplug;

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

    public Integer getGpucount() {
        return gpucount;
    }

    public Integer getAsccount() {
        return asccount;
    }

    public Integer getPgacount() {
        return pgacount;
    }

    public Integer getCpucount() {
        return cpucount;
    }

    public Integer getPoolcount() {
        return poolcount;
    }

    public String getAdl() {
        return adl;
    }

    public String getAdlInUse() {
        return adlInUse;
    }

    public String getStrategy() {
        return strategy;
    }

    public Integer getLogInterval() {
        return logInterval;
    }

    public String getDeviceCode() {
        return deviceCode;
    }

    public String getOs() {
        return os;
    }

    public Boolean getFailoverOnly() {
        return failoverOnly;
    }

    public Integer getScanTime() {
        return scanTime;
    }

    public Integer getQueue() {
        return queue;
    }

    public Integer getExpiry() {
        return expiry;
    }

    public Integer getHotplug() {
        return hotplug;
    }

    public ConfigResult(String status, Long when, Integer code, String msg, String description, String call, Integer gpucount, Integer asccount, Integer pgacount, Integer cpucount, Integer poolcount, String adl, String adlInUse, String strategy, Integer logInterval, String deviceCode, String os, Boolean failoverOnly, Integer scanTime, Integer queue, Integer expiry, Integer hotplug) {
        this.status = status;
        this.when = when;
        this.code = code;
        this.msg = msg;
        this.description = description;
        this.call = call;
        this.gpucount = gpucount;
        this.asccount = asccount;
        this.pgacount = pgacount;
        this.cpucount = cpucount;
        this.poolcount = poolcount;
        this.adl = adl;
        this.adlInUse = adlInUse;
        this.strategy = strategy;
        this.logInterval = logInterval;
        this.deviceCode = deviceCode;
        this.os = os;
        this.failoverOnly = failoverOnly;
        this.scanTime = scanTime;
        this.queue = queue;
        this.expiry = expiry;
        this.hotplug = hotplug;
    }

    @Override
    public String toString() {
        return "ConfigResult{" +
                "status='" + status + '\'' +
                ", when=" + when +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                ", description='" + description + '\'' +
                ", call='" + call + '\'' +
                ", gpucount=" + gpucount +
                ", asccount=" + asccount +
                ", pgacount=" + pgacount +
                ", cpucount=" + cpucount +
                ", poolcount=" + poolcount +
                ", adl='" + adl + '\'' +
                ", adlInUse='" + adlInUse + '\'' +
                ", strategy='" + strategy + '\'' +
                ", logInterval=" + logInterval +
                ", deviceCode='" + deviceCode + '\'' +
                ", os='" + os + '\'' +
                ", failoverOnly=" + failoverOnly +
                ", scanTime=" + scanTime +
                ", queue=" + queue +
                ", expiry=" + expiry +
                ", hotplug=" + hotplug +
                '}';
    }
}
