package defpackage;
/* compiled from: PG */
/* renamed from: clgs  reason: default package */
/* loaded from: classes5.dex */
final class clgs extends clgw {
    private final long b;
    private final int c;
    private final int d;
    private final long e;
    private final int f;

    public clgs(long j, int i, int i2, long j2, int i3) {
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = j2;
        this.f = i3;
    }

    @Override // defpackage.clgw
    public final long a() {
        return this.b;
    }

    @Override // defpackage.clgw
    public final int b() {
        return this.c;
    }

    @Override // defpackage.clgw
    public final int c() {
        return this.d;
    }

    @Override // defpackage.clgw
    public final long d() {
        return this.e;
    }

    @Override // defpackage.clgw
    public final int e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof clgw) {
            clgw clgwVar = (clgw) obj;
            if (this.b == clgwVar.a() && this.c == clgwVar.b() && this.d == clgwVar.c() && this.e == clgwVar.d() && this.f == clgwVar.e()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        int i = this.c;
        int i2 = this.d;
        long j2 = this.e;
        return this.f ^ ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        long j = this.b;
        int i = this.c;
        int i2 = this.d;
        long j2 = this.e;
        int i3 = this.f;
        StringBuilder sb = new StringBuilder(203);
        sb.append("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(j);
        sb.append(", loadBatchSize=");
        sb.append(i);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(i2);
        sb.append(", eventCleanUpAge=");
        sb.append(j2);
        sb.append(", maxBlobByteSizePerRow=");
        sb.append(i3);
        sb.append("}");
        return sb.toString();
    }
}
