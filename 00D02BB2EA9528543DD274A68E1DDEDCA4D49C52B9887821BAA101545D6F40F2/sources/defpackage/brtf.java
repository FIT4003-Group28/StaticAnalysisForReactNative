package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.maps.R;
import defpackage.brvd;
import java.util.List;
/* compiled from: PG */
/* renamed from: brtf  reason: default package */
/* loaded from: classes4.dex */
public class brtf<V extends brvd> extends cqiw<V> {
    public static final brkj b = new brkj();
    public static final cqjg c = cqjg.a();
    public static final cqjg d = cqjg.a();
    public static final cqjg e = cqjg.a();
    public static final cqjg f = cqjg.a();
    public static final cqjg g = cqjg.a();

    /* JADX INFO: Access modifiers changed from: protected */
    public brtf(Object... objArr) {
        super(objArr);
    }

    private final cqmj<V> J() {
        return cqgr.gq(cqgr.aR(Integer.valueOf((int) R.id.title)), cqgr.eN(5), ibq.f(), ibq.v(), cqgr.cB(((brvd) B()).Qy()), cqgr.aZ(false), cqgr.co(cqrp.f(2.0d), false), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eI(((brvd) B()).A().g()), cqgr.R(((brvd) B()).Q()));
    }

    public static Boolean v(brvd brvdVar) {
        if (cqjv.v(brvdVar.A().aj()).booleanValue()) {
            return true;
        }
        if ((!brvdVar.A().L().booleanValue() || brvdVar.A().M().booleanValue()) && !brvdVar.A().N().booleanValue()) {
            return true;
        }
        return false;
    }

    private final <T extends brvd> cqmm<T, brvd> x(cqiw<brvd> cqiwVar, Integer num) {
        return cqgr.fO(cqiwVar, (brvd) B(), cqic.d(cqjv.A(((brvd) B()).C(), num), new cqmp[0]));
    }

    @Override // defpackage.cqiw
    public cqmj<V> a() {
        cqmj<V> p = p();
        p.g(cqgr.cU(((brvd) B()).q()));
        return p;
    }

