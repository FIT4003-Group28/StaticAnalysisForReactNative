package defpackage;
/* compiled from: PG */
/* renamed from: rfs  reason: default package */
/* loaded from: classes7.dex */
public final class rfs extends rgv {
    public final dbsg<rhj> a;
    public final dbsg<rhj> b;

    public rfs(dbsg<rhj> dbsgVar, dbsg<rhj> dbsgVar2) {
        this.a = dbsgVar;
        this.b = dbsgVar2;
    }

    @Override // defpackage.rgv
    public final dbsg<rhj> a() {
        return this.a;
    }

    @Override // defpackage.rgv
    public final dbsg<rhj> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rgv) {
            rgv rgvVar = (rgv) obj;
            if (this.a.equals(rgvVar.a()) && this.b.equals(rgvVar.b())) {
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
        sb.append("CommuteFrequentTripSet{toWork=");
        sb.append(valueOf);
        sb.append(", toHome=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
