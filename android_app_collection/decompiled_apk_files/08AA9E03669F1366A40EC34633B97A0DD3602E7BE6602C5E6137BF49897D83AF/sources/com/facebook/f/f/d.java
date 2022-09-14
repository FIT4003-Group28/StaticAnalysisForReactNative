package com.facebook.f.f;

import com.facebook.common.d.i;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
/* compiled from: RoundingParams.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private a f2465a = a.BITMAP_ONLY;

    /* renamed from: b  reason: collision with root package name */
    private boolean f2466b = false;

    /* renamed from: c  reason: collision with root package name */
    private float[] f2467c = null;

    /* renamed from: d  reason: collision with root package name */
    private int f2468d = 0;
    private float e = BitmapDescriptorFactory.HUE_RED;
    private int f = 0;
    private float g = BitmapDescriptorFactory.HUE_RED;

    /* compiled from: RoundingParams.java */
    /* loaded from: classes.dex */
    public enum a {
        OVERLAY_COLOR,
        BITMAP_ONLY
    }

    public boolean a() {
        return this.f2466b;
    }

    public d a(float f) {
        Arrays.fill(h(), f);
        return this;
    }

    public d a(float f, float f2, float f3, float f4) {
        float[] h = h();
        h[1] = f;
        h[0] = f;
        h[3] = f2;
        h[2] = f2;
        h[5] = f3;
        h[4] = f3;
        h[7] = f4;
        h[6] = f4;
        return this;
    }

    public float[] b() {
        return this.f2467c;
    }

    public d a(a aVar) {
        this.f2465a = aVar;
        return this;
    }

    public a c() {
        return this.f2465a;
    }

    public d a(int i) {
        this.f2468d = i;
        this.f2465a = a.OVERLAY_COLOR;
        return this;
    }

    public int d() {
        return this.f2468d;
    }

    private float[] h() {
        if (this.f2467c == null) {
            this.f2467c = new float[8];
        }
        return this.f2467c;
    }

    public static d b(float f) {
        return new d().a(f);
    }

    public float e() {
        return this.e;
    }

    public int f() {
        return this.f;
    }

    public d a(int i, float f) {
        i.a(f >= BitmapDescriptorFactory.HUE_RED, "the border width cannot be < 0");
        this.e = f;
        this.f = i;
        return this;
    }

    public float g() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f2466b != dVar.f2466b || this.f2468d != dVar.f2468d || Float.compare(dVar.e, this.e) != 0 || this.f != dVar.f || Float.compare(dVar.g, this.g) != 0 || this.f2465a != dVar.f2465a) {
            return false;
        }
        return Arrays.equals(this.f2467c, dVar.f2467c);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((((((((((this.f2465a != null ? this.f2465a.hashCode() : 0) * 31) + (this.f2466b ? 1 : 0)) * 31) + (this.f2467c != null ? Arrays.hashCode(this.f2467c) : 0)) * 31) + this.f2468d) * 31) + (this.e != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(this.e) : 0)) * 31) + this.f) * 31;
        if (this.g != BitmapDescriptorFactory.HUE_RED) {
            i = Float.floatToIntBits(this.g);
        }
        return hashCode + i;
    }
}
