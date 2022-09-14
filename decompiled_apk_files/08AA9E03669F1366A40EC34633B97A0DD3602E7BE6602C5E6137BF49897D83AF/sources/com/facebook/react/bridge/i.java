package com.facebook.react.bridge;

import android.support.v4.i.j;
/* compiled from: DynamicFromMap.java */
/* loaded from: classes.dex */
public class i implements g {

    /* renamed from: a  reason: collision with root package name */
    private static final j.a<i> f3242a = new j.a<>(10);

    /* renamed from: b  reason: collision with root package name */
    private an f3243b;

    /* renamed from: c  reason: collision with root package name */
    private String f3244c;

    private i() {
    }

    public static i a(an anVar, String str) {
        i a2 = f3242a.a();
        if (a2 == null) {
            a2 = new i();
        }
        a2.f3243b = anVar;
        a2.f3244c = str;
        return a2;
    }

    @Override // com.facebook.react.bridge.g
    public void e() {
        this.f3243b = null;
        this.f3244c = null;
        f3242a.a(this);
    }

    @Override // com.facebook.react.bridge.g
    public boolean a() {
        if (this.f3243b == null || this.f3244c == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return this.f3243b.isNull(this.f3244c);
    }

    @Override // com.facebook.react.bridge.g
    public double b() {
        if (this.f3243b == null || this.f3244c == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return this.f3243b.getDouble(this.f3244c);
    }

    @Override // com.facebook.react.bridge.g
    public String c() {
        if (this.f3243b == null || this.f3244c == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return this.f3243b.getString(this.f3244c);
    }

    @Override // com.facebook.react.bridge.g
    public ReadableType d() {
        if (this.f3243b == null || this.f3244c == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return this.f3243b.getType(this.f3244c);
    }
}
