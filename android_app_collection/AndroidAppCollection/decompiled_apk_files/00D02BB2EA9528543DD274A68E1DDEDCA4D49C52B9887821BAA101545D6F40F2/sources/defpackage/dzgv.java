package defpackage;
/* compiled from: PG */
/* renamed from: dzgv  reason: default package */
/* loaded from: classes.dex */
public final class dzgv {
    public static final int a(int i) {
        int i2 = i * (-1640531527);
        return i2 ^ (i2 >>> 16);
    }

    public static final long b(long j) {
        long j2 = j * (-7046029254386353131L);
        long j3 = j2 ^ (j2 >>> 32);
        return j3 ^ (j3 >>> 16);
    }

    public static final int c(double d) {
        long doubleToRawLongBits = Double.doubleToRawLongBits(d);
        return (int) (doubleToRawLongBits ^ (doubleToRawLongBits >>> 32));
    }

    public static final int d(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static long e(long j) {
        if (j == 0) {
            return 1L;
        }
        long j2 = j - 1;
        long j3 = j2 | (j2 >> 1);
        long j4 = j3 | (j3 >> 2);
        long j5 = j4 | (j4 >> 4);
        long j6 = j5 | (j5 >> 8);
        long j7 = j6 | (j6 >> 16);
        return (j7 | (j7 >> 32)) + 1;
    }

    public static int f(int i, float f) {
        return Math.min((int) Math.ceil(i * f), i - 1);
    }

    public static int g(int i, float f) {
        long max = Math.max(2L, e((long) Math.ceil(i / f)));
        if (max <= 1073741824) {
            return (int) max;
        }
        throw new IllegalArgumentException("Too large (" + i + " expected elements with load factor " + f + ")");
    }
}
