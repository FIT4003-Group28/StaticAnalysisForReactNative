package defpackage;
/* compiled from: PG */
/* renamed from: crhe  reason: default package */
/* loaded from: classes5.dex */
final class crhe extends crhq {
    private final arym a;
    private final boolean b;

    public crhe(arym arymVar, boolean z) {
        if (arymVar != null) {
            this.a = arymVar;
            this.b = z;
            return;
        }
        throw new NullPointerException("Null mode");
    }

    @Override // defpackage.crhq
    public final arym a() {
        return this.a;
    }

    @Override // defpackage.crhq
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof crhq) {
            crhq crhqVar = (crhq) obj;
            if (this.a.equals(crhqVar.a()) && this.b == crhqVar.b()) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
        sb.append("NavigationSessionStateEvent{mode=");
        sb.append(valueOf);
        sb.append(", started=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
