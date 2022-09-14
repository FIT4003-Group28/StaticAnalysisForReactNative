package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: aagx  reason: default package */
/* loaded from: classes2.dex */
public final class aagx extends ges implements gfn {
    private static final dcqe aA = dcqe.c("aagx");
    public bwqv a;
    @dzsi
    private aazu aB;
    @dzsi
    private alht aC;
    public aajk ad;
    public aaku ae;
    public jkf af;
    public gek ag;
    public abbl ah;
    public aaha ai;
    public dxio<dbsg<gli>> aj;
    public dxio<alhv> ak;
    public dxio<bxtx> al;
    @dzsi
    public jjn am;
    @dzsi
    public aaao an;
    public cqkf<aazo> ao;
    public cqkf<aazn> ap;
    @dzsi
    public aazz aq;
    public dbsg<diwb> ar;
    public begc as;
    @dzsi
    public aagz au;
    public bdwf ay;
    public axsc az;
    public efg b;
    public cqkj c;
    public aagy d;
    public abaa e;
    public aazv f;
    public aajr g;
    public final jkh at = new aagu(this);
    public boolean av = true;
    public jkc aw = new aagt(this);
    public final egd ax = new aags(this);

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        if (obj instanceof bdhk) {
            this.ad.a((bdhk) obj, this.ar.b().c, true);
        }
    }

    @Override // defpackage.gfn
    public final boolean a() {
        aaao aaaoVar = this.an;
        return aaaoVar != null && aaaoVar.d();
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        int i;
        int i2;
        int i3;
        int i4;
        super.ag(layoutInflater, viewGroup, bundle);
        this.ao = this.c.e(new aajy());
        this.ap = this.c.e(new aakk());
        if (this.aq == null) {
            abaa abaaVar = this.e;
            dbty dbtyVar = new dbty(this) { // from class: aagk
                private final aagx a;

                {
                    this.a = this;
                }

                @Override // defpackage.dbty
                public final Object a() {
                    return this.a.ao.c();
                }
            };
            abaa.a(dbtyVar, 1);
            abaa.a(this, 2);
            abaa.a(abaaVar.a.a(), 3);
            akoi a = abaaVar.b.a();
            abaa.a(a, 4);
            abaa.a(abaaVar.c.a(), 5);
            bfib a2 = abaaVar.d.a();
            abaa.a(a2, 6);
            aaku a3 = abaaVar.e.a();
            abaa.a(a3, 7);
            aazw a4 = abaaVar.f.a();
            abaa.a(a4, 8);
            aazr a5 = abaaVar.g.a();
            abaa.a(a5, 9);
            aklj a6 = abaaVar.h.a();
            abaa.a(a6, 10);
            abac a7 = abaaVar.i.a();
            abaa.a(a7, 11);
            i = 1;
            i2 = 2;
            i3 = 3;
            aazz aazzVar = new aazz(dbtyVar, this, a, a2, a3, a4, a5, a6, a7);
            this.aq = aazzVar;
            aagy aagyVar = this.d;
            aazzVar.Pc(aagyVar.n.a());
            aazzVar.Pc(aagyVar.o.a());
            aazzVar.Pc(aagyVar.f.a());
            aazzVar.Pc(aagyVar.c.a());
            aazzVar.Pc(aagyVar.j.a());
            aazzVar.Pc(aagyVar.d.a());
            aazzVar.Pc(aagyVar.i.a());
            aazzVar.Pc(aagyVar.b.a());
            aazzVar.Pc(aagyVar.k.a());
            aazzVar.Pc(aagyVar.l.a());
            aazzVar.Pc(aagyVar.g.a());
            aazzVar.Pc(aagyVar.h.a());
            aazzVar.Pc(aagyVar.a.a());
            aazzVar.Pc(aagyVar.e.a());
            if (aagyVar.p.a().getEnableFeatureParameters().bk) {
                aazzVar.Pc(aagyVar.m.a());
            }
            aaku aakuVar = this.ae;
            final aazz aazzVar2 = this.aq;
            aazzVar2.getClass();
            final Runnable runnable = new Runnable(aazzVar2) { // from class: aagl
                private final aazz a;

                {
                    this.a = aazzVar2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.j();
                }
            };
            aagi aagiVar = (aagi) aakuVar;
            aagiVar.b.a.a(new crzp(runnable) { // from class: aagh
                private final Runnable a;

                {
                    this.a = runnable;
                }

                @Override // defpackage.crzp
                public final void On(crzm crzmVar) {
                    this.a.run();
                }
            }, aagiVar.d);
        } else {
            i = 1;
            i2 = 2;
            i3 = 3;
        }
        if (this.aB == null) {
            aazv aazvVar = this.f;
            Runnable runnable2 = new Runnable(this) { // from class: aagm
                private final aagx a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.q();
                }
            };
            aazv.a(runnable2, i);
            Activity activity = (Activity) ((dxjd) aazvVar.a).a;
            aazv.a(activity, i2);
            cqhn a8 = aazvVar.b.a();
            aazv.a(a8, i3);
            aahf a9 = aazvVar.c.a();
            aazv.a(a9, 4);
            aaht a10 = aazvVar.d.a();
            i4 = 5;
            aazv.a(a10, 5);
            aahu a11 = aazvVar.e.a();
            aazv.a(a11, 6);
            aahc a12 = aazvVar.f.a();
            aazv.a(a12, 7);
            aaxl a13 = aazvVar.g.a();
            aazv.a(a13, 8);
            akla a14 = aazvVar.h.a();
            aazv.a(a14, 9);
            this.aB = new aazu(runnable2, activity, a8, a9, a10, a11, a12, a13, a14);
        } else {
            i4 = 5;
        }
        bdwf bdwfVar = this.ay;
        cqss a15 = irg.a();
        Activity activity2 = (Activity) ((dxjd) bdwfVar.a).a;
        bdwf.a(activity2, i);
        cqkj a16 = bdwfVar.b.a();
        bdwf.a(a16, i2);
        jkf a17 = bdwfVar.c.a();
        bdwf.a(a17, i3);
        dzsj<glj> dzsjVar = bdwfVar.d;
        bdwf.a(a15, i4);
        this.as = new bdwe(activity2, a16, a17, dzsjVar, a15, true);
        return this.ao.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        this.au = null;
        this.az.e(true);
        this.ae.f(dbpy.a);
        super.am();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        if (!this.aD) {
            return false;
        }
        jjn L = this.af.l().L();
        jjn jjnVar = jjn.HIDDEN;
        int ordinal = L.ordinal();
        if (ordinal == 0) {
            if (!w()) {
                return false;
            }
            q();
            return true;
        } else if (ordinal == 2 || ordinal == 3) {
            if (w()) {
                return false;
            }
            this.am = L;
            i();
            return true;
        } else {
            bvoo.h("Illegal expanding state for experience sheet: %s", L);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g(dbsg<diwb> dbsgVar) {
        jjn jjnVar;
        bvrj.UI_THREAD.c();
        if (!dbsgVar.a()) {
            aazz aazzVar = this.aq;
            dbsk.s(aazzVar);
            aazzVar.f();
            aazu aazuVar = this.aB;
            dbsk.s(aazuVar);
            aazuVar.j();
            return;
        }
        this.ar = dbsgVar;
        if (this.aq == null || this.aB == null) {
            return;
        }
        diwb b = dbsgVar.b();
        aazz aazzVar2 = this.aq;
        dbsk.s(aazzVar2);
        aazzVar2.h(b);
        aazu aazuVar2 = this.aB;
        dbsk.s(aazuVar2);
        aazuVar2.i(b);
        abbl abblVar = this.ah;
        if (abblVar != null) {
            abblVar.c(b);
        }
        if (aahv.d(b)) {
            this.av = true;
        } else {
            this.av = false;
            this.aw = jkc.j;
            gek gekVar = this.ag;
            dbsk.s(gekVar);
            if (w()) {
                jjnVar = jjn.FULLY_EXPANDED;
            } else {
                jjnVar = jjn.HIDDEN;
            }
            jjn a = gekVar.a(jjnVar);
            dbsk.s(a);
            this.ae.a(a);
        }
        if ((b.b & 8192) == 0) {
            return;
        }
        bxtx a2 = this.al.a();
        dpte dpteVar = b.P;
        if (dpteVar == null) {
            dpteVar = dpte.g;
        }
        a2.h(dpteVar);
    }

    public final void i() {
        this.ae.a(jjn.HIDDEN);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        Bundle bundle2 = (Bundle) dbsc.a(bundle, this.o);
        this.ar = dbsg.j((diwb) bvrs.e(bundle2, diwb.class, (dssr) diwb.U.cu(7)));
        try {
            bwrs e = this.a.e(aaao.class, bundle2, "option");
            dbsk.s(e);
            this.an = (aaao) e.c();
            aaku aakuVar = this.ae;
            final mw mwVar = new mw(this) { // from class: aagj
                private final aagx a;

                {
                    this.a = this;
                }

                @Override // defpackage.mw
                public final void a(Object obj) {
                    final aagx aagxVar = this.a;
                    final jjn jjnVar = (jjn) obj;
                    egj egjVar = new egj(aagxVar);
                    egjVar.w(null);
                    egjVar.ag(aagxVar.ao.c());
                    jkc jkcVar = aagxVar.aw;
                    egjVar.ak(jkcVar, jkcVar);
                    egjVar.ai(jjnVar);
                    egjVar.J(new egq(aagxVar, jjnVar) { // from class: aagq
                        private final aagx a;
                        private final jjn b;

                        {
                            this.a = aagxVar;
                            this.b = jjnVar;
                        }

                        @Override // defpackage.egq
                        public final void Qs(egu eguVar) {
                            aagx aagxVar2 = this.a;
                            if (this.b == jjn.HIDDEN) {
                                aagxVar2.az.e(false);
                                abbl abblVar = aagxVar2.ah;
                                if (abblVar == null) {
                                    return;
                                }
                                abbm abbmVar = (abbm) abblVar;
                                abbmVar.a = true;
                                abbmVar.f();
                            }
                        }
                    });
                    aaao aaaoVar = aagxVar.an;
                    dbsk.s(aaaoVar);
                    begk e2 = aaaoVar.e();
                    if (e2 != null) {
                        egjVar.F(e2.a(aagxVar));
                    } else {
                        egjVar.W(aagxVar.au);
                        egjVar.O(jjn.HIDDEN);
                    }
                    egjVar.r(((bdwe) aagxVar.as).a);
                    egjVar.t(aagxVar.at);
                    egjVar.a.q = aagxVar.ax;
                    egjVar.B(aagxVar.av);
                    if (jjnVar == jjn.HIDDEN) {
                        egjVar.v(aagxVar.ap.c(), false, null);
                    }
                    egf a = egf.a();
                    a.n = false;
                    egjVar.A(a);
                    aagxVar.b.a(egjVar.a());
                }
            };
            ((aagi) aakuVar).a.a.a(new crzp(mwVar) { // from class: aagd
                private final mw a;

                {
                    this.a = mwVar;
                }

                @Override // defpackage.crzp
                public final void On(crzm crzmVar) {
                    mw mwVar2 = this.a;
                    jjn jjnVar = (jjn) crzmVar.l();
                    dbsk.s(jjnVar);
                    mwVar2.a(jjnVar);
                }
            }, dege.a);
            aaha aahaVar = this.ai;
            aagw aagwVar = new aagw(this);
            aafv a = aahaVar.a.a();
            aaha.a(a, 1);
            gga a2 = aahaVar.b.a();
            aaha.a(a2, 2);
            aaha.a(aagwVar, 3);
            this.au = new aagz(a, a2, aagwVar);
            aaao aaaoVar = this.an;
            dbsk.s(aaaoVar);
            String f = aaaoVar.f();
            if (f == null) {
                return;
            }
            aagz aagzVar = this.au;
            dbsk.s(aagzVar);
            aagzVar.I(f);
        } catch (IOException e2) {
            Throwable cause = e2.getCause();
            dbsk.s(cause);
            dbue.b(cause);
            throw new RuntimeException(e2.getCause());
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxo.bY;
    }

    public final void q() {
        jjn jjnVar = this.am;
        this.ae.a((jjnVar == null || !jjnVar.b()) ? jjn.EXPANDED : this.am);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        cqkf<aazo> cqkfVar = this.ao;
        aazz aazzVar = this.aq;
        dbsk.s(aazzVar);
        cqkfVar.e(aazzVar);
        cqkf<aazn> cqkfVar2 = this.ap;
        aazu aazuVar = this.aB;
        dbsk.s(aazuVar);
        cqkfVar2.e(aazuVar);
        begc begcVar = this.as;
        aazz aazzVar2 = this.aq;
        dbsk.s(aazzVar2);
        begcVar.c(aazzVar2.g());
        aagz aagzVar = this.au;
        dbsk.s(aagzVar);
        aagzVar.ah();
        aaao aaaoVar = this.an;
        dbsk.s(aaaoVar);
        abbl abblVar = this.ah;
        if (abblVar != null) {
            abbj d = abbk.d();
            String a = aaaoVar.a();
            dbsk.s(a);
            d.c(a);
            d.b(aaaoVar.d());
            d.d(new Runnable(this) { // from class: aagn
                private final aagx a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    aagx aagxVar = this.a;
                    dbsg<gli> a2 = aagxVar.aj.a();
                    if (((Boolean) a2.h(aagr.a).c(false)).booleanValue()) {
                        a2.b().c();
                    } else {
                        aagxVar.q();
                    }
                }
            });
            abblVar.a(d.a());
        }
        if (aaaoVar.d()) {
            this.aC = new alht(this) { // from class: aago
                private final aagx a;

                {
                    this.a = this;
                }

                @Override // defpackage.alht
                public final boolean a(alhr alhrVar) {
                    aagx aagxVar = this.a;
                    aaao aaaoVar2 = aagxVar.an;
                    dbsk.s(aaaoVar2);
                    dbsk.l(aaaoVar2.d());
                    gga ggaVar = aagxVar.aE;
                    if (!aagxVar.aD || ggaVar == null) {
                        return false;
                    }
                    ggaVar.z(aagx.class);
                    ggaVar.g().f();
                    return true;
                }
            };
            alht alhtVar = this.aC;
            dbsk.s(alhtVar);
            this.ak.a().b(alhtVar);
        }
        gek gekVar = this.ag;
        dbsk.s(gekVar);
        jjn a2 = gekVar.a(w() ? jjn.EXPANDED : jjn.HIDDEN);
        dbsk.s(a2);
        this.ae.a(a2);
        this.ae.f(dbsg.i(R()));
        if (!this.ar.a()) {
            aajl aajlVar = new aajl();
            String a3 = aaaoVar.a();
            dbsk.s(a3);
            aajlVar.a = a3;
            dpuk b = aaaoVar.b();
            dbsk.s(b);
            aajlVar.b = b;
            aajlVar.c = false;
            aajlVar.d = new bvqg(this) { // from class: aagp
                private final aagx a;

                {
                    this.a = this;
                }

                @Override // defpackage.bvqg
                public final void NU(Object obj) {
                    this.a.g((dbsg) obj);
                }
            };
            bvrj bvrjVar = bvrj.UI_THREAD;
            if (bvrjVar != null) {
                aajlVar.e = bvrjVar;
                aajr aajrVar = this.g;
                String str = aajlVar.a == null ? " mid" : "";
                if (aajlVar.b == null) {
                    str = str.concat(" knowledgeEntityType");
                }
                if (aajlVar.c == null) {
                    str = String.valueOf(str).concat(" includeSimilarExperiences");
                }
                if (aajlVar.d == null) {
                    str = String.valueOf(str).concat(" callback");
                }
                if (aajlVar.e == null) {
                    str = String.valueOf(str).concat(" callbackThread");
                }
                if (!str.isEmpty()) {
                    String valueOf = String.valueOf(str);
                    throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
                }
                aajrVar.a = dbsg.i(new aajm(aajlVar.a, aajlVar.b, aajlVar.c.booleanValue(), aajlVar.d, aajlVar.e));
                aajrVar.a();
                return;
            }
            throw new NullPointerException("Null callbackThread");
        }
        g(this.ar);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bvrs.l(bundle, this.ar.b());
        this.a.c(bundle, "option", bwrs.a(this.an));
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        abbl abblVar = this.ah;
        if (abblVar != null) {
            abblVar.b();
        }
        if (this.aC != null) {
            alht alhtVar = this.aC;
            dbsk.s(alhtVar);
            this.ak.a().c(alhtVar);
            this.aC = null;
        }
        gek gekVar = this.ag;
        dbsk.s(gekVar);
        gekVar.c = this.af.l().L();
        this.ao.e(null);
        this.ap.e(null);
        this.as.a();
        aagz aagzVar = this.au;
        dbsk.s(aagzVar);
        aagzVar.ai();
        super.u();
    }

    public final boolean w() {
        if (this.aD) {
            btpf c = btpf.c(J());
            if (c.e && c.f) {
                return true;
            }
        }
        aaao aaaoVar = this.an;
        dbsk.s(aaaoVar);
        return aaaoVar.c();
    }
}
