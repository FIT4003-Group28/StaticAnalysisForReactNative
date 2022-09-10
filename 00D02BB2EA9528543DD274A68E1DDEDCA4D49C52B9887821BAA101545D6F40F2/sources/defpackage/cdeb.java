package defpackage;

import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
/* compiled from: PG */
/* renamed from: cdeb  reason: default package */
/* loaded from: classes4.dex */
public final class cdeb extends cqiw<cdfj> {
    private static final cqtv a = cqrp.d(5.0d);

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> e(cqlc<T, jic> cqlcVar, cqmp<T>... cqmpVarArr) {
        cqmj<T> fY = cqgr.fY(cqgr.cd(-1), cqgr.bq(cqrp.d(100.0d)), WebImageView.a(cqgr.cd(-1), cqgr.bp(-1), WebImageView.l(cqlcVar), cqgr.ei(ImageView.ScaleType.CENTER_CROP)));
        fY.f(cqmpVarArr);
        return fY;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cdfj> a() {
        cqlc cqlcVar = cdds.a;
        Float valueOf = Float.valueOf(0.5f);
        cqlc cqlcVar2 = cddw.a;
        cqgq a2 = itj.a();
        a2.a = Float.valueOf(1.0f);
        cqnf b = a2.b();
        cqgq a3 = itj.a();
        a3.a = valueOf;
        return e(cqlcVar, iue.c(cddt.a), cqgr.J(true), cqgr.cW(cqgr.q(cddu.a)), cqgr.aW(2), cqgr.gc(cqgr.aW(1), cqgr.az(true), cqgr.V(cddv.a), irn.A(), cqgr.bw(8388659), cqgr.bA(irh.g()), cqgr.i(valueOf), cqjv.l(cqlcVar2, b, a3.b()), cqgr.eG(cddx.a)), cqgr.gc(cqgr.aW(1), cqgr.J(true), iue.c(cddy.a), cqgr.cW(cqgr.q(cddz.a)), cqgr.bw(8388693), cqgr.ce(irh.a()), cqgr.bq(irh.a()), cqgr.dF(cqrp.d(-8.0d)), cqgr.dB(cqsg.g(cqrp.d(-8.0d), a)), cqgr.i(Float.valueOf(0.7f)), cqgr.eD(2131231570), cqgr.V(cdea.a), cqgr.ei(ImageView.ScaleType.CENTER)));
    }
}
