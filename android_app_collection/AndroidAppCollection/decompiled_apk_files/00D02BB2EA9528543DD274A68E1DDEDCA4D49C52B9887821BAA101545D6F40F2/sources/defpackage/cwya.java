package defpackage;
/* compiled from: PG */
/* renamed from: cwya  reason: default package */
/* loaded from: classes5.dex */
final class cwya extends cwyo {
    private final int a;
    private final int b;

    public cwya(int i, int i2) {
        this.b = i;
        this.a = i2;
    }

    @Override // defpackage.cwyo, defpackage.cwuw
    public final int a() {
        return this.a;
    }

    @Override // defpackage.cwyo, defpackage.cwuw
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cwyo)) {
            return false;
        }
        cwyo cwyoVar = (cwyo) obj;
        int i = this.b;
        int b = cwyoVar.b();
        if (i == 0) {
            throw null;
        }
        return i == b && this.a == cwyoVar.a();
    }

    public final int hashCode() {
        int i = this.b;
        cwux.b(i);
        return ((i ^ 1000003) * 1000003) ^ this.a;
    }

    public final String toString() {
        String a = cwux.a(this.b);
        int i = this.a;
        StringBuilder sb = new StringBuilder(a.length() + 63);
        sb.append("JankConfigurations{enablement=");
        sb.append(a);
        sb.append(", rateLimitPerSecond=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
