package defpackage;
/* compiled from: PG */
/* renamed from: srn  reason: default package */
/* loaded from: classes7.dex */
final class srn extends ssh {
    private final double a;
    private final double b;

    public srn(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ssh) {
            ssh sshVar = (ssh) obj;
            if (Double.doubleToLongBits(this.a) == Double.doubleToLongBits(sshVar.getLatitude()) && Double.doubleToLongBits(this.b) == Double.doubleToLongBits(sshVar.getLongitude())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ssh, defpackage.ahnc
    public final double getLatitude() {
        return this.a;
    }

    @Override // defpackage.ssh, defpackage.ahnc
    public final double getLongitude() {
        return this.b;
    }

    public final int hashCode() {
        return ((int) ((Double.doubleToLongBits(this.b) >>> 32) ^ Double.doubleToLongBits(this.b))) ^ ((((int) ((Double.doubleToLongBits(this.a) >>> 32) ^ Double.doubleToLongBits(this.a))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        double d = this.a;
        double d2 = this.b;
        StringBuilder sb = new StringBuilder(104);
        sb.append("SearchTransitStationsXGeoLocation{latitude=");
        sb.append(d);
        sb.append(", longitude=");
        sb.append(d2);
        sb.append("}");
        return sb.toString();
    }
}
