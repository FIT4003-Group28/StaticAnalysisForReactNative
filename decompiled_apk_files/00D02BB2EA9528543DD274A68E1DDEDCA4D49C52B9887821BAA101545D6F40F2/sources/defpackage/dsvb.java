package defpackage;
/* compiled from: PG */
/* renamed from: dsvb  reason: default package */
/* loaded from: classes6.dex */
public final class dsvb {
    static {
        dstu bZ = dstv.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dstv dstvVar = (dstv) bZ.b;
        dstvVar.a = -62135596800L;
        dstvVar.b = 0;
        bZ.bK();
        dstu bZ2 = dstv.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dstv dstvVar2 = (dstv) bZ2.b;
        dstvVar2.a = 253402300799L;
        dstvVar2.b = 999999999;
        bZ2.bK();
        dstu bZ3 = dstv.c.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dstv dstvVar3 = (dstv) bZ3.b;
        dstvVar3.a = 0L;
        dstvVar3.b = 0;
        bZ3.bK();
        new dsva();
    }

    public static dstv a(long j) {
        return e(j / 1000, (int) ((j % 1000) * 1000000));
    }

    public static long b(dstv dstvVar) {
        f(dstvVar);
        return deba.a(deba.c(dstvVar.a, 1000L), dstvVar.b / 1000000);
    }

    public static dstv c(long j) {
        return e(j / 1000000000, (int) (j % 1000000000));
    }

    public static dspt d(dstv dstvVar, dstv dstvVar2) {
        f(dstvVar);
        f(dstvVar2);
        long b = deba.b(dstvVar2.a, dstvVar.a);
        int i = dstvVar2.b;
        int i2 = dstvVar.b;
        long j = i - i2;
        int i3 = (int) j;
        debb.b(j == ((long) i3), "checkedSubtract", i, i2);
        return dsuz.d(b, i3);
    }

    static dstv e(long j, int i) {
        long j2 = i;
        if (j2 <= -1000000000 || j2 >= 1000000000) {
            j = deba.a(j, j2 / 1000000000);
            i = (int) (j2 % 1000000000);
        }
        if (i < 0) {
            i = (int) (i + 1000000000);
            j = deba.b(j, 1L);
        }
        dstu bZ = dstv.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dstv dstvVar = (dstv) bZ.b;
        dstvVar.a = j;
        dstvVar.b = i;
        dstv bK = bZ.bK();
        f(bK);
        return bK;
    }

    public static void f(dstv dstvVar) {
        long j = dstvVar.a;
        int i = dstvVar.b;
        if (j < -62135596800L || j > 253402300799L || i < 0 || i >= 1000000000) {
            throw new IllegalArgumentException(String.format("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", Long.valueOf(j), Integer.valueOf(i)));
        }
    }
}
