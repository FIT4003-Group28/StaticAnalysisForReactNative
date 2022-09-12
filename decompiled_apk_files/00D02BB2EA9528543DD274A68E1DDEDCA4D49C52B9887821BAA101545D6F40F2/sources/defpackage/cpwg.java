package defpackage;

import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cpwg  reason: default package */
/* loaded from: classes5.dex */
public final class cpwg<F, T> extends AbstractSequentialList<T> implements List<T> {
    public final cpwe<? super F, ? extends T> a;
    private final List<F> b;

    public cpwg(List<F> list, cpwe<? super F, ? extends T> cpweVar) {
        this.b = (List) cpwl.a(list);
        this.a = (cpwe) cpwl.a(cpweVar);
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new cpwf(this, this.b.listIterator(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }
}
