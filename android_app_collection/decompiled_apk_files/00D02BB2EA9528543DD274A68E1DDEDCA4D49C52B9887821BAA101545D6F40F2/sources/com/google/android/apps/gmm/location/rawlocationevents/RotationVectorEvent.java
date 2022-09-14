package com.google.android.apps.gmm.location.rawlocationevents;
/* compiled from: PG */
@ckor
@ckol(a = "rotation-vector", b = ckok.HIGH)
/* loaded from: classes.dex */
public class RotationVectorEvent {
    private final long deltaTNs;
    private final float gx;
    private final float gy;
    private final float gz;
    private final float maxAcceleration;
    private final float maxRateOfTurn;
    private final float mx;
    private final float my;
    private final float mz;
    private final long timestampMs;
    private final float w;
    private final float x;
    private final float y;
    private final float z;

    public RotationVectorEvent(@ckoo(a = "timeMs", b = "0", d = true) long j, @ckoo(a = "timeNs") long j2, @ckoo(a = "x") float f, @ckoo(a = "y") float f2, @ckoo(a = "z") float f3, @ckoo(a = "w") float f4, @ckoo(a = "gx") float f5, @ckoo(a = "gy") float f6, @ckoo(a = "gz") float f7, @ckoo(a = "mx") float f8, @ckoo(a = "my") float f9, @ckoo(a = "mz") float f10, @ckoo(a = "maxRot") float f11, @ckoo(a = "maxAcc") float f12) {
        this.timestampMs = j;
        this.deltaTNs = j2;
        this.w = f4;
        this.x = f;
        this.y = f2;
        this.z = f3;
        this.gx = f5;
        this.gy = f6;
        this.gz = f7;
        this.mx = f8;
        this.my = f9;
        this.mz = f10;
        this.maxRateOfTurn = f11;
        this.maxAcceleration = f12;
    }

    public RotationVectorEvent(long j, long j2, ahrn ahrnVar, float[] fArr, float[] fArr2, float f, float f2) {
        float f3;
        this.timestampMs = j;
        this.deltaTNs = j2;
        this.x = ahrnVar.a;
        this.y = ahrnVar.b;
        this.z = ahrnVar.c;
        this.w = ahrnVar.d;
        this.gx = fArr[0];
        this.gy = fArr[1];
        this.gz = fArr[2];
        if (fArr2 != null) {
            this.mx = fArr2[0];
            this.my = fArr2[1];
            f3 = fArr2[2];
        } else {
            f3 = Float.NaN;
            this.mx = Float.NaN;
            this.my = Float.NaN;
        }
        this.mz = f3;
        this.maxRateOfTurn = f;
        this.maxAcceleration = f2;
    }

    @ckom(a = "timeNs")
    public long getDeltaTNs() {
        return this.deltaTNs;
    }

    @ckom(a = "gx")
    public float getGravityX() {
        return this.gx;
    }

    @ckom(a = "gy")
    public float getGravityY() {
        return this.gy;
    }

    @ckom(a = "gz")
    public float getGravityZ() {
        return this.gz;
    }

    @ckom(a = "mx")
    public float getMagneticFieldX() {
        return this.mx;
    }

    @ckom(a = "my")
    public float getMagneticFieldY() {
        return this.my;
    }

    @ckom(a = "mz")
    public float getMagneticFieldZ() {
        return this.mz;
    }

    @ckom(a = "maxAcc")
    public float getMaxAcceleration() {
        return this.maxAcceleration;
    }

    @ckom(a = "maxRot")
    public float getMaxRateOfTurn() {
        return this.maxRateOfTurn;
    }

    @ckom(a = "timeMs")
    public long getTimestampMs() {
        return this.timestampMs;
    }

    @ckom(a = "w")
    public float getW() {
        return this.w;
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

    public boolean hasMagneticField() {
        return !Float.isNaN(this.mx) && !Float.isNaN(this.my) && !Float.isNaN(this.mz);
    }

    @ckon(a = "mx")
    public boolean hasMagneticFieldX() {
        return !Float.isNaN(this.mx);
    }

    @ckon(a = "my")
    public boolean hasMagneticFieldY() {
        return !Float.isNaN(this.my);
    }

    @ckon(a = "mz")
    public boolean hasMagneticFieldZ() {
        return !Float.isNaN(this.mz);
    }

    @ckon(a = "maxAcc")
    public boolean hasMaxAcceleration() {
        return !Float.isNaN(this.maxAcceleration);
    }

    @ckon(a = "maxRot")
    public boolean hasMaxRateOfTurn() {
        return !Float.isNaN(this.maxRateOfTurn);
    }

    public boolean isDiscontinuity() {
        return this.deltaTNs == 0;
    }

    public String toString() {
        dbsb b = dbsc.b(this);
        b.g("timestampMs", this.timestampMs);
        b.g("deltaTNs", this.deltaTNs);
        b.e("x", this.x);
        b.e("y", this.y);
        b.e("z", this.z);
        b.e("w", this.w);
        b.e("gx", this.gx);
        b.e("gy", this.gy);
        b.e("gz", this.gz);
        b.e("mx", this.mx);
        b.e("my", this.my);
        b.e("mz", this.mz);
        b.e("maxRateOfTurn", this.maxRateOfTurn);
        b.e("maxAcceleration", this.maxAcceleration);
        return b.toString();
    }
}
