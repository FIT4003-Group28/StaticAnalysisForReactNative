package defpackage;
/* compiled from: PG */
/* renamed from: anlt  reason: default package */
/* loaded from: classes.dex */
final class anlt {
    static final int a;
    private static final int b;
    private static final int c;
    private static final int d;
    private static final int e;
    private static final int f;
    private static final int g;
    private static final int h;
    private static final int i;
    private static final int j;

    static {
        int i2 = true != Boolean.parseBoolean(System.getProperty("BROTLI_32_BIT_CPU")) ? 6 : 5;
        b = i2;
        c = Boolean.parseBoolean(System.getProperty("BROTLI_ENABLE_ASSERTS")) ? 1 : 0;
        int i3 = 1 << i2;
        a = i3;
        int i4 = i3 >> 3;
        d = i4;
        e = i3 >> 1;
        int i5 = i4 >> 1;
        f = i5;
        g = 4096 / i5;
        h = 4160 / i5;
        i = 4060 / i5;
        j = i2 - 4;
    }

    static int a(anma anmaVar) {
        int i2 = g;
        if (anmaVar.w != 0) {
            i2 = (anmaVar.v + (f - 1)) >> j;
        }
        return i2 - anmaVar.u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(anma anmaVar) {
        if (a == 64) {
            return (int) (anmaVar.p >>> anmaVar.t);
        }
        return anmaVar.s >>> anmaVar.t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(anma anmaVar, int i2) {
        if (e >= 24) {
            return d(anmaVar, i2);
        }
        if (i2 <= 16) {
            return d(anmaVar, i2);
        }
        int d2 = d(anmaVar, 16);
        h(anmaVar);
        return (d(anmaVar, i2 - 16) << 16) | d2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(anma anmaVar, int i2) {
        int b2 = b(anmaVar);
        anmaVar.t += i2;
        return ((1 << i2) - 1) & b2;
    }

    static void e(anma anmaVar) {
        if (anmaVar.t <= a) {
            return;
        }
        int i2 = anmaVar.t;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Accumulator underloaded: ");
        sb.append(i2);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(anma anmaVar, int i2) {
        if (anmaVar.w == 0) {
            return;
        }
        int i3 = ((anmaVar.u << j) + ((anmaVar.t + 7) >> 3)) - d;
        int i4 = anmaVar.v;
        if (i3 > i4) {
            throw new anlv("Read after end");
        }
        if (i2 != 0 && i3 != i4) {
            throw new anlv("Unused bytes after end");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(anma anmaVar, byte[] bArr, int i2, int i3) {
        if ((anmaVar.t & 7) == 0) {
            while (anmaVar.t != a && i3 != 0) {
                bArr[i2] = (byte) b(anmaVar);
                anmaVar.t += 8;
                i3--;
                i2++;
            }
            if (i3 == 0) {
                return;
            }
            int a2 = a(anmaVar);
            int i4 = j;
            int min = Math.min(a2, i3 >> i4);
            if (min > 0) {
                int i5 = min << i4;
                System.arraycopy(anmaVar.g, anmaVar.u << i4, bArr, i2, i5);
                i2 += i5;
                i3 -= i5;
                anmaVar.u += min;
            }
            if (i3 == 0) {
                return;
            }
            if (a(anmaVar) <= 0) {
                while (i3 > 0) {
                    int a3 = anmd.a(anmaVar.ap, bArr, i2, i3);
                    if (a3 == -1) {
                        throw new anlv("Unexpected end of input");
                    }
                    i2 += a3;
                    i3 -= a3;
                }
                return;
            }
            i(anmaVar);
            while (i3 != 0) {
                bArr[i2] = (byte) b(anmaVar);
                anmaVar.t += 8;
                i3--;
                i2++;
            }
            f(anmaVar, 0);
            return;
        }
        throw new anlv("Unaligned copyBytes");
    }

    static void h(anma anmaVar) {
        int i2;
        if (c != 0) {
            e(anmaVar);
        }
        if (a == 64) {
            int[] iArr = anmaVar.i;
            anmaVar.u = anmaVar.u + 1;
            int i3 = e;
            anmaVar.p = (iArr[i2] << i3) | (anmaVar.p >>> i3);
        } else {
            short[] sArr = anmaVar.h;
            int i4 = anmaVar.u;
            anmaVar.u = i4 + 1;
            short s = sArr[i4];
            int i5 = e;
            anmaVar.s = (s << i5) | (anmaVar.s >>> i5);
        }
        anmaVar.t -= e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(anma anmaVar) {
        int i2;
        if (c != 0) {
            e(anmaVar);
        }
        int i3 = anmaVar.t;
        int i4 = e;
        if (i3 >= i4) {
            if (a == 64) {
                int[] iArr = anmaVar.i;
                anmaVar.u = anmaVar.u + 1;
                anmaVar.p = (iArr[i2] << i4) | (anmaVar.p >>> i4);
            } else {
                short[] sArr = anmaVar.h;
                int i5 = anmaVar.u;
                anmaVar.u = i5 + 1;
                anmaVar.s = (sArr[i5] << i4) | (anmaVar.s >>> i4);
            }
            anmaVar.t -= i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j(anma anmaVar) {
        anmaVar.g = new byte[4160];
        int i2 = a;
        if (i2 == 64) {
            anmaVar.p = 0L;
            anmaVar.i = new int[h];
        } else {
            anmaVar.s = 0;
            anmaVar.h = new short[h];
        }
        anmaVar.t = i2;
        anmaVar.u = g;
        anmaVar.w = 0;
        n(anmaVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void k(anma anmaVar) {
        int i2 = (a - anmaVar.t) & 7;
        if (i2 == 0 || d(anmaVar, i2) == 0) {
            return;
        }
        throw new anlv("Corrupted padding bits");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void l(anma anmaVar) {
        if (anmaVar.u > i) {
            if (anmaVar.w != 0) {
                if (a(anmaVar) < -2) {
                    throw new anlv("No more input");
                }
                return;
            }
            int i2 = anmaVar.u << j;
            int i3 = 4096 - i2;
            int i4 = 0;
            anmd.b(anmaVar.g, 0, i2, 4096);
            anmaVar.u = 0;
            while (true) {
                if (i3 >= 4096) {
                    break;
                }
                int a2 = anmd.a(anmaVar.ap, anmaVar.g, i3, 4096 - i3);
                if (a2 <= 0) {
                    anmaVar.w = 1;
                    anmaVar.v = i3;
                    i3 += f - 1;
                    break;
                }
                i3 += a2;
            }
            byte[] bArr = anmaVar.g;
            int i5 = i3 >> j;
            if (a == 64) {
                int[] iArr = anmaVar.i;
                while (i4 < i5) {
                    int i6 = i4 * 4;
                    iArr[i4] = ((bArr[i6 + 3] & 255) << 24) | (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16);
                    i4++;
                }
                return;
            }
            short[] sArr = anmaVar.h;
            while (i4 < i5) {
                int i7 = i4 + i4;
                sArr[i4] = (short) (((bArr[i7 + 1] & 255) << 8) | (bArr[i7] & 255));
                i4++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void m(anma anmaVar) {
        if (anmaVar.t == a) {
            n(anmaVar);
        }
    }

    private static void n(anma anmaVar) {
        l(anmaVar);
        f(anmaVar, 0);
        h(anmaVar);
        h(anmaVar);
    }
}
