package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: xwz  reason: default package */
/* loaded from: classes7.dex */
public final class xwz extends cqiw<xzo> {
    public static final dcqe a = dcqe.c("xwz");
    public static final cqss b;
    public static final cqjg c;
    public static final cqjg d;
    private static final cqtv e;
    private static final cqtv f;
    private static final cqrp g;
    private static final cqjg h;
    private static final cqjg i;
    private static final View.OnLayoutChangeListener j;

    static {
        cqtb d2 = cqrt.d(R.dimen.directions_transit_vehicle_circle_radius);
        e = d2;
        f = cqsg.f(d2, Float.valueOf(2.0f));
        g = cqrp.d(10.0d);
        b = ibm.p();
        c = cqjg.a();
        d = cqjg.a();
        h = cqjg.a();
        i = cqjg.a();
        j = new xwp();
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> e(cqmp<T>... cqmpVarArr) {
        cqmj<T> gc = cqgr.gc(cqgr.ca(Float.valueOf(0.0f)), cqgr.ce(cqrp.d(16.0d)), cqgr.bq(cqrp.d(12.0d)), cqgr.bw(16), cqgr.bR(cqrp.d(10.0d)), cqgr.bG(cqrp.d(4.0d)), cqgr.eE(vyt.e));
        gc.f(cqmpVarArr);
        return gc;
    }

    public static CharSequence f(xzo xzoVar) {
        if (xzoVar.v() == null) {
            return "";
        }
        xyu v = xzoVar.v();
        dbsk.s(v);
        return v.a();
    }

    @SafeVarargs
    private final cqmj<xzo> h(cqmp<xzo>... cqmpVarArr) {
        cqmj<xzo> gd = cqgr.gd(cqgr.aF(cqjv.x(xvc.a)), cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.bw(8388627), cqgr.aJ(8388627), cqgr.dF(cqrp.d(-4.0d)), cqgr.ck(D(2)));
        gd.f(cqmpVarArr);
        return gd;
    }

    @SafeVarargs
    private static cqmj<xzo> i(cqmp<xzo>... cqmpVarArr) {
        cqlc cqlcVar = xvf.a;
        cqmp[] cqmpVarArr2 = {cqgr.ce(cqrp.d(22.0d)), iue.c(xvg.a), cqgr.aW(2)};
        cqmj gc = cqgr.gc(cqgr.eG(cqlcVar), cqgr.ei(ImageView.ScaleType.FIT_CENTER), cqgr.ch(cqrp.d(16.0d)), cqgr.bw(16));
        gc.f(cqmpVarArr2);
        cqmj<xzo> gd = cqgr.gd(cqgr.aF(xve.a), cqgr.az(true), cqgr.dr(0), cqgr.bw(8388627), cqgr.cd(-2), cqgr.aJ(16), cqgr.cH(ibn.a()), gc, cqgr.gq(cqgr.ca(Float.valueOf(1.0f)), cqgr.cd(0), cqgr.eN(5), xyq.c(), cqgr.eM(xvh.a), cqgr.dQ(cqrt.d(R.dimen.directions_transitdetail_padding_side))), cqgr.fY(cqgr.aF(cqjv.x(xvi.a)), cqgr.fR(acor.a(), xvj.a, new cqmp[0]), cqgr.cd(-2), cqgr.cL(ibn.a())), cqgr.x(irm.d), cqgr.K(xvk.a), cqgr.cW(xvl.a), itj.i(dtxn.al));
        gd.f(cqmpVarArr);
        return gd;
    }

    @SafeVarargs
    private static cqmj<xzo> j(cqmp<xzo>... cqmpVarArr) {
        cqmj<xzo> gd = cqgr.gd(cqgr.dr(1), cqgr.bw(48), cqgr.dU(cqrp.d(4.0d)), cqgr.dB(cqrp.d(4.0d)));
        gd.f(cqmpVarArr);
        return gd;
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i2, xzo xzoVar, Context context, cqiv cqivVar) {
        xzo xzoVar2 = xzoVar;
        if (xzoVar2.j().booleanValue() && i2 == 1) {
            cqivVar.f(new xtv(), xzoVar2.s());
        } else if (i2 != 2 || xzoVar2.t() == null) {
        } else {
            xiu xiuVar = new xiu(false);
            zcv t = xzoVar2.t();
            dbsk.s(t);
            cqivVar.a(xiuVar, t);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<xzo> a() {
        cqlc cqlcVar = xvz.a;
        int i2 = ztz.K;
        cqmj q = zts.q(cqgr.aT(c), xym.g(), cqgr.bp(-1), cqjv.g(ztg.SHOW_AS_BLOCK_TRANSFER, cqlcVar, zth.a), ztx.z(xwk.a), cqjv.n(xwm.a, cqmn.a(zxb.b(cqkz.a(null)), cqgr.dU(cqrp.d(dcyn.a)), zsz.s(xwn.a)), cqmn.a(zxb.b(xwo.a), cqgr.dU(cqrp.d(2.0d)), zsz.r(0))), cqjv.g(ztg.SHOW_FINAL_STOP, xtx.a, zth.a), ztx.A(xty.a), cqgr.dE(xtz.a), zsz.q(xua.a), zsy.c(xub.a), zsy.d(-1), zts.r(xuc.a), zts.t(xud.a), zts.s(xue.a));
        q.f(new cqmp[0]);
        cqtv cqtvVar = f;
        Float valueOf = Float.valueOf(1.0f);
        cqmp[] cqmpVarArr = {cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.cW(xun.a), cqgr.x(ibo.c()), cqgr.gx(), cqgr.aW(1), cqgr.gd(cqgr.dr(0), cqgr.cd(-1), cqgr.bp(-2), cqgr.gq(cqgr.cH(cqtvVar), cqgr.ca(valueOf), cqgr.aJ(16), xyq.a(), cqgr.eN(5), cqgr.eM(xuo.a), cqgr.V(xup.a)), e(cqic.f(xuq.a, new cqmp[0]))), cqgr.fS(new xwy(), xur.a, cqgr.bE(xut.a), cqgr.aW(4))};
        cqmp[] cqmpVarArr2 = {cqgr.J(false), cqgr.bD(cqrp.d(16.0d)), cqgr.aI(xuu.a)};
        cqmp[] cqmpVarArr3 = {cqgr.aI(xwl.a), cqgr.bp(-2), cqgr.cd(-1), cqgr.aJ(16), cqgr.gc(cqgr.eE(iup.e(R.raw.gpay_grey)), cqgr.ce(cqrp.d(40.0d)), cqgr.bq(cqrp.d(16.0d)), cqgr.dU(cqrp.d(3.0d)), cqgr.bG(cqrp.d(2.0d))), cqgr.gq(xyq.c(), cqgr.eJ(cqrt.l(R.string.TRANSIT_PAYMENTS_PAY_WITH_YOUR_PHONE)))};
        cqmp[] cqmpVarArr4 = {cqgr.eN(5), cqgr.eS(Integer.valueOf((int) R.style.ConfidentialRedText)), cqgr.eJ(cqrt.l(R.string.CONFIDENTIAL_INTERNAL_LABEL)), cqgr.aI(xva.a), cqgr.bw(8388611), cqgr.bD(cqrt.d(R.dimen.textbox_spacer_small))};
        cqmp[] cqmpVarArr5 = {cqgr.ca(valueOf)};
        cqmj gd = cqgr.gd(cqgr.gq(cqgr.eN(5), xyq.e(), cqgr.eR(xvb.a), cqgr.az(true)));
        gd.f(cqmpVarArr5);
        cqmj gd2 = cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), iue.c(xul.a), cqgr.cW(cqgr.q(xum.a)), cqgr.x(ibo.c()), xym.e(), cqgr.gd(cqmpVarArr), ict.n(false, cqmpVarArr2), cqgr.fR(new xwr(), xuv.a, new cqmp[0]), cqgr.gd(cqmpVarArr3), cqgr.fR(new wpk(true, true), xuw.a, new cqmp[0]), cqgr.gq(cqmpVarArr4), cqgr.gd(cqgr.dr(0), cqgr.cd(-1), cqgr.bp(-2), cqgr.dU(cqrp.d(2.0d)), cqgr.dB(cqrp.d(18.0d)), gd, e(cqgr.T(cqrt.l(R.string.MORE_DEPARTURES_BUTTON))), cqic.c(xux.a, new cqmp[0])), i(new cqmp[0]), h(new cqmp[0]), cqgr.aF(cqjv.x(xuy.a)));
        gd2.f(new cqmp[0]);
        cqmj gd3 = cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), iue.c(xuf.a), cqgr.cW(cqgr.q(xug.a)), cqgr.x(irm.d), xym.e(), cqgr.gd(cqgr.dr(0), cqgr.cd(-1), cqgr.bp(-2), cqgr.gq(cqgr.ca(valueOf), cqgr.aJ(16), xyq.a(), cqgr.eN(5), cqgr.eM(xui.a), cqgr.V(xuj.a))), cqgr.gd(cqgr.dr(0), cqgr.cd(-1), cqgr.bp(-2), j(cqgr.cd(0), cqgr.bp(-2), cqgr.ca(valueOf), zxb.a(zxb.i(cqrp.d(3.0d)), irn.x(), irn.m(), zxb.d(cqrp.f(20.0d)), zxb.g(cqrp.f(20.0d)), cqgr.co(cqrp.f(6.0d), false), cqgr.cH(cqrp.f(20.0d)), zvb.b(xuz.a)), cqgr.gq(xyq.c(), cqgr.eN(5), cqgr.eJ(cqrt.l(R.string.TRANSIT_BLOCKTRANSFER_DESCRIPTION))))), h(new cqmp[0]), i(new cqmp[0]), cqgr.aI(cqjv.x(xuk.a)));
        gd3.f(new cqmp[0]);
        cqmp[] cqmpVarArr6 = {cqgr.aI(cqjv.x(xtw.a)), cqgr.bV(cqrp.d(8.0d))};
        xsk xskVar = new xsk();
        cqlc cqlcVar2 = xuh.a;
        cqmp[] cqmpVarArr7 = {cqgr.bV(cqrp.d(10.0d)), iue.b(cjtd.a(dtxn.aA))};
        cqmp[] cqmpVarArr8 = {cqgr.aF(cqjv.x(xus.a)), cqgr.bV(cqrp.d(8.0d))};
        cqjg cqjgVar = h;
        cqmp[] cqmpVarArr9 = {cqgr.aT(cqjgVar), cqgr.bG(cqrt.d(R.dimen.tertiary_padding)), cqgr.bR(cqrp.d(-6.0d)), cqgr.aI(xvq.a), cqgr.eG(xvr.a)};
        cqjg cqjgVar2 = i;
        cqmj gj = cqgr.gj(cqgr.cH(irh.a()), cqgr.x(irm.d), cqgr.K(xvm.a), iue.c(xvn.a), cqgr.cW(cqgr.q(xvp.a)), cqgr.dU(ibn.f()), cqgr.dB(ibn.f()), cqgr.aJ(16), cqgr.gc(cqmpVarArr9), cqgr.gq(cqgr.aT(cqjgVar2), cqgr.V(xvs.a), cqgr.eN(5), cqgr.eM(xvt.a), cqgr.dU(cqrp.d(2.0d)), cqgr.bY(cqjd.A(cqjgVar), cqjd.k(cqjgVar)), xyq.b()), cqgr.gq(cqgr.aF(xvu.a), iue.c(xvv.a), cqgr.eN(5), cqgr.eM(xvw.a), xyq.d(), cqgr.bY(cqjd.u(cqjgVar2), cqjd.o(cqjgVar2))));
        gj.f(new cqmp[0]);
        cqmj gd4 = cqgr.gd(cqgr.aT(d), cqgr.K(xwg.a), cqgr.aI(xwh.a), iue.c(xwi.a), cqgr.cW(cqgr.q(xwj.a)), cqgr.x(irm.d), cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.ck(D(1)));
        gd4.f(new cqmp[0]);
        cqmp[] cqmpVarArr10 = {cqgr.aF(xvd.a), cqgr.bD(cqrp.d(16.0d))};
        cqmp<xzo>[] cqmpVarArr11 = {cqgr.aI(xvo.a), cqgr.dU(cqrp.d(dcyn.a)), cqgr.dC(0)};
        cqmj<xzo> j2 = j(cqgr.az(true), cqgr.cd(-1), cqgr.cW(xvx.a), cqgr.x(ibo.c()), cqgr.gx(), cqgr.en(true), cqgr.aW(1), cqgr.V(xvy.a), cqgr.gd(cqgr.dr(0), cqgr.bp(-2), cqgr.cd(-1), cqgr.gq(cqjv.n(cqjv.x(xwa.a), cqmn.a(cqgr.cH(cqrp.d(dcyn.a)), cqgr.aJ(0)), cqmn.a(cqgr.cH(cqtvVar), cqgr.aJ(16))), cqgr.ca(valueOf), cqgr.cd(0), cqgr.bG(g), xyq.a(), cqgr.eN(5), cqgr.eQ(xwb.a)), cqgr.gq(cqgr.ca(Float.valueOf(0.0f)), cqgr.eM(xwc.a), xyq.e())), cqgr.fS(new xwy(), xwd.a, cqgr.dW(xwe.a)), cqgr.fR(new xwq(), xwf.a, new cqmp[0]));
        j2.f(cqmpVarArr11);
        return xym.b(cqgr.cY(j), cqgr.dr(0), q, cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), xym.c(), xym.d(), xym.e(), gd2, gd3, ict.n(false, cqmpVarArr6), cqgr.fR(xskVar, cqlcVar2, cqmpVarArr7), ict.n(false, cqmpVarArr8), gj, gd4, ict.n(false, cqmpVarArr10), j2));
    }
}
