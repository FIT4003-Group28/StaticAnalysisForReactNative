package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bfhd  reason: default package */
/* loaded from: classes3.dex */
public final class bfhd implements bwrr<ilo> {
    final /* synthetic */ bfhe a;

    public bfhd(bfhe bfheVar) {
        this.a = bfheVar;
    }

    @Override // defpackage.bwrr
    public final /* bridge */ /* synthetic */ void PV(@dzsi ilo iloVar) {
        bwrs<ilo> bwrsVar;
        bfhe bfheVar = this.a;
        bruz bruzVar = bfheVar.b;
        if (bruzVar != null && (bwrsVar = bfheVar.a) != null) {
            bruzVar.QR(bwrsVar);
        }
        if (!this.a.n().booleanValue()) {
            cqkx.p(this.a);
        }
    }
}
