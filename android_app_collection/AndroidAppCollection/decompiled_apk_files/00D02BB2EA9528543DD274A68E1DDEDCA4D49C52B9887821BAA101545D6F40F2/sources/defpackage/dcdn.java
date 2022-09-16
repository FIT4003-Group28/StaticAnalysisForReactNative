package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.SortedMap;
/* compiled from: PG */
/* renamed from: dcdn  reason: default package */
/* loaded from: classes.dex */
public abstract class dcdn<K, V> implements Map<K, V>, Serializable {
    public static final /* synthetic */ int c = 0;
    private transient dcep<Map.Entry<K, V>> a;
    public transient dcet<K, V> b;
    private transient dcep<K> d;
    private transient dccr<V> e;

    public static <K, V> dcdn<K, V> k(K k, V v) {
        dbzb.a(k, v);
        return dcmn.e(1, new Object[]{k, v});
    }

    public static <K, V> dcdn<K, V> l(K k, V v, K k2, V v2) {
        dbzb.a(k, v);
        dbzb.a(k2, v2);
        return dcmn.e(2, new Object[]{k, v, k2, v2});
    }

    public static <K, V> dcdn<K, V> m(K k, V v, K k2, V v2, K k3, V v3) {
        dbzb.a(k, v);
        dbzb.a(k2, v2);
        dbzb.a(k3, v3);
        return dcmn.e(3, new Object[]{k, v, k2, v2, k3, v3});
    }

    public static <K, V> dcdn<K, V> n(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        dbzb.a(k, v);
        dbzb.a(k2, v2);
        dbzb.a(k3, v3);
        dbzb.a(k4, v4);
        return dcmn.e(4, new Object[]{k, v, k2, v2, k3, v3, k4, v4});
    }

    public static <K, V> dcdn<K, V> o(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        dbzb.a(k, v);
        dbzb.a(k2, v2);
        dbzb.a(k3, v3);
        dbzb.a(k4, v4);
        dbzb.a(k5, v5);
        return dcmn.e(5, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5});
    }

    public static <K, V> dcdg<K, V> p() {
        return new dcdg<>();
    }

    public static <K, V> dcdg<K, V> q(int i) {
        dbzb.d(i, "expectedSize");
        return new dcdg<>(i);
    }

    public static <K, V> dcdn<K, V> r(Map<? extends K, ? extends V> map) {
        if ((map instanceof dcdn) && !(map instanceof SortedMap)) {
            dcdn<K, V> dcdnVar = (dcdn) map;
            if (!dcdnVar.c()) {
                return dcdnVar;
            }
        }
        return s(map.entrySet());
    }

    public static <K, V> dcdn<K, V> s(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        dcdg dcdgVar = new dcdg(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        dcdgVar.e(iterable);
        return dcdgVar.b();
    }

    public dcpd<K> SJ() {
        return new dcdf(entrySet().iterator());
    }

    public boolean SK() {
        return false;
    }

    public abstract dcep<Map.Entry<K, V>> SM();

    public abstract boolean c();

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
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract dcep<K> d();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public abstract dccr<V> g();

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    @Override // java.util.Map
    /* renamed from: h */
    public dccr<V> values() {
        dccr<V> dccrVar = this.e;
        if (dccrVar == null) {
            dccr<V> g = g();
            this.e = g;
            return g;
        }
        return dccrVar;
    }

    @Override // java.util.Map
    public int hashCode() {
        return dcnm.r(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
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

    @Override // java.util.Map
    /* renamed from: t */
    public final dcep<Map.Entry<K, V>> entrySet() {
        dcep<Map.Entry<K, V>> dcepVar = this.a;
        if (dcepVar == null) {
            dcep<Map.Entry<K, V>> SM = SM();
            this.a = SM;
            return SM;
        }
        return dcepVar;
    }

    public final String toString() {
        return dcjz.E(this);
    }

    @Override // java.util.Map
    /* renamed from: u */
    public dcep<K> keySet() {
        dcep<K> dcepVar = this.d;
        if (dcepVar == null) {
            dcep<K> d = d();
            this.d = d;
            return d;
        }
        return dcepVar;
    }

    Object writeReplace() {
        return new dcdm(this);
    }
}
