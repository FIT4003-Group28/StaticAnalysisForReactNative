package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: dsuz  reason: default package */
/* loaded from: classes6.dex */
public final class dsuz {
    private static final Comparator<dspt> a;

    static {
        dsps bZ = dspt.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dspt dsptVar = (dspt) bZ.b;
        dsptVar.a = -315576000000L;
        dsptVar.b = -999999999;
        bZ.bK();
        dsps bZ2 = dspt.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dspt dsptVar2 = (dspt) bZ2.b;
        dsptVar2.a = 315576000000L;
        dsptVar2.b = 999999999;
        bZ2.bK();
        dsps bZ3 = dspt.c.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dspt dsptVar3 = (dspt) bZ3.b;
        dsptVar3.a = 0L;
        dsptVar3.b = 0;
        bZ3.bK();
        a = new dsuy();
    }

    public static int a(dspt dsptVar, dspt dsptVar2) {
        return a.compare(dsptVar, dsptVar2);
    }

    public static dspt b(long j) {
        return d(j, 0);
    }

    public static dspt c(long j) {
        return d(j / 1000, (int) ((j % 1000) * 1000000));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dspt d(long j, int i) {
        long j2 = i;
        if (j2 <= -1000000000 || j2 >= 1000000000) {
            j = deba.a(j, j2 / 1000000000);
            i = (int) (j2 % 1000000000);
        }
        if (j > 0 && i < 0) {
            i = (int) (i + 1000000000);
            j--;
        }
        if (j < 0 && i > 0) {
            i = (int) (i - 1000000000);
            j++;
        }
        dsps bZ = dspt.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dspt dsptVar = (dspt) bZ.b;
        dsptVar.a = j;
        dsptVar.b = i;
        dspt bK = bZ.bK();
        e(bK);
        return bK;
    }

    public static void e(dspt dsptVar) {
        long j = dsptVar.a;
        int i = dsptVar.b;
        if (j >= -315576000000L && j <= 315576000000L) {
            long j2 = i;
            if (j2 >= -999999999 && j2 < 1000000000) {
                if (j >= 0 && i >= 0) {
                    return;
                }
                if (j <= 0 && i <= 0) {
                    return;
                }
            }
        }
        throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(j), Integer.valueOf(i)));
    }

    public static dspt f() {
        dsps bZ = dspt.c.bZ();
        long c = deba.c(1L, 3600L);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dspt dsptVar = (dspt) bZ.b;
        dsptVar.a = c;
        dsptVar.b = 0;
        return bZ.bK();
    }
}
