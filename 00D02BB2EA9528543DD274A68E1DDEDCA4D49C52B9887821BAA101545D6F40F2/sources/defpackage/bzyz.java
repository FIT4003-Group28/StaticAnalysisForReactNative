package defpackage;
/* compiled from: PG */
/* renamed from: bzyz  reason: default package */
/* loaded from: classes4.dex */
public final class bzyz {
    private static final cqkv a = new bzza();

    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(bzzb.class, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> b(cqlc<T, CharSequence> cqlcVar) {
        return cqjv.g(bzyy.FULL_TEXT, cqlcVar, a);
    }

    public static <T extends cqkp> cqnf<T> c(cqjb<T, CharSequence> cqjbVar) {
        return cqjv.e(bzyy.END_LABEL, cqjbVar, a);
    }

    public static <T extends cqkp> cqnf<T> d() {
        return cqjv.i(bzyy.MAX_LINES, 3, a);
    }
}
