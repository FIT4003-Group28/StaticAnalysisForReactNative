package defpackage;
/* compiled from: PG */
/* renamed from: cviw  reason: default package */
/* loaded from: classes5.dex */
public abstract class cviw {
    public static final cviw a;

    static {
        cviq e = e();
        e.b = 1;
        a = e.a();
    }

    public static final cviw c(Throwable th) {
        cviq e = e();
        e.b = 3;
        e.a = th;
        return e.a();
    }

    public static final cviw d(Throwable th) {
        cviq e = e();
        e.b = 2;
        e.a = th;
        return e.a();
    }

    public static cviq e() {
        return new cviq();
    }

    @dzsi
    public abstract Throwable a();

    public abstract int b();
}
