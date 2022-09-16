package defpackage;
/* compiled from: PG */
/* renamed from: okw  reason: default package */
/* loaded from: classes3.dex */
public final class okw {
    public final String a;
    public final int b;
    public final int c;

    public okw() {
    }

    public okw(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public static okv a() {
        return new okv();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof okw) {
            okw okwVar = (okw) obj;
            if (this.a.equals(okwVar.a) && this.b == okwVar.b && this.c == okwVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        int i2 = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78);
        sb.append("PaneCorrelation{pivotIdentifier=");
        sb.append(str);
        sb.append(", tabIndex=");
        sb.append(i);
        sb.append(", paneIndex=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
