package com.google.android.apps.gmm.location.motionsensors;
/* compiled from: PG */
@ckor
@ckol(a = "motion", b = ckok.HIGH)
/* loaded from: classes.dex */
public class MotionSensorEvent {
    private final long eventTimestampMillis;
    private final int sensorType;
    private final float value;

    public MotionSensorEvent(@ckoo(a = "sensorType") int i, @ckoo(a = "eventTimestampMillis") long j, @ckoo(a = "sensorEventValue") float f) {
        this.sensorType = i;
        this.eventTimestampMillis = j;
        this.value = f;
    }

    @ckom(a = "eventTimestampMillis")
    public long getEventTimestampMillis() {
        return this.eventTimestampMillis;
    }

    @ckom(a = "sensorEventValue")
    public float getSensorEventValue() {
        return this.value;
    }

    @ckom(a = "sensorType")
    public int getSensorType() {
        return this.sensorType;
    }
}
