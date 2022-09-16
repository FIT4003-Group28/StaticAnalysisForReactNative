package defpackage;
/* compiled from: PG */
/* renamed from: agbc  reason: default package */
/* loaded from: classes.dex */
public final class agbc {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public agbc() {
    }

    public agbc(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agbc) {
            agbc agbcVar = (agbc) obj;
            if (this.a == agbcVar.a && this.b == agbcVar.b && this.c == agbcVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003;
        if (true == this.c) {
            i = 1231;
        }
        return i2 ^ i;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        StringBuilder sb = new StringBuilder(94);
        sb.append("NotificationSettings{appLevelEnabled=");
        sb.append(z);
        sb.append(", osLevelEnabled=");
        sb.append(z2);
        sb.append(", osChannelLevelEnabled=");
        sb.append(z3);
        sb.append("}");
        return sb.toString();
    }
}
