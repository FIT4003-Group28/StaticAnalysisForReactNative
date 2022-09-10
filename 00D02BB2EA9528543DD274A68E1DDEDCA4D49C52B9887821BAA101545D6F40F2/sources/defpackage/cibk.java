package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cibk  reason: default package */
/* loaded from: classes4.dex */
public final class cibk {
    public static final int a;
    public static final int b;
    public static final int c;
    public static final int d;
    public static final cqss e;

    static {
        int max = Math.max(0, 4);
        a = max;
        b = 20 - max;
        c = 12 - max;
        d = 16 - max;
        e = cqrt.c(R.color.mod_grey900_alpha60);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        cqmj<T> gq = cqgr.gq(cqgr.az(true), ibq.h(), cqgr.cd(-2), cqgr.bw(8388611), cqgr.aW(2));
        gq.f(cqmpVarArr);
        return gq;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> b(cqmp<T>... cqmpVarArr) {
        cqmj<T> gq = cqgr.gq(cqgr.az(true), ibq.p(), cqgr.cd(-2), cqgr.bw(8388611));
        gq.f(cqmpVarArr);
        return gq;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> c(cqlc<T, cqtd> cqlcVar, cqlc<T, View.OnClickListener> cqlcVar2, cqlc<T, cjtd> cqlcVar3, cqlc<T, cqss> cqlcVar4, cqmp<T>... cqmpVarArr) {
        return hyw.w(cqlcVar, cqlcVar2, cqlcVar3, cqlcVar4, cqkz.a(null), cqkz.a(true), cqkz.a(false), cqmn.a(cqgr.eU(ibm.x()), h()), cqmn.a(cqmpVarArr));
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> d(cqlc<T, cqtd> cqlcVar, cqlc<T, ? extends cqsn> cqlcVar2, cqlc<T, View.OnClickListener> cqlcVar3, cqlc<T, ? extends cqsn> cqlcVar4, cqlc<T, cjtd> cqlcVar5, cqmp<T>... cqmpVarArr) {
        return hyw.d(cqlcVar, cqlcVar2, cqlcVar3, cqlcVar4, cqlcVar5, h(), cqmn.a(cqmpVarArr));
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> e(cqlc<T, cqtd> cqlcVar, cqlc<T, cjtd> cqlcVar2, cqmp<T>... cqmpVarArr) {
        return hyw.w(cqlcVar, cqkz.a(null), cqlcVar2, cqkz.a(ibm.s()), cqkz.a(null), cqkz.a(false), cqkz.a(false), cqgr.at(false), cqgr.eU(ibm.r()), h(), cqmn.a(cqmpVarArr));
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> f(cqlc<T, cqtd> cqlcVar, cqlc<T, View.OnClickListener> cqlcVar2, cqlc<T, cjtd> cqlcVar3, cqlc<T, Boolean> cqlcVar4, cqmp<T>... cqmpVarArr) {
        return hyw.w(cqlcVar, cqlcVar2, cqlcVar3, cqkz.a(e), cqkz.a(ibl.b()), cqlcVar4, cqkz.a(false), cqgr.eU(ibl.b()), h(), cqmn.a(cqmpVarArr));
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> g(cqlc<T, cqtd> cqlcVar, cqlc<T, View.OnClickListener> cqlcVar2, cqlc<T, cjtd> cqlcVar3, cqlc<T, cqss> cqlcVar4, cqmp<T>... cqmpVarArr) {
        return hyw.w(cqlcVar, cqlcVar2, cqlcVar3, cqlcVar4, cqkz.a(null), cqkz.a(false), cqkz.a(false), cqmn.a(hyw.ag(cqrp.d(24.0d)), hyw.ad(cqrp.d(dcyn.a)), cqgr.cd(-2), hyw.ae(cqrp.d(20.0d)), hyw.an(cqrp.d(40.0d)), cqgr.cL(cqrp.d(40.0d)), cqgr.cH(cqrp.d(40.0d)), hyw.ar(cqrp.d(8.0d)), hyw.ap(cqrp.d(8.0d))), cqmn.a(cqmpVarArr));
    }

    private static <T extends cqkp> cqmn<T> h() {
        return cqmn.a(hyw.an(cqrp.d(40.0d)), hyw.ag(cqrp.d(18.0d)), hyw.ae(cqrp.d(20.0d)));
    }
}
