package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dcom  reason: default package */
/* loaded from: classes5.dex */
class dcom<K, V> extends dcoo implements Map<K, V> {
    private static final long serialVersionUID = 0;
    transient Set<K> c;
    transient Collection<V> d;
    transient Set<Map.Entry<K, V>> e;

    public dcom(Map<K, V> map, Object obj) {
        super(map, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<K, V> a() {
        return (Map) this.f;
    }

    @Override // java.util.Map
    public final void clear() {
        synchronized (this.g) {
            a().clear();
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        boolean containsKey;
        synchronized (this.g) {
            containsKey = a().containsKey(obj);
        }
        return containsKey;
    }

    public boolean containsValue(Object obj) {
        boolean containsValue;
        synchronized (this.g) {
            containsValue = a().containsValue(obj);
        }
        return containsValue;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set;
        synchronized (this.g) {
            if (this.e == null) {
                this.e = dcos.b(a().entrySet(), this.g);
            }
            set = this.e;
        }
        return set;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        boolean equals;
        if (obj == this) {
            return true;
        }
        synchronized (this.g) {
            equals = a().equals(obj);
        }
        return equals;
    }

    public V get(Object obj) {
        V v;
        synchronized (this.g) {
            v = a().get(obj);
        }
        return v;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int hashCode;
        synchronized (this.g) {
            hashCode = a().hashCode();
        }
        return hashCode;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.g) {
            isEmpty = a().isEmpty();
        }
        return isEmpty;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        Set<K> set;
        synchronized (this.g) {
            if (this.c == null) {
                this.c = dcos.b(a().keySet(), this.g);
            }
            set = this.c;
        }
        return set;
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        V put;
        synchronized (this.g) {
            put = a().put(k, v);
        }
        return put;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        synchronized (this.g) {
            a().putAll(map);
        }
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        V remove;
        synchronized (this.g) {
            remove = a().remove(obj);
        }
        return remove;
    }

    @Override // java.util.Map
    public final int size() {
        int size;
        synchronized (this.g) {
            size = a().size();
        }
        return size;
    }

    public Collection<V> values() {
        Collection<V> collection;
        synchronized (this.g) {
            if (this.d == null) {
                this.d = dcos.a(a().values(), this.g);
            }
            collection = this.d;
        }
        return collection;
    }
}
