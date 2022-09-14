package defpackage;
/* compiled from: PG */
/* renamed from: crak  reason: default package */
/* loaded from: classes5.dex */
public final class crak {
    public static double a(cral cralVar, cral cralVar2) {
        double d;
        double radians = Math.toRadians(cralVar.a());
        double radians2 = Math.toRadians(cralVar.b());
        double radians3 = Math.toRadians(cralVar2.a());
        double radians4 = Math.toRadians(cralVar2.b()) - radians2;
        double atan = Math.atan(Math.tan(radians) * 0.996647189328169d);
        double atan2 = Math.atan(Math.tan(radians3) * 0.996647189328169d);
        double cos = Math.cos(atan);
        double cos2 = Math.cos(atan2);
        double sin = Math.sin(atan);
        double sin2 = Math.sin(atan2);
        double d2 = cos * cos2;
        double d3 = sin * sin2;
        double d4 = radians4;
        int i = 0;
        double d5 = dcyn.a;
        double d6 = dcyn.a;
        double d7 = dcyn.a;
        while (true) {
            if (i >= 20) {
                d = d7;
                break;
            }
            double cos3 = Math.cos(d4);
            double sin3 = Math.sin(d4);
            double d8 = cos2 * sin3;
            double d9 = (cos * sin2) - ((sin * cos2) * cos3);
            double d10 = sin;
            double sqrt = Math.sqrt((d8 * d8) + (d9 * d9));
            double d11 = sin2;
            double d12 = d3 + (cos3 * d2);
            double atan22 = Math.atan2(sqrt, d12);
            double d13 = sqrt == dcyn.a ? 0.0d : (sin3 * d2) / sqrt;
            double d14 = 1.0d - (d13 * d13);
            double d15 = d14 == dcyn.a ? 0.0d : d12 - ((d3 + d3) / d14);
            double d16 = 0.006739496756586903d * d14;
            double d17 = ((d16 / 16384.0d) * (((((320.0d - (175.0d * d16)) * d16) - 768.0d) * d16) + 4096.0d)) + 1.0d;
            double d18 = (d16 / 1024.0d) * ((d16 * (((74.0d - (47.0d * d16)) * d16) - 128.0d)) + 256.0d);
            double d19 = 2.0955066698943685E-4d * d14 * (((4.0d - (d14 * 3.0d)) * 0.0033528106718309896d) + 4.0d);
            double d20 = d15 * d15;
            d6 = d18 * sqrt * (d15 + ((d18 / 4.0d) * ((((d20 + d20) - 1.0d) * d12) - ((((d18 / 6.0d) * d15) * (((sqrt * 4.0d) * sqrt) - 3.0d)) * ((d20 * 4.0d) - 3.0d)))));
            double d21 = radians4 + ((1.0d - d19) * 0.0033528106718309896d * d13 * ((sqrt * d19 * (d15 + (d19 * d12 * (((d15 + d15) * d15) - 1.0d)))) + atan22));
            if (Math.abs((d21 - d4) / d21) < 1.0E-12d) {
                d5 = atan22;
                d = d17;
                break;
            }
            i++;
            d5 = atan22;
            d4 = d21;
            sin = d10;
            sin2 = d11;
            d7 = d17;
        }
        return d * 6356752.3142d * (d5 - d6);
    }
}
