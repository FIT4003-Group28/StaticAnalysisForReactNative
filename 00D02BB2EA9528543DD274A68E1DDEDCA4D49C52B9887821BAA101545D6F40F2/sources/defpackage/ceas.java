package defpackage;
/* compiled from: PG */
/* renamed from: ceas  reason: default package */
/* loaded from: classes4.dex */
final class ceas extends dzvy implements dzve<dhsi, dztc> {
    final /* synthetic */ ceam a;
    final /* synthetic */ ceat b;
    final /* synthetic */ btlu c;

    public ceas(ceam ceamVar, ceat ceatVar, btlu btluVar) {
        this.a = ceamVar;
        this.b = ceatVar;
        this.c = btluVar;
    }

    @Override // defpackage.dzve
    public final /* bridge */ /* synthetic */ dztc a(dhsi dhsiVar) {
        dhsi dhsiVar2 = dhsiVar;
        dzvx.c(dhsiVar2, "response");
        ceaw ceawVar = this.b.a;
        ceam ceamVar = this.a;
        btlu btluVar = this.c;
        dzvx.b(btluVar, "gmmAccount");
        dsrj<dmba> dsrjVar = dhsiVar2.c;
        dzvx.b(dsrjVar, "response.photoPlaceholderList");
        ceawVar.e(ceamVar, btluVar, dsrjVar);
        return dztc.a;
    }
}
