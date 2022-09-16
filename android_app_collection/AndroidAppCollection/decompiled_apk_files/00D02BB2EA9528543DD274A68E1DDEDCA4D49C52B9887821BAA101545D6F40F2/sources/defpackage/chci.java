package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
/* compiled from: PG */
/* renamed from: chci  reason: default package */
/* loaded from: classes4.dex */
public final class chci extends cqiw<chmz> {
    private static cqmn<chmz> e(int i) {
        cqgq n = cqgr.n();
        n.d = 800;
        n.e = Long.valueOf(i * 300);
        n.a = Float.valueOf(1.0f);
        return cqmn.a(cqgr.i(0), n.b());
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, chmz chmzVar, Context context, cqiv cqivVar) {
        chmz chmzVar2 = chmzVar;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            cqivVar.f(new chgd(), chmzVar2.g());
            return;
        }
        for (chmx chmxVar : chmzVar2.d()) {
            cqivVar.a(chmxVar.b().booleanValue() ? new chgj() : new chgl(), chmxVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<chmz> a() {
        Boolean r = cqjv.r(F(), E());
        Float valueOf = Float.valueOf(1.0f);
        cqmp[] cqmpVarArr = {cqgr.dr(1), e(1), cqgr.bp(-2), cqgr.cd(-2), cqgr.ck(D(1))};
        cqgq n = cqgr.n();
        n.d = 800;
        n.h(cqrp.d(dcyn.a));
        n.a = valueOf;
        return cqgr.gk(cqgr.bw(17), cqjv.k(E(), cqgr.ce(cqrp.f(500.0d)), cqgr.cd(-2)), cqgr.ca(valueOf), cqgr.gd(cqgr.bw(17), cqgr.dr(1), cqgr.fY(cqgr.bp(-2), cqgr.cd(-2), cqgr.bw(1), cqgr.aJ(1), cqgr.gd(cqgr.bV(cqrp.d(48.0d)), cqgr.x(cqtt.l(irg.a(), cqrp.d(2.0d))), cqgr.dr(1), cqgr.dQ(cqrp.d(40.0d)), cqgr.dF(cqrp.d(40.0d)), cqgr.dU(cqrp.d(40.0d)), cqgr.gd(cqmpVarArr), WebImageView.a(cqgr.ch(cqrp.d(218.0d)), WebImageView.k(B().e()), cqgr.ei(ImageView.ScaleType.FIT_CENTER), cqgr.i(Float.valueOf(0.0f)), cqgr.fr(cqrp.d(40.0d)), n.b())), WebImageView.a(cqgr.aD(cqjv.t(cqjv.v(B().f()), cqjv.r(E(), cqjv.u(B().m())))), cqgr.bw(1), cqgr.bV(cqrp.d(18.0d)), cqgr.ch(cqrp.d(60.0d)), WebImageView.k(B().f()), cqgr.ei(ImageView.ScaleType.FIT_CENTER))), cqgr.gd(cqgr.bV(cqrp.d(22.0d)), cqjv.k(cqjv.v(B().h()), cqgr.bD(cqrp.d(16.0d)), cqgr.bD(cqrp.d(dcyn.a))), cqgr.aJ(1), cqgr.bw(1), e(2), cqjv.k(r, cqgr.dr(0), cqgr.dr(1)), cqgr.ck(D(2))), cqgr.gd(cqgr.aD(cqjv.v(B().h())), cqgr.bw(1), cqgr.aJ(1), e(2), cqgr.fO(new chgd(), B().h(), new cqmp[0]))));
    }
}
