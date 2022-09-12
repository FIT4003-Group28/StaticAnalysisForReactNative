package defpackage;
/* compiled from: PG */
/* renamed from: cxdu  reason: default package */
/* loaded from: classes5.dex */
final class cxdu extends cxef {
    private final float a;
    private final int b;

    public cxdu(int i, float f) {
        this.b = i;
        this.a = f;
    }

    @Override // defpackage.cxef, defpackage.cwuw
    public final int b() {
        return this.b;
    }

    @Override // defpackage.cxef
    public final float c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cxef)) {
            return false;
        }
        cxef cxefVar = (cxef) obj;
        int i = this.b;
        int b = cxefVar.b();
        if (i == 0) {
            throw null;
        }
        return i == b && Float.floatToIntBits(this.a) == Float.floatToIntBits(cxefVar.c());
    }

    public final int hashCode() {
        int i = this.b;
        cwux.b(i);
        return ((i ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.a);
    }

    public final String toString() {
        String a = cwux.a(this.b);
        float f = this.a;
        StringBuilder sb = new StringBuilder(a.length() + 69);
        sb.append("TraceConfigurations{enablement=");
        sb.append(a);
        sb.append(", samplingProbability=");
        sb.append(f);
        sb.append("}");
        return sb.toString();
    }
}
