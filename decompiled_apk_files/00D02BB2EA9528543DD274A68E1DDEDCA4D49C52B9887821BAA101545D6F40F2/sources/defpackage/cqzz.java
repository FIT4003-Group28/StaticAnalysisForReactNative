package defpackage;
/* compiled from: PG */
/* renamed from: cqzz  reason: default package */
/* loaded from: classes5.dex */
final class cqzz extends cral {
    private final double a;
    private final double b;

    public cqzz(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    @Override // defpackage.cral
    public final double a() {
        return this.a;
    }

    @Override // defpackage.cral
    public final double b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cral) {
            cral cralVar = (cral) obj;
            if (Double.doubleToLongBits(this.a) == Double.doubleToLongBits(cralVar.a()) && Double.doubleToLongBits(this.b) == Double.doubleToLongBits(cralVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((int) ((Double.doubleToLongBits(this.b) >>> 32) ^ Double.doubleToLongBits(this.b))) ^ ((((int) ((Double.doubleToLongBits(this.a) >>> 32) ^ Double.doubleToLongBits(this.a))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        double d = this.a;
        double d2 = this.b;
        StringBuilder sb = new StringBuilder(77);
        sb.append("LatLng{latitude=");
        sb.append(d);
        sb.append(", longitude=");
        sb.append(d2);
        sb.append("}");
        return sb.toString();
    }
}
