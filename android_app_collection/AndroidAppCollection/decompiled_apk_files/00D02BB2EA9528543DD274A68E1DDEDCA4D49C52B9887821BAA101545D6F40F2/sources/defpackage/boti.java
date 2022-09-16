package defpackage;
/* compiled from: PG */
/* renamed from: boti  reason: default package */
/* loaded from: classes3.dex */
final class boti implements bnyn<dwgz, dwhd> {
    final /* synthetic */ botl a;

    public boti(botl botlVar) {
        this.a = botlVar;
    }

    @Override // defpackage.bnyn
    public final /* bridge */ /* synthetic */ void Rb(dssj dssjVar, @dzsi dssj dssjVar2) {
        int a;
        dwgz dwgzVar = (dwgz) dssjVar;
        dwhd dwhdVar = (dwhd) dssjVar2;
        botl botlVar = this.a;
        if (!((ges) botlVar.c).aD) {
            return;
        }
        if (dwhdVar == null || (a = dwhc.a(dwhdVar.b)) == 0 || a != 2) {
            ppw.b(botlVar.d, new botj(botlVar), new botk(botlVar));
            return;
        }
        boxa boxaVar = botlVar.e;
        boxaVar.M(boxaVar.R(dwhdVar));
    }
}
