package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dzsp  reason: default package */
/* loaded from: classes6.dex */
public class dzsp implements Serializable {
    public double a;
    public double b;
    public double c;

    public dzsp() {
        this.a = dcyn.a;
        this.b = dcyn.a;
        this.c = dcyn.a;
    }

    public dzsp(double d, double d2, double d3) {
        this.a = d;
        this.b = d2;
        this.c = d3;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof dzsp)) {
            return false;
        }
        dzsp dzspVar = (dzsp) obj;
        return this.a == dzspVar.a && this.b == dzspVar.b && this.c == dzspVar.c;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.c);
        return (int) (((((doubleToLongBits ^ (doubleToLongBits >> 32)) ^ doubleToLongBits2) ^ (doubleToLongBits2 >> 32)) ^ doubleToLongBits3) ^ (doubleToLongBits3 >> 32));
    }

    public final String toString() {
        double d = this.a;
        double d2 = this.b;
        double d3 = this.c;
        StringBuilder sb = new StringBuilder(78);
        sb.append("(");
        sb.append(d);
        sb.append(", ");
        sb.append(d2);
        sb.append(", ");
        sb.append(d3);
        sb.append(")");
        return sb.toString();
    }
}
