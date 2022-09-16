package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cybb  reason: default package */
/* loaded from: classes5.dex */
public final class cybb implements degu<cygn> {
    final /* synthetic */ dbtp a;
    final /* synthetic */ cybo b;
    final /* synthetic */ int c;

    public cybb(cybo cyboVar, dbtp dbtpVar, int i) {
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
        h.e(3);
        cypg.g(cyphVar, 11, 4, h.a(), null, cyor.a);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(cygn cygnVar) {
        cygn cygnVar2 = cygnVar;
        int a = this.b.d().a();
        cyph cyphVar = this.b.p;
        int i = cygnVar2.a() == cyes.SUCCESS ? 2 : 4;
        cype h = cypf.h();
        ((cyoo) h).a = this.a;
        h.b(cygnVar2.a() == cyes.SUCCESS ? 1 : 0);
        h.c(this.c);
        h.d(a);
        h.e(3);
        cypg.g(cyphVar, 11, i, h.a(), null, cyor.a);
    }
}
