package com.facebook.react.animated;

import com.facebook.react.bridge.an;
/* compiled from: ValueAnimatedNode.java */
/* loaded from: classes.dex */
class q extends b {
    double e;
    double f;
    private c g;

    public q() {
        this.e = Double.NaN;
        this.f = 0.0d;
    }

    public q(an anVar) {
        this.e = Double.NaN;
        this.f = 0.0d;
        this.e = anVar.getDouble("value");
        this.f = anVar.getDouble("offset");
    }

    public double b() {
        return this.f + this.e;
    }

    public void c() {
        this.e += this.f;
        this.f = 0.0d;
    }

    public void d() {
        this.f += this.e;
        this.e = 0.0d;
    }

    public void e() {
        if (this.g == null) {
            return;
        }
        this.g.a(b());
    }

    public void a(c cVar) {
        this.g = cVar;
    }
}
