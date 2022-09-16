package com.google.android.apps.gmm.util.replay;
/* compiled from: PG */
@btsb
@ckol(a = "set-state")
/* loaded from: classes.dex */
public class SetStateEvent {
    private final boolean crash;
    @dzsi
    private final String experimentIds;
    @dzsi
    private final Long frameRate;
    @dzsi
    private final Boolean isOffline;
    @dzsi
    private final Float screenBrightness;
    private final boolean updateTraffic;

    public SetStateEvent(@dzsi @ckoo(a = "is-offline") Boolean bool, @dzsi @ckoo(a = "experiment-ids") String str, @dzsi @ckoo(a = "update-traffic") Boolean bool2, @dzsi @ckoo(a = "crash") Boolean bool3, @dzsi @ckoo(a = "frame-rate") Long l, @dzsi @ckoo(a = "screen-brightness") Float f) {
        this.isOffline = bool;
        this.experimentIds = str;
        this.updateTraffic = Boolean.TRUE.equals(bool2);
        this.crash = Boolean.TRUE.equals(bool3);
        this.frameRate = l;
        this.screenBrightness = f;
    }

    @ckom(a = "crash")
    public Boolean getCrash() {
        return Boolean.valueOf(this.crash);
    }

    @ckom(a = "experiment-ids")
    @dzsi
    public String getExperimentIds() {
        return this.experimentIds;
    }

    @ckom(a = "frame-rate")
    @dzsi
    public Long getFrameRate() {
        return this.frameRate;
    }

    @ckom(a = "is-offline")
    @dzsi
    public Boolean getIsOffline() {
        return this.isOffline;
    }

    @ckom(a = "screen-brightness")
    @dzsi
    public Float getScreenBrightness() {
        return this.screenBrightness;
    }

    @ckom(a = "update-traffic")
    public Boolean getUpdateTraffic() {
        return Boolean.valueOf(this.updateTraffic);
    }

    @ckon(a = "experiment-ids")
    public boolean hasExperimentIds() {
        return this.experimentIds != null;
    }

    @ckon(a = "frame-rate")
    public boolean hasFrameRate() {
        return this.frameRate != null;
    }

    @ckon(a = "is-offline")
    public boolean hasIsOffline() {
        return this.isOffline != null;
    }

    @ckon(a = "screen-brightness")
    public boolean hasScreenBrightness() {
        return this.screenBrightness != null;
    }
}
