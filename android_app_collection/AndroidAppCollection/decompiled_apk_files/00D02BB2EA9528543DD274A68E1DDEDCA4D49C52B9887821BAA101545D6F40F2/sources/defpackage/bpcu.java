package defpackage;
/* compiled from: PG */
/* renamed from: bpcu  reason: default package */
/* loaded from: classes3.dex */
final class bpcu extends bpcy {
    private final int a;
    private final int b;

    public bpcu(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.bpcy
    public final int a() {
        return this.a;
    }

    @Override // defpackage.bpcy
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bpcy) {
            bpcy bpcyVar = (bpcy) obj;
            if (this.a == bpcyVar.a() && this.b == bpcyVar.b()) {
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
        String str = i2 != 1 ? i2 != 2 ? "ONE_WAY" : "TWO_WAYS" : "NO_SELECTION";
        StringBuilder sb = new StringBuilder(str.length() + 51);
        sb.append("DirectionOptionData{textId=");
        sb.append(i);
        sb.append(", direction=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
