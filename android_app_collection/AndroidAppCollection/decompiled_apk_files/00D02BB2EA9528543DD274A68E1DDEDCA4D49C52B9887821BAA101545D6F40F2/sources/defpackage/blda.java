package defpackage;

import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
/* compiled from: PG */
/* renamed from: blda  reason: default package */
/* loaded from: classes3.dex */
public class blda extends cqiw<blkw> {
    public static final /* synthetic */ int a = 0;

    private static cqmj<blkw> e(final cqlc<blkw, CharSequence> cqlcVar, cqlc<blkw, cqss> cqlcVar2, final cqlc<blkw, CharSequence> cqlcVar3, cqlc<blkw, cqtv> cqlcVar4, cqnf<blkw> cqnfVar) {
        return cqgr.gd(cqgr.dr(0), cqgr.bp(-2), cqgr.cd(-2), cqgr.bV(cqrp.d(3.0d)), cqgr.gq(cqgr.aF(cqjv.x(cqlcVar)), cqgr.eN(5), irn.m(), cqgr.eW(cqlcVar2), cqgr.co(cqrp.d(3.0d), false), cqgr.fi(cqlcVar4), cqgr.eM(cqlcVar)), cqgr.gq(cqgr.aF(new cqlc(cqlcVar, cqlcVar3) { // from class: blcq
            private final cqlc a;
            private final cqlc b;

            {
                this.a = cqlcVar;
                this.b = cqlcVar3;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar5 = this.a;
                cqlc cqlcVar6 = this.b;
                blkw blkwVar = (blkw) cqkpVar;
                int i = blda.a;
                boolean z = true;
                if (!cqjv.v((CharSequence) cqlcVar5.a(blkwVar)).booleanValue() && !cqjv.v((CharSequence) cqlcVar6.a(blkwVar)).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.eN(5), irn.m(), irn.v(), cqgr.fi(cqlcVar4), cqgr.eI(" · ")), cqgr.gq(cqgr.aF(cqjv.x(cqlcVar3)), cqgr.eN(5), irn.m(), irn.v(), cqnfVar, cqgr.co(cqrp.d(3.0d), false), cqgr.ar(TextUtils.TruncateAt.END), cqgr.fi(cqlcVar4), cqgr.eM(cqlcVar3)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public cqmj<blkw> a() {
        cqlc cqlcVar = blca.a;
        cqmp[] cqmpVarArr = {cqgr.aF(blcl.a)};
        cqmj e = WebImageView.e(cqlcVar, cqgr.bw(16));
        e.f(cqmpVarArr);
        cqlc cqlcVar2 = blcs.a;
        cqmp[] cqmpVarArr2 = {cqgr.aI(blct.a)};
        cqmj a2 = WebImageView.a(WebImageView.l(cqlcVar2), cqgr.ei(ImageView.ScaleType.FIT_CENTER), cqgr.ce(irh.p()), cqgr.bq(irh.p()));
        a2.f(cqmpVarArr2);
        cqmj fY = cqgr.fY(cqgr.L(false), cqgr.bw(16), e, a2);
        cqmp[] cqmpVarArr3 = {cqgr.dQ(cqrp.d(16.0d)), cqgr.ca(Float.valueOf(1.0f)), cqgr.cd(0), cqgr.dr(1), cqgr.bw(16), cqgr.gq(cqgr.co(cqrp.d(5.0d), false), irn.l(), irn.x(), cqgr.eN(5), cqgr.eM(blcz.a), cqgr.cO(LinkMovementMethod.getInstance())), e(blcb.a, blcc.a, blcd.a, blce.a, cqgr.cD(blcf.a)), e(cqkz.a(null), cqkz.a(irg.H()), blcg.a, blch.a, cqgr.cB(1))};
        cqmp[] cqmpVarArr4 = {cqgr.aF(cqjv.x(blci.a)), cqgr.bp(-1), cqgr.cH(irh.a()), jhc.c(blcj.a), cqgr.V(blck.a), cqgr.ce(cqsv.f(56.0d, 56.0d, 120.0d, 64.0d))};
        cqlc cqlcVar3 = blcm.a;
        cqlc a3 = acly.a(blcn.a);
        cqlc cqlcVar4 = blco.a;
        cqlc cqlcVar5 = blcp.a;
        cqlc cqlcVar6 = blcr.a;
        cqlc a4 = cqkz.a(false);
        cqrp d = cqrp.d(12.0d);
        return cqgr.gd(cqgr.cH(cqrp.d(72.0d)), cqgr.cd(-1), cqgr.dQ(irh.b()), cqgr.dF(irh.b()), iue.c(blcu.a), cqgr.cW(acly.a(blcv.a)), cqgr.K(blcw.a), cqgr.x(ibo.h()), cqgr.dn(acly.b(blcx.a)), cqgr.cs(blcy.a), fY, cqgr.L(false), cqgr.gd(cqmpVarArr3), jhc.b(cqmpVarArr4), WebImageView.c(cqlcVar3, a4, cqgr.aF(cqjv.x(cqlcVar3)), cqgr.dz(d, d, d, d), cqgr.bR(cqrp.d(4.0d)), cqgr.V(cqlcVar5), cqgr.cW(a3), cqgr.K(cqlcVar4), cqgr.x(ibo.h()), iue.c(cqlcVar6), cqgr.bw(16)));
    }
}
