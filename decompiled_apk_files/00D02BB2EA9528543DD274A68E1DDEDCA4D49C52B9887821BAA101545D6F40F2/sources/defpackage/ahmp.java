package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ahmp  reason: default package */
/* loaded from: classes2.dex */
public final class ahmp {
    private static final dcqe c = dcqe.c("ahmp");
    private static final double d;
    private static final double e;
    private static final double f;
    private static final double g;
    public final double a;
    public final double b;

    static {
        double d2 = -Math.sqrt(3.141592653589793d);
        d = d2;
        e = (4.0d * d2) / (Math.sqrt(2.0d) * 3.141592653589793d);
        f = 0.0413572909814d * d2;
        g = d2 * (-3.32628259277E-4d);
    }

    public ahmp(double d2, double d3) {
        if (d3 <= dcyn.a || Double.isNaN(d3)) {
            bvoo.h("Gaussian sigmas must be positive: %g", Double.valueOf(d3));
        }
        this.a = d2;
        this.b = Math.max(1.0E-20d, d3);
    }

    public final double a(double d2) {
        double d3 = (d2 - this.a) / this.b;
        if (d3 < -6.0d) {
            return dcyn.a;
        }
        if (d3 > 6.0d) {
            return 1.0d;
        }
        double d4 = d3 * d3 * d3;
        return 1.0d / (Math.exp(((g * ((d4 * d3) * d3)) + (f * d4)) + (e * d3)) + 1.0d);
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof ahmp) {
            ahmp ahmpVar = (ahmp) obj;
            if (Double.compare(this.a, ahmpVar.a) == 0 && Double.compare(this.b, ahmpVar.b) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.a), Double.valueOf(this.b)});
    }

    public final String toString() {
        dbsb c2 = dbsc.c(ahmp.class);
        c2.d("mean", this.a);
        c2.d("sigma", this.b);
        return c2.toString();
    }
}
