package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: hye  reason: default package */
/* loaded from: classes.dex */
public final class hye {
    static final cqkv a = new hyg(cqlg.a);

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        cqmj<T> b = b(d(ibm.j()), f(cqrp.d(1.0d)), cqqx.i(cqrp.d(dcyn.a)), cqqx.d(ibm.b()));
        b.f(cqmpVarArr);
        return b;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> b(cqmp<T>... cqmpVarArr) {
        return cqgr.bt(R.layout.card_internal, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> c(cqss cqssVar) {
        return cqjv.i(hyf.RIPPLE_COLOR, cqssVar, a);
    }

    public static <T extends cqkp> cqnf<T> d(cqss cqssVar) {
        return cqjv.i(hyf.STROKE_COLOR, cqssVar, a);
    }

    public static <T extends cqkp> cqnf<T> e(cqlc<T, cqss> cqlcVar) {
        return cqjv.g(hyf.STROKE_COLOR, cqlcVar, a);
    }

    public static <T extends cqkp> cqnf<T> f(cqtc cqtcVar) {
        return cqjv.i(hyf.STROKE_WIDTH, cqtcVar, a);
    }

    public static <T extends cqkp> cqnf<T> g(cqlc<T, ? extends cqtc> cqlcVar) {
        return cqjv.g(hyf.STROKE_WIDTH, cqlcVar, a);
    }
}
