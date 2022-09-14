package defpackage;
/* compiled from: PG */
/* renamed from: ctmk  reason: default package */
/* loaded from: classes5.dex */
final class ctmk extends ctmr {
    private final int d;
    private final long e;
    private final long f;
    private final double g;
    private final int h;

    public ctmk(int i, long j, long j2, double d, int i2) {
        this.d = i;
        this.e = j;
        this.f = j2;
        this.g = d;
        this.h = i2;
    }

    @Override // defpackage.ctmr
    public final int a() {
        return this.d;
    }

    @Override // defpackage.ctmr
    public final long b() {
        return this.e;
    }

    @Override // defpackage.ctmr
    public final long c() {
        return this.f;
    }

    @Override // defpackage.ctmr
    public final double d() {
        return this.g;
    }

    @Override // defpackage.ctmr
    public final int e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctmr) {
            ctmr ctmrVar = (ctmr) obj;
            if (this.d == ctmrVar.a() && this.e == ctmrVar.b() && this.f == ctmrVar.c() && Double.doubleToLongBits(this.g) == Double.doubleToLongBits(ctmrVar.d()) && this.h == ctmrVar.e()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.d;
        long j = this.e;
        long j2 = this.f;
        return ((((((((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.g) >>> 32) ^ Double.doubleToLongBits(this.g)))) * 1000003) ^ this.h;
    }

    public final String toString() {
        int i = this.d;
        long j = this.e;
        long j2 = this.f;
        double d = this.g;
        int i2 = this.h;
        StringBuilder sb = new StringBuilder(168);
        sb.append("LighterRetryPolicy{maxRetries=");
        sb.append(i);
        sb.append(", maxDelayMs=");
        sb.append(j);
        sb.append(", initialDelayMs=");
        sb.append(j2);
        sb.append(", backoff=");
        sb.append(d);
        sb.append(", jitterMs=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
