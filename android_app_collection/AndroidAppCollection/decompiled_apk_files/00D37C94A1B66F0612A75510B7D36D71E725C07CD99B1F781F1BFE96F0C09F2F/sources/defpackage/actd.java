package defpackage;
/* compiled from: PG */
/* renamed from: actd  reason: default package */
/* loaded from: classes.dex */
public final class actd {
    public final acum a;
    public final boolean b;

    public actd() {
    }

    public actd(acum acumVar, boolean z) {
        this.a = acumVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof actd) {
            actd actdVar = (actd) obj;
            if (this.a.equals(actdVar.a) && this.b == actdVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * (-721379959)) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 97 + "null".length());
        sb.append("VisualElementContainerViewBinding{veContainer=");
        sb.append(valueOf);
        sb.append(", clientData=");
        sb.append("null");
        sb.append(", enableRecursiveViewMonitoring=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
