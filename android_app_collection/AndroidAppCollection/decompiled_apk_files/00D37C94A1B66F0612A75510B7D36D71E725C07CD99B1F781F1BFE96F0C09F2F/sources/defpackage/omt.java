package defpackage;
/* compiled from: PG */
/* renamed from: omt  reason: default package */
/* loaded from: classes3.dex */
final class omt {
    public final amup a;

    public omt() {
    }

    public omt(amup amupVar) {
        this.a = amupVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof omt)) {
            return false;
        }
        return this.a.equals(((omt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
        sb.append("WebViewPrefCookie{keyValues=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
