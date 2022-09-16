package defpackage;

import j$.util.Iterator;
import java.util.ListIterator;
/* compiled from: PG */
/* renamed from: amrm  reason: default package */
/* loaded from: classes.dex */
final class amrm extends amrk implements ListIterator, Iterator {
    final /* synthetic */ amrn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amrm(amrn amrnVar) {
        super(amrnVar);
        this.d = amrnVar;
    }

    private final ListIterator b() {
        a();
        return (ListIterator) this.a;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean isEmpty = this.d.isEmpty();
        b().add(obj);
        amrn amrnVar = this.d;
        amrnVar.f.b++;
        if (isEmpty) {
            amrnVar.a();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amrm(amrn amrnVar, int i) {
        super(amrnVar, amrnVar.d().listIterator(i));
        this.d = amrnVar;
    }
}
