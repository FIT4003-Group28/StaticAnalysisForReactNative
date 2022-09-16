package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aefx  reason: default package */
/* loaded from: classes.dex */
public final class aefx {
    private static final cqkv a = new aefz();

    public static <T extends cqkp> cqnf<T> a(cqlc<T, List<aegg>> cqlcVar) {
        return cqjv.g(aefw.SNAP_POINTS, cqlcVar, a);
    }

    public static <T extends cqkp> cqnf<T> b(Float f) {
        return cqjv.i(aefw.ENABLE_TAP_TO_EXPAND, f, a);
    }

    public static <T extends cqkp> cqnf<T> c(cqjb<T, Float> cqjbVar) {
        return cqjv.e(aefw.ENABLE_TAP_TO_EXPAND, cqjbVar, a);
    }

    public static <T extends cqkp> cqnf<T> d(Integer num) {
        return cqjv.i(aefw.NESTED_SCROLL_VIEW_ID, num, a);
    }

    public static <T extends cqkp> cqnf<T> e(cqlc<T, Integer> cqlcVar) {
        return cqjv.g(aefw.SET_MIN_EXPOSURE_PIXELS, cqlcVar, a);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> f(cqmp<T>... cqmpVarArr) {
        return new cqmh(aefv.class, cqmpVarArr);
    }
}
