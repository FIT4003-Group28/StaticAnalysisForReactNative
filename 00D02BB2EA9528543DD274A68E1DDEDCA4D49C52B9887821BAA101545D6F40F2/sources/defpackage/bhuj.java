package defpackage;
/* compiled from: PG */
/* renamed from: bhuj  reason: default package */
/* loaded from: classes3.dex */
final class bhuj implements bhxp {
    final /* synthetic */ bhul a;

    public bhuj(bhul bhulVar) {
        this.a = bhulVar;
    }

    @Override // defpackage.bhxp
    public final void a(dnvu dnvuVar) {
        bhul bhulVar = this.a;
        if (!bhulVar.aD) {
            return;
        }
        ((ckcn) bhulVar.e.a(ckep.c)).a();
        bhul bhulVar2 = this.a;
        bwqv bwqvVar = bhulVar2.d;
        String str = dnvuVar.c;
        bwrs<ilo> bwrsVar = bhulVar2.ae;
        dbsk.s(bwrsVar);
        bhulVar2.aZ(bhuo.g(bwqvVar, dnvuVar, str, bwrsVar));
    }

    @Override // defpackage.bhxp
    public final void b(String str) {
        bhul bhulVar = this.a;
        if (!bhulVar.aD) {
            return;
        }
        ((ckcn) bhulVar.e.a(ckep.d)).a();
        bhul bhulVar2 = this.a;
        bwqv bwqvVar = bhulVar2.d;
        bwrs<ilo> bwrsVar = bhulVar2.ae;
        dbsk.s(bwrsVar);
        bhulVar2.aZ(bhuo.g(bwqvVar, null, str, bwrsVar));
    }
}
