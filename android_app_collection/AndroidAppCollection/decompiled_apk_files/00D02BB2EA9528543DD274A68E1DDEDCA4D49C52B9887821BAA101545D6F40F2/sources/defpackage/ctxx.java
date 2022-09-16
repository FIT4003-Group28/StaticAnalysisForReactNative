package defpackage;
/* compiled from: PG */
/* renamed from: ctxx  reason: default package */
/* loaded from: classes5.dex */
public final class ctxx extends ctyf {
    private final int a;
    private final int b;

    public ctxx(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.ctyf
    public final int a() {
        return this.a;
    }

    @Override // defpackage.ctyf
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctyf) {
            ctyf ctyfVar = (ctyf) obj;
            if (this.a == ctyfVar.a() && this.b == ctyfVar.b()) {
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
        StringBuilder sb = new StringBuilder(56);
        sb.append("RichCardLog{cardType=");
        sb.append(i);
        sb.append(", cardCount=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
