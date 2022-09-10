package defpackage;

import android.os.Bundle;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ddr  reason: default package */
/* loaded from: classes6.dex */
public final class ddr implements czl<Void> {
    public final gga a;
    public final ScheduledExecutorService b;
    public final czj c;
    public final czkm<ddx> d;
    public final Executor e;
    public final akox f;
    public final dxio<araj> g;
    public final btrm h;
    public final jlp i;
    public final cpv j;
    public final dbty<Boolean> m;
    private final dbsg<czc> r;
    @dzsi
    private czu t;
    public boolean k = false;
    public final Object l = new Object();
    @dzsi
    public jmb q = null;
    private final e s = new e() { // from class: com.google.android.apps.gmm.ar.calibrator.ArCalibratorLauncherImpl$FeatureCallbacksImpl$1
        @Override // defpackage.f
        public final void a(m mVar) {
        }

        @Override // defpackage.f
        public final void b(m mVar) {
        }

        @Override // defpackage.f
        public final void c(m mVar) {
        }

        @Override // defpackage.f
        public final void d(m mVar) {
        }

        @Override // defpackage.f
        public final void e(m mVar) {
            dspt dsptVar = dds.a;
            ddr.this.i();
            ddr.this.j();
            ddr.this.h();
        }

        @Override // defpackage.f
        public final void f(m mVar) {
        }
    };
    @dzsi
    public czv n = null;
    @dzsi
    private volatile ScheduledFuture<?> u = null;
    @dzsi
    public volatile ScheduledFuture<?> o = null;
    @dzsi
    private volatile ScheduledFuture<?> v = null;
    public boolean p = false;

    public ddr(gga ggaVar, ddu dduVar, final dbsg<czw> dbsgVar, dehq dehqVar, czj czjVar, czkm<ddx> czkmVar, Executor executor, akox akoxVar, dxio<araj> dxioVar, btrm btrmVar, jlp jlpVar, cpv cpvVar) {
        this.a = ggaVar;
        this.r = dduVar.a;
        this.b = dehqVar;
        this.c = czjVar;
        this.d = czkmVar;
        this.e = executor;
        this.f = akoxVar;
        this.g = dxioVar;
        this.h = btrmVar;
        this.i = jlpVar;
        this.j = cpvVar;
        this.m = new dbty(dbsgVar) { // from class: ddc
            private final dbsg a;

            {
                this.a = dbsgVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return Boolean.valueOf(((czw) ((dbsu) this.a).a).a().e);
            }
        };
    }

    @Override // defpackage.czl
    public final void f() {
        dds.f(this.d, this.e, ddi.a);
    }

    @Override // defpackage.czl
    public final dehn<Map<String, String>> g() {
        return deew.h(this.d.b(), ddj.a, this.e);
    }

    public final void h() {
        this.a.g().h(dcu.a, 1);
    }

    public final void i() {
        synchronized (this.l) {
            czv czvVar = this.n;
            if (czvVar != null) {
                czvVar.b().g();
                this.o = null;
            }
        }
    }

    public final void j() {
        o oVar;
        if (this.p) {
            this.g.a().m().h(amwd.OFF);
        }
        synchronized (this.l) {
            czv czvVar = this.n;
            if (czvVar != null) {
                czu czuVar = this.t;
                if (czuVar != null) {
                    czvVar.e(czuVar);
                }
                this.n.c();
                this.n = null;
            }
            if (this.u != null) {
                this.u.cancel(false);
                this.u = null;
            }
            k();
            gga ggaVar = this.a;
            if (ggaVar != null && (oVar = ggaVar.g) != null) {
                oVar.b(this.s);
            }
        }
    }

    public final void k() {
        jmb jmbVar = this.q;
        if (jmbVar != null) {
            jmbVar.a();
            this.q = null;
        }
    }

    @Override // defpackage.czl
    public final dehn<Boolean> l() {
        return deha.a(true);
    }

    @Override // defpackage.czl
    public final void m() {
        if (!this.a.aZ) {
            i();
            j();
            return;
        }
        h();
        if (this.k) {
            btrm btrmVar = this.h;
            dceq a = dcet.a();
            a.b(bvkb.class, new ddt(bvkb.class, this, bvrj.UI_THREAD));
            btrmVar.g(this, a.a());
            synchronized (this.l) {
                this.u = this.b.schedule(new Runnable(this) { // from class: ddg
                    private final ddr a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.j();
                    }
                }, 30L, TimeUnit.SECONDS);
            }
        } else {
            j();
        }
        final boolean z = this.r.b() instanceof dap;
        final String b = this.r.b().b().b();
        this.v = this.b.schedule(new Runnable(this, z, b) { // from class: ddh
            private final ddr a;
            private final boolean b;
            private final String c;

            {
                this.a = this;
                this.b = z;
                this.c = b;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ddr ddrVar = this.a;
                boolean z2 = this.b;
                String str = this.c;
                if (!ddrVar.a.aZ) {
                    return;
                }
                ddrVar.k();
                ddrVar.c.b(czh.CALIBRATOR, z2, str, new ddo(ddrVar));
            }
        }, 5L, TimeUnit.SECONDS);
        i();
    }

    @Override // defpackage.czl
    public final /* bridge */ /* synthetic */ void n(Bundle bundle, Void r2) {
    }

    @Override // defpackage.czl
    public final /* bridge */ /* synthetic */ Void o(Bundle bundle) {
        return null;
    }

    @Override // defpackage.czl
    public final /* bridge */ /* synthetic */ void p(Void r5) {
        synchronized (this.l) {
            if (this.n == null) {
                this.n = this.r.b().b().a(czh.CALIBRATOR, czs.INERTIAL_FOREGROUND);
                czu czuVar = new czu(this) { // from class: dde
                    private final ddr a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.czu
                    public final void a(Throwable th) {
                        ddr ddrVar = this.a;
                        bvoo.j(th);
                        ddrVar.m();
                    }
                };
                this.t = czuVar;
                this.n.d(czuVar);
                this.a.g.a(this.s);
                czv czvVar = this.n;
                dbsk.s(czvVar);
                czvVar.b().e(new dfeq(this) { // from class: ddf
                    private final ddr a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.dfeq
                    public final void n(Object obj) {
                        dfgu dfguVar;
                        final ddr ddrVar = this.a;
                        dfgv dfgvVar = (dfgv) obj;
                        if (dfgvVar != null) {
                            dfguVar = dfgu.b(dfgvVar.b);
                            if (dfguVar == null) {
                                dfguVar = dfgu.NONE;
                            }
                        } else {
                            dfguVar = dfgu.NONE;
                        }
                        if (dfguVar == dfgu.LOCALIZED && ddrVar.o == null) {
                            ddrVar.o = ddrVar.b.schedule(new Runnable(ddrVar) { // from class: ddk
                                private final ddr a;

                                {
                                    this.a = ddrVar;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    ddr ddrVar2 = this.a;
                                    ddrVar2.k = true;
                                    ddrVar2.m();
                                }
                            }, 1L, TimeUnit.SECONDS);
                        }
                    }
                });
            } else if (this.u != null) {
                this.u.cancel(false);
                this.u = null;
                if (this.v != null) {
                    this.v.cancel(false);
                    this.v = null;
                }
            }
        }
        this.k = false;
        this.a.D(new dcu());
    }
}
