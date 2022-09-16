package com.facebook.react.animated;

import com.facebook.react.bridge.am;
import com.facebook.react.bridge.an;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DivisionAnimatedNode.java */
/* loaded from: classes.dex */
public class g extends q {
    private final l g;
    private final int[] h;

    public g(an anVar, l lVar) {
        this.g = lVar;
        am e = anVar.e("input");
        this.h = new int[e.size()];
        for (int i = 0; i < this.h.length; i++) {
            this.h[i] = e.getInt(i);
        }
    }

    @Override // com.facebook.react.animated.b
    public void a() {
        for (int i = 0; i < this.h.length; i++) {
            b a2 = this.g.a(this.h[i]);
            if (a2 != null && (a2 instanceof q)) {
                double b2 = ((q) a2).b();
                if (i == 0) {
                    this.e = b2;
                } else if (b2 == 0.0d) {
                    throw new com.facebook.react.bridge.m("Detected a division by zero in Animated.divide node");
                } else {
                    this.e /= b2;
                }
            } else {
                throw new com.facebook.react.bridge.m("Illegal node ID set as an input for Animated.divide node");
            }
        }
    }
}
