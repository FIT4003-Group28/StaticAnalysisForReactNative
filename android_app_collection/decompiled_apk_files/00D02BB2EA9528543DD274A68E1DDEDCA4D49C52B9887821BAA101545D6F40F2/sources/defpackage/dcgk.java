package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dcgk  reason: default package */
/* loaded from: classes5.dex */
final class dcgk implements Iterator {
    dcgm a;
    dcgj b;
    int c;
    final /* synthetic */ dcgl d;

    public dcgk(dcgl dcglVar) {
        this.d = dcglVar;
        this.a = dcglVar.c;
        this.c = dcglVar.b;
    }

    private final void a() {
        if (this.d.b == this.c) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.a != this.d;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        dcgj dcgjVar = (dcgj) this.a;
        V v = dcgjVar.b;
        this.b = dcgjVar;
        this.a = dcgjVar.f;
        return v;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        dbzb.c(this.b != null);
        this.d.remove(this.b.b);
        this.c = this.d.b;
        this.b = null;
    }
}
