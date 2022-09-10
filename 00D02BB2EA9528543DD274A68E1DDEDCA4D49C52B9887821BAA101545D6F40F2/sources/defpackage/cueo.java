package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cueo  reason: default package */
/* loaded from: classes5.dex */
public final class cueo extends cuib {
    public final String a;
    public final String b;
    public final dcdc<cuhz> c;
    public final int d;
    public final String e;

    public cueo(String str, String str2, dcdc<cuhz> dcdcVar, int i, String str3) {
        this.a = str;
        this.b = str2;
        this.c = dcdcVar;
        this.d = i;
        this.e = str3;
    }

    @Override // defpackage.cuib
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cuib
    public final String b() {
        return this.b;
    }

    @Override // defpackage.cuib
    public final dcdc<cuhz> c() {
        return this.c;
    }

    @Override // defpackage.cuib
    public final int d() {
        return this.d;
    }

    @Override // defpackage.cuib
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cuib) {
            cuib cuibVar = (cuib) obj;
            if (this.a.equals(cuibVar.a()) && this.b.equals(cuibVar.b()) && dchl.m(this.c, cuibVar.c()) && this.d == cuibVar.d() && this.e.equals(cuibVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cuib
    public final cuia f() {
        return new cuen(this);
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String valueOf = String.valueOf(this.c);
        int i = this.d;
        String str3 = this.e;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 81 + length2 + String.valueOf(valueOf).length() + String.valueOf(str3).length());
        sb.append("SuggestionList{id=");
        sb.append(str);
        sb.append(", messageId=");
        sb.append(str2);
        sb.append(", suggestions=");
        sb.append(valueOf);
        sb.append(", renderStyle=");
        sb.append(i);
        sb.append(", hintText=");
        sb.append(str3);
        sb.append("}");
        return sb.toString();
    }
}
