package defpackage;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* compiled from: PG */
/* renamed from: dsuc  reason: default package */
/* loaded from: classes6.dex */
public final class dsuc extends AbstractList<String> implements RandomAccess, dsrt {
    public final dsrt a;

    public dsuc(dsrt dsrtVar) {
        this.a = dsrtVar;
    }

    @Override // defpackage.dsrt
    public final void f(dspd dspdVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dsrt
    public final Object g(int i) {
        return this.a.g(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((dsrs) this.a).get(i);
    }

    @Override // defpackage.dsrt
    public final List<?> h() {
        return this.a.h();
    }

    @Override // defpackage.dsrt
    public final dsrt i() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new dsub(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new dsua(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
