package defpackage;
/* compiled from: PG */
/* renamed from: iif  reason: default package */
/* loaded from: classes.dex */
public abstract class iif {
    public static iif r() {
        iie u = u();
        u.o(cqrp.d(152.0d));
        ((ifl) u).d = cqrp.d(16.0d);
        return u.a();
    }

    public static iif s() {
        iie u = u();
        u.o(cqrp.d(256.0d));
        ((ifl) u).d = cqrp.d(16.0d);
        return u.a();
    }

    @Deprecated
    public static iif t() {
        iie u = u();
        u.o(cqrp.d(232.0d));
        ((ifl) u).d = cqrp.d(16.0d);
        return u.a();
    }

    public static iie u() {
        ifl iflVar = new ifl();
        iflVar.b(2);
        iflVar.f(cqrp.d(dcyn.a));
        iflVar.e(cqrp.d(20.0d));
        iflVar.d(cqrp.d(20.0d));
        iflVar.c(cqrp.d(8.0d));
        iflVar.e = ibm.b();
        iflVar.b = ibn.d();
        iflVar.a = cqrp.d(1.0d);
        iflVar.c = cqrp.d(16.0d);
        iflVar.n(false);
        iflVar.m(true);
        iflVar.g(false);
        igu a = igu.i().a();
        if (a != null) {
            iflVar.f = a;
            return iflVar;
        }
        throw new NullPointerException("Null headerViewProperties");
    }

    public abstract int a();

    public abstract cqtv b();

    public abstract cqtv c();

    public abstract cqtv d();

    public abstract cqtv e();

    public abstract cqtv f();

    @dzsi
    public abstract cqtv g();

    public abstract cqtv h();

    public abstract cqtv i();

    public abstract cqtv j();

    public abstract boolean k();

    public abstract boolean l();

    public abstract boolean m();

    public abstract cqtv n();

    public abstract cqss o();

    public abstract igu p();

    public abstract iie q();
}
