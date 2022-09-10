package defpackage;

import android.app.Activity;
import android.app.Application;
import android.support.v7.widget.RecyclerView;
import android.util.SparseIntArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: bsse  reason: default package */
/* loaded from: classes4.dex */
public class bsse implements bssu {
    private static final dcqe U = dcqe.c("bsse");
    private static final cqkp V = new bsry();
    static final bsob a = bsob.e(14);
    static final bsob b = bsob.e(15);
    static final bsob c = bsob.e(16);
    static final bsob d = bsob.e(17);
    static final bsob e = bsob.e(18);
    static final bsob f = bsob.e(19);
    static final bsob g = bsob.e(20);
    static final bsob h = bsob.e(5);
    static final bsob i = bsob.e(6);
    static final bsob j = bsob.e(7);
    static final bsob k = bsob.e(8);
    static final bsob l = bsob.e(9);
    static final bsob m = bsob.e(10);
    static final bsob n = bsob.e(11);
    static final bsob o = bsob.e(12);
    static final bsob p = bsob.e(13);
    static final bsob q = bsob.e(3);
    static final bsob r = bsob.e(21);
    public final cklq A;
    public final btrm B;
    public final dxio<bxtx> C;
    public final cvv D;
    public final cqkp E;
    public final bvpz F;
    public final brlk G;
    public boolean I;
    public final dehq M;
    public boolean N;
    public int O;
    public int P;
    @dzsi
    public bvpy Q;
    @dzsi
    public RecyclerView R;
    @dzsi
    public bqze S;
    private brzc W;
    @dzsi
    private brqd X;
    private final bsrc Y;
    @dzsi
    private bssq Z;
    private boolean aA;
    @dzsi
    private Integer aB;
    @dzsi
    private bsqn aC;
    private boolean aD;
    private brww aF;
    private final brww aG;
    private final dehq aH;
    @dzsi
    private cqqw aI;
    @dzsi
    private bsso aa;
    @dzsi
    private bssm ab;
    @dzsi
    private bsss ac;
    @dzsi
    private cqrh ad;
    @dzsi
    private cqfc ae;
    private final boolean af;
    private final boolean ag;
    @dzsi
    private final amsz ah;
    private final dzsj<cqg> ai;
    private final dxio<afha> aj;
    private final bnjv ak;
    private final bsne al;
    private final bsrg am;
    private final bsrb an;
    private final brwl ao;
    private final aeht ap;
    private final bsqx aq;
    private final dxio<akla> ar;
    private final jkf as;
    private final brwx at;
    private final bsqr au;
    private final bsop av;
    private final cjqy aw;
    private boolean az;
    public brlu s;
    public bsoi t;
    @dzsi
    public Runnable u;
    public final btvo v;
    public final cqat w;
    public final Application x;
    public final ckcw y;
    public final ckmp z;
    public Map<broh, cqkp> H = dcjz.d();
    private Map<cqkp, bsqz<cqkp>> ax = dcjz.d();
    private final Set<Integer> ay = new HashSet();
    public List<cqkp> J = new ArrayList();
    public List<cqix<?>> K = new ArrayList();
    private bssd aE = new bssd(221);
    final SparseIntArray L = new SparseIntArray();

