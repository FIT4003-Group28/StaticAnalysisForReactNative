package defpackage;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dcbz  reason: default package */
/* loaded from: classes.dex */
final class dcbz<K, V> extends AbstractMap<V, K> implements Serializable, dbyy {
    private final dccf<K, V> a;
    private transient Set<Map.Entry<V, K>> b;

    public dcbz(dccf<K, V> dccfVar) {
        this.a = dccfVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.a.g = this;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<V, K>> entrySet() {
        Set<Map.Entry<V, K>> set = this.b;
        if (set == null) {
            dcca dccaVar = new dcca(this.a);
            this.b = dccaVar;
            return dccaVar;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final K get(Object obj) {
        dccf<K, V> dccfVar = this.a;
        int d = dccfVar.d(obj);
        if (d == -1) {
            return null;
        }
        return dccfVar.a[d];
    }

    @Override // defpackage.dbyy
    public final dbyy<K, V> i() {
        throw null;
    }

    @Override // defpackage.dbyy
    public final Set<K> j() {
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<V> keySet() {
        return this.a.values();
    }

    @Override // java.util.AbstractMap, java.util.Map, defpackage.dbyy
    public final K put(V v, K k) {
        return this.a.k(v, k);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final K remove(Object obj) {
        dccf<K, V> dccfVar = this.a;
        int b = dccj.b(obj);
        int e = dccfVar.e(obj, b);
        if (e == -1) {
            return null;
        }
        K k = dccfVar.a[e];
        dccfVar.h(e, b);
        return k;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        return this.a.keySet();
    }
}
