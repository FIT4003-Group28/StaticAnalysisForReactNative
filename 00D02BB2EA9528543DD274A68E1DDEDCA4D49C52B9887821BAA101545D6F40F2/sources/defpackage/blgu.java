package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: blgu  reason: default package */
/* loaded from: classes3.dex */
public final class blgu extends blih {
    private final dcdc<cdjd> a;
    private final boolean b;
    private final dbsg<String> c;

    public blgu(dcdc<cdjd> dcdcVar, boolean z, dbsg<String> dbsgVar) {
        if (dcdcVar != null) {
            this.a = dcdcVar;
            this.b = z;
            this.c = dbsgVar;
            return;
        }
        throw new NullPointerException("Null fetchedPosts");
    }

    @Override // defpackage.blih
    public final dcdc<cdjd> a() {
        return this.a;
    }

    @Override // defpackage.blih
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.blih
    public final dbsg<String> c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof blih) {
            blih blihVar = (blih) obj;
            if (dchl.m(this.a, blihVar.a()) && this.b == blihVar.b() && this.c.equals(blihVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 63 + String.valueOf(valueOf2).length());
        sb.append("FetchInfo{fetchedPosts=");
        sb.append(valueOf);
        sb.append(", canLoadMore=");
        sb.append(z);
        sb.append(", continuationToken=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
