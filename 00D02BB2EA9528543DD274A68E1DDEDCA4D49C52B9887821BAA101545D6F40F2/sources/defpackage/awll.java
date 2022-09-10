package defpackage;

import androidx.work.WorkerParameters;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
/* compiled from: PG */
/* renamed from: awll  reason: default package */
/* loaded from: classes3.dex */
public final class awll implements irw {
    public final awkw a;
    public final crzm<avkc> b;
    public final bvjj c;
    public final isa d;
    public final ExecutorService e;
    private final Executor f;

    public awll(awkw awkwVar, crzm<avkc> crzmVar, bvjj bvjjVar, isa isaVar, ExecutorService executorService, Executor executor) {
        this.a = awkwVar;
        this.b = crzmVar;
        this.c = bvjjVar;
        this.d = isaVar;
        this.e = executorService;
        this.f = executor;
    }

    @Override // defpackage.irw
    public final dehn<bbx> a(final WorkerParameters workerParameters) {
        return deha.f(new deff(this, workerParameters) { // from class: awli
            private final awll a;
            private final WorkerParameters b;

            {
                this.a = this;
                this.b = workerParameters;
            }

            @Override // defpackage.deff
            public final dehn a() {
                final awll awllVar = this.a;
                WorkerParameters workerParameters2 = this.b;
                try {
                    dbsg r = dcbg.b(workerParameters2.c).r(new dbsl() { // from class: awlj
                        private final String a = "OfflineManualDownloadRescheduleTask";

                        @Override // defpackage.dbsl
                        public final boolean a(Object obj) {
                            return this.a.equals((String) obj);
                        }
                    });
                    if (!r.a()) {
                        return deha.a(bbx.c());
                    }
                    r.b();
                    bbp bbpVar = workerParameters2.b;
                    final boolean z = false;
                    final boolean z2 = bbpVar != null && bbpVar.n("downloadQueued");
                    final String c = bbpVar == null ? null : bbpVar.c("accountId");
                    avkc l = awllVar.b.l();
                    dbsk.s(l);
                    if (z2) {
                        if (l.d() != 1) {
                            return deha.a(bbx.b());
                        }
                    } else if (!awllVar.c.i(bvjk.eA)) {
                        return deha.a(bbx.c());
                    } else {
                        if (l.d() != 1) {
                            return deha.a(bbx.b());
                        }
                        z = awllVar.c.m(bvjk.eA, false);
                        if (l.c() == 1 || z) {
                            awllVar.c.P(bvjk.eA);
                        } else {
                            return deha.a(bbx.b());
                        }
                    }
                    deha.s(awllVar.e.submit(new Runnable(awllVar, z2, c, z) { // from class: awlk
                        private final awll a;
                        private final boolean b;
                        private final String c;
                        private final boolean d;

                        {
                            this.a = awllVar;
                            this.b = z2;
                            this.c = c;
                            this.d = z;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            awll awllVar2 = this.a;
                            boolean z3 = this.b;
                            String str = this.c;
                            boolean z4 = this.d;
                            if (z3) {
                                awllVar2.a.a(str, z4, null);
                            } else {
                                awllVar2.a.b(z4);
                            }
                        }
                    }));
                    return deha.a(bbx.a());
                } catch (RuntimeException e) {
                    awllVar.d.b(16, e);
                    return deha.a(bbx.c());
                }
            }
        }, this.f);
    }
}
