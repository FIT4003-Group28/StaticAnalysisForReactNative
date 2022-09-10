package defpackage;
/* compiled from: PG */
/* renamed from: abes  reason: default package */
/* loaded from: classes2.dex */
final class abes implements degu<dhym> {
    final /* synthetic */ abet a;

    public abes(abet abetVar) {
        this.a = abetVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        abet abetVar = this.a;
        if (!abetVar.aD) {
            return;
        }
        abetVar.af.h(th instanceof btzz ? ((btzz) th).a.p : null);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi dhym dhymVar) {
        dhym dhymVar2 = dhymVar;
        abet abetVar = this.a;
        if (!abetVar.aD) {
            return;
        }
        if (dhymVar2 != null) {
            absn absnVar = abetVar.ag;
            dsqp dsqpVar = (dsqp) absnVar.cu(5);
            dsqpVar.bC(absnVar);
            absm absmVar = (absm) dsqpVar;
            if (absmVar.c) {
                absmVar.bF();
                absmVar.c = false;
            }
            absn absnVar2 = (absn) absmVar.b;
            dsrg<Integer, dpuz> dsrgVar = absn.f;
            dhymVar2.getClass();
            absnVar2.d = dhymVar2;
            absnVar2.a |= 4;
            abetVar.ag = absmVar.bK();
        }
        this.a.g(dhymVar2);
    }
}
