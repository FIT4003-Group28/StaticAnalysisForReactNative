package defpackage;
/* compiled from: PG */
/* renamed from: acxz  reason: default package */
/* loaded from: classes.dex */
final class acxz implements Runnable {
    final /* synthetic */ acya a;

    public acxz(acya acyaVar) {
        this.a = acyaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        acya acyaVar = this.a;
        acyaVar.b.K(acyaVar);
        if (acyaVar.e.N) {
            ylx.k(acyaVar.c.b(), acyaVar.f, acsn.g, new acxw(acyaVar, 2));
        } else {
            acyaVar.b(acyaVar.c.a());
        }
    }
}
