package defpackage;
/* compiled from: PG */
/* renamed from: arrc  reason: default package */
/* loaded from: classes2.dex */
public final class arrc extends arrg {
    private final ddnk a;
    private final Boolean b;

    public arrc(ddnk ddnkVar, @dzsi Boolean bool) {
        if (ddnkVar != null) {
            this.a = ddnkVar;
            this.b = bool;
            return;
        }
        throw new NullPointerException("Null getNavigationMediaIntegrationProvider");
    }

    @Override // defpackage.arrg
    public final ddnk a() {
        return this.a;
    }

    @Override // defpackage.arrg
    @dzsi
    public final Boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (obj instanceof arrg) {
            arrg arrgVar = (arrg) obj;
            if (this.a.equals(arrgVar.a()) && ((bool = this.b) != null ? bool.equals(arrgVar.b()) : arrgVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Boolean bool = this.b;
        return hashCode ^ (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 63 + String.valueOf(valueOf2).length());
        sb.append("MediaStatus{getNavigationMediaIntegrationProvider=");
        sb.append(valueOf);
        sb.append(", isPlaying=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
