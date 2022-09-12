package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: akqa  reason: default package */
/* loaded from: classes2.dex */
public final class akqa {
    double a;
    double b;
    double c;
    double d;

    public akqa(double d) {
        this.d = d;
        this.c = d;
        this.b = d;
        this.a = d;
    }

    public akqa(double d, double d2, double d3, double d4) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
    }

    public static double a(double d, double d2, double d3, double d4) {
        return (((((-d) * 5.0d) / 6.0d) + (d2 * 3.0d)) - ((d3 * 3.0d) / 2.0d)) + (d4 / 3.0d);
    }

    public static double b(double d, double d2, double d3, double d4) {
        return (((d / 3.0d) - ((d2 * 3.0d) / 2.0d)) + (d3 * 3.0d)) - ((d4 * 5.0d) / 6.0d);
    }

    public static double c(double d, double d2, double d3, double d4, double d5) {
        if (d > 1.0d) {
            return d5 + (e(1.0d, d2, d3, d4, d5) * ((-1.0d) + d));
        }
        if (d < dcyn.a) {
            return (e(dcyn.a, d2, d3, d4, d5) * d) + d2;
        }
        double d6 = 1.0d - d;
        double d7 = d6 * d6;
        double d8 = d * d;
        return (d7 * d6 * d2) + (d7 * 3.0d * d * d3) + (d6 * 3.0d * d8 * d4) + (d8 * d * d5);
    }

    public static double e(double d, double d2, double d3, double d4, double d5) {
        double min = Math.min(1.0d, Math.max((double) dcyn.a, d));
        double d6 = 1.0d - min;
        return (d6 * d6 * 3.0d * (d3 - d2)) + (d6 * 6.0d * min * (d4 - d3)) + (min * min * 3.0d * (d5 - d4));
    }

    public final double d(double d) {
        return c(d, this.a, this.b, this.c, this.d);
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof akqa) {
            akqa akqaVar = (akqa) obj;
            if (this.a == akqaVar.a && this.b == akqaVar.b && this.c == akqaVar.c && this.d == akqaVar.d) {
                return true;
            }
        }
        return false;
    }

    public final double f(double d) {
        return e(d, this.a, this.b, this.c, this.d);
    }

    public final void g(double d, double d2, double d3, double d4) {
        this.a = d;
        this.d = d3;
        this.b = d + (d2 / 3.0d);
        this.c = d3 - (d4 / 3.0d);
    }

    public final void h(double d, double d2, double d3) {
        g(d(d), f(d), d2, d3);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.a), Double.valueOf(this.b), Double.valueOf(this.c), Double.valueOf(this.d)});
    }
}
