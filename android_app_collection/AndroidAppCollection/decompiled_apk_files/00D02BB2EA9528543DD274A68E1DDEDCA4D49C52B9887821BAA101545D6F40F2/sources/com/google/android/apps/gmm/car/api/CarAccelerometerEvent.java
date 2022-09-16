package com.google.android.apps.gmm.car.api;
/* compiled from: PG */
@btsb
@ckor
@ckol(a = "car-accelerometer", b = ckok.HIGH)
/* loaded from: classes.dex */
public final class CarAccelerometerEvent {
    private final float x;
    private final float y;
    private final float z;

    public CarAccelerometerEvent(@ckoo(a = "x") float f, @ckoo(a = "y") float f2, @ckoo(a = "z") float f3) {
        this.x = f;
        this.y = f2;
        this.z = f3;
    }

    @ckom(a = "x")
    public float getX() {
        return this.x;
    }

    @ckom(a = "y")
    public float getY() {
        return this.y;
    }

    @ckom(a = "z")
    public float getZ() {
        return this.z;
    }

    @ckon(a = "x")
    public boolean hasX() {
        return !Float.isNaN(this.x);
    }

    @ckon(a = "y")
    public boolean hasY() {
        return !Float.isNaN(this.y);
    }

    @ckon(a = "z")
    public boolean hasZ() {
        return !Float.isNaN(this.z);
    }

    public String toString() {
        dbsb b = dbsc.b(this);
        b.e("x", this.x);
        b.e("y", this.y);
        b.e("z", this.z);
        return b.toString();
    }
}
