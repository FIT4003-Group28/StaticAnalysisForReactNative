package defpackage;
/* compiled from: PG */
/* renamed from: cxbr  reason: default package */
/* loaded from: classes5.dex */
final class cxbr extends cxcg {
    private final boolean a;
    private final dbsg<cxbw> b;
    private final int c;

    public cxbr(int i, boolean z, dbsg<cxbw> dbsgVar) {
        this.c = i;
        this.a = z;
        this.b = dbsgVar;
    }

    @Override // defpackage.cxcg, defpackage.cwuw
    public final int b() {
        return this.c;
    }

    @Override // defpackage.cxcg
    public final boolean c() {
        return this.a;
    }

    @Override // defpackage.cxcg
    public final dbsg<cxbw> d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cxcg)) {
            return false;
        }
        cxcg cxcgVar = (cxcg) obj;
        int i = this.c;
        int b = cxcgVar.b();
        if (i == 0) {
            throw null;
        }
        return i == b && this.a == cxcgVar.c() && this.b.equals(cxcgVar.d());
    }

    public final int hashCode() {
        int i = this.c;
        cwux.b(i);
        return ((((i ^ 1000003) * 1000003) ^ (true != this.a ? 1237 : 1231)) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String a = cwux.a(this.c);
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(a.length() + 80 + String.valueOf(valueOf).length());
        sb.append("StorageConfigurations{enablement=");
        sb.append(a);
        sb.append(", manualCapture=");
        sb.append(z);
        sb.append(", dirStatsConfigurations=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
