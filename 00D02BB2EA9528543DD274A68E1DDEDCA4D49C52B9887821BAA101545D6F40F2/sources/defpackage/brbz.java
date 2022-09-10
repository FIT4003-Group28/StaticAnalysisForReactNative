package defpackage;
/* compiled from: PG */
/* renamed from: brbz  reason: default package */
/* loaded from: classes4.dex */
final class brbz implements bwrr<brlu> {
    final /* synthetic */ brca a;

    public brbz(brca brcaVar) {
        this.a = brcaVar;
    }

    @Override // defpackage.bwrr
    public final /* bridge */ /* synthetic */ void PV(@dzsi brlu brluVar) {
        brlu brluVar2 = brluVar;
        if (brluVar2 == null) {
            return;
        }
        brca brcaVar = this.a;
        if (brcaVar.l) {
            return;
        }
        brcaVar.e.k(brluVar2.o);
    }
}
