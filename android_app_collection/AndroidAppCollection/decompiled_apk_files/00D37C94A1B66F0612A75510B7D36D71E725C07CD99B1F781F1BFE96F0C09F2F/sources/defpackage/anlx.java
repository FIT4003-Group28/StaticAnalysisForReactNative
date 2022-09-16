package defpackage;

import java.io.InputStream;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: anlx  reason: default package */
/* loaded from: classes.dex */
final class anlx {
    static final short[] f;
    static final int[] a = {256, 402, 436, 468, 500, 534, 566, 598, 630, 662, 694, 726, 758, 790, 822, 854, 886, 920, 952, 984, 1016, 1048, 1080};
    private static final int[] g = {1, 2, 3, 4, 0, 5, 17, 6, 16, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    private static final int[] h = {0, 3, 2, 1, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 3, 3};
    private static final int[] i = {0, 0, 0, 0, -1, 1, -2, 2, -3, 3, -1, 1, -2, 2, -3, 3};
    private static final int[] j = {131072, 131076, 131075, 196610, 131072, 131076, 131075, 262145, 131072, 131076, 131075, 196610, 131072, 131076, 131075, 262149};
    static final int[] b = {1, 5, 9, 13, 17, 25, 33, 41, 49, 65, 81, 97, 113, 145, 177, 209, 241, 305, 369, 497, 753, 1265, 2289, 4337, 8433, 16625};
    static final int[] c = {2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 7, 8, 9, 10, 11, 12, 13, 24};
    static final short[] d = {0, 0, 0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 9, 10, 12, 14, 24};
    static final short[] e = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 9, 10, 24};

