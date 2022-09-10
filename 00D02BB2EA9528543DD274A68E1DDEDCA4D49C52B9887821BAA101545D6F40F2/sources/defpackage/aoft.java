package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aoft  reason: default package */
/* loaded from: classes2.dex */
public final class aoft extends aogj {
    private final String a;
    private final String b;
    private final akqq c;
    private final String d;
    private final String e;
    private final cjtd f;

    public aoft(String str, String str2, akqq akqqVar, String str3, String str4, cjtd cjtdVar) {
        this.a = str;
        this.b = str2;
        this.c = akqqVar;
        this.d = str3;
        this.e = str4;
        this.f = cjtdVar;
    }

    @Override // defpackage.aogj
    public final String a() {
        return this.a;
    }

    @Override // defpackage.aogj
    public final String b() {
        return this.b;
    }

    @Override // defpackage.aogj
    public final akqq c() {
        return this.c;
    }

    @Override // defpackage.aogj
    public final String d() {
        return this.d;
    }

    @Override // defpackage.aogj
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aogj) {
            aogj aogjVar = (aogj) obj;
            if (this.a.equals(aogjVar.a()) && this.b.equals(aogjVar.b()) && this.c.equals(aogjVar.c()) && this.d.equals(aogjVar.d()) && this.e.equals(aogjVar.e()) && this.f.equals(aogjVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aogj
    public final cjtd f() {
        return this.f;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String valueOf = String.valueOf(this.c);
        String str3 = this.d;
        String str4 = this.e;
        String valueOf2 = String.valueOf(this.f);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(valueOf).length();
        int length4 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(length + 73 + length2 + length3 + length4 + String.valueOf(str4).length() + String.valueOf(valueOf2).length());
        sb.append("PlaceMapLabel{name=");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", location=");
        sb.append(valueOf);
        sb.append(", iconUrl=");
        sb.append(str3);
        sb.append(", featureId=");
        sb.append(str4);
        sb.append(", ue3Params=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
