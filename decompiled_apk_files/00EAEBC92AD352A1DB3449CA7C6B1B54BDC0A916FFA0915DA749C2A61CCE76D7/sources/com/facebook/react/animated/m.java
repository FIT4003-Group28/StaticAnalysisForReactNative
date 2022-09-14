package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.UIManager;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class m extends b {

    /* renamed from: e  reason: collision with root package name */
    private int f5383e = -1;

    /* renamed from: f  reason: collision with root package name */
    private final l f5384f;

    /* renamed from: g  reason: collision with root package name */
    private final UIManager f5385g;

    /* renamed from: h  reason: collision with root package name */
    private final Map<String, Integer> f5386h;
    private final JavaOnlyMap i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(ReadableMap readableMap, l lVar, UIManager uIManager) {
        ReadableMap mo210getMap = readableMap.mo210getMap("props");
        ReadableMapKeySetIterator keySetIterator = mo210getMap.keySetIterator();
        this.f5386h = new HashMap();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            this.f5386h.put(nextKey, Integer.valueOf(mo210getMap.getInt(nextKey)));
        }
        this.i = new JavaOnlyMap();
        this.f5384f = lVar;
        this.f5385g = uIManager;
    }

    public void a(int i) {
        if (this.f5383e == -1) {
            this.f5383e = i;
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node " + this.f5360d + " is already attached to a view");
    }

    public void b() {
        ReadableMapKeySetIterator keySetIterator = this.i.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            this.i.putNull(keySetIterator.nextKey());
        }
        this.f5385g.synchronouslyUpdateViewOnUIThread(this.f5383e, this.i);
    }

    public void b(int i) {
        if (this.f5383e == i) {
            this.f5383e = -1;
            return;
        }
        throw new JSApplicationIllegalArgumentException("Attempting to disconnect view that has not been connected with the given animated node");
    }

    public final void c() {
        if (this.f5383e == -1) {
            return;
        }
        for (Map.Entry<String, Integer> entry : this.f5386h.entrySet()) {
            b d2 = this.f5384f.d(entry.getValue().intValue());
            if (d2 == null) {
                throw new IllegalArgumentException("Mapped property node does not exists");
            }
            if (d2 instanceof o) {
                ((o) d2).a(this.i);
            } else if (!(d2 instanceof s)) {
                throw new IllegalArgumentException("Unsupported type of node used in property node " + d2.getClass());
            } else {
                s sVar = (s) d2;
                Object d3 = sVar.d();
                if (d3 instanceof String) {
                    this.i.putString(entry.getKey(), (String) d3);
                } else {
                    this.i.putDouble(entry.getKey(), sVar.e());
                }
            }
        }
        this.f5385g.synchronouslyUpdateViewOnUIThread(this.f5383e, this.i);
    }
}
