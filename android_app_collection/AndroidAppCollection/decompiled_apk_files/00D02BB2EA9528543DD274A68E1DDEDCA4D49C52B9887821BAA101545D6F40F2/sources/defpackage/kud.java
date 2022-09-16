package defpackage;
/* compiled from: PG */
/* renamed from: kud  reason: default package */
/* loaded from: classes7.dex */
class kud extends dbrh<ddla, dhmi> {
    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ ddla b(dhmi dhmiVar) {
        dhmi dhmiVar2 = dhmiVar;
        ddkz bZ = ddla.e.bZ();
        if ((dhmiVar2.a & 1) != 0) {
            String str = dhmiVar2.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddla ddlaVar = (ddla) bZ.b;
            str.getClass();
            ddlaVar.a |= 1;
            ddlaVar.b = str;
        }
        if ((dhmiVar2.a & 2) != 0) {
            String str2 = dhmiVar2.c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddla ddlaVar2 = (ddla) bZ.b;
            str2.getClass();
            ddlaVar2.a |= 2;
            ddlaVar2.c = str2;
        }
        if ((dhmiVar2.a & 4) != 0) {
            String str3 = dhmiVar2.d;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddla ddlaVar3 = (ddla) bZ.b;
            str3.getClass();
            ddlaVar3.a |= 4;
            ddlaVar3.d = str3;
        }
        return bZ.bK();
    }

    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ dhmi c(ddla ddlaVar) {
        ddla ddlaVar2 = ddlaVar;
        dhmh bZ = dhmi.e.bZ();
        if ((ddlaVar2.a & 1) != 0) {
            String str = ddlaVar2.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhmi dhmiVar = (dhmi) bZ.b;
            str.getClass();
            dhmiVar.a |= 1;
            dhmiVar.b = str;
        }
        if ((ddlaVar2.a & 2) != 0) {
            String str2 = ddlaVar2.c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhmi dhmiVar2 = (dhmi) bZ.b;
            str2.getClass();
            dhmiVar2.a |= 2;
            dhmiVar2.c = str2;
        }
        if ((ddlaVar2.a & 4) != 0) {
            String str3 = ddlaVar2.d;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhmi dhmiVar3 = (dhmi) bZ.b;
            str3.getClass();
            dhmiVar3.a |= 4;
            dhmiVar3.d = str3;
        }
        return bZ.bK();
    }
}
