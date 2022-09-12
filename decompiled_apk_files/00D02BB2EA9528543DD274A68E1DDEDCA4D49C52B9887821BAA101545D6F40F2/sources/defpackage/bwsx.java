package defpackage;
/* compiled from: PG */
/* renamed from: bwsx  reason: default package */
/* loaded from: classes4.dex */
public final class bwsx {
    public double c;
    public final double e;
    public double b = dcyn.a;
    public double d = dcyn.a;
    public double a = dcyn.a;

    public bwsx(double d) {
        this.e = d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final double a(double d) {
        double d2;
        double d3 = this.d - this.b;
        if (d3 <= 180.0d) {
            if (d3 < -180.0d) {
                d2 = 360.0d;
            }
            this.c = -d3;
            double d4 = 2.0d / this.e;
            double exp = 1.0d / Math.exp(d4 * d);
            double d5 = this.a;
            double d6 = this.c;
            double d7 = ((d4 * d6) + d5) * d;
            this.a = (d5 - (d4 * d7)) * exp;
            double b = bwsr.b(this.d + ((d6 + d7) * exp));
            this.b = b;
            return b;
        }
        d2 = -360.0d;
        d3 += d2;
        this.c = -d3;
        double d42 = 2.0d / this.e;
        double exp2 = 1.0d / Math.exp(d42 * d);
        double d52 = this.a;
        double d62 = this.c;
        double d72 = ((d42 * d62) + d52) * d;
        this.a = (d52 - (d42 * d72)) * exp2;
        double b2 = bwsr.b(this.d + ((d62 + d72) * exp2));
        this.b = b2;
        return b2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(double d) {
        this.b = d;
        this.d = d;
        this.a = dcyn.a;
    }
}
