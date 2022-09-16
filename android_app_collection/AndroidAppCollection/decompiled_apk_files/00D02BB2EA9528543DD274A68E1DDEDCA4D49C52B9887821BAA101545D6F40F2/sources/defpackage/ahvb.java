package defpackage;
/* compiled from: PG */
/* renamed from: ahvb  reason: default package */
/* loaded from: classes2.dex */
final class ahvb extends ahwa {
    private final btlu a;
    private final ahwb b;

    public ahvb(btlu btluVar, ahwb ahwbVar) {
        this.a = btluVar;
        this.b = ahwbVar;
    }

    @Override // defpackage.ahwa
    public final btlu a() {
        return this.a;
    }

    @Override // defpackage.ahwa
    public final ahwb b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahwa) {
            ahwa ahwaVar = (ahwa) obj;
            if (this.a.equals(ahwaVar.a()) && this.b.equals(ahwaVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40 + String.valueOf(valueOf2).length());
        sb.append("PendingRequestState{account=");
        sb.append(valueOf);
        sb.append(", callback=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
