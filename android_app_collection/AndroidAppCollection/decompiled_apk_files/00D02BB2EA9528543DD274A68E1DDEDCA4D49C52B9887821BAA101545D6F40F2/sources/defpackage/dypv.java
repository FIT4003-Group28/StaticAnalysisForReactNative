package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dypv  reason: default package */
/* loaded from: classes6.dex */
final class dypv implements Runnable {
    final /* synthetic */ dyjb a;
    final /* synthetic */ dypx b;

    public dypv(dypx dypxVar, dyjb dyjbVar) {
        this.b = dypxVar;
        this.a = dyjbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.c.p.a == dyfk.SHUTDOWN) {
            return;
        }
        dysm dysmVar = this.b.c.o;
        dypx dypxVar = this.b;
        dymc dymcVar = dypxVar.a;
        if (dysmVar == dymcVar) {
            dypxVar.c.o = null;
            this.b.c.f.a();
            this.b.c.c(dyfk.IDLE);
            return;
        }
        dypz dypzVar = dypxVar.c;
        if (dypzVar.n != dymcVar) {
            return;
        }
        boolean z = false;
        dbsk.p(dypzVar.p.a == dyfk.CONNECTING, "Expected state is CONNECTING, actual state is %s", this.b.c.p.a);
        dypt dyptVar = this.b.c.f;
        int i = dyptVar.c + 1;
        dyptVar.c = i;
        if (i >= dyptVar.a.get(dyptVar.b).b.size()) {
            dyptVar.b++;
            dyptVar.c = 0;
        }
        dypt dyptVar2 = this.b.c.f;
        if (dyptVar2.b >= dyptVar2.a.size()) {
            this.b.c.n = null;
            this.b.c.f.a();
            dypz dypzVar2 = this.b.c;
            dyjb dyjbVar = this.a;
            dypzVar2.e.c();
            dbsk.b(!dyjbVar.i(), "The error status must not be OK");
            dypzVar2.d(new dyfl(dyfk.TRANSIENT_FAILURE, dyjbVar));
            if (dypzVar2.r == null) {
                dypzVar2.r = dyof.a();
            }
            long a = dypzVar2.r.a() - dypzVar2.h.d(TimeUnit.NANOSECONDS);
            dypzVar2.d.b(2, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", dypz.j(dyjbVar), Long.valueOf(a));
            if (dypzVar2.i == null) {
                z = true;
            }
            dbsk.m(z, "previous reconnectTask is not done");
            dypzVar2.i = dypzVar2.e.d(new dyph(dypzVar2), a, TimeUnit.NANOSECONDS, dypzVar2.b);
            return;
        }
        this.b.c.b();
    }
}
