package com.gridbuglabs.cgminer.api;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: craig
 * Date: 5/9/13
 * Time: 2:00 AM
 * To change this template use File | Settings | File Templates.
 */
public class DevsResult {

    private final String status;
    private final Long when;
    private final Integer code;
    private final String msg;
    private final String description;
    private final List<DevRecord> records;

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

    public List<DevRecord> getRecords() {
        return records;
    }

    public DevsResult(String status, Long when, Integer code, String msg, String description, List<DevRecord> records) {
        this.status = status;
        this.when = when;
        this.code = code;
        this.msg = msg;
        this.description = description;
        this.records = records;
    }

    @Override
    public String toString() {
        return "DevsResult{" +
                "status='" + status + '\'' +
                ", when=" + when +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                ", description='" + description + '\'' +
                ", records=" + records +
                '}';
    }

    public static class DevRecord {
        private final String call;
        private final String enabled;
        private final String status;
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
        private final Integer hwerror;
        private final Float utility;
        private final Integer intensity;
        private final Integer lastSharePool;
        private final Long lastShareTime;
        private final Float totalMH;
        private final Integer diff1Work;
        private final Float diffAccepted;
        private final Float diffRejected;
        private final Float lastShareDiff;
        private final Integer lastValidWork;

        public String getCall() {
            return call;
        }

        public String getEnabled() {
            return enabled;
        }

        public String getStatus() {
            return status;
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

        public Integer getHwerror() {
            return hwerror;
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

        public Float getDiffAccepted() {
            return diffAccepted;
        }

        public Float getDiffRejected() {
            return diffRejected;
        }

        public Float getLastShareDiff() {
            return lastShareDiff;
        }

        public Integer getLastValidWork() {
            return lastValidWork;
        }

        public DevRecord(String call, String enabled, String status, Float temperature, Integer fanSpeed, Integer fanPercent, Integer gpuClock, Integer memoryClock, Float gpuVoltage, Integer gpuActivity, Integer powertune, Float mhsav, Float mhs5s, Integer accepted, Integer rejected, Integer hwerror, Float utility, Integer intensity, Integer lastSharePool, Long lastShareTime, Float totalMH, Integer diff1Work, Float diffAccepted, Float diffRejected, Float lastShareDiff, Integer lastValidWork) {
            this.call = call;
            this.enabled = enabled;
            this.status = status;
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
            this.hwerror = hwerror;
            this.utility = utility;
            this.intensity = intensity;
            this.lastSharePool = lastSharePool;
            this.lastShareTime = lastShareTime;
            this.totalMH = totalMH;
            this.diff1Work = diff1Work;
            this.diffAccepted = diffAccepted;
            this.diffRejected = diffRejected;
            this.lastShareDiff = lastShareDiff;
            this.lastValidWork = lastValidWork;
        }

        @Override
        public String toString() {
            return "DevRecord{" +
                    "call='" + call + '\'' +
                    ", enabled='" + enabled + '\'' +
                    ", status='" + status + '\'' +
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
                    ", hwerror=" + hwerror +
                    ", utility=" + utility +
                    ", intensity=" + intensity +
                    ", lastSharePool=" + lastSharePool +
                    ", lastShareTime=" + lastShareTime +
                    ", totalMH=" + totalMH +
                    ", diff1Work=" + diff1Work +
                    ", diffAccepted=" + diffAccepted +
                    ", diffRejected=" + diffRejected +
                    ", lastShareDiff=" + lastShareDiff +
                    ", lastValidWork=" + lastValidWork +
                    '}';
        }
    }
}
