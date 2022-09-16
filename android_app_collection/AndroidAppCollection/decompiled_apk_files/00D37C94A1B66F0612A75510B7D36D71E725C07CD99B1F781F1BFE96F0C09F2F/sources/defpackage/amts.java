package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: amts  reason: default package */
/* loaded from: classes.dex */
final class amts implements Iterator, j$.util.Iterator {
    final /* synthetic */ amtt a;
    private int b;
    private int c;
    private int d;
    private int e;

    public amts(amtt amttVar) {
        this.a = amttVar;
        amtu amtuVar = amttVar.b;
        this.b = amtuVar.e;
        this.c = -1;
        this.d = amtuVar.d;
        this.e = amtuVar.c;
    }

    private final void a() {
        if (this.a.b.d == this.d) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        a();
        return this.b != -2 && this.e > 0;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: next */
    public final Object mo416next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object a = this.a.a(this.b);
        int i = this.b;
        this.c = i;
        this.b = this.a.b.f[i];
        this.e--;
        return a;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        a();
        araa.u(this.c != -1);
        amtu amtuVar = this.a.b;
        int i = this.c;
        amtuVar.j(i, arey.G(amtuVar.a[i]));
        int i2 = this.b;
        amtu amtuVar2 = this.a.b;
        if (i2 == amtuVar2.c) {
            this.b = this.c;
        }
        this.c = -1;
        this.d = amtuVar2.d;
    }
}
