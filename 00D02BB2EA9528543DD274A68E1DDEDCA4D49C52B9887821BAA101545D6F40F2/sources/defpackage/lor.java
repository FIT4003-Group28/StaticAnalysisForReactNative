package defpackage;

import android.text.TextUtils;
import com.google.android.apps.gmm.base.views.squeezedlabel.SqueezedLabelView;
/* compiled from: PG */
/* renamed from: lor  reason: default package */
/* loaded from: classes7.dex */
public final class lor extends cqiw<atnf> {
    public static final cqrp a;
    private static final atob c;
    private static final atob d;
    private static final cqtv e;
    private static final atob f;
    private static final atob g;
    private final Boolean b;

    static {
        cqrp d2 = cqrp.d(40.0d);
        a = d2;
        c = new atob(d2, nqo.g, nqo.m, nqo.g, cqrp.d(dcyn.a), 1.0f, false, nql.bl, 1.0f, 1.0f, 1.0f, nre.a, cqrp.d(4.0d));
        d = new atob(d2, nqo.g, nqo.m, nqo.g, cqrp.d(dcyn.a), 1.0f, false, nql.bl, 1.0f, 1.0f, 1.0f, nre.a, cqrp.d(4.0d));
        nps npsVar = new nps(npr.HEIGHT, nqo.m);
        npsVar.c(nqo.i, 420);
        e = npsVar;
        f = new atob(nqo.g, npsVar, nqo.m, npsVar, cqrp.d(dcyn.a), 1.0f, false, nql.bl, 1.0f, 1.0f, 1.0f, nre.a, cqrp.d(4.0d));
        g = new atob(nqo.g, npsVar, nqo.m, npsVar, cqrp.d(dcyn.a), 1.0f, false, nql.bl, 1.0f, 1.0f, 1.0f, nre.a, cqrp.d(4.0d));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public lor(boolean r3) {
        /*
            r2 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r1 = 0
            r0[r1] = r3
            r2.<init>(r0)
            r2.b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lor.<init>(boolean):void");
    }

    @SafeVarargs
    private final cqmj<atnf> e(cqmp<atnf>... cqmpVarArr) {
        cqmj<atnf> fY = cqgr.fY(cqgr.aD(cqjv.u(this.b)), itj.g(B().j()), cqjv.k(B().k(), iue.b(cjtd.a(dtxm.cw)), iue.b(null)));
        fY.f(cqmpVarArr);
        return fY;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<atnf> a() {
        cqmp<atnf>[] cqmpVarArr = {cqgr.aG(cqjv.r(npv.a(), B().k())), cqgr.cS(lrj.a), nqu.aQ(npv.a(), B().T(), true, nqo.ad), cqgr.az(true)};
        Float valueOf = Float.valueOf(1.0f);
        cqmj fY = cqgr.fY(cqgr.bp(-2), e(cqmpVarArr), SqueezedLabelView.c(cqgr.cd(-2), cqgr.bp(-2), cqgr.bw(8388627), cqgr.bR(nqo.R), cqgr.bG(nqo.R), cqgr.eI(B().M()), nre.a(), cqjv.k(B().T(), cqgr.eU(nql.bk), cqgr.eU(nql.bj)), SqueezedLabelView.d(cqrp.d(40.0d)), SqueezedLabelView.b(nqo.i), cqgr.ar(TextUtils.TruncateAt.END), cqgr.cC(loo.a), SqueezedLabelView.a(valueOf)));
        cqmj gd = cqgr.gd(cqgr.bp(-2), cqgr.dr(1), lon.e(), cqgr.fY(cqgr.dQ(nqo.R), cqgr.dF(nqo.R), cqgr.bp(-2), atnz.b(cqgr.bp(-2), cqgr.bw(48), cqgr.aG(B().t()), atnz.f(true), cqjv.k(B().T(), atnz.g(nql.bk), atnz.g(nql.bj)), atnz.i(false), cqjv.k(cqjv.s(B().J(), B().w(), B().L()), cqjv.k(B().T(), atnz.e(g), atnz.e(f)), cqjv.k(B().T(), atnz.e(d), atnz.e(c))), atnz.c(B().u()))));
        fY.f(cqgr.aI(lop.a), cqgr.bw(16));
        gd.f(cqgr.aF(loq.a), cqgr.bw(16));
        return cqgr.fY(cqgr.gd(cqgr.dr(1), cqgr.fY(cqgr.cd(-1), cqgr.bp(0), cqgr.ca(valueOf), fY, gd), lon.d(new cqmp[0])), e(cqgr.aD(npv.a()), cqjv.k(B().k(), nqu.aR(false), cqgr.x(cqtt.c())), cqgr.az(false)));
    }
}
