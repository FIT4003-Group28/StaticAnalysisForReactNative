package defpackage;

import android.graphics.ColorFilter;
/* compiled from: PG */
/* renamed from: jeh  reason: default package */
/* loaded from: classes7.dex */
public final class jeh {
    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return c(null, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> b(cqss cqssVar, cqmp<T>... cqmpVarArr) {
        cqmj<T> a = cqmb.a(cqssVar, new cqmp[0]);
        a.f(cqmpVarArr);
        return a;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> c(@dzsi cqjb<T, ColorFilter> cqjbVar, cqmp<T>... cqmpVarArr) {
        cqmj<T> s = itj.s(cqgr.fI(0), cqgr.bw(0), cqgr.cd(-2), cqgr.bp(-2));
        if (cqjbVar != null) {
            s.g(cqgr.bb(cqjbVar));
        }
        s.f(cqmpVarArr);
        return s;
    }
}
