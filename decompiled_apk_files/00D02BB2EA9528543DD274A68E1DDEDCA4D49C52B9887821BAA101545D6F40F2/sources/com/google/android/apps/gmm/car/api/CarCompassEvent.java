package com.google.android.apps.gmm.car.api;
/* compiled from: PG */
@btsb
@ckor
@ckol(a = "car-compass", b = ckok.HIGH)
/* loaded from: classes.dex */
public final class CarCompassEvent {
    private final float pitch;
    private final float roll;
    private final float yaw;

    public CarCompassEvent(float f) {
        this(f, Float.NaN, Float.NaN);
    }

    public CarCompassEvent(@ckoo(a = "yaw") float f, @ckoo(a = "pitch") float f2, @ckoo(a = "roll") float f3) {
        this.yaw = f;
        this.pitch = f2;
        this.roll = f3;
    }

    @ckom(a = "pitch")
    public float getPitch() {
        return this.pitch;
    }

    @ckom(a = "roll")
    public float getRoll() {
        return this.roll;
    }

    @ckom(a = "yaw")
    public float getYaw() {
        return this.yaw;
    }

    @ckon(a = "pitch")
    public boolean hasPitch() {
        return !Float.isNaN(this.pitch);
    }

    @ckon(a = "roll")
    public boolean hasRoll() {
        return !Float.isNaN(this.roll);
    }

    @ckon(a = "yaw")
    public boolean hasYaw() {
        return !Float.isNaN(this.yaw);
    }

    public String toString() {
        dbsb b = dbsc.b(this);
        b.e("yaw", this.yaw);
        b.e("pitch", this.pitch);
        b.e("roll", this.roll);
        return b.toString();
    }
}
