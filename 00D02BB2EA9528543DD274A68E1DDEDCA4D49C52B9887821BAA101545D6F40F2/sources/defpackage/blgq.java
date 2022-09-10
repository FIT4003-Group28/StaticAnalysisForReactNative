package defpackage;
/* compiled from: PG */
/* renamed from: blgq  reason: default package */
/* loaded from: classes3.dex */
final class blgq extends blhw {
    public final akqi a;
    public final String b;
    public final boolean c;
    public final blif d;
    public final String e;
    public final dbsg<djck> f;
    public final String g;

    public blgq(akqi akqiVar, String str, boolean z, blif blifVar, String str2, dbsg<djck> dbsgVar, String str3) {
        this.a = akqiVar;
        this.b = str;
        this.c = z;
        this.d = blifVar;
        this.e = str2;
        this.f = dbsgVar;
        this.g = str3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.blhw
    public final akqi a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.blhw
    public final String b() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.blhw
    public final boolean c() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.blhw
    public final blif d() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.blhw
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof blhw) {
            blhw blhwVar = (blhw) obj;
            if (this.a.equals(blhwVar.a()) && this.b.equals(blhwVar.b()) && this.c == blhwVar.c() && this.d.equals(blhwVar.d()) && this.e.equals(blhwVar.e()) && this.f.equals(blhwVar.f()) && this.g.equals(blhwVar.g())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.blhw
    public final dbsg<djck> f() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.blhw
    public final String g() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.blhw
    public final blhv h() {
        return new blgp(this);
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        boolean z = this.c;
        String valueOf2 = String.valueOf(this.d);
        String str2 = this.e;
        String valueOf3 = String.valueOf(this.f);
        String str3 = this.g;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 131 + length2 + length3 + length4 + String.valueOf(valueOf3).length() + String.valueOf(str3).length());
        sb.append("PostListParameters{featureId=");
        sb.append(valueOf);
        sb.append(", filterText=");
        sb.append(str);
        sb.append(", selfPostsOnly=");
        sb.append(z);
        sb.append(", sortCriterion=");
        sb.append(valueOf2);
        sb.append(", firstPostId=");
        sb.append(str2);
        sb.append(", topicFilter=");
        sb.append(valueOf3);
        sb.append(", normalizedFilterText=");
        sb.append(str3);
        sb.append("}");
        return sb.toString();
    }
}
