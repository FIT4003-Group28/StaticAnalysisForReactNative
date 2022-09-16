package defpackage;
/* compiled from: PG */
/* renamed from: agcf  reason: default package */
/* loaded from: classes.dex */
public final class agcf {
    public final boolean a;
    public final int b;
    public final boolean c;

    public agcf() {
    }

    public agcf(boolean z, int i, boolean z2) {
        this.a = z;
        this.b = i;
        this.c = z2;
    }

    public static agcf a(boolean z, int i, boolean z2) {
        return new agcf(z, i, z2);
    }

    public static agcf b() {
        return new agcf(false, 0, false);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agcf) {
            agcf agcfVar = (agcf) obj;
            if (this.a == agcfVar.a && this.b == agcfVar.b && this.c == agcfVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b) * 1000003;
        if (true == this.c) {
            i = 1231;
        }
        return i2 ^ i;
    }

    public final String toString() {
        boolean z = this.a;
        int i = this.b;
        boolean z2 = this.c;
        StringBuilder sb = new StringBuilder(82);
        sb.append("NewContentSignal{isNewContent=");
        sb.append(z);
        sb.append(", unseenItemCount=");
        sb.append(i);
        sb.append(", isCleared=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
