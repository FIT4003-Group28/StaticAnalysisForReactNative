package defpackage;
/* compiled from: PG */
/* renamed from: fau  reason: default package */
/* loaded from: classes3.dex */
public final class fau {
    public final ampq a;
    public final ampq b;
    public final ampq c;

    public fau() {
    }

    public fau(ampq ampqVar, ampq ampqVar2, ampq ampqVar3) {
        this.a = ampqVar;
        this.b = ampqVar2;
        this.c = ampqVar3;
    }

    public static fas a() {
        return new fas(null);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fau) {
            fau fauVar = (fau) obj;
            if (this.a.equals(fauVar.a) && this.b.equals(fauVar.b) && this.c.equals(fauVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 56 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("DownloadsDataRequest{filterType=");
        sb.append(valueOf);
        sb.append(", maxCount=");
        sb.append(valueOf2);
        sb.append(", sortOrder=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
