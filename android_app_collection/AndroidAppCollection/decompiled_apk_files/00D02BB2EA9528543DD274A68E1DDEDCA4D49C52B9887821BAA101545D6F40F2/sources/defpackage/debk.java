package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
/* compiled from: PG */
/* renamed from: debk  reason: default package */
/* loaded from: classes6.dex */
final class debk<E> extends dcbk<E> {
    final List<E> a;

    public debk(List<E> list) {
        dbsk.s(list);
        this.a = list;
    }

    @Override // defpackage.dcbh, defpackage.dcbq
    protected final /* bridge */ /* synthetic */ Object SC() {
        return this.a;
    }

    @Override // defpackage.dcbk
    protected final List<E> a() {
        return this.a;
    }

    @Override // defpackage.dcbk, java.util.List
    public final void add(int i, E e) {
        dbsk.t(e, "this list cannot contain null");
        this.a.add(i, e);
    }

    @Override // defpackage.dcbk, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        return this.a.addAll(i, debo.a(collection));
    }

    @Override // defpackage.dcbk, defpackage.dcbh
    protected final /* bridge */ /* synthetic */ Collection b() {
        return this.a;
    }

    @Override // defpackage.dcbk, java.util.List
    public final ListIterator<E> listIterator() {
        return new debl(this.a.listIterator());
    }

    @Override // defpackage.dcbk, java.util.List
    public final E set(int i, E e) {
        dbsk.t(e, "this list cannot contain null");
        return this.a.set(i, e);
    }

    @Override // defpackage.dcbk, java.util.List
    public final List<E> subList(int i, int i2) {
        return new debk(this.a.subList(i, i2));
    }

    @Override // defpackage.dcbk, java.util.List
    public final ListIterator<E> listIterator(int i) {
        return new debl(this.a.listIterator(i));
    }

    @Override // defpackage.dcbh, java.util.Collection, java.util.Queue
    public final boolean add(E e) {
        dbsk.t(e, "this list cannot contain null");
        return this.a.add(e);
    }

    @Override // defpackage.dcbh, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        return this.a.addAll(debo.a(collection));
    }
}
