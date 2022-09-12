package defpackage;
/* compiled from: PG */
/* renamed from: wuh  reason: default package */
/* loaded from: classes7.dex */
final class wuh extends wup {
    private final double a;
    private final String b;

    public wuh(double d, @dzsi String str) {
        this.a = d;
        this.b = str;
    }

    @Override // defpackage.wup
    public final double a() {
        return this.a;
    }

    @Override // defpackage.wup
    @dzsi
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof wup) {
            wup wupVar = (wup) obj;
            if (Double.doubleToLongBits(this.a) == Double.doubleToLongBits(wupVar.a()) && ((str = this.b) != null ? str.equals(wupVar.b()) : wupVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int doubleToLongBits = (((int) ((Double.doubleToLongBits(this.a) >>> 32) ^ Double.doubleToLongBits(this.a))) ^ 1000003) * 1000003;
        String str = this.b;
        return (str == null ? 0 : str.hashCode()) ^ doubleToLongBits;
    }

    public final String toString() {
        double d = this.a;
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 66);
        sb.append("Availability{vehiclesPerKm2=");
        sb.append(d);
        sb.append(", mapIconUrl=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
