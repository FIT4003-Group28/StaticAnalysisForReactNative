package defpackage;
/* compiled from: PG */
/* renamed from: azqx  reason: default package */
/* loaded from: classes3.dex */
final class azqx extends azrg {
    private final bwrs<ilo> a;
    private final int b;

    public azqx(int i, bwrs<ilo> bwrsVar) {
        this.b = i;
        this.a = bwrsVar;
    }

    @Override // defpackage.azrg
    public final bwrs<ilo> a() {
        return this.a;
    }

    @Override // defpackage.azrg
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof azrg) {
            azrg azrgVar = (azrg) obj;
            if (this.b == azrgVar.b() && this.a.equals(azrgVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        String str = this.b != 1 ? "STARRING_FAILED" : "STARRING_SUCCEEDED";
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(str.length() + 50 + String.valueOf(valueOf).length());
        sb.append("StarringEvent{eventType=");
        sb.append(str);
        sb.append(", getSaveTargetPlacemark=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
