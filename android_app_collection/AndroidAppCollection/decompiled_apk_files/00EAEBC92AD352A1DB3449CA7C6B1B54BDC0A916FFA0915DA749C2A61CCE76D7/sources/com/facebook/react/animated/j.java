package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;
/* loaded from: classes.dex */
class j extends s {
    private final l i;
    private final int j;
    private final double k;

    public j(ReadableMap readableMap, l lVar) {
        this.i = lVar;
        this.j = readableMap.getInt("input");
        this.k = readableMap.getDouble("modulus");
    }

    @Override // com.facebook.react.animated.b
    public void a() {
        b d2 = this.i.d(this.j);
        if (d2 == null || !(d2 instanceof s)) {
            throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.modulus node");
        }
        double e2 = ((s) d2).e();
        double d3 = this.k;
        this.f5405f = ((e2 % d3) + d3) % d3;
    }
}
