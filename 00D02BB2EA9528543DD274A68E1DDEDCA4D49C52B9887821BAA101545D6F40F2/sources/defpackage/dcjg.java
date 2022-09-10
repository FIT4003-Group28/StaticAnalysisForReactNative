package defpackage;

import java.util.Collection;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcjg  reason: default package */
/* loaded from: classes5.dex */
public abstract class dcjg<K, V> extends dcjy<K, V> {
    final Map<K, V> a;
    final dbsl<? super Map.Entry<K, V>> b;

    public dcjg(Map<K, V> map, dbsl<? super Map.Entry<K, V>> dbslVar) {
        this.a = map;
        this.b = dbslVar;
    }

    @Override // defpackage.dcjy
    public final Collection<V> SD() {
        return new dcjq(this, this.a, this.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(Object obj, V v) {
        return this.b.a(dcjz.p(obj, v));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.a.containsKey(obj) && b(obj, this.a.get(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        V v = this.a.get(obj);
        if (v == null || !b(obj, v)) {
            return null;
        }
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return entrySet().isEmpty();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        dbsk.a(b(k, v));
        return this.a.put(k, v);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            dbsk.a(b(entry.getKey(), entry.getValue()));
        }
        this.a.putAll(map);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        if (containsKey(obj)) {
            return this.a.remove(obj);
        }
        return null;
    }
}
