package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dcvs  reason: default package */
/* loaded from: classes.dex */
public final class dcvs implements Serializable {
    public static final dcvs a = new dcvs((double) dcyn.a, (double) dcyn.a);
    public final double b;
    public final double c;

    public dcvs() {
        this((double) dcyn.a, (double) dcyn.a);
    }

    public dcvs(double d, double d2) {
        this.b = d;
        this.c = d2;
    }

    public static dcvs a(double d, double d2) {
        return new dcvs(d, d2);
    }

    public static dcvs b(double d, double d2) {
        return new dcvs(dcuy.e(d), dcuy.e(d2));
    }

    public static dcvs c(int i, int i2) {
        return new dcvs(dcuy.g(i), dcuy.g(i2));
    }

    public static dcuy d(dcwa dcwaVar) {
        double d = dcwaVar.j;
        double d2 = dcwaVar.h;
        double d3 = dcwaVar.i;
        return dcuy.d(Math.atan2(d + dcyn.a, Math.sqrt((d2 * d2) + (d3 * d3))));
    }

    public static dcuy e(dcwa dcwaVar) {
        return dcuy.d(Math.atan2(dcwaVar.i + dcyn.a, dcwaVar.h + dcyn.a));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dcvs) {
            dcvs dcvsVar = (dcvs) obj;
            if (this.b == dcvsVar.b && this.c == dcvsVar.c) {
                return true;
            }
        }
        return false;
    }

    public final dcuy f() {
        return dcuy.d(this.b);
    }

    public final double g() {
        return this.b * 57.29577951308232d;
    }

    public final dcuy h() {
        return dcuy.d(this.c);
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.b) + 646;
        long doubleToLongBits2 = doubleToLongBits + (37 * doubleToLongBits) + Double.doubleToLongBits(this.c);
        return (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
    }

    public final double i() {
        return this.c * 57.29577951308232d;
    }

    public final dcvs j() {
        return new dcvs(Math.max(-1.5707963267948966d, Math.min(1.5707963267948966d, this.b)), dcus.b(this.c));
    }

    public final dcwa k() {
        double d = this.b;
        double d2 = this.c;
        double cos = Math.cos(d);
        return new dcwa(Math.cos(d2) * cos, Math.sin(d2) * cos, Math.sin(d));
    }

    public final dcuy l(dcvs dcvsVar) {
        double d = this.b;
        double d2 = dcvsVar.b;
        double d3 = this.c;
        double d4 = dcvsVar.c;
        double sin = Math.sin((d2 - d) * 0.5d);
        double sin2 = Math.sin((d4 - d3) * 0.5d);
        double asin = Math.asin(Math.sqrt(Math.min(1.0d, (sin * sin) + (sin2 * sin2 * Math.cos(d) * Math.cos(d2)))));
        return dcuy.d(asin + asin);
    }

    @Deprecated
    public final double m(dcvs dcvsVar) {
        return l(dcvsVar).i();
    }

    public final String toString() {
        double d = this.b;
        double d2 = this.c;
        StringBuilder sb = new StringBuilder(52);
        sb.append("(");
        sb.append(d);
        sb.append(", ");
        sb.append(d2);
        sb.append(")");
        return sb.toString();
    }

    public dcvs(dcuy dcuyVar, dcuy dcuyVar2) {
        this(dcuyVar.b, dcuyVar2.b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dcvs(defpackage.dcwa r9) {
        /*
            r8 = this;
            double r0 = r9.j
            double r2 = r9.h
            double r4 = r9.i
            r6 = 0
            double r0 = r0 + r6
            double r2 = r2 * r2
            double r4 = r4 * r4
            double r2 = r2 + r4
            double r2 = java.lang.Math.sqrt(r2)
            double r0 = java.lang.Math.atan2(r0, r2)
            double r2 = r9.i
            double r2 = r2 + r6
            double r4 = r9.h
            double r4 = r4 + r6
            double r2 = java.lang.Math.atan2(r2, r4)
            r8.<init>(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcvs.<init>(dcwa):void");
    }
}
