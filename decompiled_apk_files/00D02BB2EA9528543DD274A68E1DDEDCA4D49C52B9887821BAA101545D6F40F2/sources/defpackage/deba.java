package defpackage;
/* compiled from: PG */
/* renamed from: deba  reason: default package */
/* loaded from: classes6.dex */
public final class deba {
    public static long a(long j, long j2) {
        long j3 = j + j2;
        boolean z = true;
        boolean z2 = (j ^ j2) < 0;
        if ((j ^ j3) < 0) {
            z = false;
        }
        debb.c(z2 | z, "checkedAdd", j, j2);
        return j3;
    }

    public static long b(long j, long j2) {
        long j3 = j - j2;
        boolean z = true;
        boolean z2 = (j ^ j2) >= 0;
        if ((j ^ j3) < 0) {
            z = false;
        }
        debb.c(z2 | z, "checkedSubtract", j, j2);
        return j3;
    }

    public static long c(long j, long j2) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(j) + Long.numberOfLeadingZeros(j ^ (-1)) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros((-1) ^ j2);
        if (numberOfLeadingZeros > 65) {
            return j * j2;
        }
        debb.c(numberOfLeadingZeros >= 64, "checkedMultiply", j, j2);
        debb.c(true, "checkedMultiply", j, j2);
        long j3 = j * j2;
        debb.c(j == 0 || j3 / j == j2, "checkedMultiply", j, j2);
        return j3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        if (r4 > 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
        if (r11 > 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
        if (r11 < 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0060, code lost:
        if (r10 != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long d(long r10, java.math.RoundingMode r12) {
        /*
            defpackage.dbsk.s(r12)
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r10 / r0
            long r4 = r2 * r0
            long r4 = r10 - r4
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L13
            return r2
        L13:
            long r10 = r10 ^ r0
            r8 = 63
            long r10 = r10 >> r8
            int r11 = (int) r10
            r10 = 1
            r11 = r11 | r10
            int[] r8 = defpackage.deaz.a
            int r9 = r12.ordinal()
            r8 = r8[r9]
            r9 = 0
            switch(r8) {
                case 1: goto L65;
                case 2: goto L68;
                case 3: goto L5c;
                case 4: goto L62;
                case 5: goto L59;
                case 6: goto L2c;
                case 7: goto L2c;
                case 8: goto L2c;
                default: goto L26;
            }
        L26:
            java.lang.AssertionError r10 = new java.lang.AssertionError
            r10.<init>()
            throw r10
        L2c:
            long r4 = java.lang.Math.abs(r4)
            long r0 = java.lang.Math.abs(r0)
            long r0 = r0 - r4
            long r4 = r4 - r0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L54
            java.math.RoundingMode r0 = java.math.RoundingMode.HALF_UP
            if (r12 != r0) goto L40
            r0 = 1
            goto L41
        L40:
            r0 = 0
        L41:
            java.math.RoundingMode r1 = java.math.RoundingMode.HALF_EVEN
            if (r12 != r1) goto L47
            r12 = 1
            goto L48
        L47:
            r12 = 0
        L48:
            r4 = 1
            long r4 = r4 & r2
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L50
            goto L51
        L50:
            r10 = 0
        L51:
            r10 = r10 & r12
            r10 = r10 | r0
            goto L60
        L54:
            int r12 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r12 <= 0) goto L5f
            goto L60
        L59:
            if (r11 <= 0) goto L5f
            goto L60
        L5c:
            if (r11 >= 0) goto L5f
            goto L60
        L5f:
            r10 = 0
        L60:
            if (r10 == 0) goto L68
        L62:
            long r10 = (long) r11
            long r2 = r2 + r10
            return r2
        L65:
            defpackage.debb.a(r9)
        L68:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deba.d(long, java.math.RoundingMode):long");
    }
}
