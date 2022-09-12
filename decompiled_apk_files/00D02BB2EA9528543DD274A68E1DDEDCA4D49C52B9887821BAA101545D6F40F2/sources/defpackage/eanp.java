package defpackage;
/* compiled from: PG */
/* renamed from: eanp  reason: default package */
/* loaded from: classes6.dex */
public final class eanp {
    static final String a = "-9223372036854775808";
    static final char[] b = new char[4000];
    static final char[] c = new char[4000];
    static final byte[] d;
    private static int e = 1000000;
    private static int f = 1000000000;
    private static long g = 10000000000L;
    private static long h = 1000;
    private static long i = -2147483648L;
    private static long j = 2147483647L;

    static {
        char c2;
        int i2 = 0;
        int i3 = 0;
        while (i2 < 10) {
            char c3 = (char) (i2 + 48);
            char c4 = i2 == 0 ? (char) 0 : c3;
            int i4 = 0;
            while (i4 < 10) {
                char c5 = (char) (i4 + 48);
                if (i2 == 0 && i4 == 0) {
                    i4 = 0;
                    c2 = 0;
                } else {
                    c2 = c5;
                }
                for (int i5 = 0; i5 < 10; i5++) {
                    char c6 = (char) (i5 + 48);
                    char[] cArr = b;
                    cArr[i3] = c4;
                    int i6 = i3 + 1;
                    cArr[i6] = c2;
                    int i7 = i3 + 2;
                    cArr[i7] = c6;
                    char[] cArr2 = c;
                    cArr2[i3] = c3;
                    cArr2[i6] = c5;
                    cArr2[i7] = c6;
                    i3 += 4;
                }
                i4++;
            }
            i2++;
        }
        d = new byte[4000];
        for (int i8 = 0; i8 < 4000; i8++) {
            d[i8] = (byte) c[i8];
        }
    }

    public static int a(int i2, char[] cArr, int i3) {
        int i4;
        int e2;
        int i5;
        if (i2 < 0) {
            if (i2 == Integer.MIN_VALUE) {
                return c(-2147483648L, cArr, i3);
            }
            cArr[i3] = '-';
            i2 = -i2;
            i3++;
        }
        if (i2 < e) {
            if (i2 >= 1000) {
                int i6 = i2 / 1000;
                return g(i2 - (i6 * 1000), cArr, e(i6, cArr, i3));
            } else if (i2 < 10) {
                int i7 = i3 + 1;
                cArr[i3] = (char) (i2 + 48);
                return i7;
            } else {
                return e(i2, cArr, i3);
            }
        }
        int i8 = f;
        if (i2 >= i8) {
            i4 = i2 - i8;
            if (i4 >= i8) {
                i4 -= i8;
                i5 = i3 + 1;
                cArr[i3] = '2';
            } else {
                i5 = i3 + 1;
                cArr[i3] = '1';
            }
            i3 = i5;
        } else {
            i4 = i2;
        }
        int i9 = i4 / 1000;
        int i10 = i4 - (i9 * 1000);
        int i11 = i9 / 1000;
        int i12 = i9 - (i11 * 1000);
        if (i2 >= i8) {
            e2 = g(i11, cArr, i3);
        } else {
            e2 = e(i11, cArr, i3);
        }
        return g(i10, cArr, g(i12, cArr, e2));
    }

    public static int b(int i2, byte[] bArr, int i3) {
        int i4;
        int f2;
        int i5;
        if (i2 < 0) {
            if (i2 == Integer.MIN_VALUE) {
                return d(-2147483648L, bArr, i3);
            }
            bArr[i3] = 45;
            i2 = -i2;
            i3++;
        }
        if (i2 < e) {
            if (i2 >= 1000) {
                int i6 = i2 / 1000;
                return h(i2 - (i6 * 1000), bArr, f(i6, bArr, i3));
            } else if (i2 < 10) {
                int i7 = i3 + 1;
                bArr[i3] = (byte) (i2 + 48);
                return i7;
            } else {
                return f(i2, bArr, i3);
            }
        }
        int i8 = f;
        if (i2 >= i8) {
            i4 = i2 - i8;
            if (i4 >= i8) {
                i4 -= i8;
                i5 = i3 + 1;
                bArr[i3] = 50;
            } else {
                i5 = i3 + 1;
                bArr[i3] = 49;
            }
            i3 = i5;
        } else {
            i4 = i2;
        }
        int i9 = i4 / 1000;
        int i10 = i4 - (i9 * 1000);
        int i11 = i9 / 1000;
        int i12 = i9 - (i11 * 1000);
        if (i2 >= i8) {
            f2 = h(i11, bArr, i3);
        } else {
            f2 = f(i11, bArr, i3);
        }
        return h(i10, bArr, h(i12, bArr, f2));
    }

