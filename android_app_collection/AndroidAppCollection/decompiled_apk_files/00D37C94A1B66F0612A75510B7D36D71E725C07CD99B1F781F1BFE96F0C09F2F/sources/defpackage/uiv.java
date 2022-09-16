package defpackage;
/* compiled from: PG */
/* renamed from: uiv  reason: default package */
/* loaded from: classes4.dex */
public final class uiv {
    public final boolean a;
    public final uiu b;

    public uiv() {
    }

    public uiv(boolean z, uiu uiuVar) {
        this.a = z;
        this.b = uiuVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uiv) {
            uiv uivVar = (uiv) obj;
            if (this.a == uivVar.a) {
                uiu uiuVar = this.b;
                uiu uiuVar2 = uivVar.b;
                if (uiuVar != null ? uiuVar.equals(uiuVar2) : uiuVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003;
        uiu uiuVar = this.b;
        return i ^ (uiuVar == null ? 0 : uiuVar.hashCode());
    }

    public final String toString() {
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
        sb.append("InterceptionResult{isIntercepted=");
        sb.append(z);
        sb.append(", dropReason=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
