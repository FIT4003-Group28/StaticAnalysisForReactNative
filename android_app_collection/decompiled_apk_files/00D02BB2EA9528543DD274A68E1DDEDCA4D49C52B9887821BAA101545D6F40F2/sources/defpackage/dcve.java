package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dcve  reason: default package */
/* loaded from: classes5.dex */
public final class dcve implements Serializable, dcxa {
    private static final double i = Math.asin(Math.sqrt(0.3333333333333333d)) - (dcvc.c * 0.5d);
    byte a;
    public byte b;
    byte c;
    public dcvf d;
    double e;
    double f;
    double g;
    double h;

    public dcve() {
    }

    public dcve(dcvf dcvfVar) {
        this.d = dcvfVar;
        this.a = (byte) dcvfVar.g();
        long w = dcvfVar.w();
        this.c = (byte) dcvf.z(w);
        this.b = (byte) dcvfVar.h();
        int x = dcvf.x(w);
        int y = dcvf.y(w);
        int i2 = dcvf.i(dcvfVar.h());
        this.e = dcwz.f.c(x, i2);
        this.f = dcwz.f.c(x + i2, i2);
        this.g = dcwz.f.c(y, i2);
        this.h = dcwz.f.c(y + i2, i2);
    }

    public static double c(dcwa dcwaVar, double d, double d2) {
        return dcwaVar.l(dcwa.f(new dcwa(d, d2, 1.0d)));
    }

    public static double f(double d, double d2) {
        double d3 = (d * d) / ((d2 * d2) + 1.0d);
        double sqrt = 1.0d - Math.sqrt(1.0d - d3);
        return d3 + (sqrt * sqrt);
    }

    private final dcwa g(int i2, int i3) {
        return dcwz.f(this.a, i2 == 0 ? this.e : this.f, i3 == 0 ? this.g : this.h);
    }

    public final dcvu b() {
        dcvu dcvuVar;
        int i2 = 1;
        if (this.b > 0) {
            double d = this.e + this.f;
            double d2 = this.g + this.h;
            int i3 = (dcwz.o(this.a, 0).j != dcyn.a ? d <= dcyn.a : d >= dcyn.a) ? 0 : 1;
            if (dcwz.o(this.a, 1).j != dcyn.a ? d2 <= dcyn.a : d2 >= dcyn.a) {
                i2 = 0;
            }
            int i4 = 1 - i3;
            int i5 = 1 - i2;
            dcvu dcvuVar2 = new dcvu(dcuu.b(dcvs.d(g(i3, i2)).b, dcvs.d(g(i4, i5)).b), dcva.f(dcvs.e(g(i3, i5)).b, dcvs.e(g(i4, i2)).b));
            double d3 = dcvc.c;
            double d4 = dcvc.c;
            return dcvuVar2.g(dcvs.a(d3 + d3, d4 + d4)).i();
        }
        byte b = this.a;
        if (b == 0) {
            dcvuVar = new dcvu(new dcuu(-0.7853981633974483d, 0.7853981633974483d), new dcva(-0.7853981633974483d, 0.7853981633974483d));
        } else if (b == 1) {
            dcvuVar = new dcvu(new dcuu(-0.7853981633974483d, 0.7853981633974483d), new dcva(0.7853981633974483d, 2.356194490192345d));
        } else if (b == 2) {
            dcvuVar = new dcvu(new dcuu(i, 1.5707963267948966d), dcva.e());
        } else if (b == 3) {
            dcvuVar = new dcvu(new dcuu(-0.7853981633974483d, 0.7853981633974483d), new dcva(2.356194490192345d, -2.356194490192345d));
        } else if (b != 4) {
            dcvuVar = new dcvu(new dcuu(-1.5707963267948966d, -i), dcva.e());
        } else {
            dcvuVar = new dcvu(new dcuu(-0.7853981633974483d, 0.7853981633974483d), new dcva(-2.356194490192345d, -0.7853981633974483d));
        }
        return dcvuVar.g(dcvs.a(dcvc.c, dcyn.a));
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        dcve dcveVar = new dcve();
        dcveVar.a = this.a;
        dcveVar.b = this.b;
        dcveVar.c = this.c;
        dcveVar.e = this.e;
        dcveVar.f = this.f;
        dcveVar.g = this.g;
        dcveVar.h = this.h;
        return dcveVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dcve) {
            dcve dcveVar = (dcve) obj;
            if (this.a == dcveVar.a && this.b == dcveVar.b && this.c == dcveVar.c && this.d.equals(dcveVar.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dcxa
    public final boolean h(dcwa dcwaVar) {
        dcuw h = dcwz.h(this.a, dcwaVar);
        if (h == null) {
            return false;
        }
        double d = h.a;
        if (d >= this.e && d <= this.f) {
            double d2 = h.b;
            if (d2 >= this.g && d2 <= this.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a + 629) * 37) + this.c) * 37) + this.b) * 37) + this.d.hashCode();
    }

    public final String toString() {
        byte b = this.a;
        byte b2 = this.b;
        byte b3 = this.c;
        String valueOf = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("[");
        sb.append((int) b);
        sb.append(", ");
        sb.append((int) b2);
        sb.append(", ");
        sb.append((int) b3);
        sb.append(", ");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public final dcwa a(int i2) {
        int i3 = i2 >> 1;
        return dcwa.f(dcwz.f(this.a, ((i2 & 1) ^ i3) == 0 ? this.e : this.f, i3 == 0 ? this.g : this.h));
    }

    public final boolean d(dcwa dcwaVar, boolean z) {
        double d = z ? this.h : this.g;
        double d2 = (d * d) + 1.0d;
        double d3 = -this.e;
        dcwa dcwaVar2 = new dcwa(d2, d3 * d, d3);
        double d4 = -this.f;
        return dcwaVar.d(dcwaVar2) > dcyn.a && dcwaVar.d(new dcwa(d2, d4 * d, d4)) < dcyn.a;
    }

    public final boolean e(dcwa dcwaVar, boolean z) {
        double d = z ? this.f : this.e;
        double d2 = -d;
        double d3 = this.g;
        double d4 = (d * d) + 1.0d;
        dcwa dcwaVar2 = new dcwa(d2 * d3, d4, -d3);
        double d5 = this.h;
        return dcwaVar.d(dcwaVar2) > dcyn.a && dcwaVar.d(new dcwa(d2 * d5, d4, -d5)) < dcyn.a;
    }
}
