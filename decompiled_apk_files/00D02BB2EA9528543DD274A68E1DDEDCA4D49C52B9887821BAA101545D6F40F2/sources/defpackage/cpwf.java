package defpackage;

import java.util.ListIterator;
/* compiled from: PG */
/* renamed from: cpwf  reason: default package */
/* loaded from: classes5.dex */
final class cpwf implements ListIterator {
    final /* synthetic */ ListIterator a;
    final /* synthetic */ cpwg b;

    public cpwf(cpwg cpwgVar, ListIterator listIterator) {
        this.b = cpwgVar;
        this.a = listIterator;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
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
    public final Object next() {
        return this.b.a.a(this.a.next());
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.b.a.a(this.a.previous());
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
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
