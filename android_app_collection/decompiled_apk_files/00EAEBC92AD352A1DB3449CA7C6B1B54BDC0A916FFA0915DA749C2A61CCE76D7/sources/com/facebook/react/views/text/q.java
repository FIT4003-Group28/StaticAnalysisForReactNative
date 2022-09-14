package com.facebook.react.views.text;

import android.text.Spannable;
import com.facebook.react.bridge.ReadableMap;
/* loaded from: classes.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    private final Spannable f6292a;

    /* renamed from: b  reason: collision with root package name */
    private final int f6293b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f6294c;

    /* renamed from: d  reason: collision with root package name */
    private final float f6295d;

    /* renamed from: e  reason: collision with root package name */
    private final float f6296e;

    /* renamed from: f  reason: collision with root package name */
    private final float f6297f;

    /* renamed from: g  reason: collision with root package name */
    private final float f6298g;

    /* renamed from: h  reason: collision with root package name */
    private final int f6299h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    public ReadableMap m;

    public q(Spannable spannable, int i, boolean z, float f2, float f3, float f4, float f5, int i2, int i3, int i4) {
        this(spannable, i, z, f2, f3, f4, f5, i2, i3, i4, -1, -1);
    }

    public q(Spannable spannable, int i, boolean z, float f2, float f3, float f4, float f5, int i2, int i3, int i4, int i5, int i6) {
        this.m = null;
        this.f6292a = spannable;
        this.f6293b = i;
        this.f6294c = z;
        this.f6295d = f2;
        this.f6296e = f3;
        this.f6297f = f4;
        this.f6298g = f5;
        this.f6299h = i2;
        this.i = i3;
        this.j = i5;
        this.k = i6;
        this.l = i4;
    }

    public q(Spannable spannable, int i, boolean z, int i2, int i3, int i4) {
        this(spannable, i, z, -1.0f, -1.0f, -1.0f, -1.0f, i2, i3, i4, -1, -1);
    }

    public static q a(Spannable spannable, int i, boolean z, int i2, int i3, int i4, ReadableMap readableMap) {
        q qVar = new q(spannable, i, z, i2, i3, i4);
        qVar.m = readableMap;
        return qVar;
    }

    public boolean a() {
        return this.f6294c;
    }

    public int b() {
        return this.f6293b;
    }

    public int c() {
        return this.l;
    }

    public float d() {
        return this.f6298g;
    }

    public float e() {
        return this.f6295d;
    }

    public float f() {
        return this.f6297f;
    }

    public float g() {
        return this.f6296e;
    }

    public int h() {
        return this.k;
    }

    public int i() {
        return this.j;
    }

    public Spannable j() {
        return this.f6292a;
    }

    public int k() {
        return this.f6299h;
    }

    public int l() {
        return this.i;
    }
}