    public bsse(Application application, btvo btvoVar, cqat cqatVar, ckcw ckcwVar, ckmp ckmpVar, cklq cklqVar, btrm btrmVar, Runnable runnable, bqze bqzeVar, Runnable runnable2, boolean z, boolean z2, brww brwwVar, amsz amszVar, bsop bsopVar, dzsj dzsjVar, dxio dxioVar, bnjv bnjvVar, bsne bsneVar, bsrg bsrgVar, bsrb bsrbVar, brwl brwlVar, aeht aehtVar, bsqx bsqxVar, dxio dxioVar2, dxio dxioVar3, jkf jkfVar, cvv cvvVar, brwx brwxVar, bsrd bsrdVar, bsqr bsqrVar, dehq dehqVar, dehq dehqVar2, cjqy cjqyVar, bvpz bvpzVar, brlk brlkVar) {
        this.x = application;
        this.v = btvoVar;
        this.w = cqatVar;
        this.y = ckcwVar;
        this.z = ckmpVar;
        this.A = cklqVar;
        this.B = btrmVar;
        this.af = z;
        this.ag = z2;
        this.ah = amszVar;
        this.u = runnable;
        this.S = bqzeVar;
        this.ai = dzsjVar;
        this.aj = dxioVar;
        this.ak = bnjvVar;
        this.al = bsneVar;
        this.am = bsrgVar;
        this.an = bsrbVar;
        this.ao = brwlVar;
        this.aq = bsqxVar;
        this.ap = aehtVar;
        this.C = dxioVar2;
        this.ar = dxioVar3;
        this.as = jkfVar;
        this.D = cvvVar;
        this.at = brwxVar;
        this.aF = brwwVar;
        this.aG = brwwVar;
        this.au = bsqrVar;
        this.M = dehqVar;
        this.aH = dehqVar2;
        bsql a2 = bsrdVar.a.a();
        bsrd.a(a2, 2);
        dxio a3 = ((dxjh) bsrdVar.b).a();
        bsrd.a(a3, 3);
        this.Y = new bsrc(runnable2, a2, a3);
        this.E = new bsrz();
        this.av = bsopVar;
        this.aw = cjqyVar;
        this.F = bvpzVar;
        this.G = brlkVar;
    }

    private final void D(brlu brluVar) {
        if (this.J.isEmpty() || !this.az) {
            this.aq.b();
        } else {
            this.aq.a(brluVar);
        }
        this.K = x();
        if (!this.I) {
            ((ckhe) this.y.a(ckjw.E)).c();
            ((ckhe) this.y.a(ckjw.D)).c();
            ((ckhe) this.y.a(ckjw.C)).c();
        }
    }

    private final void E(final int i2) {
        brlu brluVar = this.s;
        if (brluVar == null || i2 < 0 || i2 >= brluVar.E()) {
            return;
        }
        Set<Integer> set = this.ay;
        Integer valueOf = Integer.valueOf(i2);
        if (set.contains(valueOf)) {
            return;
        }
        this.ay.add(valueOf);
        brlu brluVar2 = this.s;
        dbsk.s(brluVar2);
        final broh D = brluVar2.D(i2);
        final ilo iloVar = (ilo) bwrs.b(D.a);
        final boolean i3 = this.s.o.i(3);
        final dehn c2 = this.aH.c(new Callable(this, D, i3) { // from class: bsrr
            private final bsse a;
            private final broh b;
            private final boolean c;

            {
                this.a = this;
                this.b = D;
                this.c = i3;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.w(this.b, this.c);
            }
        });
        c2.Pk(new Runnable(this, iloVar, c2, i2, D) { // from class: bsrs
            private final bsse a;
            private final ilo b;
            private final dehn c;
            private final int d;
            private final broh e;

            {
                this.a = this;
                this.b = iloVar;
                this.c = c2;
                this.d = i2;
                this.e = D;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bsse bsseVar = this.a;
                ilo iloVar2 = this.b;
                dehn dehnVar = this.c;
                int i4 = this.d;
                broh brohVar = this.e;
                if (iloVar2 == null) {
                    return;
                }
                try {
                    cqkp cqkpVar = (cqkp) deha.r(dehnVar);
                    int i5 = bsseVar.L.get(i4, -1);
                    if (i5 >= bsseVar.J.size() || i5 < 0) {
                        return;
                    }
                    bsseVar.J.set(i5, cqkpVar);
                    bsseVar.H.put(brohVar, cqkpVar);
                    bsseVar.K = bsseVar.x();
                    cqkx.p(bsseVar);
                    bsoi bsoiVar = bsseVar.t;
                    if (bsoiVar == null || !(cqkpVar instanceof brwk)) {
                        return;
                    }
                    bsoh bsohVar = bsoiVar.h;
                    brwk brwkVar = (brwk) cqkpVar;
                    deha.q(bsohVar.b.c(new Callable(bsohVar, brwkVar, bsoiVar.x, bsoiVar.A, bsoiVar.t, bsoiVar.u) { // from class: bsof
                        private final bsoh a;
                        private final brwk b;
                        private final boolean c;
                        private final int d;
                        private final Runnable e;
                        private final Runnable f;

                        {
                            this.a = bsohVar;
                            this.b = brwkVar;
                            this.c = r3;
                            this.d = r4;
                            this.e = r5;
                            this.f = r6;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.a.a(this.b, this.c, this.d, this.e, this.f);
                        }
                    }), new bsog(bsohVar, i4, bsseVar, brwkVar), dege.a);
                } catch (ExecutionException e2) {
                    e2.getMessage();
                }
            }
        }, this.M);
    }

