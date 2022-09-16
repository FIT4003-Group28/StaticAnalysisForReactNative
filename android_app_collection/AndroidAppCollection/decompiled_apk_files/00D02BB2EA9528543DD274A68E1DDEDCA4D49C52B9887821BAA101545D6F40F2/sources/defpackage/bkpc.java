package defpackage;
/* compiled from: PG */
/* renamed from: bkpc  reason: default package */
/* loaded from: classes3.dex */
public final class bkpc extends bkph {
    public final boolean a;
    public final int b;

    public bkpc(int i, boolean z) {
        this.b = i;
        this.a = z;
    }

    @Override // defpackage.bkph
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.bkph
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bkph) {
            bkph bkphVar = (bkph) obj;
            if (this.b == bkphVar.b() && this.a == bkphVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b ^ 1000003) * 1000003) ^ (true != this.a ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.b != 1 ? "OWNER_RESPONSE" : "REVIEW";
        boolean z = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 61);
        sb.append("ReviewRapOptions{getTarget=");
        sb.append(str);
        sb.append(", checkWebViewCompatibility=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
