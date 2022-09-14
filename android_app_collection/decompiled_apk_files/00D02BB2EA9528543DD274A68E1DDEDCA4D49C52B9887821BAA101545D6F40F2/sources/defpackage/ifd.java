package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: ifd  reason: default package */
/* loaded from: classes6.dex */
public final class ifd {
    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqlc<T, CharSequence> cqlcVar, cqlc<T, CharSequence> cqlcVar2, cqlc<T, CharSequence> cqlcVar3, cqlc<T, cqtd> cqlcVar4, cqlc<T, Boolean> cqlcVar5, cqlc<T, View.OnClickListener> cqlcVar6, cqlc<T, cjtd> cqlcVar7, final cqlc<T, CharSequence> cqlcVar8, final cqlc<T, cqtd> cqlcVar9, cqlc<T, Boolean> cqlcVar10, cqlc<T, View.OnClickListener> cqlcVar11, cqlc<T, cjtd> cqlcVar12, cqlc<T, cjtd> cqlcVar13, cqlc<T, cqtd> cqlcVar14, cqlc<T, Boolean> cqlcVar15, cqmp<T>... cqmpVarArr) {
        cqmp[] cqmpVarArr2 = {cqgr.cd(0), cqgr.bp(-2), cqgr.ca(Float.valueOf(1.0f)), cqgr.dr(1), b(cqlcVar, cqlcVar2, new cqmp[0]), acnm.a(cqgr.cd(-1), cqgr.bp(-2), hyw.d(cqlcVar4, cqlcVar3, cqlcVar6, cqlcVar3, cqlcVar7, cqgr.K(cqlcVar5), cqgr.bG(ibn.d())), hyw.a(cqlcVar9, cqlcVar8, cqlcVar11, cqlcVar12, cqgr.K(cqlcVar10), cqgr.aF(new cqlc(cqlcVar8, cqlcVar9) { // from class: ifc
            private final cqlc a;
            private final cqlc b;

            {
                this.a = cqlcVar8;
                this.b = cqlcVar9;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar16 = this.a;
                cqlc cqlcVar17 = this.b;
                boolean z = false;
                if (cqjv.v((CharSequence) cqlcVar16.a(cqkpVar)).booleanValue() && cqjv.v((cqtd) cqlcVar17.a(cqkpVar)).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        })))};
        cqmj gc = cqgr.gc(cqgr.bp(-2), cqgr.ce(cqrp.d(88.0d)), cqgr.bR(ibn.f()), cqgr.eG(cqlcVar14), cqgr.aF(cqjv.x(cqlcVar14)), cqgr.ei(ImageView.ScaleType.FIT_CENTER));
        gc.f(new cqmp[0]);
        cqmj<T> gd = cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.z(ibm.b()), iue.c(cqlcVar13), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(0), ibn.s(), cqgr.dU(ibn.f()), cqgr.dB(ibn.f()), cqgr.gd(cqmpVarArr2), gc), ict.n(false, cqgr.aI(cqlcVar15)));
        gd.f(cqmpVarArr);
        return gd;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> b(cqlc<T, CharSequence> cqlcVar, cqlc<T, CharSequence> cqlcVar2, cqmp<T>... cqmpVarArr) {
        cqmj<T> gd = cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.gq(cqgr.bD(cqrp.d(2.0d)), cqgr.eN(5), cqgr.cB(2), cqgr.ar(TextUtils.TruncateAt.END), ibq.m(), ibq.v(), cqgr.eM(cqlcVar), cqgr.aF(cqjv.x(cqlcVar))), cqgr.gq(cqgr.bD(cqrp.d(10.0d)), cqgr.eN(5), cqgr.cB(5), cqgr.ar(TextUtils.TruncateAt.END), cqgr.co(cqrp.f(2.0d), false), cqgr.cj(Float.valueOf(0.0f)), ibq.p(), ibq.x(), cqgr.eM(cqlcVar2), cqgr.aF(cqjv.x(cqlcVar2))));
        gd.f(cqmpVarArr);
        return gd;
    }
}
