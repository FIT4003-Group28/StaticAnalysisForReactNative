package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.ListIterator;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: gav  reason: default package */
/* loaded from: classes3.dex */
public class gav implements ListIterator, Iterator {
    public final Deque a = new ArrayDeque();
    public final Deque b = new ArrayDeque();
    public Object c;

    public gav() {
        a();
    }

    public final void a() {
        c();
        b();
        this.c = null;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void b() {
        this.b.clear();
    }

    public final void c() {
        this.a.clear();
    }

    public final boolean d() {
        return this.c == null;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return !d() && !this.b.isEmpty();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return !d() && !this.a.isEmpty();
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    /* renamed from: next */
    public final Object mo416next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.a.offerFirst(this.c);
        Object pollFirst = this.b.pollFirst();
        this.c = pollFirst;
        return pollFirst;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        if (d()) {
            return -1;
        }
        return this.a.size() + 1;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.b.offerFirst(this.c);
        Object pollFirst = this.a.pollFirst();
        this.c = pollFirst;
        return pollFirst;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        if (d()) {
            return -1;
        }
        return this.a.size() - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        if (d() || obj == null) {
            throw new IllegalStateException();
        }
        this.c = obj;
    }
}
