package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.map.MapViewContainer;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cfav  reason: default package */
/* loaded from: classes4.dex */
public final class cfav extends cqiw<cfhe> {
    private static final cqjg b = cqjg.a();
    public static final cqjg a = cqjg.a();
    private static final cqtv c = cqsg.h(ise.b);

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, cfhe cfheVar, Context context, cqiv cqivVar) {
        cfhe cfheVar2 = cfheVar;
        if (i == 0) {
            cfheVar2.d(cqivVar);
        } else {
            cfheVar2.e(cqivVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cfhe> a() {
        Float valueOf = Float.valueOf(1.0f);
        cqmp[] cqmpVarArr = {cqgr.aI(cqjv.x(cfak.a)), cqgr.bp(-1), cqgr.cd(-1), MapViewContainer.f(true), cqgr.fF(cfal.a)};
        cqmp[] cqmpVarArr2 = {cqgr.aF(cqjv.x(cfai.a)), cqgr.bp(-1), cqgr.cd(-1), cqgr.ei(ImageView.ScaleType.CENTER_INSIDE), cqgr.eG(cfaj.a)};
        cqjg cqjgVar = b;
        cqmj a2 = cflh.a(cqgr.aF(cfaf.a), cqgr.bp(-1), cqgr.cd(0), cqgr.ca(valueOf), cqgr.bV(c), cqgr.cH(cqrp.d(160.0d)), cflh.b(cfam.a), MapViewContainer.a(cqmpVarArr), cqgr.gc(cqmpVarArr2), cqgr.fR(new cfba(), cfan.a, new cqmp[0]), cqgr.gj(cqgr.bm(cfau.a), cqgr.cd(-1), cqgr.bp(-1), cqgr.gs(cqgr.aT(cqjgVar), cqgr.bp(0), cqgr.cd(0), cqgr.bw(8388611), cqgr.bw(80), cqgr.bY(cqjd.j())), cqgr.fY(cqgr.bY(cqjd.A(cqjgVar), cqjd.j()), cqgr.fY(cqgr.bR(cqrp.d(14.0d)), cqgr.bD(cqrp.d(14.0d)), cqgr.x(cqrt.f(2131232097)), cqgr.gj(cqgr.ce(cqrp.d(88.0d)), cqgr.bq(cqrp.d(52.0d)), WebImageView.a(cqgr.aR(Integer.valueOf((int) R.id.street_view_thumbnail)), cqgr.cd(-1), cqgr.bp(-1), cqgr.T(cqrt.l(R.string.STREET_VIEW_THUMBNAIL)), WebImageView.l(cfag.a), cqgr.cW(cqgr.q(cfah.a))), cqgr.gc(cqgr.cd(-2), cqgr.bp(-2), cqgr.bR(cqrp.d(5.0d)), cqgr.bY(cqjd.e(), cqjd.j()), cqgr.eE(cqrt.f(2131231803))))))));
        cqmj gd = cqgr.gd(cqgr.bp(-2), cqgr.cd(-1), cqgr.dU(ird.b()), cqgr.ck(D(0)));
        cqmj c2 = zvk.c(cqgr.gk(cqgr.fu(true), cqgr.aT(a), cqgr.gd(cqgr.bp(-1), cqgr.cd(-1), cqgr.fR(new cfae(), cfao.a, new cqmp[0]), cqgr.gd(cqgr.bp(-1), cqgr.cd(-1), cqgr.ck(D(1))))), new cqmp[0]);
        c2.f(cqgr.x(ibm.b()), cqgr.bp(0), cqgr.cd(-1), cqgr.ca(valueOf));
        return cqgr.fY(cqgr.gd(cqgr.aI(cfar.a), cqgr.bp(-1), cqgr.cd(-1), cqgr.dr(0), cqgr.aW(2), cqgr.gd(cqgr.x(ibm.ab()), cqgr.ap(cqrp.d(16.0d)), cqgr.bp(-1), cqgr.ca(valueOf), cqgr.cd(0), cqgr.dr(1), gd, c2, cqgr.gk(cqgr.aI(cfap.a), cqgr.bp(-2), cqgr.cd(-1), cqgr.fR(new cffo(), cfaq.a, new cqmp[0]))), a2, cqgr.fF(cfas.a), cqgr.bF(cfat.a)), iue.b(cjtd.a(dtxy.nZ)));
    }
}
