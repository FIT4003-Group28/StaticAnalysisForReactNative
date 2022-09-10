package defpackage;
/* compiled from: PG */
/* renamed from: bfkh  reason: default package */
/* loaded from: classes3.dex */
public final class bfkh {
    private static final dcep<dggc> b = dcep.B(dggc.VIDEO);
    public final dcdc<dwfl> a;

    public bfkh(@dzsi ilo iloVar, boolean z) {
        dcdc<dwfl> dcdcVar;
        if (iloVar == null) {
            dcdcVar = dcdc.e();
        } else {
            dcdc<dwfl> z2 = dcbg.b(iloVar.aE()).o(bfkg.a).z();
            if (z2.isEmpty()) {
                dwgn bF = iloVar.bF();
                int size = bF.a.size();
                if (size == 0) {
                    dcdcVar = dcdc.e();
                } else if (size != 1) {
                    dcdcVar = dcdc.f(bF.a.get(z ? 1 : 0));
                } else {
                    dcdcVar = dcdc.f(bF.a.get(0));
                }
            } else {
                dcdcVar = z2;
            }
        }
        this.a = dcdcVar;
    }

    public static boolean a(@dzsi dwfl dwflVar) {
        if (dwflVar != null) {
            dcep<dggc> dcepVar = b;
            dizh dizhVar = dwflVar.p;
            if (dizhVar == null) {
                dizhVar = dizh.j;
            }
            dghk dghkVar = dizhVar.c;
            if (dghkVar == null) {
                dghkVar = dghk.g;
            }
            dggc b2 = dggc.b(dghkVar.b);
            if (b2 == null) {
                b2 = dggc.UNKNOWN;
            }
            return !dcepVar.contains(b2);
        }
        return false;
    }
}
