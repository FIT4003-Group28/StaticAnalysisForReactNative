package defpackage;
/* compiled from: PG */
/* renamed from: cuck  reason: default package */
/* loaded from: classes5.dex */
final class cuck extends ctzi {
    private final dbsg<cugq> a;
    private final dbsg<cufz> b;

    public cuck(dbsg<cugq> dbsgVar, dbsg<cufz> dbsgVar2) {
        this.a = dbsgVar;
        this.b = dbsgVar2;
    }

    @Override // defpackage.ctzi
    public final dbsg<cugq> a() {
        return this.a;
    }

    @Override // defpackage.ctzi
    public final dbsg<cufz> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctzi) {
            ctzi ctziVar = (ctzi) obj;
            if (this.a.equals(ctziVar.a()) && this.b.equals(ctziVar.b())) {
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
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 69 + String.valueOf(valueOf2).length());
        sb.append("OverlayActionPayload{reactionOverlayHeader=");
        sb.append(valueOf);
        sb.append(", stackedReactionWebView=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
