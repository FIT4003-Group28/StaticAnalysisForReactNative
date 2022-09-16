package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dyrg  reason: default package */
/* loaded from: classes6.dex */
public final class dyrg extends dyig {
    final dyrd a;
    final dyik b;
    final /* synthetic */ dyrz c;

    public dyrg(dyrz dyrzVar, dyrd dyrdVar, dyik dyikVar) {
        this.c = dyrzVar;
        this.a = dyrdVar;
        dbsk.t(dyikVar, "resolver");
        this.b = dyikVar;
    }

    @Override // defpackage.dyig
    public final void a(dyii dyiiVar) {
        this.c.m.execute(new dyrf(this, dyiiVar));
    }

    @Override // defpackage.dyig
    public final void b(dyjb dyjbVar) {
        dbsk.b(!dyjbVar.i(), "the error status must not be OK");
        this.c.m.execute(new dyre(this, dyjbVar));
    }

    public final void c(dyjb dyjbVar) {
        dyrz.a.logp(Level.WARNING, "io.grpc.internal.ManagedChannelImpl$NameResolverListener", "handleErrorInSyncContext", "[{0}] Failed to resolve name. status={1}", new Object[]{this.c.h, dyjbVar});
        dyrp dyrpVar = this.c.I;
        if (dyrpVar.a.get() == dyrz.g) {
            dyrpVar.c(null);
        }
        dyrz dyrzVar = this.c;
        if (dyrzVar.U != 3) {
            dyrzVar.G.b(3, "Failed to resolve name: {0}", dyjbVar);
            this.c.U = 3;
        }
        dyrd dyrdVar = this.a;
        if (dyrdVar != this.c.s) {
            return;
        }
        dyrdVar.a.b.b(dyjbVar);
        dyrz dyrzVar2 = this.c;
        dyjh dyjhVar = dyrzVar2.S;
        if (dyjhVar != null) {
            dyjg dyjgVar = dyjhVar.a;
            if (!dyjgVar.c && !dyjgVar.b) {
                return;
            }
        }
        if (dyrzVar2.W == null) {
            dyrzVar2.W = dyof.a();
        }
        long a = this.c.W.a();
        this.c.G.b(1, "Scheduling DNS resolution backoff for {0} ns", Long.valueOf(a));
        dyrz dyrzVar3 = this.c;
        dyrzVar3.S = dyrzVar3.m.d(new dyqx(dyrzVar3), a, TimeUnit.NANOSECONDS, this.c.i.b());
    }
}
