package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbyn  reason: default package */
/* loaded from: classes.dex */
public abstract class dbyn<K, V> implements dcka<K, V> {
    private transient Collection<Map.Entry<K, V>> a;
    private transient Set<K> b;
    private transient Collection<V> c;
    private transient Map<K, Collection<V>> d;

    @Override // defpackage.dcka
    public boolean D() {
        return l() == 0;
    }

    public boolean E(Object obj) {
        for (Collection<V> collection : L().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dcka
    public final boolean F(Object obj, Object obj2) {
        Collection<V> collection = L().get(obj);
        return collection != null && collection.contains(obj2);
    }

    @Override // defpackage.dcka
    public boolean G(Object obj, Object obj2) {
        Collection<V> collection = L().get(obj);
        return collection != null && collection.remove(obj2);
    }

    @Override // defpackage.dcka
    public boolean H(dcka<? extends K, ? extends V> dckaVar) {
        boolean z = false;
        for (Map.Entry<? extends K, ? extends V> entry : dckaVar.I()) {
            z |= n(entry.getKey(), entry.getValue());
        }
        return true == z;
    }

    @Override // defpackage.dcka
    public Collection<Map.Entry<K, V>> I() {
        Collection<Map.Entry<K, V>> collection = this.a;
        if (collection == null) {
            Collection<Map.Entry<K, V>> v = v();
            this.a = v;
            return v;
        }
        return collection;
    }

    @Override // defpackage.dcka
    public Set<K> J() {
        Set<K> set = this.b;
        if (set == null) {
            Set<K> r = r();
            this.b = r;
            return r;
        }
        return set;
    }

    @Override // defpackage.dcka
    public Collection<V> K() {
        Collection<V> collection = this.c;
        if (collection == null) {
            Collection<V> t = t();
            this.c = t;
            return t;
        }
        return collection;
    }

    @Override // defpackage.dcka
    public Map<K, Collection<V>> L() {
        Map<K, Collection<V>> map = this.d;
        if (map == null) {
            Map<K, Collection<V>> x = x();
            this.d = x;
            return x;
        }
        return map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dcka
    public void M(K k, Iterable<? extends V> iterable) {
        dbsk.s(iterable);
        if (iterable instanceof Collection) {
            if (iterable.isEmpty() || f(k).addAll(iterable)) {
            }
            return;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext() || dcgh.g(f(k), it)) {
        }
    }

    @Override // defpackage.dcka
    public final boolean equals(Object obj) {
        return dckz.f(this, obj);
    }

    @Override // defpackage.dcka
    public final int hashCode() {
        return L().hashCode();
    }

    @Override // defpackage.dcka
    public boolean n(K k, V v) {
        throw null;
    }

    public abstract Set<K> r();

    public abstract Collection<V> t();

    public final String toString() {
        return L().toString();
    }

    public Iterator<V> u() {
        throw null;
    }

    public abstract Collection<Map.Entry<K, V>> v();

    public abstract Iterator<Map.Entry<K, V>> w();

    public abstract Map<K, Collection<V>> x();
}
