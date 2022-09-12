package defpackage;
/* compiled from: PG */
/* renamed from: cxcz  reason: default package */
/* loaded from: classes5.dex */
final class cxcz extends cxdg {
    private final int a;
    private final float b;
    private final dbsg<cxda> c;
    private final int d;

    public cxcz(int i, int i2, float f, dbsg<cxda> dbsgVar) {
        this.d = i;
        this.a = i2;
        this.b = f;
        this.c = dbsgVar;
    }

    @Override // defpackage.cxdg, defpackage.cwuw
    public final int a() {
        return this.a;
    }

    @Override // defpackage.cxdg, defpackage.cwuw
    public final int b() {
        return this.d;
    }

    @Override // defpackage.cxdg
    public final float c() {
        return this.b;
    }

    @Override // defpackage.cxdg
    public final dbsg<cxda> d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cxdg)) {
            return false;
        }
        cxdg cxdgVar = (cxdg) obj;
        int i = this.d;
        int b = cxdgVar.b();
        if (i == 0) {
            throw null;
        }
        return i == b && this.a == cxdgVar.a() && Float.floatToIntBits(this.b) == Float.floatToIntBits(cxdgVar.c()) && this.c.equals(cxdgVar.d());
    }

    public final int hashCode() {
        int i = this.d;
        cwux.b(i);
        return ((((((i ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        String a = cwux.a(this.d);
        int i = this.a;
        float f = this.b;
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(a.length() + 130 + String.valueOf(valueOf).length());
        sb.append("TimerConfigurations{enablement=");
        sb.append(a);
        sb.append(", rateLimitPerSecond=");
        sb.append(i);
        sb.append(", samplingProbability=");
        sb.append(f);
        sb.append(", perEventConfigurationFlags=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
