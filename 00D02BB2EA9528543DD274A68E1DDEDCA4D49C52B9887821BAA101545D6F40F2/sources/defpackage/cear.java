package defpackage;
/* compiled from: PG */
/* renamed from: cear  reason: default package */
/* loaded from: classes4.dex */
final class cear extends dzvy implements dzve<dkcm, dztc> {
    final /* synthetic */ ceam a;
    final /* synthetic */ ceat b;
    final /* synthetic */ btlu c;

    public cear(ceam ceamVar, ceat ceatVar, btlu btluVar) {
        this.a = ceamVar;
        this.b = ceatVar;
        this.c = btluVar;
    }

    @Override // defpackage.dzve
    public final /* bridge */ /* synthetic */ dztc a(dkcm dkcmVar) {
        dkcm dkcmVar2 = dkcmVar;
        dzvx.c(dkcmVar2, "response");
        ceaw ceawVar = this.b.a;
        ceam ceamVar = this.a;
        btlu btluVar = this.c;
        dzvx.b(btluVar, "gmmAccount");
        dsrj<dmba> dsrjVar = dkcmVar2.b;
        dzvx.b(dsrjVar, "response.photoPlaceholderList");
        ceawVar.e(ceamVar, btluVar, dsrjVar);
        return dztc.a;
    }
}
