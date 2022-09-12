package defpackage;
/* compiled from: PG */
/* renamed from: agcp  reason: default package */
/* loaded from: classes2.dex */
final class agcp extends agvd {
    private final int a;
    private final int b;

    public agcp(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.agvd
    public final int a() {
        return this.a;
    }

    @Override // defpackage.agvd
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agvd) {
            agvd agvdVar = (agvd) obj;
            if (this.a == agvdVar.a() && this.b == agvdVar.b()) {
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
        StringBuilder sb = new StringBuilder(62);
        sb.append("Options{paddingTopDp=");
        sb.append(i);
        sb.append(", paddingBottomDp=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
