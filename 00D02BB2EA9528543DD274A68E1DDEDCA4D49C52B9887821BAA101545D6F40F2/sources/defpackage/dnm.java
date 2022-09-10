package defpackage;
/* compiled from: PG */
/* renamed from: dnm  reason: default package */
/* loaded from: classes6.dex */
public final class dnm {
    public final double[] a;
    public final double[] b;
    public final double c;
    private final double[] d;

    public dnm(double d, double d2, double d3) {
        this.a = c(d, d2);
        double cos = Math.cos(Math.toRadians(d));
        double d4 = (0.00669437999014d * cos * cos) + 0.99330562000986d;
        double[] dArr = {((6378137.0d * cos) / Math.sqrt(d4)) * 6.283185307179586d, (6335439.327292829d / Math.pow(d4, 1.5d)) * cos * 6.283185307179586d};
        this.d = dArr;
        this.b = new double[]{1.0d / dArr[0], 1.0d / dArr[1]};
        this.c = d3;
    }

    private static double[] c(double d, double d2) {
        double sin = Math.sin(Math.toRadians(d));
        return new double[]{(d2 + 180.0d) / 360.0d, (Math.log((sin + 1.0d) / (1.0d - sin)) * 0.07957747154594767d) + 0.5d};
    }

    public final dqdo a(double d, double d2, double d3) {
        double[] c = c(d, d2);
        double[] dArr = this.d;
        double d4 = dArr[0];
        double d5 = c[0];
        double[] dArr2 = this.a;
        c[0] = d4 * (d5 - dArr2[0]);
        c[1] = dArr[1] * (c[1] - dArr2[1]);
        dqdn bZ = dqdo.e.bZ();
        double d6 = c[0];
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dqdo dqdoVar = (dqdo) bZ.b;
        int i = dqdoVar.a | 1;
        dqdoVar.a = i;
        dqdoVar.b = d6;
        double d7 = this.c;
        int i2 = i | 2;
        dqdoVar.a = i2;
        dqdoVar.c = d3 - d7;
        double d8 = c[1];
        dqdoVar.a = i2 | 4;
        dqdoVar.d = -d8;
        return bZ.bK();
    }

    public final double b(double d, double d2, double d3) {
        dqdo a = a(d, d2, d3);
        double d4 = a.b;
        double d5 = a.c;
        double d6 = a.d;
        return Math.sqrt((d4 * d4) + (d5 * d5) + (d6 * d6));
    }
}
