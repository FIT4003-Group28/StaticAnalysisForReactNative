package defpackage;
/* compiled from: PG */
/* renamed from: bkpb  reason: default package */
/* loaded from: classes3.dex */
final class bkpb extends bkpg {
    private final String a;
    private final bvrt<djck> b;
    private final boolean c;
    private final cdjk d;

    public bkpb(String str, @dzsi bvrt<djck> bvrtVar, boolean z, cdjk cdjkVar) {
        this.a = str;
        this.b = bvrtVar;
        this.c = z;
        this.d = cdjkVar;
    }

    @Override // defpackage.bkpg
    public final String a() {
        return this.a;
    }

    @Override // defpackage.bkpg
    @dzsi
    public final bvrt<djck> b() {
        return this.b;
    }

    @Override // defpackage.bkpg
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.bkpg
    public final cdjk d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        bvrt<djck> bvrtVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bkpg) {
            bkpg bkpgVar = (bkpg) obj;
            if (this.a.equals(bkpgVar.a()) && ((bvrtVar = this.b) != null ? bvrtVar.equals(bkpgVar.b()) : bkpgVar.b() == null) && this.c == bkpgVar.c() && this.d.equals(bkpgVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        bvrt<djck> bvrtVar = this.b;
        return ((((hashCode ^ (bvrtVar == null ? 0 : bvrtVar.hashCode())) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        boolean z = this.c;
        String valueOf2 = String.valueOf(this.d);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 89 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("ReviewLeafPageOptions{filterText=");
        sb.append(str);
        sb.append(", serializedTopicFilter=");
        sb.append(valueOf);
        sb.append(", showPlaceInfo=");
        sb.append(z);
        sb.append(", surface=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
