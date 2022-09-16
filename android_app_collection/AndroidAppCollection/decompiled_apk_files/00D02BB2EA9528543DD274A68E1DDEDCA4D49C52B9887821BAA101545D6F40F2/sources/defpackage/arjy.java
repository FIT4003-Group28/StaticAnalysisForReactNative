package defpackage;

import android.os.Bundle;
import android.util.Base64;
import com.google.android.apps.gmm.ar.api.ArLauncherParams;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: arjy  reason: default package */
/* loaded from: classes2.dex */
public final class arjy implements arkd, czl {
    public final gga a;
    public final gfq b;
    public final arlg c;
    public final cjqy d;
    public final dbsg<diw> e;
    public final atbs f;
    private final arla g;
    private final arkb h;
    private final dbsg<czc> i;
    private final dehq j;
    private final dxio<dbsg<czo>> k;
    private final ascb l;
    private final btvo m;
    private final arlk n;
    private final bvjj o;

    public arjy(gga ggaVar, arla arlaVar, arkb arkbVar, arkc arkcVar, dehq dehqVar, gfq gfqVar, arlg arlgVar, dxio dxioVar, ascb ascbVar, btvo btvoVar, arlk arlkVar, cjqy cjqyVar, bvjj bvjjVar, atbs atbsVar, dix dixVar) {
        this.a = ggaVar;
        this.g = arlaVar;
        this.h = arkbVar;
        dbsg<czc> dbsgVar = arkcVar.a;
        this.i = dbsgVar;
        this.j = dehqVar;
        this.b = gfqVar;
        this.c = arlgVar;
        this.k = dxioVar;
        this.l = ascbVar;
        this.m = btvoVar;
        this.n = arlkVar;
        this.d = cjqyVar;
        this.o = bvjjVar;
        this.f = atbsVar;
        dhlz dhlzVar = btvoVar.getNavigationParametersProto().aJ;
        int i = (dhlzVar == null ? dhlz.n : dhlzVar).i;
        this.e = i <= 0 ? dbpy.a : dbsg.i(dixVar.a(dbsgVar, czh.WALKING_NAVIGATION, i));
    }

