package defpackage;
/* compiled from: PG */
/* renamed from: akrb  reason: default package */
/* loaded from: classes.dex */
public final class akrb {
    public static int a(akra akraVar, akra akraVar2, akra akraVar3) {
        int i = akraVar3.a;
        int i2 = akraVar.a;
        int i3 = akraVar3.b;
        long j = ((i - i2) * (i3 - akraVar2.b)) - ((i3 - akraVar.b) * (i - akraVar2.a));
        return (int) ((j != 0 ? 1 : 0) | (j >> 63));
    }

    public static double b(akra akraVar, akra akraVar2, akra akraVar3, akra akraVar4) {
        int i = akraVar.b;
        int i2 = akraVar2.b;
        int i3 = akraVar2.a;
        int i4 = akraVar.a;
        int i5 = akraVar3.a;
        long j = i - i2;
        int i6 = akraVar3.b;
        long j2 = i3 - i4;
        double d = ((i4 - i5) * j) + ((i - i6) * j2);
        double d2 = ((akraVar4.a - i5) * j) + ((akraVar4.b - i6) * j2);
        Double.isNaN(d);
        Double.isNaN(d2);
        return d / d2;
    }

    public static boolean c(akra akraVar, akra akraVar2, akra akraVar3, akra akraVar4) {
        int i = akraVar2.a;
        int i2 = akraVar.a;
        int i3 = i - i2;
        int i4 = akraVar2.b;
        int i5 = akraVar.b;
        int i6 = i4 - i5;
        int i7 = akraVar4.a;
        int i8 = akraVar3.a;
        int i9 = i7 - i8;
        int i10 = akraVar4.b;
        int i11 = akraVar3.b;
        int i12 = i10 - i11;
        int i13 = i8 - i2;
        int i14 = i11 - i5;
        long j = i9;
        long j2 = i6;
        long j3 = i12;
        long j4 = i3;
        long j5 = (j * j2) - (j3 * j4);
        if (j5 == 0) {
            if (i13 == 0) {
                if (i14 == 0) {
                    return true;
                }
                i13 = 0;
            }
            if ((i13 * j2) - (i14 * j4) != 0) {
                return false;
            }
            if (i3 == 0 && i6 == 0) {
                return j(akraVar3, akraVar4, akraVar);
            }
            if (i9 == 0 && i12 == 0) {
                return j(akraVar, akraVar2, akraVar3);
            }
            return j(akraVar, akraVar2, akraVar3) || j(akraVar, akraVar2, akraVar4) || j(akraVar3, akraVar4, akraVar) || j(akraVar3, akraVar4, akraVar2);
        }
        long j6 = i14;
        double d = ((-i13) * j2) + (j4 * j6);
        double d2 = j5;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        if (d3 >= dcyn.a && d3 <= 1.0d) {
            double d4 = (i13 * j3) - (j6 * j);
            double d5 = -j5;
            Double.isNaN(d4);
            Double.isNaN(d5);
            double d6 = d4 / d5;
            if (d6 >= dcyn.a && d6 <= 1.0d) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(akra akraVar, akra akraVar2, akra akraVar3) {
        int i = akraVar.a;
        int i2 = akraVar.b;
        int i3 = akraVar2.a;
        int i4 = akraVar2.b;
        int i5 = akraVar3.a;
        int i6 = akraVar3.b;
        if (i2 > i6 || i4 > i6) {
            if (i5 >= i && i5 >= i3) {
                return false;
            }
            if (i5 < i && i5 < i3) {
                return false;
            }
            long j = (i5 - i) * (i4 - i2);
            long j2 = i6 - i2;
            return i3 >= i ? j > j2 * ((long) (i3 - i)) : j < j2 * ((long) (i3 - i));
        }
        return false;
    }

    public static float e(akra akraVar, akra akraVar2) {
        return f(akraVar2.a - akraVar.a, akraVar2.b - akraVar.b);
    }

    public static float f(double d, double d2) {
        float degrees = 90.0f - ((float) Math.toDegrees(Math.atan2(d2, d)));
        return degrees < 0.0f ? degrees + 360.0f : degrees;
    }

    public static float g(float f, float f2) {
        float abs = Math.abs(f - f2);
        return abs > 180.0f ? 360.0f - abs : abs;
    }

    public static float h(float f, float f2) {
        float f3 = f2 - f;
        while (f3 > 180.0f) {
            f3 -= 360.0f;
        }
        while (f3 < -180.0f) {
            f3 += 360.0f;
        }
        return f3;
    }

    public static void i(akra akraVar, akra akraVar2, akra akraVar3, akra akraVar4, akra akraVar5) {
        double d;
        int i = akraVar.b;
        int i2 = akraVar2.b;
        int i3 = akraVar2.a;
        int i4 = akraVar.a;
        int i5 = akraVar4.a;
        int i6 = akraVar3.a;
        long j = i - i2;
        int i7 = akraVar4.b;
        int i8 = akraVar3.b;
        long j2 = i3 - i4;
        long j3 = ((i5 - i6) * j) + ((i7 - i8) * j2);
        if (j3 != 0) {
            double d2 = ((i4 - i6) * j) + ((i - i8) * j2);
            double d3 = j3;
            Double.isNaN(d2);
            Double.isNaN(d3);
            d = d2 / d3;
        } else if (a(akraVar, akraVar2, akraVar3) == 0) {
            d = 0.0d;
        } else {
            d = a(akraVar, akraVar2, akraVar4) == 0 ? 1.0d : Double.NaN;
        }
        if (Double.isNaN(d) || d < dcyn.a || d > 1.0d) {
            return;
        }
        int i9 = akraVar3.a;
        double d4 = i9;
        double d5 = akraVar4.a - i9;
        Double.isNaN(d5);
        Double.isNaN(d4);
        akraVar5.a = (int) (d4 + (d5 * d));
        int i10 = akraVar3.b;
        double d6 = i10;
        double d7 = akraVar4.b - i10;
        Double.isNaN(d7);
        Double.isNaN(d6);
        akraVar5.b = (int) (d6 + (d7 * d));
    }

    private static boolean j(akra akraVar, akra akraVar2, akra akraVar3) {
        int i;
        int min = Math.min(akraVar.a, akraVar2.a);
        int max = Math.max(akraVar.a, akraVar2.a);
        int min2 = Math.min(akraVar.b, akraVar2.b);
        int max2 = Math.max(akraVar.b, akraVar2.b);
        int i2 = akraVar3.a;
        if (i2 <= max && i2 >= min && (i = akraVar3.b) <= max2 && i >= min2) {
            int i3 = akraVar2.b;
            int i4 = akraVar.b;
            int i5 = akraVar.a;
            if ((i3 - i4) * (i2 - i5) == (i - i4) * (akraVar2.a - i5)) {
                return true;
            }
        }
        return false;
    }
}