    protected cqmp<V> e() {
        return (cqmp<V>) cqmp.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public cqmj<V> f() {
        cqmp fO;
        cqmp[] cqmpVarArr = new cqmp[5];
        cqmpVarArr[0] = cqgr.cd(-1);
        cqmpVarArr[1] = cqgr.gc(cqgr.aG(((brvd) B()).K()), cqgr.bw(16), cqgr.ce(cqrp.d(20.0d)), cqgr.bq(cqrp.d(15.0d)), cqgr.bG(ibn.d()), cqgr.aR(Integer.valueOf((int) R.id.offline_icon)), cqgr.eE(itd.d(ibm.n())));
        cqmj<V> J = J();
        Float valueOf = Float.valueOf(1.0f);
        J.f(cqgr.cd(0), cqgr.ca(valueOf), cqic.f(brtb.a, new cqmp[0]));
        cqmpVarArr[2] = J;
        cqmpVarArr[3] = cye.a(cqic.c(brtc.a, new cqmp[0]), cqgr.cd(0), cqgr.ca(valueOf), J(), cqgr.fQ(new cyc(), ((brvd) B()).A().aj(), cqgr.aG(cqjv.t(((brvd) B()).A().L(), ((brvd) B()).A().N())), cqgr.bV(cqrp.d(-13.0d))));
        bfgs N = ((brvd) B()).N();
        if (((btvq) btsr.a(btvq.class)).rp().getPlaceSheetParameters().ae()) {
            fO = cqgr.fY(cqic.a(cqjv.t(cqjv.v(N), cqjv.u(N.a())), new cqmp[0]), cqgr.fO(new bfgn(), N, cqgr.bw(16), cqgr.bR(ibn.f())));
        } else {
            fO = cqgr.fO(new bfgn(), N, cqgr.bw(16), cqgr.bR(ibn.f()), cqgr.aD(cqjv.t(cqjv.v(N), cqjv.u(N.a()))));
        }
        cqmpVarArr[4] = fO;
        return cqgr.gd(cqmpVarArr);
    }

    public cqmp<V> g(cqmp<V>... cqmpVarArr) {
        cqmj fY = cqgr.fY(cqgr.aT(c), cqjv.k(((brvd) B()).B(), cqgr.ce(cqrp.d(dcyn.a)), cqgr.cd(-1)), cqgr.bq(((brvd) B()).e()), cqic.d(((brvd) B()).Qx(), new cqmp[0]), h(), w());
        fY.f(cqmpVarArr);
        return fY;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public cqmp<V> h() {
        return cqgr.fO(bfka.e(238, 152, true), ((brvd) B()).m(), cqgr.bp(-1));
    }

    protected cqmp<V> i() {
        return cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), cqgr.dQ(ibn.f()), cqgr.dF(ibn.f()), cqgr.dU(cqrp.d(6.0d)), cqic.c(brta.a, new cqmp[0]), cqgr.gd(cqgr.dr(1), cqgr.ck(D(0))));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public cqmp<V> j() {
        return (cqmp<V>) cqmp.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public cqmj<V> k() {
        bfmg ad = ((brvd) B()).ad();
        iie q = iif.s().q();
        q.b(1);
        q.f(cqrp.d(12.0d));
        q.c(cqrp.d(12.0d));
        q.e(cqrp.d(16.0d));
        q.d(cqrp.d(16.0d));
        q.i(cqrp.d(dcyn.a));
        q.o(cqrp.d(265.0d));
        q.l(cqrp.d(64.0d));
        q.j(cqrp.d(8.0d));
        q.k(cqrp.d(dcyn.a));
        q.h(ibm.Z());
        cqmp[] cqmpVarArr = {cqic.a(cqjv.v(ad), new cqmp[0]), cqgr.fO(new actj(q.a()), ad, new cqmp[0])};
        cqmp[] cqmpVarArr2 = {cqgr.aG(((brvd) B()).ab()), cqgr.bV(cqrp.d(12.0d)), cqgr.bD(cqrp.d(12.0d)), cqgr.dQ(ibn.f()), cqgr.dF(ibn.f()), cqgr.ck(D(2))};
        cqmp[] cqmpVarArr3 = {cqic.a(cqjv.v(((brvd) B()).ac()), new cqmp[0]), cqgr.bV(cqrp.d(12.0d)), cqgr.bD(cqrp.d(12.0d)), cqgr.dQ(ibn.f()), cqgr.dF(ibn.f()), cqgr.fQ(new cjhd(), ((brvd) B()).ac(), new cqmp[0])};
        beta betaVar = new beta();
        betc ae = ((brvd) B()).ae();
        dbsk.s(ae);
        cqmp[] cqmpVarArr4 = {cqic.a(cqjv.v(((brvd) B()).ae()), new cqmp[0]), cqgr.dQ(ibn.f()), cqgr.dF(ibn.f()), cqgr.fO(betaVar, ae, new cqmp[0])};
        bmak bmakVar = new bmak(new cqmp[0]);
        bmbf ag = ((brvd) B()).ag();
        dbsk.s(ag);
        cqmp[] cqmpVarArr5 = {cqic.a(cqjv.v(((brvd) B()).ag()), new cqmp[0]), cqgr.fO(bmakVar, ag, cqgr.dQ(ibn.f()), cqgr.dF(ibn.f()), cqgr.dU(ibn.d()), cqgr.dB(ibn.e()))};
        Boolean u = cqjv.u(cqjv.v(((brvd) B()).L()));
        brvc L = ((brvd) B()).L();
        dbsk.s(L);
        cqmp[] cqmpVarArr6 = {cqic.a(cqjv.s(cqjv.v(((brvd) B()).af()), cqjv.r(u, L.a()), ((brvd) B()).g(), ((brvd) B()).ab(), ((brvd) B()).A().L(), ((brvd) B()).A().N(), E()), new cqmp[0]), cqgr.fO(new brtd(), ((brvd) B()).af(), new cqmp[0])};
        cqmj<V> t = t();
        t.f(cqgr.aD(((brvd) B()).D()));
        return cqgr.gd(cqgr.aT(f), cqgr.dr(1), cqgr.bp(-2), cqgr.cd(-1), cqgr.fY(cqmpVarArr), u((brvd) B()), cqgr.fY(cqmpVarArr2), cqgr.fY(cqmpVarArr3), cqgr.fY(cqmpVarArr4), i(), cqgr.fY(cqmpVarArr5), cqgr.fY(cqmpVarArr6), t);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public cqmj<V> l() {
        return cqgr.gd(cqgr.aT(g), cqgr.cd(-1), cqgr.bp(-2), j());
    }

    protected cqmj<V> m() {
        return cqgr.fY(cqgr.cd(-1), cqgr.bq(cqrp.d(87.0d)), cqgr.dB(ibn.f()), cqgr.gg(irn.A(), cqgr.bw(8388627)));
    }

    protected cqmp<V> n() {
        return cqgr.fY(cqgr.cd(-2), cqgr.bp(-2), cqgr.bY(cqjd.m(c), cqjd.f()), cqgr.fY(cqic.d(cqjv.A(((brvd) B()).E(), 1), new cqmp[0]), cqgr.fO(new aeoy(), ((brvd) B()).G(), new cqmp[0])));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    /* renamed from: o */
    public void RI(int i, brvd brvdVar, Context context, cqiv cqivVar) {
        cqiw brhwVar;
        cqix<? extends aklb> aa;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 || (aa = brvdVar.aa()) == null) {
                    return;
                }
                cqivVar.e(aa);
                return;
            }
            List<? extends bevj> R = brvdVar.A().R();
            if (R == null) {
                return;
            }
            for (int i2 = 0; i2 < R.size(); i2++) {
                cqivVar.a(new bevg(), R.get(i2));
            }
            return;
        }
        boolean z = true;
        for (jaz jazVar : brvdVar.P()) {
            boolean booleanValue = jazVar.i().booleanValue();
            if (!z && booleanValue) {
                cqivVar.c(new brte());
            }
            int intValue = jazVar.l().intValue();
            if (intValue == 1) {
                brhwVar = new brhw();
            } else if (intValue == 2) {
                brhwVar = new brhu();
            } else if (intValue == 3) {
                brhwVar = new brji();
            } else {
                brhwVar = new brji(irn.m());
            }
            cqivVar.a(brhwVar, jazVar);
            z &= !booleanValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final cqmj<V> p() {
        cqmj<V> r = r();
        r.f(cqgr.bY(cqjd.u(c), cqjd.e()), cqgr.aD(((brvd) B()).D()));
        cqmj<V> q = q();
        q.g(cqgr.bY(cqjd.u(d), cqjd.e()));
        cqmj<V> l = l();
        l.g(cqgr.bY(cqjd.u(e), cqjd.e()));
        return cqgr.gj(cqgr.z(ibm.b()), cqgr.cd(-1), cqgr.bp(-2), cqgr.dj(((brvd) B()).s()), iue.b(((brvd) B()).k()), g(new cqmp[0]), n(), r, q, l);
    }

    protected cqmj<V> r() {
        brvc L = ((brvd) B()).L();
        return cqgr.gd(cqgr.aT(d), cqgr.dr(1), cqgr.bp(-2), cqgr.cd(-1), cqgr.dQ(ibn.f()), cqgr.dF(ibn.f()), cqic.d(cqjv.r(cqjv.u(cqjv.v(L)), L.c()), new cqmp[0]), cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), cqgr.fQ(new beeb(12), ((brvd) B()).M(), new cqmp[0])), gvb.d(false, new cqmp[0]));
    }

    protected cqmp<V> s() {
        return (cqmp<V>) cqmp.e;
    }

    protected cqmj<V> t() {
        brvc L = ((brvd) B()).L();
        Boolean r = cqjv.r(cqjv.u(cqjv.v(L)), L.b());
        return cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), cqgr.dQ(ibn.f()), cqgr.dF(ibn.f()), cqic.d(r, new cqmp[0]), cqjv.k(r, cqgr.dU(cqrp.d(8.0d)), cqgr.dU(cqrp.d(dcyn.a))), gvb.d(false, new cqmp[0]), cqgr.fQ(new beeb(8), ((brvd) B()).M(), new cqmp[0]));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public cqmj<V> u(brvd brvdVar) {
        return cqgr.gd(cqic.a(cqjv.v(brvdVar.A().R()), new cqmp[0]), cqgr.bp(-2), cqgr.dQ(ibn.f()), cqgr.dF(ibn.f()), cqgr.dU(cqrp.d(6.0d)), cqgr.dr(1), iue.b(((brvd) B()).X()), cqgr.ck(D(1)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final cqmp<V> w() {
        return cqgr.fY(cqgr.cd(-2), cqgr.bp(-2), cqic.a(cqjv.v(((brvd) B()).I()), new cqmp[0]), cqgr.fQ(new aeoq(), ((brvd) B()).I(), new cqmp[0]));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final cqmj<V> q() {
        cqmp[] cqmpVarArr = {cqic.d(((brvd) B()).ak(), new cqmp[0]), cqgr.cd(-2), cqgr.bp(-2), cqgr.dU(ibn.d()), cqgr.dB(ibn.d()), cqgr.bw(49), cqgr.eE(cqrt.i(ibk.a, ibm.j()))};
        cqmj<V> m = m();
        m.f(cqgr.aG(((brvd) B()).D()));
        brkj brkjVar = b;
        cqmj fY = cqgr.fY(x(new brsi(brkjVar), 0), x(new brsi(brkjVar), 11), x(new brsh(brkjVar), 3), x(new brsl(brkjVar), 5), x(new brsh(brkjVar), 4), x(new brso(brkjVar), 2), x(new brsy(brkjVar), 9), x(new brsm(brkjVar), 1), x(new brsk(brkjVar), 8), x(new brui(brkjVar), 10), x(new brsn(brkjVar), 7));
        fY.f(cqgr.aD(((brvd) B()).D()));
        return cqgr.gd(cqgr.aT(e), cqgr.cd(-1), cqgr.bp(-2), cqjv.k(((brvd) B()).ak(), cqgr.dU(cqrp.d(dcyn.a)), cqgr.dU(cqrp.d(12.0d))), cqgr.gc(cqmpVarArr), cqgr.dr(1), cqgr.gd(cqgr.dr(0), cqgr.bp(-2), cqgr.cd(-1), cqgr.dQ(ibn.f()), cqgr.dF(ibn.f()), cqgr.gd(cqgr.dr(1), cqgr.bp(-2), cqgr.cd(0), cqgr.ca(Float.valueOf(1.0f)), f(), m, fY, s()), e()), k());
    }
}
