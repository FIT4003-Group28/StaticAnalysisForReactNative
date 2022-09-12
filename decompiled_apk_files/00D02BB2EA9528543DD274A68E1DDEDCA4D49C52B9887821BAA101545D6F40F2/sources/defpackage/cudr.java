package defpackage;
/* compiled from: PG */
/* renamed from: cudr  reason: default package */
/* loaded from: classes5.dex */
final class cudr extends cugh {
    private final int a;
    private final int b;

    public cudr(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.cugh
    public final int a() {
        return this.a;
    }

    @Override // defpackage.cugh
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cugh) {
            cugh cughVar = (cugh) obj;
            if (this.a == cughVar.a() && this.b == cughVar.b()) {
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
        StringBuilder sb = new StringBuilder(73);
        sb.append("LighterUiConfigurations{badge=");
        sb.append(i);
        sb.append(", profileLabelStyle=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
