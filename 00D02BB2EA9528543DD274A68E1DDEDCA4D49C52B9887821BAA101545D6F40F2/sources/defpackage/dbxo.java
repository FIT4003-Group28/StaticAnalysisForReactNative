package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbxo  reason: default package */
/* loaded from: classes.dex */
public class dbxo extends dcjy {
    final transient Map a;
    final /* synthetic */ dbye b;

    public dbxo(dbye dbyeVar, Map map) {
        this.b = dbyeVar;
        this.a = map;
    }

    @Override // defpackage.dcjy
    public final Set<Map.Entry> a() {
        return new dbxm(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map.Entry b(Map.Entry entry) {
        Object key = entry.getKey();
        return dcjz.p(key, this.b.b(key, (Collection) entry.getValue()));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map = this.a;
        dbye dbyeVar = this.b;
        if (map == dbyeVar.a) {
            dbyeVar.p();
        } else {
            dcgh.r(new dbxn(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return dcjz.B(this.a, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.a.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) dcjz.A(this.a, obj);
        if (collection == null) {
            return null;
        }
        return this.b.b(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.dcjy, java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return this.b.J();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.a.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection h = this.b.h();
        h.addAll(collection);
        dbye.C(this.b, collection.size());
        collection.clear();
        return h;
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
