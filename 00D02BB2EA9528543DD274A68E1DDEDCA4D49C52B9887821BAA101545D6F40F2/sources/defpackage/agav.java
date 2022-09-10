package defpackage;
/* compiled from: PG */
/* renamed from: agav  reason: default package */
/* loaded from: classes2.dex */
public final class agav implements akeo {
    final /* synthetic */ Runnable a;
    final /* synthetic */ deig b;
    final /* synthetic */ agaw c;

    public agav(agaw agawVar, Runnable runnable, deig deigVar) {
        this.c = agawVar;
        this.a = runnable;
        this.b = deigVar;
    }

    @Override // defpackage.akeo
    public final void a(gga ggaVar, btlu btluVar) {
        this.c.j.execute(this.a);
    }

    @Override // defpackage.akeo
    public final void b(gga ggaVar, btlu btluVar) {
        this.b.j(false);
    }
}
