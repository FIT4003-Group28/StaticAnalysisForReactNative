package defpackage;
/* compiled from: PG */
/* renamed from: ctep  reason: default package */
/* loaded from: classes5.dex */
public final class ctep extends ctfn {
    private final String a;
    private final dcdc<cufh> b;

    public ctep(String str, dcdc<cufh> dcdcVar) {
        this.a = str;
        this.b = dcdcVar;
    }

    @Override // defpackage.ctfn
    public final String a() {
        return this.a;
    }

    @Override // defpackage.ctfn
    public final dcdc<cufh> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctfn) {
            ctfn ctfnVar = (ctfn) obj;
            if (this.a.equals(ctfnVar.a()) && dchl.m(this.b, ctfnVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 45 + String.valueOf(valueOf).length());
        sb.append("ListMessagesResult{nextPageToken=");
        sb.append(str);
        sb.append(", messages=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
