package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
/* compiled from: PG */
/* renamed from: dbye */
/* loaded from: classes.dex */
public abstract class dbye<K, V> extends dbyn<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    public transient Map<K, Collection<V>> a;
    public transient int b;

    public dbye(Map<K, Collection<V>> map) {
        dbsk.a(map.isEmpty());
        this.a = map;
    }

    public static /* synthetic */ void A(dbye dbyeVar) {
        dbyeVar.b--;
    }

    public static /* synthetic */ void B(dbye dbyeVar, int i) {
        dbyeVar.b += i;
    }

    public static /* synthetic */ void C(dbye dbyeVar, int i) {
        dbyeVar.b -= i;
    }

    public static /* synthetic */ void z(dbye dbyeVar) {
        dbyeVar.b++;
    }

    public <E> Collection<E> a(Collection<E> collection) {
        throw null;
    }

    public Collection<V> b(K k, Collection<V> collection) {
        throw null;
    }

    @Override // defpackage.dcka
    public Collection<V> f(K k) {
        Collection<V> collection = this.a.get(k);
        if (collection == null) {
            collection = k(k);
        }
        return b(k, collection);
    }

    public Collection<V> g(Object obj) {
        Collection<V> remove = this.a.remove(obj);
        if (remove == null) {
            return i();
        }
        Collection h = h();
        h.addAll(remove);
        this.b -= remove.size();
        remove.clear();
        return (Collection<V>) a(h);
    }

    public abstract Collection<V> h();

    public Collection<V> i() {
        throw null;
    }

    public final void j(Map<K, Collection<V>> map) {
        this.a = map;
        this.b = 0;
        for (Collection<V> collection : map.values()) {
            dbsk.a(!collection.isEmpty());
            this.b += collection.size();
        }
    }

    public Collection<V> k(K k) {
        return h();
    }

    @Override // defpackage.dcka
    public final int l() {
        return this.b;
    }

    @Override // defpackage.dcka
    public final boolean m(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.dbyn, defpackage.dcka
    public final boolean n(K k, V v) {
        Collection<V> collection = this.a.get(k);
        if (collection == null) {
            Collection<V> k2 = k(k);
            if (k2.add(v)) {
                this.b++;
                this.a.put(k, k2);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(v)) {
            return false;
        } else {
            this.b++;
            return true;
        }
    }

    public final Collection<V> o(K k, Iterable<? extends V> iterable) {
        Iterator<? extends V> it = iterable.iterator();
        if (it.hasNext()) {
            Collection<V> collection = this.a.get(k);
            if (collection == null) {
                collection = k(k);
                this.a.put(k, collection);
            }
            Collection h = h();
            h.addAll(collection);
            this.b -= collection.size();
            collection.clear();
            while (it.hasNext()) {
                if (collection.add(it.next())) {
                    this.b++;
                }
            }
            return (Collection<V>) a(h);
        }
        return g(k);
    }

    @Override // defpackage.dcka
    public void p() {
        for (Collection<V> collection : this.a.values()) {
            collection.clear();
        }
        this.a.clear();
        this.b = 0;
    }

    public final List<V> q(K k, List<V> list, dbxy dbxyVar) {
        if (list instanceof RandomAccess) {
            return new dbxu(this, k, list, dbxyVar);
        }
        return new dbya(this, k, list, dbxyVar);
    }

    @Override // defpackage.dbyn
    public Set<K> r() {
        return new dbxr(this, this.a);
    }

    public final Set<K> s() {
        Map<K, Collection<V>> map = this.a;
        if (map instanceof NavigableMap) {
            return new dbxt(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new dbxw(this, (SortedMap) map);
        }
        return new dbxr(this, map);
    }

    @Override // defpackage.dbyn
    public final Collection<V> t() {
        return new dbym(this);
    }

    @Override // defpackage.dbyn
    public Iterator<V> u() {
        return new dbxk(this);
    }

    @Override // defpackage.dbyn
    public final Collection<Map.Entry<K, V>> v() {
        if (this instanceof dcna) {
            return new dbyl(this);
        }
        return new dbyk(this);
    }

    @Override // defpackage.dbyn
    public Iterator<Map.Entry<K, V>> w() {
        return new dbxl(this);
    }

    @Override // defpackage.dbyn
    public Map<K, Collection<V>> x() {
        return new dbxo(this, this.a);
    }

    public final Map<K, Collection<V>> y() {
        Map<K, Collection<V>> map = this.a;
        if (map instanceof NavigableMap) {
            return new dbxs(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new dbxv(this, (SortedMap) map);
        }
        return new dbxo(this, map);
    }
}
