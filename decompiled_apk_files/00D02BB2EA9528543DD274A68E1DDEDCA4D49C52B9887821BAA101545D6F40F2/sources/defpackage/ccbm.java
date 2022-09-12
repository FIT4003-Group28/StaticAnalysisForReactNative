package defpackage;
/* compiled from: PG */
/* renamed from: ccbm  reason: default package */
/* loaded from: classes4.dex */
public final class ccbm extends cccq {
    private final int a;
    private final int b;

    public ccbm(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.cccq
    public final int a() {
        return this.a;
    }

    @Override // defpackage.cccq
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cccq) {
            cccq cccqVar = (cccq) obj;
            if (this.a == cccqVar.a() && this.b == cccqVar.b()) {
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
        sb.append("UgcInfoCardListAccessibilityInfo{cardPosition=");
        sb.append(i);
        sb.append(", totalNumCards=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
