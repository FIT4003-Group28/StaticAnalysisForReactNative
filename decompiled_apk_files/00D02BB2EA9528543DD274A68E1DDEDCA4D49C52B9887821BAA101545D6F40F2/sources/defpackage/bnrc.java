package defpackage;
/* compiled from: PG */
/* renamed from: bnrc  reason: default package */
/* loaded from: classes.dex */
final class bnrc extends bnuw {
    public final int a;
    public final int b;

    public bnrc(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.bnuw
    public final int a() {
        return this.a;
    }

    @Override // defpackage.bnuw
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bnuw) {
            bnuw bnuwVar = (bnuw) obj;
            if (this.a == bnuwVar.a() && this.b == bnuwVar.b()) {
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