    private final void F(brln brlnVar, brlu brluVar) {
        if (this.X == null) {
            this.X = new brqd(this.x.getApplicationContext());
        }
        this.X.p(Boolean.valueOf(brluVar.an() != null));
        this.Y.a(brlnVar, brluVar);
        this.ab = new bsqy(brluVar, this.x.getResources(), this.w);
        this.ac = new bsrh(this.x.getApplicationContext(), brluVar, this.aj, this.W);
        dwij ax = brluVar.ax();
        bsrg bsrgVar = this.am;
        Activity activity = (Activity) ((dxjd) bsrgVar.a).a;
        bsrg.a(activity, 1);
        jkf a2 = bsrgVar.b.a();
        bsrg.a(a2, 2);
        bsqw a3 = bsrgVar.c.a();
        bsrg.a(a3, 3);
        this.Z = new bsrf(activity, a2, a3, ax);
        bsra bsraVar = null;
        if (brluVar.ay() && ax != null) {
            bsrb bsrbVar = this.an;
            Activity activity2 = (Activity) ((dxjd) bsrbVar.a).a;
            bsrb.a(activity2, 1);
            cklf a4 = bsrbVar.b.a();
            bsrb.a(a4, 2);
            bsrb.a(ax, 3);
            bsraVar = new bsra(activity2, a4, ax);
        }
        this.aa = bsraVar;
    }

    private final cqkp G(broh brohVar) {
        cqkp cqkpVar;
        bwrs<ilo> bwrsVar = brohVar.a;
        if (this.H.containsKey(brohVar)) {
            cqkpVar = this.H.get(brohVar);
        } else {
            cqkpVar = cqkp.T;
        }
        if ((cqkpVar instanceof brwk) && bwrsVar != null) {
            ((brwk) cqkpVar).QR(bwrsVar);
        }
        return cqkpVar;
    }

    private static <V extends cqkp> void H(List<cqix> list, cqiw<V> cqiwVar, V v) {
        list.add(cqgr.fT(cqiwVar, v));
    }

    private static <V extends cqkp> void I(List<cqix> list, cqiw<V> cqiwVar, V v) {
        list.add(cqgr.fT(new brkp(cqiwVar), new bsqz(v, true)));
    }

    private static <V extends cqkp> void J(List<cqix> list, brkp<V> brkpVar, bssn<V> bssnVar) {
        list.add(cqgr.fT(brkpVar, bssnVar));
    }

    private final void K(List<cqkp> list, brlu brluVar) {
        final bryf a2;
        dkee ar = brluVar.ar();
        if (list.isEmpty()) {
            return;
        }
        if ((!dkee.DINING.equals(ar) && this.aF.equals(brww.ANY)) || (a2 = this.at.a(this.aF, brluVar, list)) == null) {
            return;
        }
        a2.i(new brye(this, a2) { // from class: bsrv
            private final bsse a;
            private final bryf b;

            {
                this.a = this;
                this.b = a2;
            }

            @Override // defpackage.brye
            public final void a() {
                bsse bsseVar = this.a;
                bsseVar.J.remove(this.b);
                bsseVar.K = bsseVar.x();
                cqkx.p(bsseVar);
            }
        });
    }

