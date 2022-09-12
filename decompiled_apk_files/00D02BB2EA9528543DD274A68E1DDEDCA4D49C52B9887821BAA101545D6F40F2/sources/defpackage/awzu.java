package defpackage;
/* compiled from: PG */
/* renamed from: awzu  reason: default package */
/* loaded from: classes3.dex */
final class awzu implements awze<dvha> {
    static final awzu a = new awzu();

    @Override // defpackage.awze
    @dzsi
    public final /* bridge */ /* synthetic */ dvha a(dvha dvhaVar, awyw awywVar, dmlb dmlbVar) {
        dvha dvhaVar2 = dvhaVar;
        dqpe dqpeVar = dvhaVar2.c;
        if (dqpeVar == null) {
            dqpeVar = dqpe.f;
        }
        dvhm dvhmVar = null;
        if (!awywVar.a(dqpeVar, dmlbVar)) {
            return null;
        }
        dvgz ca = dvha.h.ca(dvhaVar2);
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        dvha dvhaVar3 = (dvha) ca.b;
        dvhaVar3.f = null;
        dvhaVar3.a &= -17;
        if ((dvhaVar2.a & 16) != 0) {
            dvhm dvhmVar2 = dvhaVar2.f;
            if (dvhmVar2 == null) {
                dvhmVar2 = dvhm.d;
            }
            dqpe dqpeVar2 = dvhmVar2.c;
            if (dqpeVar2 == null) {
                dqpeVar2 = dqpe.f;
            }
            if (true == awywVar.a(dqpeVar2, dmlbVar)) {
                dvhmVar = dvhmVar2;
            }
            if (dvhmVar != null) {
                if (ca.c) {
                    ca.bF();
                    ca.c = false;
                }
                dvha dvhaVar4 = (dvha) ca.b;
                dvhmVar.getClass();
                dvhaVar4.f = dvhmVar;
                dvhaVar4.a |= 16;
            }
        }
        return ca.bK();
    }

    @Override // defpackage.awze
    public final /* bridge */ /* synthetic */ boolean b(dvha dvhaVar, awza awzaVar, dmlb dmlbVar) {
        dvha dvhaVar2 = dvhaVar;
        dqpe dqpeVar = dvhaVar2.c;
        if (dqpeVar == null) {
            dqpeVar = dqpe.f;
        }
        if (!awzaVar.a(dqpeVar, dmlbVar)) {
            if ((dvhaVar2.a & 16) == 0) {
                return false;
            }
            dvhm dvhmVar = dvhaVar2.f;
            if (dvhmVar == null) {
                dvhmVar = dvhm.d;
            }
            dqpe dqpeVar2 = dvhmVar.c;
            if (dqpeVar2 == null) {
                dqpeVar2 = dqpe.f;
            }
            if (!awzaVar.a(dqpeVar2, dmlbVar)) {
                return false;
            }
        }
        return true;
    }
}
