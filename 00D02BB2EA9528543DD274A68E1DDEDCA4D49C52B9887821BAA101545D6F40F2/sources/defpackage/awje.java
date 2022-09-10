package defpackage;

import androidx.work.WorkerParameters;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: awje  reason: default package */
/* loaded from: classes3.dex */
public final class awje implements irw {
    public final dxio<awjz> a;
    public final dxio<ckcw> b;
    public final dxio<awfh> c;
    public final dxio<btpc> d;
    public final dxio<isa> e;
    public final awlm f;
    private final gdo g;
    private final dehp h;
    private final Executor i;

    public awje(dxio<awjz> dxioVar, dxio<ckcw> dxioVar2, gdo gdoVar, dxio<awfh> dxioVar3, dxio<btpc> dxioVar4, dxio<isa> dxioVar5, awlm awlmVar, dehp dehpVar, Executor executor) {
        this.a = dxioVar;
        this.b = dxioVar2;
        this.g = gdoVar;
        this.c = dxioVar3;
        this.d = dxioVar4;
        this.e = dxioVar5;
        this.f = awlmVar;
        this.h = dehpVar;
        this.i = executor;
    }

    @Override // defpackage.irw
    public final dehn<bbx> a(final WorkerParameters workerParameters) {
        try {
            this.b.a().f(ckhc.OFFLINE_SERVICE);
            this.g.b();
            dehn<bbx> c = this.h.c(new Callable(this, workerParameters) { // from class: awiz
                private final awje a;
                private final WorkerParameters b;

                {
                    this.a = this;
                    this.b = workerParameters;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    awje awjeVar = this.a;
                    WorkerParameters workerParameters2 = this.b;
                    try {
                        dbsg r = dcbg.b(workerParameters2.c).r(new dbsl() { // from class: awjc
                            private final String a = "default-tag";

                            @Override // defpackage.dbsl
                            public final boolean a(Object obj) {
                                return this.a.equals((String) obj);
                            }
                        });
                        if (!r.a()) {
                            r = dcbg.b(workerParameters2.c).r(new dbsl() { // from class: awjd
                                private final String a = "immediate-maint";

                                @Override // defpackage.dbsl
                                public final boolean a(Object obj) {
                                    return this.a.equals((String) obj);
                                }
                            });
                        }
                        if (!r.a()) {
                            return bbx.c();
                        }
                        awfh a = awjeVar.c.a();
                        if (a.d()) {
                            if (awjeVar.d.a().a()) {
                                awjeVar.f.d();
                            }
                            awjeVar.a.a().j(a.f());
                        }
                        return bbx.a();
                    } catch (RuntimeException e) {
                        awjeVar.e.a().b(14, e);
                        return bbx.c();
                    }
                }
            });
            c.Pk(new Runnable(this) { // from class: awja
                private final awje a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b.a().g(ckhc.OFFLINE_SERVICE);
                }
            }, this.h);
            final gdo gdoVar = this.g;
            gdoVar.getClass();
            c.Pk(new Runnable(gdoVar) { // from class: awjb
                private final gdo a;

                {
                    this.a = gdoVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.e();
                }
            }, this.i);
            return c;
        } catch (RuntimeException e) {
            this.e.a().b(14, e);
            return deha.a(bbx.c());
        }
    }
}
