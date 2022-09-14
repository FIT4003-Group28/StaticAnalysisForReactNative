package defpackage;

import android.text.TextUtils;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cixi  reason: default package */
/* loaded from: classes4.dex */
public final class cixi extends cqiw<cixj> {
    public static final /* synthetic */ int a = 0;
    private static final cqjg b = cqjg.a();
    private static final cqjg c = cqjg.a();
    private static final cqjg d = cqjg.a();
    private static final cqjg e = cqjg.a();
    private static final cqtd f = itd.b(ibm.ab(), iva.b(ibl.h(), ibl.p()), cqrp.d(1.0d), cqrp.d(dcyn.a), cqrp.d(dcyn.a), cqrp.d(dcyn.a));

    private static cqmn<cixj> e() {
        return cqmn.a(cqgr.cd(-1), cqgr.bp(-2), cqgr.fL(Float.valueOf(1.0f)), cqgr.bw(1), cqgr.aJ(1), cqmn.a(cqgr.bR(ibn.j()), cqgr.bG(ibn.j())), cqgr.bD(cqrp.d(14.0d)));
    }

    private static cqmn<cixj> f(int i, cjtd cjtdVar) {
        return cqmn.a(cqgr.cd(-1), cqgr.ca(Float.valueOf(0.5f)), cqgr.eL(Integer.valueOf(i)), iue.b(cjtdVar), cqgr.dQ(ibn.j()), cqgr.dF(ibn.j()), cqgr.cB(1), cqgr.ar(TextUtils.TruncateAt.END));
    }

