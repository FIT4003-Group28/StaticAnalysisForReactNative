package defpackage;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amwj  reason: default package */
/* loaded from: classes.dex */
public class amwj extends AbstractList {
    public final List a;

    public amwj(List list) {
        list.getClass();
        this.a = list;
    }

    private final int b(int i) {
        int size = size();
        aqxo.G(i, size);
        return (size - 1) - i;
    }

    public final int a(int i) {
        int size = size();
        aqxo.H(i, size);
        return size - i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.a.add(a(i), obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.a.get(b(i));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new amwi(this, this.a.listIterator(a(i)));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        return this.a.remove(b(i));
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        subList(i, i2).clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return this.a.set(b(i), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        aqxo.x(i, i2, size());
        return amxp.t(this.a.subList(a(i2), a(i)));
    }
}
