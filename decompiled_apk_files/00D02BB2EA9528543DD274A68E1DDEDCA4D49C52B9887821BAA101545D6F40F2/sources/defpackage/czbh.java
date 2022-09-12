package defpackage;
/* compiled from: PG */
/* renamed from: czbh  reason: default package */
/* loaded from: classes5.dex */
final class czbh extends czbm {
    private final String a;
    private final dcdc<String> b;

    public czbh(String str, dcdc<String> dcdcVar) {
        this.a = str;
        this.b = dcdcVar;
    }

    @Override // defpackage.czbm
    public final String a() {
        return this.a;
    }

    @Override // defpackage.czbm
    public final dcdc<String> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof czbm) {
            czbm czbmVar = (czbm) obj;
            if (this.a.equals(czbmVar.a()) && dchl.m(this.b, czbmVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 28 + String.valueOf(valueOf).length());
        sb.append("Match{lookupId=");
        sb.append(str);
        sb.append(", personIds=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
