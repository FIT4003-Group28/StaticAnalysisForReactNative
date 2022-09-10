package defpackage;
/* compiled from: PG */
/* renamed from: axam  reason: default package */
/* loaded from: classes3.dex */
final class axam implements awze<dvhq> {
    static final axam a = new axam();

    @Override // defpackage.awze
    @dzsi
    public final /* bridge */ /* synthetic */ dvhq a(dvhq dvhqVar, awyw awywVar, dmlb dmlbVar) {
        dvhq dvhqVar2 = dvhqVar;
        dqpe dqpeVar = dvhqVar2.a;
        if (dqpeVar == null) {
            dqpeVar = dqpe.f;
        }
        if (!awywVar.a(dqpeVar, dmlbVar)) {
            return null;
        }
        dvhp ca = dvhq.d.ca(dvhqVar2);
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        ((dvhq) ca.b).b = dvhq.ck();
        for (dpte dpteVar : dvhqVar2.b) {
            dqpe dqpeVar2 = dpteVar.f;
            if (dqpeVar2 == null) {
                dqpeVar2 = dqpe.f;
            }
            if (true != awywVar.a(dqpeVar2, dmlbVar)) {
                dpteVar = null;
            }
            if (dpteVar != null) {
                ca.a(dpteVar);
            }
        }
        return ca.bK();
    }

    @Override // defpackage.awze
    public final /* bridge */ /* synthetic */ boolean b(dvhq dvhqVar, awza awzaVar, dmlb dmlbVar) {
        dvhq dvhqVar2 = dvhqVar;
        dqpe dqpeVar = dvhqVar2.a;
        if (dqpeVar == null) {
            dqpeVar = dqpe.f;
        }
        if (awzaVar.a(dqpeVar, dmlbVar)) {
            return true;
        }
        for (dpte dpteVar : dvhqVar2.b) {
            dqpe dqpeVar2 = dpteVar.f;
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
