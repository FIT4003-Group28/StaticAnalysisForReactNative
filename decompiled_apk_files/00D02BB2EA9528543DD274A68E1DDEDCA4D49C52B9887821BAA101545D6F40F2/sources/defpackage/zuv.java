package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: zuv  reason: default package */
/* loaded from: classes7.dex */
public final class zuv {
    private static final cqkv a = new zuw();

    public static <T extends cqkp> cqnf<T> a(cqjb<T, Integer> cqjbVar) {
        return cqjv.e(zuu.HEADER_VIEW_INDEX, cqjbVar, a);
    }

    public static <T extends cqkp> cqnf<T> b(cqlc<T, Integer> cqlcVar) {
        return cqjv.g(zuu.HEADER_VIEW_INDEX, cqlcVar, a);
    }

    public static <T extends cqkp> cqnf<T> c(cqrp cqrpVar) {
        return cqjv.i(zuu.SET_MIN_EXPOSURE, cqrpVar, a);
    }

    public static <T extends cqkp> cqnf<T> d(cqlc<T, List<aegg>> cqlcVar) {
        return cqjv.g(zuu.SNAP_POINTS, cqlcVar, a);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> e(cqjb<T, cqiv> cqjbVar, cqmp<T>... cqmpVarArr) {
        cqmh cqmhVar = new cqmh(zum.class, cqqx.F(), cqgr.P(false), cqgr.ck(cqjbVar));
        cqmhVar.f(cqmpVarArr);
        return cqmhVar;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> f(cqmp<T>... cqmpVarArr) {
        return new cqmh(zut.class, cqmpVarArr);
    }
}
