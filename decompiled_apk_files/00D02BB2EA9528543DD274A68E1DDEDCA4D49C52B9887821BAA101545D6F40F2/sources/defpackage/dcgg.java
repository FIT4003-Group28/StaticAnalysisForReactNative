package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dcgg  reason: default package */
/* loaded from: classes5.dex */
public final class dcgg<E> implements Iterator {
    private final Iterator<? extends E> a;
    private boolean b;
    private E c;

    public dcgg(Iterator<? extends E> it) {
        dbsk.s(it);
        this.a = it;
    }

    public final E a() {
        if (!this.b) {
            this.c = this.a.next();
            this.b = true;
        }
        return this.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b || this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final E next() {
        if (!this.b) {
            return this.a.next();
        }
        E e = this.c;
        this.b = false;
        this.c = null;
        return e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        dbsk.m(!this.b, "Can't remove after you've peeked at next");
        this.a.remove();
    }
}
