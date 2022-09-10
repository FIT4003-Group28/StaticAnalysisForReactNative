package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dcgu  reason: default package */
/* loaded from: classes5.dex */
final class dcgu implements Iterator {
    final Set a;
    dcgw b;
    dcgw c;
    int d;
    final /* synthetic */ dcgz e;

    public dcgu(dcgz dcgzVar) {
        this.e = dcgzVar;
        this.a = dcnm.f(dcgzVar.J().size());
        this.b = dcgzVar.a;
        this.d = dcgzVar.e;
    }

    private final void a() {
        if (this.e.e == this.d) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        dcgw<K, V> dcgwVar;
        a();
        dcgz.i(this.b);
        dcgw dcgwVar2 = this.b;
        this.c = dcgwVar2;
        this.a.add(dcgwVar2.a);
        do {
            dcgwVar = this.b.c;
            this.b = dcgwVar;
            if (dcgwVar == 0) {
                break;
            }
        } while (!this.a.add(dcgwVar.a));
        return this.c.a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        dbzb.c(this.c != null);
        this.e.h(this.c.a);
        this.c = null;
        this.d = this.e.e;
    }
}
