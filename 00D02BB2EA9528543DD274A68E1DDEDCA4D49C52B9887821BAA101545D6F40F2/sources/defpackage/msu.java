package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: msu  reason: default package */
/* loaded from: classes7.dex */
public final class msu extends cqiw<mtg> {
    private static final cqtv b = cqrp.d(360.0d);
    private static final cqtv c = cqrp.d(20.0d);
    public static final dcdn<mtf, Integer> a = dcjz.c(dcdn.m(mtf.DESTINATIONS_LIST, Integer.valueOf((int) R.id.prenav_route_overview_paged_list_view), mtf.ERROR_ICON, Integer.valueOf((int) R.id.prenav_route_overview_error_icon), mtf.LOADING_SPINNER, Integer.valueOf((int) R.id.prenav_route_overview_progress_bar)));
    private static final cqjb<mtg, Boolean> d = msk.a;
    private static final cqjb<mtg, Integer> e = msl.a;

    public static final cqlc<mtg, Boolean> e() {
        return cqjv.x(msc.a);
    }

    private static final cqmj<mtg> f(boolean z, cqmp<mtg>... cqmpVarArr) {
        cqmj f;
        if (z) {
            final cqlc cqlcVar = msr.a;
            f = nsc.e(new cqlc(cqlcVar) { // from class: nrz
                private final cqlc a;

                {
                    this.a = cqlcVar;
                }

                @Override // defpackage.cqlc
                public final Object a(cqkp cqkpVar) {
                    cqlc cqlcVar2 = this.a;
                    if (cqlcVar2.a(cqkpVar) != null) {
                        cqtd cqtdVar = (cqtd) cqlcVar2.a(cqkpVar);
                        dbsk.s(cqtdVar);
                        return nqu.aw(cqtdVar);
                    }
                    return null;
                }

                @Override // defpackage.cqlc
                public final boolean b() {
                    return false;
                }
            }, mss.a, nql.aw, nql.ay, null, nql.ax, cqgr.fN(nsa.a));
            f.f(new cqmp[0]);
        } else {
            f = nsc.f(mst.a, cqgr.eM(mrs.a), mrt.a, cqkz.a(false), new cqmp[0]);
        }
        f.f(cqgr.au(mru.a), iue.c(mrv.a), itj.h(cqgr.q(mrw.a)));
        cqmp[] cqmpVarArr2 = new cqmp[2];
        cqmpVarArr2[0] = cqgr.cd(Integer.valueOf(true != z ? -1 : -2));
        cqmpVarArr2[1] = f;
        cqmj<mtg> fY = cqgr.fY(cqmpVarArr2);
        fY.f(cqmpVarArr);
        return fY;
    }

    private static final cqmj<mtg> h(cqmp<mtg>... cqmpVarArr) {
        cqmj<mtg> gd = cqgr.gd(cqgr.dr(0), cqgr.cd(-2), cqgr.bp(-2), cqgr.gq(cqgr.cd(-2), nre.j(), cqgr.eW(mrx.a), cqgr.eM(mry.a), cqgr.eB(true)), cqgr.gq(cqgr.cd(-2), nsc.i(), nre.k(nql.bq)), cqgr.gq(cqgr.cd(-2), nre.k(nql.bq), cqgr.eM(mrz.a), cqgr.eB(true)));
        gd.f(cqmpVarArr);
        return gd;
    }

    private static final cqmp<mtg> i(cqmp<mtg>... cqmpVarArr) {
        cqmj gq = cqgr.gq(cqgr.cd(-2), cqgr.eM(mse.a), cqgr.cB(2), nre.u(nql.bq));
        gq.f(cqmpVarArr);
        return gq;
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, mtg mtgVar, Context context, cqiv cqivVar) {
        mtg mtgVar2 = mtgVar;
        mzd c2 = mtgVar2.c();
        if (c2 != null) {
            cqivVar.a(new mys(true, nql.bn), c2);
        }
        cqivVar.f(new myq(), mtgVar2.d());
    }

