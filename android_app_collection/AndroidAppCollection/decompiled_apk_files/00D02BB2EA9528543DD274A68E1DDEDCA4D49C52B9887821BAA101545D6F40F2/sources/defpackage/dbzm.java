package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dbzm  reason: default package */
/* loaded from: classes5.dex */
final class dbzm extends AbstractCollection {
    final /* synthetic */ dbzn a;

    public dbzm(dbzn dbznVar) {
        this.a = dbznVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        dbzn dbznVar = this.a;
        Map f = dbznVar.f();
        if (f != null) {
            return f.values().iterator();
        }
        return new dbzh(dbznVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size();
    }
}
