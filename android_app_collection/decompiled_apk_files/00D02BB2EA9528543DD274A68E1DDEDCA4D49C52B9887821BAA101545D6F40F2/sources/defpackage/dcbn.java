package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dcbn  reason: default package */
/* loaded from: classes5.dex */
public abstract class dcbn<K, V> extends dcbq implements Map<K, V> {
    @Override // defpackage.dcbq
    protected /* bridge */ /* synthetic */ Object SC() {
        throw null;
    }

    protected abstract Map<K, V> c();

    public void clear() {
        c().clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return c().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return c().containsValue(obj);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return c().entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj == this || c().equals(obj);
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return c().get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return c().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return c().isEmpty();
    }

    public Set<K> keySet() {
        return c().keySet();
    }

    public V put(K k, V v) {
        return c().put(k, v);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        c().putAll(map);
    }

    public V remove(Object obj) {
        return c().remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return c().size();
    }

    public Collection<V> values() {
        return c().values();
    }
}
