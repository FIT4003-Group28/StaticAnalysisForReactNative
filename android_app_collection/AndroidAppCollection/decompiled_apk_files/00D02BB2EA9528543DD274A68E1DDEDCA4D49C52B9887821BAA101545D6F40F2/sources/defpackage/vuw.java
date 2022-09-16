package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: vuw  reason: default package */
/* loaded from: classes7.dex */
public final class vuw {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public vuw(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vuw)) {
            return false;
        }
        vuw vuwVar = (vuw) obj;
        return this.a == vuwVar.a && this.b == vuwVar.b && this.c == vuwVar.c && this.d == vuwVar.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        StringBuilder sb = new StringBuilder(68);
        sb.append("(l = ");
        sb.append(i);
        sb.append(", r = ");
        sb.append(i2);
        sb.append(", t = ");
        sb.append(i3);
        sb.append(", b = ");
        sb.append(i4);
        sb.append(")");
        return sb.toString();
    }
}
