package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rft  reason: default package */
/* loaded from: classes7.dex */
public final class rft extends rhb {
    private final dbsg<akqq> a;
    private final dbsg<akqi> b;

    public rft(dbsg<akqq> dbsgVar, dbsg<akqi> dbsgVar2) {
        this.a = dbsgVar;
        this.b = dbsgVar2;
    }

    @Override // defpackage.rhb
    public final dbsg<akqq> a() {
        return this.a;
    }

    @Override // defpackage.rhb
    public final dbsg<akqi> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rhb) {
            rhb rhbVar = (rhb) obj;
            if (this.a.equals(rhbVar.a()) && this.b.equals(rhbVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30 + String.valueOf(valueOf2).length());
        sb.append("PlaceData{latLng=");
        sb.append(valueOf);
        sb.append(", featureId=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
