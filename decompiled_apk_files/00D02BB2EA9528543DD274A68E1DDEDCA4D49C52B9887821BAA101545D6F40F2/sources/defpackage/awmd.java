package defpackage;
/* compiled from: PG */
/* renamed from: awmd  reason: default package */
/* loaded from: classes3.dex */
final class awmd extends awme {
    public final int a;
    public final int b;

    public awmd(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.awme
    public final int a() {
        return this.a;
    }

    @Override // defpackage.awme
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof awme) {
            awme awmeVar = (awme) obj;
            if (this.a == awmeVar.a() && this.b == awmeVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(63);
        sb.append("UsageState{serviceCount=");
        sb.append(i);
        sb.append(", activityCount=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
