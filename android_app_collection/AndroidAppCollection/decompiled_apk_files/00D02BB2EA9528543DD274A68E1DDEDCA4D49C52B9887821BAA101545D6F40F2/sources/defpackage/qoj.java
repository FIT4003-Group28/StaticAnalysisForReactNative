package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: qoj  reason: default package */
/* loaded from: classes7.dex */
public class qoj implements qnc, izy {
    public int A;
    @dzsi
    public ckcv B;
    @dzsi
    public final qom D;
    private final quv I;
    private final qjy J;
    private final qsm K;
    private final qsp L;
    private final sic M;
    private final wqy N;
    private final xlu O;
    private final xiy P;
    private final dxio<ahjq> Q;
    private final xib R;
    private final xcs S;
    private final qjk U;
    private final cqtd V;
    private final qnl X;
    private final long Y;
    private final long Z;
    private final int aa;
    private final qop ab;
    private final dwbk ac;
    private final qoh ad;
    private final qpe ae;
    private final cjbh af;
    private final cjbq ag;
    @dzsi
    private dspd ah;
    @dzsi
    private final eapd ai;
    private xiv aj;
    @dzsi
    private cqkp ak;
    private boolean am;
    public final Context b;
    public final Executor c;
    public final dxio<qbt> d;
    public final ros e;
    public final ivf f;
    public final cqat g;
    public final gun h;
    public final ckcw i;
    public final int k;
    public final int l;
    public final qcl m;
    public final qcl n;
    public final qcz o;
    public final qnm p;
    @dzsi
    public dspd q;
    @dzsi
    public amte r;
    @dzsi
    public dcdc<amvh> s;
    @dzsi
    public acyu t;
    public static final dcqe a = dcqe.c("qoj");
    private static final cqtd E = cqrt.g(2131232292, ibm.n());
    private static final cqtd F = cqrt.g(2131232467, ibm.n());
    private static final cqtd G = cqrt.g(2131232390, ibm.n());
    private static final dcdc<zdu> H = dcdc.e();
    final List<wsl> j = new ArrayList();
    private final List<xia> W = new ArrayList();
    public boolean u = true;
    public boolean v = false;
    public boolean w = false;
    public boolean x = false;
    public boolean y = false;
    long z = 0;
    private String al = "";
    private int an = 0;
    private boolean ao = false;
    private final dbsl<zcv> ap = new dbsl(this) { // from class: qnp
        private final qoj a;

        {
            this.a = this;
        }

        @Override // defpackage.dbsl
        public final boolean a(Object obj) {
            zcv zcvVar = (zcv) obj;
            acyu acyuVar = this.a.t;
            return acyuVar == null || !aefy.a(acyuVar);
        }
    };
    private final acyt aq = new qnx(this);
    public final degu<amte> C = new qoe(this);

