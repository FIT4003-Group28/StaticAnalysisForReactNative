package defpackage;
/* compiled from: PG */
/* renamed from: deav  reason: default package */
/* loaded from: classes.dex */
public final class deav {
    private deav() {
    }

    public static boolean b(double d) {
        if (deaw.a(d)) {
            if (d == dcyn.a) {
                return true;
            }
            dbsk.b(deaw.a(d), "not a normal value");
            int exponent = Math.getExponent(d);
            long doubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
            if (52 - Long.numberOfTrailingZeros(exponent == -1023 ? doubleToRawLongBits + doubleToRawLongBits : doubleToRawLongBits | 4503599627370496L) <= Math.getExponent(d)) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(double d, double d2, double d3) {
        if (d3 >= dcyn.a) {
            return Math.copySign(d - d2, 1.0d) <= d3 || d == d2 || (Double.isNaN(d) && Double.isNaN(d2));
        }
        StringBuilder sb = new StringBuilder(49);
        sb.append("tolerance");
        sb.append(" (");
        sb.append(d3);
        sb.append(") must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (java.lang.Math.abs(r8 - r4) == 0.5d) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(double r8, java.math.RoundingMode r10) {
        /*
            boolean r0 = defpackage.deaw.a(r8)
            if (r0 == 0) goto Lc6
            int[] r0 = defpackage.deau.a
            int r1 = r10.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r4 = 0
            switch(r0) {
                case 1: goto L76;
                case 2: goto L65;
                case 3: goto L56;
                case 4: goto L7d;
                case 5: goto L45;
                case 6: goto L40;
                case 7: goto L2b;
                case 8: goto L1c;
                default: goto L16;
            }
        L16:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            throw r8
        L1c:
            double r4 = java.lang.Math.rint(r8)
            double r6 = r8 - r4
            double r6 = java.lang.Math.abs(r6)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L7e
            goto L7d
        L2b:
            double r4 = java.lang.Math.rint(r8)
            double r6 = r8 - r4
            double r6 = java.lang.Math.abs(r6)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L7e
            double r2 = java.lang.Math.copySign(r2, r8)
            double r4 = r8 + r2
            goto L7e
        L40:
            double r4 = java.lang.Math.rint(r8)
            goto L7e
        L45:
            boolean r0 = b(r8)
            if (r0 == 0) goto L4c
            goto L7d
        L4c:
            long r2 = (long) r8
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 <= 0) goto L53
            r0 = 1
            goto L54
        L53:
            r0 = -1
        L54:
            long r4 = (long) r0
            goto L73
        L56:
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 <= 0) goto L7d
            boolean r0 = b(r8)
            if (r0 == 0) goto L61
            goto L7d
        L61:
            long r2 = (long) r8
            r4 = 1
            goto L73
        L65:
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 >= 0) goto L7d
            boolean r0 = b(r8)
            if (r0 == 0) goto L70
            goto L7d
        L70:
            long r2 = (long) r8
            r4 = -1
        L73:
            long r2 = r2 + r4
            double r4 = (double) r2
            goto L7e
        L76:
            boolean r0 = b(r8)
            defpackage.debb.a(r0)
        L7d:
            r4 = r8
        L7e:
            r2 = -4476578029604175872(0xc1e0000000200000, double:-2.147483649E9)
            r0 = 0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 <= 0) goto L8a
            r2 = 1
            goto L8b
        L8a:
            r2 = 0
        L8b:
            r6 = 4746794007248502784(0x41e0000000000000, double:2.147483648E9)
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 >= 0) goto L92
            goto L93
        L92:
            r1 = 0
        L93:
            r0 = r2 & r1
            if (r0 == 0) goto L99
            int r8 = (int) r4
            return r8
        L99:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r1 = java.lang.String.valueOf(r10)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 83
            r2.<init>(r1)
            java.lang.String r1 = "rounded value is out of range for input "
            r2.append(r1)
            r2.append(r8)
            java.lang.String r8 = " and rounding mode "
            r2.append(r8)
            r2.append(r10)
            java.lang.String r8 = r2.toString()
            r0.<init>(r8)
            throw r0
        Lc6:
            java.lang.ArithmeticException r8 = new java.lang.ArithmeticException
            java.lang.String r9 = "input is infinite or NaN"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deav.a(double, java.math.RoundingMode):int");
    }
}
