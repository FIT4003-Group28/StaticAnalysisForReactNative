package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.ListIterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: shb  reason: default package */
/* loaded from: classes4.dex */
public final class shb implements ListIterator, Iterator {
    final /* synthetic */ shi a;
    final /* synthetic */ shc b;

    public shb(shc shcVar, shi shiVar) {
        this.b = shcVar;
        this.a = shiVar;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        shi shiVar = (shi) obj;
        throw new UnsupportedOperationException("ImmutableList");
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.a.c < this.b.a + (-1);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.a.c > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    /* renamed from: next */
    public final /* bridge */ /* synthetic */ Object mo416next() {
        shi shiVar = this.a;
        shiVar.c++;
        return shiVar;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a.c + 1;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        shi shiVar;
        shiVar.c--;
        return this.a;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a.c - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("ImmutableList");
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        shi shiVar = (shi) obj;
        throw new UnsupportedOperationException("ImmutableList");
    }
}
