package defpackage;
/* compiled from: PG */
/* renamed from: drsn  reason: default package */
/* loaded from: classes6.dex */
public final class drsn extends drso {
    public final double a;
    public final double b;
    public final double c;

    public drsn(double d, double d2, double d3) {
        this.a = d;
        this.b = d2;
        this.c = d3;
    }

    @Override // defpackage.drso
    public final double a() {
        return this.a;
    }

    @Override // defpackage.drso
    public final double b() {
        return this.b;
    }

    @Override // defpackage.drso
    public final double c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof drso) {
            drso drsoVar = (drso) obj;
            if (Double.doubleToLongBits(this.a) == Double.doubleToLongBits(drsoVar.a()) && Double.doubleToLongBits(this.b) == Double.doubleToLongBits(drsoVar.b()) && Double.doubleToLongBits(this.c) == Double.doubleToLongBits(drsoVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((int) ((Double.doubleToLongBits(this.c) >>> 32) ^ Double.doubleToLongBits(this.c))) ^ ((((((int) ((Double.doubleToLongBits(this.a) >>> 32) ^ Double.doubleToLongBits(this.a))) ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.b) >>> 32) ^ Double.doubleToLongBits(this.b)))) * 1000003);
    }

    public final String toString() {
        double d = this.a;
        double d2 = this.b;
        double d3 = this.c;
        StringBuilder sb = new StringBuilder(131);
        sb.append("S2QuantizedLocation{latitude=");
        sb.append(d);
        sb.append(", longitude=");
        sb.append(d2);
        sb.append(", accuracyMeters=");
        sb.append(d3);
        sb.append("}");
        return sb.toString();
    }
}
