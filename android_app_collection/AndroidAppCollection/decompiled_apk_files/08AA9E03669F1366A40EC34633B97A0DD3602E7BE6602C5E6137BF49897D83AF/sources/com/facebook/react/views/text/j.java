package com.facebook.react.views.text;

import android.text.Spannable;
/* compiled from: ReactTextUpdate.java */
/* loaded from: classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private final Spannable f4095a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4096b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f4097c;

    /* renamed from: d  reason: collision with root package name */
    private final float f4098d;
    private final float e;
    private final float f;
    private final float g;
    private final int h;
    private final int i;

    @Deprecated
    public j(Spannable spannable, int i, boolean z, float f, float f2, float f3, float f4, int i2) {
        this(spannable, i, z, f, f2, f3, f4, i2, 1);
    }

    public j(Spannable spannable, int i, boolean z, float f, float f2, float f3, float f4, int i2, int i3) {
        this.f4095a = spannable;
        this.f4096b = i;
        this.f4097c = z;
        this.f4098d = f;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        this.h = i2;
        this.i = i3;
    }

    public Spannable a() {
        return this.f4095a;
    }

    public int b() {
        return this.f4096b;
    }

    public boolean c() {
        return this.f4097c;
    }

    public float d() {
        return this.f4098d;
    }

    public float e() {
        return this.e;
    }

    public float f() {
        return this.f;
    }

    public float g() {
        return this.g;
    }

    public int h() {
        return this.h;
    }

    public int i() {
        return this.i;
    }
}
