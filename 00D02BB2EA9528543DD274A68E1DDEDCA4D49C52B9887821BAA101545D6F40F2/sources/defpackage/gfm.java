package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gfm  reason: default package */
/* loaded from: classes6.dex */
public final class gfm extends gfz {
    private final fd a;
    private final gfu b;
    private final dcdc<gfs> c;

    public gfm(fd fdVar, gfu gfuVar, dcdc<gfs> dcdcVar) {
        this.a = fdVar;
        this.b = gfuVar;
        this.c = dcdcVar;
    }

    @Override // defpackage.gfz
    public final fd a() {
        return this.a;
    }

    @Override // defpackage.gfz
    public final gfu b() {
        return this.b;
    }

    @Override // defpackage.gfz
    public final dcdc<gfs> c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gfz) {
            gfz gfzVar = (gfz) obj;
            if (this.a.equals(gfzVar.a()) && this.b.equals(gfzVar.b()) && dchl.m(this.c, gfzVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 64 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("PushFragmentParams{fragment=");
        sb.append(valueOf);
        sb.append(", fragmentTag=");
        sb.append(valueOf2);
        sb.append(", fragmentSearchTags=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