    private final void L(List<cqkp> list, brlu brluVar) {
        if (!this.v.getUgcParameters().p() || brluVar.ay() || this.af || this.ag) {
            return;
        }
        if (list.isEmpty()) {
            this.aB = null;
        } else {
            Integer num = this.aB;
            if (num == null || num.intValue() > list.size()) {
                this.aB = Integer.valueOf(list.size());
            }
        }
        if (this.aB == null) {
            return;
        }
        if (this.aC == null) {
            this.aC = new bsqn(this.ai, this.v);
        }
        list.add(this.aB.intValue(), this.aC);
    }

    private final void M(brlu brluVar, List<cqkp> list) {
        diiw diiwVar;
        diiw diiwVar2;
        bsrn bsrnVar = new bsrn();
        dhyf ad = brluVar.ad();
        cqkp cqkpVar = null;
        if (ad != null && ad.a == 1) {
            if (((diiw) ad.b).c) {
                cqkpVar = new bsqs(dtxl.q);
            } else {
                akla a2 = this.ar.a();
                if (ad.a == 1) {
                    diiwVar2 = (diiw) ad.b;
                } else {
                    diiwVar2 = diiw.d;
                }
                dhxw dhxwVar = diiwVar2.a;
                if (dhxwVar == null) {
                    dhxwVar = dhxw.d;
                }
                cqkpVar = a2.c(dhxwVar);
                if (cqkpVar == null) {
                    bvoo.h("(ttd-team): EventCardProvider.getCardsAsListViewModel() could not interpret the event cards returnd in the response: %s", ad);
                }
            }
        }
        if (cqkpVar != null) {
            if (ad.a == 1) {
                diiwVar = (diiw) ad.b;
            } else {
                diiwVar = diiw.d;
            }
            bsrnVar.a(diiwVar.b, cqkpVar);
        }
        djrs ac = brluVar.ac();
        if (ac != null) {
            bsrnVar.a(ac.c, this.al.a(ac, dtyb.ey, dtyb.ez, false));
        }
        djrs ae = brluVar.ae();
        if (ae != null) {
            if (!this.v.getEnableFeatureParameters().ba) {
                bsrnVar.a(ae.c, this.al.a(ae, dtyb.eA, dtyb.eB, false));
            } else {
                bsrnVar.a(ae.c, new bsqs(dtyb.eA));
            }
        }
        djrs af = brluVar.af();
        if (af != null) {
            if (!this.v.getCategoricalSearchParameters().C()) {
                bsrnVar.a(af.c, this.al.a(af, dtyb.aI, dtyb.aH, true));
            } else {
                bsrnVar.a(af.c, new bsqs(dtyb.aI));
            }
        }
        dpns ag = brluVar.ag();
        if (ag != null) {
            dkiy enableFeatureParameters = this.v.getEnableFeatureParameters();
            if (enableFeatureParameters.k == 406 && ((Boolean) enableFeatureParameters.l).booleanValue()) {
                bsrnVar.a(ag.c, new bsqs(dtxl.S));
            } else {
                int i2 = ag.c;
                bsqr bsqrVar = this.au;
                gga a3 = bsqrVar.a.a();
                bsqr.a(a3, 1);
                bjhc a4 = bsqrVar.b.a();
                bsqr.a(a4, 2);
                bjbu a5 = bsqrVar.c.a();
                bsqr.a(a5, 3);
                bsqr.a(ag, 4);
                bsrnVar.a(i2, new bsqq(a3, a4, a5, ag));
            }
        }
        for (Map.Entry<Integer, cqkp> entry : bsrnVar.a.entrySet()) {
            list.add(entry.getKey().intValue(), entry.getValue());
        }
    }

    private final boolean N(int i2) {
        brlu brluVar = this.s;
        return (brluVar == null ? 0 : brluVar.aF()) == i2;
    }

    public final void A(ckhf ckhfVar) {
        ((ckhe) this.y.a(ckhfVar)).a();
    }

