package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
/* loaded from: classes.dex */
public class c extends m {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f9994a;

    public c(int i, ReadableMap readableMap, com.swmansion.reanimated.b bVar) {
        super(i, readableMap, bVar);
        this.f9994a = com.swmansion.reanimated.e.a(readableMap.getArray("block"));
    }

    @Override // com.swmansion.reanimated.nodes.m
    /* renamed from: evaluate */
    protected Object mo321evaluate() {
        Object obj = null;
        int i = 0;
        while (true) {
            int[] iArr = this.f9994a;
            if (i < iArr.length) {
                obj = this.mNodesManager.a(iArr[i], m.class).value();
                i++;
            } else {
                return obj;
            }
        }
    }
}
