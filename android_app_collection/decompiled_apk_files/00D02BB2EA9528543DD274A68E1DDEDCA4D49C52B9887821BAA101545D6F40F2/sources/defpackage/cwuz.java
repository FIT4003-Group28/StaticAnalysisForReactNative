package defpackage;
/* compiled from: PG */
/* renamed from: cwuz  reason: default package */
/* loaded from: classes5.dex */
final class cwuz extends cwvf {
    private final int a;
    private final cwvd b;

    public cwuz(int i, cwvd cwvdVar) {
        this.a = i;
        this.b = cwvdVar;
    }

    @Override // defpackage.cwvf, defpackage.cwuw
    public final int b() {
        return this.a;
    }

    @Override // defpackage.cwvf
    public final cwvd c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cwvf)) {
            return false;
        }
        cwvf cwvfVar = (cwvf) obj;
        int i = this.a;
        int b = cwvfVar.b();
        if (i == 0) {
            throw null;
        }
        return i == b && this.b.equals(cwvfVar.c());
    }

    public final int hashCode() {
        int i = this.a;
        cwux.b(i);
        return ((i ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String a = cwux.a(this.a);
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(a.length() + 60 + String.valueOf(valueOf).length());
        sb.append("BatteryConfigurations{enablement=");
        sb.append(a);
        sb.append(", metricExtensionProvider=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
