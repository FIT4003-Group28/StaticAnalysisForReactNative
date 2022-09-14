package com.facebook.react.animated;

import com.facebook.react.bridge.an;
/* compiled from: DecayAnimation.java */
/* loaded from: classes.dex */
public class e extends d {
    private final double e;
    private final double f;
    private long g = -1;
    private double h = 0.0d;
    private double i = 0.0d;
    private int j;
    private int k;

    public e(an anVar) {
        this.e = anVar.getDouble("velocity");
        this.f = anVar.getDouble("deceleration");
        boolean z = true;
        this.j = anVar.hasKey("iterations") ? anVar.getInt("iterations") : 1;
        this.k = 1;
        this.f3145a = this.j != 0 ? false : z;
    }

    @Override // com.facebook.react.animated.d
    public void a(long j) {
        long j2 = j / 1000000;
        if (this.g == -1) {
            this.g = j2 - 16;
            if (this.h == this.i) {
                this.h = this.f3146b.e;
            } else {
                this.f3146b.e = this.h;
            }
            this.i = this.f3146b.e;
        }
        double exp = this.h + ((this.e / (1.0d - this.f)) * (1.0d - Math.exp((-(1.0d - this.f)) * (j2 - this.g))));
        if (Math.abs(this.i - exp) < 0.1d) {
            if (this.j == -1 || this.k < this.j) {
                this.g = -1L;
                this.k++;
            } else {
                this.f3145a = true;
                return;
            }
        }
        this.i = exp;
        this.f3146b.e = exp;
    }
}
