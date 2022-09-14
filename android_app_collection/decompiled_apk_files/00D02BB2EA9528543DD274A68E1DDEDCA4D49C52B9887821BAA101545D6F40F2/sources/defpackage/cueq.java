package defpackage;
/* compiled from: PG */
/* renamed from: cueq  reason: default package */
/* loaded from: classes5.dex */
final class cueq extends cuif {
    private final String a;
    private final dcdc<cuie> b;

    public cueq(String str, dcdc<cuie> dcdcVar) {
        this.a = str;
        this.b = dcdcVar;
    }

    @Override // defpackage.cuif
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cuif
    public final dcdc<cuie> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cuif) {
            cuif cuifVar = (cuif) obj;
            if (this.a.equals(cuifVar.a()) && dchl.m(this.b, cuifVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(valueOf).length());
        sb.append("UrlAction{url=");
        sb.append(str);
        sb.append(", replacements=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
