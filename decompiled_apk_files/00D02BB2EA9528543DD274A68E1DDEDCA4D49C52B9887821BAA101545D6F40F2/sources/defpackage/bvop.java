package defpackage;
/* compiled from: PG */
/* renamed from: bvop  reason: default package */
/* loaded from: classes.dex */
public final class bvop {
    private static final float a = (float) (1.0d / Math.log(2.0d));

    private bvop() {
    }

    public static float a(float f) {
        while (f < 0.0f) {
            f += 360.0f;
        }
        while (f >= 360.0f) {
            f -= 360.0f;
        }
        return f;
    }

    public static float b(float f) {
        return f >= 360.0f ? f - 360.0f : f < 0.0f ? f + 360.0f : f;
    }

    public static float c(float f) {
        return f >= 180.0f ? f - 360.0f : f < -180.0f ? f + 360.0f : f;
    }

    public static float d(float f) {
        return ((float) Math.log(f)) * a;
    }

    public static int e(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Greatest common divisor should be computed on numbers greater than zero.");
        }
        while (true) {
            int i3 = i2;
            int i4 = i;
            i = i3;
            if (i == 0) {
                return i4;
            }
            i2 = i4 % i;
        }
    }

    public static int f(int i, int i2) {
        while (i2 < i) {
            i2 += i2;
        }
        return i2;
    }

    public static boolean g(int i) {
        return (i & (i + (-1))) == 0;
    }

    public static float h(float f, float f2, float f3, float f4, float f5) {
        return f + ((f2 - f) * ((akn.a(f5, f3, f4) - f3) / (f4 - f3)));
    }

    public static long i(long j) {
        double d = j;
        Double.isNaN(d);
        return (long) Math.ceil(d / 1048576.0d);
    }

    public static int j(int i, int i2, int i3, int i4) {
        return (i & 255) | (i2 << 8) | ((i3 & 255) << 16) | ((i4 & 255) << 24);
    }

    public static long k(long j, long j2) {
        return Math.max(0L, Math.min(j, j2));
    }
}
