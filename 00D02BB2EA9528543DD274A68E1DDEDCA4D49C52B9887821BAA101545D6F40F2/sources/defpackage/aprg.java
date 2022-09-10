package defpackage;
/* compiled from: PG */
/* renamed from: aprg  reason: default package */
/* loaded from: classes2.dex */
final class aprg implements aprx {
    final /* synthetic */ btlu a;
    final /* synthetic */ apri b;

    public aprg(apri apriVar, btlu btluVar) {
        this.b = apriVar;
        this.a = btluVar;
    }

    @Override // defpackage.aprx
    public final void a(brlu brluVar) {
        ((ckcm) this.b.a.a(ckgp.n)).a(true);
        dccx F = dcdc.F();
        dccx F2 = dcdc.F();
        for (ilo iloVar : brluVar.c()) {
            if (iloVar != null) {
                F2.g(apri.k(dbsg.i(iloVar.ai()), dbsg.i(iloVar.cQ())));
                if (!dbsj.d(iloVar.cQ())) {
                    F.g(iloVar);
                }
            }
        }
        this.b.j(ddda.dk, F2.f());
        this.b.h(F.f(), this.a);
    }

    @Override // defpackage.aprx
    public final void b(brlu brluVar) {
        ((ckcm) this.b.a.a(ckgp.n)).a(false);
        this.b.l(2, this.a);
        apri apriVar = this.b;
        btlu btluVar = this.a;
        dbsg.i("Failed to fetch Placemark");
        apriVar.m(btluVar);
    }
}