    private final void h() {
        for (fd fdVar : this.a.g().q()) {
            if (fdVar instanceof arju) {
                ((arju) fdVar).e.i(true);
                this.j.d(new Runnable(this) { // from class: arjx
                    private final arjy a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        arjy arjyVar = this.a;
                        if (arjyVar.a.isDestroyed()) {
                            return;
                        }
                        gn g = arjyVar.a.g();
                        if (g.J()) {
                            return;
                        }
                        cjqy cjqyVar = arjyVar.d;
                        cjsx i = cjsy.i();
                        i.b(ddda.ah);
                        cjqyVar.k(i.a());
                        g.h(arju.a, 1);
                    }
                }, 200L, TimeUnit.MILLISECONDS);
                return;
            }
        }
    }

    @Override // defpackage.arkd
    public final void a(arkf arkfVar) {
        Iterable e;
        amub a = arkfVar.a();
        czh czhVar = czh.WALKING_NAVIGATION;
        boolean z = ((arjz) this.g).c.c;
        if (a != null) {
            final amuo[] amuoVarArr = a.k;
            e = new Iterable(amuoVarArr) { // from class: arjn
                private final amuo[] a;

                {
                    this.a = amuoVarArr;
                }

                @Override // java.lang.Iterable
                public final Iterator iterator() {
                    return dcgh.l(dcgh.s(this.a), arjo.a);
                }
            };
        } else {
            e = dcdc.e();
        }
        ArLauncherParams p = ArLauncherParams.p(czhVar, z, e);
        dbsk.l(this.k.a().a());
        this.k.a().b().b(p, arkfVar);
    }

    @Override // defpackage.arkd
    public final void b() {
        this.j.execute(new Runnable(this) { // from class: arjw
            private final arjy a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                arjy arjyVar = this.a;
                if (arjyVar.a.isDestroyed() || arjyVar.f.k || arjyVar.b.e(arju.class)) {
                    return;
                }
                cjqy cjqyVar = arjyVar.d;
                cjsx i = cjsy.i();
                i.b(ddda.ag);
                cjqyVar.k(i.a());
                arju arjuVar = new arju();
                final arlg arlgVar = arjyVar.c;
                synchronized (arlgVar.g) {
                    if (!arlgVar.k) {
                        arlgVar.k = true;
                        btrm btrmVar = arlgVar.c;
                        dceq a = dcet.a();
                        a.b(crhp.class, new arlh(crhp.class, arlgVar, bvrj.UI_THREAD));
                        btrmVar.g(arlgVar, a.a());
                    }
                    final arlk arlkVar = arlgVar.j;
                    synchronized (arlkVar.f) {
                        dnl dnlVar = arlkVar.e;
                        if (!dnlVar.e) {
                            dnlVar.a();
                            arlkVar.g = arlkVar.e.a.SW(new dzaz(arlkVar) { // from class: arli
                                private final arlk a;

                                {
                                    this.a = arlkVar;
                                }

                                @Override // defpackage.dzaz
                                public final void SR(Object obj) {
                                    final arlk arlkVar2 = this.a;
                                    dam damVar = dam.UNKNOWN;
                                    int ordinal = ((dam) obj).ordinal();
                                    if (ordinal == 1) {
                                        if (!((arjz) arlkVar2.d).c.e) {
                                            return;
                                        }
                                        dbsk.m(arlkVar2.c.a().a(), "Processing ARWN tilt event without an AR launcher present; this should be impossible as ARWN tilt events can't be started withouta launcher present.");
                                        arlkVar2.c.a().b().b();
                                    } else if (ordinal != 2) {
                                    } else {
                                        arkz arkzVar = ((arjz) arlkVar2.d).c;
                                        if (!arkzVar.e) {
                                            return;
                                        }
                                        dbsk.m(arlkVar2.c.a().a(), "Processing ARWN tilt event without an AR launcher present; this should be impossible as ARWN tilt events can't be started withouta launcher present.");
                                        arlkVar2.c.a().b().d();
                                        if (arkzVar.d) {
                                            return;
                                        }
                                        final ScheduledFuture<?> schedule = arlkVar2.b.schedule(new Runnable(arlkVar2) { // from class: arlj
                                            private final arlk a;

                                            {
                                                this.a = arlkVar2;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                new arln().e(this.a.a.g(), gfu.DIALOG_FRAGMENT.c);
                                            }
                                        }, 200L, TimeUnit.MILLISECONDS);
                                        arlkVar2.a.g.a(new e() { // from class: com.google.android.apps.gmm.navigation.arwalking.tilt.TiltGestureHandler$1
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
                                                schedule.cancel(true);
                                            }

                                            @Override // defpackage.f
                                            public final void f(m mVar) {
                                            }
                                        });
                                        arla arlaVar = arlkVar2.d;
                                        dsqp dsqpVar = (dsqp) arkzVar.cu(5);
                                        dsqpVar.bC(arkzVar);
                                        arky arkyVar = (arky) dsqpVar;
                                        if (arkyVar.c) {
                                            arkyVar.bF();
                                            arkyVar.c = false;
                                        }
                                        arkz arkzVar2 = (arkz) arkyVar.b;
                                        arkzVar2.a |= 4;
                                        arkzVar2.d = true;
                                        arlaVar.b(arkyVar.bK());
                                    }
                                }
                            });
                        }
                    }
                }
                arjuVar.Z.a(new e() { // from class: com.google.android.apps.gmm.navigation.arwalking.service.NavigationServiceObserver$1
                    @Override // defpackage.f
                    public final void a(m mVar) {
                        synchronized (arlg.this.g) {
                            arlg arlgVar2 = arlg.this;
                            arlgVar2.p = false;
                            arlgVar2.o = true;
                        }
                    }

                    @Override // defpackage.f
                    public final void b(m mVar) {
                        synchronized (arlg.this.g) {
                            arlg arlgVar2 = arlg.this;
                            if (!arlgVar2.q) {
                                arlgVar2.b.g.a(arlgVar2.h);
                                arlg.this.q = true;
                            }
                        }
                    }

                    @Override // defpackage.f
                    public final void c(m mVar) {
                    }

                    @Override // defpackage.f
                    public final void d(m mVar) {
                    }

                    @Override // defpackage.f
                    public final void e(m mVar) {
                    }

                    @Override // defpackage.f
                    public final void f(m mVar) {
                        synchronized (arlg.this.g) {
                            arlg arlgVar2 = arlg.this;
                            arlgVar2.p = true;
                            arlgVar2.b();
                        }
                    }
                });
                if (arjyVar.e.a()) {
                    arjyVar.e.b().a(arjuVar);
                }
                arjyVar.a.D(arjuVar);
            }
        });
    }

    @Override // defpackage.arkd
    public final void c() {
        this.n.a();
        h();
    }

    @Override // defpackage.arkd
    public final void d() {
        h();
    }

    @Override // defpackage.arkd
    public final void e() {
        this.n.a();
    }

    @Override // defpackage.czl
    public final void f() {
        arkz arkzVar = ((arjz) this.g).c;
        dsqp dsqpVar = (dsqp) arkzVar.cu(5);
        dsqpVar.bC(arkzVar);
        arky arkyVar = (arky) dsqpVar;
        if (arkyVar.c) {
            arkyVar.bF();
            arkyVar.c = false;
        }
        arkz arkzVar2 = (arkz) arkyVar.b;
        arkz arkzVar3 = arkz.g;
        arkzVar2.a |= 2;
        arkzVar2.c = true;
        this.o.al(bvjk.iu, arkyVar.bK());
    }

    @Override // defpackage.czl
    public final dehn<Map<String, String>> g() {
        return deha.a(dcdn.k("ARWN Settings", Base64.encodeToString(((arjz) this.g).c.bS(), 0)));
    }

    @Override // defpackage.czl
    public final void m() {
        this.l.n();
        h();
    }

    @Override // defpackage.czl
    public final /* bridge */ /* synthetic */ void n(Bundle bundle, Object obj) {
        arkf arkfVar = (arkf) obj;
        amub a = arkfVar.a();
        if (a != null) {
            bundle.putSerializable("route_description_payload", a.d());
        } else if (arkfVar.b() != null) {
            bundle.putSerializable("start_direction_params_payload", arkfVar.b());
        } else {
            bundle.putSerializable("route_description_payload", null);
        }
    }

    @Override // defpackage.czl
    @dzsi
    public final /* bridge */ /* synthetic */ Object o(Bundle bundle) {
        qcx qcxVar;
        arke c;
        amub b;
        if (bundle.containsKey("route_description_payload")) {
            amte amteVar = (amte) bundle.getSerializable("route_description_payload");
            if (amteVar == null || (b = amteVar.b(amteVar.i, this.a)) == null) {
                return null;
            }
            c = arkf.c();
            ((arkg) c).a = b;
        } else if (!bundle.containsKey("start_direction_params_payload") || (qcxVar = (qcx) bundle.getSerializable("start_direction_params_payload")) == null) {
            return null;
        } else {
            c = arkf.c();
            ((arkg) c).b = qcxVar;
        }
        return c.a();
    }

    @Override // defpackage.czl
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        arkf arkfVar = (arkf) obj;
        amub a = arkfVar.a();
        qcx b = arkfVar.b();
        if (this.l.g()) {
            b();
        } else if (a == null) {
            if (b == null) {
                return;
            }
            this.l.d(b, asca.FOR_TESTING_ONLY);
        } else {
            ascb ascbVar = this.l;
            amte d = a.d();
            int i = a.c;
            asca ascaVar = asca.ARRIVAL_DASHBOARD;
            ascbVar.r(d, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (r3.m.getEnableFeatureParameters().aG != false) goto L4;
     */
    @Override // defpackage.czl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dehn<java.lang.Boolean> l() {
        /*
            r3 = this;
            dbsg<czc> r0 = r3.i
            boolean r0 = r0.a()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto Lc
        La:
            r1 = 0
            goto L28
        Lc:
            arla r0 = r3.g
            arjz r0 = (defpackage.arjz) r0
            arkz r0 = r0.c
            arkx r0 = r0.b
            if (r0 != 0) goto L18
            arkx r0 = defpackage.arkx.g
        L18:
            boolean r0 = r0.c
            if (r0 == 0) goto L1d
            goto L28
        L1d:
            btvo r0 = r3.m
            dkiy r0 = r0.getEnableFeatureParameters()
            boolean r0 = r0.aG
            if (r0 != 0) goto L28
            goto La
        L28:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            dehn r0 = defpackage.deha.a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arjy.l():dehn");
    }
}
