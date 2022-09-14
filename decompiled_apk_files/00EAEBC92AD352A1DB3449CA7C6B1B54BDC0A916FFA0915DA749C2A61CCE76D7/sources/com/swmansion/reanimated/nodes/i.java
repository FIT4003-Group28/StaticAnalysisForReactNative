package com.swmansion.reanimated.nodes;

import android.util.Log;
import com.facebook.react.bridge.ReadableMap;
/* loaded from: classes.dex */
public class i extends m {

    /* renamed from: a  reason: collision with root package name */
    private final String f10006a;

    /* renamed from: b  reason: collision with root package name */
    private final int f10007b;

    public i(int i, ReadableMap readableMap, com.swmansion.reanimated.b bVar) {
        super(i, readableMap, bVar);
        this.f10006a = com.swmansion.reanimated.a.b(readableMap, "message", "Reanimated: First argument passed to debug node is either of wrong type or is missing.");
        this.f10007b = com.swmansion.reanimated.a.a(readableMap, "value", "Reanimated: Second argument passed to debug node is either of wrong type or is missing.");
    }

    @Override // com.swmansion.reanimated.nodes.m
    /* renamed from: evaluate */
    protected Object mo321evaluate() {
        Object value = this.mNodesManager.a(this.f10007b, m.class).value();
        Log.d("REANIMATED", String.format("%s %s", this.f10006a, value));
        return value;
    }
}
