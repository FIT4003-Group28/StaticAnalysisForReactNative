package defpackage;
/* compiled from: PG */
/* renamed from: decu  reason: default package */
/* loaded from: classes6.dex */
public final class decu {
    public static long a(long j) {
        return j ^ Long.MIN_VALUE;
    }

    public static int b(long j, long j2) {
        return decn.b(a(j), a(j2));
    }

    public static long c(long j, long j2) {
        if (j2 < 0) {
            return b(j, j2) < 0 ? 0L : 1L;
        } else if (j >= 0) {
            return j / j2;
        } else {
            int i = 1;
            long j3 = (j >>> 1) / j2;
            long j4 = j3 + j3;
            if (b(j - (j4 * j2), j2) < 0) {
                i = 0;
            }
            return j4 + i;
        }
    }

    public static long d(String str) {
        return e(str, 10);
    }

    public static long e(String str, int i) {
        dbsk.s(str);
        if (str.length() == 0) {
            throw new NumberFormatException("empty string");
        }
        int i2 = dect.c[i] - 1;
        long j = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            int digit = Character.digit(str.charAt(i3), i);
            if (digit != -1) {
                if (i3 > i2 && dect.a(j, digit, i)) {
                    String valueOf = String.valueOf(str);
                    throw new NumberFormatException(valueOf.length() != 0 ? "Too large for unsigned long: ".concat(valueOf) : new String("Too large for unsigned long: "));
                }
                j = (j * i) + digit;
            } else {
                throw new NumberFormatException(str);
            }
        }
        return j;
    }

    public static String f(long j) {
        return g(j, 10);
    }

    public static String g(long j, int i) {
        long c;
        dbsk.e(true, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", i);
        if (j == 0) {
            return "0";
        }
        if (j > 0) {
            return Long.toString(j, i);
        }
        int i2 = 64;
        char[] cArr = new char[64];
        int i3 = i - 1;
        if ((i & i3) == 0) {
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i);
            do {
                i2--;
                cArr[i2] = Character.forDigit(((int) j) & i3, i);
                j >>>= numberOfTrailingZeros;
            } while (j != 0);
        } else {
            if ((i & 1) != 0) {
                c = c(j, i);
            } else {
                c = (j >>> 1) / (i >>> 1);
            }
            long j2 = i;
            cArr[63] = Character.forDigit((int) (j - (c * j2)), i);
            i2 = 63;
            while (c > 0) {
                i2--;
                cArr[i2] = Character.forDigit((int) (c % j2), i);
                c /= j2;
            }
        }
        return new String(cArr, i2, 64 - i2);
    }
}
