package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbzj  reason: default package */
/* loaded from: classes.dex */
public abstract class dbzj<T> implements Iterator<T> {
    int b;
    int c;
    int d = -1;
    final /* synthetic */ dbzn e;

    public dbzj(dbzn dbznVar) {
        this.e = dbznVar;
        this.b = dbznVar.f;
        this.c = dbznVar.p();
    }

    private final void b() {
        if (this.e.f == this.b) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public abstract T a(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c >= 0;
    }

    @Override // java.util.Iterator
    public final T next() {
        b();
        if (hasNext()) {
            int i = this.c;
            this.d = i;
            T a = a(i);
            this.c = this.e.q(this.c);
            return a;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        b();
        dbzb.c(this.d >= 0);
        this.b += 32;
        dbzn dbznVar = this.e;
        dbznVar.remove(dbznVar.d[this.d]);
        this.c = this.e.r(this.c, this.d);
        this.d = -1;
    }
}
