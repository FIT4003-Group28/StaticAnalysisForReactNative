package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cysz  reason: default package */
/* loaded from: classes5.dex */
public final class cysz implements degu<czcl> {
    final /* synthetic */ cyta a;
    final /* synthetic */ cytq b;
    final /* synthetic */ cytb c;

    public cysz(cytb cytbVar, cyta cytaVar, cytq cytqVar) {
        this.c = cytbVar;
        this.a = cytaVar;
        this.b = cytqVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        cypg.c(this.c.j, 6, cyos.a(th), this.b.k);
        cyta cytaVar = this.a;
        czck d = czcl.d();
        d.d(cyet.a(th));
        cytaVar.c(d.a());
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(czcl czclVar) {
        this.a.c(czclVar);
    }
}
