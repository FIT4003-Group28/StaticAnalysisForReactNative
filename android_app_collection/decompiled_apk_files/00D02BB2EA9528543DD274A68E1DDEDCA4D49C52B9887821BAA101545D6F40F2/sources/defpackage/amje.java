package defpackage;
/* compiled from: PG */
/* renamed from: amje  reason: default package */
/* loaded from: classes2.dex */
public abstract class amje {
    public static amje c(alvi alviVar) {
        return e(alviVar, null);
    }

    public static amje d(akrk akrkVar) {
        return e(null, akrkVar);
    }

    public static amje e(@dzsi alvi alviVar, @dzsi akrk akrkVar) {
        return new amgv(alviVar, akrkVar);
    }

    @dzsi
    public abstract alvi a();

    @dzsi
    public abstract akrk b();

    public final boolean f() {
        return a() != null;
    }

    public final boolean g() {
        return b() != null;
    }
}
