package defpackage;
/* compiled from: PG */
/* renamed from: bzkg  reason: default package */
/* loaded from: classes4.dex */
final class bzkg extends bzlj {
    private final dcdc<dpce> a;
    private final dbsg<String> b;
    private final dbsg<String> c;
    private final dbsg<String> d;
    private final bzjt e;

    public bzkg(dcdc<dpce> dcdcVar, dbsg<String> dbsgVar, dbsg<String> dbsgVar2, dbsg<String> dbsgVar3, bzjt bzjtVar) {
        this.a = dcdcVar;
        this.b = dbsgVar;
        this.c = dbsgVar2;
        this.d = dbsgVar3;
        this.e = bzjtVar;
    }

    @Override // defpackage.bzlj
    public final dcdc<dpce> a() {
        return this.a;
    }

    @Override // defpackage.bzlj
    public final dbsg<String> b() {
        return this.b;
    }

    @Override // defpackage.bzlj
    public final dbsg<String> c() {
        return this.c;
    }

    @Override // defpackage.bzlj
    public final dbsg<String> d() {
        return this.d;
    }

    @Override // defpackage.bzlj
    public final bzjt e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bzlj) {
            bzlj bzljVar = (bzlj) obj;
            if (dchl.m(this.a, bzljVar.a()) && this.b.equals(bzljVar.b()) && this.c.equals(bzljVar.c()) && this.d.equals(bzljVar.d()) && this.e.equals(bzljVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 82 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("TransitContext{transitLineSnippets=");
        sb.append(valueOf);
        sb.append(", headsign=");
        sb.append(valueOf2);
        sb.append(", platform=");
        sb.append(valueOf3);
        sb.append(", expressType=");
        sb.append(valueOf4);
        sb.append(", vehicle=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
