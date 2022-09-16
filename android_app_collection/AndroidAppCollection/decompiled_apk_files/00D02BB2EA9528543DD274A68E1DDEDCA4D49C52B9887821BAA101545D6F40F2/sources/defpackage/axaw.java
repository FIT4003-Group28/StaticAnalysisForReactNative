package defpackage;
/* compiled from: PG */
/* renamed from: axaw  reason: default package */
/* loaded from: classes3.dex */
final class axaw implements awze<dnvm> {
    static final axaw a = new axaw();

    @Override // defpackage.awze
    @dzsi
    public final /* bridge */ /* synthetic */ dnvm a(dnvm dnvmVar, awyw awywVar, dmlb dmlbVar) {
        dnvk bK;
        dnvm dnvmVar2 = dnvmVar;
        dqpe dqpeVar = dnvmVar2.a;
        if (dqpeVar == null) {
            dqpeVar = dqpe.f;
        }
        if (!awywVar.a(dqpeVar, dmlbVar)) {
            return null;
        }
        dnvl ca = dnvm.d.ca(dnvmVar2);
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        ((dnvm) ca.b).b = dnvm.ck();
        for (dnvk dnvkVar : dnvmVar2.b) {
            dqpe dqpeVar2 = dnvkVar.b;
            if (dqpeVar2 == null) {
                dqpeVar2 = dqpe.f;
            }
            if (!awywVar.a(dqpeVar2, dmlbVar)) {
                bK = null;
            } else {
                dnvb ca2 = dnvk.e.ca(dnvkVar);
                if (ca2.c) {
                    ca2.bF();
                    ca2.c = false;
                }
                dnvk dnvkVar2 = (dnvk) ca2.b;
                dnvkVar2.d = null;
                dnvkVar2.a &= -33;
                if ((dnvkVar.a & 32) != 0) {
                    dnvj dnvjVar = dnvkVar.d;
                    if (dnvjVar == null) {
                        dnvjVar = dnvj.c;
                    }
                    dqpe dqpeVar3 = dnvjVar.a;
                    if (dqpeVar3 == null) {
                        dqpeVar3 = dqpe.f;
                    }
                    if (true != awywVar.a(dqpeVar3, dmlbVar)) {
                        dnvjVar = null;
                    }
                    if (dnvjVar != null) {
                        if (ca2.c) {
                            ca2.bF();
                            ca2.c = false;
                        }
                        dnvk dnvkVar3 = (dnvk) ca2.b;
                        dnvjVar.getClass();
                        dnvkVar3.d = dnvjVar;
                        dnvkVar3.a |= 32;
                    }
                }
                bK = ca2.bK();
            }
            if (bK != null) {
                if (ca.c) {
                    ca.bF();
                    ca.c = false;
                }
                dnvm dnvmVar3 = (dnvm) ca.b;
                bK.getClass();
                dsrj<dnvk> dsrjVar = dnvmVar3.b;
                if (!dsrjVar.a()) {
                    dnvmVar3.b = dsqw.cl(dsrjVar);
                }
                dnvmVar3.b.add(bK);
            }
        }
        return ca.bK();
    }

    @Override // defpackage.awze
    public final /* bridge */ /* synthetic */ boolean b(dnvm dnvmVar, awza awzaVar, dmlb dmlbVar) {
        dnvm dnvmVar2 = dnvmVar;
        dqpe dqpeVar = dnvmVar2.a;
        if (dqpeVar == null) {
            dqpeVar = dqpe.f;
        }
        if (awzaVar.a(dqpeVar, dmlbVar)) {
            return true;
        }
        for (dnvk dnvkVar : dnvmVar2.b) {
            dqpe dqpeVar2 = dnvkVar.b;
            if (dqpeVar2 == null) {
                dqpeVar2 = dqpe.f;
            }
            if (awzaVar.a(dqpeVar2, dmlbVar)) {
                return true;
            }
            if ((dnvkVar.a & 32) != 0) {
                dnvj dnvjVar = dnvkVar.d;
                if (dnvjVar == null) {
                    dnvjVar = dnvj.c;
                }
                dqpe dqpeVar3 = dnvjVar.a;
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
