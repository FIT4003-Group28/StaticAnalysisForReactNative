package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: hzh  reason: default package */
/* loaded from: classes.dex */
public final class hzh {
    public static final dcep<Integer> a = dcep.C(0, 1);
    public static final dcep<Integer> b = dcep.E(0, 1, 2, 3);
    public static final dcep<Integer> c = dcep.D(0, 1, 2);
    public static final cqkv d = new iac(cqlg.a);

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        cqmj<T> bt = cqgr.bt(R.layout.tab_primary, new cqmp[0]);
        bt.f(cqmpVarArr);
        return bt;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> b(cqmp<T>... cqmpVarArr) {
        cqmj<T> bt = cqgr.bt(R.layout.tab_secondary, new cqmp[0]);
        bt.f(cqmpVarArr);
        return bt;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> c(int i, cqmp<T>... cqmpVarArr) {
        cqmj<T> bt = cqgr.bt(i, new cqmp[0]);
        bt.f(cqmpVarArr);
        return bt;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends cqkp> cqnf<T> d(cqlc<T, dafw> cqlcVar) {
        return cqjv.g(iab.INTERNAL_ON_TAB_SELECTED_LISTENER, cqlcVar, d);
    }

    public static <T extends cqkp> cqnf<T> e(cqlc<T, iax> cqlcVar) {
        return cqjv.g(iab.SCROLL_POSITION, cqlcVar, d);
    }

    public static <T extends cqkp> cqnf<T> f(cqlc<T, iaz> cqlcVar) {
        return cqjv.g(iab.SELECTED_TAB, cqlcVar, d);
    }

    public static <T extends cqkp> cqnf<T> g(int i) {
        return cqjv.i(iab.TAB_GRAVITY, Integer.valueOf(i), d);
    }

    public static <T extends cqkp> cqnf<T> h(int i) {
        return cqjv.i(iab.TAB_MODE, Integer.valueOf(i), d);
    }

    public static <T extends cqkp> cqnf<T> i(cqss cqssVar) {
        return cqjv.i(iab.TAB_RIPPLE_COLOR, cqssVar, d);
    }
}
