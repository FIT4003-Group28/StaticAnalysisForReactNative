package defpackage;
/* compiled from: PG */
/* renamed from: bypw  reason: default package */
/* loaded from: classes4.dex */
final class bypw extends byqe {
    private final String a;
    private final eaow b;
    private final String c;
    private final String d;
    private final String e;
    private final long f;
    private final int g;

    public bypw(String str, eaow eaowVar, @dzsi String str2, @dzsi String str3, String str4, long j, int i) {
        this.a = str;
        this.b = eaowVar;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = j;
        this.g = i;
    }

    @Override // defpackage.byqe
    public final String a() {
        return this.a;
    }

    @Override // defpackage.byqe
    public final eaow b() {
        return this.b;
    }

    @Override // defpackage.byqe
    @dzsi
    public final String c() {
        return this.c;
    }

    @Override // defpackage.byqe
    @dzsi
    public final String d() {
        return this.d;
    }

    @Override // defpackage.byqe
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof byqe) {
            byqe byqeVar = (byqe) obj;
            if (this.a.equals(byqeVar.a()) && this.b.equals(byqeVar.b()) && ((str = this.c) != null ? str.equals(byqeVar.c()) : byqeVar.c() == null) && ((str2 = this.d) != null ? str2.equals(byqeVar.d()) : byqeVar.d() == null) && this.e.equals(byqeVar.e()) && this.f == byqeVar.f()) {
                int i = this.g;
                int g = byqeVar.g();
                if (i == 0) {
                    throw null;
                }
                if (i == g) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.byqe
    public final long f() {
        return this.f;
    }

    @Override // defpackage.byqe
    public final int g() {
        return this.g;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int hashCode3 = this.e.hashCode();
        long j = this.f;
        int i2 = (((((hashCode2 ^ i) * 1000003) ^ hashCode3) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        int i3 = this.g;
        if (i3 != 0) {
            return i2 ^ i3;
        }
        throw null;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String str2 = this.c;
        String str3 = this.d;
        String str4 = this.e;
        long j = this.f;
        int i = this.g;
        String str5 = i != 1 ? i != 2 ? "null" : "TRANSIT_COMMUTE" : "DRIVING_COMMUTE";
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 165 + length2 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + str5.length());
        sb.append("SmartspaceNotification{destinationName=");
        sb.append(str);
        sb.append(", estimatedTripDuration=");
        sb.append(valueOf);
        sb.append(", subtitle=");
        sb.append(str2);
        sb.append(", iconUrl=");
        sb.append(str3);
        sb.append(", tapTargetUrl=");
        sb.append(str4);
        sb.append(", expirationTimeMillis=");
        sb.append(j);
        sb.append(", notificationChannel=");
        sb.append(str5);
        sb.append("}");
        return sb.toString();
    }
}
