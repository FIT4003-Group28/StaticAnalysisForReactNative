package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: auls  reason: default package */
/* loaded from: classes2.dex */
public final class auls extends aulu {
    public final auuh a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final String f;
    public final dcdc<cjtd> g;
    public final dcdc<String> h;

    public auls(auuh auuhVar, @dzsi String str, @dzsi String str2, boolean z, @dzsi String str3, @dzsi String str4, dcdc<cjtd> dcdcVar, dcdc<String> dcdcVar2) {
        this.a = auuhVar;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = str3;
        this.f = str4;
        this.g = dcdcVar;
        this.h = dcdcVar2;
    }

    @Override // defpackage.aulu
    public final auuh a() {
        return this.a;
    }

    @Override // defpackage.aulu
    @dzsi
    public final String b() {
        return this.b;
    }

    @Override // defpackage.aulu
    @dzsi
    public final String c() {
        return this.c;
    }

    @Override // defpackage.aulu
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.aulu
    @dzsi
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aulu) {
            aulu auluVar = (aulu) obj;
            if (this.a.equals(auluVar.a()) && ((str = this.b) != null ? str.equals(auluVar.b()) : auluVar.b() == null) && ((str2 = this.c) != null ? str2.equals(auluVar.c()) : auluVar.c() == null) && this.d == auluVar.d() && ((str3 = this.e) != null ? str3.equals(auluVar.e()) : auluVar.e() == null) && ((str4 = this.f) != null ? str4.equals(auluVar.f()) : auluVar.f() == null) && dchl.m(this.g, auluVar.g()) && dchl.m(this.h, auluVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aulu
    @dzsi
    public final String f() {
        return this.f;
    }

    @Override // defpackage.aulu
    public final dcdc<cjtd> g() {
        return this.g;
    }

    @Override // defpackage.aulu
    public final dcdc<String> h() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int hashCode3 = (((hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003;
        String str3 = this.e;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return ((((hashCode4 ^ i) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    @Override // defpackage.aulu
    public final aulr i() {
        return new aulr(this);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        String str2 = this.c;
        boolean z = this.d;
        String str3 = this.e;
        String str4 = this.f;
        String valueOf2 = String.valueOf(this.g);
        String valueOf3 = String.valueOf(this.h);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(str2).length();
        int length4 = String.valueOf(str3).length();
        int length5 = String.valueOf(str4).length();
        StringBuilder sb = new StringBuilder(length + 183 + length2 + length3 + length4 + length5 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("ChimeNotificationStoredMetadata{key=");
        sb.append(valueOf);
        sb.append(", chimeThreadId=");
        sb.append(str);
        sb.append(", chimeAccountName=");
        sb.append(str2);
        sb.append(", contentUpdate=");
        sb.append(z);
        sb.append(", serverEiToOverride=");
        sb.append(str3);
        sb.append(", serverVedToOverride=");
        sb.append(str4);
        sb.append(", customContentButtonLoggingParams=");
        sb.append(valueOf2);
        sb.append(", photoUris=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
