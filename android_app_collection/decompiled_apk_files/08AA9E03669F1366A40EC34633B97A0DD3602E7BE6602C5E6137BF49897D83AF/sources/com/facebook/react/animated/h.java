package com.facebook.react.animated;

import com.facebook.react.bridge.am;
import com.facebook.react.bridge.an;
/* compiled from: FrameBasedAnimationDriver.java */
/* loaded from: classes.dex */
class h extends d {
    private long e = -1;
    private final double[] f;
    private final double g;
    private double h;
    private int i;
    private int j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(an anVar) {
        am e = anVar.e("frames");
        int size = e.size();
        this.f = new double[size];
        for (int i = 0; i < size; i++) {
            this.f[i] = e.getDouble(i);
        }
        this.g = anVar.getDouble("toValue");
        boolean z = true;
        this.i = anVar.hasKey("iterations") ? anVar.getInt("iterations") : 1;
        this.j = 1;
        this.f3145a = this.i != 0 ? false : z;
    }

    @Override // com.facebook.react.animated.d
    public void a(long j) {
        double d2;
        if (this.e < 0) {
            this.e = j;
            this.h = this.f3146b.e;
        }
        int i = (int) (((j - this.e) / 1000000) / 16.666666666666668d);
        if (i < 0) {
            throw new IllegalStateException("Calculated frame index should never be lower than 0");
        }
        if (this.f3145a) {
            return;
        }
        if (i >= this.f.length - 1) {
            d2 = this.g;
            if (this.i == -1 || this.j < this.i) {
                this.e = j;
                this.j++;
            } else {
                this.f3145a = true;
            }
        } else {
            d2 = (this.f[i] * (this.g - this.h)) + this.h;
        }
        this.f3146b.e = d2;
    }
}
