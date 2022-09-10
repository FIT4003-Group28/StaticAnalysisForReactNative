package defpackage;
/* compiled from: PG */
/* renamed from: cryj  reason: default package */
/* loaded from: classes5.dex */
final class cryj<T> extends cryq<T> {
    private final dcdc<T> a;
    private final dbsg<Long> b;

    public cryj(dcdc<T> dcdcVar, dbsg<Long> dbsgVar) {
        this.a = dcdcVar;
        this.b = dbsgVar;
    }

    @Override // defpackage.cryq
    public final dcdc<T> a() {
        return this.a;
    }

    @Override // defpackage.cryq
    public final dbsg<Long> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cryq) {
            cryq cryqVar = (cryq) obj;
            if (dchl.m(this.a, cryqVar.a()) && this.b.equals(cryqVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 67 + String.valueOf(valueOf2).length());
        sb.append("SuggestionSourceDataSet{suggestionsSourceData=");
        sb.append(valueOf);
        sb.append(", timestampInMillis=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
