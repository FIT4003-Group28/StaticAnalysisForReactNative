package defpackage;
/* compiled from: PG */
/* renamed from: zvu  reason: default package */
/* loaded from: classes4.dex */
public final class zvu {
    public final zvs a;
    public final ampq b;
    public final int c;
    public final String d;
    public final ampq e;

    public zvu() {
    }

    public zvu(zvs zvsVar, ampq ampqVar, int i, String str, ampq ampqVar2) {
        this.a = zvsVar;
        this.b = ampqVar;
        this.c = i;
        this.d = str;
        this.e = ampqVar2;
    }

    public static zvt a() {
        return new zvt(null);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zvu) {
            zvu zvuVar = (zvu) obj;
            if (this.a.equals(zvuVar.a) && this.b.equals(zvuVar.b) && this.c == zvuVar.c && this.d.equals(zvuVar.d) && this.e.equals(zvuVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        int i = this.c;
        String str = this.d;
        String valueOf3 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 71 + length2 + String.valueOf(str).length() + String.valueOf(valueOf3).length());
        sb.append("Album{albumType=");
        sb.append(valueOf);
        sb.append(", coverFile=");
        sb.append(valueOf2);
        sb.append(", fileCount=");
        sb.append(i);
        sb.append(", name=");
        sb.append(str);
        sb.append(", directory=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
