package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: dj  reason: default package */
/* loaded from: classes6.dex */
public final class dj implements Cloneable {
    public static final int[] f;
    private static final int h;
    public String a;
    public ArrayList<di> b;
    public ArrayList<Double> c;
    public boolean d;
    public final int e;
    private boolean g;

    static {
        char c;
        String a = ch.a();
        int hashCode = a.hashCode();
        int i = 1;
        if (hashCode != -413919155) {
            if (hashCode == -99796978 && a.equals("DOUBLE_OPTIONAL")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (a.equals("DOUBLE_REQUIRED")) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                throw new IllegalArgumentException();
            }
            i = 2;
        }
        h = i;
        f = new int[]{1, 2, 3, 4, 5, 6};
    }

    public dj() {
        new ArrayList();
        throw null;
    }

    private final int k(int i) {
        String str = this.a;
        byte[] bArr = ck.a;
        while (i < str.length() && ck.a(str.charAt(i))) {
            i++;
        }
        return i;
    }

    private final int l(int i) {
        String str = this.a;
        byte[] bArr = ck.a;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt > 255) {
                if (charAt >= 8206) {
                    if (charAt > 12336) {
                        if (charAt >= 64830) {
                            if (charAt <= 65094) {
                                if (charAt <= 64831 || charAt >= 65093) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (((ck.c[ck.b[(charAt - 8192) >> 5]] >> (charAt & 31)) & 1) != 0) {
                        break;
                    }
                } else {
                    continue;
                }
                i++;
            } else if (ck.a[charAt] != 0) {
                break;
            } else {
                i++;
            }
        }
        return i;
    }

    private final int m(int i) {
        char charAt;
        while (i < this.a.length() && (((charAt = this.a.charAt(i)) >= '0' || "+-.".indexOf(charAt) >= 0) && (charAt <= '9' || charAt == 'e' || charAt == 'E' || charAt == 8734))) {
            i++;
        }
        return i;
    }

    private final boolean n(int i) {
        int i2 = i + 1;
        char charAt = this.a.charAt(i);
        if (charAt == 's' || charAt == 'S') {
            int i3 = i2 + 1;
            char charAt2 = this.a.charAt(i2);
            if (charAt2 != 'e' && charAt2 != 'E') {
                return false;
            }
            int i4 = i3 + 1;
            char charAt3 = this.a.charAt(i3);
            if (charAt3 != 'l' && charAt3 != 'L') {
                return false;
            }
            int i5 = i4 + 1;
            char charAt4 = this.a.charAt(i4);
            if (charAt4 != 'e' && charAt4 != 'E') {
                return false;
            }
            int i6 = i5 + 1;
            char charAt5 = this.a.charAt(i5);
            if (charAt5 != 'c' && charAt5 != 'C') {
                return false;
            }
            char charAt6 = this.a.charAt(i6);
            return charAt6 == 't' || charAt6 == 'T';
        }
        return false;
    }

    private final boolean o(int i) {
        return i > 0 || this.b.get(0).e == 1;
    }

    private final void p(double d, int i, int i2) {
        int size;
        ArrayList<Double> arrayList = this.c;
        if (arrayList == null) {
            this.c = new ArrayList<>();
            size = 0;
        } else {
            size = arrayList.size();
            if (size > 32767) {
                throw new IndexOutOfBoundsException("Too many numeric values");
            }
        }
        this.c.add(Double.valueOf(d));
        u(14, i, i2, size);
    }

    private static String q(String str, int i) {
        StringBuilder sb = new StringBuilder(44);
        if (i == 0) {
            sb.append("\"");
        } else {
            sb.append("[at pattern index ");
            sb.append(i);
            sb.append("] \"");
        }
        if (str.length() - i <= 24) {
            if (i != 0) {
                str = str.substring(i);
            }
            sb.append(str);
        } else {
            int i2 = i + 20;
            int i3 = i2 - 1;
            if (true == Character.isHighSurrogate(str.charAt(i3))) {
                i2 = i3;
            }
            sb.append((CharSequence) str, i, i2);
            sb.append(" ...");
        }
        sb.append("\"");
        return sb.toString();
    }

    private final String r(int i) {
        return q(this.a, i);
    }

    private final String s() {
        return q(this.a, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:355:0x05e8, code lost:
        r1 = java.lang.String.valueOf(s());
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x05f8, code lost:
        if (r1.length() == 0) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x05fa, code lost:
        r1 = "Missing choice argument pattern in ".concat(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x05ff, code lost:
        r1 = new java.lang.String("Missing choice argument pattern in ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x0607, code lost:
        throw new java.lang.IllegalArgumentException(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x07b2, code lost:
        r1 = defpackage.dg.a(r5).toLowerCase(java.util.Locale.ENGLISH);
        r2 = r(r3);
        r5 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 37) + java.lang.String.valueOf(r2).length());
        r5.append("No message fragment after ");
        r5.append(r1);
        r5.append(" selector: ");
        r5.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x07f1, code lost:
        throw new java.lang.IllegalArgumentException(r5.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x0834, code lost:
        if (r10 == o(r21)) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x0836, code lost:
        if (r1 == false) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x0849, code lost:
        r1 = defpackage.dg.a(r5).toLowerCase(java.util.Locale.ENGLISH);
        r2 = s();
        r5 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 39) + java.lang.String.valueOf(r2).length());
        r5.append("Missing 'other' keyword in ");
        r5.append(r1);
        r5.append(" pattern in ");
        r5.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x0889, code lost:
        throw new java.lang.IllegalArgumentException(r5.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x088a, code lost:
        r1 = defpackage.dg.a(r5).toLowerCase(java.util.Locale.ENGLISH);
        r2 = r(r12);
        r5 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 21) + java.lang.String.valueOf(r2).length());
        r5.append("Bad ");
        r5.append(r1);
        r5.append(" pattern syntax: ");
        r5.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x08c7, code lost:
        throw new java.lang.IllegalArgumentException(r5.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x08c8, code lost:
        r1 = java.lang.String.valueOf(r(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x08d6, code lost:
        if (r1.length() == 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x08d8, code lost:
        r1 = "Bad argument syntax: ".concat(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x08dd, code lost:
        r1 = new java.lang.String("Bad argument syntax: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x08e5, code lost:
        throw new java.lang.IllegalArgumentException(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x0917, code lost:
        if (r8 != r2) goto L544;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x0919, code lost:
        if (r0 != '}') goto L544;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x091b, code lost:
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x091d, code lost:
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x091e, code lost:
        r10 = r13 - 1;
        v(r9, 2, r10, r4, r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x092b, code lost:
        if (r8 != 3) goto L543;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x092d, code lost:
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x092e, code lost:
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x015a, code lost:
        r1 = java.lang.String.valueOf(r(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x016a, code lost:
        if (r1.length() == 0) goto L476;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x016c, code lost:
        r1 = "Argument number too large: ".concat(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0171, code lost:
        r1 = new java.lang.String("Argument number too large: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0179, code lost:
        throw new java.lang.IndexOutOfBoundsException(r1);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0761 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:536:0x01b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x017a  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r10v45 */
    /* JADX WARN: Type inference failed for: r10v46 */
    /* JADX WARN: Type inference failed for: r10v55 */
    /* JADX WARN: Type inference failed for: r18v0, types: [dj] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int t(int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 2427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dj.t(int, int, int, int):int");
    }

    private final void u(int i, int i2, int i3, int i4) {
        this.b.add(new di(i, i2, i3, i4));
    }

    private final void v(int i, int i2, int i3, int i4, int i5) {
        this.b.get(i).d = this.b.size();
        u(i2, i3, i4, i5);
    }

    public final int a() {
        return this.b.size();
    }

    public final di b(int i) {
        return this.b.get(i);
    }

    public final String c(di diVar) {
        int i = diVar.a;
        return this.a.substring(i, diVar.b + i);
    }

    public final Object clone() {
        return g();
    }

    public final boolean d(di diVar, String str) {
        return this.a.regionMatches(diVar.a, str, 0, diVar.b);
    }

    public final double e(di diVar) {
        int i = diVar.e;
        if (i == 13) {
            return diVar.c;
        }
        if (i != 14) {
            return -1.23456789E8d;
        }
        return this.c.get(diVar.c).doubleValue();
    }

    public final boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        dj djVar = (dj) obj;
        int i = this.e;
        int i2 = djVar.e;
        if (i == 0) {
            throw null;
        }
        return i == i2 && ((str = this.a) != null ? str.equals(djVar.a) : djVar.a == null) && this.b.equals(djVar.b);
    }

    public final int f(int i) {
        int i2 = this.b.get(i).d;
        return i2 < i ? i : i2;
    }

    public final dj g() {
        try {
            dj djVar = (dj) super.clone();
            djVar.b = (ArrayList) this.b.clone();
            ArrayList<Double> arrayList = this.c;
            if (arrayList != null) {
                djVar.c = (ArrayList) arrayList.clone();
            }
            djVar.g = false;
            return djVar;
        } catch (CloneNotSupportedException e) {
            throw new dk(e);
        }
    }

    public final int h(int i) {
        return this.b.get(i).e;
    }

    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            int i2 = i * 37;
            String str = this.a;
            return ((i2 + (str != null ? str.hashCode() : 0)) * 37) + this.b.hashCode();
        }
        throw null;
    }

    public final void i(String str) {
        this.a = str;
        this.d = false;
        this.b.clear();
        ArrayList<Double> arrayList = this.c;
        if (arrayList != null) {
            arrayList.clear();
        }
        t(0, 0, 0, 1);
    }

    public final String toString() {
        return this.a;
    }

    public dj(String str) {
        this.b = new ArrayList<>();
        this.e = h;
        i(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void j(int r8, int r9, boolean r10) {
        /*
            r7 = this;
            int r0 = r8 + 1
            java.lang.String r1 = r7.a
            char r1 = r1.charAt(r8)
            r2 = 0
            r3 = 1
            r4 = 45
            if (r1 != r4) goto L1e
            if (r0 != r9) goto L11
            goto L43
        L11:
            int r1 = r0 + 1
            java.lang.String r4 = r7.a
            char r0 = r4.charAt(r0)
            r4 = 1
        L1a:
            r6 = r1
            r1 = r0
            r0 = r6
            goto L2f
        L1e:
            r4 = 43
            if (r1 != r4) goto L2e
            if (r0 == r9) goto L43
            int r1 = r0 + 1
            java.lang.String r4 = r7.a
            char r0 = r4.charAt(r0)
            r4 = 0
            goto L1a
        L2e:
            r4 = 0
        L2f:
            r5 = 8734(0x221e, float:1.2239E-41)
            if (r1 != r5) goto L65
            if (r10 == 0) goto L43
            if (r0 != r9) goto L43
            if (r3 == r4) goto L3c
            r0 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            goto L3e
        L3c:
            r0 = -4503599627370496(0xfff0000000000000, double:-Infinity)
        L3e:
            int r9 = r9 - r8
            r7.p(r0, r8, r9)
            return
        L43:
            java.lang.NumberFormatException r10 = new java.lang.NumberFormatException
            java.lang.String r0 = r7.a
            java.lang.String r8 = r0.substring(r8, r9)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r9 = "Bad syntax for numeric value: "
            int r0 = r8.length()
            if (r0 == 0) goto L5c
            java.lang.String r8 = r9.concat(r8)
            goto L61
        L5c:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r9)
        L61:
            r10.<init>(r8)
            throw r10
        L65:
            r10 = 48
            if (r1 < r10) goto L8d
            r10 = 57
            if (r1 > r10) goto L8d
            int r2 = r2 * 10
            int r1 = r1 + (-48)
            int r2 = r2 + r1
            int r10 = r4 + 32767
            if (r2 <= r10) goto L77
            goto L8d
        L77:
            if (r0 != r9) goto L83
            int r9 = r9 - r8
            if (r4 == 0) goto L7d
            int r2 = -r2
        L7d:
            r10 = 13
            r7.u(r10, r8, r9, r2)
            return
        L83:
            int r10 = r0 + 1
            java.lang.String r1 = r7.a
            char r1 = r1.charAt(r0)
            r0 = r10
            goto L65
        L8d:
            java.lang.String r10 = r7.a
            java.lang.String r10 = r10.substring(r8, r9)
            double r0 = java.lang.Double.parseDouble(r10)
            int r9 = r9 - r8
            r7.p(r0, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dj.j(int, int, boolean):void");
    }
}
