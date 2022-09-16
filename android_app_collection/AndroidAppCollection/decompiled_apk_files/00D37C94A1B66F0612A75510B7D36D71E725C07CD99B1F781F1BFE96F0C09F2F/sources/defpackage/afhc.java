package defpackage;
/* compiled from: PG */
/* renamed from: afhc  reason: default package */
/* loaded from: classes.dex */
final class afhc {
    public final int a;
    public final int b;

    public afhc() {
    }

    public afhc(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static afhc a(int i, int i2) {
        return new afhc(i, i2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afhc) {
            afhc afhcVar = (afhc) obj;
            if (this.a == afhcVar.a && this.b == afhcVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(43);
        sb.append("Size{width=");
        sb.append(i);
        sb.append(", height=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
