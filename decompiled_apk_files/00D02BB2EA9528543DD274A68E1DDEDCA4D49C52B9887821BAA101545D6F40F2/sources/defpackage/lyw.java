package defpackage;
/* compiled from: PG */
/* renamed from: lyw  reason: default package */
/* loaded from: classes7.dex */
final class lyw extends lyy {
    private final lzc a;
    private final boolean b;

    public lyw(lzc lzcVar, boolean z) {
        this.a = lzcVar;
        this.b = z;
    }

    @Override // defpackage.lyy
    public final lzc a() {
        return this.a;
    }

    @Override // defpackage.lyy
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lyy) {
            lyy lyyVar = (lyy) obj;
            if (this.a.equals(lyyVar.a()) && this.b == lyyVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 95);
        sb.append("CarGuidedNavConstructionParams{entryPoint=");
        sb.append(valueOf);
        sb.append(", shouldSuppressBatteryAlertsOnNavigationStart=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
