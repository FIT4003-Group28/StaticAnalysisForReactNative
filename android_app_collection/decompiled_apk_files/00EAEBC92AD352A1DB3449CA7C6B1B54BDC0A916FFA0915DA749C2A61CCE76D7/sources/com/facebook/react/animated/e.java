package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;
/* loaded from: classes.dex */
public class e extends d {

    /* renamed from: e  reason: collision with root package name */
    private final double f5365e;

    /* renamed from: f  reason: collision with root package name */
    private double f5366f;

    /* renamed from: g  reason: collision with root package name */
    private long f5367g;

    /* renamed from: h  reason: collision with root package name */
    private double f5368h;
    private double i;
    private int j;
    private int k;

    public e(ReadableMap readableMap) {
        this.f5365e = readableMap.getDouble("velocity");
        a(readableMap);
    }

    @Override // com.facebook.react.animated.d
    public void a(long j) {
        long j2 = j / 1000000;
        if (this.f5367g == -1) {
            this.f5367g = j2 - 16;
            double d2 = this.f5368h;
            if (d2 == this.i) {
                this.f5368h = this.f5362b.f5405f;
            } else {
                this.f5362b.f5405f = d2;
            }
            this.i = this.f5362b.f5405f;
        }
        double d3 = this.f5368h;
        double d4 = this.f5365e;
        double d5 = this.f5366f;
        double exp = d3 + ((d4 / (1.0d - d5)) * (1.0d - Math.exp((-(1.0d - d5)) * (j2 - this.f5367g))));
        if (Math.abs(this.i - exp) < 0.1d) {
            int i = this.j;
            if (i != -1 && this.k >= i) {
                this.f5361a = true;
                return;
            } else {
                this.f5367g = -1L;
                this.k++;
            }
        }
        this.i = exp;
        this.f5362b.f5405f = exp;
    }

    @Override // com.facebook.react.animated.d
    public void a(ReadableMap readableMap) {
        this.f5366f = readableMap.getDouble("deceleration");
        boolean z = true;
        this.j = readableMap.hasKey("iterations") ? readableMap.getInt("iterations") : 1;
        this.k = 1;
        if (this.j != 0) {
            z = false;
        }
        this.f5361a = z;
        this.f5367g = -1L;
        this.f5368h = 0.0d;
        this.i = 0.0d;
    }
}
