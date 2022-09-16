package defpackage;
/* compiled from: PG */
/* renamed from: abeo  reason: default package */
/* loaded from: classes2.dex */
final class abeo implements degu<dhym> {
    final /* synthetic */ abep a;

    public abeo(abep abepVar) {
        this.a = abepVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        abep abepVar = this.a;
        if (!abepVar.aD) {
            return;
        }
        abepVar.ae.h(th instanceof btzz ? ((btzz) th).a.p : null);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi dhym dhymVar) {
        dhym dhymVar2 = dhymVar;
        abep abepVar = this.a;
        if (!abepVar.aD) {
            return;
        }
        if (dhymVar2 != null) {
            absi absiVar = abepVar.af;
            dsqp dsqpVar = (dsqp) absiVar.cu(5);
            dsqpVar.bC(absiVar);
            absh abshVar = (absh) dsqpVar;
            if (abshVar.c) {
                abshVar.bF();
                abshVar.c = false;
            }
            absi absiVar2 = (absi) abshVar.b;
            absi absiVar3 = absi.d;
            dhymVar2.getClass();
            absiVar2.c = dhymVar2;
            absiVar2.a |= 2;
            abepVar.af = abshVar.bK();
        }
        this.a.g(dhymVar2);
    }
}
