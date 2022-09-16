package com.facebook.react.animated;

import com.facebook.react.bridge.an;
/* compiled from: SpringAnimation.java */
/* loaded from: classes.dex */
class n extends d {
    private long e;
    private boolean f;
    private double g;
    private double h;
    private double i;
    private double j;
    private boolean k;
    private double m;
    private double n;
    private double o;
    private double p;
    private int r;
    private double t;
    private final a l = new a();
    private double q = 0.0d;
    private int s = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SpringAnimation.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        double f3155a;

        /* renamed from: b  reason: collision with root package name */
        double f3156b;

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(an anVar) {
        boolean z = false;
        this.g = anVar.getDouble("stiffness");
        this.h = anVar.getDouble("damping");
        this.i = anVar.getDouble("mass");
        this.j = anVar.getDouble("initialVelocity");
        this.l.f3156b = this.j;
        this.n = anVar.getDouble("toValue");
        this.o = anVar.getDouble("restSpeedThreshold");
        this.p = anVar.getDouble("restDisplacementThreshold");
        this.k = anVar.getBoolean("overshootClamping");
        this.r = anVar.hasKey("iterations") ? anVar.getInt("iterations") : 1;
        this.f3145a = this.r == 0 ? true : z;
    }

    @Override // com.facebook.react.animated.d
    public void a(long j) {
        long j2 = j / 1000000;
        if (!this.f) {
            if (this.s == 0) {
                this.t = this.f3146b.e;
                this.s = 1;
            }
            a aVar = this.l;
            double d2 = this.f3146b.e;
            aVar.f3155a = d2;
            this.m = d2;
            this.e = j2;
            this.q = 0.0d;
            this.f = true;
        }
        a((j2 - this.e) / 1000.0d);
        this.e = j2;
        this.f3146b.e = this.l.f3155a;
        if (a()) {
            if (this.r == -1 || this.s < this.r) {
                this.f = false;
                this.f3146b.e = this.t;
                this.s++;
                return;
            }
            this.f3145a = true;
        }
    }

    private double a(a aVar) {
        return Math.abs(this.n - aVar.f3155a);
    }

    private boolean a() {
        return Math.abs(this.l.f3156b) <= this.o && (a(this.l) <= this.p || this.g == 0.0d);
    }

    private boolean b() {
        return this.g > 0.0d && ((this.m < this.n && this.l.f3155a > this.n) || (this.m > this.n && this.l.f3155a < this.n));
    }

    private void a(double d2) {
        double d3;
        double d4;
        if (a()) {
            return;
        }
        double d5 = 0.064d;
        if (d2 <= 0.064d) {
            d5 = d2;
        }
        this.q += d5;
        double d6 = this.h;
        double d7 = this.i;
        double d8 = this.g;
        double d9 = -this.j;
        double sqrt = d6 / (Math.sqrt(d8 * d7) * 2.0d);
        double sqrt2 = Math.sqrt(d8 / d7);
        double sqrt3 = Math.sqrt(1.0d - (sqrt * sqrt)) * sqrt2;
        double d10 = this.n - this.m;
        double d11 = this.q;
        if (sqrt < 1.0d) {
            double exp = Math.exp((-sqrt) * sqrt2 * d11);
            double d12 = sqrt * sqrt2;
            double d13 = d9 + (d12 * d10);
            double d14 = d11 * sqrt3;
            double sin = this.n - ((((d13 / sqrt3) * Math.sin(d14)) + (Math.cos(d14) * d10)) * exp);
            d4 = ((d12 * exp) * (((Math.sin(d14) * d13) / sqrt3) + (Math.cos(d14) * d10))) - (((Math.cos(d14) * d13) - ((sqrt3 * d10) * Math.sin(d14))) * exp);
            d3 = sin;
        } else {
            double exp2 = Math.exp((-sqrt2) * d11);
            d3 = this.n - (((((sqrt2 * d10) + d9) * d11) + d10) * exp2);
            d4 = exp2 * ((d9 * ((d11 * sqrt2) - 1.0d)) + (d11 * d10 * sqrt2 * sqrt2));
        }
        this.l.f3155a = d3;
        this.l.f3156b = d4;
        if (!a() && (!this.k || !b())) {
            return;
        }
        if (this.g > 0.0d) {
            this.m = this.n;
            this.l.f3155a = this.n;
        } else {
            this.n = this.l.f3155a;
            this.m = this.n;
        }
        this.l.f3156b = 0.0d;
    }
}
