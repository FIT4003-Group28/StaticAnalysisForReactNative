package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: chfq  reason: default package */
/* loaded from: classes4.dex */
public final class chfq extends cqiw<chmz> {
    public static final cqjg a = cqjg.a();
    public static final cqjg b = cqjg.a();

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, chmz chmzVar, Context context, cqiv cqivVar) {
        cqiw chgdVar;
        Collection g;
        chmz chmzVar2 = chmzVar;
        if (i == 1) {
            for (chmx chmxVar : chmzVar2.d()) {
                cqivVar.a(chmxVar.b().booleanValue() ? new chgh() : new chgi(), chmxVar);
            }
            return;
        }
        if (i == 2) {
            chgdVar = new chgd();
            g = chmzVar2.g();
        } else if (i != 3) {
            return;
        } else {
            chgdVar = new cheq();
            g = chmzVar2.j();
        }
        cqivVar.f(chgdVar, g);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<chmz> a() {
        Boolean r = cqjv.r(F(), E());
        Float valueOf = Float.valueOf(1.0f);
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-1), cqgr.aJ(17), cqgr.dr(0), cqgr.gk(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.ca(valueOf), cqgr.gd(cqgr.bw(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.gc(cqgr.aD(E()), cqgr.bw(1), cqgr.cd(-2), cqgr.bp(-2), cqgr.eD(2131232103)), cqgr.gd(cqgr.bw(17), cqgr.bp(-2), cqjv.k(cqjv.v(B().k()), cqgr.cd(-2), cqgr.cd(-1)), cqgr.dr(1), cqgr.x(cqtt.l(irg.a(), cqrp.d(2.0d))), cqjv.k(E(), cqgr.bR(cqrp.d(145.0d)), cqgr.bR(cqrp.d(19.0d))), cqjv.k(E(), cqgr.bG(cqrp.d(145.0d)), cqgr.bG(cqrp.d(19.0d))), cqgr.gd(cqgr.dr(1), cqgr.bp(-2), cqgr.cd(-2), cqgr.dQ(cqrp.d(27.0d)), cqgr.dF(cqrp.d(27.0d)), cqjv.k(E(), cqgr.bV(cqrp.d(7.0d)), cqgr.bV(cqrp.d(24.0d))), cqgr.bw(1), cqgr.ck(D(1))), cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.dQ(cqrp.d(27.0d)), cqgr.dF(cqrp.d(27.0d)), cqjv.k(E(), cqgr.bV(cqrp.d(15.0d)), cqgr.bV(cqrp.d(20.0d))), cqgr.dB(cqrp.d(5.0d)), cqgr.bw(1), cqgr.ck(D(3))), cqgr.gs(cqgr.aD(cqjv.v(B().k())), cqgr.cd(-1), cqgr.bq(cqrp.d(1.0d)), cqgr.dQ(cqrp.d(27.0d)), cqgr.dF(cqrp.d(27.0d)), cqgr.z(irg.D())), cqgr.gj(cqgr.aD(cqjv.v(B().k())), cqgr.cd(-1), cqgr.bp(-2), cqjv.k(E(), cqgr.dU(cqrp.d(10.0d)), cqgr.dU(cqrp.d(20.0d))), cqgr.dF(cqrp.d(27.0d)), cqgr.gd(cqgr.aT(b), cqgr.cd(-1), cqgr.bp(-2), cqgr.bY(cqjd.i()), cqgr.dr(0), cqgr.dQ(cqrp.d(27.0d)), cqgr.dC(0), cqgr.aJ(16), cqgr.gq(cqgr.ca(valueOf), irn.i(), cqgr.eN(5), cqgr.fj(2), cqgr.eU(irg.J()), cqgr.eL(Integer.valueOf((int) R.string.LOCAL_GUIDE_POINTS_EARNED))), cqgr.gq(cqgr.ca(Float.valueOf(0.0f)), irn.i(), cqgr.fj(2), cqgr.eU(irg.K()), cqgr.eI(B().k())))), cqgr.gq(cqgr.aG(B().n()), cqgr.eI(B().o()), cqgr.dQ(cqrp.d(27.0d)), cqgr.dF(cqrp.d(27.0d)), cqgr.bV(cqrp.d(8.0d)), cqgr.cd(-1), cqgr.bp(-2), irn.n(), cqgr.fj(2), cqgr.eU(irg.j())), cqgr.gs(cqgr.aD(cqjv.v(B().k())), cqgr.z(cqta.f()), cqgr.cd(-1), cqjv.k(E(), cqgr.bq(cqrp.d(10.0d)), cqgr.bq(cqrp.d(20.0d)))), cqgr.gc(cqgr.aG(cqjv.v(B().k())), cqgr.cd(-1), cqgr.bp(-2), cqjv.k(E(), cqgr.bV(cqrp.d(15.0d)), cqgr.bV(cqrp.d(20.0d))), cqgr.ei(ImageView.ScaleType.FIT_XY), cqgr.eE(iup.e(R.raw.thanks_lg_optin_illus)))), cqgr.gd(cqgr.bp(-2), cqgr.cd(-2), cqgr.bV(cqrp.d(22.0d)), cqjv.k(cqjv.v(B().h()), cqgr.bD(cqrp.d(16.0d)), cqgr.bD(cqrp.d(dcyn.a))), cqgr.bw(1), cqjv.k(r, cqgr.dr(0), cqgr.dr(1)), cqgr.aT(a), cqgr.ck(D(2))), cqgr.gd(cqgr.aD(cqjv.v(B().h())), cqgr.bp(-2), cqgr.cd(-2), cqgr.bw(1), cqgr.aJ(1), cqgr.fO(new chgd(), B().h(), new cqmp[0])))));
    }
}
