package defpackage;

import java.util.ListIterator;
/* compiled from: PG */
/* renamed from: cpvt  reason: default package */
/* loaded from: classes5.dex */
final class cpvt implements ListIterator {
    final /* synthetic */ cpwd a;
    final /* synthetic */ cpvu b;

    public cpvt(cpvu cpvuVar, cpwd cpwdVar) {
        this.b = cpvuVar;
        this.a = cpwdVar;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        cpwd cpwdVar = (cpwd) obj;
        throw new UnsupportedOperationException("ImmutableList");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.a.c < this.b.a + (-1);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.a.c > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        cpwd cpwdVar = this.a;
        cpwdVar.c++;
        return cpwdVar;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a.c + 1;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        cpwd cpwdVar;
        cpwdVar.c--;
        return this.a;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a.c - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("ImmutableList");
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        cpwd cpwdVar = (cpwd) obj;
        throw new UnsupportedOperationException("ImmutableList");
    }
}
