package defpackage;

import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: vjn  reason: default package */
/* loaded from: classes7.dex */
final class vjn extends cqiw<zdg> {
    static final cqtv a = cqsg.d(vkl.g, vkl.d);
    private static final cqjg b = cqjg.a();
    private static final cqjb<zdg, CharSequence> c = new vjm();

    private static cqnf<zdg> e() {
        cqgq n = cqgr.n();
        n.d = 50;
        n.a = Float.valueOf(0.0f);
        n.e = 0L;
        return n.b();
    }

    private static cqnf<zdg> f() {
        cqgq n = cqgr.n();
        n.d = 50;
        n.a = Float.valueOf(1.0f);
        n.e = 250L;
        return n.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<zdg> a() {
        Boolean k = B().k();
        cqtv cqtvVar = a;
        cqtv g = cqsg.g(cqtvVar, irh.r());
        cqmj fY = cqgr.fY(cqgr.bq(g), cqgr.bV(cqsg.f(g, Float.valueOf(-1.0f))), cqgr.ce(irh.r()), cqgr.gc(cqgr.bp(-1), cqgr.ce(cqrp.d(18.0d)), cqgr.bw(17), cqgr.ei(ImageView.ScaleType.FIT_CENTER), cqgr.eE(iup.c(R.raw.ic_route_3dots, ibm.l()))));
        fY.f(cqgr.aD(B().c()), cqgr.bw(1));
        cqmp[] cqmpVarArr = {cqgr.dr(1), cqgr.bw(17), cqgr.L(false), cqgr.P(false), fY, cqgr.fY(cqgr.aT(b), cqgr.bv(3), irn.A(), cqgr.aJ(17), cqgr.bw(17), cqgr.fO(new vjr(), B(), cqgr.aG(cqjv.t(B().e(), cqjv.r(B().d(), cqjv.u(B().x())))), vjo.c, cqgr.ei(ImageView.ScaleType.FIT_CENTER)), cqgr.gq(cqgr.aD(cqjv.t(B().e(), cqjv.r(B().d(), cqjv.u(B().x())))), cqgr.bv(3), cqgr.aW(2), vjo.c, cqgr.bw(17), cqgr.aJ(17), cqjv.k(B().h(), cqgr.x(iup.c(R.raw.ic_route_stop, ibm.n())), cqgr.x(iup.c(R.raw.ic_route_stop, ibm.p()))), cqgr.fe(irn.c), cqgr.dB(cqrp.d(1.0d)), cqgr.fh(cqrp.d(11.0d)), cqjv.k(B().h(), cqgr.eU(ibm.o()), cqgr.eU(ibm.p())), cqgr.eK(c))), cqjv.k(B().v(), e(), f())};
        cqmp[] cqmpVarArr2 = {cqgr.ce(cqrp.d(5.0d))};
        Float valueOf = Float.valueOf(1.0f);
        cqmp[] cqmpVarArr3 = {cqgr.aR(Integer.valueOf((int) R.id.waypoint_row_waypoint_text)), cqgr.bp(-2), cqgr.cd(-1), cqgr.ca(valueOf), cqgr.bw(16), cqgr.bv(3), ibq.o(), irn.E(), cqjv.k(B().j(), cqgr.eU(ibm.p()), cqgr.eU(ibm.n())), cqjv.k(B().j(), cqgr.eX(ibm.o()), cqgr.eX(ibm.j())), vlb.a(), zvb.a(B().p()), cqgr.aP(B().f())};
        cqmj a2 = fzg.a(cqgr.aG(B().k()), cqgr.aR(Integer.valueOf((int) R.id.waypoint_row_grabber)), cqgr.J(true), cqgr.R(B().r()), cqgr.bq(cqtvVar), cqgr.cd(-2), cqgr.bw(16), cqgr.bv(3), cqgr.eE(cqrt.g(2131232246, ibm.p())));
        a2.f(cqgr.dQ(vkl.l), cqgr.dF(vkl.l));
        cqmp[] cqmpVarArr4 = {cqgr.aR(Integer.valueOf((int) R.id.waypoint_row_waypoint_field)), cqgr.dr(0), cqgr.bp(-1), cqgr.ca(valueOf), cqgr.bv(3), cqgr.dQ(vkl.l), cqjv.k(B().k(), cqgr.dF(cqrp.d(dcyn.a)), cqgr.dF(vkl.l)), iue.b(B().m()), cqgr.cU(B().l()), cqgr.J(B().j()), cqgr.x(cqtt.e(vkl.i(), cqrp.d(dcyn.a), vkl.e, cqrp.d(dcyn.a), vkl.e)), cqgr.gq(cqmpVarArr3), a2};
        cqmj gc = cqgr.gc(cqgr.aR(Integer.valueOf((int) R.id.waypoint_row_remove_waypoint)), cqgr.bv(3), cqgr.bp(-1), cqgr.cd(-2), cqgr.cL(cqsg.d(irh.r(), uof.b, uof.b)), cqgr.bR(vkl.e), iue.b(cjtd.a(dtxn.cw)), cqgr.R(B().q()), cqgr.cU(B().o(iuf.a())), cqgr.x(irn.N()), cqgr.ei(ImageView.ScaleType.CENTER), cqgr.eE(iup.c(R.raw.ic_close_small, ibm.p())));
        gc.f(cqgr.bl(B().i()), cqjv.k(cqjv.r(B().i(), cqjv.u(B().v())), f(), e()));
        return new cqmh(zxe.class, cqgr.dr(1), cqgr.x(ibm.a()), cqgr.bp(-2), cqgr.cd(-1), cqgr.L(false), cqgr.P(false), cqgr.bv(3), cqjv.i(zxd.a, k, zxe.a), iue.b(cjtd.a(dtxn.cx)), cqgr.gd(cqgr.dr(0), cqgr.bq(cqtvVar), cqgr.cd(-1), cqgr.L(false), cqgr.P(false), cqgr.bw(17), cqgr.bv(3), cqgr.gd(cqmpVarArr), cqgr.gm(cqmpVarArr2), jgk.a(cqmpVarArr4), gc));
    }
}
