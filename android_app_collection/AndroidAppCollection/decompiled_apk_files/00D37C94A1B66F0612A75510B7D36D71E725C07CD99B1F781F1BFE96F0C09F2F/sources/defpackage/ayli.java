package defpackage;

import io.grpc.Status;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ayli  reason: default package */
/* loaded from: classes2.dex */
final class ayli implements Runnable {
    final /* synthetic */ aylj a;

    public ayli(aylj ayljVar) {
        this.a = ayljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aylh aylhVar;
        aylu ayluVar;
        aylv aylvVar = this.a.b;
        boolean z = false;
        aylt p = aylvVar.p(aylvVar.r.e, false);
        synchronized (this.a.b.l) {
            aylj ayljVar = this.a;
            aylhVar = null;
            if (ayljVar.a.c) {
                z = true;
            } else {
                aylv aylvVar2 = ayljVar.b;
                aylvVar2.r = aylvVar2.r.a(p);
                aylv aylvVar3 = this.a.b;
                if (!aylvVar3.v(aylvVar3.r) || ((ayluVar = this.a.b.p) != null && !ayluVar.a())) {
                    aylv aylvVar4 = this.a.b;
                    aylvVar4.r = aylvVar4.r.b();
                    this.a.b.w = null;
                } else {
                    aylv aylvVar5 = this.a.b;
                    aylhVar = new aylh(aylvVar5.l);
                    aylvVar5.w = aylhVar;
                }
            }
        }
        if (z) {
            p.a.c(Status.c.withDescription("Unneeded hedging"));
            return;
        }
        if (aylhVar != null) {
            aylv aylvVar6 = this.a.b;
            aylhVar.b(aylvVar6.h.schedule(new aylj(aylvVar6, aylhVar), this.a.b.j.b, TimeUnit.NANOSECONDS));
        }
        this.a.b.t(p);
    }
}
