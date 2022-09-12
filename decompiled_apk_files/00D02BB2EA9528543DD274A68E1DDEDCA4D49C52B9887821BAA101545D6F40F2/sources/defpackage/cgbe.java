package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cgbe  reason: default package */
/* loaded from: classes4.dex */
public final class cgbe extends cqiw<cgbf> {
    public static final /* synthetic */ int a = 0;
    private static final cqrp b = cqrp.d(56.0d);
    private static final cqrp c = cqrp.d(8.0d);
    private static final cqrp d = cqrp.d(14.0d);
    private static final cqjg e = cqjg.a();
    private static final cqjb<cgbf, Integer> f = cgau.a;

    public static CharSequence e(cgbf cgbfVar, Context context) {
        int intValue = cgbfVar.g().intValue();
        String quantityString = context.getResources().getQuantityString(R.plurals.CONTRIBUTIONS_STAT_FOLLOWER_COUNT, intValue, Integer.valueOf(intValue));
        return cgbfVar.h().booleanValue() ? dbrz.e(",").i(quantityString, context.getText(R.string.FOLLOWER_COUNT_UPDATE_DESCRIPTION), new Object[0]) : quantityString;
    }

    public static jic f(cgbf cgbfVar) {
        return new jic(cgbfVar.b(), ckqc.FIFE_MERGE, 2131232998, 0);
    }

    public static jic h(cgbf cgbfVar) {
        return new jic(cgbfVar.m(), ckqc.FULLY_QUALIFIED, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cgbf> a() {
        cqlc cqlcVar = cgam.a;
        cqmp[] cqmpVarArr = {cqgr.bX(cqlcVar), cqgr.bF(cqlcVar)};
        cqa[] cqaVarArr = {cpp.d(cqrt.l(R.string.VIEW_YOUR_PROFILE))};
        cqmp[] cqmpVarArr2 = {cqgr.aF(cgaw.a)};
        cqrp cqrpVar = b;
        cqmj a2 = WebImageView.a(cqgr.ce(cqrpVar), cqgr.bq(cqrpVar), WebImageView.m(cgas.a), cqgr.ei(ImageView.ScaleType.CENTER_INSIDE));
        a2.f(cqmpVarArr2);
        Float valueOf = Float.valueOf(1.0f);
        cqmp[] cqmpVarArr3 = {cqgr.cd(-2), ibq.g(), cqgr.eM(cgax.a)};
        cqlc cqlcVar2 = cgay.a;
        cqlc cqlcVar3 = cgaz.a;
        cqlc cqlcVar4 = cgba.a;
        cqmp[] cqmpVarArr4 = {cqgr.aF(cqlcVar2), cqmn.a(ibq.p(), cqgr.eU(ibm.n()), cqgr.eN(5)), cqgr.eK(cqiq.f(R.plurals.UGC_CONTRIBUTION_COUNT, cqlcVar4, cqiq.h(cqlcVar4)))};
        cqmp[] cqmpVarArr5 = {cqgr.aF(cgar.a), cqgr.bG(cqrp.d(8.0d))};
        cqrp cqrpVar2 = d;
        cqmj a3 = WebImageView.a(cqgr.ce(cqrpVar2), cqgr.bq(cqrpVar2), WebImageView.m(cgat.a), cqgr.ei(ImageView.ScaleType.CENTER_INSIDE));
        a3.f(cqmpVarArr5);
        cqmp[] cqmpVarArr6 = {cqgr.fJ(f), cqgr.cd(-2), cqgr.cH(cqrp.d(20.0d)), cqgr.aJ(16), cqgr.gq(cqmpVarArr4), cqgr.gd(cqgr.aI(cqlcVar2), a3, cqgr.aJ(16), cqgr.gq(cqmn.a(ibq.p(), cqgr.eU(ibm.n()), cqgr.eN(5)), cqgr.eL(Integer.valueOf((int) R.string.LOCAL_GUIDE_PREFIX))), cqgr.gq(cqmn.a(ibq.p(), cqgr.eU(ibm.n()), cqgr.eN(5)), cqgr.eI(" · "), cqgr.aW(2)), cqgr.gq(cqmn.a(ibq.p(), cqgr.eU(ibm.n()), cqgr.eN(5)), cqgr.eK(cqiq.f(R.plurals.LOCAL_GUIDE_CURRENT_LEVEL, cqlcVar3, cqiq.h(cqlcVar3)))))};
        cqmp[] cqmpVarArr7 = {cqgr.ca(valueOf), cqgr.cW(cqgr.q(cgbb.a)), iue.b(cjtd.a(dtxl.ez)), cqgr.dQ(cqrp.d(dcyn.a)), ibq.r(), cqgr.eU(ibm.x()), cqgr.eL(Integer.valueOf((int) R.string.VIEW_YOUR_PROFILE))};
        cqlc cqlcVar5 = cgbc.a;
        cqlc q = cqgr.q(cgbd.a);
        cqlc cqlcVar6 = cgan.a;
        cqlc cqlcVar7 = cgao.a;
        cqa[] cqaVarArr2 = {cpp.f()};
        cqjg cqjgVar = e;
        cqmj fY = cqgr.fY(cqgr.cd(-2), cqgr.bp(-2), cqgr.cH(ibn.a()), cqgr.cL(ibn.a()), cqgr.dJ(cqrp.d(8.0d)), cqgr.U(cgap.a), cqgr.cW(q), cqgr.x(ibo.a()), iue.c(cgaq.a), cqgr.c(2), cpp.g(cqaVarArr2), cqgr.L(false), cqgr.P(false), cqgr.aI(cqlcVar5), cqgr.gj(cqgr.cd(-1), cqgr.bp(-1), cqgr.bw(17), cqgr.P(false), cqgr.dL(cqrp.d(4.0d)), cqgr.gq(cqgr.aT(cqjgVar), ibq.r(), cqgr.eU(ibm.x()), cqgr.eN(4), cqgr.eK(cqiq.f(R.plurals.CONTRIBUTIONS_STAT_FOLLOWER_COUNT, cqlcVar6, cqiq.h(cqlcVar6)))), cqgr.fY(cqgr.aI(cqlcVar7), cqgr.bY(cqjd.k(cqjgVar), cqjd.q(cqjgVar)), cqgr.bV(cqrp.d(-4.0d)), cqgr.bG(cqrp.d(-5.0d)), cqgr.ch(c), cqgr.x(cqtt.g(ibm.D())))));
        fY.f(cqgr.ca(valueOf));
        return cqgr.gd(cfun.b(), cqmn.a(cqmpVarArr), cqgr.dr(0), cpp.g(cqaVarArr), cqgr.cW(cqgr.q(cgav.a)), iue.b(cjtd.a(dtxl.ez)), a2, cqgr.gd(cqgr.ce(cqrp.d(dcyn.a)), cqgr.ca(valueOf), cqgr.bp(-2), cqgr.dQ(cqrp.d(12.0d)), cqgr.dr(1), cqgr.gq(cqmpVarArr3), cqgr.fY(cqmpVarArr6), cqgr.gd(cqgr.cd(-2), cqgr.aJ(16), hyb.d(cqmpVarArr7), fY)));
    }
}
