package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
/* compiled from: PG */
/* renamed from: bioh  reason: default package */
/* loaded from: classes3.dex */
final class bioh extends cqiw<biwg> {
    public static final /* synthetic */ int a = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeVarargs
    public static <T extends cqkp> cqmj<T> e(int i, cqlc<T, Boolean> cqlcVar, cqlc<T, View.OnClickListener> cqlcVar2, cqlc<T, Boolean> cqlcVar3, cqlc<T, View.OnLongClickListener> cqlcVar4, cqlc<T, cqtd> cqlcVar5, cqlc<T, CharSequence> cqlcVar6, cqlc<T, CharSequence> cqlcVar7, cqlc<T, cjtd> cqlcVar8, cqlc<T, Boolean> cqlcVar9, cqlc<T, Boolean> cqlcVar10, cqmp<T>... cqmpVarArr) {
        return f(cqkz.a(Integer.valueOf(i)), cqlcVar, cqlcVar2, cqlcVar3, cqlcVar4, cqlcVar5, cqlcVar6, cqlcVar7, cqlcVar8, cqlcVar9, cqlcVar10, cqkz.a(null), cqmpVarArr);
    }

    @SafeVarargs
    private static <T extends cqkp> cqmj<T> f(final cqlc<T, Integer> cqlcVar, cqlc<T, Boolean> cqlcVar2, cqlc<T, View.OnClickListener> cqlcVar3, cqlc<T, Boolean> cqlcVar4, cqlc<T, View.OnLongClickListener> cqlcVar5, cqlc<T, cqtd> cqlcVar6, cqlc<T, CharSequence> cqlcVar7, cqlc<T, CharSequence> cqlcVar8, cqlc<T, cjtd> cqlcVar9, cqlc<T, Boolean> cqlcVar10, cqlc<T, Boolean> cqlcVar11, cqlc<T, jic> cqlcVar12, cqmp<T>... cqmpVarArr) {
        cqmp[] cqmpVarArr2 = {cqgr.aI(cqlcVar11)};
        cqlc a2 = cqkz.a(false);
        cqmj fY = cqgr.fY(cqgr.aJ(16), biwc.b(cqlcVar6, cqgr.aI(cqjv.x(cqlcVar12))), cqgr.fY(cqgr.aF(cqjv.x(cqlcVar12)), cqgr.ce(irh.e()), cqgr.bp(-2), cqgr.dQ(irh.b()), WebImageView.b(cqlcVar12, new cqmp[0])));
        cqmj gq = cqgr.gq(cqgr.cD(cqlcVar), cqgr.cn(new cqlc(cqlcVar) { // from class: binx
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar13 = this.a;
                int i = bioh.a;
                return cqrp.f(((Integer) cqlcVar13.a(cqkpVar)).intValue() > 1 ? 7.0d : dcyn.a);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqmn.a(cqgr.dU(cqrp.d(12.0d)), cqgr.dB(cqrp.d(12.0d))), cqgr.ar(TextUtils.TruncateAt.END), irn.m(), cqgr.eU(irg.J()), cqgr.eM(cqlcVar7), cqgr.eN(5), itj.o(cqlcVar10));
        gq.f(cqmpVarArr);
        return cqgr.gd(cqgr.dr(1), cqgr.cd(-1), ict.n(false, cqmpVarArr2), biwc.a(cqlcVar2, cqlcVar3, cqlcVar4, a2, cqlcVar5, cqlcVar9, fY, gq, cqgr.V(cqlcVar8)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<biwg> a() {
        cqmj<biwg> f = f(binu.a, biny.a, acly.a(binz.a), bioa.a, cqgr.s(biob.a), bioc.a, biod.a, bioe.a, biof.a, biog.a, cqkz.a(true), binv.a, new cqmp[0]);
        f.g(cqgr.aF(binw.a));
        return f;
    }
}
