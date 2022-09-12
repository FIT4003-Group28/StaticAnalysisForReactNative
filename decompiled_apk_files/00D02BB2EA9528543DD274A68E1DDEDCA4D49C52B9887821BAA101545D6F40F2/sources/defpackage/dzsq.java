package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dzsq  reason: default package */
/* loaded from: classes6.dex */
public class dzsq implements Serializable {
    public double a;
    public double b;
    public double c;
    public double d;

    public dzsq() {
        this.a = dcyn.a;
        this.b = dcyn.a;
        this.c = dcyn.a;
        this.d = dcyn.a;
    }

    public final void a(double d, double d2, double d3, double d4) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof dzsq)) {
            return false;
        }
        dzsq dzsqVar = (dzsq) obj;
        return this.a == dzsqVar.a && this.b == dzsqVar.b && this.c == dzsqVar.c && this.d == dzsqVar.d;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        return (int) (((((((doubleToLongBits ^ (doubleToLongBits >> 32)) ^ doubleToLongBits2) ^ (doubleToLongBits2 >> 32)) ^ doubleToLongBits3) ^ (doubleToLongBits3 >> 32)) ^ doubleToLongBits4) ^ (doubleToLongBits4 >> 32));
    }

    public final String toString() {
        double d = this.a;
        double d2 = this.b;
        double d3 = this.c;
        double d4 = this.d;
        StringBuilder sb = new StringBuilder(104);
        sb.append("(");
        sb.append(d);
        sb.append(", ");
        sb.append(d2);
        sb.append(", ");
        sb.append(d3);
        sb.append(", ");
        sb.append(d4);
        sb.append(")");
        return sb.toString();
    }

    public dzsq(double d, double d2, double d3) {
        a(d, d2, d3, 1.0d);
    }
}
