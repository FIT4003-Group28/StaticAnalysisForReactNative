package defpackage;

import java.util.Iterator;
import java.util.ListIterator;
/* compiled from: PG */
/* renamed from: debl  reason: default package */
/* loaded from: classes6.dex */
final class debl<E> extends dcbl<E> {
    private final ListIterator<E> a;

    public debl(ListIterator<E> listIterator) {
        this.a = listIterator;
    }

    @Override // defpackage.dcbj, defpackage.dcbq
    protected final /* bridge */ /* synthetic */ Object SC() {
        return this.a;
    }

    @Override // defpackage.dcbl, defpackage.dcbj
    protected final /* bridge */ /* synthetic */ Iterator a() {
        return this.a;
    }

    @Override // defpackage.dcbl, java.util.ListIterator
    public final void add(E e) {
        dbsk.t(e, "this list cannot contain null");
        this.a.add(e);
    }

    @Override // defpackage.dcbl
    protected final ListIterator<E> b() {
        return this.a;
    }

    @Override // defpackage.dcbl, java.util.ListIterator
    public final void set(E e) {
        dbsk.t(e, "this list cannot contain null");
        this.a.set(e);
    }
}
