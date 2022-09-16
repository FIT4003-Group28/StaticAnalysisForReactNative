package defpackage;
/* compiled from: PG */
/* renamed from: cyuv  reason: default package */
/* loaded from: classes5.dex */
public final class cyuv extends cywh {
    private final String a;
    private final String b;
    private final String c;
    private final duej d;
    private final String e;
    private final boolean f;

    public cyuv(String str, @dzsi String str2, @dzsi String str3, duej duejVar, @dzsi String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = duejVar;
        this.e = str4;
        this.f = z;
    }

    @Override // defpackage.cywh
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cywh
    @dzsi
    public final String b() {
        return this.b;
    }

    @Override // defpackage.cywh
    @dzsi
    public final String c() {
        return this.c;
    }

    @Override // defpackage.cywh
    public final duej d() {
        return this.d;
    }

    @Override // defpackage.cywh
    @dzsi
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cywh) {
            cywh cywhVar = (cywh) obj;
            if (this.a.equals(cywhVar.a()) && ((str = this.b) != null ? str.equals(cywhVar.b()) : cywhVar.b() == null) && ((str2 = this.c) != null ? str2.equals(cywhVar.c()) : cywhVar.c() == null) && this.d.equals(cywhVar.d()) && ((str3 = this.e) != null ? str3.equals(cywhVar.e()) : cywhVar.e() == null) && this.f == cywhVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cywh
    public final boolean f() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int hashCode3 = (((hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003;
        String str3 = this.e;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode3 ^ i) * 1000003) ^ (true != this.f ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String valueOf = String.valueOf(this.d);
        String str4 = this.e;
        boolean z = this.f;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(length + 97 + length2 + length3 + String.valueOf(valueOf).length() + String.valueOf(str4).length());
        sb.append("Name{displayName=");
        sb.append(str);
        sb.append(", givenName=");
        sb.append(str2);
        sb.append(", familyName=");
        sb.append(str3);
        sb.append(", containerType=");
        sb.append(valueOf);
        sb.append(", encodedContainerId=");
        sb.append(str4);
        sb.append(", isPrimary=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
