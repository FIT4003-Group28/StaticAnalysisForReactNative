package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dzwt  reason: default package */
/* loaded from: classes6.dex */
public final class dzwt implements Iterator {
    final /* synthetic */ dzwu a;
    private final Iterator b;
    private int c = -1;
    private Object d;

    public dzwt(dzwu dzwuVar) {
        this.a = dzwuVar;
        this.b = new dzwv((dzww) dzwuVar.a);
    }

    private final void a() {
        while (this.b.hasNext()) {
            Object next = this.b.next();
            if (this.a.b.a(next).booleanValue()) {
                this.d = next;
                this.c = 1;
                return;
            }
        }
        this.c = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c == -1) {
            a();
        }
        return this.c == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.c == -1) {
            a();
        }
        if (this.c != 0) {
            Object obj = this.d;
            this.d = null;
            this.c = -1;
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
