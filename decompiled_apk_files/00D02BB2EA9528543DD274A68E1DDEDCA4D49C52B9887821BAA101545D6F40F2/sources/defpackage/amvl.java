package defpackage;
/* compiled from: PG */
/* renamed from: amvl  reason: default package */
/* loaded from: classes2.dex */
public final class amvl {
    public final akra a;
    public final float b;
    public final float c;
    public final ahmp d;
    public final ahmp e;
    public final float f;
    public final float g;
    public final dzlf h;
    public final boolean i;
    public final int j;
    public final int k;

    public amvl(akra akraVar, float f, float f2, ahmp ahmpVar, ahmp ahmpVar2, dzlf dzlfVar, float f3, float f4, boolean z, int i, int i2) {
        float f5;
        double g = g(ahmpVar2, ahmpVar, f3, f4);
        this.a = akraVar;
        if (g == dcyn.a) {
            f5 = 0.0f;
        } else {
            double d = f;
            Double.isNaN(d);
            f5 = (float) (d / g);
        }
        this.b = f5;
        this.c = f2;
        this.d = ahmpVar;
        this.f = f3;
        this.g = f4;
        this.e = ahmpVar2;
        this.h = dzlfVar;
        this.i = z;
        this.k = i;
        this.j = i2;
    }

    public amvl(akra akraVar, float f, ahmp ahmpVar, float f2, ahmp ahmpVar2, dzlf dzlfVar, float f3, float f4, boolean z, int i, int i2) {
        this.a = akraVar;
        this.b = f2;
        this.c = f;
        this.d = ahmpVar;
        this.f = f3;
        this.g = f4;
        this.e = ahmpVar2;
        this.h = dzlfVar;
        this.i = z;
        this.k = i;
        this.j = i2;
    }

    public static amvk a(akra akraVar, float f, float f2, ahmp ahmpVar, ahmp ahmpVar2, @dzsi dzlf dzlfVar, float f3) {
        return new amvk(akraVar, f, f2, ahmpVar, ahmpVar2, dzlfVar, f3);
    }

    protected static double g(ahmp ahmpVar, ahmp ahmpVar2, double d, double d2) {
        if (d >= d2) {
            return dcyn.a;
        }
        double a = ahmpVar.a(d);
        return (ahmpVar.a(d2) - a) * (ahmpVar2.a(125.0d) - ahmpVar2.a(-3.0d));
    }

    private final double h(double d) {
        return Math.min(this.g, Math.max(this.f, d));
    }

    public final float b() {
        return (float) f(this.f, this.g);
    }

    public final float c() {
        return (float) this.d.a;
    }

    public final dznf d() {
        return this.h.f();
    }

    public final double e(long j, double d, double d2) {
        if (!this.h.e(j)) {
            return dcyn.a;
        }
        double i = this.h.i(j);
        return f(h(d - i), h(d2 - i));
    }

    public final double f(double d, double d2) {
        double d3 = this.b;
        double g = g(this.e, this.d, d, d2);
        Double.isNaN(d3);
        return d3 * g;
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.e("totalProbability", b());
        b.e("probabilityDensityScale", this.b);
        b.e("bearing", this.c);
        b.b("speedGaussian", this.d);
        b.b("segmentStartDistanceAlongRoute", this.h);
        b.e("truncationLower", this.f);
        b.e("truncationUpper", this.g);
        b.b("positionDistributionAlongSegment", this.e);
        b.h("onTunnelSegment", this.i);
        return b.toString();
    }
}
