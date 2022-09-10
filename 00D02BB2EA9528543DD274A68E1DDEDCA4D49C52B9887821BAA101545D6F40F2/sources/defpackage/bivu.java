package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bivu  reason: default package */
/* loaded from: classes3.dex */
final class bivu extends cqiw<biwg> {
    static final cqjb<biwo, CharSequence> a = new bivt();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static CharSequence e(bvsx bvsxVar, bvsv bvsvVar, @dzsi String str) {
        if (!dbsj.d(str)) {
            bvsv a2 = bvsxVar.a(" · ");
            a2.f(bvsxVar.a(str));
            a2.m(R.color.qu_daynight_black_alpha_54);
            bvsvVar.f(a2);
        }
        return bvsvVar.c();
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> f(cqlc<T, cqtd> cqlcVar, cqnf<T> cqnfVar, cqlc<T, View.OnClickListener> cqlcVar2, cqlc<T, cjtd> cqlcVar3, cqmp<T>... cqmpVarArr) {
        cqmj<T> gd = cqgr.gd(cqgr.dr(1), cqgr.cd(-1), ict.n(false, new cqmp[0]), biwc.a(cqkz.a(true), cqlcVar2, cqkz.a(false), cqkz.a(false), cqkz.a(null), cqlcVar3, biwc.b(cqlcVar, cqgr.aJ(16)), cqgr.gq(cqgr.cB(2), cqgr.ar(TextUtils.TruncateAt.END), cqgr.aJ(16), cqgr.ca(Float.valueOf(1.0f)), cqnfVar, irn.x(), cqgr.eN(5)), new cqmp[0]));
        gd.f(cqmpVarArr);
        return gd;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<biwg> a() {
        return f(bivo.a, cqgr.eM(bivp.a), acly.a(bivq.a), bivr.a, cqgr.aF(bivs.a));
    }
}
