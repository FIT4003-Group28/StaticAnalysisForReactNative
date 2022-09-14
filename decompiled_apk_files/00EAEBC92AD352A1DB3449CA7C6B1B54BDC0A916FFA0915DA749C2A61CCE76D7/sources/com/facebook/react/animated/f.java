package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;
/* loaded from: classes.dex */
class f extends s {
    private final l i;
    private final int j;
    private final double k;
    private final double l;
    private double m = 0.0d;

    public f(ReadableMap readableMap, l lVar) {
        this.i = lVar;
        this.j = readableMap.getInt("input");
        this.k = readableMap.getDouble("min");
        this.l = readableMap.getDouble("max");
        this.f5405f = 0.0d;
    }

    private double g() {
        b d2 = this.i.d(this.j);
        if (d2 == null || !(d2 instanceof s)) {
            throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.DiffClamp node");
        }
        return ((s) d2).e();
    }

    @Override // com.facebook.react.animated.b
    public void a() {
        double g2 = g();
        double d2 = g2 - this.m;
        this.m = g2;
        this.f5405f = Math.min(Math.max(this.f5405f + d2, this.k), this.l);
    }
}
