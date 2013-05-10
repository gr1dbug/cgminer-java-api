package com.gridbuglabs.cgminer.api;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: craig
 * Date: 5/9/13
 * Time: 1:23 AM
 * To change this template use File | Settings | File Templates.
 */
public class PoolsResult {

    private final String status;
    private final Long when;
    private final Integer code;
    private final String msg;
    private final String description;
    private final List<PoolRecord> records;

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

    public List<PoolRecord> getRecords() {
        return records;
    }

    public PoolsResult(String status, Long when, Integer code, String msg, String description, List<PoolRecord> records) {
        this.status = status;
        this.when = when;
        this.code = code;
        this.msg = msg;
        this.description = description;
        this.records = records;
    }

    @Override
    public String toString() {
        return "PoolResult{" +
                "status='" + status + '\'' +
                ", when=" + when +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                ", description='" + description + '\'' +
                ", records=" + records +
                '}';
    }

    public static class PoolRecord {
        private final String call;
        private final String url;
        private final String status;
        private final Integer priority;
        private final String longPoll;
        private final Integer getworks;
        private final Integer accepted;
        private final Integer rejected;
        private final Integer discarded;
        private final Integer stale;
        private final Integer getFailures;
        private final Integer remoteFailures;
        private final String user;
        private final Long lastShareTime;
        private final Integer diff1Shares;
        private final String proxyType;
        private final String proxy;
        private final Float diffAccepted;
        private final Float diffRejected;
        private final Float diffStale;
        private final Float lastShareDiff;
        private final Boolean hasStratum;
        private final Boolean stratumActive;
        private final String stratumUrl;
        private final Boolean hasGbt;
        private final Integer bestShare;

        public String getCall() {
            return call;
        }

        public String getUrl() {
            return url;
        }

        public String getStatus() {
            return status;
        }

        public Integer getPriority() {
            return priority;
        }

        public String getLongPoll() {
            return longPoll;
        }

        public Integer getGetworks() {
            return getworks;
        }

        public Integer getAccepted() {
            return accepted;
        }

        public Integer getRejected() {
            return rejected;
        }

        public Integer getDiscarded() {
            return discarded;
        }

        public Integer getStale() {
            return stale;
        }

        public Integer getGetFailures() {
            return getFailures;
        }

        public Integer getRemoteFailures() {
            return remoteFailures;
        }

        public String getUser() {
            return user;
        }

        public Long getLastShareTime() {
            return lastShareTime;
        }

        public Integer getDiff1Shares() {
            return diff1Shares;
        }

        public String getProxyType() {
            return proxyType;
        }

        public String getProxy() {
            return proxy;
        }

        public Float getDiffAccepted() {
            return diffAccepted;
        }

        public Float getDiffRejected() {
            return diffRejected;
        }

        public Float getDiffStale() {
            return diffStale;
        }

        public Float getLastShareDiff() {
            return lastShareDiff;
        }

        public Boolean getHasStratum() {
            return hasStratum;
        }

        public Boolean getStratumActive() {
            return stratumActive;
        }

        public String getStratumUrl() {
            return stratumUrl;
        }

        public Boolean getHasGbt() {
            return hasGbt;
        }

        public Integer getBestShare() {
            return bestShare;
        }

        public PoolRecord(String call, String url, String status, Integer priority, String longPoll, Integer getworks, Integer accepted, Integer rejected, Integer discarded, Integer stale, Integer getFailures, Integer remoteFailures, String user, Long lastShareTime, Integer diff1Shares, String proxyType, String proxy, Float diffAccepted, Float diffRejected, Float diffStale, Float lastShareDiff, Boolean hasStratum, Boolean stratumActive, String stratumUrl, Boolean hasGbt, Integer bestShare) {
            this.call = call;
            this.url = url;
            this.status = status;
            this.priority = priority;
            this.longPoll = longPoll;
            this.getworks = getworks;
            this.accepted = accepted;
            this.rejected = rejected;
            this.discarded = discarded;
            this.stale = stale;
            this.getFailures = getFailures;
            this.remoteFailures = remoteFailures;
            this.user = user;
            this.lastShareTime = lastShareTime;
            this.diff1Shares = diff1Shares;
            this.proxyType = proxyType;
            this.proxy = proxy;
            this.diffAccepted = diffAccepted;
            this.diffRejected = diffRejected;
            this.diffStale = diffStale;
            this.lastShareDiff = lastShareDiff;
            this.hasStratum = hasStratum;
            this.stratumActive = stratumActive;
            this.stratumUrl = stratumUrl;
            this.hasGbt = hasGbt;
            this.bestShare = bestShare;
        }

        @Override
        public String toString() {
            return "PoolRecord{" +
                    "call='" + call + '\'' +
                    ", url='" + url + '\'' +
                    ", status='" + status + '\'' +
                    ", priority=" + priority +
                    ", longPoll='" + longPoll + '\'' +
                    ", getworks=" + getworks +
                    ", accepted=" + accepted +
                    ", rejected=" + rejected +
                    ", discarded=" + discarded +
                    ", stale=" + stale +
                    ", getFailures=" + getFailures +
                    ", remoteFailures=" + remoteFailures +
                    ", user='" + user + '\'' +
                    ", lastShareTime=" + lastShareTime +
                    ", diff1Shares=" + diff1Shares +
                    ", proxyType='" + proxyType + '\'' +
                    ", proxy='" + proxy + '\'' +
                    ", diffAccepted=" + diffAccepted +
                    ", diffRejected=" + diffRejected +
                    ", diffStale=" + diffStale +
                    ", lastShareDiff=" + lastShareDiff +
                    ", hasStratum=" + hasStratum +
                    ", stratumActive=" + stratumActive +
                    ", stratumUrl='" + stratumUrl + '\'' +
                    ", hasGbt=" + hasGbt +
                    ", bestShare=" + bestShare +
                    '}';
        }
    }
}
