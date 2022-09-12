package defpackage;
/* compiled from: PG */
/* renamed from: ctmi  reason: default package */
/* loaded from: classes5.dex */
final class ctmi extends ctmn {
    private final String a;
    private final ctmr b;

    public ctmi(String str, ctmr ctmrVar) {
        this.a = str;
        this.b = ctmrVar;
    }

    @Override // defpackage.ctmn
    public final String a() {
        return this.a;
    }

    @Override // defpackage.ctmn
    public final ctmr b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctmn) {
            ctmn ctmnVar = (ctmn) obj;
            if (this.a.equals(ctmnVar.a()) && this.b.equals(ctmnVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 47 + String.valueOf(valueOf).length());
        sb.append("LighterJobParameters{tag=");
        sb.append(str);
        sb.append(", lighterRetryPolicy=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
