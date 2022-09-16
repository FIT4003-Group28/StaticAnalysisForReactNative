package defpackage;
/* compiled from: PG */
/* renamed from: anhg  reason: default package */
/* loaded from: classes.dex */
public class anhg {
    public static long c(long j, long j2) {
        long j3 = j + j2;
        boolean z = true;
        boolean z2 = (j ^ j2) < 0;
        if ((j ^ j3) < 0) {
            z = false;
        }
        anhh.d(z2 | z, "checkedAdd", j, j2);
        return j3;
    }

    public static long d(long j, long j2) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(j) + Long.numberOfLeadingZeros(j ^ (-1)) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros((-1) ^ j2);
        if (numberOfLeadingZeros > 65) {
            return j * j2;
        }
        anhh.d(numberOfLeadingZeros >= 64, "checkedMultiply", j, j2);
        anhh.d(true, "checkedMultiply", j, j2);
        long j3 = j * j2;
        anhh.d(j == 0 || j3 / j == j2, "checkedMultiply", j, j2);
        return j3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
        if (((r7 == java.math.RoundingMode.HALF_EVEN ? 1 : 0) & (r0 & 1)) != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
        if (r1 > 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
        if (r5 > 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
        if (r5 < 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
        if (r2 != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int e(int r5, int r6, java.math.RoundingMode r7) {
        /*
            r7.getClass()
            if (r6 == 0) goto L54
            int r0 = r5 / r6
            int r1 = r6 * r0
            int r1 = r5 - r1
            if (r1 != 0) goto Le
            return r0
        Le:
            r5 = r5 ^ r6
            int r5 = r5 >> 31
            r2 = 1
            r5 = r5 | r2
            int[] r3 = defpackage.anhf.a
            int r4 = r7.ordinal()
            r3 = r3[r4]
            r4 = 0
            switch(r3) {
                case 1: goto L50;
                case 2: goto L53;
                case 3: goto L48;
                case 4: goto L4e;
                case 5: goto L45;
                case 6: goto L25;
                case 7: goto L25;
                case 8: goto L25;
                default: goto L1f;
            }
        L1f:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L25:
            int r1 = java.lang.Math.abs(r1)
            int r6 = java.lang.Math.abs(r6)
            int r6 = r6 - r1
            int r1 = r1 - r6
            if (r1 != 0) goto L42
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_UP
            if (r7 == r6) goto L4c
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_EVEN
            if (r7 != r6) goto L3b
            r6 = 1
            goto L3c
        L3b:
            r6 = 0
        L3c:
            r7 = r0 & 1
            r6 = r6 & r7
            if (r6 == 0) goto L4b
            goto L4c
        L42:
            if (r1 <= 0) goto L4b
            goto L4c
        L45:
            if (r5 <= 0) goto L4b
            goto L4c
        L48:
            if (r5 >= 0) goto L4b
            goto L4c
        L4b:
            r2 = 0
        L4c:
            if (r2 == 0) goto L53
        L4e:
            int r0 = r0 + r5
            return r0
        L50:
            defpackage.anhh.e(r4)
        L53:
            return r0
        L54:
            java.lang.ArithmeticException r5 = new java.lang.ArithmeticException
            java.lang.String r6 = "/ by zero"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anhg.e(int, int, java.math.RoundingMode):int");
    }

    public static int f(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            return i != 4 ? 0 : 5;
        }
        return 1;
    }

    public byte[] b() {
        throw null;
    }
}
