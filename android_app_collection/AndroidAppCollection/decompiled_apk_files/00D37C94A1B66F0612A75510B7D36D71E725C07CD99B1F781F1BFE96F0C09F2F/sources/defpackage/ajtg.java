package defpackage;
/* compiled from: PG */
/* renamed from: ajtg  reason: default package */
/* loaded from: classes.dex */
public final class ajtg {
    public final long a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public ajtg() {
    }

    public ajtg(long j, int i, int i2, int i3, int i4) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajtg) {
            ajtg ajtgVar = (ajtg) obj;
            if (this.a == ajtgVar.a && this.b == ajtgVar.b && this.c == ajtgVar.c && this.d == ajtgVar.d && this.e == ajtgVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return this.e ^ ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        int i4 = this.e;
        StringBuilder sb = new StringBuilder(122);
        sb.append("MoveAgainParameters{duration=");
        sb.append(j);
        sb.append(", fromX=");
        sb.append(i);
        sb.append(", fromY=");
        sb.append(i2);
        sb.append(", toX=");
        sb.append(i3);
        sb.append(", toY=");
        sb.append(i4);
        sb.append("}");
        return sb.toString();
    }
}
