package defpackage;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* compiled from: PG */
/* renamed from: aosb  reason: default package */
/* loaded from: classes.dex */
public final class aosb extends AbstractList implements RandomAccess, aoqf {
    public final aoqf a;

    public aosb(aoqf aoqfVar) {
        this.a = aoqfVar;
    }

    @Override // defpackage.aoqf
    public final aoqf d() {
        return this;
    }

    @Override // defpackage.aoqf
    public final Object f(int i) {
        return this.a.f(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((aoqe) this.a).get(i);
    }

    @Override // defpackage.aoqf
    public final List h() {
        return this.a.h();
    }

    @Override // defpackage.aoqf
    public final void i(aoob aoobVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new aosa(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new aorz(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
