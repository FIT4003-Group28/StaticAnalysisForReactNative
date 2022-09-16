package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dyuj  reason: default package */
/* loaded from: classes6.dex */
final class dyuj implements Runnable {
    final /* synthetic */ dyuk a;

    public dyuj(dyuk dyukVar) {
        this.a = dyukVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        dyui dyuiVar;
        dyus dyusVar;
        dyut dyutVar = this.a.b;
        dyur t = dyutVar.t(dyutVar.t.e);
        synchronized (this.a.b.n) {
            dyuk dyukVar = this.a;
            z = false;
            dyuiVar = null;
            if (dyukVar.a.c) {
                z = true;
            } else {
                dyut dyutVar2 = dyukVar.b;
                dyutVar2.t = dyutVar2.t.b(t);
                dyut dyutVar3 = this.a.b;
                if (!dyutVar3.w(dyutVar3.t) || ((dyusVar = this.a.b.r) != null && !dyusVar.a())) {
                    dyut dyutVar4 = this.a.b;
                    dyutVar4.t = dyutVar4.t.a();
                    this.a.b.y = null;
                } else {
                    dyut dyutVar5 = this.a.b;
                    dyuiVar = new dyui(dyutVar5.n);
                    dyutVar5.y = dyuiVar;
                }
            }
        }
        if (z) {
            t.a.e(dyjb.c.g("Unneeded hedging"));
            return;
        }
        if (dyuiVar != null) {
            dyut dyutVar6 = this.a.b;
            dyuiVar.a(dyutVar6.j.schedule(new dyuk(dyutVar6, dyuiVar), this.a.b.l.b, TimeUnit.NANOSECONDS));
        }
        this.a.b.u(t);
    }
}
