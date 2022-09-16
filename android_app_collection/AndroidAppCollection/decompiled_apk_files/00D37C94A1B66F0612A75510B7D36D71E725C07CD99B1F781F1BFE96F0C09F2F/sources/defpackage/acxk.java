package defpackage;
/* compiled from: PG */
/* renamed from: acxk  reason: default package */
/* loaded from: classes.dex */
public final class acxk {
    public final String a;
    public final String b;
    public final int c;
    public final adnl d;
    public final int e;

    public acxk() {
    }

    public acxk(String str, int i, String str2, int i2, adnl adnlVar) {
        this.a = str;
        this.e = i;
        this.b = str2;
        this.c = i2;
        this.d = adnlVar;
    }

    public static acxj a() {
        acxj acxjVar = new acxj();
        acxjVar.e(1);
        acxjVar.d(0);
        return acxjVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof acxk) {
            acxk acxkVar = (acxk) obj;
            if (this.a.equals(acxkVar.a)) {
                int i = this.e;
                int i2 = acxkVar.e;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.b.equals(acxkVar.b) && this.c == acxkVar.c && this.d.equals(acxkVar.d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int i = this.e;
        almu.X(i);
        return ((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String str = this.a;
        int i = this.e;
        String W = i != 0 ? almu.W(i) : "null";
        String str2 = this.b;
        int i2 = this.c;
        String valueOf = String.valueOf(this.d);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 114 + String.valueOf(W).length() + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("MdxBackgroundPlaybackRequest{routeId=");
        sb.append(str);
        sb.append(", sessionType=");
        sb.append(W);
        sb.append(", deviceName=");
        sb.append(str2);
        sb.append(", timeoutSeconds=");
        sb.append(i2);
        sb.append(", playbackDescriptor=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
