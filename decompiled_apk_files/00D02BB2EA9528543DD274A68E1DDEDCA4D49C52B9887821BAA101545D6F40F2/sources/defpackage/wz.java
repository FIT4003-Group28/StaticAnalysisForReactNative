package defpackage;
/* compiled from: PG */
/* renamed from: wz  reason: default package */
/* loaded from: classes7.dex */
public final class wz {
    public int a;
    public int b;
    Object c;
    public int d;

    public wz(int i, int i2, int i3, Object obj) {
        this.a = i;
        this.b = i2;
        this.d = i3;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wz)) {
            return false;
        }
        wz wzVar = (wz) obj;
        int i = this.a;
        if (i != wzVar.a) {
            return false;
        }
        if (i == 8 && Math.abs(this.d - this.b) == 1 && this.d == wzVar.b && this.b == wzVar.d) {
            return true;
        }
        if (this.d != wzVar.d || this.b != wzVar.b) {
            return false;
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            if (!obj2.equals(wzVar.c)) {
                return false;
            }
        } else if (wzVar.c != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.b);
        sb.append("c:");
        sb.append(this.d);
        sb.append(",p:");
        sb.append(this.c);
        sb.append("]");
        return sb.toString();
    }
}