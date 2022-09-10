package defpackage;
/* compiled from: PG */
/* renamed from: avyw  reason: default package */
/* loaded from: classes.dex */
final class avyw extends avzg {
    private final avzc a;
    private final avze b;

    public avyw(avzc avzcVar, avze avzeVar) {
        this.a = avzcVar;
        this.b = avzeVar;
    }

    @Override // defpackage.avzg
    public final avzc a() {
        return this.a;
    }

    @Override // defpackage.avzg
    public final avze b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof avzg) {
            avzg avzgVar = (avzg) obj;
            if (this.a.equals(avzgVar.a()) && this.b.equals(avzgVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50 + String.valueOf(valueOf2).length());
        sb.append("OfflineInstanceInfo{instanceContext=");
        sb.append(valueOf);
        sb.append(", instanceId=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
