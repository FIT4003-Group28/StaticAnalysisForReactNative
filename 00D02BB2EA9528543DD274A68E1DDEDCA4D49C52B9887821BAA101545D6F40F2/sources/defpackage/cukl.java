package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cukl  reason: default package */
/* loaded from: classes5.dex */
public final class cukl extends cukp {
    public final cukn a;
    public final String b;
    public final dbsg<byte[]> c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public cukl(cukn cuknVar, String str, dbsg<byte[]> dbsgVar, int i, int i2, int i3, int i4) {
        this.a = cuknVar;
        this.b = str;
        this.c = dbsgVar;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
    }

    @Override // defpackage.cukp
    public final cukn a() {
        return this.a;
    }

    @Override // defpackage.cukp
    public final String b() {
        return this.b;
    }

    @Override // defpackage.cukp
    public final dbsg<byte[]> c() {
        return this.c;
    }

    @Override // defpackage.cukp
    public final int d() {
        return this.d;
    }

    @Override // defpackage.cukp
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cukp) {
            cukp cukpVar = (cukp) obj;
            cukn cuknVar = this.a;
            if (cuknVar != null ? cuknVar.equals(cukpVar.a()) : cukpVar.a() == null) {
                String str = this.b;
                if (str != null ? str.equals(cukpVar.b()) : cukpVar.b() == null) {
                    if (this.c.equals(cukpVar.c()) && this.d == cukpVar.d() && this.e == cukpVar.e() && this.f == cukpVar.f() && this.g == cukpVar.g()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.cukp
    public final int f() {
        return this.f;
    }

    @Override // defpackage.cukp
    public final int g() {
        return this.g;
    }

    @Override // defpackage.cukp
    public final cuko h() {
        return new cukk(this);
    }

    public final int hashCode() {
        cukn cuknVar = this.a;
        int i = 0;
        int hashCode = ((cuknVar == null ? 0 : cuknVar.hashCode()) ^ 1000003) * 1000003;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return ((((((((((hashCode ^ i) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        String valueOf2 = String.valueOf(this.c);
        int i = this.d;
        int i2 = this.e;
        int i3 = this.f;
        int i4 = this.g;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 127 + String.valueOf(str).length() + String.valueOf(valueOf2).length());
        sb.append("PhotoData{mediaId=");
        sb.append(valueOf);
        sb.append(", localURI=");
        sb.append(str);
        sb.append(", thumbnail=");
        sb.append(valueOf2);
        sb.append(", width=");
        sb.append(i);
        sb.append(", height=");
        sb.append(i2);
        sb.append(", size=");
        sb.append(i3);
        sb.append(", downloadStatus=");
        sb.append(i4);
        sb.append("}");
        return sb.toString();
    }
}
