package defpackage;
/* compiled from: PG */
/* renamed from: byvy  reason: default package */
/* loaded from: classes4.dex */
final class byvy extends byww {
    private final augj a;
    private final long b;

    public byvy(augj augjVar, long j) {
        this.a = augjVar;
        this.b = j;
    }

    @Override // defpackage.byww
    public final augj a() {
        return this.a;
    }

    @Override // defpackage.byww
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof byww) {
            byww bywwVar = (byww) obj;
            if (this.a.equals(bywwVar.a()) && this.b == bywwVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        long j = this.b;
        return ((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        long j = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81);
        sb.append("NotificationWithStaleness{notification=");
        sb.append(valueOf);
        sb.append(", staleAfterTimeSecs=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
