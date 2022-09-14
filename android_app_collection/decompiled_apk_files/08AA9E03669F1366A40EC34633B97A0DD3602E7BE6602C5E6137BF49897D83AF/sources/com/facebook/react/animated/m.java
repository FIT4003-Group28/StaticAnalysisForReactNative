package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.an;
import com.facebook.react.bridge.t;
import com.facebook.react.uimanager.aj;
import com.facebook.react.uimanager.y;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PropsAnimatedNode.java */
/* loaded from: classes.dex */
public class m extends b {
    private int e = -1;
    private final l f;
    private final aj g;
    private final Map<String, Integer> h;
    private final t i;
    private final y j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(an anVar, l lVar, aj ajVar) {
        an d2 = anVar.d("props");
        ReadableMapKeySetIterator a2 = d2.a();
        this.h = new HashMap();
        while (a2.hasNextKey()) {
            String nextKey = a2.nextKey();
            this.h.put(nextKey, Integer.valueOf(d2.getInt(nextKey)));
        }
        this.i = new t();
        this.j = new y(this.i);
        this.f = lVar;
        this.g = ajVar;
    }

    public void a(int i) {
        if (this.e != -1) {
            throw new com.facebook.react.bridge.n("Animated node " + this.f3144d + " is already attached to a view");
        }
        this.e = i;
    }

    public void b(int i) {
        if (this.e != i) {
            throw new com.facebook.react.bridge.n("Attempting to disconnect view that has not been connected with the given animated node");
        }
        this.e = -1;
    }

    public void b() {
        ReadableMapKeySetIterator a2 = this.i.a();
        while (a2.hasNextKey()) {
            this.i.putNull(a2.nextKey());
        }
        this.g.a(this.e, this.j);
    }

    public final void c() {
        if (this.e == -1) {
            return;
        }
        for (Map.Entry<String, Integer> entry : this.h.entrySet()) {
            b a2 = this.f.a(entry.getValue().intValue());
            if (a2 == null) {
                throw new IllegalArgumentException("Mapped property node does not exists");
            }
            if (a2 instanceof o) {
                ((o) a2).a(this.i);
            } else if (a2 instanceof q) {
                this.i.putDouble(entry.getKey(), ((q) a2).b());
            } else {
                throw new IllegalArgumentException("Unsupported type of node used in property node " + a2.getClass());
            }
        }
        this.g.a(this.e, this.j);
    }
}
