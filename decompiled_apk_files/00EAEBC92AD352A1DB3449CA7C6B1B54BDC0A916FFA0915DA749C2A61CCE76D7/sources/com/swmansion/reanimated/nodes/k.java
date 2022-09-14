package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
/* loaded from: classes.dex */
public class k extends m {

    /* renamed from: a  reason: collision with root package name */
    private final int f10008a;

    public k(int i, ReadableMap readableMap, com.swmansion.reanimated.b bVar) {
        super(i, readableMap, bVar);
        this.f10008a = readableMap.getInt("what");
    }

    @Override // com.swmansion.reanimated.nodes.m
    /* renamed from: evaluate */
    protected Object mo321evaluate() {
        return this.mNodesManager.a(this.f10008a, m.class).value();
    }
}
