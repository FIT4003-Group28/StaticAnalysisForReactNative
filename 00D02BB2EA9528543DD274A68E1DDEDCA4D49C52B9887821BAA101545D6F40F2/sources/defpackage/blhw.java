package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: blhw  reason: default package */
/* loaded from: classes3.dex */
public abstract class blhw {
    /* JADX INFO: Access modifiers changed from: protected */
    public abstract akqi a();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract String b();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean c();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract blif d();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract String e();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract dbsg<djck> f();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract String g();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract blhv h();

    public final blhw i(akqi akqiVar) {
        blhv h = h();
        h.d(akqiVar);
        return h.l();
    }

    public final blhw j(String str) {
        blhv h = h();
        h.f(str);
        return h.l();
    }

    public final boolean k(@dzsi blhw blhwVar) {
        return blhwVar != null && g().equals(blhwVar.g()) && d().equals(blhwVar.d()) && e().equals(blhwVar.e()) && f().equals(blhwVar.f()) && c() == blhwVar.c() && a().equals(blhwVar.a());
    }

    public final boolean l() {
        return g().isEmpty() && d().f() && e().isEmpty() && !f().a() && !c();
    }
}
