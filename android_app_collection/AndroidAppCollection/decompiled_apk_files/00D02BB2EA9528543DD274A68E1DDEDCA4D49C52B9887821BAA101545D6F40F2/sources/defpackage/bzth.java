package defpackage;
/* compiled from: PG */
/* renamed from: bzth  reason: default package */
/* loaded from: classes4.dex */
final class bzth extends bztk {
    private final String a;
    private final double b;

    public bzth(String str, double d) {
        this.a = str;
        this.b = d;
    }

    @Override // defpackage.bztk
    public final String a() {
        return this.a;
    }

    @Override // defpackage.bztk
    public final double b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bztk) {
            bztk bztkVar = (bztk) obj;
            if (this.a.equals(bztkVar.a()) && Double.doubleToLongBits(this.b) == Double.doubleToLongBits(bztkVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.b) >>> 32) ^ Double.doubleToLongBits(this.b)));
    }

    public final String toString() {
        String str = this.a;
        double d = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 53);
        sb.append("ImageLabel{mid=");
        sb.append(str);
        sb.append(", confidence=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
