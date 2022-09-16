package defpackage;
/* compiled from: PG */
/* renamed from: xdi  reason: default package */
/* loaded from: classes4.dex */
public final class xdi {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public xdi(String str, boolean z, boolean z2, boolean z3) {
        if (str != null) {
            this.a = str;
            this.b = z;
            this.c = z2;
            this.d = z3;
            return;
        }
        throw new NullPointerException("Null contentCpn");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xdi) {
            xdi xdiVar = (xdi) obj;
            if (this.a.equals(xdiVar.a) && this.b == xdiVar.b && this.c == xdiVar.c && this.d == xdiVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003;
        if (true == this.d) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        boolean z3 = this.d;
        StringBuilder sb = new StringBuilder(str.length() + 108);
        sb.append("OrganicPlaybackContextModel{contentCpn=");
        sb.append(str);
        sb.append(", isLivePlayback=");
        sb.append(z);
        sb.append(", isOfflinePlayback=");
        sb.append(z2);
        sb.append(", isMdxPlayback=");
        sb.append(z3);
        sb.append("}");
        return sb.toString();
    }

    public xdi() {
    }
}
