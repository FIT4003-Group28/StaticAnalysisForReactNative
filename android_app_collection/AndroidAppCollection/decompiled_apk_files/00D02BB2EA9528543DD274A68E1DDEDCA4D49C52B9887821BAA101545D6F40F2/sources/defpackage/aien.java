package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aien  reason: default package */
/* loaded from: classes2.dex */
public final class aien extends aiek {
    public final double a;

    public aien(double d) {
        this.a = d;
    }

    @Override // defpackage.aiek
    public final double a() {
        return this.a;
    }

    @Override // defpackage.aiek
    public final aiej b() {
        return new aiem(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof aiek) && Double.doubleToLongBits(this.a) == Double.doubleToLongBits(((aiek) obj).a());
    }

    public final int hashCode() {
        return 1000003 ^ ((int) ((Double.doubleToLongBits(this.a) >>> 32) ^ Double.doubleToLongBits(this.a)));
    }

    public final String toString() {
        double d = this.a;
        StringBuilder sb = new StringBuilder(48);
        sb.append("State{accuracyInMeters=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
