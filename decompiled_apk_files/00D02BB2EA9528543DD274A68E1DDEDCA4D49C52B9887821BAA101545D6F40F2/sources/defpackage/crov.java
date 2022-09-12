package defpackage;
/* compiled from: PG */
/* renamed from: crov  reason: default package */
/* loaded from: classes5.dex */
public final class crov {
    public static ddlj a(ddlj ddljVar) {
        ddky bZ = ddlj.i.bZ();
        if ((ddljVar.a & 1) != 0) {
            ddlg b = ddlg.b(ddljVar.b);
            if (b == null) {
                b = ddlg.UNKNOWN;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddlj ddljVar2 = (ddlj) bZ.b;
            ddljVar2.b = b.f;
            ddljVar2.a |= 1;
        }
        if ((ddljVar.a & 2) != 0) {
            ddld bZ2 = ddle.f.bZ();
            ddle ddleVar = ddljVar.c;
            if (ddleVar == null) {
                ddleVar = ddle.f;
            }
            if ((ddleVar.a & 1) != 0) {
                ddle ddleVar2 = ddljVar.c;
                if (ddleVar2 == null) {
                    ddleVar2 = ddle.f;
                }
                String str = ddleVar2.b;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                ddle ddleVar3 = (ddle) bZ2.b;
                str.getClass();
                ddleVar3.a |= 1;
                ddleVar3.b = str;
            }
            ddle ddleVar4 = ddljVar.c;
            if (ddleVar4 == null) {
                ddleVar4 = ddle.f;
            }
            if ((ddleVar4.a & 2) != 0) {
                ddle ddleVar5 = ddljVar.c;
                if (ddleVar5 == null) {
                    ddleVar5 = ddle.f;
                }
                String str2 = ddleVar5.c;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                ddle ddleVar6 = (ddle) bZ2.b;
                str2.getClass();
                ddleVar6.a |= 2;
                ddleVar6.c = str2;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddlj ddljVar3 = (ddlj) bZ.b;
            ddle bK = bZ2.bK();
            bK.getClass();
            ddljVar3.c = bK;
            ddljVar3.a |= 2;
        }
        if ((ddljVar.a & 4) != 0) {
            ddkz bZ3 = ddla.e.bZ();
            ddla ddlaVar = ddljVar.d;
            if (ddlaVar == null) {
                ddlaVar = ddla.e;
            }
            if ((ddlaVar.a & 1) != 0) {
                ddla ddlaVar2 = ddljVar.d;
                if (ddlaVar2 == null) {
                    ddlaVar2 = ddla.e;
                }
                String str3 = ddlaVar2.b;
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                ddla ddlaVar3 = (ddla) bZ3.b;
                str3.getClass();
                ddlaVar3.a |= 1;
                ddlaVar3.b = str3;
            }
            ddla ddlaVar4 = ddljVar.d;
            if (ddlaVar4 == null) {
                ddlaVar4 = ddla.e;
            }
            if ((ddlaVar4.a & 2) != 0) {
                ddla ddlaVar5 = ddljVar.d;
                if (ddlaVar5 == null) {
                    ddlaVar5 = ddla.e;
                }
                String str4 = ddlaVar5.c;
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                ddla ddlaVar6 = (ddla) bZ3.b;
                str4.getClass();
                ddlaVar6.a |= 2;
                ddlaVar6.c = str4;
            }
            ddla ddlaVar7 = ddljVar.d;
            if (ddlaVar7 == null) {
                ddlaVar7 = ddla.e;
            }
            if ((ddlaVar7.a & 4) != 0) {
                ddla ddlaVar8 = ddljVar.d;
                if (ddlaVar8 == null) {
                    ddlaVar8 = ddla.e;
                }
                String str5 = ddlaVar8.d;
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                ddla ddlaVar9 = (ddla) bZ3.b;
                str5.getClass();
                ddlaVar9.a |= 4;
                ddlaVar9.d = str5;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddlj ddljVar4 = (ddlj) bZ.b;
            ddla bK2 = bZ3.bK();
            bK2.getClass();
            ddljVar4.d = bK2;
            ddljVar4.a |= 4;
        }
        return bZ.bK();
    }
}
