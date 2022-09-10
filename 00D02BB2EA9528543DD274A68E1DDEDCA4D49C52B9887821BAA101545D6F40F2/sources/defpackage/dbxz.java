package defpackage;

import java.util.ListIterator;
/* compiled from: PG */
/* renamed from: dbxz  reason: default package */
/* loaded from: classes5.dex */
final class dbxz extends dbxx implements ListIterator {
    final /* synthetic */ dbya d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbxz(dbya dbyaVar) {
        super(dbyaVar);
        this.d = dbyaVar;
    }

    private final ListIterator b() {
        a();
        return (ListIterator) this.a;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean isEmpty = this.d.isEmpty();
        b().add(obj);
        dbye.z(this.d.f);
        if (isEmpty) {
            this.d.c();
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
    public dbxz(dbya dbyaVar, int i) {
        super(dbyaVar, dbyaVar.d().listIterator(i));
        this.d = dbyaVar;
    }
}
