package defpackage;
/* compiled from: PG */
/* renamed from: akro  reason: default package */
/* loaded from: classes2.dex */
public final class akro {
    public static double a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        double d = dcyn.a;
        while (true) {
            int i8 = i;
            int i9 = i2;
            i = (((i3 + i3) + i8) + i5) / 4;
            i2 = (((i4 + i4) + i9) + i6) / 4;
            int i10 = ((i8 + i5) / 2) - i;
            int i11 = ((i9 + i6) / 2) - i2;
            if ((i10 * i10) + (i11 * i11) < i7) {
                return d + Math.hypot(i8 - i5, i9 - i6);
            }
            d += a(i8, i9, (i8 + i3) / 2, (i9 + i4) / 2, i, i2, i7);
            i3 = (i3 + i5) / 2;
            i4 = (i4 + i6) / 2;
        }
    }

    public static void b(akra akraVar, akra akraVar2, akra akraVar3, int i, double d, akra akraVar4) {
        if (c(akraVar.a, akraVar.b, akraVar2.a, akraVar2.b, akraVar3.a, akraVar3.b, i, d, akraVar4) > dcyn.a) {
            akraVar4.aa(akraVar3);
        }
    }

    static double c(int i, int i2, int i3, int i4, int i5, int i6, int i7, double d, akra akraVar) {
        double d2 = dcyn.a;
        int i8 = i;
        int i9 = i2;
        int i10 = i3;
        int i11 = i4;
        double d3 = d;
        double d4 = 0.0d;
        while (true) {
            int i12 = (((i10 + i10) + i8) + i5) / 4;
            int i13 = (((i11 + i11) + i9) + i6) / 4;
            int i14 = ((i8 + i5) / 2) - i12;
            int i15 = ((i9 + i6) / 2) - i13;
            if ((i14 * i14) + (i15 * i15) < i7) {
                double d5 = i5 - i8;
                double d6 = i6 - i9;
                double hypot = Math.hypot(d5, d6);
                if (hypot < d3) {
                    return d4 + hypot;
                }
                if (hypot != dcyn.a) {
                    d2 = d3 / hypot;
                }
                double d7 = i8;
                Double.isNaN(d5);
                Double.isNaN(d7);
                double d8 = i9;
                Double.isNaN(d6);
                Double.isNaN(d8);
                akraVar.t((int) (d7 + (d5 * d2)), (int) (d8 + (d2 * d6)));
                return -1.0d;
            }
            double c = c(i8, i9, (i8 + i10) / 2, (i9 + i11) / 2, i12, i13, i7, d3, akraVar);
            if (c < dcyn.a) {
                return -1.0d;
            }
            d4 += c;
            d3 -= c;
            i10 = (i10 + i5) / 2;
            i11 = (i11 + i6) / 2;
            i8 = i12;
            i9 = i13;
        }
    }
}
