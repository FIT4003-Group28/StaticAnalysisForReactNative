package defpackage;
/* compiled from: PG */
/* renamed from: cwvo  reason: default package */
/* loaded from: classes5.dex */
final class cwvo extends cwvr<Long, dzyg> {
    public static final cwvo a = new cwvo();

    private cwvo() {
    }

    @Override // defpackage.cwvr
    public final /* bridge */ /* synthetic */ String a(dzyg dzygVar) {
        dzyi dzyiVar = dzygVar.c;
        if (dzyiVar == null) {
            dzyiVar = dzyi.d;
        }
        return dzyiVar.c;
    }

    @Override // defpackage.cwvr
    public final /* bridge */ /* synthetic */ dzyg b(dzyg dzygVar, dzyg dzygVar2) {
        dzyg dzygVar3 = dzygVar;
        dzyg dzygVar4 = dzygVar2;
        if (dzygVar3 == null || dzygVar4 == null) {
            return dzygVar3;
        }
        if ((dzygVar3.a & 1) != 0) {
            dzyf bZ = dzyg.d.bZ();
            dzyi dzyiVar = dzygVar3.c;
            if (dzyiVar == null) {
                dzyiVar = dzyi.d;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyg dzygVar5 = (dzyg) bZ.b;
            dzyiVar.getClass();
            dzygVar5.c = dzyiVar;
            int i = dzygVar5.a | 2;
            dzygVar5.a = i;
            int i2 = dzygVar3.b - dzygVar4.b;
            if (i2 != 0) {
                dzygVar5.a = i | 1;
                dzygVar5.b = i2;
                return bZ.bK();
            }
        }
        return null;
    }

    @Override // defpackage.cwvr
    public final /* bridge */ /* synthetic */ dzyg c(String str, Long l) {
        int intValue = l.intValue();
        if (intValue == 0) {
            return null;
        }
        dzyf bZ = dzyg.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dzyg dzygVar = (dzyg) bZ.b;
        dzygVar.a |= 1;
        dzygVar.b = intValue;
        if (str != null) {
            dzyi a2 = cwvu.a(str);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyg dzygVar2 = (dzyg) bZ.b;
            a2.getClass();
            dzygVar2.c = a2;
            dzygVar2.a |= 2;
        }
        return bZ.bK();
    }
}
