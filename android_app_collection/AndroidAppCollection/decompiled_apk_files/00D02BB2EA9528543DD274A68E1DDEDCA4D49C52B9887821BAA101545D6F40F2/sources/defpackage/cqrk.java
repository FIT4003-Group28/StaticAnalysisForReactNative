package defpackage;
/* compiled from: PG */
/* renamed from: cqrk  reason: default package */
/* loaded from: classes5.dex */
public final class cqrk extends cqrl {
    private final int a;
    private final int b;

    public cqrk(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.cqrl
    public final int a() {
        return this.a;
    }

    @Override // defpackage.cqrl
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cqrl) {
            cqrl cqrlVar = (cqrl) obj;
            if (this.a == cqrlVar.a() && this.b == cqrlVar.b()) {
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
        StringBuilder sb = new StringBuilder(85);
        sb.append("RecyclerViewScrollPositionConfig{index=");
        sb.append(i);
        sb.append(", maxItemsToScrollOver=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
