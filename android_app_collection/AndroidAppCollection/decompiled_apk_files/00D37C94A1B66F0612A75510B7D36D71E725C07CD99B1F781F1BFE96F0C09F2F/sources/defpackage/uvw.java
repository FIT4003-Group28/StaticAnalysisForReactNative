package defpackage;
/* compiled from: PG */
/* renamed from: uvw  reason: default package */
/* loaded from: classes4.dex */
public final class uvw implements uum {
    public final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final double f;

    public uvw() {
    }

    public uvw(int i, int i2, int i3, int i4, double d) {
        this.a = 1;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = d;
    }

    @Override // defpackage.uum
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.uum
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uvw)) {
            return false;
        }
        uvw uvwVar = (uvw) obj;
        int i = this.a;
        int i2 = uvwVar.a;
        if (i == 0) {
            throw null;
        }
        return i2 == 1 && this.b == uvwVar.b && this.c == uvwVar.c && this.d == uvwVar.d && this.e == uvwVar.e && Double.doubleToLongBits(this.f) == Double.doubleToLongBits(uvwVar.f);
    }

    public final int hashCode() {
        uun.b(this.a);
        return ((((((((this.b ^ (-722379962)) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f) >>> 32) ^ Double.doubleToLongBits(this.f)));
    }

    public final String toString() {
        String a = uun.a(this.a);
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        int i4 = this.e;
        double d = this.f;
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
