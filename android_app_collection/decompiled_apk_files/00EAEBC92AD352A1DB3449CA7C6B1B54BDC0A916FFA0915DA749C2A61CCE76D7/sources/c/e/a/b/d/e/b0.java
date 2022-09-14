package c.e.a.b.d.e;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class b0<K, V> implements Serializable, Map<K, V> {

    /* renamed from: b  reason: collision with root package name */
    private transient d0<Map.Entry<K, V>> f3864b;

    /* renamed from: c  reason: collision with root package name */
    private transient d0<K> f3865c;

    /* renamed from: d  reason: collision with root package name */
    private transient x<V> f3866d;

    public static <K, V> b0<K, V> d() {
        return (b0<K, V>) f0.f3897h;
    }

    abstract d0<Map.Entry<K, V>> a();

    abstract d0<K> b();

    abstract x<V> c();

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return ((x) values()).contains(obj);
    }

    @Override // java.util.Map
    public /* synthetic */ Set entrySet() {
        d0<Map.Entry<K, V>> d0Var = this.f3864b;
        if (d0Var == null) {
            d0<Map.Entry<K, V>> a2 = a();
            this.f3864b = a2;
            return a2;
        }
        return d0Var;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    @Override // java.util.Map
    public int hashCode() {
        return i0.a((d0) entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public /* synthetic */ Set keySet() {
        d0<K> d0Var = this.f3865c;
        if (d0Var == null) {
            d0<K> b2 = b();
            this.f3865c = b2;
            return b2;
        }
        return d0Var;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        int size = size();
        if (size < 0) {
            StringBuilder sb = new StringBuilder("size".length() + 40);
            sb.append("size");
            sb.append(" cannot be negative but was: ");
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder((int) Math.min(size << 3, 1073741824L));
        sb2.append('{');
        boolean z = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z) {
                sb2.append(", ");
            }
            z = false;
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.Map
    public /* synthetic */ Collection values() {
        x<V> xVar = this.f3866d;
        if (xVar == null) {
            x<V> c2 = c();
            this.f3866d = c2;
            return c2;
        }
        return xVar;
    }
}
