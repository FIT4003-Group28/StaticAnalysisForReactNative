package defpackage;
/* compiled from: PG */
/* renamed from: uoi  reason: default package */
/* loaded from: classes4.dex */
public final class uoi {
    public final String a;
    public final ampq b;
    private final ampq c;
    private final ampq d;

    public uoi() {
    }

    public uoi(String str, ampq ampqVar, ampq ampqVar2, ampq ampqVar3) {
        this.a = str;
        this.b = ampqVar;
        this.c = ampqVar2;
        this.d = ampqVar3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uoi) {
            uoi uoiVar = (uoi) obj;
            if (this.a.equals(uoiVar.a) && this.b.equals(uoiVar.b) && this.c.equals(uoiVar.c) && this.d.equals(uoiVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 80 + length2 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("CustomHeaderContentFeature{title=");
        sb.append(str);
        sb.append(", subtitle=");
        sb.append(valueOf);
        sb.append(", titleTypeface=");
        sb.append(valueOf2);
        sb.append(", subtitleTypeface=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
