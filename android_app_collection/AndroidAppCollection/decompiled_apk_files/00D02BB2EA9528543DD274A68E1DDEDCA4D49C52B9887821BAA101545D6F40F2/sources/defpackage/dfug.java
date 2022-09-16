package defpackage;
/* compiled from: PG */
/* renamed from: dfug  reason: default package */
/* loaded from: classes6.dex */
public final class dfug {
    private static final double[] a = new double[3];

    public static float a(float f, float f2) {
        double d = f2;
        double tan = Math.tan(Math.toRadians(f) / 2.0d);
        Double.isNaN(d);
        double atan = Math.atan(d * tan);
        return (float) Math.toDegrees(atan + atan);
    }

    public static double b(double d, double d2, double d3, double d4, double d5, double d6) {
        g(d, d2, d3);
        double[] dArr = a;
        double d7 = dArr[0];
        double d8 = dArr[1];
        double d9 = dArr[2];
        g(d4, d5, d6);
        double d10 = d7 - dArr[0];
        double d11 = d8 - dArr[1];
        double d12 = d9 - dArr[2];
        return Math.sqrt((d10 * d10) + (d11 * d11) + (d12 * d12));
    }

    public static double c(dhjz dhjzVar, dhjz dhjzVar2) {
        return b(dhjzVar.b, dhjzVar.c, dhjzVar.d, dhjzVar2.b, dhjzVar2.c, dhjzVar2.d);
    }

    public static float d(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static float e(float f) {
        if (f < dcyn.a) {
            f = (f % 360.0f) + 360.0f;
        }
        return f % 360.0f;
    }

    public static float f(float f, float f2) {
        float e = e(f2) - e(f);
        return e > 180.0f ? e - 360.0f : e <= -180.0f ? e + 360.0f : e;
    }

    public static void g(double d, double d2, double d3) {
        double radians = Math.toRadians(d);
        double radians2 = Math.toRadians(d2);
        double d4 = d3 + 6371010.0d;
        double cos = Math.cos(radians2) * d4;
        double[] dArr = a;
        dArr[0] = Math.cos(radians) * cos;
        dArr[1] = cos * Math.sin(radians);
        dArr[2] = d4 * Math.sin(radians2);
    }
}
