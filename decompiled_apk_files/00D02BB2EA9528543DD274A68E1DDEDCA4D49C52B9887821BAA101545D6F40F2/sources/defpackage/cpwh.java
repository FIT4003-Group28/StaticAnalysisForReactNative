package defpackage;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: PG */
/* renamed from: cpwh  reason: default package */
/* loaded from: classes5.dex */
final class cpwh<F, T> extends AbstractList<T> implements List<T>, RandomAccess {
    private final List<F> a;
    private final cpwe<? super F, ? extends T> b;

    public cpwh(List<F> list, cpwe<? super F, ? extends T> cpweVar) {
        this.a = (List) cpwl.a(list);
        this.b = (cpwe) cpwl.a(cpweVar);
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        return this.b.a((F) this.a.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
