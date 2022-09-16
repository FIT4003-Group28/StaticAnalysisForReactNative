package defpackage;
/* compiled from: PG */
/* renamed from: rcf  reason: default package */
/* loaded from: classes4.dex */
public final class rcf {
    public final String a;
    public final boolean b;
    public final boolean c;

    public rcf() {
    }

    public rcf(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rcf) {
            rcf rcfVar = (rcf) obj;
            if (this.a.equals(rcfVar.a) && this.b == rcfVar.b && this.c == rcfVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003;
        if (true == this.c) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 99);
        sb.append("AdShield2Options{clientVersion=");
        sb.append(str);
        sb.append(", shouldGetAdvertisingId=");
        sb.append(z);
        sb.append(", isGooglePlayServicesAvailable=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
