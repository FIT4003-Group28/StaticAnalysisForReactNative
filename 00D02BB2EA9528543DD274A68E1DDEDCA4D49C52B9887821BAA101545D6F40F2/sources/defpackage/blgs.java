package defpackage;
/* compiled from: PG */
/* renamed from: blgs  reason: default package */
/* loaded from: classes3.dex */
final class blgs extends blhy {
    private final dcdc<cdjd> b;
    private final dcdc<dwfl> c;

    public blgs(dcdc<cdjd> dcdcVar, dcdc<dwfl> dcdcVar2) {
        this.b = dcdcVar;
        this.c = dcdcVar2;
    }

    @Override // defpackage.blhy
    public final dcdc<cdjd> a() {
        return this.b;
    }

    @Override // defpackage.blhy
    public final dcdc<dwfl> b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof blhy) {
            blhy blhyVar = (blhy) obj;
            if (dchl.m(this.b, blhyVar.a()) && dchl.m(this.c, blhyVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32 + String.valueOf(valueOf2).length());
        sb.append("PostListResults{posts=");
        sb.append(valueOf);
        sb.append(", photos=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
