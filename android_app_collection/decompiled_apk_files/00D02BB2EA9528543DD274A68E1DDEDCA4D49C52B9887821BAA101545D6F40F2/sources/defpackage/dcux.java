package defpackage;
/* compiled from: PG */
/* renamed from: dcux  reason: default package */
/* loaded from: classes5.dex */
final class dcux extends Number {
    private static final double b;
    private static final long serialVersionUID = 1;
    public final double[] a;

    static {
        double d = 1.0d;
        do {
            d *= 0.5d;
        } while (d + 1.0d != 1.0d);
        b = (1 << ((((int) Math.round((-Math.log(d)) / Math.log(2.0d))) + 1) / 2)) + 1;
    }

    private dcux(double... dArr) {
        this.a = dArr;
    }

    public static dcux a(double d, double d2) {
        double d3 = d * d2;
        double i = i(d2);
        return new dcux(j(d, i, d2 - i, d3), d3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f1, code lost:
        if (r2 == 0) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c9 A[EDGE_INSN: B:62:0x00c9->B:41:0x00c9 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00eb A[EDGE_INSN: B:66:0x00eb->B:47:0x00eb ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static defpackage.dcux e(defpackage.dcux r19, defpackage.dcux r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcux.e(dcux, dcux, boolean):dcux");
    }

    private static boolean f(double d, double d2) {
        return ((d2 > d ? 1 : (d2 == d ? 0 : -1)) > 0) == ((d2 > (-d) ? 1 : (d2 == (-d) ? 0 : -1)) > 0);
    }

    private static double[] g(double[] dArr, int i) {
        double[] dArr2 = new double[i];
        for (int i2 = 0; i2 < i; i2++) {
            dArr2[i2] = dArr[i2];
        }
        return dArr2;
    }

    private static double h(double d, double d2, double d3) {
        double d4 = d3 - d;
        return (d - (d3 - d4)) + (d2 - d4);
    }

    private static double i(double d) {
        double d2 = b * d;
        return d2 - (d2 - d);
    }

    private static double j(double d, double d2, double d3, double d4) {
        double i = i(d);
        double d5 = d - i;
        return (d5 * d3) - (((d4 - (i * d2)) - (d5 * d2)) - (i * d3));
    }

    public final dcux b(dcux dcuxVar) {
        return e(this, dcuxVar, false);
    }

    public final dcux c(dcux dcuxVar) {
        return e(this, dcuxVar, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
        if (r16 == 0) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dcux d(double r25) {
        /*
            r24 = this;
            r0 = r24
            double[] r1 = r0.a
            int r1 = r1.length
            int r1 = r1 + r1
            double[] r2 = new double[r1]
            double r11 = i(r25)
            double r13 = r25 - r11
            double[] r3 = r0.a
            r15 = 0
            r4 = r3[r15]
            double r16 = r4 * r25
            r3 = r4
            r5 = r11
            r7 = r13
            r9 = r16
            double r3 = j(r3, r5, r7, r9)
            r18 = 0
            r5 = 1
            int r6 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r6 == 0) goto L29
            r2[r15] = r3
            r3 = 1
            goto L2a
        L29:
            r3 = 0
        L2a:
            r20 = r16
            r9 = 1
            r16 = r3
        L2f:
            double[] r3 = r0.a
            int r4 = r3.length
            if (r9 >= r4) goto L68
            r4 = r3[r9]
            double r22 = r4 * r25
            r3 = r4
            r5 = r11
            r7 = r13
            r17 = r9
            r9 = r22
            double r5 = j(r3, r5, r7, r9)
            double r9 = r20 + r5
            r3 = r20
            r7 = r9
            double r3 = h(r3, r5, r7)
            int r5 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r5 == 0) goto L56
            int r5 = r16 + 1
            r2[r16] = r3
            r16 = r5
        L56:
            double r20 = r22 + r9
            double r3 = r20 - r22
            double r9 = r9 - r3
            int r3 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r3 == 0) goto L65
            int r3 = r16 + 1
            r2[r16] = r9
            r16 = r3
        L65:
            int r9 = r17 + 1
            goto L2f
        L68:
            int r3 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1))
            if (r3 != 0) goto L6f
            if (r16 != 0) goto L75
            goto L71
        L6f:
            r15 = r16
        L71:
            int r16 = r15 + 1
            r2[r15] = r20
        L75:
            r3 = r16
            if (r1 <= r3) goto L7d
            double[] r2 = g(r2, r3)
        L7d:
            dcux r1 = new dcux
            r1.<init>(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcux.d(double):dcux");
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        double d = 0.0d;
        for (double d2 : this.a) {
            d += d2;
        }
        return d;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return (float) doubleValue();
    }

    @Override // java.lang.Number
    public final int intValue() {
        return (int) longValue();
    }

    @Override // java.lang.Number
    public final long longValue() {
        return Math.round(doubleValue());
    }

    public final String toString() {
        return Double.toString(doubleValue());
    }
}
