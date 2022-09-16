package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cbws  reason: default package */
/* loaded from: classes4.dex */
public final class cbws extends cqiw<cbwt> {
    private static final cqrp a = cqrp.d(16.0d);
    private static final cqrp b = cqrp.d(20.0d);
    private static final cqrp c = cqrp.d(6.0d);
    private static final cqrp d = cqrp.d(48.0d);
    private static final cqrp e = cqrp.d(40.0d);
    private static final cqrp f = cqrp.d(40.0d);
    private static final cqrp g = cqrp.d(52.0d);
    private static final cqrp h = cqrp.d(8.0d);
    private static final cqrp i = cqrp.d(15.0d);

    private static cqmj<cbwt> e() {
        cqrp cqrpVar = d;
        return cqgr.fY(cqgr.gq(ibq.h(), cqgr.dF(cqrpVar), cqgr.dL(b), cqgr.eM(cbwk.a), cqgr.eN(2)), cqgr.gb(cqgr.bw(8388613), cqgr.bV(c), cqgr.ch(cqrpVar), cqgr.x(irn.J()), cqgr.ei(ImageView.ScaleType.CENTER), cqgr.eE(cqrt.g(2131231593, ibm.n())), cqgr.S(Integer.valueOf(cbru.SINGLE_REVIEW_FEEDBACK_MENU_BUTTON_DESCRIPTION)), iue.c(cbwl.a), cqgr.cW(cbwm.a)));
    }

    private static cqmj<cbwt> f(cqlc<cbwt, View.OnClickListener> cqlcVar, cqlc<cbwt, cjtd> cqlcVar2, cqmp<cbwt>... cqmpVarArr) {
        cqrp d2 = cqrp.d(8.0d);
        cqmj<cbwt> w = hyw.w(cqkz.a(null), cqlcVar, cqlcVar2, cqkz.a(null), cqkz.a(null), cqkz.a(true), cqkz.a(false), cqmpVarArr);
        w.f(cqgr.bI(cqkz.a(d2)), cqgr.eU(ibm.x()));
        return w;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cbwt> a() {
        cqmp[] cqmpVarArr = {hxc.b(cbwj.a)};
        cqmp[] cqmpVarArr2 = {WebImageView.a(cqgr.bw(8388611), cqgr.bq(e), cqgr.ce(f), WebImageView.l(cbwn.a)), cqgr.gd(cqgr.dr(1), cqgr.dQ(g), cqgr.gq(ibq.o(), cqgr.eM(cbwo.a), cqgr.eN(2)), cqgr.gq(ibq.q(), cqgr.dU(h), cqgr.eM(cbwp.a), cqgr.eN(2)))};
        cqmp[] cqmpVarArr3 = {cqgr.cd(-1), cqgr.bp(-2), cqgr.dU(ibn.f()), cqgr.dr(0), f(cbwq.a, cbwr.a, cqgr.eL(Integer.valueOf((int) R.string.REVIEW_HELPFUL_FEEDBACK))), f(cbwc.a, cbwd.a, cqgr.eL(Integer.valueOf((int) R.string.REVIEW_NOT_HELPFUL_FEEDBACK)), cqgr.aI(cbwe.a)), f(cbwf.a, cbwg.a, cqgr.eL(Integer.valueOf((int) R.string.REVIEW_FEEDBACK_SKIP_BUTTON)), cqgr.S(Integer.valueOf((int) R.string.REVIEW_FEEDBACK_SKIP_BUTTON_DESCRIPTION)))};
        cqrp cqrpVar = i;
        return cqgr.gd(cqgr.dr(1), cqgr.bp(-1), cqgr.cd(-1), cqgr.z(ibm.b()), iue.c(cbwb.a), hxc.a(cqmpVarArr), cqgr.gk(cqgr.gd(cqgr.dr(1), cqgr.bp(-1), cqgr.cd(-1), cqgr.dJ(a), e(), cqgr.fY(cqmpVarArr2), cqgr.gd(cqmpVarArr3), cqgr.gq(ibq.q(), cqgr.dz(cqrpVar, cqrpVar, cqrpVar, cqrpVar), cqgr.eK(cqiq.d(cqkz.a(Integer.valueOf((int) R.string.REVIEW_FEEDBACK_TASK_PROGRESS_TEXT)), cqiq.h(cbwh.a), cqiq.h(cbwi.a))), cqgr.eN(3)))));
    }
}
