package defpackage;

import java.math.BigInteger;
/* compiled from: PG */
/* renamed from: dect  reason: default package */
/* loaded from: classes6.dex */
final class dect {
    static final long[] a = new long[37];
    static final int[] b = new int[37];
    static final int[] c = new int[37];

    static {
        BigInteger bigInteger = new BigInteger("10000000000000000", 16);
        for (int i = 2; i <= 36; i++) {
            long j = i;
            long j2 = -1;
            a[i] = decu.c(-1L, j);
            int[] iArr = b;
            if (j >= 0) {
                long j3 = Long.MAX_VALUE / j;
                j2 = (-1) - ((j3 + j3) * j);
                if (decu.b(j2, j) < 0) {
                    j = 0;
                }
            } else if (decu.b(-1L, j) < 0) {
                iArr[i] = (int) j2;
                c[i] = bigInteger.toString(i).length() - 1;
            }
            j2 -= j;
            iArr[i] = (int) j2;
            c[i] = bigInteger.toString(i).length() - 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(long j, int i, int i2) {
        if (j >= 0) {
            long[] jArr = a;
            if (j < jArr[i2]) {
                return false;
            }
            return j > jArr[i2] || i > b[i2];
        }
        return true;
    }
}
