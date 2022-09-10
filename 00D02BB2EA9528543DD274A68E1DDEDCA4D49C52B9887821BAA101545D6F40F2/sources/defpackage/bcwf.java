package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bcwf  reason: default package */
/* loaded from: classes3.dex */
public final class bcwf extends cqiw<bdaj> {
    public static final cqrp a = cqrp.d(10.0d);
    private static final cqrp b = cqrp.d(2.0d);

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> e(int i, cqlc<T, View.OnClickListener> cqlcVar, cqlc<T, cjtd> cqlcVar2, final cqlc<T, String> cqlcVar3, cqmp<T>... cqmpVarArr) {
        cqmj<T> w = hyw.w(cqkz.a(cqrt.f(i)), cqlcVar, cqlcVar2, cqkz.a(ibl.e()), cqkz.a(null), cqkz.a(true), cqkz.a(false), cqgr.eM(cqlcVar3), hyw.ap(cqrp.d(12.0d)), hyw.as(new cqlc(cqlcVar3) { // from class: bcvi
            private final cqlc a;

            {
                this.a = cqlcVar3;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar4 = this.a;
                cqrp cqrpVar = bcwf.a;
                return cqrp.d(cqjv.v((String) cqlcVar4.a(cqkpVar)).booleanValue() ? 4.0d : 12.0d);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), hyw.K(), cqgr.eU(ibl.b()));
        w.f(cqmpVarArr);
        return w;
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bdaj bdajVar, Context context, cqiv cqivVar) {
        bdaj bdajVar2 = bdajVar;
        dcdc<jbt> b2 = bdajVar2.b();
        int size = b2.size();
        for (int i2 = 0; i2 < size; i2++) {
            b2.get(i2).j(cqivVar);
        }
        appj c = bdajVar2.c();
        if (c != null) {
            cqivVar.a(new appi(), c);
        }
        String e = bdajVar2.e();
        if (!e.isEmpty()) {
            cqivVar.c(new bcvn(e));
        }
        cqivVar.a(new bcvm(c != null ? b : a), bdajVar2.d());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bdaj> a() {
        return cqgr.gj(cqgr.aT(bctq.a), cqgr.bw(80), cqgr.cd(-1), cqgr.bp(-2), cqgr.fl(R.style.LightboxTheme), cqgr.fK(bcvg.a), cqgr.fR(new apol(), bcvh.a, cqgr.bY(cqjd.c())), cqgr.gd(cqgr.v(Integer.valueOf((int) R.drawable.quantum_gradient_bar_bottom)), cqgr.bp(-2), cqgr.cd(-1), cqgr.bY(cqjd.j()), cqgr.dr(1), cqgr.bw(16), cqgr.ck(C())));
    }
}
