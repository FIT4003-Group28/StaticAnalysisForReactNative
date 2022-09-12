package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jhj  reason: default package */
/* loaded from: classes7.dex */
public final class jhj extends jhv {
    private final cjtd a;
    private final dcdc<jho> b;
    private final jhs c;
    private final jhr d;
    private final Integer e;
    private final Integer f;
    private final String g;

    public jhj(cjtd cjtdVar, dcdc<jho> dcdcVar, @dzsi jhs jhsVar, @dzsi jhr jhrVar, @dzsi Integer num, @dzsi Integer num2, @dzsi String str) {
        this.a = cjtdVar;
        this.b = dcdcVar;
        this.c = jhsVar;
        this.d = jhrVar;
        this.e = num;
        this.f = num2;
        this.g = str;
    }

    @Override // defpackage.jht
    public final cjtd a() {
        return this.a;
    }

    @Override // defpackage.jht
    public final dcdc<jho> b() {
        return this.b;
    }

    @Override // defpackage.jht
    @dzsi
    public final jhs c() {
        return this.c;
    }

    @Override // defpackage.jht
    @dzsi
    public final jhr d() {
        return this.d;
    }

    @Override // defpackage.jht
    @dzsi
    public final Integer e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        jhs jhsVar;
        jhr jhrVar;
        Integer num;
        Integer num2;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof jhv) {
            jhv jhvVar = (jhv) obj;
            if (this.a.equals(jhvVar.a()) && dchl.m(this.b, jhvVar.b()) && ((jhsVar = this.c) != null ? jhsVar.equals(jhvVar.c()) : jhvVar.c() == null) && ((jhrVar = this.d) != null ? jhrVar.equals(jhvVar.d()) : jhvVar.d() == null) && ((num = this.e) != null ? num.equals(jhvVar.e()) : jhvVar.e() == null) && ((num2 = this.f) != null ? num2.equals(jhvVar.f()) : jhvVar.f() == null) && ((str = this.g) != null ? str.equals(jhvVar.g()) : jhvVar.g() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.jht
    @dzsi
    public final Integer f() {
        return this.f;
    }

    @Override // defpackage.jht
    @dzsi
    public final String g() {
        return this.g;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        jhs jhsVar = this.c;
        int i = 0;
        int hashCode2 = (hashCode ^ (jhsVar == null ? 0 : jhsVar.hashCode())) * 1000003;
        jhr jhrVar = this.d;
        int hashCode3 = (hashCode2 ^ (jhrVar == null ? 0 : jhrVar.hashCode())) * 1000003;
        Integer num = this.e;
        int hashCode4 = (hashCode3 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Integer num2 = this.f;
        int hashCode5 = (hashCode4 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.g;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode5 ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String str = this.g;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        StringBuilder sb = new StringBuilder(length + 167 + length2 + length3 + length4 + length5 + String.valueOf(valueOf6).length() + String.valueOf(str).length());
        sb.append("OverflowMenuPropertiesImpl{ue3LoggingParams=");
        sb.append(valueOf);
        sb.append(", menuItems=");
        sb.append(valueOf2);
        sb.append(", menuShownListener=");
        sb.append(valueOf3);
        sb.append(", menuClickListener=");
        sb.append(valueOf4);
        sb.append(", overflowMenuIconId=");
        sb.append(valueOf5);
        sb.append(", overflowMenuIconColorArgb=");
        sb.append(valueOf6);
        sb.append(", contentDescription=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
