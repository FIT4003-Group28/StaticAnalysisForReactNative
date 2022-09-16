package defpackage;
/* compiled from: PG */
/* renamed from: kal  reason: default package */
/* loaded from: classes3.dex */
public final class kal {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final int d;

    public kal(int i, String str, boolean z, boolean z2) {
        this.d = i;
        if (str != null) {
            this.a = str;
            this.b = z;
            this.c = z2;
            return;
        }
        throw new NullPointerException("Null cpn");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kal) {
            kal kalVar = (kal) obj;
            if (this.d == kalVar.d && this.a.equals(kalVar.a) && this.b == kalVar.b && this.c == kalVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((this.d ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003;
        if (true == this.c) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String num = Integer.toString(this.d - 1);
        String str = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 95 + str.length());
        sb.append("VideoStageEventContext{audioRouteType=");
        sb.append(num);
        sb.append(", cpn=");
        sb.append(str);
        sb.append(", isOfflinePlayback=");
        sb.append(z);
        sb.append(", backgroundability=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }

    public kal() {
    }
}
