package defpackage;
/* compiled from: PG */
/* renamed from: cnwb  reason: default package */
/* loaded from: classes.dex */
public final class cnwb {
    private static final cnvw a = new cnvw();

    public static <R extends cnom, T> cpcq<T> a(cnoh<R> cnohVar, cnwa<R, T> cnwaVar) {
        cpct cpctVar = new cpct();
        cnohVar.k(new cnvx(cnohVar, cpctVar, cnwaVar));
        return cpctVar.a;
    }

    public static <R extends cnom, T extends cnol<R>> cpcq<T> b(cnoh<R> cnohVar, T t) {
        return a(cnohVar, new cnvy(t));
    }

    public static <R extends cnom> cpcq<Void> c(cnoh<R> cnohVar) {
        return a(cnohVar, new cnvz());
    }
}
