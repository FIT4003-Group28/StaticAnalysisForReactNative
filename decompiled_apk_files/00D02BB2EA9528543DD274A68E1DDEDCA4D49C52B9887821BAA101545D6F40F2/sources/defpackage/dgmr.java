package defpackage;
/* compiled from: PG */
/* renamed from: dgmr  reason: default package */
/* loaded from: classes6.dex */
public final class dgmr {
    public static dspd a(dgpg dgpgVar) {
        drks bZ = drkt.c.bZ();
        dspd bR = dgpgVar.bR();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drkt drktVar = (drkt) bZ.b;
        bR.getClass();
        drktVar.a |= 1;
        drktVar.b = bR;
        return bZ.bK().bR();
    }

    public static dspd b(dgox dgoxVar) {
        dgpd bZ = dgpe.c.bZ();
        int i = dgoxVar.g;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dgpe dgpeVar = (dgpe) bZ.b;
        dgpeVar.a = 2;
        dgpeVar.b = Integer.valueOf(i);
        return bZ.bK().bR();
    }

    public static dspd c(int i, int i2) {
        dgph bZ = dgpi.d.bZ();
        int i3 = i - 1;
        if (i != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dgpi dgpiVar = (dgpi) bZ.b;
            int i4 = dgpiVar.a | 1;
            dgpiVar.a = i4;
            dgpiVar.b = i3;
            int i5 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            dgpiVar.c = i5;
            dgpiVar.a = i4 | 2;
            return bZ.bK().bR();
        }
        throw null;
    }

    public static dspd d(int i) {
        dgpj bZ = dgpk.c.bZ();
        int i2 = i - 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dgpk dgpkVar = (dgpk) bZ.b;
        dgpkVar.a |= 1;
        dgpkVar.b = i2;
        return bZ.bK().bR();
    }

    public static dspd e(int i) {
        dgpd bZ = dgpe.c.bZ();
        int i2 = i - 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dgpe dgpeVar = (dgpe) bZ.b;
        dgpeVar.a = 1;
        dgpeVar.b = Integer.valueOf(i2);
        return bZ.bK().bR();
    }

    public static dspd f(int i) {
        dgpd bZ = dgpe.c.bZ();
        int i2 = i - 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dgpe dgpeVar = (dgpe) bZ.b;
        dgpeVar.a = 3;
        dgpeVar.b = Integer.valueOf(i2);
        return bZ.bK().bR();
    }
}
