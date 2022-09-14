package defpackage;
/* compiled from: PG */
/* renamed from: ctev  reason: default package */
/* loaded from: classes5.dex */
final class ctev extends ctft {
    private final dbsg<ctyy> a;
    private final dbsg<ctzp> b;
    private final dbsg<Long> c;
    private final int d;

    public ctev(int i, dbsg<ctyy> dbsgVar, dbsg<ctzp> dbsgVar2, dbsg<Long> dbsgVar3) {
        this.d = i;
        this.a = dbsgVar;
        this.b = dbsgVar2;
        this.c = dbsgVar3;
    }

    @Override // defpackage.ctft
    public final dbsg<ctyy> a() {
        return this.a;
    }

    @Override // defpackage.ctft
    public final dbsg<ctzp> b() {
        return this.b;
    }

    @Override // defpackage.ctft
    public final dbsg<Long> c() {
        return this.c;
    }

    @Override // defpackage.ctft
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ctft)) {
            return false;
        }
        ctft ctftVar = (ctft) obj;
        int i = this.d;
        int d = ctftVar.d();
        if (i == 0) {
            throw null;
        }
        return i == d && this.a.equals(ctftVar.a()) && this.b.equals(ctftVar.b()) && this.c.equals(ctftVar.c());
    }

    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return ((((((i ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        }
        throw null;
    }

    public final String toString() {
        int i = this.d;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RETRY" : "FAILURE" : "SUCCESS" : "UNKNOWN";
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(str.length() + 77 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("RegisterRefreshResult{status=");
        sb.append(str);
        sb.append(", accountContext=");
        sb.append(valueOf);
        sb.append(", authToken=");
        sb.append(valueOf2);
        sb.append(", serverTimestamp=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
