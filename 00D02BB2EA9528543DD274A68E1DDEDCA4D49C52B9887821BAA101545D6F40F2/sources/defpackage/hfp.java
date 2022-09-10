package defpackage;

import android.text.TextUtils;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import defpackage.jax;
/* compiled from: PG */
/* renamed from: hfp  reason: default package */
/* loaded from: classes6.dex */
public abstract class hfp<V extends jax> extends cqiw<V> {
    public static final /* synthetic */ int a = 0;

    private static <T extends cqkp> cqmj<T> f(final cqlc<T, CharSequence> cqlcVar, cqlc<T, cqss> cqlcVar2, final cqlc<T, CharSequence> cqlcVar3, cqlc<T, cqtv> cqlcVar4, cqnf<T> cqnfVar) {
        return cqgr.gd(cqgr.dr(0), cqgr.bp(-2), cqgr.cd(-2), cqgr.bV(cqrp.d(3.0d)), cqgr.gq(cqgr.aF(cqjv.x(cqlcVar)), cqgr.eN(5), irn.m(), cqgr.eW(cqlcVar2), cqgr.co(cqrp.d(3.0d), false), cqgr.fi(cqlcVar4), cqgr.eM(cqlcVar)), cqgr.gq(cqgr.aF(new cqlc(cqlcVar, cqlcVar3) { // from class: hff
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
                int i = hfp.a;
                boolean z = true;
                if (!cqjv.v((CharSequence) cqlcVar5.a(cqkpVar)).booleanValue() && !cqjv.v((CharSequence) cqlcVar6.a(cqkpVar)).booleanValue()) {
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
    public final cqmj<V> a() {
        return d(hep.a, e(), hfa.a, hfh.a, hfi.a);
    }

    protected abstract cqmp<V> e();

    public static <V extends jax> cqmj<V> d(cqlc<V, CharSequence> cqlcVar, cqmp<V> cqmpVar, cqlc<V, CharSequence> cqlcVar2, cqlc<V, cqtv> cqlcVar3, cqlc<V, jic> cqlcVar4) {
        cqmj fY = cqgr.fY(WebImageView.j(cqlcVar4, cqic.c(hfk.a, new cqmp[0]), cqgr.bw(16)), WebImageView.e(cqlcVar4, cqic.c(hfj.a, new cqmp[0]), cqgr.bw(16)), cqgr.L(false), cqgr.bw(16));
        cqmp[] cqmpVarArr = {cqgr.dQ(cqrp.d(16.0d)), cqgr.ca(Float.valueOf(1.0f)), cqgr.cd(0), cqgr.dr(1), cqgr.bw(16), cqgr.gq(cqgr.co(cqrp.d(5.0d), false), cqmpVar, irn.x(), cqgr.eN(5), cqgr.eM(cqlcVar)), f(her.a, hes.a, cqlcVar2, cqlcVar3, cqgr.cB(1)), f(cqkz.a(null), cqkz.a(irg.H()), het.a, heu.a, cqgr.cB(1))};
        cqmp[] cqmpVarArr2 = {cqgr.bp(-1), cqgr.cH(irh.a()), jhc.c(hev.a), cqgr.V(hew.a), cqgr.ce(cqsv.f(56.0d, 56.0d, 120.0d, 64.0d)), cqgr.aF(cqjv.x(hex.a))};
        cqlc cqlcVar5 = hey.a;
        cqlc a2 = acly.a(hez.a);
        cqlc cqlcVar6 = hfb.a;
        final cqlc cqlcVar7 = hfc.a;
        final cqlc cqlcVar8 = hfd.a;
        cqlc cqlcVar9 = hfe.a;
        cqlc cqlcVar10 = new cqlc(cqlcVar8, cqlcVar7) { // from class: hfg
            private final cqlc a;
            private final cqlc b;

            {
                this.a = cqlcVar8;
                this.b = cqlcVar7;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar11 = this.a;
                cqlc cqlcVar12 = this.b;
                int i = hfp.a;
                if (cqlcVar11.a(cqkpVar) != null) {
                    return (cjtd) cqlcVar11.a(cqkpVar);
                }
                if (cqlcVar12.a(cqkpVar) == null) {
                    return null;
                }
                cjta c = cjtd.c((cjtd) cqlcVar12.a(cqkpVar));
                c.d = dtxl.k;
                return c.a();
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        };
        cqlc a3 = cqkz.a(false);
        cqrp d = cqrp.d(12.0d);
        return cqgr.gd(cqgr.cH(cqrp.d(72.0d)), cqgr.cd(-1), cqgr.dQ(irh.b()), cqgr.cW(acly.a(hfl.a)), cqgr.K(hfm.a), cqgr.x(ibo.h()), iue.c(hfn.a), cqgr.dn(acly.b(hfo.a)), cqgr.cs(heq.a), fY, cqgr.L(false), cqgr.gd(cqmpVarArr), jhc.b(cqmpVarArr2), WebImageView.c(cqlcVar5, a3, cqgr.aF(cqjv.x(cqlcVar5)), cqgr.dz(d, d, d, d), cqgr.bR(cqrp.d(4.0d)), cqgr.V(cqlcVar9), cqgr.cW(a2), cqgr.K(cqlcVar6), cqgr.x(ibo.h()), iue.c(cqlcVar10), cqgr.bw(16)));
    }
}
