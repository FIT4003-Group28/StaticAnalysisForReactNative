package defpackage;
/* compiled from: PG */
/* renamed from: cdgr  reason: default package */
/* loaded from: classes4.dex */
final class cdgr extends cdgv {
    private final dcdc<cdgx> a;
    private final cdhg b;

    public cdgr(dcdc<cdgx> dcdcVar, @dzsi cdhg cdhgVar) {
        if (dcdcVar != null) {
            this.a = dcdcVar;
            this.b = cdhgVar;
            return;
        }
        throw new NullPointerException("Null faces");
    }

    @Override // defpackage.cdgv
    public final dcdc<cdgx> a() {
        return this.a;
    }

    @Override // defpackage.cdgv
    @dzsi
    public final cdhg b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        cdhg cdhgVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cdgv) {
            cdgv cdgvVar = (cdgv) obj;
            if (dchl.m(this.a, cdgvVar.a()) && ((cdhgVar = this.b) != null ? cdhgVar.equals(cdgvVar.b()) : cdgvVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        cdhg cdhgVar = this.b;
        return hashCode ^ (cdhgVar == null ? 0 : cdhgVar.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32 + String.valueOf(valueOf2).length());
        sb.append("DetectionResult{faces=");
        sb.append(valueOf);
        sb.append(", reason=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
