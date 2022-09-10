package defpackage;
/* compiled from: PG */
/* renamed from: beiq  reason: default package */
/* loaded from: classes3.dex */
final class beiq implements btzi<dikm, diko> {
    final /* synthetic */ bwrs a;
    final /* synthetic */ beir b;

    public beiq(beir beirVar, bwrs bwrsVar) {
        this.b = beirVar;
        this.a = bwrsVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dikm> btzrVar, btzy btzyVar) {
        this.b.a.a(apsi.c(2, dbpy.a));
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dikm> btzrVar, diko dikoVar) {
        diko dikoVar2 = dikoVar;
        bvrt bvrtVar = (bvrt) this.a.c();
        if (bvrtVar != null) {
            bwrs bwrsVar = this.a;
            benb benbVar = (benb) bvrtVar.e((dssr) benb.b.cu(7), benb.b);
            dsqp dsqpVar = (dsqp) benbVar.cu(5);
            dsqpVar.bC(benbVar);
            bena benaVar = (bena) dsqpVar;
            if (benaVar.c) {
                benaVar.bF();
                benaVar.c = false;
            }
            ((benb) benaVar.b).a = benb.ck();
            dsrj<dqob> dsrjVar = dikoVar2.a;
            if (benaVar.c) {
                benaVar.bF();
                benaVar.c = false;
            }
            benb benbVar2 = (benb) benaVar.b;
            dsrj<dqob> dsrjVar2 = benbVar2.a;
            if (!dsrjVar2.a()) {
                benbVar2.a = dsqw.cl(dsrjVar2);
            }
            dsod.bv(dsrjVar, benbVar2.a);
            bwrsVar.d(bvrt.b(benaVar.bK()));
        }
        this.b.a.a(apsi.c(3, dbsg.i(dikoVar2.a)));
    }
}
