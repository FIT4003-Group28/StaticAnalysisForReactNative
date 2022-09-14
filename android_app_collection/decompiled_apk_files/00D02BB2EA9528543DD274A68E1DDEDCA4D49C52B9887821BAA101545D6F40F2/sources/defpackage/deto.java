package defpackage;
/* compiled from: PG */
/* renamed from: deto  reason: default package */
/* loaded from: classes6.dex */
public abstract class deto {
    static {
        builder().a();
    }

    public static detn builder() {
        detj detjVar = new detj();
        detjVar.h(0L);
        detjVar.g(1);
        detjVar.c(0L);
        return detjVar;
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract long d();

    public abstract long e();

    public abstract String f();

    public abstract detn g();

    public abstract int h();

    public final boolean i() {
        return h() == 4;
    }

    public final boolean j() {
        return h() == 5;
    }

    public final boolean k() {
        return h() == 3;
    }

    public final boolean l() {
        return h() == 2 || h() == 1;
    }

    public final deto m() {
        detn g = g();
        g.e("BAD CONFIG");
        g.g(5);
        return g.a();
    }
}
