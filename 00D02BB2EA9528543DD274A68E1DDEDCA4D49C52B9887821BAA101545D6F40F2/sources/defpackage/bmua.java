package defpackage;
/* compiled from: PG */
/* renamed from: bmua  reason: default package */
/* loaded from: classes3.dex */
final class bmua extends bmup {
    private final eapd a;
    private final boolean b;

    public bmua(eapd eapdVar, boolean z) {
        this.a = eapdVar;
        this.b = z;
    }

    @Override // defpackage.bmup
    public final eapd a() {
        return this.a;
    }

    @Override // defpackage.bmup
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bmup) {
            bmup bmupVar = (bmup) obj;
            if (this.a.equals(bmupVar.a()) && this.b == bmupVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
        sb.append("VisitInstant{instant=");
        sb.append(valueOf);
        sb.append(", isDayCertain=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
