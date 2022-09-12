package defpackage;
/* compiled from: PG */
/* renamed from: detq  reason: default package */
/* loaded from: classes6.dex */
final class detq extends detv {
    private final String a;
    private final String b;
    private final String c;
    private final dety d;
    private final int e;

    public detq(String str, String str2, String str3, dety detyVar, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = detyVar;
        this.e = i;
    }

    @Override // defpackage.detv
    public final String a() {
        return this.a;
    }

    @Override // defpackage.detv
    public final String b() {
        return this.b;
    }

    @Override // defpackage.detv
    public final String c() {
        return this.c;
    }

    @Override // defpackage.detv
    public final dety d() {
        return this.d;
    }

    @Override // defpackage.detv
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof detv) {
            detv detvVar = (detv) obj;
            String str = this.a;
            if (str != null ? str.equals(detvVar.a()) : detvVar.a() == null) {
                String str2 = this.b;
                if (str2 != null ? str2.equals(detvVar.b()) : detvVar.b() == null) {
                    String str3 = this.c;
                    if (str3 != null ? str3.equals(detvVar.c()) : detvVar.c() == null) {
                        dety detyVar = this.d;
                        if (detyVar != null ? detyVar.equals(detvVar.d()) : detvVar.d() == null) {
                            int i = this.e;
                            if (i != 0 ? i == detvVar.e() : detvVar.e() == 0) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        dety detyVar = this.d;
        int hashCode4 = (hashCode3 ^ (detyVar == null ? 0 : detyVar.hashCode())) * 1000003;
        int i2 = this.e;
        if (i2 != 0) {
            i = i2;
        }
        return hashCode4 ^ i;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String valueOf = String.valueOf(this.d);
        int i = this.e;
        String str4 = i != 1 ? i != 2 ? "null" : "BAD_CONFIG" : "OK";
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 74 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(valueOf).length() + str4.length());
        sb.append("InstallationResponse{uri=");
        sb.append(str);
        sb.append(", fid=");
        sb.append(str2);
        sb.append(", refreshToken=");
        sb.append(str3);
        sb.append(", authToken=");
        sb.append(valueOf);
        sb.append(", responseCode=");
        sb.append(str4);
        sb.append("}");
        return sb.toString();
    }
}
