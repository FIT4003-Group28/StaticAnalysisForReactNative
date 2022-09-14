package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dbwh  reason: default package */
/* loaded from: classes5.dex */
final class dbwh extends AbstractCollection {
    final /* synthetic */ dbwu a;

    public dbwh(dbwu dbwuVar) {
        this.a = dbwuVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new dbwf(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return dbwu.s(this).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <E> E[] toArray(E[] eArr) {
        return (E[]) dbwu.s(this).toArray(eArr);
    }
}
