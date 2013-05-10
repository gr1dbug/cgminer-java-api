package com.gridbuglabs.cgminer.api;

/**
 * Created with IntelliJ IDEA.
 * User: craig
 * Date: 5/9/13
 * Time: 9:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class GpuResult {

    private final String status;
    private final Long when;
    private final Integer code;
    private final String msg;
    private final String description;
    private final String call;
    private final String enabled;
    private final String gpuStatus;
    private final Float temperature;
    private final Integer fanSpeed;
    private final Integer fanPercent;
    private final Integer gpuClock;
    private final Integer memoryClock;
    private final Float gpuVoltage;
    private final Integer gpuActivity;
    private final Integer powertune;
    private final Float mhsav;
    private final Float mhs5s;
    private final Integer accepted;
    private final Integer rejected;
    private final Integer hardwareErrors;
    private final Float utility;
    private final Integer intensity;
    private final Integer lastSharePool;
    private final Long lastShareTime;
    private final Float totalMH;
    private final Integer diff1Work;
    private final Float difficultyAccepted;
    private final Float difficultyRejected;
    private final Float lastShareDifficulty;
    private final Integer lastValidWork;

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

    public String getEnabled() {
        return enabled;
    }

    public String getGpuStatus() {
        return gpuStatus;
    }

    public Float getTemperature() {
        return temperature;
    }

    public Integer getFanSpeed() {
        return fanSpeed;
    }

    public Integer getFanPercent() {
        return fanPercent;
    }

    public Integer getGpuClock() {
        return gpuClock;
    }

    public Integer getMemoryClock() {
        return memoryClock;
    }

    public Float getGpuVoltage() {
        return gpuVoltage;
    }

    public Integer getGpuActivity() {
        return gpuActivity;
    }

    public Integer getPowertune() {
        return powertune;
    }

    public Float getMhsav() {
        return mhsav;
    }

    public Float getMhs5s() {
        return mhs5s;
    }

    public Integer getAccepted() {
        return accepted;
    }

    public Integer getRejected() {
        return rejected;
    }

    public Integer getHardwareErrors() {
        return hardwareErrors;
    }

    public Float getUtility() {
        return utility;
    }

    public Integer getIntensity() {
        return intensity;
    }

    public Integer getLastSharePool() {
        return lastSharePool;
    }

    public Long getLastShareTime() {
        return lastShareTime;
    }

    public Float getTotalMH() {
        return totalMH;
    }

    public Integer getDiff1Work() {
        return diff1Work;
    }

    public Float getDifficultyAccepted() {
        return difficultyAccepted;
    }

    public Float getDifficultyRejected() {
        return difficultyRejected;
    }

    public Float getLastShareDifficulty() {
        return lastShareDifficulty;
    }

    public Integer getLastValidWork() {
        return lastValidWork;
    }

    public GpuResult(String status, Long when, Integer code, String msg, String description, String call, String enabled, String gpuStatus, Float temperature, Integer fanSpeed, Integer fanPercent, Integer gpuClock, Integer memoryClock, Float gpuVoltage, Integer gpuActivity, Integer powertune, Float mhsav, Float mhs5s, Integer accepted, Integer rejected, Integer hardwareErrors, Float utility, Integer intensity, Integer lastSharePool, Long lastShareTime, Float totalMH, Integer diff1Work, Float difficultyAccepted, Float difficultyRejected, Float lastShareDifficulty, Integer lastValidWork) {
        this.status = status;
        this.when = when;
        this.code = code;
        this.msg = msg;
        this.description = description;
        this.call = call;
        this.enabled = enabled;
        this.gpuStatus = gpuStatus;
        this.temperature = temperature;
        this.fanSpeed = fanSpeed;
        this.fanPercent = fanPercent;
        this.gpuClock = gpuClock;
        this.memoryClock = memoryClock;
        this.gpuVoltage = gpuVoltage;
        this.gpuActivity = gpuActivity;
        this.powertune = powertune;
        this.mhsav = mhsav;
        this.mhs5s = mhs5s;
        this.accepted = accepted;
        this.rejected = rejected;
        this.hardwareErrors = hardwareErrors;
        this.utility = utility;
        this.intensity = intensity;
        this.lastSharePool = lastSharePool;
        this.lastShareTime = lastShareTime;
        this.totalMH = totalMH;
        this.diff1Work = diff1Work;
        this.difficultyAccepted = difficultyAccepted;
        this.difficultyRejected = difficultyRejected;
        this.lastShareDifficulty = lastShareDifficulty;
        this.lastValidWork = lastValidWork;
    }

    @Override
    public String toString() {
        return "GpuResult{" +
                "status='" + status + '\'' +
                ", when=" + when +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                ", description='" + description + '\'' +
                ", call='" + call + '\'' +
                ", enabled='" + enabled + '\'' +
                ", gpuStatus='" + gpuStatus + '\'' +
                ", temperature=" + temperature +
                ", fanSpeed=" + fanSpeed +
                ", fanPercent=" + fanPercent +
                ", gpuClock=" + gpuClock +
                ", memoryClock=" + memoryClock +
                ", gpuVoltage=" + gpuVoltage +
                ", gpuActivity=" + gpuActivity +
                ", powertune=" + powertune +
                ", mhsav=" + mhsav +
                ", mhs5s=" + mhs5s +
                ", accepted=" + accepted +
                ", rejected=" + rejected +
                ", hardwareErrors=" + hardwareErrors +
                ", utility=" + utility +
                ", intensity=" + intensity +
                ", lastSharePool=" + lastSharePool +
                ", lastShareTime=" + lastShareTime +
                ", totalMH=" + totalMH +
                ", diff1Work=" + diff1Work +
                ", difficultyAccepted=" + difficultyAccepted +
                ", difficultyRejected=" + difficultyRejected +
                ", lastShareDifficulty=" + lastShareDifficulty +
                ", lastValidWork=" + lastValidWork +
                '}';
    }
}
