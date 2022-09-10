package defpackage;
/* compiled from: PG */
/* renamed from: cued  reason: default package */
/* loaded from: classes5.dex */
final class cued extends cuhd {
    private final Long a;
    private final dcdc<Integer> b;

    public cued(Long l, dcdc<Integer> dcdcVar) {
        this.a = l;
        this.b = dcdcVar;
    }

    @Override // defpackage.cuhd
    public final Long a() {
        return this.a;
    }

    @Override // defpackage.cuhd
    public final dcdc<Integer> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cuhd) {
            cuhd cuhdVar = (cuhd) obj;
            if (this.a.equals(cuhdVar.a()) && dchl.m(this.b, cuhdVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 80 + String.valueOf(valueOf2).length());
        sb.append("RegistrationProperties{lastCapabilitiesReportTimeMs=");
        sb.append(valueOf);
        sb.append(", lastReportedCapabilities=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
