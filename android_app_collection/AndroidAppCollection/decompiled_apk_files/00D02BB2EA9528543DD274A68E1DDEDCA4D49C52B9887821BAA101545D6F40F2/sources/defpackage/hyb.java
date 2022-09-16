package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: hyb  reason: default package */
/* loaded from: classes.dex */
public final class hyb implements cqku {
    static final cqkv a = new hyd(cqlg.a);

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        cqmj<T> bt = cqgr.bt(R.layout.button_filled_internal, ibn.s());
        bt.f(cqmpVarArr);
        return bt;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> b(cqmp<T>... cqmpVarArr) {
        cqmj<T> bt = cqgr.bt(R.layout.button_protected_internal, ibn.s());
        bt.f(cqmpVarArr);
        return bt;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> c(cqmp<T>... cqmpVarArr) {
        cqmj<T> bt = cqgr.bt(R.layout.button_hairline_internal, ibn.s());
        bt.f(cqmpVarArr);
        return bt;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> d(cqmp<T>... cqmpVarArr) {
        cqmj<T> bt = cqgr.bt(R.layout.button_text_internal, new cqmp[0]);
        bt.f(cqmpVarArr);
        return bt;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> e(cqmp<T>... cqmpVarArr) {
        cqmj<T> bt = cqgr.bt(R.layout.button_icon_internal, new cqmp[0]);
        bt.f(cqmpVarArr);
        return bt;
    }

    public static <T extends cqkp> cqnf<T> f(cqtv cqtvVar) {
        return cqjv.i(hyc.CORNER_RADIUS, cqtvVar, a);
    }

    public static <T extends cqkp> cqnf<T> g(@dzsi cqtd cqtdVar) {
        return cqjv.i(hyc.ICON, cqtdVar, a);
    }

    public static <T extends cqkp> cqnf<T> h(cqlc<T, cqtd> cqlcVar) {
        return cqjv.g(hyc.ICON, cqlcVar, a);
    }

    public static <T extends cqkp> cqnf<T> i(int i) {
        return cqjv.i(hyc.ICON_GRAVITY, Integer.valueOf(i), a);
    }

    public static <T extends cqkp> cqnf<T> j(cqss cqssVar) {
        return cqjv.i(hyc.ICON_TINT, cqssVar, a);
    }

    public static <T extends cqkp> cqnf<T> k(cqlc<T, cqss> cqlcVar) {
        return cqjv.g(hyc.ICON_TINT, cqlcVar, a);
    }

    public static <T extends cqkp> cqnf<T> l(cqss cqssVar) {
        return cqjv.i(hyc.BACKGROUND_TINT_LIST, cqssVar, a);
    }

    public static <T extends cqkp> cqnf<T> m(cqlc<T, cqss> cqlcVar) {
        return cqjv.g(hyc.BACKGROUND_TINT_LIST, cqlcVar, a);
    }

    public static <T extends cqkp> cqnf<T> n(cqss cqssVar) {
        return cqjv.i(hyc.RIPPLE_COLOR, cqssVar, a);
    }

    public static <T extends cqkp> cqnf<T> o(cqss cqssVar) {
        return cqjv.i(hyc.STROKE_COLOR, cqssVar, a);
    }

    public static <T extends cqkp> cqnf<T> p(cqtv cqtvVar) {
        return cqjv.i(hyc.STROKE_WIDTH, cqtvVar, a);
    }
}
