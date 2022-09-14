package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dccd  reason: default package */
/* loaded from: classes5.dex */
final class dccd implements Iterator {
    final /* synthetic */ dcce a;
    private int b;
    private int c;
    private int d;
    private int e;

    public dccd(dcce dcceVar) {
        this.a = dcceVar;
        dccf<K, V> dccfVar = dcceVar.b;
        this.b = dccfVar.e;
        this.c = -1;
        this.d = dccfVar.d;
        this.e = dccfVar.c;
    }

    private final void a() {
        if (this.a.b.d == this.d) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.b != -2 && this.e > 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
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

    @Override // java.util.Iterator
    public final void remove() {
        a();
        dbzb.c(this.c != -1);
        dccf<K, V> dccfVar = this.a.b;
        int i = this.c;
        dccfVar.g(i, dccj.b(dccfVar.a[i]));
        int i2 = this.b;
        dccf<K, V> dccfVar2 = this.a.b;
        if (i2 == dccfVar2.c) {
            this.b = this.c;
        }
        this.c = -1;
        this.d = dccfVar2.d;
    }
}
