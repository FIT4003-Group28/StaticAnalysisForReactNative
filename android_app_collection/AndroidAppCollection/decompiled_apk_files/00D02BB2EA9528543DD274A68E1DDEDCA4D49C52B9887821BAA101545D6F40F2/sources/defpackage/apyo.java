package defpackage;
/* compiled from: PG */
/* renamed from: apyo  reason: default package */
/* loaded from: classes2.dex */
final class apyo extends apze {
    private final dbsg<String> a;
    private final dbsg<String> b;
    private final String c;
    private final boolean d;
    private final apzb e;

    public apyo(dbsg<String> dbsgVar, dbsg<String> dbsgVar2, String str, boolean z, apzb apzbVar) {
        this.a = dbsgVar;
        this.b = dbsgVar2;
        this.c = str;
        this.d = z;
        this.e = apzbVar;
    }

    @Override // defpackage.apze
    public final dbsg<String> a() {
        return this.a;
    }

    @Override // defpackage.apze
    public final dbsg<String> b() {
        return this.b;
    }

    @Override // defpackage.apze
    public final String c() {
        return this.c;
    }

    @Override // defpackage.apze
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.apze
    public final apzb e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof apze) {
            apze apzeVar = (apze) obj;
            if (this.a.equals(apzeVar.a()) && this.b.equals(apzeVar.b()) && this.c.equals(apzeVar.c()) && this.d == apzeVar.d() && this.e.equals(apzeVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String str = this.c;
        boolean z = this.d;
        String valueOf3 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 142 + length2 + String.valueOf(str).length() + String.valueOf(valueOf3).length());
        sb.append("OpenMerchantConversationListPageParams{title=");
        sb.append(valueOf);
        sb.append(", subtitle=");
        sb.append(valueOf2);
        sb.append(", serverBusinessListingId=");
        sb.append(str);
        sb.append(", openInboxOnTapBack=");
        sb.append(z);
        sb.append(", openConversationEntryPointType=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
