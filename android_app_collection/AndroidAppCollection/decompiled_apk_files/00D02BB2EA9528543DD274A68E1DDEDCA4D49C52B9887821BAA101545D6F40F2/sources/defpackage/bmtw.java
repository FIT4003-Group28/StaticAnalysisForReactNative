package defpackage;
/* compiled from: PG */
/* renamed from: bmtw  reason: default package */
/* loaded from: classes3.dex */
final class bmtw extends bmud {
    private final eapg a;
    private final bmup b;
    private final dcdc<String> c;

    public bmtw(eapg eapgVar, bmup bmupVar, dcdc<String> dcdcVar) {
        if (eapgVar != null) {
            this.a = eapgVar;
            this.b = bmupVar;
            if (dcdcVar != null) {
                this.c = dcdcVar;
                return;
            }
            throw new NullPointerException("Null extraLabels");
        }
        throw new NullPointerException("Null day");
    }

    @Override // defpackage.bmud
    public final eapg a() {
        return this.a;
    }

    @Override // defpackage.bmud
    public final bmup b() {
        return this.b;
    }

    @Override // defpackage.bmud
    public final dcdc<String> c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bmud) {
            bmud bmudVar = (bmud) obj;
            if (this.a.equals(bmudVar.a()) && this.b.equals(bmudVar.b()) && dchl.m(this.c, bmudVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 52 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("DatedVisitInstant{day=");
        sb.append(valueOf);
        sb.append(", visitInstant=");
        sb.append(valueOf2);
        sb.append(", extraLabels=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
