package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dcwa  reason: default package */
/* loaded from: classes5.dex */
public final class dcwa implements Comparable<dcwa>, Serializable, dcxa {
    public static final dcwa a = new dcwa(dcyn.a, dcyn.a, dcyn.a);
    public static final dcwa b = new dcwa(1.0d, dcyn.a, dcyn.a);
    public static final dcwa c = new dcwa(-1.0d, dcyn.a, dcyn.a);
    public static final dcwa d = new dcwa(dcyn.a, 1.0d, dcyn.a);
    public static final dcwa e = new dcwa(dcyn.a, -1.0d, dcyn.a);
    public static final dcwa f = new dcwa(dcyn.a, dcyn.a, 1.0d);
    public static final dcwa g = new dcwa(dcyn.a, dcyn.a, -1.0d);
    final double h;
    final double i;
    final double j;

    public dcwa() {
        this.j = dcyn.a;
        this.i = dcyn.a;
        this.h = dcyn.a;
    }

    public dcwa(double d2, double d3, double d4) {
        this.h = d2;
        this.i = d3;
        this.j = d4;
    }

    public static final dcwa a(dcwa dcwaVar, dcwa dcwaVar2) {
        return new dcwa(dcwaVar.h + dcwaVar2.h, dcwaVar.i + dcwaVar2.i, dcwaVar.j + dcwaVar2.j);
    }

    public static final dcwa b(dcwa dcwaVar, dcwa dcwaVar2) {
        return new dcwa(dcwaVar.h - dcwaVar2.h, dcwaVar.i - dcwaVar2.i, dcwaVar.j - dcwaVar2.j);
    }

    public static final dcwa c(dcwa dcwaVar, double d2) {
        return new dcwa(d2 * dcwaVar.h, dcwaVar.i * d2, dcwaVar.j * d2);
    }

    public static final dcwa e(dcwa dcwaVar, dcwa dcwaVar2) {
        double d2 = dcwaVar.i;
        double d3 = dcwaVar2.j;
        double d4 = dcwaVar.j;
        double d5 = dcwaVar2.i;
        double d6 = dcwaVar2.h;
        double d7 = dcwaVar.h;
        return new dcwa((d2 * d3) - (d4 * d5), (d4 * d6) - (d3 * d7), (d7 * d5) - (d2 * d6));
    }

    public static final dcwa f(dcwa dcwaVar) {
        double g2 = dcwaVar.g();
        if (g2 != dcyn.a) {
            g2 = 1.0d / g2;
        }
        return c(dcwaVar, g2);
    }

    public static final double j(dcwa dcwaVar, dcwa dcwaVar2, dcwa dcwaVar3) {
        double d2 = dcwaVar2.i;
        double d3 = dcwaVar3.j;
        double d4 = dcwaVar2.j;
        double d5 = dcwaVar3.i;
        double d6 = dcwaVar3.h;
        double d7 = dcwaVar2.h;
        return (dcwaVar.h * ((d2 * d3) - (d4 * d5))) + (dcwaVar.i * ((d4 * d6) - (d3 * d7))) + (dcwaVar.j * ((d7 * d5) - (d2 * d6)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int m(double d2, double d3, double d4) {
        double abs = Math.abs(d2);
        double abs2 = Math.abs(d3);
        double abs3 = Math.abs(d4);
        return abs > abs2 ? abs > abs3 ? 0 : 2 : abs2 > abs3 ? 1 : 2;
    }

    public final double d(dcwa dcwaVar) {
        return (this.h * dcwaVar.h) + (this.i * dcwaVar.i) + (this.j * dcwaVar.j);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dcwa)) {
            return false;
        }
        dcwa dcwaVar = (dcwa) obj;
        return this.h == dcwaVar.h && this.i == dcwaVar.i && this.j == dcwaVar.j;
    }

    public final double g() {
        return Math.sqrt(i());
    }

    @Override // defpackage.dcxa
    public final boolean h(dcwa dcwaVar) {
        return p(dcwaVar);
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(Math.abs(this.h)) + 646;
        long doubleToLongBits2 = doubleToLongBits + (doubleToLongBits * 37) + Double.doubleToLongBits(Math.abs(this.i));
        long doubleToLongBits3 = doubleToLongBits2 + (37 * doubleToLongBits2) + Double.doubleToLongBits(Math.abs(this.j));
        return (int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32));
    }

    public final double i() {
        double d2 = this.h;
        double d3 = this.i;
        double d4 = this.j;
        return (d2 * d2) + (d3 * d3) + (d4 * d4);
    }

    public final double k(dcwa dcwaVar) {
        return Math.sqrt(l(dcwaVar));
    }

    public final double l(dcwa dcwaVar) {
        double d2 = this.h - dcwaVar.h;
        double d3 = this.i - dcwaVar.i;
        double d4 = this.j - dcwaVar.j;
        return (d2 * d2) + (d3 * d3) + (d4 * d4);
    }

    public final double n(int i) {
        return i == 0 ? this.h : i == 1 ? this.i : this.j;
    }

    public final double o(dcwa dcwaVar) {
        double d2 = this.i;
        double d3 = dcwaVar.j;
        double d4 = this.j;
        double d5 = dcwaVar.i;
        double d6 = (d2 * d3) - (d4 * d5);
        double d7 = dcwaVar.h;
        double d8 = this.h;
        double d9 = (d4 * d7) - (d3 * d8);
        double d10 = (d8 * d5) - (d2 * d7);
        return Math.atan2(Math.sqrt((d6 * d6) + (d9 * d9) + (d10 * d10)), d(dcwaVar));
    }

    public final boolean p(dcwa dcwaVar) {
        return this.h == dcwaVar.h && this.i == dcwaVar.i && this.j == dcwaVar.j;
    }

    @Override // java.lang.Comparable
    /* renamed from: q */
    public final int compareTo(dcwa dcwaVar) {
        double d2 = this.h;
        double d3 = dcwaVar.h;
        if (d2 < d3) {
            return -1;
        }
        if (d3 >= d2) {
            double d4 = this.i;
            double d5 = dcwaVar.i;
            if (d4 < d5) {
                return -1;
            }
            if (d5 >= d4 && this.j < dcwaVar.j) {
                return -1;
            }
        }
        return !p(dcwaVar) ? 1 : 0;
    }

    public final String r() {
        dcvs dcvsVar = new dcvs(this);
        String d2 = Double.toString(dcvsVar.g());
        String d3 = Double.toString(dcvsVar.i());
        StringBuilder sb = new StringBuilder(String.valueOf(d2).length() + 4 + String.valueOf(d3).length());
        sb.append("(");
        sb.append(d2);
        sb.append(", ");
        sb.append(d3);
        sb.append(")");
        return sb.toString();
    }

    public final String toString() {
        double d2 = this.h;
        double d3 = this.i;
        double d4 = this.j;
        StringBuilder sb = new StringBuilder(78);
        sb.append("(");
        sb.append(d2);
        sb.append(", ");
        sb.append(d3);
        sb.append(", ");
        sb.append(d4);
        sb.append(")");
        return sb.toString();
    }
}