    public static int c(long j2, char[] cArr, int i2) {
        if (j2 < 0) {
            if (j2 > i) {
                return a((int) j2, cArr, i2);
            }
            if (j2 == Long.MIN_VALUE) {
                String str = a;
                int length = str.length();
                str.getChars(0, length, cArr, i2);
                return i2 + length;
            }
            cArr[i2] = '-';
            j2 = -j2;
            i2++;
        } else if (j2 <= j) {
            return a((int) j2, cArr, i2);
        }
        int i3 = i(j2) + i2;
        int i4 = i3;
        while (j2 > j) {
            i4 -= 3;
            long j3 = h;
            long j4 = j2 / j3;
            g((int) (j2 - (j3 * j4)), cArr, i4);
            j2 = j4;
        }
        int i5 = (int) j2;
        while (i5 >= 1000) {
            i4 -= 3;
            int i6 = i5 / 1000;
            g(i5 - (i6 * 1000), cArr, i4);
            i5 = i6;
        }
        e(i5, cArr, i2);
        return i3;
    }

    public static int d(long j2, byte[] bArr, int i2) {
        if (j2 < 0) {
            if (j2 > i) {
                return b((int) j2, bArr, i2);
            }
            if (j2 == Long.MIN_VALUE) {
                int length = a.length();
                int i3 = 0;
                while (i3 < length) {
                    bArr[i2] = (byte) a.charAt(i3);
                    i3++;
                    i2++;
                }
                return i2;
            }
            bArr[i2] = 45;
            j2 = -j2;
            i2++;
        } else if (j2 <= j) {
            return b((int) j2, bArr, i2);
        }
        int i4 = i(j2) + i2;
        int i5 = i4;
        while (j2 > j) {
            i5 -= 3;
            long j3 = h;
            long j4 = j2 / j3;
            h((int) (j2 - (j3 * j4)), bArr, i5);
            j2 = j4;
        }
        int i6 = (int) j2;
        while (i6 >= 1000) {
            i5 -= 3;
            int i7 = i6 / 1000;
            h(i6 - (i7 * 1000), bArr, i5);
            i6 = i7;
        }
        f(i6, bArr, i2);
        return i4;
    }

    private static int e(int i2, char[] cArr, int i3) {
        int i4 = i2 << 2;
        int i5 = i4 + 1;
        char[] cArr2 = b;
        char c2 = cArr2[i4];
        if (c2 != 0) {
            cArr[i3] = c2;
            i3++;
        }
        int i6 = i5 + 1;
        char c3 = cArr2[i5];
        if (c3 != 0) {
            cArr[i3] = c3;
            i3++;
        }
        cArr[i3] = cArr2[i6];
        return i3 + 1;
    }

    private static int f(int i2, byte[] bArr, int i3) {
        int i4 = i2 << 2;
        int i5 = i4 + 1;
        char[] cArr = b;
        char c2 = cArr[i4];
        if (c2 != 0) {
            bArr[i3] = (byte) c2;
            i3++;
        }
        int i6 = i5 + 1;
        char c3 = cArr[i5];
        if (c3 != 0) {
            bArr[i3] = (byte) c3;
            i3++;
        }
        bArr[i3] = (byte) cArr[i6];
        return i3 + 1;
    }

    private static int g(int i2, char[] cArr, int i3) {
        int i4 = i2 << 2;
        int i5 = i3 + 1;
        int i6 = i4 + 1;
        char[] cArr2 = c;
        cArr[i3] = cArr2[i4];
        int i7 = i5 + 1;
        cArr[i5] = cArr2[i6];
        cArr[i7] = cArr2[i6 + 1];
        return i7 + 1;
    }

    private static int h(int i2, byte[] bArr, int i3) {
        int i4 = i2 << 2;
        int i5 = i3 + 1;
        int i6 = i4 + 1;
        byte[] bArr2 = d;
        bArr[i3] = bArr2[i4];
        int i7 = i5 + 1;
        bArr[i5] = bArr2[i6];
        bArr[i7] = bArr2[i6 + 1];
        return i7 + 1;
    }

    private static int i(long j2) {
        int i2 = 10;
        for (long j3 = g; j2 >= j3 && i2 != 19; j3 = j3 + j3 + (j3 << 3)) {
            i2++;
        }
        return i2;
    }
}
