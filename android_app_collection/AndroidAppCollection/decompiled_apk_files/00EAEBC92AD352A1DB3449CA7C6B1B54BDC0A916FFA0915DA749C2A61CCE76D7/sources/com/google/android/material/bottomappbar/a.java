package com.google.android.material.bottomappbar;

import c.e.a.c.a0.f;
import c.e.a.c.a0.m;
/* loaded from: classes.dex */
public class a extends f implements Cloneable {

    /* renamed from: b  reason: collision with root package name */
    private float f7925b;

    /* renamed from: c  reason: collision with root package name */
    private float f7926c;

    /* renamed from: d  reason: collision with root package name */
    private float f7927d;

    /* renamed from: e  reason: collision with root package name */
    private float f7928e;

    /* renamed from: f  reason: collision with root package name */
    private float f7929f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public float a() {
        return this.f7928e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(float f2) {
        this.f7928e = f2;
    }

    @Override // c.e.a.c.a0.f
    public void a(float f2, float f3, float f4, m mVar) {
        float f5 = this.f7927d;
        if (f5 == 0.0f) {
            mVar.a(f2, 0.0f);
            return;
        }
        float f6 = ((this.f7926c * 2.0f) + f5) / 2.0f;
        float f7 = f4 * this.f7925b;
        float f8 = f3 + this.f7929f;
        float f9 = (this.f7928e * f4) + ((1.0f - f4) * f6);
        if (f9 / f6 >= 1.0f) {
            mVar.a(f2, 0.0f);
            return;
        }
        float f10 = f6 + f7;
        float f11 = f9 + f7;
        float sqrt = (float) Math.sqrt((f10 * f10) - (f11 * f11));
        float f12 = f8 - sqrt;
        float f13 = f8 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f11));
        float f14 = 90.0f - degrees;
        mVar.a(f12, 0.0f);
        float f15 = f7 * 2.0f;
        mVar.a(f12 - f7, 0.0f, f12 + f7, f15, 270.0f, degrees);
        mVar.a(f8 - f6, (-f6) - f9, f8 + f6, f6 - f9, 180.0f - f14, (f14 * 2.0f) - 180.0f);
        mVar.a(f13 - f7, 0.0f, f13 + f7, f15, 270.0f - degrees, degrees);
        mVar.a(f2, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float b() {
        return this.f7926c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(float f2) {
        this.f7926c = f2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float c() {
        return this.f7925b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(float f2) {
        this.f7925b = f2;
    }

    public float d() {
        return this.f7927d;
    }

    public void d(float f2) {
        this.f7927d = f2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(float f2) {
        this.f7929f = f2;
    }
}
