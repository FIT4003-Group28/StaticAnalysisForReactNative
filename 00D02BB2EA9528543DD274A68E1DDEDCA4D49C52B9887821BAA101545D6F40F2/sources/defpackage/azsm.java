package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: azsm  reason: default package */
/* loaded from: classes3.dex */
final class azsm implements degu<ilo> {
    final /* synthetic */ azsu a;

    public azsm(azsu azsuVar) {
        this.a = azsuVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        ((ckco) this.a.a.a(ckdc.a)).a(0);
        this.a.bs(izr.EDIT);
        this.a.br();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi ilo iloVar) {
        ilo iloVar2 = iloVar;
        if (!this.a.aD) {
            return;
        }
        dbsk.s(iloVar2);
        this.a.bs(izr.EDIT);
        azsu azsuVar = this.a;
        Serializable serializable = azsuVar.bb.b;
        if (azsuVar.aU().equals(dndr.NICKNAME)) {
            azsu azsuVar2 = this.a;
            azsuVar2.bp(azsuVar2.f.a(), iloVar2);
            return;
        }
        axwy a = this.a.f.a();
        dndr aU = this.a.aU();
        azsu azsuVar3 = this.a;
        axwu axwuVar = azsuVar3.ap;
        axvp axvpVar = azsuVar3.al;
        boolean z = false;
        if (serializable != null && ((azst) serializable).a) {
            z = true;
        }
        a.ac(aU, axwuVar, axvpVar, z, null, null, azsuVar3.p(), this.a.aV(), iloVar2, null);
    }
}
