package defpackage;
/* compiled from: PG */
/* renamed from: jjh  reason: default package */
/* loaded from: classes7.dex */
public final class jjh {
    private static final cqkv a = new jji();

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(jjf.class, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> b(cqmp<T>... cqmpVarArr) {
        return new cqmh(jjj.class, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> c(Integer num) {
        return cqjv.i(jjg.CLOSE_BUTTON_VIEW_ID, num, a);
    }

    public static <T extends cqkp> cqnf<T> d(cqtv cqtvVar) {
        return cqjv.i(jjg.COLLAPSED_EXPOSURE_PIXELS, cqtvVar, a);
    }

    public static <T extends cqkp> cqnf<T> e(Integer num) {
        return cqjv.i(jjg.COLLAPSIBLE_VIEW_ID, num, a);
    }
}
