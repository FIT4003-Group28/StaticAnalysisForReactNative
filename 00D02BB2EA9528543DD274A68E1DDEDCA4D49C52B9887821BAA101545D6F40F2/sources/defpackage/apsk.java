package defpackage;
/* compiled from: PG */
/* renamed from: apsk  reason: default package */
/* loaded from: classes2.dex */
final class apsk implements begr {
    final /* synthetic */ apsl a;

    public apsk(apsl apslVar) {
        this.a = apslVar;
    }

    @Override // defpackage.begr
    public final void a(bttu bttuVar, ilo iloVar) {
        bwrs<ilo> a = bwrs.a(iloVar);
        apsl apslVar = this.a;
        begj begjVar = new begj();
        begjVar.i = a;
        begjVar.c = jjn.EXPANDED;
        begjVar.n = true;
        apslVar.a.a().o(begjVar, false, null);
        apslVar.i.g().d(cjtd.a(dtxv.cP));
        bhhf bhhfVar = this.a.j;
        if (bhhfVar.m(a) && bhhfVar.a.getMerchantModeParameters().i) {
            this.a.k.a().e(a, true);
        }
        apsl apslVar2 = this.a;
        avac.bp(apslVar2.b, Integer.valueOf(dpyv.INSIGHTS_BUSINESS_NOTIFICATION.dm), apslVar2.c, apslVar2.d, apslVar2.e);
    }

    @Override // defpackage.begr
    public final void b(bttu bttuVar, ilo iloVar, bttq bttqVar) {
        bttqVar.toString();
    }
}
