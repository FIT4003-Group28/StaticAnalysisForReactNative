package defpackage;
/* compiled from: PG */
/* renamed from: azrl  reason: default package */
/* loaded from: classes3.dex */
final class azrl implements begr {
    final /* synthetic */ azrm a;

    public azrl(azrm azrmVar) {
        this.a = azrmVar;
    }

    @Override // defpackage.begr
    public final void a(bttu bttuVar, ilo iloVar) {
        azrm azrmVar = this.a;
        if (!azrmVar.aD) {
            return;
        }
        azrmVar.ai = false;
        if (iloVar.n().isEmpty() || iloVar.aj() == null) {
            this.a.aX();
            return;
        }
        this.a.aV(izr.EDIT);
        this.a.bn(iloVar);
    }

    @Override // defpackage.begr
    public final void b(bttu bttuVar, ilo iloVar, bttq bttqVar) {
        azrm azrmVar = this.a;
        if (!azrmVar.aD) {
            return;
        }
        azrmVar.ai = false;
        bttqVar.toString();
        this.a.aX();
    }
}
