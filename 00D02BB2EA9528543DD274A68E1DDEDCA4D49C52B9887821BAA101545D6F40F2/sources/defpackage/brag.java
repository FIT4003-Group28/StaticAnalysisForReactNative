package defpackage;
/* compiled from: PG */
/* renamed from: brag  reason: default package */
/* loaded from: classes4.dex */
final class brag extends bram {
    private final bwrs<brln> a;
    private final boolean b;
    private final boolean c;
    private final cjqk d;
    private final gfw e;

    public brag(bwrs<brln> bwrsVar, boolean z, boolean z2, cjqk cjqkVar, @dzsi gfw gfwVar) {
        this.a = bwrsVar;
        this.b = z;
        this.c = z2;
        this.d = cjqkVar;
        this.e = gfwVar;
    }

    @Override // defpackage.bram
    public final bwrs<brln> a() {
        return this.a;
    }

    @Override // defpackage.bram
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.bram
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.bram
    public final cjqk d() {
        return this.d;
    }

    @Override // defpackage.bram
    @dzsi
    public final gfw e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        gfw gfwVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bram) {
            bram bramVar = (bram) obj;
            if (this.a.equals(bramVar.a()) && this.b == bramVar.b() && this.c == bramVar.c() && this.d.equals(bramVar.d()) && ((gfwVar = this.e) != null ? gfwVar.equals(bramVar.e()) : bramVar.e() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003;
        if (true == this.c) {
            i = 1231;
        }
        int hashCode2 = (((hashCode ^ i) * 1000003) ^ this.d.hashCode()) * 1000003;
        gfw gfwVar = this.e;
        return hashCode2 ^ (gfwVar == null ? 0 : gfwVar.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        boolean z2 = this.c;
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 154 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("DisplaySearchResultParams{searchRequestRef=");
        sb.append(valueOf);
        sb.append(", replaceCurrentTopFragment=");
        sb.append(z);
        sb.append(", shouldChangeCamera=");
        sb.append(z2);
        sb.append(", searchLoggedEvent=");
        sb.append(valueOf2);
        sb.append(", waypointSearchResultListener=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
