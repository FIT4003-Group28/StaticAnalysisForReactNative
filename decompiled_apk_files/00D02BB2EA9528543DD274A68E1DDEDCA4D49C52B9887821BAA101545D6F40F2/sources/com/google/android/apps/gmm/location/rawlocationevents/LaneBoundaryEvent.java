package com.google.android.apps.gmm.location.rawlocationevents;
/* compiled from: PG */
@ckor
@ckol(a = "lanes", b = ckok.HIGH)
/* loaded from: classes.dex */
public class LaneBoundaryEvent {
    private final float[] bounds;
    private final float[] qualities;
    private final long timeMs;

    public LaneBoundaryEvent(@ckoo(a = "time", d = true) long j, @ckoo(a = "bounds") float[] fArr, @ckoo(a = "qualities") float[] fArr2) {
        this.timeMs = j;
        this.bounds = fArr;
        this.qualities = fArr2;
    }

    @ckom(a = "bounds")
    public float[] getBounds() {
        return this.bounds;
    }

    @ckom(a = "qualities")
    public float[] getQualities() {
        return this.qualities;
    }

    @ckom(a = "time")
    public long getTimeMs() {
        return this.timeMs;
    }

    public String toString() {
        dbsb b = dbsc.b(this);
        b.g("time", this.timeMs);
        b.b("bounds", this.bounds);
        b.b("qualities", this.qualities);
        return b.toString();
    }
}
