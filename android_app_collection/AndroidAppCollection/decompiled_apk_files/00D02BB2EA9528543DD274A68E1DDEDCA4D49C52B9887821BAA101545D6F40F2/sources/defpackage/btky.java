package defpackage;
/* compiled from: PG */
/* renamed from: btky  reason: default package */
/* loaded from: classes4.dex */
final class btky extends btld {
    private final int a;
    private final int b;

    public btky(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.btld
    public final int a() {
        return this.a;
    }

    @Override // defpackage.btld
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof btld) {
            btld btldVar = (btld) obj;
            if (this.a == btldVar.a() && this.b == btldVar.b()) {
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
        StringBuilder sb = new StringBuilder(42);
        sb.append("Time{hour=");
        sb.append(i);
        sb.append(", minute=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
