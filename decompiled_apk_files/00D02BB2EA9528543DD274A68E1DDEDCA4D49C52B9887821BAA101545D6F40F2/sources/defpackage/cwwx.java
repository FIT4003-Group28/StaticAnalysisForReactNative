package defpackage;
/* compiled from: PG */
/* renamed from: cwwx  reason: default package */
/* loaded from: classes5.dex */
public final class cwwx extends cwwz {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final double e;
    private final int f;

    public cwwx(int i, int i2, int i3, int i4, int i5, double d) {
        this.f = i;
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = d;
    }

    @Override // defpackage.cwwz, defpackage.cwuw
    public final int b() {
        return this.f;
    }

    @Override // defpackage.cwwz
    public final int c() {
        return this.a;
    }

    @Override // defpackage.cwwz
    public final int d() {
        return this.b;
    }

    @Override // defpackage.cwwz
    public final int e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cwwz)) {
            return false;
        }
        cwwz cwwzVar = (cwwz) obj;
        int i = this.f;
        int b = cwwzVar.b();
        if (i == 0) {
            throw null;
        }
        return i == b && this.a == cwwzVar.c() && this.b == cwwzVar.d() && this.c == cwwzVar.e() && this.d == cwwzVar.f() && Double.doubleToLongBits(this.e) == Double.doubleToLongBits(cwwzVar.g());
    }

    @Override // defpackage.cwwz
    public final int f() {
        return this.d;
    }

    @Override // defpackage.cwwz
    public final double g() {
        return this.e;
    }

    public final int hashCode() {
        int i = this.f;
        cwux.b(i);
        return ((((((((((i ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.e) >>> 32) ^ Double.doubleToLongBits(this.e)));
    }

    public final String toString() {
        String a = cwux.a(this.f);
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        double d = this.e;
        StringBuilder sb = new StringBuilder(a.length() + 211);
        sb.append("CpuProfilingConfigurations{enablement=");
        sb.append(a);
        sb.append(", maxBufferSizeBytes=");
        sb.append(i);
        sb.append(", sampleDurationMs=");
        sb.append(i2);
        sb.append(", sampleDurationSkewMs=");
        sb.append(i3);
        sb.append(", sampleFrequencyMicro=");
        sb.append(i4);
        sb.append(", samplesPerEpoch=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
