package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nch  reason: default package */
/* loaded from: classes7.dex */
public final class nch implements btzi<dwhf, dwhj> {
    final /* synthetic */ ldm a;
    final /* synthetic */ ksu b;

    public nch(ldm ldmVar, ksu ksuVar) {
        this.a = ldmVar;
        this.b = ksuVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwhf> btzrVar, btzy btzyVar) {
        bttq bttqVar = btzyVar.p;
        ksu ksuVar = this.b;
        if (ksuVar != null) {
            ksuVar.a(this.a);
        }
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwhf> btzrVar, dwhj dwhjVar) {
        dwhj dwhjVar2 = dwhjVar;
        if ((dwhjVar2.a & 4) != 0) {
            ldm ldmVar = this.a;
            ily ilyVar = new ily();
            dvyw dvywVar = dwhjVar2.d;
            if (dvywVar == null) {
                dvywVar = dvyw.bv;
            }
            ilyVar.E(dvywVar);
            ldmVar.p(ilyVar.d());
        }
        ksu ksuVar = this.b;
        if (ksuVar != null) {
            ksuVar.a(this.a);
        }
    }
}
