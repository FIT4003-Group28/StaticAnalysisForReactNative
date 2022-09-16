package defpackage;
/* compiled from: PG */
/* renamed from: ypw  reason: default package */
/* loaded from: classes4.dex */
public final class ypw {
    public final boolean a;
    public final boolean b;
    public final int c;
    private final boolean d;
    private final boolean e;

    public ypw() {
    }

    public ypw(boolean z, boolean z2, boolean z3, boolean z4, int i) {
        this.d = z;
        this.a = z2;
        this.b = z3;
        this.e = z4;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ypw) {
            ypw ypwVar = (ypw) obj;
            if (this.d == ypwVar.d && this.a == ypwVar.a && this.b == ypwVar.b && this.e == ypwVar.e && this.c == ypwVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((((true != this.d ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.a ? 1237 : 1231)) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003;
        if (true == this.e) {
            i = 1231;
        }
        return ((i2 ^ i) * 1000003) ^ this.c;
    }

    public final String toString() {
        boolean z = this.d;
        boolean z2 = this.a;
        boolean z3 = this.b;
        boolean z4 = this.e;
        int i = this.c;
        StringBuilder sb = new StringBuilder(138);
        sb.append("ConnectivityStatus{connectedOrConnecting=");
        sb.append(z);
        sb.append(", connected=");
        sb.append(z2);
        sb.append(", temporarilyUnmetered=");
        sb.append(z3);
        sb.append(", chargeable=");
        sb.append(z4);
        sb.append(", connectionType=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
