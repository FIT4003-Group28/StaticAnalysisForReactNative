package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;
/* loaded from: classes.dex */
class s extends b {

    /* renamed from: e  reason: collision with root package name */
    Object f5404e;

    /* renamed from: f  reason: collision with root package name */
    double f5405f;

    /* renamed from: g  reason: collision with root package name */
    double f5406g;

    /* renamed from: h  reason: collision with root package name */
    private c f5407h;

    public s() {
        this.f5404e = null;
        this.f5405f = Double.NaN;
        this.f5406g = 0.0d;
    }

    public s(ReadableMap readableMap) {
        this.f5404e = null;
        this.f5405f = Double.NaN;
        this.f5406g = 0.0d;
        this.f5405f = readableMap.getDouble("value");
        this.f5406g = readableMap.getDouble("offset");
    }

    public void a(c cVar) {
        this.f5407h = cVar;
    }

    public void b() {
        this.f5406g += this.f5405f;
        this.f5405f = 0.0d;
    }

    public void c() {
        this.f5405f += this.f5406g;
        this.f5406g = 0.0d;
    }

    public Object d() {
        return this.f5404e;
    }

    public double e() {
        if (Double.isNaN(this.f5406g + this.f5405f)) {
            a();
        }
        return this.f5406g + this.f5405f;
    }

    public void f() {
        c cVar = this.f5407h;
        if (cVar == null) {
            return;
        }
        cVar.a(e());
    }
}
