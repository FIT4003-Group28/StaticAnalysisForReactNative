package defpackage;

import io.grpc.Status;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: aybc  reason: default package */
/* loaded from: classes2.dex */
public final class aybc {
    public final ayiv a;
    public final aybg b;
    public final /* synthetic */ ayji c;

    public aybc() {
    }

    public final void a(Status status) {
        ayji.a.logp(Level.WARNING, "io.grpc.internal.ManagedChannelImpl$NameResolverListener", "handleErrorInSyncContext", "[{0}] Failed to resolve name. status={1}", new Object[]{this.c.i, status});
        ayje ayjeVar = this.c.I;
        if (ayjeVar.a.get() == ayji.g) {
            ayjeVar.d(null);
        }
        ayji ayjiVar = this.c;
        if (ayjiVar.S != 3) {
            ayjiVar.G.b(3, "Failed to resolve name: {0}", status);
            this.c.S = 3;
        }
        ayiv ayivVar = this.a;
        if (ayivVar != this.c.s) {
            return;
        }
        ayivVar.a.b.a(status);
        ayji ayjiVar2 = this.c;
        aybw aybwVar = ayjiVar2.R;
        if (aybwVar != null) {
            aybv aybvVar = aybwVar.a;
            if (!aybvVar.c && !aybvVar.b) {
                return;
            }
        }
        if (ayjiVar2.T == null) {
            ayjiVar2.T = bapv.k();
        }
        long a = this.c.T.a();
        this.c.G.b(1, "Scheduling DNS resolution backoff for {0} ns", Long.valueOf(a));
        ayji ayjiVar3 = this.c;
        ayjiVar3.R = ayjiVar3.o.a(new ayii(ayjiVar3, 3), a, TimeUnit.NANOSECONDS, this.c.j.b());
    }

    public final void b(Status status) {
        aqxo.q(!status.f(), "the error status must not be OK");
        this.c.o.execute(new ayiw(this, status));
    }

    public final void c(aybe aybeVar) {
        this.c.o.execute(new ayix(this, aybeVar));
    }

    public aybc(ayji ayjiVar, ayiv ayivVar, aybg aybgVar) {
        this.c = ayjiVar;
        this.a = ayivVar;
        aybgVar.getClass();
        this.b = aybgVar;
    }
}
