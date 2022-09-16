package defpackage;

import androidx.work.WorkerParameters;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: byse  reason: default package */
/* loaded from: classes4.dex */
public final class byse implements irw {
    public static final dcqe a = dcqe.c("byse");
    public final auhi b;
    public final byqh c;
    public final ckcw d;
    public final ahth e;
    public final isa f;
    public final cqat g;
    private final dehp h;

    public byse(auhi auhiVar, byqh byqhVar, ckcw ckcwVar, ahth ahthVar, isa isaVar, cqat cqatVar, dehp dehpVar) {
        this.b = auhiVar;
        this.c = byqhVar;
        this.d = ckcwVar;
        this.e = ahthVar;
        this.f = isaVar;
        this.g = cqatVar;
        this.h = dehpVar;
    }

    @Override // defpackage.irw
    public final dehn<bbx> a(final WorkerParameters workerParameters) {
        try {
            this.d.f(ckhc.TRAFFIC_TO_PLACE_SESSION_REGISTRATION_SERVICE);
            dehn<bbx> c = this.h.c(new Callable(this, workerParameters) { // from class: bysa
                private final byse a;
                private final WorkerParameters b;

                {
                    this.a = this;
                    this.b = workerParameters;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    bbx a2;
                    final byse byseVar = this.a;
                    WorkerParameters workerParameters2 = this.b;
                    try {
                        dbsg r = dcbg.b(workerParameters2.c).r(new dbsl() { // from class: bysc
                            private final String a = "TrafficToPlaceSessionScheduler";

                            @Override // defpackage.dbsl
                            public final boolean a(Object obj) {
                                return this.a.equals((String) obj);
                            }
                        });
                        if (!r.a()) {
                            return bbx.c();
                        }
                        r.b();
                        dbsk.l(false);
                        if (!byseVar.b.s(dpyv.TRAFFIC_TO_PLACE.dm)) {
                            return bbx.a();
                        }
                        if (!byseVar.c.a()) {
                            return bbx.a();
                        }
                        if (workerParameters2.b == null) {
                            bvoo.h("TrafficToPlaceSessionWorker invoked without input data", new Object[0]);
                            return bbx.c();
                        }
                        long b = byseVar.g.b();
                        if (workerParameters2.b.n("register_for_session")) {
                            long o = workerParameters2.b.o("scheduled_runtime");
                            if (o == 0) {
                                bvoo.h("TrafficToPlaceSessionWorker invoked without scheduled_runtime", new Object[0]);
                            }
                            ((ckcp) byseVar.d.a(ckht.af)).a(b - o);
                            a2 = byrw.a(byseVar.e, 10L, true, 60L, new byrv(byseVar) { // from class: bysd
                                private final byse a;

                                {
                                    this.a = byseVar;
                                }

                                @Override // defpackage.byrv
                                public final dehn a(GmmLocation gmmLocation) {
                                    return this.a.c.e();
                                }
                            }, (ckco) byseVar.d.a(ckht.aj));
                        } else {
                            a2 = bbx.a();
                        }
                        if (!a2.equals(bbx.b())) {
                            byseVar.c.d();
                        }
                        ((ckcp) byseVar.d.a(ckht.ai)).a(byseVar.g.b() - b);
                        return a2;
                    } catch (RuntimeException e) {
                        byseVar.f.b(21, e);
                        return bbx.c();
                    }
                }
            });
            c.Pk(new Runnable(this) { // from class: bysb
                private final byse a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.d.g(ckhc.TRAFFIC_TO_PLACE_SESSION_REGISTRATION_SERVICE);
                }
            }, this.h);
            return c;
        } catch (RuntimeException e) {
            this.f.b(21, e);
            return deha.a(bbx.c());
        }
    }
}
