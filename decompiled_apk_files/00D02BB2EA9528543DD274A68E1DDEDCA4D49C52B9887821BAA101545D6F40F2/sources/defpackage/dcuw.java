package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dcuw  reason: default package */
/* loaded from: classes5.dex */
public final class dcuw implements Serializable {
    double a;
    double b;

    public dcuw() {
        this(dcyn.a, dcyn.a);
    }

    public dcuw(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dcuw)) {
            return false;
        }
        dcuw dcuwVar = (dcuw) obj;
        return this.a == dcuwVar.a && this.b == dcuwVar.b;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(Math.abs(this.a)) + 646;
        long doubleToLongBits2 = doubleToLongBits + (37 * doubleToLongBits) + Double.doubleToLongBits(Math.abs(this.b));
        return (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
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
