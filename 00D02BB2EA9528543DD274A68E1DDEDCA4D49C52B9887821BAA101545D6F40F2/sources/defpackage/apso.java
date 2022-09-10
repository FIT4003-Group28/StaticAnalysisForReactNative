package defpackage;
/* compiled from: PG */
/* renamed from: apso  reason: default package */
/* loaded from: classes2.dex */
final class apso implements begr {
    final /* synthetic */ String a;
    final /* synthetic */ apsp b;

    public apso(apsp apspVar, String str) {
        this.b = apspVar;
        this.a = str;
    }

    @Override // defpackage.begr
    public final void a(bttu bttuVar, ilo iloVar) {
        bwrs<ilo> a = bwrs.a(iloVar);
        begj begjVar = new begj();
        begjVar.i = a;
        begjVar.c = jjn.EXPANDED;
        this.b.e.a().o(begjVar, false, null);
        apsp apspVar = this.b;
        if (apspVar.a.aZ) {
            apspVar.i.a().e();
        }
        apsp apspVar2 = this.b;
        avac.bp(apspVar2.a, Integer.valueOf(dpyv.MERCHANT_FRESHNESS_WIZARD.dm), apspVar2.b, apspVar2.c, apspVar2.d);
    }

    @Override // defpackage.begr
    public final void b(bttu bttuVar, ilo iloVar, bttq bttqVar) {
        bttqVar.toString();
    }
}
