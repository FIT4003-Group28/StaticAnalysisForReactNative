package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dzso  reason: default package */
/* loaded from: classes6.dex */
public class dzso implements Serializable {
    public final double a;
    public final double b;

    public dzso() {
        this.a = dcyn.a;
        this.b = dcyn.a;
    }

    public dzso(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof dzso)) {
            return false;
        }
        dzso dzsoVar = (dzso) obj;
        return this.a == dzsoVar.a && this.b == dzsoVar.b;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.b);
        return (int) (((doubleToLongBits ^ (doubleToLongBits >> 32)) ^ doubleToLongBits2) ^ (doubleToLongBits2 >> 32));
    }

    public final String toString() {
        double d = this.a;
        double d2 = this.b;
        StringBuilder sb = new StringBuilder(52);
        sb.append("(");
        sb.append(d);
        sb.append(", ");
        sb.append(d2);
        sb.append(")");
        return sb.toString();
    }
}
