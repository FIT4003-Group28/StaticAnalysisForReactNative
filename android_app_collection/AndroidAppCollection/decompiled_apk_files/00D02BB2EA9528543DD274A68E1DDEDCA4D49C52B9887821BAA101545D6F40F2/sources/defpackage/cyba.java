package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cyba  reason: default package */
/* loaded from: classes5.dex */
public final class cyba implements degu<Void> {
    final /* synthetic */ dbtp a;
    final /* synthetic */ cybo b;
    final /* synthetic */ int c;

    public cyba(cybo cyboVar, dbtp dbtpVar, int i) {
        this.b = cyboVar;
        this.a = dbtpVar;
        this.c = i;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        int a = this.b.d().a();
        cyph cyphVar = this.b.p;
        cype h = cypf.h();
        h.c(this.c);
        h.d(a);
        cypg.g(cyphVar, 11, 4, h.a(), null, cyor.a);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Void r8) {
        int a = this.b.d().a();
        cyph cyphVar = this.b.p;
        cype h = cypf.h();
        ((cyoo) h).a = this.a;
        h.b(1);
        h.c(this.c);
        h.d(a);
        cypg.g(cyphVar, 11, 2, h.a(), null, cyor.a);
    }
}
