package defpackage;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dchg  reason: default package */
/* loaded from: classes5.dex */
public class dchg<T> extends AbstractList<T> {
    public final List<T> a;

    public dchg(List<T> list) {
        dbsk.s(list);
        this.a = list;
    }

    private final int b(int i) {
        int size = size();
        dbsk.z(i, size);
        return (size - 1) - i;
    }

    public final int a(int i) {
        int size = size();
        dbsk.y(i, size);
        return size - i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, T t) {
        this.a.add(a(i), t);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        return this.a.get(b(i));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new dchf(this, this.a.listIterator(a(i)));
    }

    @Override // java.util.AbstractList, java.util.List
    public final T remove(int i) {
        return this.a.remove(b(i));
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        subList(i, i2).clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final T set(int i, T t) {
        return this.a.set(b(i), t);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final List<T> subList(int i, int i2) {
        dbsk.u(i, i2, size());
        return dchl.l(this.a.subList(a(i2), a(i)));
    }
}
