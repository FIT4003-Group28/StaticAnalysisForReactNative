package defpackage;
/* compiled from: PG */
/* renamed from: iup  reason: default package */
/* loaded from: classes.dex */
public final class iup {
    public static cqtd a(int i) {
        return d(i, bvlw.b);
    }

    public static cqtd b(int i, @dzsi cqtv cqtvVar, @dzsi cqtv cqtvVar2) {
        return h(i, cqtvVar, cqtvVar2, true);
    }

    public static cqtd c(int i, cqss cqssVar) {
        return cqrt.j(a(i), cqssVar);
    }

    public static cqtd d(int i, bvlw bvlwVar) {
        return new iun(new Object[]{Integer.valueOf(i), bvlwVar}, i, bvlwVar);
    }

    public static cqtd e(int i) {
        return d(i, bvlw.a);
    }

    public static cqtd f(int i, @dzsi cqtv cqtvVar, @dzsi cqtv cqtvVar2) {
        return h(i, cqtvVar, cqtvVar2, false);
    }

    public static cqtd g(cqtd cqtdVar, float f, cqss cqssVar) {
        return cqtt.d(cqtt.g(cqssVar), cqtt.h(cqtdVar, f));
    }

    private static cqtd h(int i, @dzsi cqtv cqtvVar, @dzsi cqtv cqtvVar2, boolean z) {
        return new iuo(new Object[]{Integer.valueOf(i), cqtvVar, cqtvVar2}, cqtvVar, cqtvVar2, z, i);
    }
}
