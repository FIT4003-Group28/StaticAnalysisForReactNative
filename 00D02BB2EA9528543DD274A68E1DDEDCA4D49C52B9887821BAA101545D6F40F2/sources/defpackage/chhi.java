package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: chhi  reason: default package */
/* loaded from: classes4.dex */
final class chhi extends cqiw<chmz> {
    private final Boolean e() {
        return cqjv.r(cqjv.v(B().k()), cqjv.v(B().l()));
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, chmz chmzVar, Context context, cqiv cqivVar) {
        chmz chmzVar2 = chmzVar;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            cqivVar.f(new cheq(), chmzVar2.j());
            return;
        }
        for (chmx chmxVar : chmzVar2.d()) {
            cqivVar.a(chmxVar.b().booleanValue() ? new chgh() : new chgi(), chmxVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<chmz> a() {
        cqmp[] cqmpVarArr = {cqgr.dr(1), cqgr.bp(-2), cqgr.cd(-2), cqgr.dQ(cqrp.d(27.0d)), cqgr.dF(cqrp.d(27.0d)), cqjv.k(E(), cqgr.bV(cqrp.d(7.0d)), cqgr.bV(cqrp.d(24.0d))), cqgr.bw(1), cqgr.ck(D(1))};
        cqmp[] cqmpVarArr2 = {cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.dQ(cqrp.d(27.0d)), cqgr.dF(cqrp.d(27.0d)), cqjv.k(E(), cqgr.bV(cqrp.d(15.0d)), cqgr.bV(cqrp.d(20.0d))), cqgr.dB(cqrp.d(5.0d)), cqgr.bw(1), cqgr.ck(D(2))};
        cqmp[] cqmpVarArr3 = {cqgr.aD(e()), cqgr.cd(-1), cqgr.bq(cqrp.d(1.0d)), cqgr.dQ(cqrp.d(27.0d)), cqgr.dF(cqrp.d(27.0d)), cqgr.z(irg.D())};
        cqmp[] cqmpVarArr4 = {cqgr.aD(e())};
        cqmp[] cqmpVarArr5 = {cqgr.aT(chhn.b), cqgr.cd(-1), cqgr.bp(-2), cqgr.bY(cqjd.i()), cqgr.dr(0), cqgr.dQ(cqrp.d(27.0d)), cqgr.dC(0), cqgr.aJ(16), cqgr.gq(cqgr.ca(Float.valueOf(1.0f)), irn.i(), cqgr.eN(5), cqgr.fj(2), cqgr.eU(irg.J()), cqgr.eL(Integer.valueOf((int) R.string.LOCAL_GUIDE_POINTS_EARNED))), cqgr.gq(cqgr.ca(Float.valueOf(0.0f)), irn.i(), cqgr.fj(2), cqgr.eU(irg.K()), cqgr.eI(B().k()))};
        cqjd[] cqjdVarArr = {cqjd.k(chhn.b), cqjd.q(chhn.b)};
        cqgq a = itj.a();
        a.i(Float.valueOf(-1.0f));
        a.e = 1000L;
        a.d = 2000;
        a.i = new chhh();
        cqmj gj = cqgr.gj(cqgr.cd(-1), cqgr.bp(-2), cqjv.k(E(), cqgr.dU(cqrp.d(10.0d)), cqgr.dU(cqrp.d(20.0d))), cqgr.dF(cqrp.d(27.0d)), cqgr.gd(cqmpVarArr5), cqgr.gk(cqgr.aG(cqjv.A(B().s(), 1)), cqgr.aW(4), cqgr.cd(-2), cqgr.bq(cqrp.f(24.0d)), cqgr.bY(cqjdVarArr), cqgr.ep(false), cqgr.gq(cqgr.cd(-2), cqgr.bp(-2), cqgr.bV(cqrp.f(24.0d)), irn.i(), cqgr.fj(2), cqgr.eU(irg.K()), cqgr.eN(3), cqgr.eI(B().l()), a.b())));
        gj.f(cqmpVarArr4);
        return cqgr.gd(cqgr.bp(-2), cqjv.k(e(), cqgr.cd(-2), cqgr.cd(-1)), cqgr.bw(17), cqgr.dr(1), cqgr.gd(cqmpVarArr), cqgr.gd(cqmpVarArr2), cqgr.gs(cqmpVarArr3), gj, cqgr.gq(cqgr.aG(B().n()), cqgr.eI(B().o()), cqgr.dQ(cqrp.d(27.0d)), cqgr.dF(cqrp.d(27.0d)), cqgr.bV(cqrp.d(8.0d)), cqgr.cd(-1), cqgr.bp(-2), irn.n(), cqgr.fj(2), cqgr.eU(irg.j())), cqgr.gs(cqgr.aD(e()), cqgr.z(cqta.f()), cqgr.cd(-1), cqjv.k(E(), cqgr.bq(cqrp.d(10.0d)), cqgr.bq(cqrp.d(20.0d)))), cqgr.gc(cqgr.aG(e()), cqgr.cd(-1), cqgr.bp(-2), cqjv.k(E(), cqgr.bV(cqrp.d(15.0d)), cqgr.bV(cqrp.d(20.0d))), cqgr.ei(ImageView.ScaleType.FIT_XY), cqgr.eE(iup.e(R.raw.thanks_lg_optin_illus))));
    }
}
