package defpackage;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: eanj  reason: default package */
/* loaded from: classes6.dex */
public final class eanj extends eand {
    private static final int[] F = eaoe.c;
    private static final int[] G = eaoe.b;
    protected final eant A;
    protected int[] B;
    protected boolean C;
    protected InputStream D;
    protected byte[] E;

    public eanj(eanm eanmVar, int i, InputStream inputStream, eant eantVar, byte[] bArr, int i2, int i3) {
        super(eanmVar, i);
        this.B = new int[16];
        this.C = false;
        this.D = inputStream;
        this.A = eantVar;
        this.E = bArr;
        this.e = i2;
        this.f = i3;
        if (!eamv.CANONICALIZE_FIELD_NAMES.a(i)) {
            K();
        }
    }

    public static int[] Y(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        int[] iArr2 = new int[i + length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
        r5 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.eamz aa(char[] r9, int r10, int r11, boolean r12, int r13) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eanj.aa(char[], int, int, boolean, int):eamz");
    }

    private final eanz ab(int i, int i2, int i3) {
        return M(this.B, 0, i, i2, i3);
    }

    private final eanz ac(int i, int i2, int i3, int i4) {
        int[] iArr = this.B;
        iArr[0] = i;
        return M(iArr, 1, i2, i3, i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
        if (r3 == 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.eanz ad(int r8, int r9) {
        /*
            r7 = this;
            eant r0 = r7.A
            int r1 = r8 >>> 16
            r1 = r1 ^ r8
            int r2 = r1 >>> 8
            r1 = r1 ^ r2
            int r2 = r0.d
            r2 = r2 & r1
            int[] r3 = r0.e
            r3 = r3[r2]
            int r4 = r3 >> 8
            r4 = r4 ^ r1
            int r4 = r4 << 8
            r5 = 0
            r6 = 0
            if (r4 != 0) goto L27
            eanz[] r4 = r0.f
            r2 = r4[r2]
            if (r2 != 0) goto L1f
            goto L3a
        L1f:
            boolean r4 = r2.a(r8)
            if (r4 == 0) goto L2a
            r6 = r2
            goto L3a
        L27:
            if (r3 != 0) goto L2a
            goto L3a
        L2a:
            r2 = r3 & 255(0xff, float:3.57E-43)
            if (r2 <= 0) goto L3a
            eans[] r0 = r0.g
            int r2 = r2 + (-1)
            r0 = r0[r2]
            if (r0 == 0) goto L3a
            eanz r6 = r0.a(r1, r8, r5)
        L3a:
            if (r6 == 0) goto L3d
            return r6
        L3d:
            int[] r0 = r7.B
            r0[r5] = r8
            r8 = 1
            eanz r8 = r7.ag(r0, r8, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eanj.ad(int, int):eanz");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
        if (r3 == 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.eanz ae(int r7, int r8, int r9) {
        /*
            r6 = this;
            eant r0 = r6.A
            int r1 = r7 * 31
            int r1 = r1 + r8
            int r2 = r1 >>> 16
            r1 = r1 ^ r2
            int r2 = r1 >>> 8
            r1 = r1 ^ r2
            int r2 = r0.d
            r2 = r2 & r1
            int[] r3 = r0.e
            r3 = r3[r2]
            int r4 = r3 >> 8
            r4 = r4 ^ r1
            int r4 = r4 << 8
            r5 = 0
            if (r4 != 0) goto L29
            eanz[] r4 = r0.f
            r2 = r4[r2]
            if (r2 != 0) goto L21
            goto L3c
        L21:
            boolean r4 = r2.b(r7, r8)
            if (r4 == 0) goto L2c
            r5 = r2
            goto L3c
        L29:
            if (r3 != 0) goto L2c
            goto L3c
        L2c:
            r2 = r3 & 255(0xff, float:3.57E-43)
            if (r2 <= 0) goto L3c
            eans[] r0 = r0.g
            int r2 = r2 + (-1)
            r0 = r0[r2]
            if (r0 == 0) goto L3c
            eanz r5 = r0.a(r1, r7, r8)
        L3c:
            if (r5 == 0) goto L3f
            return r5
        L3f:
            int[] r0 = r6.B
            r1 = 0
            r0[r1] = r7
            r7 = 1
            r0[r7] = r8
            r7 = 2
            eanz r7 = r6.ag(r0, r7, r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eanj.ae(int, int, int):eanz");
    }

    private final eanz af(int[] iArr, int i, int i2, int i3) {
        int length = iArr.length;
        if (i >= length) {
            iArr = Y(iArr, length);
            this.B = iArr;
        }
        int i4 = i + 1;
        iArr[i] = i2;
        eanz b = this.A.b(iArr, i4);
        return b == null ? ag(iArr, i4, i3) : b;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0167  */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.eanz ag(int[] r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 739
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eanj.ag(int[], int, int):eanz");
    }

    private final int ah() {
        while (true) {
            if (this.e < this.f || o()) {
                byte[] bArr = this.E;
                int i = this.e;
                this.e = i + 1;
                int i2 = bArr[i] & 255;
                if (i2 > 32) {
                    if (i2 != 47) {
                        return i2;
                    }
                    ai();
                } else if (i2 != 32) {
                    if (i2 == 10) {
                        T();
                    } else if (i2 == 13) {
                        S();
                    } else if (i2 != 9) {
                        F(i2);
                    }
                }
            } else {
                throw l("Unexpected end-of-input within/between " + this.l.c() + " entries");
            }
        }
    }

    private final void ai() {
        if (!a(eamv.ALLOW_COMMENTS)) {
            C(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this.e >= this.f && !o()) {
            D(" in a comment");
        }
        byte[] bArr = this.E;
        int i = this.e;
        this.e = i + 1;
        int i2 = bArr[i] & 255;
        if (i2 == 47) {
            int[] iArr = eaoe.f;
            while (true) {
                if (this.e >= this.f && !o()) {
                    return;
                }
                byte[] bArr2 = this.E;
                int i3 = this.e;
                this.e = i3 + 1;
                int i4 = bArr2[i3] & 255;
                int i5 = iArr[i4];
                if (i5 != 0) {
                    if (i5 == 10) {
                        T();
                        return;
                    } else if (i5 == 13) {
                        S();
                        return;
                    } else if (i5 != 42) {
                        U(i4);
                    }
                }
            }
        } else if (i2 == 42) {
            int[] iArr2 = eaoe.f;
            while (true) {
                if (this.e < this.f || o()) {
                    byte[] bArr3 = this.E;
                    int i6 = this.e;
                    int i7 = i6 + 1;
                    this.e = i7;
                    int i8 = bArr3[i6] & 255;
                    int i9 = iArr2[i8];
                    if (i9 != 0) {
                        if (i9 == 10) {
                            T();
                        } else if (i9 == 13) {
                            S();
                        } else if (i9 == 42) {
                            if (bArr3[i7] == 47) {
                                this.e = i7 + 1;
                                return;
                            }
                        } else {
                            U(i8);
                        }
                    }
                } else {
                    D(" in a comment");
                    return;
                }
            }
        } else {
            C(i2, "was expecting either '*' or '/' for a comment");
        }
    }

    private final int aj(int i) {
        if (this.e >= this.f) {
            n();
        }
        byte[] bArr = this.E;
        int i2 = this.e;
        int i3 = i2 + 1;
        this.e = i3;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            X(b & 255, i3);
        }
        return ((i & 31) << 6) | (b & 63);
    }

    private final int ak(int i) {
        if (this.e >= this.f) {
            n();
        }
        int i2 = i & 15;
        byte[] bArr = this.E;
        int i3 = this.e;
        int i4 = i3 + 1;
        this.e = i4;
        byte b = bArr[i3];
        if ((b & 192) != 128) {
            X(b & 255, i4);
        }
        int i5 = (i2 << 6) | (b & 63);
        if (this.e >= this.f) {
            n();
        }
        byte[] bArr2 = this.E;
        int i6 = this.e;
        int i7 = i6 + 1;
        this.e = i7;
        byte b2 = bArr2[i6];
        if ((b2 & 192) != 128) {
            X(b2 & 255, i7);
        }
        return (i5 << 6) | (b2 & 63);
    }

    private final int al(int i) {
        int i2 = i & 15;
        byte[] bArr = this.E;
        int i3 = this.e;
        int i4 = i3 + 1;
        this.e = i4;
        byte b = bArr[i3];
        if ((b & 192) != 128) {
            X(b & 255, i4);
        }
        int i5 = (i2 << 6) | (b & 63);
        byte[] bArr2 = this.E;
        int i6 = this.e;
        int i7 = i6 + 1;
        this.e = i7;
        byte b2 = bArr2[i6];
        if ((b2 & 192) != 128) {
            X(b2 & 255, i7);
        }
        return (i5 << 6) | (b2 & 63);
    }

    private final int am(int i) {
        if (this.e >= this.f) {
            n();
        }
        byte[] bArr = this.E;
        int i2 = this.e;
        int i3 = i2 + 1;
        this.e = i3;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            X(b & 255, i3);
        }
        int i4 = ((i & 7) << 6) | (b & 63);
        if (this.e >= this.f) {
            n();
        }
        byte[] bArr2 = this.E;
        int i5 = this.e;
        int i6 = i5 + 1;
        this.e = i6;
        byte b2 = bArr2[i5];
        if ((b2 & 192) != 128) {
            X(b2 & 255, i6);
        }
        int i7 = (i4 << 6) | (b2 & 63);
        if (this.e >= this.f) {
            n();
        }
        byte[] bArr3 = this.E;
        int i8 = this.e;
        int i9 = i8 + 1;
        this.e = i9;
        byte b3 = bArr3[i8];
        if ((b3 & 192) != 128) {
            X(b3 & 255, i9);
        }
        return ((i7 << 6) | (b3 & 63)) - 65536;
    }

    private final int an() {
        if (this.e >= this.f) {
            n();
        }
        byte[] bArr = this.E;
        int i = this.e;
        this.e = i + 1;
        return bArr[i] & 255;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00de, code lost:
        if (r0 == 46) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e0, code lost:
        if (r0 == 101) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e2, code lost:
        if (r0 != 69) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e5, code lost:
        r13.e = r11 - 1;
        r13.n.i = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00fa, code lost:
        return aa(r2, r6, r0, r8, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:?, code lost:
        return u(r8, r14);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final defpackage.eamz L(int r14) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eanj.L(int):eamz");
    }

    protected final eanz M(int[] iArr, int i, int i2, int i3, int i4) {
        int[] iArr2 = G;
        while (true) {
            if (iArr2[i3] != 0) {
                if (i3 == 34) {
                    break;
                }
                if (i3 != 92) {
                    G(i3, "name");
                } else {
                    i3 = Q();
                }
                if (i3 > 127) {
                    int i5 = 0;
                    if (i4 >= 4) {
                        int length = iArr.length;
                        if (i >= length) {
                            iArr = Y(iArr, length);
                            this.B = iArr;
                        }
                        iArr[i] = i2;
                        i++;
                        i2 = 0;
                        i4 = 0;
                    }
                    if (i3 < 2048) {
                        i2 = (i2 << 8) | (i3 >> 6) | 192;
                        i4++;
                    } else {
                        int i6 = (i2 << 8) | (i3 >> 12) | 224;
                        int i7 = i4 + 1;
                        if (i7 >= 4) {
                            int length2 = iArr.length;
                            if (i >= length2) {
                                iArr = Y(iArr, length2);
                                this.B = iArr;
                            }
                            iArr[i] = i6;
                            i++;
                            i7 = 0;
                        } else {
                            i5 = i6;
                        }
                        i2 = (i5 << 8) | ((i3 >> 6) & 63) | 128;
                        i4 = i7 + 1;
                    }
                    i3 = (i3 & 63) | 128;
                }
            }
            if (i4 < 4) {
                i4++;
                i2 = (i2 << 8) | i3;
            } else {
                int length3 = iArr.length;
                if (i >= length3) {
                    iArr = Y(iArr, length3);
                    this.B = iArr;
                }
                iArr[i] = i2;
                i2 = i3;
                i++;
                i4 = 1;
            }
            if (this.e >= this.f && !o()) {
                D(" in field name");
            }
            byte[] bArr = this.E;
            int i8 = this.e;
            this.e = i8 + 1;
            i3 = bArr[i8] & 255;
        }
        if (i4 > 0) {
            int length4 = iArr.length;
            if (i >= length4) {
                iArr = Y(iArr, length4);
                this.B = iArr;
            }
            iArr[i] = i2;
            i++;
        }
        eanz b = this.A.b(iArr, i);
        return b == null ? ag(iArr, i, i4) : b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0095, code lost:
        if (r7 != 39) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0097, code lost:
        r11.n.i = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009d, code lost:
        return defpackage.eamz.VALUE_STRING;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009e, code lost:
        r6 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a0, code lost:
        if (r6 == 1) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a3, code lost:
        if (r6 == 2) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a6, code lost:
        if (r6 == 3) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a9, code lost:
        if (r6 == 4) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ad, code lost:
        if (r7 >= 32) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00af, code lost:
        G(r7, "string value");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b4, code lost:
        U(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b8, code lost:
        r6 = am(r7);
        r7 = r5 + 1;
        r12[r5] = (char) ((r6 >> 10) | 55296);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c8, code lost:
        if (r7 < r12.length) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ca, code lost:
        r12 = r11.n.k();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d2, code lost:
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d3, code lost:
        r7 = 56320 | (r6 & 1023);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00dd, code lost:
        if ((r11.f - r8) < 2) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00df, code lost:
        r7 = al(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e4, code lost:
        r7 = ak(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e9, code lost:
        r7 = aj(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f0, code lost:
        if (r7 == 34) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f2, code lost:
        r7 = Q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f7, code lost:
        if (r5 < r12.length) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f9, code lost:
        r12 = r11.n.k();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0100, code lost:
        r12[r5] = (char) r7;
        r5 = r5 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final defpackage.eamz N(int r12) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eanj.N(int):eamz");
    }

    protected final eamz O(int i, boolean z) {
        if (i == 73) {
            if (this.e >= this.f && !o()) {
                E();
            }
            byte[] bArr = this.E;
            int i2 = this.e;
            this.e = i2 + 1;
            i = bArr[i2];
            double d = Double.POSITIVE_INFINITY;
            if (i == 78) {
                String str = true != z ? "+INF" : "-INF";
                P(str, 3);
                if (a(eamv.ALLOW_NON_NUMERIC_NUMBERS)) {
                    if (true == z) {
                        d = Double.NEGATIVE_INFINITY;
                    }
                    return v(str, d);
                }
                throw l("Non-standard token '" + str + "': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
            } else if (i == 110) {
                String str2 = true != z ? "+Infinity" : "-Infinity";
                P(str2, 3);
                if (a(eamv.ALLOW_NON_NUMERIC_NUMBERS)) {
                    if (true == z) {
                        d = Double.NEGATIVE_INFINITY;
                    }
                    return v(str2, d);
                }
                throw l("Non-standard token '" + str2 + "': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
            }
        }
        x(i, "expected digit (0-9) to follow minus sign, for valid numeric value");
        return null;
    }

    protected final void P(String str, int i) {
        int i2;
        int i3;
        int length = str.length();
        do {
            if (this.e >= this.f && !o()) {
                D(" in a value");
            }
            if (this.E[this.e] != str.charAt(i)) {
                Z(str.substring(0, i));
            }
            i2 = this.e + 1;
            this.e = i2;
            i++;
        } while (i < length);
        if ((i2 < this.f || o()) && (i3 = this.E[this.e] & 255) >= 48 && i3 != 93 && i3 != 125 && Character.isJavaIdentifierPart((char) R(i3))) {
            this.e++;
            Z(str.substring(0, i));
        }
    }

    protected final char Q() {
        if (this.e >= this.f && !o()) {
            D(" in character escape sequence");
        }
        byte[] bArr = this.E;
        int i = this.e;
        this.e = i + 1;
        byte b = bArr[i];
        if (b == 34 || b == 47 || b == 92) {
            return (char) b;
        }
        if (b == 98) {
            return '\b';
        }
        if (b == 102) {
            return '\f';
        }
        if (b == 110) {
            return '\n';
        }
        if (b == 114) {
            return '\r';
        }
        if (b == 116) {
            return '\t';
        }
        if (b != 117) {
            char R = (char) R(b);
            J(R);
            return R;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            if (this.e >= this.f && !o()) {
                D(" in character escape sequence");
            }
            byte[] bArr2 = this.E;
            int i4 = this.e;
            this.e = i4 + 1;
            byte b2 = bArr2[i4];
            int a = eaoe.a(b2);
            if (a < 0) {
                C(b2, "expected a hex-digit for character escape sequence");
            }
            i2 = (i2 << 4) | a;
        }
        return (char) i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final int R(int r7) {
        /*
            r6 = this;
            if (r7 >= 0) goto L5e
            r0 = r7 & 224(0xe0, float:3.14E-43)
            r1 = 2
            r2 = 1
            r3 = 192(0xc0, float:2.69E-43)
            if (r0 != r3) goto Le
            r7 = r7 & 31
        Lc:
            r0 = 1
            goto L28
        Le:
            r0 = r7 & 240(0xf0, float:3.36E-43)
            r3 = 224(0xe0, float:3.14E-43)
            if (r0 != r3) goto L18
            r7 = r7 & 15
            r0 = 2
            goto L28
        L18:
            r0 = r7 & 248(0xf8, float:3.48E-43)
            r3 = 240(0xf0, float:3.36E-43)
            if (r0 != r3) goto L22
            r7 = r7 & 7
            r0 = 3
            goto L28
        L22:
            r0 = r7 & 255(0xff, float:3.57E-43)
            r6.V(r0)
            goto Lc
        L28:
            int r3 = r6.an()
            r4 = r3 & 192(0xc0, float:2.69E-43)
            r5 = 128(0x80, float:1.794E-43)
            if (r4 == r5) goto L35
            r6.W(r3)
        L35:
            int r7 = r7 << 6
            r3 = r3 & 63
            r7 = r7 | r3
            if (r0 <= r2) goto L5e
            int r2 = r6.an()
            r3 = r2 & 192(0xc0, float:2.69E-43)
            if (r3 == r5) goto L47
            r6.W(r2)
        L47:
            int r7 = r7 << 6
            r2 = r2 & 63
            r7 = r7 | r2
            if (r0 <= r1) goto L5e
            int r0 = r6.an()
            r1 = r0 & 192(0xc0, float:2.69E-43)
            if (r1 == r5) goto L59
            r6.W(r0)
        L59:
            int r7 = r7 << 6
            r0 = r0 & 63
            r7 = r7 | r0
        L5e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eanj.R(int):int");
    }

    protected final void S() {
        if (this.e < this.f || o()) {
            byte[] bArr = this.E;
            int i = this.e;
            if (bArr[i] == 10) {
                this.e = i + 1;
            }
        }
        this.h++;
        this.i = this.e;
    }

    protected final void T() {
        this.h++;
        this.i = this.e;
    }

    protected final void U(int i) {
        if (i < 32) {
            F(i);
        }
        V(i);
    }

    protected final void V(int i) {
        throw l("Invalid UTF-8 start byte 0x" + Integer.toHexString(i));
    }

    protected final void W(int i) {
        throw l("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i));
    }

    protected final void X(int i, int i2) {
        this.e = i2;
        W(i);
    }

    protected final void Z(String str) {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this.e >= this.f && !o()) {
                break;
            }
            byte[] bArr = this.E;
            int i = this.e;
            this.e = i + 1;
            char R = (char) R(bArr[i]);
            if (!Character.isJavaIdentifierPart(R)) {
                break;
            }
            this.e++;
            sb.append(R);
        }
        throw l("Unrecognized token '" + sb.toString() + "': was expecting 'null', 'true', 'false' or NaN");
    }

    /* JADX WARN: Removed duplicated region for block: B:301:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x05f3  */
    @Override // defpackage.eane, defpackage.eamw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eamz b() {
        /*
            Method dump skipped, instructions count: 1682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eanj.b():eamz");
    }

    @Override // defpackage.eand, defpackage.eamw, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        eant eantVar;
        super.close();
        eant eantVar2 = this.A;
        if (eantVar2.k || (eantVar = eantVar2.a) == null) {
            return;
        }
        eantVar.a(eantVar2);
        eantVar2.k = true;
        eantVar2.l = true;
        eantVar2.m = true;
    }

    @Override // defpackage.eane, defpackage.eamw
    public final String e() {
        eamz eamzVar = this.b;
        if (eamzVar != eamz.VALUE_STRING) {
            if (eamzVar == null) {
                return null;
            }
            int ordinal = eamzVar.ordinal();
            if (ordinal == 5) {
                return this.l.f;
            }
            return (ordinal == 7 || ordinal == 8 || ordinal == 9) ? this.n.g() : eamzVar.n;
        }
        if (this.C) {
            this.C = false;
            int i = this.e;
            if (i >= this.f) {
                n();
                i = this.e;
            }
            char[] j = this.n.j();
            int[] iArr = F;
            int min = Math.min(this.f, j.length + i);
            byte[] bArr = this.E;
            int i2 = 0;
            while (true) {
                if (i >= min) {
                    break;
                }
                int i3 = bArr[i] & 255;
                if (iArr[i3] == 0) {
                    i++;
                    j[i2] = (char) i3;
                    i2++;
                } else if (i3 == 34) {
                    this.e = i + 1;
                    this.n.i = i2;
                }
            }
            this.e = i;
            int[] iArr2 = F;
            byte[] bArr2 = this.E;
            while (true) {
                int i4 = this.e;
                if (i4 >= this.f) {
                    n();
                    i4 = this.e;
                }
                if (i2 >= j.length) {
                    j = this.n.k();
                    i2 = 0;
                }
                int min2 = Math.min(this.f, (j.length - i2) + i4);
                while (true) {
                    if (i4 >= min2) {
                        this.e = i4;
                        break;
                    }
                    int i5 = i4 + 1;
                    int i6 = bArr2[i4] & 255;
                    int i7 = iArr2[i6];
                    if (i7 != 0) {
                        this.e = i5;
                        if (i6 == 34) {
                            break;
                        }
                        if (i7 == 1) {
                            i6 = Q();
                        } else if (i7 == 2) {
                            i6 = aj(i6);
                        } else if (i7 == 3) {
                            i6 = this.f - i5 >= 2 ? al(i6) : ak(i6);
                        } else if (i7 == 4) {
                            int am = am(i6);
                            int i8 = i2 + 1;
                            j[i2] = (char) ((am >> 10) | 55296);
                            if (i8 >= j.length) {
                                j = this.n.k();
                                i2 = 0;
                            } else {
                                i2 = i8;
                            }
                            i6 = (am & 1023) | 56320;
                        } else if (i6 < 32) {
                            G(i6, "string value");
                        } else {
                            U(i6);
                        }
                        if (i2 >= j.length) {
                            j = this.n.k();
                            i2 = 0;
                        }
                        j[i2] = (char) i6;
                        i2++;
                    } else {
                        j[i2] = (char) i6;
                        i4 = i5;
                        i2++;
                    }
                }
            }
            this.n.i = i2;
        }
        return this.n.g();
    }

    @Override // defpackage.eand
    protected final boolean o() {
        long j = this.g;
        int i = this.f;
        this.g = j + i;
        this.i -= i;
        InputStream inputStream = this.D;
        if (inputStream != null) {
            byte[] bArr = this.E;
            int read = inputStream.read(bArr, 0, bArr.length);
            if (read > 0) {
                this.e = 0;
                this.f = read;
                return true;
            }
            p();
            if (read == 0) {
                throw new IOException("InputStream.read() returned 0 characters when trying to read " + this.E.length + " bytes");
            }
        }
        return false;
    }

    @Override // defpackage.eand
    protected final void p() {
        if (this.D != null) {
            if (this.c.c || a(eamv.AUTO_CLOSE_SOURCE)) {
                this.D.close();
            }
            this.D = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.eand
    public final void q() {
        super.q();
        byte[] bArr = this.E;
        if (bArr != null) {
            this.E = null;
            this.c.c(bArr);
        }
    }
}
