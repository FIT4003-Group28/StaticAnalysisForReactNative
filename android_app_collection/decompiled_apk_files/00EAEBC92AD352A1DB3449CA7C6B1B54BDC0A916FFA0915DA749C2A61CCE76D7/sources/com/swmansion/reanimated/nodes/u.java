package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
/* loaded from: classes.dex */
public class u extends m {

    /* renamed from: a  reason: collision with root package name */
    private Object f10033a;

    public u(int i, ReadableMap readableMap, com.swmansion.reanimated.b bVar) {
        super(i, readableMap, bVar);
        Object obj = null;
        if (readableMap == null || !readableMap.hasKey("value")) {
            this.f10033a = null;
            return;
        }
        ReadableType type = readableMap.getType("value");
        if (type == ReadableType.String) {
            obj = readableMap.getString("value");
        } else if (type == ReadableType.Number) {
            obj = Double.valueOf(readableMap.getDouble("value"));
        } else if (type != ReadableType.Null) {
            throw new IllegalStateException("Not supported value type. Must be boolean, number or string");
        }
        this.f10033a = obj;
    }

    public void a(Object obj) {
        this.f10033a = obj;
        forceUpdateMemoizedValue(this.f10033a);
    }

    @Override // com.swmansion.reanimated.nodes.m
    /* renamed from: evaluate */
    protected Object mo321evaluate() {
        return this.f10033a;
    }
}
