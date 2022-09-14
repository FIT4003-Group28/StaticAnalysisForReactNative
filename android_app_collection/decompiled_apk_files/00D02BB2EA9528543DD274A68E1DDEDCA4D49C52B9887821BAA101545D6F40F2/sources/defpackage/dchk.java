package defpackage;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dchk  reason: default package */
/* loaded from: classes5.dex */
public final class dchk<F, T> extends AbstractSequentialList<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final List<F> a;
    final dbrn<? super F, ? extends T> b;

    public dchk(List<F> list, dbrn<? super F, ? extends T> dbrnVar) {
        dbsk.s(list);
        this.a = list;
        dbsk.s(dbrnVar);
        this.b = dbrnVar;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new dchj(this, this.a.listIterator(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
