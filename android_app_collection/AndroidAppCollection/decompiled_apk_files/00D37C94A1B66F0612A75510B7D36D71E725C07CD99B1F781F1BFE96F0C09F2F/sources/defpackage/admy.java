package defpackage;
/* compiled from: PG */
/* renamed from: admy  reason: default package */
/* loaded from: classes.dex */
public final class admy {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;

    public admy() {
    }

    public admy(long j, long j2, long j3, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
    }

    public static admx a() {
        admx admxVar = new admx();
        admxVar.b(0L);
        admxVar.c(0L);
        admxVar.d(0L);
        admxVar.e(false);
        return admxVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof admy) {
            admy admyVar = (admy) obj;
            if (this.a == admyVar.a && this.b == admyVar.b && this.c == admyVar.c && this.d == admyVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        return (true != this.d ? 1237 : 1231) ^ ((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        boolean z = this.d;
        StringBuilder sb = new StringBuilder(188);
        sb.append("ConnectedSessionInfo{lastConnectedTimeMs=");
        sb.append(j);
        sb.append(", firstConnectedTimeMs=");
        sb.append(j2);
        sb.append(", recoveryExpirationTimeMs=");
        sb.append(j3);
        sb.append(", shouldSkipRecoveryExpiration=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
