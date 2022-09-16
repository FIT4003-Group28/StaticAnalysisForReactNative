package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bivy  reason: default package */
/* loaded from: classes3.dex */
final class bivy {
    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqlc<T, cqtd> cqlcVar, cqlc<T, View.OnClickListener> cqlcVar2, cqlc<T, cqsn> cqlcVar3, final cqlc<T, CharSequence> cqlcVar4, final cqlc<T, cqss> cqlcVar5, final cqlc<T, View.OnClickListener> cqlcVar6, cqlc<T, cjtd> cqlcVar7, cqmp<T>... cqmpVarArr) {
        cqmj<T> gd = cqgr.gd(cqgr.dr(1), cqgr.cd(-1), ict.n(false, new cqmp[0]), biwc.a(cqkz.a(true), cqlcVar2, cqkz.a(false), cqkz.a(false), cqkz.a(null), cqlcVar7, biwc.b(cqlcVar, cqgr.aJ(16)), cqgr.gd(cqgr.dr(0), cqgr.cd(-1), cqgr.aJ(16), cqgr.dF(cqrp.d(4.0d)), cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.ca(Float.valueOf(1.0f)), cqgr.dU(cqrp.d(12.0d)), cqgr.dB(cqrp.d(12.0d)), biwc.c(cqlcVar3, irn.x(), cqgr.eN(5)), biwc.c(new cqlc(cqlcVar4) { // from class: bivv
            private final cqlc a;

            {
                this.a = cqlcVar4;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return cqsk.a((CharSequence) this.a.a(cqkpVar));
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }, cqjv.l(new cqlc(cqlcVar5) { // from class: bivw
            private final cqlc a;

            {
                this.a = cqlcVar5;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return cqjv.v((cqss) ((cqlb) this.a).a);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }, irn.v(), cqgr.eW(cqlcVar5)), cqgr.bV(cqrp.d(4.0d)), cqgr.eN(5), cqgr.aF(cqjv.x(cqlcVar4)))), cqgr.gc(cqgr.bq(irh.a()), cqgr.ce(irh.a()), cqgr.ca(Float.valueOf(0.0f)), cqgr.dU(irh.c()), cqgr.dB(irh.c()), cqgr.T(cqrt.l(R.string.ACCESSIBILITY_OVERFLOW_INFO)), cqgr.eE(cqrt.g(2131232706, irg.i())), cqgr.ei(ImageView.ScaleType.CENTER_INSIDE), cqgr.J(true), cqgr.cW(cqlcVar6), cqgr.x(irn.G()), cqgr.aF(new cqlc(cqlcVar6) { // from class: bivx
            private final cqlc a;

            {
                this.a = cqlcVar6;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return Boolean.valueOf(((cqlb) this.a).a == null);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }))), cqgr.dF(cqsg.g(irh.b(), irh.c())), cqgr.aJ(16)));
        gd.f(cqmpVarArr);
        return gd;
    }
}
