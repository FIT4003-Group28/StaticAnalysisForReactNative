package defpackage;
/* compiled from: PG */
/* renamed from: cten  reason: default package */
/* loaded from: classes5.dex */
public final class cten extends ctfl {
    private final String a;
    private final dcdc<cufd> b;

    public cten(String str, dcdc<cufd> dcdcVar) {
        this.a = str;
        this.b = dcdcVar;
    }

    @Override // defpackage.ctfl
    public final String a() {
        return this.a;
    }

    @Override // defpackage.ctfl
    public final dcdc<cufd> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctfl) {
            ctfl ctflVar = (ctfl) obj;
            if (this.a.equals(ctflVar.a()) && dchl.m(this.b, ctflVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 55 + String.valueOf(valueOf).length());
        sb.append("ListConversationsResult{nextPageToken=");
        sb.append(str);
        sb.append(", conversations=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
