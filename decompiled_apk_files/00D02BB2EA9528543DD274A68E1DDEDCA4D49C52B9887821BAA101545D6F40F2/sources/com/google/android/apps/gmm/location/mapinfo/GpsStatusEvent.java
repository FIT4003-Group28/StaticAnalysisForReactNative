package com.google.android.apps.gmm.location.mapinfo;
/* compiled from: PG */
@ckor
@ckol(a = "snr", b = ckok.MEDIUM)
/* loaded from: classes.dex */
public class GpsStatusEvent {
    private final float topSnr;

    public GpsStatusEvent(float f) {
        this.topSnr = f;
    }

    public GpsStatusEvent(@ckoo(a = "topSnr") String str) {
        this.topSnr = Float.parseFloat(str);
    }

    @ckom(a = "topSnr")
    public String getSnrString() {
        return Float.toString(this.topSnr);
    }

    public float getTopSnr() {
        return this.topSnr;
    }
}
