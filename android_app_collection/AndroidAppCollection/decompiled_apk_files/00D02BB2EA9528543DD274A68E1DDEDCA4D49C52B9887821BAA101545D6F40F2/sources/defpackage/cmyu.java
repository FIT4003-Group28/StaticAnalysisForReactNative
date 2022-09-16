package defpackage;
/* compiled from: PG */
/* renamed from: cmyu  reason: default package */
/* loaded from: classes5.dex */
public final class cmyu {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;

    public cmyu(boolean z, boolean z2, boolean z3, int i, int i2) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cmyu cmyuVar = (cmyu) obj;
            if (this.a == cmyuVar.a && this.b == cmyuVar.b && this.c == cmyuVar.c && this.d == cmyuVar.d && this.e == cmyuVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a ? 1 : 0) * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        int i = this.d;
        int i2 = this.e;
        StringBuilder sb = new StringBuilder(166);
        sb.append("Config{hasTouchScreen=");
        sb.append(z);
        sb.append(", hasRotaryController=");
        sb.append(z2);
        sb.append(", hasTouchpadForNavigation=");
        sb.append(z3);
        sb.append(", touchpadMoveThresholdPx=");
        sb.append(i);
        sb.append(", touchpadMultimoveThresholdPx=");
        sb.append(i2);
        sb.append('}');
        return sb.toString();
    }
}
