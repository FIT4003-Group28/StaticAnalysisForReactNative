package defpackage;
/* compiled from: PG */
/* renamed from: arbz  reason: default package */
/* loaded from: classes2.dex */
final class arbz extends ardb {
    private final int a;
    private final int b;

    public arbz(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.ardb
    public final int a() {
        return this.a;
    }

    @Override // defpackage.ardb
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ardb) {
            ardb ardbVar = (ardb) obj;
            if (this.a == ardbVar.a() && this.b == ardbVar.b()) {
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
        StringBuilder sb = new StringBuilder(63);
        sb.append("TextStylesCacheKey{textColor=");
        sb.append(i);
        sb.append(", textSize=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
