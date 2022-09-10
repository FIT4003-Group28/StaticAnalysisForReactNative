package com.google.android.apps.gmm.ar.lighthouse;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.gmm.locationsharing.api.PersonId;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.maps.R;
import com.google.geo.ar.arlo.api.jni.CameraPreviewEffectsJniImpl;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ArLighthouseSceneController implements e {
    public static final /* synthetic */ int b = 0;
    private static final dugy c;
    public final dqn a;
    private final Activity d;
    private final m e;
    private final dfen f;
    private final dpw g;
    private final dhm h;
    private final drm i;
    private final drb j;
    private final czo k;
    private final dbsg<dfjb> l;
    private final dqq<dmo> m;
    private final dbsg<drx> n;
    private final dbsg<dow> o;
    private final dbsg<dsf> p;
    private final dbsg<dea> q;
    private final dbsg<dyb> r;
    private dbsg<drl> s = dbpy.a;
    private dbsg<dra> t = dbpy.a;
    private boolean u = false;
    private drq v;

    static {
        dugx bZ = dugy.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dugy dugyVar = (dugy) bZ.b;
        dugyVar.a = 0.0f;
        dugyVar.c = 0.0f;
        dugyVar.b = 0.0f;
        dsql bZ2 = dsqm.b.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ((dsqm) bZ2.b).a = 0.3f;
        dsqm bK = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bK.getClass();
        ((dugy) bZ.b).d = bK;
        c = bZ.bK();
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0445, code lost:
        if ((r1 == null ? defpackage.dte.w : r1).q != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:67:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x06d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ArLighthouseSceneController(android.app.Activity r28, defpackage.dbsg<defpackage.dap> r29, defpackage.btvo r30, defpackage.dbsg<defpackage.czw> r31, defpackage.dpx r32, defpackage.dcs r33, final defpackage.dxio<defpackage.dmp> r34, defpackage.dxio<defpackage.dmm> r35, defpackage.dxio<defpackage.dmj> r36, defpackage.dxio<defpackage.dyt> r37, defpackage.dxio<defpackage.dyp> r38, defpackage.dry r39, defpackage.dsg r40, defpackage.drm r41, defpackage.drb r42, defpackage.dyc r43, defpackage.m r44, defpackage.czo r45, defpackage.czz r46, defpackage.dbsg<defpackage.cjqp> r47, defpackage.dhm r48, defpackage.drq r49) {
        /*
            Method dump skipped, instructions count: 1772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gmm.ar.lighthouse.ArLighthouseSceneController.<init>(android.app.Activity, dbsg, btvo, dbsg, dpx, dcs, dxio, dxio, dxio, dxio, dxio, dry, dsg, drm, drb, dyc, m, czo, czz, dbsg, dhm, drq):void");
    }

    private final dbsg<? extends dqr<?>> h() {
        if (this.u) {
            return dbpy.a;
        }
        int g = this.v.g();
        int i = g - 1;
        if (g == 0) {
            throw null;
        }
        if (i == 0) {
            return this.s;
        }
        return i != 1 ? dbpy.a : this.t;
    }

    private final void i() {
        if (this.s.a()) {
            drl b2 = this.s.b();
            if (!b2.f) {
                b2.b.f = null;
                dqb dqbVar = b2.a;
                bvrj.UI_THREAD.c();
                dqbVar.a();
                if (b2.d.a()) {
                    b2.b.h(b2.c.a());
                }
                drg a = b2.c.a();
                if (!a.l) {
                    a.j.d = null;
                    a.l = true;
                }
                drj drjVar = b2.e;
                if (drjVar.e != null && drjVar.c.a()) {
                    dmr dmrVar = drjVar.e;
                    dbsk.s(dmrVar);
                    drjVar.c.b().b(dmrVar);
                }
                b2.f = true;
            }
            this.s = dbpy.a;
        }
        if (this.t.a()) {
            dra b3 = this.t.b();
            if (!b3.h) {
                dpw dpwVar = b3.c;
                dpwVar.f = null;
                dpwVar.f(null);
                dps dpsVar = b3.a;
                dqw a2 = b3.e.a();
                if (!a2.q) {
                    a2.p.d = null;
                    a2.q = true;
                }
                dehu dehuVar = b3.i;
                if (dehuVar != null) {
                    dehuVar.cancel(true);
                    b3.i = null;
                }
                b3.h = true;
            }
            this.t = dbpy.a;
        }
    }

    @Override // defpackage.f
    public final void a(m mVar) {
    }

    @Override // defpackage.f
    public final void b(m mVar) {
        if (this.u) {
            return;
        }
        g(this.v);
        h().b().b();
        if (this.n.a()) {
            final drx b2 = this.n.b();
            asud asudVar = new asud(b2.a.getResources(), new Runnable(b2) { // from class: drt
                private final drx a;

                {
                    this.a = b2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    drx drxVar = this.a;
                    drxVar.a(true);
                    drxVar.j.c(drxVar.b.af(), 8);
                }
            }, dtxw.T);
            b2.h.addView(b2.k.c(), new FrameLayout.LayoutParams(-2, -2, 8388691));
            b2.k.e(asudVar);
            b2.p = b2.k.c();
            btrm btrmVar = b2.d;
            drw drwVar = b2.l;
            dceq a = dcet.a();
            a.b(alho.class, new drz(0, alho.class, drwVar, bvrj.UI_THREAD));
            a.b(amwe.class, new drz(1, amwe.class, drwVar, bvrj.UI_THREAD));
            btrmVar.g(drwVar, a.a());
            b2.e.a();
            b2.m = b2.e.a.SW(new dzaz(b2) { // from class: dru
                private final drx a;

                {
                    this.a = b2;
                }

                @Override // defpackage.dzaz
                public final void SR(Object obj) {
                    drx drxVar = this.a;
                    dam damVar = dam.UNKNOWN;
                    int ordinal = ((dam) obj).ordinal();
                    if (ordinal == 1) {
                        if (drxVar.f.j()) {
                            drxVar.f.i();
                        }
                        drxVar.j.f(drxVar.b.af(), drxVar.a.getString(R.string.TILT_UP_ACCESSIBILITY_MESSAGE));
                    } else if (ordinal != 2) {
                    } else {
                        if (!drxVar.f.j()) {
                            drxVar.a(false);
                            drxVar.f.h();
                        }
                        drxVar.j.f(drxVar.f.a(), drxVar.a.getString(R.string.TILT_DOWN_ACCESSIBILITY_MESSAGE));
                    }
                }
            });
            final dsr dsrVar = b2.i;
            if (!dsrVar.j && !dsrVar.i) {
                dsrVar.m = new crzp(dsrVar) { // from class: dsp
                    private final dsr a;

                    {
                        this.a = dsrVar;
                    }

                    @Override // defpackage.crzp
                    public final void On(crzm crzmVar) {
                        dsr dsrVar2 = this.a;
                        GmmLocation gmmLocation = (GmmLocation) crzmVar.l();
                        if (gmmLocation != null) {
                            dsrVar2.a(gmmLocation.B());
                        }
                    }
                };
                dsrVar.f = dsrVar.a.b();
                crzm<GmmLocation> crzmVar = dsrVar.f;
                crzp<GmmLocation> crzpVar = dsrVar.m;
                dbsk.s(crzpVar);
                crzmVar.d(crzpVar, dsrVar.b);
                dsrVar.j = true;
            }
            View findViewById = this.d.findViewById(R.id.qu_mylocation_container);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
        }
        if (this.o.a()) {
            this.o.b();
            throw null;
        } else if (!this.p.a()) {
        } else {
            dsf b3 = this.p.b();
            if (!b3.i) {
                return;
            }
            b3.g.i(dsf.a);
        }
    }

    @Override // defpackage.f
    public final void c(m mVar) {
        if (this.n.a()) {
            drx b2 = this.n.b();
            if (!b2.f.j()) {
                return;
            }
            b2.a(true);
        }
    }

    @Override // defpackage.f
    public final void d(m mVar) {
    }

    @Override // defpackage.f
    public final void e(m mVar) {
        if (this.u) {
            return;
        }
        dbsg<? extends dqr<?>> h = h();
        if (h.a()) {
            h.b().c();
        }
        if (this.n.a()) {
            drx b2 = this.n.b();
            b2.d.a(b2.l);
            b2.e.b();
            dzak dzakVar = b2.m;
            if (dzakVar != null) {
                dzbd.e((AtomicReference) dzakVar);
                b2.m = null;
            }
            b2.h.removeView(b2.k.c());
            View findViewById = this.d.findViewById(R.id.qu_mylocation_container);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
        }
        if (this.o.a()) {
            this.o.b();
            throw null;
        } else if (!this.p.a()) {
        } else {
            dsf b3 = this.p.b();
            if (!b3.i) {
                return;
            }
            b3.g.j(dsf.a);
        }
    }

    @Override // defpackage.f
    public final void f(m mVar) {
        crzp<GmmLocation> crzpVar;
        bvrj.UI_THREAD.c();
        if (this.u) {
            return;
        }
        i();
        this.f.a();
        if (this.l.a()) {
            dfjb b2 = this.l.b();
            synchronized (b2.a) {
                if (!b2.b.c()) {
                    dffc dffcVar = b2.c;
                    CameraPreviewEffectsJniImpl.nativeDestroy(b2.b.b());
                    b2.b.a();
                }
            }
        }
        if (!this.q.a()) {
            if (this.m.a.a()) {
                dmo a = this.m.a();
                a.b.clear();
                for (dms dmsVar : a.a.K()) {
                    dmsVar.c();
                }
            }
            if (this.n.a()) {
                drx b3 = this.n.b();
                amwd amwdVar = b3.o;
                if (amwdVar != null) {
                    b3.c.h(amwdVar);
                }
                if (b3.n != null) {
                    b3.b.p(new drv(b3));
                }
                dsr dsrVar = b3.i;
                if (dsrVar.j && !dsrVar.i) {
                    akte akteVar = dsrVar.k;
                    if (akteVar != null) {
                        dsrVar.d.h(akteVar);
                        dsrVar.d.a(dsrVar.k);
                    }
                    akti aktiVar = dsrVar.l;
                    if (aktiVar != null) {
                        dsrVar.c.g(aktiVar);
                        dsrVar.c.e(dsrVar.l);
                    }
                    crzm<GmmLocation> crzmVar = dsrVar.f;
                    if (crzmVar != null && crzmVar.f() > 0 && (crzpVar = dsrVar.m) != null) {
                        dsrVar.f.c(crzpVar);
                    }
                    dsrVar.e.a(dsrVar.g);
                    dsrVar.i = true;
                }
            }
            if (!this.o.a()) {
                if (this.p.a()) {
                    this.g.h(this.p.b());
                    dsf b4 = this.p.b();
                    b4.c();
                    b4.k.a(b4.c);
                }
                dpw dpwVar = this.g;
                dpwVar.e();
                dgt dgtVar = dpwVar.b;
                if (!dgtVar.b) {
                    dgtVar.b = true;
                    dgtVar.a.a();
                }
                this.u = true;
                return;
            }
            this.o.b();
            throw null;
        }
        dea b5 = this.q.b();
        dfes dfesVar = b5.a;
        dfeq dfeqVar = b5.b;
        throw null;
    }

    public final void g(drq drqVar) {
        bvrj.UI_THREAD.c();
        int g = drqVar.g();
        if (this.v.g() != g) {
            i();
        }
        if (this.o.a()) {
            this.o.b();
            throw null;
        }
        this.v = drqVar;
        if (g != 1) {
            if (g != 2) {
                return;
            }
            if (!this.t.a()) {
                drb drbVar = this.j;
                czo czoVar = this.k;
                dpw dpwVar = this.g;
                dhm dhmVar = this.h;
                dpt a = drbVar.a.a();
                drb.a(a, 1);
                dxio a2 = ((dxjh) drbVar.b).a();
                drb.a(a2, 2);
                dehq a3 = drbVar.c.a();
                drb.a(a3, 3);
                drb.a(czoVar, 4);
                drb.a(dpwVar, 5);
                drb.a(dhmVar, 6);
                dbsg<dra> i = dbsg.i(new dra(a, a2, a3, czoVar, dpwVar, dhmVar));
                this.t = i;
                dqn dqnVar = this.a;
                View view = i.b().e.a().f;
                dbsk.s(view);
                dqnVar.a(view);
            }
            PersonId b2 = this.v.c().b();
            dra b3 = this.t.b();
            if (b3.h) {
                return;
            }
            dps dpsVar = b3.a;
            bvrj.UI_THREAD.c();
            dpsVar.d = b2;
            btlu btluVar = dpsVar.e;
            if (btluVar == null) {
                return;
            }
            dpsVar.c(dbsg.i(btluVar));
            return;
        }
        if (!this.s.a()) {
            drm drmVar = this.i;
            m mVar = this.e;
            dpw dpwVar2 = this.g;
            dhm dhmVar2 = this.h;
            dbsg<dow> dbsgVar = this.o;
            dbsg<dsf> dbsgVar2 = this.p;
            dbsg<dyb> dbsgVar3 = this.r;
            dqc a4 = drmVar.a.a();
            drm.a(a4, 1);
            Resources a5 = drmVar.b.a();
            drm.a(a5, 2);
            drh a6 = drmVar.c.a();
            drm.a(a6, 3);
            drm.a(mVar, 4);
            drm.a(dpwVar2, 5);
            drm.a(dhmVar2, 6);
            drm.a(dbsgVar, 7);
            drm.a(dbsgVar2, 8);
            drm.a(dbsgVar3, 9);
            dbsg<drl> i2 = dbsg.i(new drl(a4, a5, a6, mVar, dpwVar2, dhmVar2, dbsgVar, dbsgVar2, dbsgVar3));
            this.s = i2;
            this.a.a(i2.b().c.a().b);
        }
        bwrs<ilo> b4 = this.v.b().b();
        dbsk.s(b4.c());
        if (this.r.a()) {
            ilo c2 = b4.c();
            dbsk.s(c2);
            this.r.b().c(c2);
        }
        drl b5 = this.s.b();
        if (b5.f) {
            return;
        }
        ilo c3 = b4.c();
        dbsk.s(c3);
        if (b5.d.a()) {
            b5.b.g(b5.c.a());
        }
        b5.a(c3);
        dqb dqbVar = b5.a;
        boolean z = c3.h;
        bvrj.UI_THREAD.c();
        dqbVar.a();
        ilo c4 = b4.c();
        dbsk.s(c4);
        if (!z) {
            deig d = deig.d();
            befu p = befv.p();
            p.j(b4);
            dqbVar.a.f(new dpz(d), p.m());
            dqbVar.b = d;
        } else {
            dqbVar.b = deha.a(c4);
        }
        dehn<ilo> dehnVar = dqbVar.b;
        deha.q(dehnVar, new dpy(dqbVar, dehnVar, c4), dqbVar.e);
    }
}
