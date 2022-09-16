package defpackage;
/* compiled from: PG */
/* renamed from: uxl  reason: default package */
/* loaded from: classes4.dex */
public final class uxl implements uum {
    public final boolean a;
    public final ampq b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    private final int g;

    public uxl() {
    }

    public uxl(int i, boolean z, ampq ampqVar, boolean z2, boolean z3, boolean z4) {
        this.f = 2;
        this.g = i;
        this.a = z;
        this.b = ampqVar;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    @Override // defpackage.uum
    public final int a() {
        return this.g;
    }

    @Override // defpackage.uum
    public final int b() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uxl)) {
            return false;
        }
        uxl uxlVar = (uxl) obj;
        int i = this.f;
        int i2 = uxlVar.f;
        if (i == 0) {
            throw null;
        }
        return i == i2 && this.g == uxlVar.g && this.a == uxlVar.a && this.b.equals(uxlVar.b) && this.c == uxlVar.c && this.d == uxlVar.d && this.e == uxlVar.e;
    }

    public final int hashCode() {
        int i = this.f;
        uun.b(i);
        int i2 = 1237;
        int i3 = (((((((((((i ^ 1000003) * 1000003) ^ this.g) * 1000003) ^ (true != this.a ? 1237 : 1231)) * 1000003) ^ 2040732332) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003;
        if (true == this.e) {
            i2 = 1231;
        }
        return i3 ^ i2;
    }

    public final String toString() {
        String a = uun.a(this.f);
        int i = this.g;
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        boolean z2 = this.c;
        boolean z3 = this.d;
        boolean z4 = this.e;
        StringBuilder sb = new StringBuilder(a.length() + 206 + String.valueOf(valueOf).length());
        sb.append("MemoryConfigurations{enablement=");
        sb.append(a);
        sb.append(", rateLimitPerSecond=");
        sb.append(i);
        sb.append(", recordMetricPerProcess=");
        sb.append(z);
        sb.append(", metricExtensionProvider=");
        sb.append(valueOf);
        sb.append(", forceGcBeforeRecordMemory=");
        sb.append(z2);
        sb.append(", captureDebugMetrics=");
        sb.append(z3);
        sb.append(", captureMemoryInfo=");
        sb.append(z4);
        sb.append("}");
        return sb.toString();
    }
}
