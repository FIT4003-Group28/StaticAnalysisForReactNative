package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: augf  reason: default package */
/* loaded from: classes2.dex */
public abstract class augf {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static auge j() {
        return new aufy();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static auge k(aumo aumoVar) {
        aufy aufyVar = new aufy();
        aufyVar.d(aumoVar.a());
        aufyVar.g(aumoVar.b());
        aufyVar.e(new auhx(aumoVar.c(), auhw.BROADCAST));
        aufyVar.b(aumoVar.e());
        dbsg<cjtd> g = aumoVar.g();
        if (g != null) {
            aufyVar.b = g;
            return aufyVar;
        }
        throw new NullPointerException("Null extraLoggingParams");
    }

    public abstract int a();

    public abstract CharSequence b();

    public abstract dbsg<ip> c();

    public abstract auhx d();

    public abstract boolean e();

    public abstract ddho f();

    public abstract dbsg<String> g();

    public abstract dbsg<ddcu> h();

    public abstract dbsg<cjtd> i();
}
