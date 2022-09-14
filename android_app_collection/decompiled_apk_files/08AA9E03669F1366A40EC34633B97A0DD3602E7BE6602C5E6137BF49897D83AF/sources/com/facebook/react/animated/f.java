package com.facebook.react.animated;

import com.facebook.react.bridge.an;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DiffClampAnimatedNode.java */
/* loaded from: classes.dex */
public class f extends q {
    private final l g;
    private final int h;
    private final double i;
    private final double j;
    private double k = 0.0d;

    public f(an anVar, l lVar) {
        this.g = lVar;
        this.h = anVar.getInt("input");
        this.i = anVar.getDouble("min");
        this.j = anVar.getDouble("max");
        this.e = 0.0d;
    }

    @Override // com.facebook.react.animated.b
    public void a() {
        double f = f();
        double d2 = f - this.k;
        this.k = f;
        this.e = Math.min(Math.max(this.e + d2, this.i), this.j);
    }

    private double f() {
        b a2 = this.g.a(this.h);
        if (a2 == null || !(a2 instanceof q)) {
            throw new com.facebook.react.bridge.m("Illegal node ID set as an input for Animated.DiffClamp node");
        }
        return ((q) a2).b();
    }
}
