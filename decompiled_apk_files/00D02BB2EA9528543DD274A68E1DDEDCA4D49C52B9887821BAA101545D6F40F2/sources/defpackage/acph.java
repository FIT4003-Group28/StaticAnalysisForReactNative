package defpackage;
/* compiled from: PG */
/* renamed from: acph  reason: default package */
/* loaded from: classes2.dex */
public final class acph {
    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        cqmh cqmhVar = new cqmh(acpl.class, cqmpVarArr);
        cqmhVar.g(cqjv.j(acpg.LOAD_IMAGE, true));
        return cqmhVar;
    }

    public static <V extends cqkp> cqnf<V> b(cqlc<V, String> cqlcVar) {
        return cqjv.f(acpg.IMAGE_URL, cqlcVar);
    }

    public static <V extends cqkp> cqnf<V> c(@dzsi cqtd cqtdVar) {
        return cqjv.j(acpg.PLACEHOLDER, cqtdVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void d(@dzsi String str, acpl acplVar) {
        acplVar.setImageUrl(str);
    }
}
