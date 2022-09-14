package com.google.android.apps.gmm.location.rawlocationevents;
/* compiled from: PG */
@ckor
@ckol(a = "pressure", b = ckok.HIGH)
/* loaded from: classes.dex */
public class AtmosphericPressureEvent {
    private final float pascals;
    private final long timeMs;

    public AtmosphericPressureEvent(@ckoo(a = "timeMs", d = true) long j, @ckoo(a = "pascals") float f) {
        this.timeMs = j;
        this.pascals = f;
    }

    public static double relativeAltitudeFromPressure(float f) {
        return 44331.5d - (Math.pow(f, 0.190263d) * 4946.62d);
    }

    @ckom(a = "pascals")
    public float getPascals() {
        return this.pascals;
    }

    @ckom(a = "timeMs")
    public long getTimeMs() {
        return this.timeMs;
    }

    public String toString() {
        dbsb b = dbsc.b(this);
        b.g("timeMs", this.timeMs);
        b.e("pascals", this.pascals);
        b.d("relative meters", relativeAltitudeFromPressure(this.pascals));
        return b.toString();
    }
}
