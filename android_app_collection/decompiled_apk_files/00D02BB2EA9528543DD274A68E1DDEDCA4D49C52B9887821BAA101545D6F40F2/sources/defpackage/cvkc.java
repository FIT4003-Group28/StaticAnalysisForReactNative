package defpackage;
/* compiled from: PG */
/* renamed from: cvkc  reason: default package */
/* loaded from: classes5.dex */
public abstract class cvkc {
    public static cvju k() {
        cvju cvjuVar = new cvju();
        cvjuVar.c = 0L;
        cvjuVar.d = 0L;
        cvjuVar.d(cviv.UNKNOWN_STATUS);
        cvjuVar.e = 0L;
        cvjuVar.c(0);
        cvjuVar.f = 0L;
        return cvjuVar;
    }

    @dzsi
    public abstract Long a();

    public abstract String b();

    @dzsi
    public abstract String c();

    public abstract Long d();

    public abstract Long e();

    public abstract cviv f();

    public abstract Long g();

    public abstract int h();

    public abstract Long i();

    public abstract cvju j();

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("name", b());
        return b.toString();
    }
}
