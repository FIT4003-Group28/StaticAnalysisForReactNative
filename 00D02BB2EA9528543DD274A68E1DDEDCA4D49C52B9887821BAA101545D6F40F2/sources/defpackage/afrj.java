package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: afrj  reason: default package */
/* loaded from: classes2.dex */
public final class afrj extends cqiw<afrk> {
    public static final /* synthetic */ int a = 0;
    private static final cqrp b = cqrp.d(24.0d);

    private static cqmj<afrk> e() {
        return n(R.string.MAP_TYPE_TITLE);
    }

    private static cqmj<afrk> f() {
        return cqgr.gd(cqgr.dr(1), cqgr.gd(cqgr.cd(-2), k(cqgr.q(afpj.a), afpk.a, iup.e(R.raw.ic_default), R.string.LAYER_DEFAULT, dtxu.r), k(cqgr.q(afpl.a), afpm.a, iup.e(R.raw.ic_satellite), R.string.LAYER_SATELLITE, dtxu.t), k(cqgr.q(afpn.a), afpp.a, iup.e(R.raw.ic_terrain), R.string.LAYERS_TERRAIN, dtxu.v)));
    }

    private static cqmj<afrk> h() {
        return n(R.string.MAP_DETAILS_TITLE);
    }

    private static cqmj<afrk> i() {
        cqmj<afrk> n = n(R.string.MAP_EXPLORE_TITLE);
        n.f(cqgr.aI(afpz.a));
        return n;
    }

    private static cqmj<afrk> j() {
        cqlc q = cqgr.q(afqu.a);
        cqlc a2 = cqkz.a(false);
        cqmj gd = cqgr.gd(cqgr.dr(1), cqgr.J(true), cqgr.ce(cqrp.d(84.0d)), cqgr.bp(-2), cqgr.aJ(17), cqgr.cW(q), cqgr.S(Integer.valueOf((int) R.string.LAYER_VISUAL_EXPLORE)), iue.b(cjtd.a(dtxu.z)), cqgr.x(irn.J()), l(a2, iup.e(R.raw.ic_photos)), m(cqkz.a(cqrt.l(R.string.LAYER_VISUAL_EXPLORE)), a2));
        gd.f(cqgr.aI(afqw.a));
        cqmj gd2 = cqgr.gd(cqgr.dr(1), cqgr.ce(cqrp.d(84.0d)), cqgr.bp(-2), cqgr.aJ(17), cqgr.J(true), cqgr.cW(cqgr.q(afqx.a)), cqgr.V(afqy.a), iue.b(cjtd.a(dtxu.s)), cqgr.x(irn.J()), cqgr.gc(cqgr.bw(17), cqgr.ce(ibn.a()), cqgr.bq(ibn.a()), cqgr.bV(cqsv.f(dcyn.a, 2.0d, dcyn.a, 2.0d)), cqgr.bD(cqsv.f(dcyn.a, 2.0d, dcyn.a, 2.0d)), cqgr.eE(iup.g(cqrt.g(2131232340, ibm.x()), 0.5f, ibm.u()))), m(afqz.a, afra.a));
        gd2.f(cqgr.aI(afrb.a));
        return cqgr.gd(cqgr.aI(afpz.a), cqgr.cd(-2), cqgr.bp(-2), gd, gd2);
    }

    private static cqmj<afrk> k(cqlc<afrk, View.OnClickListener> cqlcVar, cqlc<afrk, Boolean> cqlcVar2, cqtd cqtdVar, int i, ddho ddhoVar) {
        return jfw.a(cqgr.J(true), cqgr.ce(cqrp.d(84.0d)), cqgr.bp(-2), cqgr.aJ(17), cqgr.cW(cqlcVar), cqgr.az(true), cqgr.I(cqlcVar2), cqgr.dr(1), cqgr.fY(cqgr.cd(-2), cqgr.bp(-2), iue.b(cjtd.a(ddhoVar)), cqgr.x(irn.J()), l(cqlcVar2, cqtdVar), gls.a(cqrp.f(9.0d), cqgr.bw(8388661), cqgr.aG(false))), m(cqkz.a(cqrt.l(i)), cqlcVar2));
    }

