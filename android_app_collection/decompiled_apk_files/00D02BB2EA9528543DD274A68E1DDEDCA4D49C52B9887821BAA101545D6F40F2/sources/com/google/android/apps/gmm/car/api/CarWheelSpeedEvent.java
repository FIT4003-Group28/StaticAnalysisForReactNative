package com.google.android.apps.gmm.car.api;
/* compiled from: PG */
@btsb
@ckor
@ckol(a = "car-wheelspeed", b = ckok.HIGH)
/* loaded from: classes.dex */
public final class CarWheelSpeedEvent {
    private final float wheelSpeed;

    public CarWheelSpeedEvent(@ckoo(a = "speed") float f) {
        this.wheelSpeed = f;
    }

    @ckom(a = "speed")
    public float getWheelSpeedMetersPerSecond() {
        return this.wheelSpeed;
    }

    public String toString() {
        dbsb b = dbsc.b(this);
        b.e("wheelSpeed", this.wheelSpeed);
        return b.toString();
    }
}
