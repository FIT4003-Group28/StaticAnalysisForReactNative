package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
/* loaded from: classes.dex */
public class h extends m {

    /* renamed from: a  reason: collision with root package name */
    private final int f10003a;

    /* renamed from: b  reason: collision with root package name */
    private final int f10004b;

    /* renamed from: c  reason: collision with root package name */
    private final int f10005c;

    public h(int i, ReadableMap readableMap, com.swmansion.reanimated.b bVar) {
        super(i, readableMap, bVar);
        this.f10003a = com.swmansion.reanimated.a.a(readableMap, "cond", "Reanimated: First argument passed to cond node is either of wrong type or is missing.");
        this.f10004b = com.swmansion.reanimated.a.a(readableMap, "ifBlock", "Reanimated: Second argument passed to cond node is either of wrong type or is missing.");
        this.f10005c = readableMap.hasKey("elseBlock") ? com.swmansion.reanimated.a.a(readableMap, "elseBlock", "Reanimated: Second argument passed to cond node is either of wrong type or is missing.") : -1;
    }

    @Override // com.swmansion.reanimated.nodes.m
    /* renamed from: evaluate */
    protected Object mo321evaluate() {
        Object b2 = this.mNodesManager.b(this.f10003a);
        if (!(b2 instanceof Number) || ((Number) b2).doubleValue() == 0.0d) {
            int i = this.f10005c;
            return i != -1 ? this.mNodesManager.b(i) : m.ZERO;
        }
        int i2 = this.f10004b;
        return i2 != -1 ? this.mNodesManager.b(i2) : m.ZERO;
    }
}
