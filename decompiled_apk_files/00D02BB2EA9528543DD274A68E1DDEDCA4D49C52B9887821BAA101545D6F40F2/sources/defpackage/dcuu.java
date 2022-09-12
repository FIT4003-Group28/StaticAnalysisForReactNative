package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dcuu  reason: default package */
/* loaded from: classes.dex */
public final class dcuu implements Serializable {
    public double a;
    public double b;

    public dcuu() {
        this.a = 1.0d;
        this.b = dcyn.a;
    }

    public dcuu(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public dcuu(dcuu dcuuVar) {
        this.a = dcuuVar.a;
        this.b = dcuuVar.b;
    }

    public static dcuu a() {
        return new dcuu(1.0d, dcyn.a);
    }

    public static dcuu b(double d, double d2) {
        dcuu dcuuVar = new dcuu();
        dcuuVar.c(d, d2);
        return dcuuVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(double d, double d2) {
        if (d <= d2) {
            this.a = d;
            this.b = d2;
            return;
        }
        this.a = d2;
        this.b = d;
    }

    public final boolean d() {
        return this.a > this.b;
    }

    public final boolean e(double d) {
        return d >= this.a && d <= this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dcuu) {
            dcuu dcuuVar = (dcuu) obj;
            return (this.a == dcuuVar.a && this.b == dcuuVar.b) || (d() && dcuuVar.d());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final double g(double d) {
        return Math.max(this.a, Math.min(this.b, d));
    }

    public final dcuu h(double d) {
        return d() ? this : new dcuu(this.a - d, this.b + d);
    }

    public final int hashCode() {
        if (d()) {
            return 17;
        }
        long doubleToLongBits = ((Double.doubleToLongBits(this.a) + 629) * 37) + Double.doubleToLongBits(this.b);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(dcuu dcuuVar) {
        double max;
        if (d()) {
            this.a = dcuuVar.a;
            max = dcuuVar.b;
        } else if (dcuuVar.d()) {
            return;
        } else {
            this.a = Math.min(this.a, dcuuVar.a);
            max = Math.max(this.b, dcuuVar.b);
        }
        this.b = max;
    }

    public final dcuu j(dcuu dcuuVar) {
        return new dcuu(Math.max(this.a, dcuuVar.a), Math.min(this.b, dcuuVar.b));
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
}