    @dzsi
    public final cjqm B() {
        RecyclerView recyclerView = this.R;
        cjqm cjqmVar = null;
        cjql e2 = recyclerView == null ? null : cjqg.e(recyclerView);
        if (e2 != null) {
            cjqmVar = this.aw.n(e2, new cjte(deaf.SWIPE, this.P > 0 ? dead.DOWN : dead.UP), y());
        }
        this.O = 0;
        this.P = 0;
        return cjqmVar;
    }

    public void C() {
        this.u = null;
        this.S = null;
        this.Y.b();
    }

    public void a(brln brlnVar, brlu brluVar, bsoi bsoiVar) {
        cqkp w;
        this.s = brluVar;
        this.t = bsoiVar;
        v();
        int i2 = 0;
        if (this.s != null) {
            djmu bZ = djmv.c.bZ();
            djnp bZ2 = djnr.c.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            djnr djnrVar = (djnr) bZ2.b;
            djnrVar.b = 11;
            djnrVar.a |= 1;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djmv djmvVar = (djmv) bZ.b;
            djnr bK = bZ2.bK();
            bK.getClass();
            djmvVar.b = bK;
            djmvVar.a = 10;
            if (this.s.o.h(17, bZ.bK().bR())) {
                this.aF = brww.PERSONAL_SCORE;
            } else {
                this.aF = this.s.o.s() ? brww.ELECTRIC_VEHICLE_PROFILE : this.aG;
            }
        }
        this.az = N(8) || N(9);
        this.I = brluVar.ah();
        this.aD = brluVar.aj();
        if (this.az) {
            this.ap.h(this.I);
        }
        if (!this.G.f()) {
            F(brlnVar, brluVar);
            brlu brluVar2 = brluVar.al() ? new brlu() : brluVar;
            ArrayList arrayList = new ArrayList();
            this.ay.clear();
            for (int i3 = 0; i3 < brluVar2.E(); i3++) {
                broh D = brluVar2.D(i3);
                ilo iloVar = (ilo) bwrs.b(D.a);
                if (this.H.containsKey(D)) {
                    this.ay.add(Integer.valueOf(i3));
                    cqkp G = G(D);
                    if (G != null) {
                        arrayList.add(G);
                    }
                } else if (iloVar != null) {
                    arrayList.add(new bssb(i3));
                }
            }
            K(arrayList, brluVar2);
            L(arrayList, brluVar2);
            M(brluVar2, arrayList);
            this.L.clear();
            int i4 = 0;
            while (i2 < arrayList.size()) {
                cqkp cqkpVar = arrayList.get(i2);
                if (!(cqkpVar instanceof brwk)) {
                    if (cqkpVar instanceof bssr) {
                        this.L.append(i4, i2);
                    } else {
                        i2++;
                    }
                }
                i4++;
                i2++;
            }
            this.J = arrayList;
            D(brluVar);
            bsoiVar.n(this, brluVar);
            cqkx.p(this);
            if (!bsoiVar.G) {
                return;
            }
            bsoiVar.j();
            bsoiVar.u(bsoiVar.x(bsoiVar.A()), true, true);
            cqhn cqhnVar = bsoiVar.c;
            cqkx.p(bsoiVar.s());
            bsoiVar.r();
            return;
        }
        F(brlnVar, brluVar);
        brlu brluVar3 = brluVar.al() ? new brlu() : brluVar;
        ArrayList arrayList2 = new ArrayList();
        this.aA = false;
        boolean i5 = brluVar3.o.i(3);
        HashMap d2 = dcjz.d();
        while (i2 < brluVar3.E()) {
            broh D2 = brluVar3.D(i2);
            if (this.H.containsKey(D2)) {
                w = G(D2);
            } else {
                w = w(D2, i5);
            }
            if (w != null && w != cqkp.T) {
                d2.put(D2, w);
                arrayList2.add(w);
            }
            i2++;
        }
        K(arrayList2, brluVar3);
        L(arrayList2, brluVar3);
        M(brluVar3, arrayList2);
        this.H = d2;
        this.J = arrayList2;
        D(brluVar);
    }

    @Override // defpackage.bssu
    public cqkp b() {
        return this.E;
    }

    public void c(brzc brzcVar) {
        this.W = brzcVar;
    }