    public qoj(Application application, Executor executor, cqhn cqhnVar, quv quvVar, qjy qjyVar, dxio dxioVar, ros rosVar, sic sicVar, qsm qsmVar, qsp qspVar, wqy wqyVar, xlu xluVar, xiy xiyVar, ivg ivgVar, btvo btvoVar, cqat cqatVar, qjk qjkVar, dxio dxioVar2, gun gunVar, xib xibVar, ckcw ckcwVar, cjbh cjbhVar, xcs xcsVar, cjbt cjbtVar, qop qopVar, qcl qclVar, qcl qclVar2, qcz qczVar, qoh qohVar, dspd dspdVar, dspd dspdVar2, eapd eapdVar, qom qomVar, Bundle bundle, qpe qpeVar, qnm qnmVar, qnl qnlVar) {
        cqtd cqtdVar;
        dbsk.s(application);
        this.b = application;
        this.c = executor;
        dbsk.s(cqhnVar);
        this.I = quvVar;
        this.J = qjyVar;
        dbsk.s(dxioVar);
        this.d = dxioVar;
        dbsk.s(rosVar);
        this.e = rosVar;
        dbsk.s(sicVar);
        this.M = sicVar;
        dbsk.s(qsmVar);
        this.K = qsmVar;
        dbsk.s(wqyVar);
        this.N = wqyVar;
        dbsk.s(xluVar);
        this.O = xluVar;
        this.P = xiyVar;
        this.f = ivgVar.a(this);
        this.g = cqatVar;
        this.L = qspVar;
        this.U = qjkVar;
        this.Q = dxioVar2;
        this.h = gunVar;
        this.R = xibVar;
        this.i = ckcwVar;
        this.S = xcsVar;
        this.D = qomVar;
        this.ae = qpeVar;
        this.p = qnmVar;
        this.X = qnlVar;
        dwnv transitPagesParameters = btvoVar.getTransitPagesParameters();
        this.Y = transitPagesParameters.n;
        this.Z = transitPagesParameters.m;
        this.aa = transitPagesParameters.o;
        int i = transitPagesParameters.p;
        this.A = i;
        int i2 = transitPagesParameters.r;
        this.k = i2;
        this.l = i + (i2 * transitPagesParameters.q);
        this.ab = qopVar;
        this.ad = qohVar;
        this.n = qclVar2;
        this.m = qclVar;
        this.o = qczVar;
        dndr a2 = qclVar2.a();
        if (a2 == dndr.HOME) {
            cqtdVar = E;
        } else {
            cqtdVar = a2 == dndr.WORK ? F : G;
        }
        this.V = cqtdVar;
        this.q = dspdVar;
        this.ah = dspdVar2;
        this.ai = eapdVar;
        this.aj = xiyVar.a(dcdc.e(), null, null);
        this.af = cjbhVar;
        this.ag = cjbtVar.a(new cjbr(this) { // from class: qnq
            private final qoj a;

            {
                this.a = this;
            }

            @Override // defpackage.cjbr
            public final didr a() {
                return this.a.v();
            }
        }, new dbty(this) { // from class: qnr
            private final qoj a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                qoj qojVar = this.a;
                boolean z = false;
                if (qojVar.y && qojVar.r != null && !qojVar.j.isEmpty()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        });
        dwbk dwbkVar = qsm.a;
        dsqp dsqpVar = (dsqp) dwbkVar.cu(5);
        dsqpVar.bC(dwbkVar);
        dwbd dwbdVar = (dwbd) dsqpVar;
        if (dwbdVar.c) {
            dwbdVar.bF();
            dwbdVar.c = false;
        }
        dwbk dwbkVar2 = (dwbk) dwbdVar.b;
        dwbk dwbkVar3 = dwbk.s;
        dwbkVar2.a |= 16384;
        dwbkVar2.n = true;
        dwbk.g((dwbk) dwbdVar.b);
        int g = (int) qnlVar.k().g();
        if (dwbdVar.c) {
            dwbdVar.bF();
            dwbdVar.c = false;
        }
        dwbk dwbkVar4 = (dwbk) dwbdVar.b;
        int i3 = dwbkVar4.a | 8;
        dwbkVar4.a = i3;
        dwbkVar4.e = g;
        boolean z = transitPagesParameters.k;
        dwbkVar4.a = i3 | 32;
        dwbkVar4.g = z;
        if (qnlVar.e()) {
            if (dwbdVar.c) {
                dwbdVar.bF();
                dwbdVar.c = false;
            }
            dwbk dwbkVar5 = (dwbk) dwbdVar.b;
            dwbkVar5.a |= 16;
            dwbkVar5.f = true;
        }
        if (qnlVar.i()) {
            dwbf bZ = dwbg.g.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwbg dwbgVar = (dwbg) bZ.b;
            int i4 = dwbgVar.a | 1;
            dwbgVar.a = i4;
            dwbgVar.b = true;
            int i5 = i4 | 16;
            dwbgVar.a = i5;
            dwbgVar.f = true;
            int i6 = i5 | 2;
            dwbgVar.a = i6;
            dwbgVar.c = true;
            int i7 = i6 | 8;
            dwbgVar.a = i7;
            dwbgVar.e = true;
            dwbgVar.a = i7 | 4;
            dwbgVar.d = true;
            dwbg bK = bZ.bK();
            dwbe bZ2 = dwbh.g.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dwbh dwbhVar = (dwbh) bZ2.b;
            bK.getClass();
            dwbhVar.b = bK;
            int i8 = dwbhVar.a | 1;
            dwbhVar.a = i8;
            bK.getClass();
            dwbhVar.c = bK;
            dwbhVar.a = i8 | 2;
            if (dwbdVar.c) {
                dwbdVar.bF();
                dwbdVar.c = false;
            }
            dwbk dwbkVar6 = (dwbk) dwbdVar.b;
            dwbh bK2 = bZ2.bK();
            bK2.getClass();
            dwbkVar6.o = bK2;
            dwbkVar6.a = 32768 | dwbkVar6.a;
        } else {
            dwbe bZ3 = dwbh.g.bZ();
            dwbf bZ4 = dwbg.g.bZ();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dwbg dwbgVar2 = (dwbg) bZ4.b;
            dwbgVar2.a |= 1;
            dwbgVar2.b = true;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dwbh dwbhVar2 = (dwbh) bZ3.b;
            dwbg bK3 = bZ4.bK();
            bK3.getClass();
            dwbhVar2.b = bK3;
            dwbhVar2.a |= 1;
            if (dwbdVar.c) {
                dwbdVar.bF();
                dwbdVar.c = false;
            }
            dwbk dwbkVar7 = (dwbk) dwbdVar.b;
            dwbh bK4 = bZ3.bK();
            bK4.getClass();
            dwbkVar7.o = bK4;
            dwbkVar7.a |= 32768;
        }
        if (transitPagesParameters.w && !qnlVar.i()) {
            dwbi bZ5 = dwbj.c.bZ();
            int i9 = transitPagesParameters.x;
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dwbj dwbjVar = (dwbj) bZ5.b;
            dwbjVar.a = 1 | dwbjVar.a;
            dwbjVar.b = i9;
            if (dwbdVar.c) {
                dwbdVar.bF();
                dwbdVar.c = false;
            }
            dwbk dwbkVar8 = (dwbk) dwbdVar.b;
            dwbj bK5 = bZ5.bK();
            bK5.getClass();
            dwbkVar8.h = bK5;
            dwbkVar8.a |= 64;
        }
        this.ac = dwbdVar.bK();
        if (bundle == null) {
            return;
        }
        byte[] byteArray = bundle.getByteArray("route-token");
        if (byteArray != null) {
            this.q = dspd.x(byteArray);
        }
        byte[] byteArray2 = bundle.getByteArray("route-start-specifier");
        if (byteArray2 != null) {
            this.ah = dspd.x(byteArray2);
        }
        Serializable serializable = bundle.getSerializable("waypoints");
        if (serializable instanceof List) {
            this.s = dcdc.r((List) serializable);
        }
        Serializable serializable2 = bundle.getSerializable("directions");
        if (!(serializable2 instanceof amte)) {
            return;
        }
        amte amteVar = (amte) serializable2;
        P(amteVar);
        O(amteVar);
    }

    public static boolean G(amvh amvhVar) {
        return dpjs.ENTITY_TYPE_MY_LOCATION.equals(amvhVar.b) && !amvhVar.n();
    }

    public static boolean J(amvh amvhVar) {
        return amvhVar.n() || amvhVar.m();
    }

    private final int X() {
        return dcft.n(this.j, qnt.a);
    }

    @dzsi
    private final qnn Y() {
        if (!L().booleanValue()) {
            return null;
        }
        if (this.ad.equals(qoh.START_COMMUTE_BOARD_PARAMS) || this.ad.equals(qoh.LOCAL_COMMUTE_SETTINGS)) {
            return qnn.NO_DEPARTURES;
        }
        GmmLocation a2 = this.Q.a().a();
        akqq c = this.n.c();
        if (a2 == null || c == null || a2.F(c) >= this.aa) {
            return qnn.NO_ROUTES;
        }
        return qnn.NO_ROUTES_AND_CLOSE_TO_DESTINATION;
    }

    private final void Z(boolean z) {
        if (!this.am || !this.X.b()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (wsl wslVar : N()) {
            xmx O = wslVar.O();
            if (O != null) {
                arrayList.add(O);
            }
        }
        this.O.a(arrayList, z);
    }

    public void A() {
        this.K.f();
    }

    public void B(Bundle bundle) {
        if (k() == null) {
            bundle.putSerializable("directions", this.r);
        }
        dspd dspdVar = this.q;
        if (dspdVar != null) {
            bundle.putByteArray("route-token", dspdVar.G());
        }
        dspd dspdVar2 = this.ah;
        if (dspdVar2 != null) {
            bundle.putByteArray("route-start-specifier", dspdVar2.G());
        }
        dcdc<amvh> dcdcVar = this.s;
        if (dcdcVar != null) {
            bundle.putSerializable("waypoints", dcdcVar);
        }
    }

    public qoh C() {
        return this.ad;
    }

    public final void D(final boolean z) {
        if (z || (!this.K.a() && !this.L.d)) {
            List<amvh> list = this.s;
            if (list != null) {
                F(list, this.C, z, this.o.a());
                return;
            }
            amvh H2 = H(this.m, null);
            if (G(H2)) {
                this.x = true;
                this.u = false;
                return;
            }
            this.x = false;
            amvh I = I(this.n, null);
            if (!J(H2) || !J(I)) {
                this.M.c(new sib(this, z) { // from class: qns
                    private final qoj a;
                    private final boolean b;

                    {
                        this.a = this;
                        this.b = z;
                    }

                    @Override // defpackage.sib
                    public final void a(qjn qjnVar) {
                        qoj qojVar = this.a;
                        boolean z2 = this.b;
                        sie c = sie.c(qojVar.b, qjnVar);
                        amvh H3 = qojVar.H(qojVar.m, c);
                        if (qoj.G(H3)) {
                            qojVar.x = true;
                            qojVar.u = false;
                            return;
                        }
                        qojVar.x = false;
                        amvh I2 = qojVar.I(qojVar.n, c);
                        if (!qoj.J(H3) || !qoj.J(I2)) {
                            qojVar.u = false;
                            qojVar.w = true;
                            qojVar.R();
                            return;
                        }
                        qojVar.s = dcdc.g(H3, I2);
                        qojVar.F(qojVar.s, qojVar.C, z2, qojVar.o.a());
                    }
                });
                return;
            }
            dcdc<amvh> g = dcdc.g(H2, I);
            this.s = g;
            F(g, this.C, z, this.o.a());
        }
    }

    public final void E() {
        if (this.g.e() - this.z < this.Z) {
            if (!this.X.b() || !this.O.c() || this.K.a()) {
                return;
            }
            qsp qspVar = this.L;
            if (qspVar.d) {
                return;
            }
            List<wsl> list = this.j;
            qof qofVar = new qof(this);
            dcdc r = dcdc.r(list);
            qspVar.d = true;
            HashMap hashMap = new HashMap();
            SparseArray sparseArray = new SparseArray();
            int size = r.size();
            for (int i = 0; i < size; i++) {
                wsl wslVar = (wsl) r.get(i);
                akqi c = wslVar.c();
                if (c != null) {
                    Set set = (Set) hashMap.get(c);
                    if (set == null) {
                        set = new HashSet();
                        hashMap.put(c, set);
                    }
                    String ae = wslVar.ae();
                    if (ae != null) {
                        set.add(ae);
                    }
                    sparseArray.put(wslVar.A(), wslVar);
                }
            }
            dccx F2 = dcdc.F();
            for (akqi akqiVar : hashMap.keySet()) {
                dcdc r2 = dcdc.r((Collection) hashMap.get(akqiVar));
                F2.g(new qbc(akqiVar, r2, r2.size() * 3, 2, false));
            }
            deha.q(qspVar.a.a(F2.f()), new qso(qspVar, sparseArray, qofVar, r), qspVar.c);
            return;
        }
        D(false);
    }

    public final void F(List<amvh> list, degu<amte> deguVar, boolean z, dbsg<dnqh> dbsgVar) {
        dbsg<dnqh> i;
        dbsg<dnqh> dbsgVar2;
        int i2;
        this.ao = z;
        if (this.u) {
            this.B = this.i.e();
            qjy qjyVar = this.J;
            ckcv ckcvVar = qjyVar.b;
            if (ckcvVar != null) {
                ckcvVar.a((ckcr) qjyVar.a.a(ckeo.A));
                qjyVar.b = null;
            }
        }
        boolean z2 = this.u || z;
        if (dbsgVar.a()) {
            dbsgVar2 = dbsgVar;
        } else {
            if (!z2) {
                dnqg bZ = dnqh.p.bZ();
                int i3 = ddda.am.b;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dnqh dnqhVar = (dnqh) bZ.b;
                dnqhVar.a |= 64;
                dnqhVar.g = i3;
                i = dbsg.i(bZ.bK());
            } else {
                i = dbpy.a;
            }
            dbsgVar2 = i;
        }
        qsm qsmVar = this.K;
        vul vulVar = vul.TRANSIT_COMMUTE_IMMERSIVE;
        dspd dspdVar = this.q;
        dspd dspdVar2 = this.ah;
        eapd eapdVar = this.ai;
        if (eapdVar == null) {
            eapdVar = new eapd(this.g.b());
        }
        boolean i4 = this.X.i();
        Integer valueOf = Integer.valueOf(this.A);
        dwbk dwbkVar = this.ac;
        dosy bZ2 = dosz.e.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dosz doszVar = (dosz) bZ2.b;
        doszVar.c = 1;
        doszVar.a |= 2;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(eapdVar.a);
        if (bZ2.c) {
            bZ2.bF();
            i2 = 0;
            bZ2.c = false;
        } else {
            i2 = 0;
        }
        dosz doszVar2 = (dosz) bZ2.b;
        int i5 = doszVar2.a | 4;
        doszVar2.a = i5;
        doszVar2.d = seconds;
        doszVar2.b = i2;
        doszVar2.a = 1 | i5;
        qsmVar.d(list, vulVar, dwbkVar, valueOf, bZ2.bK(), dspdVar, dspdVar2, i4, dbsgVar2, deguVar);
    }

    public final amvh H(qcl qclVar, @dzsi sie sieVar) {
        if (qclVar.d()) {
            GmmLocation a2 = this.Q.a().a();
            if (a2 == null) {
                return amvh.i(this.b);
            }
            this.x = false;
            return amvh.g(this.b, a2.B());
        }
        return I(qclVar, sieVar);
    }

    public final amvh I(qcl qclVar, @dzsi sie sieVar) {
        dndr a2 = qclVar.a();
        if (a2 != null && sieVar != null) {
            amvh amvhVar = a2 == dndr.HOME ? ((shn) sieVar).a : a2 == dndr.WORK ? ((shn) sieVar).b : null;
            if (amvhVar != null) {
                return amvhVar;
            }
        }
        return qna.b(this.b, qclVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean K() {
        return Boolean.valueOf(this.v);
    }

    final Boolean L() {
        return Boolean.valueOf(this.w);
    }

    final Boolean M() {
        return Boolean.valueOf(this.x);
    }

    public List<wsl> N() {
        return this.j.subList(Math.max(0, X() - 1), this.j.size());
    }

    public final void O(amte amteVar) {
        qom qomVar = this.D;
        if (qomVar != null) {
            qomVar.a(this, amteVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0122 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P(defpackage.amte r26) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qoj.P(amte):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void Q(List<wsl> list) {
        SparseArray sparseArray = new SparseArray();
        for (wsl wslVar : this.j) {
            wqd T = wslVar.T();
            if (T != null) {
                sparseArray.put(wslVar.A(), T);
            }
        }
        this.j.clear();
        this.j.addAll(list);
        this.an = list.size();
        if (!this.j.isEmpty()) {
            for (wsl wslVar2 : this.j) {
                wslVar2.ap(null);
            }
            ((wsl) dcft.s(this.j)).ap(new qog(this));
            for (wsl wslVar3 : this.j) {
                wqd wqdVar = (wqd) sparseArray.get(wslVar3.A());
                if (wqdVar != null) {
                    wslVar3.ar(wqdVar);
                }
            }
        }
        this.W.clear();
        this.W.addAll(this.R.a(n(), dtyc.bU));
        Z(true);
        cqkx.p(this);
        R();
    }

    public final void R() {
        cqkp cqkpVar = this.ak;
        if (cqkpVar != null) {
            cqkx.p(cqkpVar);
        }
    }

    public final void S(String str) {
        View view = (View) dcft.r(cqkx.n(this), null);
        if (view != null) {
            view.announceForAccessibility(str);
        }
    }

    public float T() {
        return Y() == qnn.NO_ROUTES ? 0.55f : 0.0f;
    }

    public final void U() {
        acyu acyuVar = this.t;
        if (acyuVar == null) {
            return;
        }
        boolean z = acyuVar.c() == this.t.w();
        if (this.y == z) {
            return;
        }
        this.y = z;
        cqkx.p(this);
    }

    @Override // defpackage.qnb
    public cqqw a() {
        return this.ae;
    }

    @Override // defpackage.izy
    public cqkl b() {
        if (this.q != null || this.ad.equals(qoh.CHOOSE_BEST_ROUTE)) {
            E();
            return cqkl.a;
        } else if (this.ad != qoh.LOCAL_COMMUTE_SETTINGS) {
            bvoo.h("Cannot refresh commute board. No route token or valid route source supplied.", new Object[0]);
            return cqkl.a;
        } else {
            final qjk qjkVar = this.U;
            final qcl qclVar = this.n;
            Executor executor = this.c;
            final deig d = deig.d();
            qjkVar.w().Pk(new Runnable(qclVar, qjkVar, d) { // from class: qnw
                private final qcl a;
                private final qjk b;
                private final deig c;

                {
                    this.a = qclVar;
                    this.b = qjkVar;
                    this.c = d;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    qcl qclVar2 = this.a;
                    qjk qjkVar2 = this.b;
                    deig deigVar = this.c;
                    dbsg<dnlg> dbsgVar = dbpy.a;
                    dndr a2 = qclVar2.a();
                    if (a2 != null) {
                        qnn qnnVar = qnn.NETWORK_ERROR;
                        int ordinal = a2.ordinal();
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                if (ordinal != 5) {
                                    if (ordinal != 6) {
                                        deigVar.k(new IllegalArgumentException("Invalid destination waypoint type. Must be a commute destination."));
                                        return;
                                    }
                                }
                            }
                            dbsgVar = qjkVar2.p();
                        }
                        dbsgVar = qjkVar2.s();
                    }
                    if (dbsgVar.a()) {
                        dnlg b = dbsgVar.b();
                        dspd dspdVar = b.a == 3 ? ((dnld) b.b).c : null;
                        if (dspdVar != null) {
                            deigVar.j(dspdVar);
                            return;
                        }
                    }
                    deigVar.k(new RuntimeException("Tried to create commute board from CommuteSettingsController but no route token was found."));
                }
            }, executor);
            deha.q(d, new qny(this), this.c);
            return cqkl.a;
        }
    }

    @Override // defpackage.izy
    public void c() {
        this.f.a();
    }

    @Override // defpackage.izy
    public void d() {
        this.f.c();
    }

    @Override // defpackage.izy
    public long e() {
        return this.Y;
    }

    @Override // defpackage.qnb
    public Boolean f() {
        int i;
        boolean z = false;
        if (!h().booleanValue() && !K().booleanValue() && !L().booleanValue() && !M().booleanValue() && (i = this.A) < this.l && this.an == i) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.qnb
    public Boolean g() {
        boolean z = false;
        if (!this.u && this.K.a()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.qnc
    public Boolean h() {
        return Boolean.valueOf(this.u);
    }

    @Override // defpackage.qnc
    public String i() {
        return this.al;
    }

    @Override // defpackage.qnc
    public cqtd j() {
        return this.V;
    }

    @Override // defpackage.qnc
    @dzsi
    public jam k() {
        Runnable runnable;
        if (!K().booleanValue() || X() != -1) {
            qnn Y = Y();
            if (Y != null) {
                if (!this.X.l()) {
                    return new qoa(this.b, Y);
                }
                dndr dndrVar = dndr.UNKNOWN_ALIAS_TYPE;
                int ordinal = Y.ordinal();
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        runnable = new Runnable(this) { // from class: qnv
                            private final qoj a;

                            {
                                this.a = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.a.e.n(ror.HOME);
                            }
                        };
                        return new qob(this.b, Y, runnable);
                    } else if (ordinal != 3) {
                        throw new RuntimeException("Shouldn't get here");
                    }
                }
                runnable = new Runnable(this) { // from class: qnu
                    private final qoj a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        qoj qojVar = this.a;
                        qojVar.d.a().m(qojVar.o);
                    }
                };
                return new qob(this.b, Y, runnable);
            } else if (!M().booleanValue()) {
                return null;
            } else {
                return new qod(this, this.b, qnn.LOCATION_NOT_AVAILABLE);
            }
        }
        return new qnz(this, this.b, qnn.NETWORK_ERROR);
    }

    @Override // defpackage.qnc
    public List<? extends wpv> l() {
        return this.j.subList(0, Math.max(0, X()));
    }

    @Override // defpackage.qnc
    public Integer m() {
        if (this.j.isEmpty()) {
            return -1;
        }
        int size = l().size();
        return Integer.valueOf(size == 0 ? 0 : size + 1);
    }

    @Override // defpackage.qnc
    public List<? extends wpv> n() {
        return this.j.subList(Math.max(0, X()), this.j.size());
    }

    @Override // defpackage.qnc
    public boolean o() {
        return this.X.d();
    }

    @Override // defpackage.qnc
    public List<xia> p() {
        return this.W;
    }

    @Override // defpackage.qnc
    public xiv q() {
        return this.aj;
    }

    @Override // defpackage.qnc
    public ehz r() {
        return new ehz();
    }

    @Override // defpackage.qnc
    @dzsi
    public cjbq s() {
        if (!this.af.a()) {
            return null;
        }
        return this.ag;
    }

    @Override // defpackage.qne
    public dcdc<zdu> t() {
        bvoo.h("Getting summary steps from wrong viewmodel", new Object[0]);
        return H;
    }

    @Override // defpackage.qne
    public Boolean u() {
        return this.ab.u();
    }

    public didr v() {
        dido bZ = didr.f.bZ();
        amte amteVar = this.r;
        if (amteVar != null) {
            String c = amteVar.a.c();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            didr didrVar = (didr) bZ.b;
            c.getClass();
            didrVar.a |= 1;
            didrVar.b = c;
        }
        for (wsl wslVar : this.j) {
            if ((((didr) bZ.b).a & 4) == 0 && wslVar.b() != null && wslVar.c() != null) {
                didt bZ2 = didu.d.bZ();
                String b = wslVar.b();
                dbsk.s(b);
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                didu diduVar = (didu) bZ2.b;
                b.getClass();
                diduVar.a |= 1;
                diduVar.b = b;
                akqi c2 = wslVar.c();
                dbsk.s(c2);
                String o = c2.o();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                didu diduVar2 = (didu) bZ2.b;
                o.getClass();
                diduVar2.a |= 2;
                diduVar2.c = o;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                didr didrVar2 = (didr) bZ.b;
                didu bK = bZ2.bK();
                bK.getClass();
                didrVar2.d = bK;
                didrVar2.a |= 4;
            }
            if (wslVar.i() != null) {
                akqi i = wslVar.i();
                dbsk.s(i);
                String o2 = i.o();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                didr didrVar3 = (didr) bZ.b;
                o2.getClass();
                didrVar3.b();
                didrVar3.e.add(o2);
            }
        }
        return bZ.bK();
    }

    public void w(@dzsi acyu acyuVar) {
        this.K.e();
        this.t = acyuVar;
    }

    public void x(cqkp cqkpVar) {
        this.am = true;
        this.ak = cqkpVar;
        if (this.X.b()) {
            this.O.m(2);
        }
        c();
        if (this.t != null) {
            U();
            acyu acyuVar = this.t;
            dbsk.s(acyuVar);
            acyuVar.l(this.aq);
        }
    }

    public void y() {
        Z(false);
    }

    public void z() {
        this.am = false;
        this.ak = null;
        if (this.X.b()) {
            this.O.j();
        }
        d();
        acyu acyuVar = this.t;
        if (acyuVar != null) {
            acyuVar.m(this.aq);
        }
    }
}