    @Override // defpackage.cqiw
    public final cqmj<mtg> a() {
        cqmp[] cqmpVarArr = {cqgr.ca(Float.valueOf(1.0f)), cqjv.d(nrl.CHOOSE_VISIBLE_CHILD, e), nrj.a(cqgr.aR(Integer.valueOf((int) R.id.prenav_route_overview_paged_list_view)), cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-1), nrj.e(0), nrj.g(true), cqgr.ck(C())), nsc.w(cqgr.aR(Integer.valueOf((int) R.id.prenav_route_overview_progress_bar)), cqgr.bw(17), cqgr.cd(-2), cqgr.bp(-2)), cqgr.gc(cqgr.aR(Integer.valueOf((int) R.id.prenav_route_overview_error_icon)), cqgr.cd(-2), cqgr.bp(-2), cqgr.bw(17), cqgr.eG(msq.a), cqgr.ei(ImageView.ScaleType.CENTER))};
        cqmp[] cqmpVarArr2 = {cqgr.aF(msi.a)};
        cqjb<mtg, Boolean> cqjbVar = d;
        cqmp[] cqmpVarArr3 = {cqic.e(cqjbVar, new cqmp[0])};
        cqmp[] cqmpVarArr4 = {cqgr.aI(new cqlc(this) { // from class: msf
            private final msu a;

            {
                this.a = this;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                mtg mtgVar = (mtg) cqkpVar;
                boolean z = false;
                if (this.a.d().a(mtgVar).booleanValue() && !mtgVar.h().booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        })};
        cqmp[] cqmpVarArr5 = {cqgr.aI(new cqlc(this) { // from class: msg
            private final msu a;

            {
                this.a = this;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                mtg mtgVar = (mtg) cqkpVar;
                boolean z = false;
                if (this.a.d().a(mtgVar).booleanValue() && mtgVar.h().booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        })};
        cqmj gd = cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.aJ(8388611), cqgr.gq(nre.j(), cqgr.eW(msa.a), cqgr.eM(msb.a), cqgr.cd(-2), cqgr.eB(true)), cqgr.gq(nre.k(nql.bq), cqgr.eM(msd.a), cqgr.cd(-2), cqgr.eB(true)));
        gd.f(cqmpVarArr5);
        cqmj fY = cqgr.fY(cqgr.bp(-2), cqgr.cd(-1), cqgr.dQ(nqo.R), h(cqmpVarArr4), gd, i(cqgr.aF(e())));
        cqrp cqrpVar = nqo.R;
        cqmj gd2 = cqgr.gd(cqgr.dr(0), cqgr.cd(-1), cqgr.bp(-2), cqgr.dz(cqrpVar, cqrpVar, cqrpVar, cqrpVar), cqgr.aJ(16), f(true, new cqmp[0]), fY);
        gd2.f(cqmpVarArr3);
        cqmp[] cqmpVarArr6 = {cqic.b(cqjbVar, new cqmp[0])};
        cqlc cqlcVar = new cqlc(this) { // from class: msh
            private final msu a;

            {
                this.a = this;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                mtg mtgVar = (mtg) cqkpVar;
                boolean z = false;
                if (this.a.d().a(mtgVar).booleanValue() && mtgVar.j().booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        };
        cqtv cqtvVar = c;
        cqmp[] cqmpVarArr7 = {cqgr.aI(d()), cqgr.bV(nqo.R)};
        cqmp[] cqmpVarArr8 = {cqgr.aI(cqlcVar)};
        cqmj gq = cqgr.gq(cqgr.cd(-2), cqgr.eL(Integer.valueOf((int) R.string.CAR_EV_CHARGE_TIME_INCLUDED)), cqgr.cB(1), cqgr.bV(cqrp.d(dcyn.a)), nre.u(nql.bq));
        gq.f(cqmpVarArr8);
        cqmj gd3 = cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.dQ(cqtvVar), cqgr.dF(cqtvVar), cqgr.dB(nqo.R), cqgr.dU(nqo.R), cqgr.aJ(1), f(false, new cqmp[0]), h(cqmpVarArr7), gq, i(cqgr.aF(e()), cqgr.bV(nqo.R)));
        gd3.f(cqmpVarArr6);
        return nqk.a(cqgr.ce(nqo.am), cqgr.bp(-2), cqgr.bA(nqo.Q), cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqjv.l(mrr.a, cqgr.bp(-2), cqgr.bq(b)), nqk.j(msn.a, cqgr.q(mso.a), cqkz.a(cjtd.a(dtxm.dl)), cqgr.q(msp.a), cqkz.a(cjtd.a(dtxm.dm)), cqkz.a(Integer.valueOf((int) R.string.CAR_ROUTE_OVERVIEW)), new cqmp[0]), cqgr.fY(cqmpVarArr), cqgr.fY(nsc.d(cqmpVarArr2), nsc.q(msj.a), gd2, gd3)));
    }

    public final cqlc<mtg, Boolean> d() {
        return new cqlc() { // from class: msm
            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                mtg mtgVar = (mtg) cqkpVar;
                boolean z = false;
                if (((Boolean) mrr.a.a(mtgVar)).booleanValue() && ((cqju) msu.e()).a(mtgVar).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        };
    }
}
