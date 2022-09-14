package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
/* loaded from: classes.dex */
public class r extends m {

    /* renamed from: a  reason: collision with root package name */
    private int f10026a;

    /* renamed from: b  reason: collision with root package name */
    private int f10027b;

    public r(int i, ReadableMap readableMap, com.swmansion.reanimated.b bVar) {
        super(i, readableMap, bVar);
        this.f10026a = com.swmansion.reanimated.a.a(readableMap, "what", "Reanimated: First argument passed to set node is either of wrong type or is missing.");
        this.f10027b = com.swmansion.reanimated.a.a(readableMap, "value", "Reanimated: Second argument passed to set node is either of wrong type or is missing.");
    }

    @Override // com.swmansion.reanimated.nodes.m
    /* renamed from: evaluate */
    protected Object mo321evaluate() {
        Object b2 = this.mNodesManager.b(this.f10027b);
        ((u) this.mNodesManager.a(this.f10026a, u.class)).a(b2);
        return b2;
    }
}
