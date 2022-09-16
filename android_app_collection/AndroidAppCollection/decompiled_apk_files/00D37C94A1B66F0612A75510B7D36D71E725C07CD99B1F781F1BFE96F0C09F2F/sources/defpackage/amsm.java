package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: amsm  reason: default package */
/* loaded from: classes.dex */
abstract class amsm implements Iterator, j$.util.Iterator {
    int b;
    int c;
    int d = -1;
    final /* synthetic */ amsq e;

    public amsm(amsq amsqVar) {
        this.e = amsqVar;
        this.b = amsqVar.e;
        this.c = amsqVar.a();
    }

    private final void b() {
        if (this.e.e == this.b) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public abstract Object a(int i);

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.c >= 0;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: next */
    public final Object mo416next() {
        b();
        if (hasNext()) {
            int i = this.c;
            this.d = i;
            Object a = a(i);
            this.c = this.e.b(this.c);
            return a;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        b();
        araa.u(this.d >= 0);
        this.b += 32;
        amsq amsqVar = this.e;
        amsqVar.remove(amsqVar.g(this.d));
        this.c--;
        this.d = -1;
    }
}
