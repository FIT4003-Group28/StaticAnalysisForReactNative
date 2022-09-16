package defpackage;
/* compiled from: PG */
/* renamed from: uzk  reason: default package */
/* loaded from: classes4.dex */
public final class uzk {
    public Integer a;
    public Float b;
    public ampq c;
    public int d;

    public uzk() {
    }

    public uzk(byte[] bArr) {
        this.c = amon.a;
    }

    public final void b(boolean z) {
        this.d = true != z ? 2 : 3;
    }

    public final uzl a() {
        Integer num;
        int i = this.d;
        if (i == 0 || (num = this.a) == null || this.b == null) {
            StringBuilder sb = new StringBuilder();
            if (this.d == 0) {
                sb.append(" enablement");
            }
            if (this.a == null) {
                sb.append(" rateLimitPerSecond");
            }
            if (this.b == null) {
                sb.append(" samplingProbability");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        uzl uzlVar = new uzl(i, num.intValue(), this.b.floatValue(), this.c);
        boolean z = true;
        aqxo.z(uzlVar.a >= 0, "Rate limit per second must be >= 0");
        float f = uzlVar.b;
        if (f <= 0.0f || f > 1.0f) {
            z = false;
        }
        aqxo.z(z, "Sampling Probability shall be > 0 and <= 1");
        return uzlVar;
    }
}
