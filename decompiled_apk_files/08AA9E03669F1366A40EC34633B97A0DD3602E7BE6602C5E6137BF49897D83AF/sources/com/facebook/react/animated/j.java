package com.facebook.react.animated;

import com.facebook.react.bridge.an;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ModulusAnimatedNode.java */
/* loaded from: classes.dex */
public class j extends q {
    private final l g;
    private final int h;
    private final int i;

    public j(an anVar, l lVar) {
        this.g = lVar;
        this.h = anVar.getInt("input");
        this.i = anVar.getInt("modulus");
    }

    @Override // com.facebook.react.animated.b
    public void a() {
        b a2 = this.g.a(this.h);
        if (a2 != null && (a2 instanceof q)) {
            this.e = ((q) a2).b() % this.i;
            return;
        }
        throw new com.facebook.react.bridge.m("Illegal node ID set as an input for Animated.modulus node");
    }
}
