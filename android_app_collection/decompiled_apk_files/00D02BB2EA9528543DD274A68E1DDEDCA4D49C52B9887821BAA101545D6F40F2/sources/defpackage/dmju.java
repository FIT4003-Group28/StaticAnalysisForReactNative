package defpackage;
/* compiled from: PG */
/* renamed from: dmju  reason: default package */
/* loaded from: classes6.dex */
final class dmju extends dmkn {
    private final long a;
    private final int b;

    public dmju(long j, int i) {
        this.a = j;
        this.b = i;
    }

    @Override // defpackage.dmkn
    public final long a() {
        return this.a;
    }

    @Override // defpackage.dmkn
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dmkn) {
            dmkn dmknVar = (dmkn) obj;
            if (this.a == dmknVar.a() && this.b == dmknVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return this.b ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        int i = this.b;
        StringBuilder sb = new StringBuilder(64);
        sb.append("WifiAccessPoint{mac=");
        sb.append(j);
        sb.append(", frequency=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
