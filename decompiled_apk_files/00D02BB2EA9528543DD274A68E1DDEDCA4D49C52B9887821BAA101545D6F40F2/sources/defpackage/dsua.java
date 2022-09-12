package defpackage;

import java.util.ListIterator;
/* compiled from: PG */
/* renamed from: dsua  reason: default package */
/* loaded from: classes6.dex */
final class dsua implements ListIterator<String> {
    final ListIterator<String> a;
    final /* synthetic */ int b;
    final /* synthetic */ dsuc c;

    public dsua(dsuc dsucVar, int i) {
        this.c = dsucVar;
        this.b = i;
        this.a = dsucVar.a.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return this.a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ String previous() {
        return this.a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}
