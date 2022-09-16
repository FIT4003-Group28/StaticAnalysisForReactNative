package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.ListIterator;
/* compiled from: PG */
/* renamed from: shk  reason: default package */
/* loaded from: classes4.dex */
final class shk implements ListIterator, Iterator {
    final /* synthetic */ ListIterator a;
    final /* synthetic */ shl b;

    public shk(shl shlVar, ListIterator listIterator) {
        this.b = shlVar;
        this.a = listIterator;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    /* renamed from: next */
    public final Object mo416next() {
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

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
