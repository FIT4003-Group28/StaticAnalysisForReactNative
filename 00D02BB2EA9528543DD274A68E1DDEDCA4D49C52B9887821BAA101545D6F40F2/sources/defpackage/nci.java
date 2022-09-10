package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nci  reason: default package */
/* loaded from: classes7.dex */
public final class nci implements begq {
    final /* synthetic */ ktg a;
    final /* synthetic */ akqq b;

    public nci(ktg ktgVar, akqq akqqVar) {
        this.a = ktgVar;
        this.b = akqqVar;
    }

    @Override // defpackage.begq
    public final void a(dwcy dwcyVar) {
        if ((dwcyVar.a & 1) != 0) {
            ily ilyVar = new ily();
            dvyw dvywVar = dwcyVar.b;
            if (dvywVar == null) {
                dvywVar = dvyw.bv;
            }
            ilyVar.E(dvywVar);
            dvyw dvywVar2 = dwcyVar.b;
            if (dvywVar2 == null) {
                dvywVar2 = dvyw.bv;
            }
            ilyVar.t = dvywVar2.i;
            ilyVar.g = true;
            ilyVar.v = dtyi.ci;
            this.a.a.p(ilyVar.d());
        }
        ktg ktgVar = this.a;
        ksu ksuVar = ktgVar.b;
        if (ksuVar != null) {
            ldm ldmVar = ktgVar.a;
            ldmVar.h.B = this.b;
            ksuVar.a(ldmVar);
        }
    }

    @Override // defpackage.begq
    public final void b() {
        ktg ktgVar = this.a;
        ksu ksuVar = ktgVar.b;
        if (ksuVar != null) {
            ksuVar.a(ktgVar.a);
        }
    }
}
