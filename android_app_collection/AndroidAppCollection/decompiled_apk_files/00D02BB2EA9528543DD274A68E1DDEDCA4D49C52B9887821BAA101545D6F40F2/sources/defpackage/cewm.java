package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cewm  reason: default package */
/* loaded from: classes4.dex */
public final class cewm implements ceuv<dkde> {
    final /* synthetic */ cewn a;

    public cewm(cewn cewnVar) {
        this.a = cewnVar;
    }

    @Override // defpackage.ceuv
    public final /* bridge */ /* synthetic */ void a(dkde dkdeVar) {
        dkde dkdeVar2 = dkdeVar;
        cewn cewnVar = this.a;
        cewnVar.a = true;
        cefc cefcVar = (cefc) cewnVar.f;
        dkdg dkdgVar = (dkdg) cefcVar.b;
        dsqp dsqpVar = (dsqp) dkdgVar.cu(5);
        dsqpVar.bC(dkdgVar);
        dkcz dkczVar = (dkcz) dsqpVar;
        dkdc bZ = dkdf.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dkdf dkdfVar = (dkdf) bZ.b;
        dkdfVar.b = dkdeVar2.d;
        dkdfVar.a |= 1;
        if (dkczVar.c) {
            dkczVar.bF();
            dkczVar.c = false;
        }
        dkdg dkdgVar2 = (dkdg) dkczVar.b;
        dkdf bK = bZ.bK();
        dkdg dkdgVar3 = dkdg.j;
        bK.getClass();
        dkdgVar2.e = bK;
        dkdgVar2.a |= 16;
        cefcVar.b = dkczVar.bK();
        cefcVar.h();
        this.a.e.c();
    }
}