    static {
        int i2;
        short[] sArr = new short[2816];
        f = sArr;
        short[] sArr2 = new short[24];
        short[] sArr3 = new short[24];
        sArr3[0] = 2;
        int i3 = 0;
        while (i3 < 23) {
            int i4 = i3 + 1;
            sArr2[i4] = (short) (sArr2[i3] + (1 << d[i3]));
            sArr3[i4] = (short) (sArr3[i3] + (1 << e[i3]));
            i3 = i4;
        }
        for (int i5 = 0; i5 < 704; i5++) {
            int i6 = i5 >>> 6;
            if (i6 >= 2) {
                i6 -= 2;
                i2 = 0;
            } else {
                i2 = -4;
            }
            int i7 = i6 + i6;
            int i8 = (((170064 >>> i7) & 3) << 3) | ((i5 >>> 3) & 7);
            int i9 = (((156228 >>> i7) & 3) << 3) | (i5 & 7);
            short s = sArr3[i9];
            int i10 = s > 4 ? 3 : s - 2;
            int i11 = i5 * 4;
            sArr[i11] = (short) (d[i8] | (e[i9] << 8));
            sArr[i11 + 1] = sArr2[i8];
            sArr[i11 + 2] = sArr3[i9];
            sArr[i11 + 3] = (short) (i2 + i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(anma anmaVar) {
        int i2 = anmaVar.q;
        if (i2 != 0) {
            if (i2 == 11) {
                return;
            }
            anmaVar.q = 11;
            InputStream inputStream = anmaVar.ap;
            if (inputStream == null) {
                return;
            }
            inputStream.close();
            anmaVar.ap = null;
            return;
        }
        throw new IllegalStateException("State MUST be initialized");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
        if (r12 > 30) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:145:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03b1 A[LOOP:4: B:153:0x03b1->B:159:0x03e2, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x053f A[LOOP:2: B:219:0x053d->B:220:0x053f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x059c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(defpackage.anma r27) {
        /*
            Method dump skipped, instructions count: 1870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anlx.b(anma):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(anma anmaVar, InputStream inputStream) {
        if (anmaVar.q != 0) {
            throw new IllegalStateException("State MUST be uninitialized");
        }
        anmaVar.k = new int[3091];
        anmaVar.k[0] = 7;
        anmaVar.f76J = 3;
        int p = p(3, 120);
        anmaVar.e = new byte[p];
        anmaVar.o = new int[p];
        anmaVar.ap = inputStream;
        anlt.j(anmaVar);
        anmaVar.q = 1;
    }

    private static int d(int i2, int i3, int i4) {
        int i5 = i4 << i2;
        return i3 + 16 + i5 + i5;
    }

    private static int e(anma anmaVar) {
        int i2 = anmaVar.aa;
        int i3 = anmaVar.ah;
        return i2;
    }

    private static int f(anma anmaVar, int i2, int i3) {
        int[] iArr = anmaVar.j;
        int i4 = i2 + i2;
        int i5 = i4 + 4;
        anlt.i(anmaVar);
        int m = m(anmaVar.k, i4, anmaVar);
        int j2 = j(anmaVar.k, i4 + 1, anmaVar);
        int i6 = m == 1 ? iArr[i5 + 1] + 1 : m == 0 ? iArr[i5] : m - 2;
        if (i6 >= i3) {
            i6 -= i3;
        }
        int i7 = i5 + 1;
        iArr[i5] = iArr[i7];
        iArr[i7] = i6;
        return j2;
    }

    private static int g(int i2, byte[] bArr, anma anmaVar) {
        anlt.l(anmaVar);
        int h2 = h(anmaVar) + 1;
        if (h2 == 1) {
            int i3 = 0;
            while (i3 < i2) {
                int min = Math.min(i3 + 1024, i2) - i3;
                System.arraycopy(anmd.a, 0, bArr, i3, min);
                i3 += min;
            }
            return 1;
        }
        anlt.i(anmaVar);
        int d2 = anlt.d(anmaVar, 1) != 0 ? anlt.d(anmaVar, 4) + 1 : 0;
        int i4 = h2 + d2;
        int i5 = a[(i4 + 31) >> 5] + 1;
        int[] iArr = new int[i5];
        int i6 = i5 - 1;
        k(i4, i4, iArr, i6, anmaVar);
        int i7 = 0;
        while (i7 < i2) {
            anlt.l(anmaVar);
            anlt.i(anmaVar);
            int m = m(iArr, i6, anmaVar);
            if (m == 0) {
                bArr[i7] = 0;
            } else if (m <= d2) {
                anlt.i(anmaVar);
                for (int d3 = (1 << m) + anlt.d(anmaVar, m); d3 != 0; d3--) {
                    if (i7 < i2) {
                        bArr[i7] = 0;
                        i7++;
                    } else {
                        throw new anlv("Corrupted context map");
                    }
                }
                continue;
            } else {
                bArr[i7] = (byte) (m - d2);
            }
            i7++;
        }
        anlt.i(anmaVar);
        if (anlt.d(anmaVar, 1) == 1) {
            int[] iArr2 = new int[256];
            for (int i8 = 0; i8 < 256; i8++) {
                iArr2[i8] = i8;
            }
            for (int i9 = 0; i9 < i2; i9++) {
                int i10 = bArr[i9] & 255;
                int i11 = iArr2[i10];
                bArr[i9] = (byte) i11;
                if (i10 != 0) {
                    while (i10 > 0) {
                        int i12 = i10 - 1;
                        iArr2[i10] = iArr2[i12];
                        i10 = i12;
                    }
                    iArr2[0] = i11;
                }
            }
        }
        return h2;
    }

    private static int h(anma anmaVar) {
        anlt.i(anmaVar);
        if (anlt.d(anmaVar, 1) != 0) {
            int d2 = anlt.d(anmaVar, 3);
            if (d2 != 0) {
                return anlt.d(anmaVar, d2) + (1 << d2);
            }
            return 1;
        }
        return 0;
    }

    private static int i(int i2) {
        int i3 = -1;
        for (int i4 = 16; i4 > 0; i4 >>= 1) {
            int i5 = i2 >>> i4;
            if (i5 != 0) {
                i3 += i4;
                i2 = i5;
            }
        }
        return i3 + i2;
    }

    private static int j(int[] iArr, int i2, anma anmaVar) {
        anlt.i(anmaVar);
        int m = m(iArr, i2, anmaVar);
        int i3 = c[m];
        anlt.i(anmaVar);
        return b[m] + anlt.c(anmaVar, i3);
    }

    private static int k(int i2, int i3, int[] iArr, int i4, anma anmaVar) {
        anlt.l(anmaVar);
        anlt.i(anmaVar);
        int d2 = anlt.d(anmaVar, 2);
        if (d2 != 1) {
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[18];
            int i5 = 0;
            int i6 = 32;
            for (int i7 = d2; i7 < 18 && i6 > 0; i7++) {
                int i8 = g[i7];
                anlt.i(anmaVar);
                int b2 = anlt.b(anmaVar) & 15;
                int i9 = anmaVar.t;
                int[] iArr4 = j;
                anmaVar.t = i9 + (iArr4[b2] >> 16);
                char c2 = (char) iArr4[b2];
                iArr3[i8] = c2;
                if (c2 != 0) {
                    i6 -= ' ' >> c2;
                    i5++;
                }
            }
            if (i6 == 0 || i5 == 1) {
                int[] iArr5 = new int[33];
                anlz.b(iArr5, 32, 5, iArr3, 18);
                int i10 = 0;
                char c3 = '\b';
                char c4 = 0;
                int i11 = 0;
                int i12 = 32768;
                while (i10 < i3 && i12 > 0) {
                    anlt.l(anmaVar);
                    anlt.i(anmaVar);
                    int b3 = anlt.b(anmaVar);
                    int i13 = anmaVar.t;
                    int i14 = iArr5[b3 & 31];
                    anmaVar.t = i13 + (i14 >> 16);
                    char c5 = (char) i14;
                    if (c5 < 16) {
                        int i15 = i10 + 1;
                        iArr2[i10] = c5;
                        if (c5 != 0) {
                            i12 -= 32768 >> c5;
                            i10 = i15;
                            c3 = c5;
                        } else {
                            i10 = i15;
                        }
                        i11 = 0;
                    } else {
                        int i16 = c5 - 14;
                        char c6 = c5 == 16 ? c3 : (char) 0;
                        char c7 = c4 != c6 ? c6 : c4;
                        if (c4 != c6) {
                            i11 = 0;
                        }
                        int i17 = i11 > 0 ? (i11 - 2) << i16 : i11;
                        anlt.i(anmaVar);
                        int d3 = i17 + anlt.d(anmaVar, i16) + 3;
                        int i18 = d3 - i11;
                        if (i10 + i18 > i3) {
                            throw new anlv("symbol + repeatDelta > numSymbols");
                        }
                        int i19 = i10;
                        int i20 = 0;
                        while (i20 < i18) {
                            iArr2[i19] = c7;
                            i20++;
                            i19++;
                        }
                        if (c7 != 0) {
                            i12 -= i18 << (15 - c7);
                        }
                        i11 = d3;
                        i10 = i19;
                        c4 = c7;
                    }
                }
                if (i12 == 0) {
                    while (i10 < i3) {
                        int min = Math.min(i10 + 1024, i3) - i10;
                        System.arraycopy(anmd.b, 0, iArr2, i10, min);
                        i10 += min;
                    }
                    return anlz.b(iArr, i4, 8, iArr2, i3);
                }
                throw new anlv("Unused space");
            }
            throw new anlv("Corrupted Huffman code histogram");
        }
        int[] iArr6 = new int[i3];
        int[] iArr7 = new int[4];
        int i21 = i(i2 - 1) + 1;
        int d4 = anlt.d(anmaVar, 2) + 1;
        for (int i22 = 0; i22 < d4; i22++) {
            anlt.i(anmaVar);
            int d5 = anlt.d(anmaVar, i21);
            if (d5 < i3) {
                iArr7[i22] = d5;
            } else {
                throw new anlv("Can't readHuffmanCode");
            }
        }
        int i23 = 0;
        while (i23 < d4 - 1) {
            int i24 = i23 + 1;
            for (int i25 = i24; i25 < d4; i25++) {
                if (iArr7[i23] == iArr7[i25]) {
                    throw new anlv("Duplicate simple Huffman code symbol");
                }
            }
            i23 = i24;
        }
        if (d4 == 4) {
            d4 = anlt.d(anmaVar, 1) + 4;
        }
        if (d4 == 1) {
            iArr6[iArr7[0]] = 1;
        } else if (d4 == 2) {
            iArr6[iArr7[0]] = 1;
            iArr6[iArr7[1]] = 1;
        } else if (d4 == 3) {
            iArr6[iArr7[0]] = 1;
            iArr6[iArr7[1]] = 2;
            iArr6[iArr7[2]] = 2;
        } else if (d4 == 4) {
            iArr6[iArr7[0]] = 2;
            iArr6[iArr7[1]] = 2;
            iArr6[iArr7[2]] = 2;
            iArr6[iArr7[3]] = 2;
        } else if (d4 == 5) {
            iArr6[iArr7[0]] = 1;
            iArr6[iArr7[1]] = 2;
            iArr6[iArr7[2]] = 3;
            iArr6[iArr7[3]] = 3;
        }
        return anlz.b(iArr, i4, 8, iArr6, i3);
    }

    private static int l(anma anmaVar, int i2, int i3) {
        int[] iArr = anmaVar.k;
        int i4 = i2 + i2;
        int i5 = iArr[i4];
        if (i3 <= 1) {
            iArr[i4 + 1] = i5;
            iArr[i4 + 2] = i5;
            return 268435456;
        }
        int i6 = i3 + 2;
        int k = i5 + k(i6, i6, iArr, i4, anmaVar);
        int[] iArr2 = anmaVar.k;
        int i7 = i4 + 1;
        iArr2[i7] = k;
        int k2 = k(26, 26, iArr2, i7, anmaVar);
        int[] iArr3 = anmaVar.k;
        iArr3[i4 + 2] = k + k2;
        return j(iArr3, i7, anmaVar);
    }

    private static int m(int[] iArr, int i2, anma anmaVar) {
        int i3 = iArr[i2];
        int b2 = anlt.b(anmaVar);
        int i4 = i3 + (b2 & PrivateKeyType.INVALID);
        int i5 = iArr[i4];
        int i6 = i5 >> 16;
        char c2 = (char) i5;
        if (i6 <= 8) {
            anmaVar.t += i6;
            return c2;
        }
        int i7 = anmaVar.t;
        int i8 = iArr[i4 + c2 + ((b2 & ((1 << i6) - 1)) >>> 8)];
        anmaVar.t = i7 + (i8 >> 16) + 8;
        return (char) i8;
    }

    private static void n(anma anmaVar) {
        anmaVar.B = f(anmaVar, 0, anmaVar.C);
        int i2 = anmaVar.j[5];
        int i3 = i2 << 6;
        anmaVar.P = i3;
        anmaVar.L = anmaVar.c[i3] & 255;
        int i4 = anmaVar.b[i2] << 9;
        anmaVar.R = i4;
        anmaVar.S = i4 + 256;
    }

    private static int[] o(int i2, int i3, int i4, anma anmaVar) {
        int[] iArr = new int[(a[(i3 + 31) >> 5] * i4) + i4];
        int i5 = i4;
        for (int i6 = 0; i6 < i4; i6++) {
            iArr[i6] = i5;
            i5 += k(i2, i3, iArr, i6, anmaVar);
        }
        return iArr;
    }

    private static int p(int i2, int i3) {
        int i4;
        int i5;
        if ((2 << i2) + i3 <= 2147483644) {
            int i6 = (i(((2147483644 - i3) >> i2) + 4) - 1) - 1;
            return (((((i4 >> i5) & 1) | (i6 + i6)) - 1) << i2) + (1 << i2) + i3 + 16;
        }
        throw new IllegalArgumentException("maxDistance is too small");
    }
}
