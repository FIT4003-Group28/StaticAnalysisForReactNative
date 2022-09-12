package defpackage;
/* compiled from: PG */
/* renamed from: cwxn  reason: default package */
/* loaded from: classes5.dex */
final class cwxn extends cwxp {
    private final float a;
    private final int b;

    public cwxn(int i, float f) {
        this.b = i;
        this.a = f;
    }

    @Override // defpackage.cwxp, defpackage.cwuw
    public final int b() {
        return this.b;
    }

    @Override // defpackage.cwxp
    public final float c() {
        return this.a;
    }

    @Override // defpackage.cwxp
    @dzsi
    public final dzsj<dzze> d() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cwxp)) {
            return false;
        }
        cwxp cwxpVar = (cwxp) obj;
        int i = this.b;
        int b = cwxpVar.b();
        if (i == 0) {
            throw null;
        }
        return i == b && Float.floatToIntBits(this.a) == Float.floatToIntBits(cwxpVar.c()) && cwxpVar.d() == null;
    }

    public final int hashCode() {
        int i = this.b;
        cwux.b(i);
        return (((i ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.a)) * 1000003;
    }

    public final String toString() {
        String a = cwux.a(this.b);
        float f = this.a;
        StringBuilder sb = new StringBuilder(a.length() + 99 + "null".length());
        sb.append("CrashConfigurations{enablement=");
        sb.append(a);
        sb.append(", startupSamplePercentage=");
        sb.append(f);
        sb.append(", metricExtensionProvider=");
        sb.append("null");
        sb.append("}");
        return sb.toString();
    }
}
