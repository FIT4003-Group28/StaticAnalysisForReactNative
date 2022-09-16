package defpackage;

import java.util.AbstractList;
import java.util.List;
/* compiled from: PG */
/* renamed from: dsrh  reason: default package */
/* loaded from: classes.dex */
public final class dsrh<F, T> extends AbstractList<T> {
    private final List<F> a;
    private final dsrg<F, T> b;

    public dsrh(List<F> list, dsrg<F, T> dsrgVar) {
        this.a = list;
        this.b = dsrgVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        return this.b.a(this.a.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
