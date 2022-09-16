package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: amrb  reason: default package */
/* loaded from: classes.dex */
class amrb extends amxb {
    final transient Map a;
    final /* synthetic */ amro b;

    public amrb(amro amroVar, Map map) {
        this.b = amroVar;
        this.a = map;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map.Entry a(Map.Entry entry) {
        Object key = entry.getKey();
        return amxp.l(key, this.b.d(key, (Collection) entry.getValue()));
    }

    @Override // defpackage.amxb
    public final Set b() {
        return new amqz(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map = this.a;
        amro amroVar = this.b;
        if (map == amroVar.a) {
            amroVar.m();
        } else {
            arey.m(new amra(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.a;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.a.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) amxp.i(this.a, obj);
        if (collection == null) {
            return null;
        }
        return this.b.d(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.amxb, java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return this.b.s();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.a.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection a = this.b.a();
        a.addAll(collection);
        this.b.b -= collection.size();
        collection.clear();
        return a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.a.toString();
    }
}
