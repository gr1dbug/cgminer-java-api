package com.gridbuglabs.cgminer.api;

/**
 * Created with IntelliJ IDEA.
 * User: craig
 * Date: 5/9/13
 * Time: 11:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class NotifyResult {
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

    public NotifyResult(String status, Long when, Integer code, String msg, String description) {
        this.status = status;
        this.when = when;
        this.code = code;
        this.msg = msg;
        this.description = description;
    }

    @Override
    public String toString() {
        return "NotifyResult{" +
                "status='" + status + '\'' +
                ", when=" + when +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static class NotifyRecord {
        private final String call;
        private final String Name;
        private final Integer ID;
        private final Long lastWell;
        private final Integer lastNotWell;
        private final String reasonNotWell;
        private final Integer threadFailInit;
        private final Integer threadZeroHash;
        private final Integer threadFailQueue;
        private final Integer devSickIdle60s;
        private final Integer devDeadIdle600s;
        private final Integer devNostart;
        private final Integer devOverHeat;
        private final Integer devThermalCutoff;
        private final Integer devCommsError;
        private final Integer devThrottle;


        public String getCall() {
            return call;
        }

        public String getName() {
            return Name;
        }

        public Integer getID() {
            return ID;
        }

        public Long getLastWell() {
            return lastWell;
        }

        public Integer getLastNotWell() {
            return lastNotWell;
        }

        public String getReasonNotWell() {
            return reasonNotWell;
        }

        public Integer getThreadFailInit() {
            return threadFailInit;
        }

        public Integer getThreadZeroHash() {
            return threadZeroHash;
        }

        public Integer getThreadFailQueue() {
            return threadFailQueue;
        }

        public Integer getDevSickIdle60s() {
            return devSickIdle60s;
        }

        public Integer getDevDeadIdle600s() {
            return devDeadIdle600s;
        }

        public Integer getDevNostart() {
            return devNostart;
        }

        public Integer getDevOverHeat() {
            return devOverHeat;
        }

        public Integer getDevThermalCutoff() {
            return devThermalCutoff;
        }

        public Integer getDevCommsError() {
            return devCommsError;
        }

        public Integer getDevThrottle() {
            return devThrottle;
        }

        public NotifyRecord(String call, String name, Integer ID, Long lastWell, Integer lastNotWell, String reasonNotWell, Integer threadFailInit, Integer threadZeroHash, Integer threadFailQueue, Integer devSickIdle60s, Integer devDeadIdle600s, Integer devNostart, Integer devOverHeat, Integer devThermalCutoff, Integer devCommsError, Integer devThrottle) {
            this.call = call;
            Name = name;
            this.ID = ID;
            this.lastWell = lastWell;
            this.lastNotWell = lastNotWell;
            this.reasonNotWell = reasonNotWell;
            this.threadFailInit = threadFailInit;
            this.threadZeroHash = threadZeroHash;
            this.threadFailQueue = threadFailQueue;
            this.devSickIdle60s = devSickIdle60s;
            this.devDeadIdle600s = devDeadIdle600s;
            this.devNostart = devNostart;
            this.devOverHeat = devOverHeat;
            this.devThermalCutoff = devThermalCutoff;
            this.devCommsError = devCommsError;
            this.devThrottle = devThrottle;
        }

        @Override
        public String toString() {
            return "NotifyRecord{" +
                    "call='" + call + '\'' +
                    ", Name='" + Name + '\'' +
                    ", ID=" + ID +
                    ", lastWell=" + lastWell +
                    ", lastNotWell=" + lastNotWell +
                    ", reasonNotWell='" + reasonNotWell + '\'' +
                    ", threadFailInit=" + threadFailInit +
                    ", threadZeroHash=" + threadZeroHash +
                    ", threadFailQueue=" + threadFailQueue +
                    ", devSickIdle60s=" + devSickIdle60s +
                    ", devDeadIdle600s=" + devDeadIdle600s +
                    ", devNostart=" + devNostart +
                    ", devOverHeat=" + devOverHeat +
                    ", devThermalCutoff=" + devThermalCutoff +
                    ", devCommsError=" + devCommsError +
                    ", devThrottle=" + devThrottle +
                    '}';
        }
    }
}
