package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dchi  reason: default package */
/* loaded from: classes.dex */
public final class dchi<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;
    final List<F> a;
    final dbrn<? super F, ? extends T> b;

    public dchi(List<F> list, dbrn<? super F, ? extends T> dbrnVar) {
        dbsk.s(list);
        this.a = list;
        dbsk.s(dbrnVar);
        this.b = dbrnVar;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        return this.b.a((F) this.a.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new dchh(this, this.a.listIterator(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final T remove(int i) {
        return this.b.a((F) this.a.remove(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
