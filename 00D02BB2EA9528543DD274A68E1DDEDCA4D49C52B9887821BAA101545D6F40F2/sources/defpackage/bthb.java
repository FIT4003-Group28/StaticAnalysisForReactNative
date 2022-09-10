package defpackage;
/* compiled from: PG */
/* renamed from: bthb  reason: default package */
/* loaded from: classes4.dex */
final class bthb extends bths {
    private final String b;
    private final String c;
    private final dbsg<String> d;
    private final String e;
    private final ddho f;
    private final bthr g;
    private final cjtd h;

    public bthb(String str, String str2, dbsg<String> dbsgVar, String str3, ddho ddhoVar, bthr bthrVar, cjtd cjtdVar) {
        this.b = str;
        this.c = str2;
        this.d = dbsgVar;
        this.e = str3;
        this.f = ddhoVar;
        this.g = bthrVar;
        this.h = cjtdVar;
    }

    @Override // defpackage.bths
    public final String a() {
        return this.b;
    }

    @Override // defpackage.bths
    public final String b() {
        return this.c;
    }

    @Override // defpackage.bths
    public final dbsg<String> c() {
        return this.d;
    }

    @Override // defpackage.bths
    public final String d() {
        return this.e;
    }

    @Override // defpackage.bths
    public final ddho e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bths) {
            bths bthsVar = (bths) obj;
            if (this.b.equals(bthsVar.a()) && this.c.equals(bthsVar.b()) && this.d.equals(bthsVar.c()) && this.e.equals(bthsVar.d()) && this.f.equals(bthsVar.e()) && this.g.equals(bthsVar.f()) && this.h.equals(bthsVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bths
    public final bthr f() {
        return this.g;
    }

    @Override // defpackage.bths
    public final cjtd g() {
        return this.h;
    }

    public final int hashCode() {
        return ((((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        String str = this.b;
        String str2 = this.c;
        String valueOf = String.valueOf(this.d);
        String str3 = this.e;
        String valueOf2 = String.valueOf(this.f);
        String valueOf3 = String.valueOf(this.g);
        String valueOf4 = String.valueOf(this.h);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(valueOf).length();
        int length4 = String.valueOf(str3).length();
        int length5 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 127 + length2 + length3 + length4 + length5 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("ConfirmDialogOptions{title=");
        sb.append(str);
        sb.append(", message=");
        sb.append(str2);
        sb.append(", checkboxText=");
        sb.append(valueOf);
        sb.append(", confirmButtonText=");
        sb.append(str3);
        sb.append(", visualElementType=");
        sb.append(valueOf2);
        sb.append(", listener=");
        sb.append(valueOf3);
        sb.append(", confirmLoggingParams=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
