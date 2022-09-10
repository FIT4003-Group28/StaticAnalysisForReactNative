package defpackage;

import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.layout.FixedAspectRatioLayout;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
/* compiled from: PG */
/* renamed from: bdij  reason: default package */
/* loaded from: classes3.dex */
public final class bdij extends cqiw<bdik> {
    public static final cqjg a = cqjg.a();
    private static final cqrp b = cqrp.d(20.0d);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bdik> a() {
        cqlc cqlcVar = bdia.a;
        cqgq a2 = itj.a();
        a2.d = 100;
        a2.f = Float.valueOf(0.9f);
        a2.g = Float.valueOf(0.81f);
        cqnf b2 = a2.b();
        cqgq a3 = itj.a();
        a3.d = 100;
        Float valueOf = Float.valueOf(1.0f);
        a3.f = valueOf;
        a3.g = valueOf;
        cqmp[] cqmpVarArr = {cqgr.cd(-1), cqgr.bp(-1), WebImageView.l(bdib.a), cqgr.ei(ImageView.ScaleType.CENTER_CROP), cqgr.cW(bdic.a), cqgr.K(bdid.a), iue.c(bdie.a), cqgr.V(bdif.a), cqgr.aT(a)};
        cqmp[] cqmpVarArr2 = {cqmn.a(cqgr.bA(irh.g()), cqgr.bw(8388659), cqgr.aW(2))};
        cqrp cqrpVar = b;
        Float valueOf2 = Float.valueOf(0.5f);
        cqlc cqlcVar2 = bdih.a;
        cqgq a4 = itj.a();
        a4.d = 0;
        a4.a = valueOf;
        a4.f = Float.valueOf(1.1111112f);
        a4.g = Float.valueOf(1.2345679f);
        cqnf b3 = a4.b();
        cqgq a5 = itj.a();
        a5.d = 0;
        a5.a = valueOf2;
        a5.f = valueOf;
        a5.g = valueOf;
        cqmj gc = cqgr.gc(cqgr.ce(cqrpVar), cqgr.bq(cqrpVar), cqic.f(bdig.a, new cqmp[0]), cqgr.eD(2131231571), cqgr.i(valueOf2), cqjv.l(cqlcVar2, b3, a5.b()), cqgr.eG(bdii.a));
        gc.f(cqmpVarArr2);
        return FixedAspectRatioLayout.a(itj.b(Double.valueOf(1.0d)), cqgr.z(ibm.u()), cqgr.fY(cqjv.l(cqlcVar, b2, a3.b()), WebImageView.a(cqmpVarArr), gc));
    }
}
