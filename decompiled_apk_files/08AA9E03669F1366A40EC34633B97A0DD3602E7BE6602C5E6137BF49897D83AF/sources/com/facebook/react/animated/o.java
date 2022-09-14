package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.an;
import com.facebook.react.bridge.t;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StyleAnimatedNode.java */
/* loaded from: classes.dex */
public class o extends b {
    private final l e;
    private final Map<String, Integer> f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(an anVar, l lVar) {
        an d2 = anVar.d("style");
        ReadableMapKeySetIterator a2 = d2.a();
        this.f = new HashMap();
        while (a2.hasNextKey()) {
            String nextKey = a2.nextKey();
            this.f.put(nextKey, Integer.valueOf(d2.getInt(nextKey)));
        }
        this.e = lVar;
    }

    public void a(t tVar) {
        for (Map.Entry<String, Integer> entry : this.f.entrySet()) {
            b a2 = this.e.a(entry.getValue().intValue());
            if (a2 == null) {
                throw new IllegalArgumentException("Mapped style node does not exists");
            }
            if (a2 instanceof p) {
                ((p) a2).a(tVar);
            } else if (a2 instanceof q) {
                tVar.putDouble(entry.getKey(), ((q) a2).b());
            } else {
                throw new IllegalArgumentException("Unsupported type of node used in property node " + a2.getClass());
            }
        }
    }
}
