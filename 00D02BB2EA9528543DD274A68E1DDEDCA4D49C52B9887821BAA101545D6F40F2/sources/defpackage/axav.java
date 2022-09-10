package defpackage;
/* compiled from: PG */
/* renamed from: axav  reason: default package */
/* loaded from: classes3.dex */
final class axav implements awze<dvjf> {
    static final axav a = new axav();

    @Override // defpackage.awze
    @dzsi
    public final /* bridge */ /* synthetic */ dvjf a(dvjf dvjfVar, awyw awywVar, dmlb dmlbVar) {
        dvjf dvjfVar2 = dvjfVar;
        dqpe dqpeVar = dvjfVar2.b;
        if (dqpeVar == null) {
            dqpeVar = dqpe.f;
        }
        if (!awywVar.a(dqpeVar, dmlbVar)) {
            return null;
        }
        dsqp dsqpVar = (dsqp) dvjfVar2.cu(5);
        dsqpVar.bC(dvjfVar2);
        dvje dvjeVar = (dvje) dsqpVar;
        if ((((dvjf) dvjeVar.b).a & 8) != 0) {
            dqpe dqpeVar2 = dvjfVar2.c;
            if (dqpeVar2 == null) {
                dqpeVar2 = dqpe.f;
            }
            if (!awywVar.a(dqpeVar2, dmlbVar)) {
                djyk djykVar = dvjfVar2.d;
                if (djykVar == null) {
                    djykVar = djyk.f;
                }
                dsqp dsqpVar2 = (dsqp) djykVar.cu(5);
                dsqpVar2.bC(djykVar);
                djyj djyjVar = (djyj) dsqpVar2;
                if (djyjVar.c) {
                    djyjVar.bF();
                    djyjVar.c = false;
                }
                ((djyk) djyjVar.b).e = djyk.ck();
                if (djyjVar.c) {
                    djyjVar.bF();
                    djyjVar.c = false;
                }
                ((djyk) djyjVar.b).d = djyk.ck();
                if (dvjeVar.c) {
                    dvjeVar.bF();
                    dvjeVar.c = false;
                }
                dvjf dvjfVar3 = (dvjf) dvjeVar.b;
                djyk bK = djyjVar.bK();
                bK.getClass();
                dvjfVar3.d = bK;
                dvjfVar3.a |= 8;
            }
        }
        return dvjeVar.bK();
    }

    @Override // defpackage.awze
    public final /* bridge */ /* synthetic */ boolean b(dvjf dvjfVar, awza awzaVar, dmlb dmlbVar) {
        dvjf dvjfVar2 = dvjfVar;
        dqpe dqpeVar = dvjfVar2.b;
        if (dqpeVar == null) {
            dqpeVar = dqpe.f;
        }
        if (!awzaVar.a(dqpeVar, dmlbVar)) {
            dqpe dqpeVar2 = dvjfVar2.c;
            if (dqpeVar2 == null) {
                dqpeVar2 = dqpe.f;
            }
            return awzaVar.a(dqpeVar2, dmlbVar);
        }
        return true;
    }
}
