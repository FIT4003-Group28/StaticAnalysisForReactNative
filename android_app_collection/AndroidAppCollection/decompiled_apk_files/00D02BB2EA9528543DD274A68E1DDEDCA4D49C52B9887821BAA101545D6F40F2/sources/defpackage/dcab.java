package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: dcab  reason: default package */
/* loaded from: classes5.dex */
final class dcab extends dcbj<dcla> {
    final /* synthetic */ Iterator a;
    final /* synthetic */ dcae b;
    private dcla c;

    public dcab(dcae dcaeVar, Iterator it) {
        this.b = dcaeVar;
        this.a = it;
    }

    @Override // defpackage.dcbj, defpackage.dcbq
    protected final /* bridge */ /* synthetic */ Object SC() {
        return this.a;
    }

    @Override // defpackage.dcbj
    protected final Iterator<dcla> a() {
        return this.a;
    }

    @Override // defpackage.dcbj, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        dcla dclaVar = (dcla) super.next();
        this.c = dclaVar;
        return dclaVar;
    }

    @Override // defpackage.dcbj, java.util.Iterator
    public final void remove() {
        dbzb.c(this.c != null);
        dcae dcaeVar = this.b;
        Object a = this.c.a();
        dbsk.s(a);
        dbzb.d(0, "count");
        AtomicInteger atomicInteger = (AtomicInteger) dcjz.A(dcaeVar.a, a);
        if (atomicInteger != null) {
            while (true) {
                int i = atomicInteger.get();
                if (i == 0) {
                    break;
                } else if (atomicInteger.compareAndSet(i, 0)) {
                    dcaeVar.a.remove(a, atomicInteger);
                    break;
                }
            }
        }
        this.c = null;
    }
}
