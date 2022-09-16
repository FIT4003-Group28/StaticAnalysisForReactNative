package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbyh  reason: default package */
/* loaded from: classes5.dex */
public abstract class dbyh<T> implements Iterator<T> {
    int b;
    int c = -1;
    int d;
    final /* synthetic */ dbyi e;

    public dbyh(dbyi dbyiVar) {
        this.e = dbyiVar;
        this.b = dbyiVar.a.a();
        this.d = dbyiVar.a.d;
    }

    private final void b() {
        if (this.e.a.d == this.d) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public abstract T a(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        b();
        return this.b >= 0;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T a = a(this.b);
        int i = this.b;
        this.c = i;
        this.b = this.e.a.b(i);
        return a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        dbyi dbyiVar;
        b();
        dbzb.c(this.c != -1);
        this.e.b -= dbyiVar.a.l(this.c);
        this.b--;
        this.c = -1;
        this.d = this.e.a.d;
    }
}
