package defpackage;
/* compiled from: PG */
/* renamed from: eyy  reason: default package */
/* loaded from: classes3.dex */
public final class eyy {
    public final ayos a;
    public final ayoc b;

    public eyy() {
    }

    public eyy(ayos ayosVar, ayoc ayocVar) {
        this.a = ayosVar;
        this.b = ayocVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eyy) {
            eyy eyyVar = (eyy) obj;
            if (this.a.equals(eyyVar.a) && this.b.equals(eyyVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53 + String.valueOf(valueOf2).length());
        sb.append("MultipleResponses{networkResponse=");
        sb.append(valueOf);
        sb.append(", initialResponse=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
