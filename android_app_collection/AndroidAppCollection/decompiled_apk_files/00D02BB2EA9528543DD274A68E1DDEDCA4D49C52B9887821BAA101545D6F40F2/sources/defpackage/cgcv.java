package defpackage;
/* compiled from: PG */
/* renamed from: cgcv  reason: default package */
/* loaded from: classes4.dex */
public class cgcv {
    public bvjj a;
    private final btvo b;

    public cgcv(btvo btvoVar) {
        this.b = btvoVar;
    }

    public static cgco b(int i) {
        cgcn bZ = cgco.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cgco cgcoVar = (cgco) bZ.b;
        int i2 = cgcoVar.a | 1;
        cgcoVar.a = i2;
        cgcoVar.b = 0;
        cgcoVar.a = i2 | 2;
        cgcoVar.c = i;
        return bZ.bK();
    }

    public static drnj c(String str) {
        drnf bZ = drnj.b.bZ();
        drnh bZ2 = drni.c.bZ();
        drma bZ3 = drmb.d.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        drmb drmbVar = (drmb) bZ3.b;
        str.getClass();
        int i = drmbVar.a | 1;
        drmbVar.a = i;
        drmbVar.b = str;
        drmbVar.a = i | 2;
        drmbVar.c = "Dismiss";
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        drni drniVar = (drni) bZ2.b;
        drmb bK = bZ3.bK();
        bK.getClass();
        drniVar.b = bK;
        drniVar.a = 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drnj drnjVar = (drnj) bZ.b;
        drni bK2 = bZ2.bK();
        bK2.getClass();
        dsrj<drni> dsrjVar = drnjVar.a;
        if (!dsrjVar.a()) {
            drnjVar.a = dsqw.cl(dsrjVar);
        }
        drnjVar.a.add(bK2);
        return bZ.bK();
    }

    public static cgbs d(int i, String str, String str2) {
        cgbr bZ = cgbs.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cgbs cgbsVar = (cgbs) bZ.b;
        cgbsVar.b = i - 1;
        int i2 = cgbsVar.a | 1;
        cgbsVar.a = i2;
        str.getClass();
        int i3 = i2 | 2;
        cgbsVar.a = i3;
        cgbsVar.c = str;
        str2.getClass();
        cgbsVar.a = i3 | 4;
        cgbsVar.d = str2;
        return bZ.bK();
    }

    public static cgcf e(int i, String str) {
        cgce bZ = cgcf.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cgcf cgcfVar = (cgcf) bZ.b;
        cgcfVar.b = i - 1;
        int i2 = cgcfVar.a | 1;
        cgcfVar.a = i2;
        str.getClass();
        cgcfVar.a = i2 | 2;
        cgcfVar.c = str;
        return bZ.bK();
    }

    public final boolean a() {
        dhpm dhpmVar = this.b.getContributionsPageParameters().i;
        if (dhpmVar == null) {
            dhpmVar = dhpm.c;
        }
        if (dhpmVar.a) {
            bvjj bvjjVar = this.a;
            dbsk.s(bvjjVar);
            if (!bvjjVar.m(bvjk.ko, false)) {
                return true;
            }
        }
        return false;
    }
}
