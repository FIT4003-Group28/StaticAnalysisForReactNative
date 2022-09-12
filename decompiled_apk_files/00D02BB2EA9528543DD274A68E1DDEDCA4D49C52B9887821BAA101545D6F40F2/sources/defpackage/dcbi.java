package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentMap;
/* compiled from: PG */
/* renamed from: dcbi  reason: default package */
/* loaded from: classes5.dex */
public abstract class dcbi<K, V> extends dcbn<K, V> implements ConcurrentMap<K, V> {
    protected abstract ConcurrentMap<K, V> a();

    @Override // defpackage.dcbn
    protected /* bridge */ /* synthetic */ Map c() {
        throw null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final V putIfAbsent(K k, V v) {
        return a().putIfAbsent(k, v);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean remove(Object obj, Object obj2) {
        return a().remove(obj, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final V replace(K k, V v) {
        return a().replace(k, v);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean replace(K k, V v, V v2) {
        return a().replace(k, v, v2);
    }
}
