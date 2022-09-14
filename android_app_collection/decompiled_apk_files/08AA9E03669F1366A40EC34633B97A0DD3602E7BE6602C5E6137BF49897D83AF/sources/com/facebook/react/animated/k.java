package com.facebook.react.animated;

import com.facebook.react.bridge.am;
import com.facebook.react.bridge.an;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MultiplicationAnimatedNode.java */
/* loaded from: classes.dex */
public class k extends q {
    private final l g;
    private final int[] h;

    public k(an anVar, l lVar) {
        this.g = lVar;
        am e = anVar.e("input");
        this.h = new int[e.size()];
        for (int i = 0; i < this.h.length; i++) {
            this.h[i] = e.getInt(i);
        }
    }

    @Override // com.facebook.react.animated.b
    public void a() {
        this.e = 1.0d;
        for (int i = 0; i < this.h.length; i++) {
            b a2 = this.g.a(this.h[i]);
            if (a2 != null && (a2 instanceof q)) {
                this.e *= ((q) a2).b();
            } else {
                throw new com.facebook.react.bridge.m("Illegal node ID set as an input for Animated.multiply node");
            }
        }
    }
}
