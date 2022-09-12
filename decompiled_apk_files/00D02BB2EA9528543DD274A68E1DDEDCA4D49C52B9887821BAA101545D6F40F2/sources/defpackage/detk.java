package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: detk  reason: default package */
/* loaded from: classes6.dex */
public final class detk extends deto {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final String f;
    public final int g;

    public detk(String str, int i, String str2, String str3, long j, long j2, String str4) {
        this.a = str;
        this.g = i;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = j2;
        this.f = str4;
    }

    @Override // defpackage.deto
    public final String a() {
        return this.a;
    }

    @Override // defpackage.deto
    public final String b() {
        return this.b;
    }

    @Override // defpackage.deto
    public final String c() {
        return this.c;
    }

    @Override // defpackage.deto
    public final long d() {
        return this.d;
    }

    @Override // defpackage.deto
    public final long e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof deto) {
            deto detoVar = (deto) obj;
            String str4 = this.a;
            if (str4 != null ? str4.equals(detoVar.a()) : detoVar.a() == null) {
                int i = this.g;
                int h = detoVar.h();
                if (i == 0) {
                    throw null;
                }
                if (i == h && ((str = this.b) != null ? str.equals(detoVar.b()) : detoVar.b() == null) && ((str2 = this.c) != null ? str2.equals(detoVar.c()) : detoVar.c() == null) && this.d == detoVar.d() && this.e == detoVar.e() && ((str3 = this.f) != null ? str3.equals(detoVar.f()) : detoVar.f() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.deto
    public final String f() {
        return this.f;
    }

    @Override // defpackage.deto
    public final detn g() {
        return new detj(this);
    }

    @Override // defpackage.deto
    public final int h() {
        return this.g;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        int i2 = this.g;
        if (i2 != 0) {
            int i3 = (hashCode ^ i2) * 1000003;
            String str2 = this.b;
            int hashCode2 = (i3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
            String str3 = this.c;
            int hashCode3 = str3 == null ? 0 : str3.hashCode();
            long j = this.d;
            long j2 = this.e;
            int i4 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
            String str4 = this.f;
            if (str4 != null) {
                i = str4.hashCode();
            }
            return i4 ^ i;
        }
        throw null;
    }

    public final String toString() {
        String str = this.a;
        int i = this.g;
        String str2 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "REGISTER_ERROR" : "REGISTERED" : "UNREGISTERED" : "NOT_GENERATED" : "ATTEMPT_MIGRATION";
        String str3 = this.b;
        String str4 = this.c;
        long j = this.d;
        long j2 = this.e;
        String str5 = this.f;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 193 + str2.length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length());
        sb.append("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(str);
        sb.append(", registrationStatus=");
        sb.append(str2);
        sb.append(", authToken=");
        sb.append(str3);
        sb.append(", refreshToken=");
        sb.append(str4);
        sb.append(", expiresInSecs=");
        sb.append(j);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(j2);
        sb.append(", fisError=");
        sb.append(str5);
        sb.append("}");
        return sb.toString();
    }
}
