package defpackage;
/* compiled from: PG */
/* renamed from: dzdu  reason: default package */
/* loaded from: classes6.dex */
final class dzdu implements dzab {
    final /* synthetic */ dzdv a;
    private final dzab b;

    public dzdu(dzdv dzdvVar, dzab dzabVar) {
        this.a = dzdvVar;
        this.b = dzabVar;
    }

    @Override // defpackage.dzab
    public final void a(dzak dzakVar) {
        this.b.a(dzakVar);
    }

    @Override // defpackage.dzab
    public final void b(Throwable th) {
        try {
            dzvx.c(th, "it");
            this.b.c(ajpv.a(th));
        } catch (Throwable th2) {
            dzas.a(th2);
            this.b.b(new dzar(th, th2));
        }
    }

    @Override // defpackage.dzab
    public final void c(Object obj) {
        this.b.c(obj);
    }
}
