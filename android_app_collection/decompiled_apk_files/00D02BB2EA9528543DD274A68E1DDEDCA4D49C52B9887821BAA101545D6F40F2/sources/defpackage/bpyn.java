package defpackage;
/* compiled from: PG */
/* renamed from: bpyn  reason: default package */
/* loaded from: classes4.dex */
final class bpyn extends bqac {
    private final double a;
    private final float b;

    public bpyn(double d, float f) {
        this.a = d;
        this.b = f;
    }

    @Override // defpackage.bqac
    public final double a() {
        return this.a;
    }

    @Override // defpackage.bqac
    public final float b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bqac) {
            bqac bqacVar = (bqac) obj;
            if (Double.doubleToLongBits(this.a) == Double.doubleToLongBits(bqacVar.a()) && Float.floatToIntBits(this.b) == Float.floatToIntBits(bqacVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) ^ ((((int) ((Double.doubleToLongBits(this.a) >>> 32) ^ Double.doubleToLongBits(this.a))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        double d = this.a;
        float f = this.b;
        StringBuilder sb = new StringBuilder(88);
        sb.append("CheckThresholds{distanceMeters=");
        sb.append(d);
        sb.append(", zoomDifference=");
        sb.append(f);
        sb.append("}");
        return sb.toString();
    }
}
