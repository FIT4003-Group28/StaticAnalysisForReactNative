package defpackage;
/* compiled from: PG */
/* renamed from: clir  reason: default package */
/* loaded from: classes5.dex */
final class clir extends cljr {
    private final boolean c;
    private final dcep<cljq> d;

    public clir(boolean z, dcep<cljq> dcepVar) {
        this.c = z;
        this.d = dcepVar;
    }

    @Override // defpackage.cljr
    public final boolean a() {
        return this.c;
    }

    @Override // defpackage.cljr
    public final dcep<cljq> b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cljr) {
            cljr cljrVar = (cljr) obj;
            if (this.c == cljrVar.a() && this.d.equals(cljrVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.c ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        boolean z = this.c;
        String valueOf = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 73);
        sb.append("DownloadConstraints{requireUnmeteredNetwork=");
        sb.append(z);
        sb.append(", requiredNetworkTypes=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
