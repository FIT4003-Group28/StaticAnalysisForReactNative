package defpackage;
/* compiled from: PG */
/* renamed from: ccgj  reason: default package */
/* loaded from: classes4.dex */
public final class ccgj extends ccgq {
    public final ddho a;
    public final ddho b;
    public final ddho c;
    public final ddho d;

    public ccgj(ddho ddhoVar, ddho ddhoVar2, ddho ddhoVar3, ddho ddhoVar4) {
        this.a = ddhoVar;
        this.b = ddhoVar2;
        this.c = ddhoVar3;
        this.d = ddhoVar4;
    }

    @Override // defpackage.ccgq
    public final ddho a() {
        return this.a;
    }

    @Override // defpackage.ccgq
    public final ddho b() {
        return this.b;
    }

    @Override // defpackage.ccgq
    public final ddho c() {
        return this.c;
    }

    @Override // defpackage.ccgq
    public final ddho d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ccgq) {
            ccgq ccgqVar = (ccgq) obj;
            if (this.a.equals(ccgqVar.a()) && this.b.equals(ccgqVar.b()) && this.c.equals(ccgqVar.c()) && this.d.equals(ccgqVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 102 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("UgcInterstitialWebViewLoggingParameters{pageImpression=");
        sb.append(valueOf);
        sb.append(", contributeMoreLink=");
        sb.append(valueOf2);
        sb.append(", dismissLink=");
        sb.append(valueOf3);
        sb.append(", backLink=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
