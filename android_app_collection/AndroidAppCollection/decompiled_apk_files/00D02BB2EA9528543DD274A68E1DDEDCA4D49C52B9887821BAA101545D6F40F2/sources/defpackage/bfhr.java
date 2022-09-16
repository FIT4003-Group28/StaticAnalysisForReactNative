package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bfhr  reason: default package */
/* loaded from: classes3.dex */
public final class bfhr implements bwrr<ilo> {
    final /* synthetic */ bfht a;

    public bfhr(bfht bfhtVar) {
        this.a = bfhtVar;
    }

    @Override // defpackage.bwrr
    public final /* bridge */ /* synthetic */ void PV(@dzsi ilo iloVar) {
        bwrs<ilo> bwrsVar;
        bfht bfhtVar = this.a;
        bruz bruzVar = bfhtVar.c;
        if (bruzVar != null && (bwrsVar = bfhtVar.b) != null) {
            bruzVar.QR(bwrsVar);
        }
        if (!this.a.J().booleanValue()) {
            cqkx.p(this.a);
        }
    }
}
