package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;
/* loaded from: classes.dex */
class n extends d {

    /* renamed from: e  reason: collision with root package name */
    private long f5387e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f5388f;

    /* renamed from: g  reason: collision with root package name */
    private double f5389g;

    /* renamed from: h  reason: collision with root package name */
    private double f5390h;
    private double i;
    private double j;
    private boolean k;
    private final b l = new b();
    private double m;
    private double n;
    private double o;
    private double p;
    private double q;
    private int r;
    private int s;
    private double t;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        double f5391a;

        /* renamed from: b  reason: collision with root package name */
        double f5392b;

        private b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(ReadableMap readableMap) {
        this.l.f5392b = readableMap.getDouble("initialVelocity");
        a(readableMap);
    }

    private double a(b bVar) {
        return Math.abs(this.n - bVar.f5391a);
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
        double d6 = this.f5390h;
        double d7 = this.i;
        double d8 = this.f5389g;
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
        b bVar = this.l;
        bVar.f5391a = d3;
        bVar.f5392b = d4;
        if (!a() && (!this.k || !b())) {
            return;
        }
        if (this.f5389g > 0.0d) {
            double d15 = this.n;
            this.m = d15;
            this.l.f5391a = d15;
        } else {
            this.n = this.l.f5391a;
            this.m = this.n;
        }
        this.l.f5392b = 0.0d;
    }

    private boolean a() {
        return Math.abs(this.l.f5392b) <= this.o && (a(this.l) <= this.p || this.f5389g == 0.0d);
    }

    private boolean b() {
        if (this.f5389g > 0.0d) {
            double d2 = this.m;
            double d3 = this.n;
            if (d2 >= d3 || this.l.f5391a <= d3) {
                double d4 = this.m;
                double d5 = this.n;
                if (d4 <= d5 || this.l.f5391a >= d5) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.facebook.react.animated.d
    public void a(long j) {
        long j2 = j / 1000000;
        if (!this.f5388f) {
            if (this.s == 0) {
                this.t = this.f5362b.f5405f;
                this.s = 1;
            }
            b bVar = this.l;
            double d2 = this.f5362b.f5405f;
            bVar.f5391a = d2;
            this.m = d2;
            this.f5387e = j2;
            this.q = 0.0d;
            this.f5388f = true;
        }
        a((j2 - this.f5387e) / 1000.0d);
        this.f5387e = j2;
        this.f5362b.f5405f = this.l.f5391a;
        if (a()) {
            int i = this.r;
            if (i != -1 && this.s >= i) {
                this.f5361a = true;
                return;
            }
            this.f5388f = false;
            this.f5362b.f5405f = this.t;
            this.s++;
        }
    }

    @Override // com.facebook.react.animated.d
    public void a(ReadableMap readableMap) {
        this.f5389g = readableMap.getDouble("stiffness");
        this.f5390h = readableMap.getDouble("damping");
        this.i = readableMap.getDouble("mass");
        this.j = this.l.f5392b;
        this.n = readableMap.getDouble("toValue");
        this.o = readableMap.getDouble("restSpeedThreshold");
        this.p = readableMap.getDouble("restDisplacementThreshold");
        this.k = readableMap.getBoolean("overshootClamping");
        boolean z = true;
        this.r = readableMap.hasKey("iterations") ? readableMap.getInt("iterations") : 1;
        if (this.r != 0) {
            z = false;
        }
        this.f5361a = z;
        this.s = 0;
        this.q = 0.0d;
        this.f5388f = false;
    }
}
