package com.gridbuglabs.cgminer.api;

/**
 * Created with IntelliJ IDEA.
 * User: craig
 * Date: 5/8/13
 * Time: 11:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class SummaryResult {
    private final String status;
    private final Long when;
    private final Integer code;
    private final String msg;
    private final String description;
    private final String call;
    private final Integer elapsed;
    private final Float mhsav;
    private final Integer foundBlocks;
    private final Integer getworks;
    private final Integer accepted;
    private final Integer rejected;
    private final Integer hwErrors;
    private final Float utility;
    private final Integer discarded;
    private final Integer stale;
    private final Integer getFailures;
    private final Integer localWork;
    private final Integer remoteFailures;
    private final Integer networkBlocks;
    private final Float totalMH;
    private final Float workUtility;
    private final Float diffAccepted;
    private final Float diffRejected;
    private final Float diffStale;
    private final Integer bestShare;


    @Override
    public String toString() {
        return "SummaryResult{" +
                "status='" + status + '\'' +
                ", when=" + when +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                ", description='" + description + '\'' +
                ", call='" + call + '\'' +
                ", elapsed=" + elapsed +
                ", mhsav=" + mhsav +
                ", foundBlocks=" + foundBlocks +
                ", getworks=" + getworks +
                ", accepted=" + accepted +
                ", rejected=" + rejected +
                ", hwErrors=" + hwErrors +
                ", utility=" + utility +
                ", discarded=" + discarded +
                ", stale=" + stale +
                ", getFailures=" + getFailures +
                ", localWork=" + localWork +
                ", remoteFailures=" + remoteFailures +
                ", networkBlocks=" + networkBlocks +
                ", totalMH=" + totalMH +
                ", workUtility=" + workUtility +
                ", diffAccepted=" + diffAccepted +
                ", diffRejected=" + diffRejected +
                ", diffStale=" + diffStale +
                ", bestShare=" + bestShare +
                '}';
    }

    public SummaryResult(String status, Long when, Integer code, String msg, String description, String call, Integer elapsed, Float mhsav, Integer foundBlocks, Integer getworks, Integer accepted, Integer rejected, Integer hwErrors, Float utility, Integer discarded, Integer stale, Integer getFailures, Integer localWork, Integer remoteFailures, Integer networkBlocks, Float totalMH, Float workUtility, Float diffAccepted, Float diffRejected, Float diffStale, Integer bestShare) {
        this.status = status;
        this.when = when;
        this.code = code;
        this.msg = msg;
        this.description = description;
        this.call = call;
        this.elapsed = elapsed;
        this.mhsav = mhsav;
        this.foundBlocks = foundBlocks;
        this.getworks = getworks;
        this.accepted = accepted;
        this.rejected = rejected;
        this.hwErrors = hwErrors;
        this.utility = utility;
        this.discarded = discarded;
        this.stale = stale;
        this.getFailures = getFailures;
        this.localWork = localWork;
        this.remoteFailures = remoteFailures;
        this.networkBlocks = networkBlocks;
        this.totalMH = totalMH;
        this.workUtility = workUtility;
        this.diffAccepted = diffAccepted;
        this.diffRejected = diffRejected;
        this.diffStale = diffStale;
        this.bestShare = bestShare;
    }

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

    public Integer getElapsed() {
        return elapsed;
    }

    public Float getMhsav() {
        return mhsav;
    }

    public Integer getFoundBlocks() {
        return foundBlocks;
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

    public Integer getHwErrors() {
        return hwErrors;
    }

    public Float getUtility() {
        return utility;
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

    public Integer getLocalWork() {
        return localWork;
    }

    public Integer getRemoteFailures() {
        return remoteFailures;
    }

    public Integer getNetworkBlocks() {
        return networkBlocks;
    }

    public Float getTotalMH() {
        return totalMH;
    }

    public Float getWorkUtility() {
        return workUtility;
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

    public Integer getBestShare() {
        return bestShare;
    }

}
