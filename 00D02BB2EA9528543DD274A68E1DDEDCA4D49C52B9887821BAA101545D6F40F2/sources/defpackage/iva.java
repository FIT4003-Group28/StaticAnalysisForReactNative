package defpackage;
/* compiled from: PG */
/* renamed from: iva  reason: default package */
/* loaded from: classes.dex */
public final class iva {
    private iva() {
    }

    public static Boolean a() {
        aufd aufdVar = (aufd) btsr.a(aufd.class);
        dbsk.s(aufdVar);
        boolean z = true;
        if (!aufdVar.sB().b() && !((gch) btsr.a(gch.class)).sC().h()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static iuv b(cqss cqssVar, cqss cqssVar2) {
        return new iuv(null, cqssVar, cqssVar2);
    }

    public static iuv c(int i, int i2) {
        return b(cqrt.c(i), cqrt.c(i2));
    }

    public static iuv d(aufe aufeVar, cqss cqssVar, cqss cqssVar2) {
        return new iuv(aufeVar, cqssVar, cqssVar2);
    }

    public static iuw e(cqtd cqtdVar, cqtd cqtdVar2) {
        return new iuw(cqtdVar, cqtdVar2, null);
    }

    public static iuw f(cqtd cqtdVar, cqtd cqtdVar2, aufe aufeVar) {
        return new iuw(cqtdVar, cqtdVar2, aufeVar);
    }

    public static iuw g(int i, int i2) {
        return e(cqrt.f(i), cqrt.f(i2));
    }

    public static iuu h(CharSequence charSequence, CharSequence charSequence2) {
        return new iuu(cqsk.a(charSequence), cqsk.a(charSequence2));
    }

    public static iux i(cqtv cqtvVar, cqtv cqtvVar2) {
        return new iux(cqtvVar, cqtvVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T j(iuz<T> iuzVar, @dzsi aufe aufeVar) {
        if (aufeVar == null) {
            aufeVar = null;
        }
        return aufeVar != null ? aufeVar.b() : a().booleanValue() ? iuzVar.NS() : iuzVar.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T k(iuz<T> iuzVar) {
        return (T) j(iuzVar, null);
    }
}
