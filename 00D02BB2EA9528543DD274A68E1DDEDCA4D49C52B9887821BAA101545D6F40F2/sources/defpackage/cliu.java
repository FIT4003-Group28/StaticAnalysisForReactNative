package defpackage;

import java.net.URI;
/* compiled from: PG */
/* renamed from: cliu  reason: default package */
/* loaded from: classes5.dex */
public final class cliu extends cljw {
    private final URI a;
    private final dced<String, String> b;
    private final cljr c;
    private final cljs d;

    public cliu(URI uri, dced<String, String> dcedVar, cljr cljrVar, cljs cljsVar) {
        this.a = uri;
        this.b = dcedVar;
        this.c = cljrVar;
        this.d = cljsVar;
    }

    @Override // defpackage.cljw
    public final URI a() {
        return this.a;
    }

    @Override // defpackage.cljw
    public final dced<String, String> b() {
        return this.b;
    }

    @Override // defpackage.cljw
    public final cljr c() {
        return this.c;
    }

    @Override // defpackage.cljw
    @dzsi
    public final clkx d() {
        return null;
    }

    @Override // defpackage.cljw
    public final cljs e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cljw) {
            cljw cljwVar = (cljw) obj;
            if (this.a.equals(cljwVar.a()) && dckz.f(this.b, cljwVar.b()) && this.c.equals(cljwVar.c()) && cljwVar.d() == null && this.d.equals(cljwVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * (-721379959)) ^ this.d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 88 + length2 + length3 + "null".length() + String.valueOf(valueOf4).length());
        sb.append("DownloadRequest{uri=");
        sb.append(valueOf);
        sb.append(", headers=");
        sb.append(valueOf2);
        sb.append(", downloadConstraints=");
        sb.append(valueOf3);
        sb.append(", oAuthTokenProvider=");
        sb.append("null");
        sb.append(", destination=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
