package defpackage;
/* compiled from: PG */
/* renamed from: qwg  reason: default package */
/* loaded from: classes4.dex */
public final class qwg {
    public final int a;
    public final int b;

    public qwg(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof qwg) {
            qwg qwgVar = (qwg) obj;
            if (this.a == qwgVar.a && this.b == qwgVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        int i2 = this.a;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        return sb.toString();
    }
}
