package defpackage;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aijh  reason: default package */
/* loaded from: classes2.dex */
final class aijh implements Runnable {
    final /* synthetic */ aijp a;

    public aijh(aijp aijpVar) {
        this.a = aijpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (btlu btluVar : this.a.q.keySet()) {
            aijp aijpVar = this.a;
            Iterator<aikc> it = aijpVar.B(btluVar).a.values().iterator();
            boolean z = false;
            while (it.hasNext()) {
                aikc next = it.next();
                ahwl g = next.g();
                if (g.B() && !g.D() && g.E(aijpVar.h.b()) <= 0) {
                    if (g.C()) {
                        it.remove();
                    } else {
                        next.b(dcdc.e());
                    }
                    z = true;
                }
            }
            if (z) {
                aijpVar.A();
            }
        }
        aijp aijpVar2 = this.a;
        bvqd.a(aijpVar2.j.d(aijpVar2.n, aijp.c, TimeUnit.MILLISECONDS), this.a.k);
    }
}
