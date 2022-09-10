package defpackage;
/* compiled from: PG */
/* renamed from: cudj  reason: default package */
/* loaded from: classes5.dex */
final class cudj extends cufz {
    private final cugq a;
    private final String b;

    public cudj(cugq cugqVar, String str) {
        this.a = cugqVar;
        this.b = str;
    }

    @Override // defpackage.cufz
    public final cugq a() {
        return this.a;
    }

    @Override // defpackage.cufz
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cufz) {
            cufz cufzVar = (cufz) obj;
            if (this.a.equals(cufzVar.a()) && this.b.equals(cufzVar.b())) {
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
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39 + String.valueOf(str).length());
        sb.append("CustomizedWebView{webViewHeader=");
        sb.append(valueOf);
        sb.append(", url=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
