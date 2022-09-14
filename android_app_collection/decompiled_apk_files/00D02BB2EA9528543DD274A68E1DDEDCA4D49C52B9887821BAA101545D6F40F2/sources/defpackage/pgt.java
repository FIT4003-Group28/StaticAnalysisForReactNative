package defpackage;

import androidx.work.WorkerParameters;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: pgt  reason: default package */
/* loaded from: classes7.dex */
public final class pgt implements irw {
    public static final /* synthetic */ int a = 0;
    private static final dcep<dsyl> b = dcnm.a(dsyl.GELLER_CONFIG, dsyl.MAPS_SEARCH_CLICK);
    private final btvo c;
    private final isa d;
    private final dxio<pgl> e;
    private final Executor f;

    public pgt(btvo btvoVar, isa isaVar, dxio<pgl> dxioVar, Executor executor) {
        this.c = btvoVar;
        this.d = isaVar;
        this.e = dxioVar;
        this.f = executor;
    }

    @Override // defpackage.irw
    public final dehn<bbx> a(WorkerParameters workerParameters) {
        dcdc f;
        try {
            dbsg r = dcbg.b(workerParameters.c).r(pgr.a);
            if (!r.a()) {
                return deha.a(bbx.c());
            }
            r.b();
            try {
                dsqa b2 = dsqa.b();
                pgw pgwVar = (pgw) dsqw.cr(pgw.e, (byte[]) dbsk.s(workerParameters.b.a("GellerSyncWorkerParams")), b2);
                dcep<dsyl> K = dcep.K(new dsrh(pgwVar.b, pgw.c));
                if (K.isEmpty()) {
                    r.b();
                    return deha.a(bbx.c());
                }
                int a2 = dsyu.a(pgwVar.d);
                if (a2 == 0) {
                    a2 = 1;
                }
                if (this.c.getGellerParameters().h) {
                    dcen N = dcep.N();
                    dcen N2 = dcep.N();
                    dccx F = dcdc.F();
                    dcpd<dsyl> it = K.iterator();
                    while (it.hasNext()) {
                        dsyl next = it.next();
                        if (b.contains(next)) {
                            N.b(next);
                        } else {
                            N2.b(next);
                        }
                    }
                    F.g(this.e.a().a(N.f(), a2));
                    F.g(this.e.a().a(N2.f(), a2));
                    f = F.f();
                } else {
                    f = dcdc.f(this.e.a().a(K, a2));
                }
                return deew.h(deha.j(f), pgs.a, this.f);
            } catch (dsrm | NullPointerException unused) {
                r.b();
                return deha.a(bbx.c());
            }
        } catch (RuntimeException e) {
            this.d.b(7, e);
            return deha.a(bbx.c());
        }
    }
}
