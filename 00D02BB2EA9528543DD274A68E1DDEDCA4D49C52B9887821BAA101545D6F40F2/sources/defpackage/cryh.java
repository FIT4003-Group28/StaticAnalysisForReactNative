package defpackage;
/* compiled from: PG */
/* renamed from: cryh  reason: default package */
/* loaded from: classes5.dex */
final class cryh extends cryo {
    private final dcdc<crym> a;
    private final dbsg<Long> b;

    public cryh(dcdc<crym> dcdcVar, dbsg<Long> dbsgVar) {
        this.a = dcdcVar;
        this.b = dbsgVar;
    }

    @Override // defpackage.cryo
    public final dcdc<crym> a() {
        return this.a;
    }

    @Override // defpackage.cryo
    public final dbsg<Long> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cryo) {
            cryo cryoVar = (cryo) obj;
            if (dchl.m(this.a, cryoVar.a()) && this.b.equals(cryoVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49 + String.valueOf(valueOf2).length());
        sb.append("SuggestionSet{suggestions=");
        sb.append(valueOf);
        sb.append(", sourceDataTimestamp=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
