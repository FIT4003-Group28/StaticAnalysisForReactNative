package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dclg  reason: default package */
/* loaded from: classes5.dex */
final class dclg<E> implements Iterator<E> {
    private final dclb<E> a;
    private final Iterator<dcla<E>> b;
    private dcla<E> c;
    private int d;
    private int e;
    private boolean f;

    public dclg(dclb<E> dclbVar, Iterator<dcla<E>> it) {
        this.a = dclbVar;
        this.b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d > 0 || this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final E next() {
        if (hasNext()) {
            int i = this.d;
            if (i == 0) {
                dcla<E> next = this.b.next();
                this.c = next;
                i = next.b();
                this.e = i;
            }
            this.d = i - 1;
            this.f = true;
            return this.c.a();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        dbzb.c(this.f);
        if (this.e == 1) {
            this.b.remove();
        } else {
            this.a.remove(this.c.a());
        }
        this.e--;
        this.f = false;
    }
}
