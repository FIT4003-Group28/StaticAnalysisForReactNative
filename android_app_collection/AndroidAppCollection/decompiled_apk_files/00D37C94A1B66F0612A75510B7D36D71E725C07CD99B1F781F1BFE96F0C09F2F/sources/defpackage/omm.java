package defpackage;
/* compiled from: PG */
/* renamed from: omm  reason: default package */
/* loaded from: classes3.dex */
final class omm {
    private final String a;
    private final boolean b;

    public omm(String str, boolean z) {
        if (str != null) {
            this.a = str;
            this.b = z;
            return;
        }
        throw new NullPointerException("Null url");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof omm) {
            omm ommVar = (omm) obj;
            if (this.a.equals(ommVar.a) && this.b == ommVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.a;
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 35);
        sb.append("WebViewState{url=");
        sb.append(str);
        sb.append(", canGoBack=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    public omm() {
    }
}
