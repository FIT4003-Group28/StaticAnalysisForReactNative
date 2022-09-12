package defpackage;
/* compiled from: PG */
/* renamed from: awip  reason: default package */
/* loaded from: classes3.dex */
public final class awip extends awjy {
    private final boolean a;
    private final boolean b;

    public awip(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.awjy
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.awjy
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof awjy) {
            awjy awjyVar = (awjy) obj;
            if (this.a == awjyVar.a() && this.b == awjyVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003;
        if (true == this.b) {
            i = 1231;
        }
        return i2 ^ i;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        StringBuilder sb = new StringBuilder(72);
        sb.append("Config{timeBudgetingDisabled=");
        sb.append(z);
        sb.append(", preFlightBatteryCheckDisabled=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
