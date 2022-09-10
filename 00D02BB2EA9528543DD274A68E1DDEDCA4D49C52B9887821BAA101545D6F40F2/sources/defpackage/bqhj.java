package defpackage;
/* compiled from: PG */
/* renamed from: bqhj  reason: default package */
/* loaded from: classes4.dex */
public abstract class bqhj {
    public static final bqhi a = new bqhi();

    public static bqhj e(akqq akqqVar) {
        bqhh f = f();
        f.c(akqqVar);
        return f.a();
    }

    public static bqhh f() {
        return new bqgt();
    }

    public abstract akqq a();

    public abstract dbsg<Long> b();

    public abstract dbsg<Long> c();

    public abstract dbsg<bqhr> d();

    public final boolean g() {
        return b().a() || c().a() || d().a();
    }
}
