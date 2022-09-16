package defpackage;
/* compiled from: PG */
/* renamed from: ahwq  reason: default package */
/* loaded from: classes.dex */
public final class ahwq {
    public final int a;
    public final int b;
    public final int c;
    private final int d;

    public ahwq() {
    }

    public ahwq(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.d = i3;
        this.c = i4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahwq) {
            ahwq ahwqVar = (ahwq) obj;
            if (this.a == ahwqVar.a && this.b == ahwqVar.b && this.d == ahwqVar.d && this.c == ahwqVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.d) * 1000003) ^ this.c;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.d;
        int i4 = this.c;
        StringBuilder sb = new StringBuilder(130);
        sb.append("HeatIntensityViewModel{maximumBarHeight=");
        sb.append(i);
        sb.append(", minimumBarHeight=");
        sb.append(i2);
        sb.append(", barGap=");
        sb.append(i3);
        sb.append(", highlightWidth=");
        sb.append(i4);
        sb.append("}");
        return sb.toString();
    }
}
