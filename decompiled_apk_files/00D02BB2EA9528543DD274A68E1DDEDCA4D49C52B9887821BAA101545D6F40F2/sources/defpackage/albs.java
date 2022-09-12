package defpackage;
/* compiled from: PG */
/* renamed from: albs  reason: default package */
/* loaded from: classes2.dex */
final class albs extends albt {
    private final int a;
    private final int b;

    public albs(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.albt
    public final int a() {
        return this.a;
    }

    @Override // defpackage.albt
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof albt) {
            albt albtVar = (albt) obj;
            if (this.a == albtVar.a() && this.b == albtVar.b()) {
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
        StringBuilder sb = new StringBuilder(67);
        sb.append("StrokeWidthAtZoomLevel{strokeWidthDp=");
        sb.append(i);
        sb.append(", zoom=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
