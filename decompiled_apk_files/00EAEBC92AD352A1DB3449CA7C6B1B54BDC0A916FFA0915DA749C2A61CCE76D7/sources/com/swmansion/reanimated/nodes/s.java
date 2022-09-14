package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.Map;
/* loaded from: classes.dex */
public class s extends m {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Integer> f10028a;

    public s(int i, ReadableMap readableMap, com.swmansion.reanimated.b bVar) {
        super(i, readableMap, bVar);
        this.f10028a = com.swmansion.reanimated.e.a(readableMap.mo210getMap("style"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.swmansion.reanimated.nodes.m
    /* renamed from: evaluate */
    public WritableMap mo321evaluate() {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        for (Map.Entry<String, Integer> entry : this.f10028a.entrySet()) {
            m a2 = this.mNodesManager.a(entry.getValue().intValue(), m.class);
            if (a2 instanceof t) {
                javaOnlyMap.putArray(entry.getKey(), (WritableArray) a2.value());
            } else {
                Object value = a2.value();
                if (value instanceof Double) {
                    javaOnlyMap.putDouble(entry.getKey(), ((Double) value).doubleValue());
                } else if (!(value instanceof String)) {
                    throw new IllegalStateException("Wrong style form");
                } else {
                    javaOnlyMap.putString(entry.getKey(), (String) value);
                }
            }
        }
        return javaOnlyMap;
    }
}
