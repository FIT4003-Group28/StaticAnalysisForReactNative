package defpackage;

import android.text.TextUtils;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
/* compiled from: PG */
/* renamed from: cans  reason: default package */
/* loaded from: classes4.dex */
final class cans extends cqiw<cafq> {
    public static final /* synthetic */ int a = 0;

    @SafeVarargs
    private static final cqmj<cafq> e(cqmp<cafq>... cqmpVarArr) {
        cqmj<cafq> gd = cqgr.gd(cqgr.bD(irh.h()), cqgr.aJ(16), WebImageView.a(WebImageView.l(canh.a), cqgr.ei(ImageView.ScaleType.FIT_CENTER), cqgr.ce(irh.r()), cqgr.bq(irh.r()), cqgr.bG(irh.g())), cqgr.gq(cqgr.eM(cani.a), irn.v(), irn.E()));
        gd.f(cqmpVarArr);
        return gd;
    }

    @SafeVarargs
    private static cqmj<cafq> f(cqlc<cafq, CharSequence> cqlcVar, final cqlc<cafq, Boolean> cqlcVar2, cqmp<cafq>... cqmpVarArr) {
        cqmj<cafq> gq = cqgr.gq(cqgr.aF(cqjv.x(cqlcVar)), cqgr.eM(cqlcVar), cqjv.n(new cqlc(cqlcVar2) { // from class: canj
            private final cqlc a;

            {
                this.a = cqlcVar2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                int i = cans.a;
                return (Boolean) this.a.a((cafq) cqkpVar);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }, irn.k(), irn.m()), cqgr.cB(2), cqgr.ar(TextUtils.TruncateAt.END));
        gq.f(cqmpVarArr);
        return gq;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cafq> a() {
        cqmp[] cqmpVarArr = {cqgr.x(irn.G()), cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.dQ(irh.e()), cqgr.dF(irh.b()), cqgr.bF(cano.a), e(cqgr.aI(canp.a)), f(canq.a, canr.a, cqgr.bD(irh.h())), e(cqgr.aI(camw.a)), f(camx.a, camy.a, cqgr.bX(camz.a)), e(cqgr.aI(cana.a), cqgr.bV(irh.h())), f(canb.a, canc.a, cqgr.bV(irh.h()))};
        cqmj d = hax.d(cqkz.a(false), cqgr.q(cand.a), cane.a, cqkz.a(null), false);
        d.g(cqgr.aI(canf.a));
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.aF(camv.a), cqjv.l(cang.a, cqgr.bq(cqrp.d(dcyn.a)), cqgr.bp(-2)), cqgr.dr(1), cqgr.cW(cqgr.q(cank.a)), cqgr.K(canl.a), itj.i(dtyd.cc), cqgr.fP(new gvb(), canm.a, new cqmp[0]), cqgr.fP(new canz(), cann.a, new cqmp[0]), cqgr.gd(cqmpVarArr), d);
    }
}
