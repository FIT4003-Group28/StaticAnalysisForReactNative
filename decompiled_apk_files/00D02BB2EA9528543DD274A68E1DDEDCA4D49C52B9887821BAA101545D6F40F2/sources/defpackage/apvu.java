package defpackage;
/* compiled from: PG */
/* renamed from: apvu  reason: default package */
/* loaded from: classes2.dex */
final class apvu extends apvz {
    private final ctyy a;
    private final cugu b;
    private final int c;

    public apvu(ctyy ctyyVar, cugu cuguVar, int i) {
        this.a = ctyyVar;
        this.b = cuguVar;
        this.c = i;
    }

    @Override // defpackage.apvz
    public final ctyy a() {
        return this.a;
    }

    @Override // defpackage.apvz
    public final cugu b() {
        return this.b;
    }

    @Override // defpackage.apvz
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof apvz) {
            apvz apvzVar = (apvz) obj;
            if (this.a.equals(apvzVar.a()) && this.b.equals(apvzVar.b()) && this.c == apvzVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        int i = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 74 + String.valueOf(valueOf2).length());
        sb.append("LighterMessageHandle{accountContext=");
        sb.append(valueOf);
        sb.append(", message=");
        sb.append(valueOf2);
        sb.append(", messageOrigin=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
