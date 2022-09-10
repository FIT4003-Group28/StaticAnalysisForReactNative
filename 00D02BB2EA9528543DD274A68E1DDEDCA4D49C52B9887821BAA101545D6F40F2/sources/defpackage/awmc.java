package defpackage;

import androidx.work.WorkerParameters;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: awmc  reason: default package */
/* loaded from: classes3.dex */
public final class awmc implements irw {
    public final ckcw a;
    public final gdo b;
    public final awlu c;
    public final isa d;
    private final dehp e;
    private final Executor f;

    public awmc(ckcw ckcwVar, gdo gdoVar, awlu awluVar, isa isaVar, dehp dehpVar, Executor executor) {
        this.a = ckcwVar;
        this.b = gdoVar;
        this.c = awluVar;
        this.d = isaVar;
        this.e = dehpVar;
        this.f = executor;
    }

    @Override // defpackage.irw
    public final dehn<bbx> a(final WorkerParameters workerParameters) {
        try {
            this.a.f(ckhc.OFFLINE_SERVICE);
            this.b.b();
            dehn<bbx> c = this.e.c(new Callable(this, workerParameters) { // from class: awly
                private final awmc a;
                private final WorkerParameters b;

                {
                    this.a = this;
                    this.b = workerParameters;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    dlrl dlrlVar;
                    awmc awmcVar = this.a;
                    WorkerParameters workerParameters2 = this.b;
                    try {
                        dbsg r = dcbg.b(workerParameters2.c).r(new dbsl() { // from class: awmb
                            private final String a = "timeout";

                            @Override // defpackage.dbsl
                            public final boolean a(Object obj) {
                                return this.a.equals((String) obj);
                            }
                        });
                        if (!r.a()) {
                            return bbx.c();
                        }
                        r.b();
                        try {
                            dlrlVar = (dlrl) dsqw.cr(dlrl.d, workerParameters2.b.a("instance_id"), dsqa.b());
                        } catch (dsrm e) {
                            bvoo.j(e);
                            dlrlVar = dlrl.d;
                        }
                        awlu awluVar = awmcVar.c;
                        awluVar.d.a().m(dpyv.OFFLINE_DOWNLOAD.dm);
                        ((ckcn) awluVar.c.a(ckia.A)).a();
                        avpt<dlrl> avptVar = awluVar.a;
                        for (aveu aveuVar : avptVar.a.keySet()) {
                            avptVar.b.execute(new Runnable(aveuVar, dlrlVar) { // from class: avps
                                private final Object a;
                                private final aveu b;

                                {
                                    this.b = aveuVar;
                                    this.a = dlrlVar;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    aveu aveuVar2 = this.b;
                                    Object obj = this.a;
                                    avel c2 = aveuVar2.a.M().c();
                                    dsqw dsqwVar = (dsqw) obj;
                                    if ((dsqwVar.equals(c2.a().g()) || dsqwVar.equals(dlrl.d)) && !c2.k()) {
                                        c2.g.Pk(new Runnable(c2) { // from class: aveh
                                            private final avel a;

                                            {
                                                this.a = c2;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                this.a.e.a().b();
                                            }
                                        }, c2.i);
                                    }
                                }
                            });
                        }
                        return bbx.a();
                    } catch (RuntimeException e2) {
                        awmcVar.d.b(17, e2);
                        return bbx.c();
                    }
                }
            });
            c.Pk(new Runnable(this) { // from class: awlz
                private final awmc a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.g(ckhc.OFFLINE_SERVICE);
                }
            }, this.e);
            c.Pk(new Runnable(this) { // from class: awma
                private final awmc a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b.e();
                }
            }, this.f);
            return c;
        } catch (RuntimeException e) {
            this.d.b(17, e);
            return deha.a(bbx.c());
        }
    }
}
