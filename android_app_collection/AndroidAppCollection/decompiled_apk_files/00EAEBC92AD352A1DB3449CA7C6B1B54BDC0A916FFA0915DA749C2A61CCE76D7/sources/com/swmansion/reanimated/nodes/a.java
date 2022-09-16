package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
/* loaded from: classes.dex */
public class a extends m implements j {

    /* renamed from: a  reason: collision with root package name */
    private int f9986a;

    public a(int i, ReadableMap readableMap, com.swmansion.reanimated.b bVar) {
        super(i, readableMap, bVar);
        this.f9986a = com.swmansion.reanimated.a.a(readableMap, "what", "Reanimated: Argument passed to always node is either of wrong type or is missing.");
    }

    @Override // com.swmansion.reanimated.nodes.j
    public void a() {
        value();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.swmansion.reanimated.nodes.m
    /* renamed from: evaluate */
    public Double mo321evaluate() {
        this.mNodesManager.a(this.f9986a, m.class).value();
        return m.ZERO;
    }
}