    @Override // defpackage.bssu
    public cqrh d() {
        if (this.ad == null) {
            this.ad = new bssa(this);
        }
        return this.ad;
    }

    public void e(int i2) {
        E(i2);
        E(i2 - 1);
        E(i2 + 1);
    }

    @Override // defpackage.bssu
    public cqfc f() {
        if (this.ae == null) {
            this.ae = new cqfc(this) { // from class: bsrt
                private final bsse a;

                {
                    this.a = this;
                }

                @Override // defpackage.cqfc
                public final void a(View view, boolean z) {
                    for (Object obj : this.a.p()) {
                        if (obj instanceof brvd) {
                            obj = ((brvd) obj).A();
                        }
                        if ((obj instanceof bnju) && ((bnju) obj).aI()) {
                            return;
                        }
                    }
                }
            };
        }
        return this.ae;
    }

    @Override // defpackage.bssu
    public Boolean g() {
        brlu brluVar;
        boolean z = true;
        if ((!this.I || !this.J.isEmpty()) && (((brluVar = this.s) == null || !brluVar.T() || this.s.U() >= 200) && !this.aD)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public Boolean h() {
        brlu brluVar = this.s;
        boolean z = false;
        if (brluVar != null && brluVar.d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @dzsi
    public bssq i() {
        return this.Z;
    }

    @dzsi
    public jam j() {
        return this.X;
    }

    @Override // defpackage.bssu
    public bssp k() {
        return this.Y;
    }

    @Override // defpackage.bssu
    public Boolean l() {
        return this.Y.c();
    }

    @dzsi
    public bssm m() {
        return this.ab;
    }

    @dzsi
    public bsss n() {
        brlu brluVar = this.s;
        if (brluVar == null || brluVar.aE() == null) {
            return this.ac;
        }
        return null;
    }

    @dzsi
    public bsso o() {
        return this.aa;
    }

    @Override // defpackage.bssu
    public List<cqkp> p() {
        return this.J;
    }

    @Override // defpackage.bssu
    public List<cqix<?>> q() {
        return this.K;
    }

    @Override // defpackage.bssu
    public Boolean r() {
        return Boolean.valueOf(this.as.l().L() == jjn.FULLY_EXPANDED);
    }

    public Boolean s() {
        return Boolean.valueOf(this.aA);
    }

    public boolean t() {
        amsz amszVar = this.ah;
        return amszVar != null && amszVar.d == amvi.ATTACH_PARKING;
    }

    public boolean u() {
        if (!t()) {
            return false;
        }
        amsz amszVar = this.ah;
        return vyr.h(amszVar.e[amszVar.c]).equals(dpzh.HAS_PARKING);
    }

    public void v() {
        if (this.s == null) {
            return;
        }
        int i2 = this.x.getResources().getConfiguration().orientation;
        int i3 = 221;
        if (brwd.aB(this.s.ar()) && i2 != 2) {
            i3 = 600;
        }
        this.aE = new bssd(i3);
    }

    public final cqkp w(broh brohVar, boolean z) {
        ddho ddhoVar;
        ddho ddhoVar2;
        brlu brluVar;
        int i2;
        if (!this.aA && brohVar.c() && bfdq.a(brohVar.d().ac(), this.w)) {
            this.aA = true;
        }
        cqkp cqkpVar = cqkp.T;
        bwrs<ilo> bwrsVar = brohVar.a;
        final ilo iloVar = (ilo) bwrs.b(bwrsVar);
        if (iloVar != null) {
            begh beghVar = new begh();
            boolean z2 = iloVar.aM() || iloVar.aP();
            if (this.v.getCategoricalSearchParameters().e() && !this.az && !z2 && (i2 = iloVar.G) > 0 && i2 <= 99) {
                beghVar.f = i2;
            }
            bnjs a2 = this.ak.a(iloVar);
            a2.c(true);
            a2.o = beghVar;
            a2.l = this.ah;
            a2.e = N(6);
            if (z) {
                Application application = this.x;
                cqat cqatVar = this.w;
                bydl g2 = bydm.g(application.getApplicationContext());
                g2.b(ibm.S().b(this.x.getApplicationContext()));
                a2.m = new bydt(application, cqatVar, g2.a());
            }
            if (!iloVar.bX().n.isEmpty() && (brluVar = this.s) != null && brluVar.o.q()) {
                a2.j = true;
                a2.f = true;
                a2.k = iloVar.bX().n.get(0).b;
            }
            brwl brwlVar = this.ao;
            Runnable runnable = new Runnable(this, iloVar) { // from class: bsru
                private final bsse a;
                private final ilo b;

                {
                    this.a = this;
                    this.b = iloVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int n2;
                    String bK;
                    bsse bsseVar = this.a;
                    ilo iloVar2 = this.b;
                    brlu brluVar2 = bsseVar.s;
                    if (brluVar2 != null && (n2 = brluVar2.n(iloVar2)) >= 0) {
                        bsseVar.A(ckjw.B);
                        bsseVar.z.a(ckmk.SEARCH_LIST_ITEM_CLICK_TO_FINAL_PLACE_SHEET);
                        bsseVar.A.a(ckls.SEARCH_LIST_ITEM_CLICKED);
                        ((ckco) bsseVar.y.a(ckjw.m)).a(0);
                        bsseVar.C.a().f(iloVar2, 1);
                        bsseVar.B.b(new bwka(iloVar2, null, 4, bsseVar.w));
                        bsseVar.s.s(n2);
                        Runnable runnable2 = bsseVar.u;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                        if (!iloVar2.aM() || !bsseVar.v.getAdsParameters().g || (bK = iloVar2.bK()) == null) {
                            return;
                        }
                        bsseVar.D.c(bK, 7803, 41);
                    }
                }
            };
            brlu brluVar2 = this.s;
            dbsk.s(brluVar2);
            dkee ar = brluVar2.ar();
            boolean q2 = this.s.o.q();
            djmu bZ = djmv.c.bZ();
            djnp bZ2 = djnr.c.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            djnr djnrVar = (djnr) bZ2.b;
            djnrVar.b = 2;
            djnrVar.a |= 1;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djmv djmvVar = (djmv) bZ.b;
            djnr bK = bZ2.bK();
            bK.getClass();
            djmvVar.b = bK;
            djmvVar.a = 10;
            djmv bK2 = bZ.bK();
            brlu brluVar3 = this.s;
            boolean z3 = brluVar3 != null && brluVar3.o.h(17, bK2.bR());
            boolean z4 = this.ah != null && !t();
            dcdc<dqfg> dcdcVar = this.s.p;
            if (iloVar.aM()) {
                ddhoVar = dtyb.bv;
            } else {
                ddhoVar = this.af ? dtxk.j : dtyb.aP;
            }
            ddho ddhoVar3 = ddhoVar;
            if (iloVar.aM()) {
                ddhoVar2 = dtyb.bG;
            } else {
                ddhoVar2 = this.af ? dtxk.k : dtyb.bN;
            }
            brwk a3 = brwlVar.a(a2, runnable, ar, q2, z3, z4, dcdcVar, ddhoVar3, ddhoVar2);
            dbsk.s(bwrsVar);
            a3.QR(bwrsVar);
            return a3;
        }
        return cqkpVar;
    }

    public final List<cqix<?>> x() {
        bsqz<cqkp> bsqzVar;
        ArrayList arrayList = new ArrayList();
        this.av.a.clear();
        ArrayList arrayList2 = new ArrayList();
        brkk brkkVar = new brkk();
        cqkp cqkpVar = V;
        H(arrayList2, brkkVar, cqkpVar);
        this.av.a(h);
        if (h().booleanValue()) {
            I(arrayList2, new brjd(), cqkpVar);
            this.av.a(i);
        }
        bssq i2 = i();
        if (i2 != null && i2.b().booleanValue()) {
            H(arrayList2, new brjh(), i2);
            this.av.a(j);
        }
        jam j2 = j();
        if (j2 != null && j2.a().booleanValue()) {
            H(arrayList2, new brqa(), j2);
            this.av.a(k);
        }
        bsss n2 = n();
        if (n2 != null && n2.g().booleanValue()) {
            I(arrayList2, akny.a(n2.c().K, dpwt.EVENT_CATEGORY_CRISIS.K) ? new befo() : new befh(), n2);
            this.av.a(l);
        }
        bssm m2 = m();
        if (m2 != null && m2.b().booleanValue()) {
            I(arrayList2, new brhx(), m2);
            this.av.a(m);
        }
        if (u()) {
            I(arrayList2, new brjg(), cqkpVar);
            this.av.a(n);
        }
        if (!this.J.isEmpty() && this.az) {
            H(arrayList2, new brhy(), this.aq);
            this.av.a(o);
        }
        bsso o2 = o();
        if (o2 != null) {
            H(arrayList2, new bria(), o2);
            this.av.a(p);
        } else if (this.Y.c().booleanValue()) {
            H(arrayList2, new brjc(), this.Y);
            this.av.a(q);
        }
        arrayList.addAll(arrayList2);
        int size = this.ax.size() - 1;
        HashMap d2 = dcjz.d();
        List<cqkp> p2 = p();
        int i3 = 0;
        while (i3 < p2.size()) {
            cqkp cqkpVar2 = p2.get(i3);
            int i4 = 1;
            if (!this.ax.containsKey(cqkpVar2)) {
                bsqzVar = new bsqz<>(cqkpVar2, i3 != p2.size() + (-1));
            } else {
                bsqzVar = this.ax.get(cqkpVar2);
                if (i3 == size) {
                    bsqzVar.c(true);
                }
            }
            if (!(bsqzVar.a() instanceof bssr)) {
                d2.put(cqkpVar2, bsqzVar);
            }
            cqkp a2 = bsqzVar.a();
            if (a2 instanceof brve) {
                brve brveVar = (brve) a2;
                J(arrayList, new brkp(new brua()), bsqzVar);
                if (true == brveVar.A().L().booleanValue()) {
                    i4 = 2;
                }
                jba A = brveVar.A();
                akqi akqiVar = null;
                bnju bnjuVar = A instanceof bnju ? (bnju) A : null;
                if (bnjuVar != null) {
                    akqiVar = bnjuVar.aH().ai();
                }
                if (akqiVar == null) {
                    this.av.a(bsob.e(i4));
                } else {
                    this.av.a(bsob.d(i4, akqiVar));
                }
            } else if (a2 instanceof bssi) {
                J(arrayList, new brkp(new brho()), bsqzVar);
                this.av.a(a);
            } else if (a2 instanceof bssj) {
                J(arrayList, new brkp(new brhq()), bsqzVar);
                this.av.a(b);
            } else if (a2 instanceof bsmy) {
                J(arrayList, new brkp(new bsmq(false)), bsqzVar);
                this.av.a(c);
            } else if (a2 instanceof acil) {
                J(arrayList, new brkp(new achm()), bsqzVar);
                this.av.a(d);
            } else if (a2 instanceof brgr) {
                J(arrayList, new brkp(new breu()), bsqzVar);
                this.av.a(e);
            } else if (a2 instanceof bryf) {
                J(arrayList, new brkp(new brya()), bsqzVar);
                this.av.a(f);
            } else if (a2 instanceof akle) {
                J(arrayList, new brkp(new akjr()), bsqzVar);
                this.av.a(g);
            } else if (a2 instanceof bssk) {
                bsqzVar.c(false);
                J(arrayList, new brkp(new brhv()), bsqzVar);
            } else if (a2 instanceof bssr) {
                J(arrayList, new brkp(this.aE), bsqzVar);
                this.av.a(r);
            }
            i3++;
        }
        this.ax = d2;
        return arrayList;
    }

    @Override // defpackage.bssu
    public cjtd y() {
        return cjtd.a(dtyb.aN);
    }

    @Override // defpackage.bssu
    public cqqw z() {
        if (this.aI == null) {
            this.aI = new bssc(this);
        }
        return this.aI;
    }
}
