package defpackage;

import androidx.work.WorkerParameters;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: avlv  reason: default package */
/* loaded from: classes3.dex */
public final class avlv implements irw {
    public final avki a;
    public final avlx b;
    public final Executor c;
    private final isa d;
    private final crzm<avzg> e;

    public avlv(avki avkiVar, avlx avlxVar, isa isaVar, crzm<avzg> crzmVar, Executor executor) {
        this.a = avkiVar;
        this.b = avlxVar;
        this.d = isaVar;
        this.e = crzmVar;
        this.c = executor;
    }

    @Override // defpackage.irw
    public final dehn<bbx> a(final WorkerParameters workerParameters) {
        return deha.f(new deff(this, workerParameters) { // from class: avlr
            private final avlv a;
            private final WorkerParameters b;

            {
                this.a = this;
                this.b = workerParameters;
            }

            @Override // defpackage.deff
            public final dehn a() {
                return this.a.b(this.b);
            }
        }, this.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ dehn b(WorkerParameters workerParameters) {
        try {
            dbsg r = dcbg.b(workerParameters.c).r(new dbsl() { // from class: avlt
                private final String a = "OfflineAppIndexingScheduler.TASK_TAG";

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    return this.a.equals((String) obj);
                }
            });
            if (!r.a()) {
                return deha.a(bbx.c());
            }
            r.b();
            dehn<avzg> j = this.e.j();
            dehn g = deew.g(j, new defg(this) { // from class: avlu
                private final avlv a;

                {
                    this.a = this;
                }

                @Override // defpackage.defg
                public final dehn a(Object obj) {
                    avlv avlvVar = this.a;
                    avzg avzgVar = (avzg) obj;
                    return deew.h(avlvVar.a.o(), new dbrn(avlvVar) { // from class: avls
                        private final avlv a;

                        {
                            this.a = avlvVar;
                        }

                        @Override // defpackage.dbrn
                        public final Object a(Object obj2) {
                            avlv avlvVar2 = this.a;
                            List<dltm> list = (List) obj2;
                            avlx avlxVar = avlvVar2.b;
                            delp a = avlxVar.a.a();
                            if (a != null) {
                                cpcq<Void> c = a.c("GeoShape");
                                c.s(avlxVar.b);
                                c.r(avlxVar.b);
                            }
                            for (dltm dltmVar : list) {
                                avlvVar2.b.b(dltmVar);
                            }
                            return null;
                        }
                    }, avlvVar.c);
                }
            }, this.c);
            bvqd.b(g, this.c);
            try {
                g.get(180L, TimeUnit.SECONDS);
                dehn a = deha.a(bbx.a());
                g.cancel(false);
                return a;
            } catch (InterruptedException | ExecutionException unused) {
                g.cancel(false);
                return deha.a(bbx.c());
            } catch (TimeoutException unused2) {
                j.isDone();
                g.cancel(false);
                return deha.a(bbx.c());
            }
        } catch (RuntimeException e) {
            this.d.b(13, e);
            return deha.a(bbx.c());
        }
    }
}
