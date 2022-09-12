package defpackage;
/* compiled from: PG */
/* renamed from: awzw  reason: default package */
/* loaded from: classes.dex */
final class awzw implements awze<dvho> {
    static final awzw a = new awzw();

    @Override // defpackage.awze
    @dzsi
    public final /* bridge */ /* synthetic */ dvho a(dvho dvhoVar, awyw awywVar, dmlb dmlbVar) {
        dvho dvhoVar2 = dvhoVar;
        dqpe dqpeVar = dvhoVar2.c;
        if (dqpeVar == null) {
            dqpeVar = dqpe.f;
        }
        if (!awywVar.a(dqpeVar, dmlbVar)) {
            return null;
        }
        dvhn ca = dvho.f.ca(dvhoVar2);
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        ((dvho) ca.b).d = dvho.ck();
        for (dqfq dqfqVar : dvhoVar2.d) {
            dqpe dqpeVar2 = dqfqVar.c;
            if (dqpeVar2 == null) {
                dqpeVar2 = dqpe.f;
            }
            if (true != awywVar.a(dqpeVar2, dmlbVar)) {
                dqfqVar = null;
            }
            if (dqfqVar != null) {
                if (ca.c) {
                    ca.bF();
                    ca.c = false;
                }
                dvho dvhoVar3 = (dvho) ca.b;
                dqfqVar.getClass();
                dsrj<dqfq> dsrjVar = dvhoVar3.d;
                if (!dsrjVar.a()) {
                    dvhoVar3.d = dsqw.cl(dsrjVar);
                }
                dvhoVar3.d.add(dqfqVar);
            }
        }
        return ca.bK();
    }

    @Override // defpackage.awze
    public final /* bridge */ /* synthetic */ boolean b(dvho dvhoVar, awza awzaVar, dmlb dmlbVar) {
        dvho dvhoVar2 = dvhoVar;
        dqpe dqpeVar = dvhoVar2.c;
        if (dqpeVar == null) {
            dqpeVar = dqpe.f;
        }
        if (awzaVar.a(dqpeVar, dmlbVar)) {
            return true;
        }
        for (dqfq dqfqVar : dvhoVar2.d) {
            dqpe dqpeVar2 = dqfqVar.c;
            if (dqpeVar2 == null) {
                dqpeVar2 = dqpe.f;
            }
            if (awzaVar.a(dqpeVar2, dmlbVar)) {
                return true;
            }
        }
        return false;
    }
}
