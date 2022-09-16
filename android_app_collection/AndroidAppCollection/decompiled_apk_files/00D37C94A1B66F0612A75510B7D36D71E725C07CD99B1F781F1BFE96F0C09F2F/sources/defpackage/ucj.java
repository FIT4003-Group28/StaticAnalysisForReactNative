package defpackage;
/* compiled from: PG */
/* renamed from: ucj  reason: default package */
/* loaded from: classes4.dex */
public final class ucj {
    public final String a;
    public final String b;
    public final uci c;
    public final uck d;
    public final String e;
    public final Long f;
    public final Integer g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    private final String k;

    public ucj() {
    }

    public ucj(String str, String str2, uci uciVar, uck uckVar, String str3, Long l, String str4, Integer num, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = uciVar;
        this.d = uckVar;
        this.e = str3;
        this.f = l;
        this.k = str4;
        this.g = num;
        this.h = z;
        this.i = z2;
        this.j = z3;
    }

    public final boolean equals(Object obj) {
        uck uckVar;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ucj) {
            ucj ucjVar = (ucj) obj;
            if (this.a.equals(ucjVar.a) && this.b.equals(ucjVar.b) && this.c.equals(ucjVar.c) && ((uckVar = this.d) != null ? uckVar.equals(ucjVar.d) : ucjVar.d == null) && this.e.equals(ucjVar.e) && this.f.equals(ucjVar.f) && ((str = this.k) != null ? str.equals(ucjVar.k) : ucjVar.k == null) && this.g.equals(ucjVar.g) && this.h == ucjVar.h && this.i == ucjVar.i && this.j == ucjVar.j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * (-721379959)) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        uck uckVar = this.d;
        int i = 0;
        int hashCode2 = (((((hashCode ^ (uckVar == null ? 0 : uckVar.hashCode())) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003;
        String str = this.k;
        if (str != null) {
            i = str.hashCode();
        }
        int i2 = 1237;
        int hashCode3 = (((((((hashCode2 ^ i) * (-721379959)) ^ this.g.hashCode()) * (-721379959)) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003;
        if (true == this.j) {
            i2 = 1231;
        }
        return hashCode3 ^ i2;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String str3 = this.e;
        String valueOf3 = String.valueOf(this.f);
        String str4 = this.k;
        String valueOf4 = String.valueOf(this.g);
        boolean z = this.h;
        boolean z2 = this.i;
        boolean z3 = this.j;
        int length = String.valueOf(str).length();
        int length2 = "null".length();
        int length3 = String.valueOf(str2).length();
        int length4 = String.valueOf(valueOf).length();
        int length5 = String.valueOf(valueOf2).length();
        int length6 = String.valueOf(str3).length();
        int length7 = String.valueOf(valueOf3).length();
        int length8 = String.valueOf(str4).length();
        int length9 = "null".length();
        StringBuilder sb = new StringBuilder(length + 309 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + String.valueOf(valueOf4).length() + "null".length());
        sb.append("ChimeConfig{clientId=");
        sb.append(str);
        sb.append(", selectionTokens=");
        sb.append("null");
        sb.append(", gcmSenderProjectId=");
        sb.append(str2);
        sb.append(", environment=");
        sb.append(valueOf);
        sb.append(", systemTrayNotificationConfig=");
        sb.append(valueOf2);
        sb.append(", deviceName=");
        sb.append(str3);
        sb.append(", registrationStalenessTimeMs=");
        sb.append(valueOf3);
        sb.append(", scheduledTaskService=");
        sb.append(str4);
        sb.append(", apiKey=null, jobSchedulerAllowedIDsRange=");
        sb.append(valueOf4);
        sb.append(", firebaseOptions=");
        sb.append("null");
        sb.append(", forceLogging=");
        sb.append(z);
        sb.append(", disableChimeEntrypoints=");
        sb.append(z2);
        sb.append(", useDefaultFirebaseApp=");
        sb.append(z3);
        sb.append("}");
        return sb.toString();
    }
}
