package com.facebook.react.animated;

import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class o extends b {

    /* renamed from: e  reason: collision with root package name */
    private final l f5393e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, Integer> f5394f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(ReadableMap readableMap, l lVar) {
        ReadableMap mo210getMap = readableMap.mo210getMap("style");
        ReadableMapKeySetIterator keySetIterator = mo210getMap.keySetIterator();
        this.f5394f = new HashMap();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            this.f5394f.put(nextKey, Integer.valueOf(mo210getMap.getInt(nextKey)));
        }
        this.f5393e = lVar;
    }

    public void a(JavaOnlyMap javaOnlyMap) {
        for (Map.Entry<String, Integer> entry : this.f5394f.entrySet()) {
            b d2 = this.f5393e.d(entry.getValue().intValue());
            if (d2 == null) {
                throw new IllegalArgumentException("Mapped style node does not exists");
            }
            if (d2 instanceof r) {
                ((r) d2).a(javaOnlyMap);
            } else if (!(d2 instanceof s)) {
                throw new IllegalArgumentException("Unsupported type of node used in property node " + d2.getClass());
            } else {
                javaOnlyMap.putDouble(entry.getKey(), ((s) d2).e());
            }
        }
    }
}
