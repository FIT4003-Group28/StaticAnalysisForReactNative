package defpackage;

import android.text.TextUtils;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: wiz  reason: default package */
/* loaded from: classes7.dex */
public abstract class wiz extends cqiw<wpv> {
    private static final cqtv a = cqsg.g(irh.e(), irh.b());
    private static final cqtv b = irh.g();

    /* JADX INFO: Access modifiers changed from: protected */
    public final cqmj<wpv> e(int i, cqtv cqtvVar) {
        cqmp cqmpVar;
        cqmp cqmpVar2;
        cqtv cqtvVar2 = a;
        cqtv b2 = irh.b();
        cqmp[] cqmpVarArr = new cqmp[12];
        cqmpVarArr[0] = cqgr.cd(-1);
        cqmpVarArr[1] = cqgr.bq(cqtvVar);
        cqmpVarArr[2] = cqgr.aJ(8388627);
        Boolean ad = B().ad();
        cqnf i2 = cqgr.i(Float.valueOf(0.5f));
        Float valueOf = Float.valueOf(1.0f);
        cqmpVarArr[3] = cqjv.k(ad, i2, cqgr.i(valueOf));
        cqmpVarArr[4] = cqgr.dr(0);
        cqmpVarArr[5] = cqgr.dz(b2, cqrp.d(dcyn.a), b2, cqrp.d(dcyn.a));
        if (wiy.a(i)) {
            cqmpVar = cqgr.cV(B().I());
        } else {
            cqmpVar = cqmp.e;
        }
        cqmpVarArr[6] = cqmpVar;
        if (wiy.a(i)) {
            Boolean H = B().H();
            cqmpVar2 = cqmn.a(cqjv.k(H, cqgr.x(irn.F()), cqgr.x(ibl.b())), cqgr.J(H));
        } else {
            cqmpVar2 = cqmp.e;
        }
        cqmpVarArr[7] = cqmpVar2;
        cqmpVarArr[8] = iue.b(B().n());
        jhk j = B().j();
        cqtv cqtvVar3 = b;
        cqmp[] cqmpVarArr2 = {cqgr.cL(cqsg.g(cqtvVar2, cqtvVar3)), zxb.f(B().M()), zxb.e(B().M()), cqgr.bG(cqtvVar3)};
        zvb l = B().l();
        cqmj a2 = zxb.a(cqgr.cd(-2), cqgr.bp(-2), cqgr.eU(irg.J()), cqgr.eS(Integer.valueOf((int) R.style.TransitDetailsSegmentDescriptionText)), cqgr.fe(irn.e), cqgr.cB(1), cqgr.eB(true));
        a2.f(cqmpVarArr2);
        a2.f(zvb.a(l));
        a2.f(zxb.c(j));
        cqmpVarArr[9] = a2;
        String k = B().k();
        cqtd J = B().J();
        cqnf[] cqnfVarArr = {cqjv.k(B().s(), cqgr.dF(cqrp.d(20.0d)), cqgr.dG(0))};
        cqmj gq = cqgr.gq(irn.m(), cqgr.cB(1), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eU(ibl.d()), cqgr.eI(k));
        gq.f(new cqmp[0]);
        cqmp[] cqmpVarArr3 = {cqgr.bR(irh.g())};
        cqmj gc = cqgr.gc(cqgr.cd(-2), cqgr.bp(-2), cqgr.bw(16), cqgr.eE(J), cqgr.aD(cqjv.v(J)));
        gc.f(cqmpVarArr3);
        gc.f(new cqmp[0]);
        cqmj gd = cqgr.gd(cqgr.dr(0), cqgr.bp(-2), cqgr.cd(-2), gq, gc);
        gd.f(cqnfVarArr);
        cqnf[] cqnfVarArr2 = {cqgr.aG(B().s()), cqgr.bR(cqrp.d(-16.0d))};
        cqtd g = cqrt.g(2131232128, ibm.p());
        cqnf[] cqnfVarArr3 = {cqgr.T(cqrt.l(R.string.ACCESSIBILITY_WHEELCHAIR_ACCESSIBLE)), itj.i(dtyc.eP)};
        cqmj gc2 = cqgr.gc(cqgr.eE(g), cqgr.ei(ImageView.ScaleType.FIT_CENTER), cqgr.ch(cqrp.d(16.0d)), cqgr.bw(16));
        gc2.f(cqnfVarArr3);
        gc2.f(cqnfVarArr2);
        cqmpVarArr[10] = cqgr.gd(cqgr.cd(0), cqgr.ca(valueOf), gd, gc2);
        cqmpVarArr[11] = cqgr.gd(cqgr.bR(irh.g()), cqgr.gc(cqgr.eE(B().L()), cqgr.aD(cqjv.v(B().L())), iue.b(cjtd.a(dtyc.eg)), cqgr.E(true), cqgr.bG(cqrp.d(4.0d))), cqgr.gq(irn.m(), cqgr.cB(1), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eU(ire.s()), cqgr.eI(B().E())));
        return cqgr.gd(cqmpVarArr);
    }
}
