package defpackage;
/* compiled from: PG */
/* renamed from: cwyy  reason: default package */
/* loaded from: classes5.dex */
final class cwyy extends cwze {
    private final int a;
    private final boolean b;
    private final dbsg<cwzg> c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final int g;

    public cwyy(int i, int i2, boolean z, dbsg<cwzg> dbsgVar, boolean z2, boolean z3, boolean z4) {
        this.g = i;
        this.a = i2;
        this.b = z;
        this.c = dbsgVar;
        this.d = z2;
        this.e = z3;
        this.f = z4;
    }

    @Override // defpackage.cwze, defpackage.cwuw
    public final int a() {
        return this.a;
    }

    @Override // defpackage.cwze, defpackage.cwuw
    public final int b() {
        return this.g;
    }

    @Override // defpackage.cwze
    public final boolean c() {
        return this.b;
    }

    @Override // defpackage.cwze
    public final dbsg<cwzg> d() {
        return this.c;
    }

    @Override // defpackage.cwze
    public final boolean e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cwze)) {
            return false;
        }
        cwze cwzeVar = (cwze) obj;
        int i = this.g;
        int b = cwzeVar.b();
        if (i == 0) {
            throw null;
        }
        return i == b && this.a == cwzeVar.a() && this.b == cwzeVar.c() && this.c.equals(cwzeVar.d()) && this.d == cwzeVar.e() && this.e == cwzeVar.f() && this.f == cwzeVar.g();
    }

    @Override // defpackage.cwze
    public final boolean f() {
        return this.e;
    }

    @Override // defpackage.cwze
    public final boolean g() {
        return this.f;
    }

    public final int hashCode() {
        int i = this.g;
        cwux.b(i);
        int i2 = 1237;
        int i3 = (((((((((((i ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ 2040732332) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003;
        if (true == this.f) {
            i2 = 1231;
        }
        return i3 ^ i2;
    }

    public final String toString() {
        String a = cwux.a(this.g);
        int i = this.a;
        boolean z = this.b;
        String valueOf = String.valueOf(this.c);
        boolean z2 = this.d;
        boolean z3 = this.e;
        boolean z4 = this.f;
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
