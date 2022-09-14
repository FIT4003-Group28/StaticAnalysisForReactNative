package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dcva  reason: default package */
/* loaded from: classes.dex */
public final class dcva implements Cloneable, Serializable {
    public double a;
    public double b;

    public dcva() {
        b();
    }

    public dcva(dcva dcvaVar) {
        this.a = dcvaVar.a;
        this.b = dcvaVar.b;
    }

    public static dcva d() {
        dcva dcvaVar = new dcva();
        dcvaVar.b();
        return dcvaVar;
    }

    public static dcva e() {
        dcva dcvaVar = new dcva();
        dcvaVar.c();
        return dcvaVar;
    }

    public static dcva f(double d, double d2) {
        dcva dcvaVar = new dcva();
        dcvaVar.g(d, d2);
        return dcvaVar;
    }

    public static double o(double d, double d2) {
        double d3 = d2 - d;
        return d3 >= dcyn.a ? d3 : (d2 + 3.141592653589793d) - (d - 3.141592653589793d);
    }

    public final void a(double d, double d2, boolean z) {
        this.a = d;
        this.b = d2;
        if (!z) {
            if (d == -3.141592653589793d && d2 != 3.141592653589793d) {
                this.a = 3.141592653589793d;
            }
            if (d2 != -3.141592653589793d || d == 3.141592653589793d) {
                return;
            }
            this.b = 3.141592653589793d;
        }
    }

    public final void b() {
        this.a = 3.141592653589793d;
        this.b = -3.141592653589793d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        this.a = -3.141592653589793d;
        this.b = 3.141592653589793d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dcva) {
            dcva dcvaVar = (dcva) obj;
            if (this.a == dcvaVar.a && this.b == dcvaVar.b) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(double d, double d2) {
        if (d == -3.141592653589793d) {
            d = 3.141592653589793d;
        }
        if (d2 == -3.141592653589793d) {
            d2 = 3.141592653589793d;
        }
        if (o(d, d2) <= 3.141592653589793d) {
            this.a = d;
            this.b = d2;
            return;
        }
        this.a = d2;
        this.b = d;
    }

    public final boolean h() {
        return this.b - this.a == 6.283185307179586d;
    }

    public final int hashCode() {
        long doubleToLongBits = ((Double.doubleToLongBits(this.a) + 629) * 37) + Double.doubleToLongBits(this.b);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final boolean i() {
        return this.a - this.b == 6.283185307179586d;
    }

    public final boolean j() {
        return this.a > this.b;
    }

    public final double k() {
        double d = this.b - this.a;
        if (d >= dcyn.a) {
            return d;
        }
        double d2 = d + 6.283185307179586d;
        if (d2 <= dcyn.a) {
            return -1.0d;
        }
        return d2;
    }

    public final boolean l(double d) {
        boolean j = j();
        double d2 = this.a;
        return j ? (d >= d2 || d <= this.b) && !i() : d >= d2 && d <= this.b;
    }

    public final boolean m(dcva dcvaVar) {
        if (!j()) {
            return dcvaVar.j() ? h() || dcvaVar.i() : dcvaVar.a >= this.a && dcvaVar.b <= this.b;
        }
        boolean j = dcvaVar.j();
        double d = dcvaVar.a;
        double d2 = this.a;
        return j ? d >= d2 && dcvaVar.b <= this.b : (d >= d2 || dcvaVar.b <= this.b) && !i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(dcva dcvaVar) {
        if (!dcvaVar.i()) {
            if (l(dcvaVar.a)) {
                if (!l(dcvaVar.b)) {
                    this.b = dcvaVar.b;
                } else if (m(dcvaVar)) {
                } else {
                    c();
                }
            } else if (l(dcvaVar.b)) {
                this.a = dcvaVar.a;
            } else if (i() || dcvaVar.l(this.a)) {
                this.a = dcvaVar.a;
                this.b = dcvaVar.b;
            } else if (o(dcvaVar.b, this.a) < o(this.b, dcvaVar.a)) {
                this.a = dcvaVar.a;
            } else {
                this.b = dcvaVar.b;
            }
        }
    }

    public final String toString() {
        double d = this.a;
        double d2 = this.b;
        StringBuilder sb = new StringBuilder(52);
        sb.append("[");
        sb.append(d);
        sb.append(", ");
        sb.append(d2);
        sb.append("]");
        return sb.toString();
    }

    public dcva(double d, double d2) {
        this(d, d2, false);
    }

    public dcva(double d, double d2, boolean z) {
        a(d, d2, z);
    }
}
