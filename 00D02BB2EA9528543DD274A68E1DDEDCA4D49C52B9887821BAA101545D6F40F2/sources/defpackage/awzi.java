package defpackage;
/* compiled from: PG */
/* renamed from: awzi  reason: default package */
/* loaded from: classes.dex */
final class awzi implements awze<dnuk> {
    static final awzi a = new awzi();

    @Override // defpackage.awze
    @dzsi
    public final /* bridge */ /* synthetic */ dnuk a(dnuk dnukVar, awyw awywVar, dmlb dmlbVar) {
        dnui bK;
        dnuk dnukVar2 = dnukVar;
        dqpe dqpeVar = dnukVar2.a;
        if (dqpeVar == null) {
            dqpeVar = dqpe.f;
        }
        if (!awywVar.a(dqpeVar, dmlbVar)) {
            return null;
        }
        dnuj ca = dnuk.d.ca(dnukVar2);
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        ((dnuk) ca.b).b = dnuk.ck();
        for (dnui dnuiVar : dnukVar2.b) {
            dqpe dqpeVar2 = dnuiVar.c;
            if (dqpeVar2 == null) {
                dqpeVar2 = dqpe.f;
            }
            if (!awywVar.a(dqpeVar2, dmlbVar)) {
                bK = null;
            } else {
                dnuf ca2 = dnui.g.ca(dnuiVar);
                if (ca2.c) {
                    ca2.bF();
                    ca2.c = false;
                }
                dnui dnuiVar2 = (dnui) ca2.b;
                dnuiVar2.e = null;
                dnuiVar2.a &= -33;
                if ((dnuiVar.a & 32) != 0) {
                    dnuh dnuhVar = dnuiVar.e;
                    if (dnuhVar == null) {
                        dnuhVar = dnuh.f;
                    }
                    dqpe dqpeVar3 = dnuhVar.a;
                    if (dqpeVar3 == null) {
                        dqpeVar3 = dqpe.f;
                    }
                    if (true != awywVar.a(dqpeVar3, dmlbVar)) {
                        dnuhVar = null;
                    }
                    if (dnuhVar != null) {
                        if (ca2.c) {
                            ca2.bF();
                            ca2.c = false;
                        }
                        dnui dnuiVar3 = (dnui) ca2.b;
                        dnuhVar.getClass();
                        dnuiVar3.e = dnuhVar;
                        dnuiVar3.a |= 32;
                    }
                }
                bK = ca2.bK();
            }
            if (bK != null) {
                if (ca.c) {
                    ca.bF();
                    ca.c = false;
                }
                dnuk dnukVar3 = (dnuk) ca.b;
                bK.getClass();
                dsrj<dnui> dsrjVar = dnukVar3.b;
                if (!dsrjVar.a()) {
                    dnukVar3.b = dsqw.cl(dsrjVar);
                }
                dnukVar3.b.add(bK);
            }
        }
        return ca.bK();
    }

    @Override // defpackage.awze
    public final /* bridge */ /* synthetic */ boolean b(dnuk dnukVar, awza awzaVar, dmlb dmlbVar) {
        dnuk dnukVar2 = dnukVar;
        dqpe dqpeVar = dnukVar2.a;
        if (dqpeVar == null) {
            dqpeVar = dqpe.f;
        }
        if (awzaVar.a(dqpeVar, dmlbVar)) {
            return true;
        }
        for (dnui dnuiVar : dnukVar2.b) {
            dqpe dqpeVar2 = dnuiVar.c;
            if (dqpeVar2 == null) {
                dqpeVar2 = dqpe.f;
            }
            if (awzaVar.a(dqpeVar2, dmlbVar)) {
                return true;
            }
            if ((dnuiVar.a & 32) != 0) {
                dnuh dnuhVar = dnuiVar.e;
                if (dnuhVar == null) {
                    dnuhVar = dnuh.f;
                }
                dqpe dqpeVar3 = dnuhVar.a;
                if (dqpeVar3 == null) {
                    dqpeVar3 = dqpe.f;
                }
                if (awzaVar.a(dqpeVar3, dmlbVar)) {
                    return true;
                }
            }
        }
        return false;
    }
}
