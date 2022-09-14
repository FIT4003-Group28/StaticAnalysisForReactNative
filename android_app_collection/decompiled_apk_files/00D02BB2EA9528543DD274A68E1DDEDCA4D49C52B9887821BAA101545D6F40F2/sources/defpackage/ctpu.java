package defpackage;
/* compiled from: PG */
/* renamed from: ctpu  reason: default package */
/* loaded from: classes5.dex */
final class ctpu extends ctqy {
    private final String a;
    private final ctqx b;

    public ctpu(String str, ctqx ctqxVar) {
        this.a = str;
        this.b = ctqxVar;
    }

    @Override // defpackage.ctqy
    public final String a() {
        return this.a;
    }

    @Override // defpackage.ctqy
    public final ctqx b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctqy) {
            ctqy ctqyVar = (ctqy) obj;
            if (this.a.equals(ctqyVar.a()) && this.b.equals(ctqyVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(valueOf).length());
        sb.append("Push{pushId=");
        sb.append(str);
        sb.append(", oneOfType=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