    private static cqmj<afrk> l(final cqlc<afrk, Boolean> cqlcVar, cqtd cqtdVar) {
        return cqgr.fY(cqgr.y(new cqlc(cqlcVar) { // from class: afrc
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                int i = afrj.a;
                if (((Boolean) this.a.a((afrk) cqkpVar)).booleanValue()) {
                    return aclp.a(ibm.b(), ibm.x(), cqrp.d(2.0d), cqrp.d(9.0d));
                }
                return aclp.a(ibm.a(), ibm.a(), cqrp.d(2.0d), cqrp.d(9.0d));
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.cd(-2), cqgr.bp(-2), cqgr.gc(cqgr.eE(cqtdVar), cqgr.bA(cqrp.d(2.0d)), cqgr.bw(17), cqgr.ce(ibn.a()), cqgr.bq(ibn.a())));
    }

    private static cqmj<afrk> m(cqlc<afrk, cqsn> cqlcVar, final cqlc<afrk, Boolean> cqlcVar2) {
        return cqgr.gq(cqgr.aJ(1), cqgr.dU(cqrp.d(8.0d)), cqgr.dQ(cqrp.d(4.0d)), cqgr.dF(cqrp.d(4.0d)), ibq.q(), cqgr.cj(Float.valueOf(0.002f)), cqgr.cd(-1), cqgr.eW(new cqlc(cqlcVar2) { // from class: afrd
            private final cqlc a;

            {
                this.a = cqlcVar2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                int i = afrj.a;
                return ((Boolean) this.a.a((afrk) cqkpVar)).booleanValue() ? ibm.x() : ibm.n();
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.eM(cqlcVar));
    }

    private static cqmj<afrk> n(int i) {
        return cqgr.gq(cqgr.dQ(ibn.f()), cqgr.dB(cqrp.d(12.0d)), cqgr.eN(5), ibq.s(), ibq.x(), cqgr.cj(Float.valueOf(0.075f)), cqgr.eL(Integer.valueOf(i)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<afrk> a() {
        cqmp[] cqmpVarArr = {cqgr.aE(cqhf.a)};
        cqmp[] cqmpVarArr2 = {cqgr.dr(1), e(), f()};
        cqrp cqrpVar = b;
        cqmp[] cqmpVarArr3 = {cqgr.aF(afrg.a), cqgr.bq(cqrpVar)};
        cqmp[] cqmpVarArr4 = {cqgr.cd(-2), k(cqgr.q(afpq.a), afpr.a, iup.e(R.raw.ic_transit), R.string.LAYER_TRANSIT, dtxu.y), k(cqgr.q(afps.a), afpt.a, iup.e(R.raw.ic_traffic), R.string.LAYER_TRAFFIC, dtxu.x), k(cqgr.q(afpu.a), afpv.a, iup.e(R.raw.ic_bicycling), R.string.LAYER_BICYCLING, dtxu.p)};
        cqmp[] cqmpVarArr5 = {cqgr.bq(cqrpVar)};
        cqmj<afrk> k = k(cqgr.q(afpw.a), afpx.a, iup.e(R.raw.ic_covid19), R.string.LAYER_COVID_INFO, dtxu.q);
        k.f(cqgr.aI(afpy.a));
        cqmj<afrk> k2 = k(cqgr.q(afqa.a), afqb.a, iup.e(R.raw.ic_three_dimensional), R.string.LAYER_THREE_DIMENSIONAL, dtxu.w);
        k2.f(cqgr.aI(afqc.a));
        cqmj gd = cqgr.gd(cqgr.bp(-2), cqgr.cd(-2), cqgr.dr(1), cqgr.dU(ibn.f()), cqgr.dB(ibn.f()), cqgr.z(ibm.b()), cqgr.gd(cqmpVarArr2), cqgr.gm(cqmpVarArr3), cqgr.gd(cqgr.aF(afrh.a), cqgr.dr(1), h(), cqgr.gd(cqmpVarArr4), cqgr.gm(cqmpVarArr5), cqgr.gd(cqgr.cd(-2), cqgr.bp(-2), k, k2, k(cqgr.q(afqd.a), afqe.a, iup.e(R.raw.ic_streetview), R.string.LAYER_STREET_VIEW, dtxu.u))), cqgr.gm(cqgr.aI(afqk.a), cqgr.bq(cqrpVar)), cqgr.gd(cqgr.aF(afri.a), cqgr.dr(1), i(), j()));
        gd.f(cqmpVarArr);
        cqmp[] cqmpVarArr6 = {cqgr.aH(cqhf.a)};
        cqmj<afrk> e = e();
        e.f(cqgr.ce(cqrp.d(252.0d)));
        cqmp[] cqmpVarArr7 = {cqgr.aF(afpe.a)};
        cqmj<afrk> h = h();
        h.f(cqgr.aI(afpo.a), cqgr.ce(cqrp.d(336.0d)));
        cqmj<afrk> h2 = h();
        h2.f(cqgr.aI(afpd.a), cqgr.ce(cqrp.d(420.0d)));
        cqmp[] cqmpVarArr8 = {cqgr.aF(afpf.a), cqgr.dr(0), h, h2};
        cqmp[] cqmpVarArr9 = {cqgr.aI(afqv.a)};
        cqmj<afrk> i = i();
        i.f(cqgr.aI(afrf.a), cqgr.ce(cqrp.d(84.0d)));
        cqmj<afrk> i2 = i();
        i2.f(cqgr.aI(afre.a), cqgr.ce(cqrp.d(168.0d)));
        cqmp[] cqmpVarArr10 = {cqgr.bp(-2), cqgr.cd(-2), cqgr.dr(0), e, iuh.c(cqmpVarArr7), cqgr.gd(cqmpVarArr8), iuh.c(cqmpVarArr9), cqgr.gd(cqgr.aF(afpg.a), cqgr.dr(0), i, i2)};
        cqmj<afrk> k3 = k(cqgr.q(afqm.a), afqn.a, iup.e(R.raw.ic_covid19), R.string.LAYER_COVID_INFO, dtxu.q);
        k3.f(cqgr.aI(afqo.a));
        cqmj<afrk> k4 = k(cqgr.q(afqp.a), afqq.a, iup.e(R.raw.ic_three_dimensional), R.string.LAYER_THREE_DIMENSIONAL, dtxu.w);
        k4.f(cqgr.aI(afqr.a));
        cqmj gd2 = cqgr.gd(cqgr.bp(-2), cqgr.cd(-2), cqgr.dr(1), cqgr.dU(ibn.f()), cqgr.dB(ibn.f()), cqgr.z(ibm.b()), cqgr.gd(cqmpVarArr10), cqgr.gd(cqgr.bp(-2), cqgr.cd(-2), cqgr.dr(0), f(), cqgr.gd(cqgr.aF(afph.a), cqgr.dr(0), iuh.c(new cqmp[0]), cqgr.gd(cqgr.cd(-2), k(cqgr.q(afqf.a), afqg.a, iup.e(R.raw.ic_transit), R.string.LAYER_TRANSIT, dtxu.y), k(cqgr.q(afqh.a), afqi.a, iup.e(R.raw.ic_traffic), R.string.LAYER_TRAFFIC, dtxu.x), k(cqgr.q(afqj.a), afql.a, iup.e(R.raw.ic_bicycling), R.string.LAYER_BICYCLING, dtxu.p), k3, k4, k(cqgr.q(afqs.a), afqt.a, iup.e(R.raw.ic_streetview), R.string.LAYER_STREET_VIEW, dtxu.u))), cqgr.gd(cqgr.aF(afpi.a), cqgr.dr(0), iuh.c(cqgr.aI(afpz.a)), j())));
        gd2.f(cqmpVarArr6);
        return cqgr.ga(cqgr.bp(-2), cqgr.cd(-2), cqqx.E(cqgr.bp(-2), cqgr.cd(-2), cqqx.B(true), cqqx.g(ibn.k()), cqqx.i(cqrp.d(4.0d)), gd, gd2));
    }
}
