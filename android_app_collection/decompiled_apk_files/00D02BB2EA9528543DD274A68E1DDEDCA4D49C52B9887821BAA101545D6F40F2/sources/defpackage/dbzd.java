package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dbzd  reason: default package */
/* loaded from: classes5.dex */
final class dbzd<F, T> extends AbstractCollection<T> {
    final Collection<F> a;
    final dbrn<? super F, ? extends T> b;

    public dbzd(Collection<F> collection, dbrn<? super F, ? extends T> dbrnVar) {
        dbsk.s(collection);
        this.a = collection;
        dbsk.s(dbrnVar);
        this.b = dbrnVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return dcgh.l(this.a.iterator(), this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size();
    }
}
