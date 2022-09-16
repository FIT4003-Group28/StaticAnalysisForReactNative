package defpackage;
/* compiled from: PG */
/* renamed from: yqj  reason: default package */
/* loaded from: classes4.dex */
public final class yqj {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public yqj() {
    }

    public yqj(int i, int i2, boolean z, boolean z2) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
    }

    public static ypg a() {
        ypg ypgVar = new ypg();
        ypgVar.b(20000);
        ypgVar.d(20000);
        ypgVar.c(true);
        ypgVar.a = true;
        return ypgVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yqj) {
            yqj yqjVar = (yqj) obj;
            if (this.a == yqjVar.a && this.b == yqjVar.b && this.c == yqjVar.c && this.d == yqjVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = (((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003;
        if (true == this.d) {
            i = 1231;
        }
        return i2 ^ i;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        boolean z = this.c;
        boolean z2 = this.d;
        StringBuilder sb = new StringBuilder(135);
        sb.append("HttpClientConfig{connectionTimeoutMs=");
        sb.append(i);
        sb.append(", readTimeoutMs=");
        sb.append(i2);
        sb.append(", installSecureRequestEnforcer=");
        sb.append(z);
        sb.append(", followRedirects=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
