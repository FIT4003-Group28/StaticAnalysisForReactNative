package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: vho  reason: default package */
/* loaded from: classes7.dex */
public final class vho extends cqiw<zdw> {
    private static final cqtv b = cqrp.d(50.0d);
    private static final cqrp c = cqrp.f(16.0d);
    public final vlp a = vlp.d();
    private final View.OnAttachStateChangeListener d = new vhm(this);

    @SafeVarargs
    private final cqmj<zdw> e(cqss cqssVar, cqmp<zdw>... cqmpVarArr) {
        cqtv cqtvVar = b;
        cqmj fY = cqgr.fY(cqgr.aR(Integer.valueOf((int) R.id.taxi_trip_icon)), cqgr.cd(-2), cqgr.bp(-2), cqgr.bw(49), cqgr.L(false), jfx.a(cqgr.cd(-2), cqgr.bp(-2), cqgr.fY(cqgr.ce(cqtvVar), cqgr.bq(cqtvVar), cqgr.z(cqssVar))));
        cqrp d = cqrp.d(72.0d);
        cqrp cqrpVar = c;
        cqmh cqmhVar = new cqmh(zvu.class, cqgr.dr(1), cqgr.cd(-2), cqgr.bp(-1), cqgr.bV(cqrp.d(8.0d)), cqgr.bD(cqrp.d(12.0d)), cqgr.bR(irh.k()), cqgr.bG(irh.k()), jgi.e(irh.m()), cqgr.aJ(17), cqgr.cT(B().l()), cqgr.R(B().k()), fY, vhp.e(cqssVar, d, cqrpVar, new cqmp[0]), vhp.e(cqssVar, cqrp.d(80.0d), cqrpVar, new cqmp[0]));
        cqmhVar.f(cqmpVarArr);
        return cqmhVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<zdw> a() {
        cqta e = cqta.e(15987957);
        cqmp<zdw>[] cqmpVarArr = {cqic.d(B().r(), new cqmp[0])};
        cqta e2 = cqta.e(14936042);
        cqmp<zdw>[] cqmpVarArr2 = {cqic.d(B().r(), new cqmp[0]), cqgr.dj(this.d)};
        cqmp[] cqmpVarArr3 = {cqgr.bi(B().r())};
        cqrp d = cqrp.d(4.0d);
        cqmj fY = cqgr.fY(cqgr.cd(-2), cqgr.bp(-2), cqgr.bw(8388661), cqgr.dz(d, d, d, d), cqgr.v(Integer.valueOf((int) R.drawable.taxi_tab_tick_background)), cqgr.aG(cqjv.r(B().a(), cqjv.u(B().r()))), cqgr.gc(cqgr.ce(vhp.a), cqgr.bq(vhp.a), cqgr.bw(17), cqgr.eD(2131232636)));
        cqrp d2 = cqrp.d(2.0d);
        cqtv cqtvVar = b;
        cqmp[] cqmpVarArr4 = {cqgr.cd(-2), cqgr.bp(-2), cqgr.bw(49), cqgr.bD(irh.m()), cqgr.L(false), cqgr.fY(cqgr.cd(-2), cqgr.bp(-2), cqgr.bw(17), cqgr.bA(cqrp.d(2.0d)), cqgr.dz(d2, d2, d2, d2), cqjv.k(B().a(), cqgr.v(Integer.valueOf((int) R.drawable.taxi_icon_border)), cqgr.v(Integer.valueOf((int) R.drawable.taxi_icon_border_unselected))), jfx.a(cqgr.cd(-2), cqgr.bp(-2), cqgr.fY(cqgr.ce(cqtvVar), cqgr.bq(cqtvVar), cqgr.gc(cqgr.ce(cqtvVar), cqgr.bq(cqtvVar), cqgr.z(ibm.b()), cqgr.eE(B().e()), cqgr.ei(ImageView.ScaleType.CENTER_INSIDE))))), fY};
        Integer valueOf = Integer.valueOf((int) R.drawable.taxi_category_pill);
        cqmj fY2 = cqgr.fY(cqgr.aR(Integer.valueOf((int) R.id.taxi_trip_icon)), cqgr.cd(-2), cqgr.bp(-2), cqgr.fY(cqmpVarArr4), cqgr.gq(cqgr.cd(-2), cqgr.bp(-2), cqgr.bw(81), cqgr.bD(cqrp.d(2.0d)), cqgr.dQ(irh.m()), cqgr.dF(irh.m()), cqgr.bl(cqjv.r(B().a(), cqjv.u(cqjv.v(B().c())))), cqgr.v(valueOf), ibq.s(), irn.z(), cqgr.eI(B().c())));
        cqmj fY3 = cqgr.fY(cqgr.aR(Integer.valueOf((int) R.id.taxi_trip_no_icon)), cqgr.cd(-2), cqgr.bp(-2), cqgr.bR(irh.k()), cqgr.bG(irh.k()), cqgr.gq(cqgr.cd(-2), cqgr.bp(-2), cqgr.bw(81), cqgr.bD(cqrp.d(2.0d)), cqgr.dQ(irh.m()), cqgr.dF(irh.m()), cqjv.k(cqjv.r(B().a(), cqjv.u(cqjv.v(B().c()))), cqgr.v(valueOf), cqgr.v(Integer.valueOf((int) R.drawable.taxi_category_pill_border))), ibq.s(), cqjv.k(cqjv.r(B().a(), cqjv.u(cqjv.v(B().c()))), cqgr.eU(irg.a()), cqgr.eU(irg.H())), cqgr.eI(B().c())));
        cqmn a = cqmn.a(cqgr.cd(-2), cqgr.bp(-2), cqgr.cz(cqrp.d(150.0d)), cqgr.aJ(1), ibq.p(), cqgr.eI(B().d()), cqgr.eU(irg.H()), irn.E());
        cqmh cqmhVar = new cqmh(zvu.class, cqgr.dr(1), cqgr.cd(-2), cqgr.bp(-1), cqgr.bV(cqrp.d(8.0d)), cqgr.bD(cqrp.d(12.0d)), cqgr.bR(irh.k()), cqgr.bG(irh.k()), cqgr.aJ(17), cqgr.cT(B().l()), cqgr.R(B().k()), iue.b(B().q(dtxn.dt)), fY2, fY3, jgi.d(cqgr.dr(0), cqgr.cd(-2), cqgr.bp(-2), cqgr.aJ(1), jgi.e(cqrp.d(2.0d)), cqgr.gq(cqgr.cd(-2), cqgr.bp(-2), cqgr.R(B().i()), cqgr.eI(B().h()), cqjv.m(B().a(), cqmn.a(ibq.f(), cqgr.fe(irn.b), cqgr.eU(ibm.x())), cqmn.a(ibq.f(), cqgr.fe(irn.e), cqgr.eU(ibm.t())))), zxb.a(cqgr.aD(cqjv.v(B().j())), zxb.c(B().j()), zxb.d(irh.k())), cqgr.fY(cqgr.aR(Integer.valueOf((int) R.id.taxi_trip_selection_tick)), cqgr.cd(-2), cqgr.bp(-2), fY)), cqgr.fY(cqgr.cd(-2), cqgr.bp(-2), cqgr.gq(a, cqgr.aD(B().b())), cqgr.gq(a, cqgr.ah(cqtt.j(vyt.a, cqrp.f(14.0d))), cqgr.al(cqrp.f(2.0d)), cqgr.aG(B().b()))));
        cqmhVar.f(cqmpVarArr3);
        return cqgr.fY(cqgr.cd(-2), cqgr.bp(-1), cqgr.bZ(new vhn(new Object[0])), e(e, cqmpVarArr), e(e2, cqmpVarArr2), cqmhVar);
    }
}
