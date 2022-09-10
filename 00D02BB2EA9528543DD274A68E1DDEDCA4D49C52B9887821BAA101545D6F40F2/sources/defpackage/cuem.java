package defpackage;
/* compiled from: PG */
/* renamed from: cuem  reason: default package */
/* loaded from: classes5.dex */
final class cuem extends cuhz {
    private final int a;
    private final String b;
    private final dbsg<cugd> c;
    private final ctzl d;
    private final String e;

    public cuem(int i, String str, dbsg<cugd> dbsgVar, ctzl ctzlVar, String str2) {
        this.a = i;
        this.b = str;
        this.c = dbsgVar;
        this.d = ctzlVar;
        this.e = str2;
    }

    @Override // defpackage.cuhz
    public final int a() {
        return this.a;
    }

    @Override // defpackage.cuhz
    public final String b() {
        return this.b;
    }

    @Override // defpackage.cuhz
    public final dbsg<cugd> c() {
        return this.c;
    }

    @Override // defpackage.cuhz
    public final ctzl d() {
        return this.d;
    }

    @Override // defpackage.cuhz
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cuhz) {
            cuhz cuhzVar = (cuhz) obj;
            if (this.a == cuhzVar.a() && this.b.equals(cuhzVar.b()) && this.c.equals(cuhzVar.c()) && this.d.equals(cuhzVar.d()) && this.e.equals(cuhzVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String str2 = this.e;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 72 + length2 + String.valueOf(valueOf2).length() + String.valueOf(str2).length());
        sb.append("Suggestion{id=");
        sb.append(i);
        sb.append(", text=");
        sb.append(str);
        sb.append(", lighterIcon=");
        sb.append(valueOf);
        sb.append(", action=");
        sb.append(valueOf2);
        sb.append(", secondaryText=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