    @SafeVarargs
    private static cqmj<cixj> h(cjtd cjtdVar, cqmp<cixj>... cqmpVarArr) {
        cqmj<cixj> c2 = hyb.c(cqgr.aR(Integer.valueOf((int) R.id.dialog_positive_button)), f(R.string.CZ_POINTS_DIALOG_PROFILE_LINK, cjtdVar));
        c2.f(cqmpVarArr);
        return c2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cixj> a() {
        cqlc cqlcVar = ciwl.a;
        cqlc q = cqgr.q(ciww.a);
        cqlc a2 = cqkz.a(cjtd.a(dtxl.hL));
        cqlc cqlcVar2 = cixa.a;
        cqlc q2 = cqgr.q(cixb.a);
        cqlc a3 = cqkz.a(cjtd.a(dtxl.hI));
        cqmp[] cqmpVarArr = {cqgr.bV(cqrp.d(16.0d)), cqic.c(cixc.a, new cqmp[0])};
        cqmj c2 = hyb.c(cqgr.aR(Integer.valueOf((int) R.id.dialog_negative_button)), f(R.string.CZ_POINTS_DIALOG_POINTS_STATS_LINK, cjtd.a(dtxl.hL)), cqgr.cW(cqgr.q(ciwt.a)));
        cqmj<cixj> h = h(cjtd.a(dtxl.hM), cqgr.cW(cqgr.q(ciwu.a)));
        cqmj<cixj> h2 = h(cjtd.a(dtxl.hM), cqgr.cW(cqgr.q(ciwv.a)), cqgr.bD(cqrp.d(-4.0d)));
        cqmp[] cqmpVarArr2 = {cqgr.dr(0), e(), c2, cqgr.gm(cqgr.ce(cqrp.d(8.0d))), h};
        h2.f(cqgr.bD(cqrp.d(-4.0d)));
        cqmj fY = cqgr.fY(ijc.n(cqlcVar, q, a2, cqlcVar2, q2, a3, cqmpVarArr), jdg.a(cqgr.gd(cqmpVarArr2), cqgr.gd(cqgr.dr(1), e(), h2, c2), cqgr.bV(cqrp.d(16.0d)), cqic.f(ciwx.a, new cqmp[0])));
        cqlc a4 = cqkz.a(cqrp.d(300.0d));
        cqrp d2 = cqrp.d(12.0d);
        cqmp[] cqmpVarArr3 = {cqgr.x(irn.O()), cqgr.bq(ibn.a()), cqgr.ce(ibn.a()), cqgr.dz(d2, d2, d2, d2), hyb.g(cqrt.g(2131231591, ibm.p())), cqgr.S(Integer.valueOf((int) R.string.CLOSE_BUTTON)), cqgr.aI(ciwy.a), cqgr.cW(cqgr.q(ciwz.a)), cqgr.bw(8388661), iue.b(cjtd.a(dtxl.hJ))};
        cqmp[] cqmpVarArr4 = {cqgr.bV(ibn.j()), cqgr.ch(cqrp.d(24.0d)), cqgr.ei(ImageView.ScaleType.CENTER), cqgr.eE(cqrt.g(2131232529, ibm.x()))};
        cqlc cqlcVar3 = cixd.a;
        cqmp[] cqmpVarArr5 = {cqgr.bV(ibn.d()), cqgr.bD(ibn.o())};
        cqjg cqjgVar = b;
        cqmp[] cqmpVarArr6 = {cqgr.aT(cqjgVar), cqgr.ce(cqrp.d(80.0d)), cqgr.eK(cqiq.c("%d", cqiq.h(cixe.a))), ibq.d(), ibq.v(), cqgr.eN(4), cqgr.aW(2)};
        cqjg cqjgVar2 = c;
        cqjd[] cqjdVarArr = {cqjd.u(cqjgVar)};
        Integer valueOf = Integer.valueOf((int) R.string.CZ_POINTS_DIALOG_LABEL_POINTS);
        cqmp[] cqmpVarArr7 = {cqgr.aT(cqjgVar2), cqgr.bY(cqjdVarArr), cqgr.ce(cqrp.d(80.0d)), cqgr.bD(cqrp.d(8.0d)), cqgr.eL(valueOf), ibq.q(), ibq.y(), cqgr.eN(4), cqgr.aW(2)};
        cqjd[] cqjdVarArr2 = {cqjd.A(cqjgVar), cqjd.k(cqjgVar), cqjd.f(), cqjd.m(cqjgVar2)};
        cqtd cqtdVar = f;
        cqmp[] cqmpVarArr8 = {cqgr.bY(cqjdVarArr2), cqgr.dz(ibn.o(), cqrp.d(4.0d), ibn.o(), cqrp.d(4.0d)), cqgr.bR(cqrp.d(6.0d)), cqgr.x(cqtdVar), cqgr.aJ(16), ijc.h(cixf.a, cqgr.eN(5), cqgr.V(cixg.a), cqgr.bA(cqrp.d(dcyn.a)))};
        cqjg cqjgVar3 = d;
        cqmp[] cqmpVarArr9 = {cqgr.aF(cixh.a), cqgr.aT(cqjgVar3), cqgr.bY(cqjd.u(cqjgVar2)), cqgr.ce(cqrp.d(80.0d)), cqgr.eK(cqiq.c("%d", cqiq.h(ciwm.a))), ibq.d(), ibq.v(), cqgr.eN(4), cqgr.aW(2)};
        cqjg cqjgVar4 = e;
        cqmp[] cqmpVarArr10 = {cqgr.cd(-1), cqgr.gq(cqmpVarArr6), cqgr.gq(cqmpVarArr7), cqgr.gj(cqmpVarArr8), cqgr.gq(cqmpVarArr9), cqgr.gq(cqgr.aF(ciwn.a), cqgr.aT(cqjgVar4), cqgr.bY(cqjd.u(cqjgVar3)), cqgr.ce(cqrp.d(80.0d)), cqgr.bD(cqrp.d(8.0d)), cqgr.eL(valueOf), ibq.q(), ibq.y(), cqgr.eN(4), cqgr.aW(2)), cqgr.gj(cqgr.aF(ciwo.a), cqgr.bY(cqjd.A(cqjgVar3), cqjd.k(cqjgVar3), cqjd.f(), cqjd.m(cqjgVar4)), cqgr.dz(ibn.o(), cqrp.d(4.0d), ibn.o(), cqrp.d(4.0d)), cqgr.bR(cqrp.d(6.0d)), cqgr.x(cqtdVar), cqgr.aJ(16), ijc.g(cqkz.a(" "), cqgr.eK(cqiq.b(Integer.valueOf((int) R.string.CZ_POINTS_DIALOG_MONTHLY_POINTS_DESCRIPTION), cqiq.h(ciwp.a))), cqgr.V(ciwq.a), cqgr.eN(5), cqgr.bA(cqrp.d(dcyn.a))))};
        cqrp d3 = cqrp.d(8.0d);
        return ijc.b(a4, cqgr.fY(hyb.e(cqmpVarArr3), cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.aJ(17), iue.b(cjtd.a(dtxl.hH)), cqgr.gc(cqmpVarArr4), ijc.f(cqlcVar3, cqmpVarArr5), cqgr.gj(cqmpVarArr10), jgn.a(cqgr.aI(ciwr.a), cqgr.cd(-1), cqgr.bV(cqrp.d(8.0d)), cqgr.bR(ibn.j()), cqgr.bG(ibn.j()), jgn.b(cqrp.d(5.0d)), cqgr.gd(cqgr.cd(-1), cqgr.dz(d3, d3, d3, d3), cqgr.z(ibm.O()), cqgr.gc(cqgr.bA(cqrp.d(4.0d)), cqgr.eD(2131232070)), iue.b(cjtd.a(dtxl.hK)), cqgr.gq(cqgr.bR(cqrp.d(8.0d)), cqgr.bw(16), cqgr.eL(Integer.valueOf((int) R.string.CZ_POINTS_DIALOG_LOCAL_GUIDE_PROMO_TEXT)), ibq.p()), cqgr.cW(cqgr.q(ciws.a)))), fY)));
    }
}
