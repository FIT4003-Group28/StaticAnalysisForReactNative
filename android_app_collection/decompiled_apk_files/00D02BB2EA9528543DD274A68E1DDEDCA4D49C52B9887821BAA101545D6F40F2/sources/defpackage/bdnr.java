package defpackage;

import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.layout.FixedAspectRatioLayout;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bdnr  reason: default package */
/* loaded from: classes3.dex */
public final class bdnr extends cqiw<bdon> {
    public static final /* synthetic */ int a = 0;

    private static <T extends cqkp> cqmn<T> e() {
        return cqmn.a(cqgr.bA(irh.g()), cqgr.bw(8388659), cqgr.aW(2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bdon> a() {
        cqmp[] cqmpVarArr = {cqgr.cd(-1), cqgr.bp(-1)};
        cqlc cqlcVar = bdnp.a;
        cqgq a2 = itj.a();
        Float valueOf = Float.valueOf(0.8f);
        a2.f = valueOf;
        a2.g = valueOf;
        cqnf b = a2.b();
        cqgq a3 = itj.a();
        Float valueOf2 = Float.valueOf(1.0f);
        a3.f = valueOf2;
        a3.g = valueOf2;
        cqmp[] cqmpVarArr2 = {cqgr.cd(-1), cqgr.bp(-1)};
        cqmj fY = cqgr.fY(WebImageView.a(cqgr.ei(ImageView.ScaleType.CENTER_CROP), WebImageView.l(bdnb.a)), cqgr.gc(cqgr.eE(irm.p)));
        fY.f(cqmpVarArr2);
        cqmp[] cqmpVarArr3 = {cqjv.l(bdnq.a, cqgr.v(Integer.valueOf((int) R.drawable.quantum_gradient_bar_top)), cqgr.x(null)), cqgr.cd(-1), cqgr.bq(bdnx.b), cqgr.bw(48)};
        cqmp[] cqmpVarArr4 = {cqgr.bw(8388693)};
        cqlc cqlcVar2 = bdng.a;
        cqgq a4 = itj.a();
        a4.f = valueOf2;
        a4.g = valueOf2;
        cqnf b2 = a4.b();
        cqgq a5 = itj.a();
        a5.f = valueOf;
        a5.g = valueOf;
        cqmj gq = cqgr.gq(cqic.f(bdnf.a, new cqmp[0]), cqjv.l(cqlcVar2, b2, a5.b()), cqgr.cd(-2), cqgr.bp(-2), cqgr.bD(bdnx.f), cqgr.bG(bdnx.e), cqgr.x(cqui.c(cquh.a(0), cquh.g(cqrp.d(4.0d)), cquh.f(ibm.p()))), cqgr.dQ(cqrp.d(4.0d)), cqgr.dF(cqrp.d(4.0d)), cqgr.eU(ibm.b()), cqgr.fh(bdnx.g), cqgr.fe(irn.c), cqgr.eM(bdnh.a));
        gq.f(cqmpVarArr4);
        cqmj fY2 = cqgr.fY(cqjv.l(cqlcVar, b, a3.b()), fY, cqgr.gs(cqmpVarArr3), gq);
        fY2.f(cqmpVarArr);
        cqmp[] cqmpVarArr5 = {cqic.f(bdnn.a, new cqmp[0]), e()};
        Float valueOf3 = Float.valueOf(0.5f);
        cqlc cqlcVar3 = bdnd.a;
        cqgq a6 = itj.a();
        a6.a = valueOf2;
        cqnf b3 = a6.b();
        cqgq a7 = itj.a();
        a7.a = valueOf3;
        cqmj gc = cqgr.gc(cqgr.ce(bdnx.a), cqgr.bq(bdnx.a), cqgr.i(valueOf3), cqjv.l(cqlcVar3, b3, a7.b()), cqgr.eG(bdne.a));
        gc.f(cqmpVarArr5);
        cqmp[] cqmpVarArr6 = {cqic.c(bdno.a, new cqmp[0]), e()};
        Float valueOf4 = Float.valueOf(0.0f);
        cqlc cqlcVar4 = bdnc.a;
        cqgq a8 = itj.a();
        a8.a = valueOf2;
        cqnf b4 = a8.b();
        cqgq a9 = itj.a();
        a9.a = valueOf4;
        cqmj gc2 = cqgr.gc(cqgr.ce(bdnx.a), cqgr.bq(bdnx.a), cqgr.eD(2131231571), cqgr.i(valueOf4), cqjv.l(cqlcVar4, b4, a9.b()));
        gc2.f(cqmpVarArr6);
        return FixedAspectRatioLayout.a(iue.c(bdna.a), itj.b(Double.valueOf(1.0d)), cqgr.au(bdni.a), cqgr.cW(cqgr.q(bdnj.a)), cqgr.dn(cqgr.s(bdnk.a)), cqgr.cr(true), cqgr.dc(bdnl.a), cqgr.aL(false), cqgr.V(bdnm.a), fY2, gc, gc2);
    }
}
