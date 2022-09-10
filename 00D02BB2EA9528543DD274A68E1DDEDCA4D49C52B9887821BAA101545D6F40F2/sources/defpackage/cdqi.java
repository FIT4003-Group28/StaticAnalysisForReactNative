package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cdqi  reason: default package */
/* loaded from: classes4.dex */
public final class cdqi extends cdrh {
    public final dbsg<String> a;
    public final dbsg<String> b;
    public final bvrt<dnti> c;
    public final boolean d;

    public cdqi(dbsg<String> dbsgVar, dbsg<String> dbsgVar2, bvrt<dnti> bvrtVar, boolean z) {
        this.a = dbsgVar;
        this.b = dbsgVar2;
        this.c = bvrtVar;
        this.d = z;
    }

    @Override // defpackage.cdiy
    public final dbsg<String> d() {
        return this.a;
    }

    @Override // defpackage.cdiy
    public final dbsg<String> e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cdrh) {
            cdrh cdrhVar = (cdrh) obj;
            if (this.a.equals(cdrhVar.d()) && this.b.equals(cdrhVar.e()) && this.c.equals(cdrhVar.f()) && this.d == cdrhVar.g()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cdrh
    public final bvrt<dnti> f() {
        return this.c;
    }

    @Override // defpackage.cdrh
    public final boolean g() {
        return this.d;
    }

    @Override // defpackage.cdrh
    public final cdrg h() {
        return new cdqh(this);
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        boolean z = this.d;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 135 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("TactileReviewOwnerResponse{editReplyDialogWebviewUrl=");
        sb.append(valueOf);
        sb.append(", deleteReplyDialogWebviewUrl=");
        sb.append(valueOf2);
        sb.append(", ownerResponseSerializable=");
        sb.append(valueOf3);
        sb.append(", showTranslation=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
