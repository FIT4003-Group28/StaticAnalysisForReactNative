package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dbzk  reason: default package */
/* loaded from: classes5.dex */
final class dbzk extends AbstractSet {
    final /* synthetic */ dbzn a;

    public dbzk(dbzn dbznVar) {
        this.a = dbznVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        dbzn dbznVar = this.a;
        Map f = dbznVar.f();
        if (f != null) {
            return f.keySet().iterator();
        }
        return new dbzf(dbznVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map f = this.a.f();
        if (f != null) {
            return f.keySet().remove(obj);
        }
        return this.a.n(obj) != dbzn.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
