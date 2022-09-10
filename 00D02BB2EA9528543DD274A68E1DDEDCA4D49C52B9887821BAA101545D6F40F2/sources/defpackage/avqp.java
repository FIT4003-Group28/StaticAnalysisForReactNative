package defpackage;
/* compiled from: PG */
/* renamed from: avqp  reason: default package */
/* loaded from: classes3.dex */
final class avqp extends avqt {
    private final avii a;
    private final avpy b;

    public avqp(avpy avpyVar, avii aviiVar) {
        this.b = avpyVar;
        this.a = aviiVar;
    }

    @Override // defpackage.avqt
    @dzsi
    public final avii a() {
        return this.a;
    }

    @Override // defpackage.avqt
    public final avpy b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        avii aviiVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof avqt) {
            avqt avqtVar = (avqt) obj;
            if (this.b.equals(avqtVar.b()) && ((aviiVar = this.a) != null ? aviiVar.equals(avqtVar.a()) : avqtVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() ^ 1000003) * 1000003;
        avii aviiVar = this.a;
        return hashCode ^ (aviiVar == null ? 0 : aviiVar.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40 + String.valueOf(valueOf2).length());
        sb.append("FetchAndListeners{fetch=");
        sb.append(valueOf);
        sb.append(", syncListener=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
