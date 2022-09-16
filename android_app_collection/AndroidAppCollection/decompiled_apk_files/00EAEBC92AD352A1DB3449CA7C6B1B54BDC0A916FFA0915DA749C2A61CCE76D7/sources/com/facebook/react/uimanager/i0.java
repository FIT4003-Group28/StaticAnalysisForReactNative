package com.facebook.react.uimanager;
/* loaded from: classes.dex */
public class i0 {

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f5983e = {1, 2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a  reason: collision with root package name */
    private final float[] f5984a;

    /* renamed from: b  reason: collision with root package name */
    private int f5985b;

    /* renamed from: c  reason: collision with root package name */
    private final float f5986c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f5987d;

    public i0() {
        this(0.0f);
    }

    public i0(float f2) {
        this.f5985b = 0;
        this.f5986c = f2;
        this.f5984a = a();
    }

    private static float[] a() {
        return new float[]{Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN};
    }

    public float a(int i) {
        float f2 = (i == 4 || i == 5) ? Float.NaN : this.f5986c;
        int i2 = this.f5985b;
        if (i2 == 0) {
            return f2;
        }
        if ((i2 & f5983e[i]) != 0) {
            return this.f5984a[i];
        }
        if (this.f5987d) {
            char c2 = (i == 1 || i == 3) ? (char) 7 : (char) 6;
            int i3 = this.f5985b;
            int[] iArr = f5983e;
            if ((iArr[c2] & i3) != 0) {
                return this.f5984a[c2];
            }
            if ((i3 & iArr[8]) != 0) {
                return this.f5984a[8];
            }
        }
        return f2;
    }

    public boolean a(int i, float f2) {
        int i2;
        boolean z = false;
        if (!d.a(this.f5984a[i], f2)) {
            this.f5984a[i] = f2;
            if (com.facebook.yoga.g.a(f2)) {
                i2 = (~f5983e[i]) & this.f5985b;
            } else {
                i2 = f5983e[i] | this.f5985b;
            }
            this.f5985b = i2;
            int i3 = this.f5985b;
            int[] iArr = f5983e;
            if ((iArr[8] & i3) != 0 || (iArr[7] & i3) != 0 || (i3 & iArr[6]) != 0) {
                z = true;
            }
            this.f5987d = z;
            return true;
        }
        return false;
    }

    public float b(int i) {
        return this.f5984a[i];
    }
}
