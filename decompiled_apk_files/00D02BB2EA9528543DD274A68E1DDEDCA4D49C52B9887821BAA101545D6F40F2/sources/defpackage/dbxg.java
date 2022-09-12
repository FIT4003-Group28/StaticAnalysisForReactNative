package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dbxg  reason: default package */
/* loaded from: classes5.dex */
public class dbxg<K, V> extends dcbn<K, V> implements Serializable, dbyy {
    private static final long serialVersionUID = 0;
    public transient Map<K, V> a;
    public transient dbxg<V, K> b;
    private transient Set<K> c;
    private transient Set<V> d;
    private transient Set<Map.Entry<K, V>> e;

    public dbxg(Map<K, V> map, dbxg<V, K> dbxgVar) {
        this.a = map;
        this.b = dbxgVar;
    }

    public dbxg(Map<K, V> map, Map<V, K> map2) {
        d(map, map2);
    }

    @Override // defpackage.dcbn, defpackage.dcbq
    protected final /* bridge */ /* synthetic */ Object SC() {
        return this.a;
    }

    public K a(K k) {
        throw null;
    }

    public V b(V v) {
        return v;
    }

    @Override // defpackage.dcbn
    protected final Map<K, V> c() {
        return this.a;
    }

    @Override // defpackage.dcbn, java.util.Map
    public final void clear() {
        this.a.clear();
        this.b.a.clear();
    }

    @Override // defpackage.dcbn, java.util.Map
    public final boolean containsValue(Object obj) {
        return this.b.containsKey(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(Map<K, V> map, Map<V, K> map2) {
        boolean z = true;
        dbsk.l(this.a == null);
        dbsk.l(this.b == null);
        dbsk.a(map.isEmpty());
        dbsk.a(map2.isEmpty());
        if (map == map2) {
            z = false;
        }
        dbsk.a(z);
        this.a = map;
        this.b = new dbxd(map2, this);
    }

    public final void e(K k, boolean z, V v, V v2) {
        if (z) {
            h(v);
        }
        this.b.a.put(v2, k);
    }

    @Override // defpackage.dcbn, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.e;
        if (set == null) {
            dbxc dbxcVar = new dbxc(this);
            this.e = dbxcVar;
            return dbxcVar;
        }
        return set;
    }

    public final V g(Object obj) {
        V remove = this.a.remove(obj);
        h(remove);
        return remove;
    }

    public final void h(V v) {
        this.b.a.remove(v);
    }

    @Override // defpackage.dbyy
    public final dbyy<V, K> i() {
        return this.b;
    }

    @Override // defpackage.dbyy
    public final Set<V> j() {
        throw null;
    }

    @Override // defpackage.dcbn, java.util.Map
    public final Set<K> keySet() {
        Set<K> set = this.c;
        if (set == null) {
            dbxe dbxeVar = new dbxe(this);
            this.c = dbxeVar;
            return dbxeVar;
        }
        return set;
    }

    @Override // defpackage.dcbn, java.util.Map, defpackage.dbyy
    public final V put(K k, V v) {
        a(k);
        b(v);
        boolean containsKey = containsKey(k);
        if (!containsKey || !dbsd.a(v, get(k))) {
            dbsk.g(!containsValue(v), "value already present: %s", v);
            V put = this.a.put(k, v);
            e(k, containsKey, put, v);
            return put;
        }
        return v;
    }

    @Override // defpackage.dcbn, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // defpackage.dcbn, java.util.Map
    public final V remove(Object obj) {
        if (containsKey(obj)) {
            return g(obj);
        }
        return null;
    }

    @Override // defpackage.dcbn, java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        Set<V> set = this.d;
        if (set == null) {
            dbxf dbxfVar = new dbxf(this);
            this.d = dbxfVar;
            return dbxfVar;
        }
        return set;
    }
}
