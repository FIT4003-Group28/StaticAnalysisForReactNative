package defpackage;
/* compiled from: PG */
/* renamed from: pek  reason: default package */
/* loaded from: classes7.dex */
public final class pek {
    public static pas a(dsch dschVar) {
        pan bZ = pas.d.bZ();
        pao bZ2 = pap.d.bZ();
        if ((dschVar.a & 1) != 0) {
            String str = dschVar.b;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            pap papVar = (pap) bZ2.b;
            str.getClass();
            papVar.a |= 1;
            papVar.b = str;
        }
        if ((dschVar.a & 2) != 0) {
            String str2 = dschVar.c;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            pap papVar2 = (pap) bZ2.b;
            str2.getClass();
            papVar2.a |= 2;
            papVar2.c = str2;
        }
        pap bK = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        pas pasVar = (pas) bZ.b;
        bK.getClass();
        pasVar.b = bK;
        pasVar.a |= 1;
        if ((dschVar.a & 32) != 0) {
            paq bZ3 = par.d.bZ();
            dsca dscaVar = dschVar.h;
            if (dscaVar == null) {
                dscaVar = dsca.h;
            }
            if ((dscaVar.a & 1) != 0) {
                dsca dscaVar2 = dschVar.h;
                if (dscaVar2 == null) {
                    dscaVar2 = dsca.h;
                }
                String str3 = dscaVar2.b;
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                par parVar = (par) bZ3.b;
                str3.getClass();
                parVar.a |= 1;
                parVar.b = str3;
            }
            dsca dscaVar3 = dschVar.h;
            if (dscaVar3 == null) {
                dscaVar3 = dsca.h;
            }
            if ((dscaVar3.a & 2) != 0) {
                dsca dscaVar4 = dschVar.h;
                if (dscaVar4 == null) {
                    dscaVar4 = dsca.h;
                }
                String str4 = dscaVar4.c;
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                par parVar2 = (par) bZ3.b;
                str4.getClass();
                parVar2.a |= 2;
                parVar2.c = str4;
            }
            par bK2 = bZ3.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            pas pasVar2 = (pas) bZ.b;
            bK2.getClass();
            pasVar2.c = bK2;
            pasVar2.a |= 2;
        }
        return bZ.bK();
    }
}
