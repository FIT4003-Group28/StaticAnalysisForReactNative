package com.facebook.react.uimanager;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
/* compiled from: Spacing.java */
/* loaded from: classes.dex */
public class ae {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f3743a = {1, 2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: b  reason: collision with root package name */
    private final float[] f3744b;

    /* renamed from: c  reason: collision with root package name */
    private int f3745c;

    /* renamed from: d  reason: collision with root package name */
    private float f3746d;
    private boolean e;

    public ae() {
        this(BitmapDescriptorFactory.HUE_RED);
    }

    public ae(float f) {
        this.f3744b = a();
        this.f3745c = 0;
        this.f3746d = f;
    }

    public boolean a(int i, float f) {
        boolean z = false;
        if (!c.a(this.f3744b[i], f)) {
            this.f3744b[i] = f;
            if (com.facebook.yoga.a.a(f)) {
                this.f3745c = (~f3743a[i]) & this.f3745c;
            } else {
                this.f3745c = f3743a[i] | this.f3745c;
            }
            if ((this.f3745c & f3743a[8]) != 0 || (this.f3745c & f3743a[7]) != 0 || (this.f3745c & f3743a[6]) != 0) {
                z = true;
            }
            this.e = z;
            return true;
        }
        return false;
    }

    public float a(int i) {
        float f = (i == 4 || i == 5) ? Float.NaN : this.f3746d;
        if (this.f3745c == 0) {
            return f;
        }
        if ((this.f3745c & f3743a[i]) != 0) {
            return this.f3744b[i];
        }
        if (this.e) {
            char c2 = (i == 1 || i == 3) ? (char) 7 : (char) 6;
            if ((this.f3745c & f3743a[c2]) != 0) {
                return this.f3744b[c2];
            }
            if ((this.f3745c & f3743a[8]) != 0) {
                return this.f3744b[8];
            }
        }
        return f;
    }

    public float b(int i) {
        return this.f3744b[i];
    }

    private static float[] a() {
        return new float[]{Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN};
    }
}
