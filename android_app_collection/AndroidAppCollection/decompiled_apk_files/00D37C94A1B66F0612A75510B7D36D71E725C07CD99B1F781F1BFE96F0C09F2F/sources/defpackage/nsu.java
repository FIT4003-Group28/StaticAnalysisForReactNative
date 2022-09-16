package defpackage;
/* compiled from: PG */
/* renamed from: nsu  reason: default package */
/* loaded from: classes3.dex */
public final class nsu {
    public final ntd a;
    public final nsr b;

    public nsu(ntd ntdVar, nsr nsrVar) {
        if (ntdVar != null) {
            this.a = ntdVar;
            if (nsrVar != null) {
                this.b = nsrVar;
                return;
            }
            throw new NullPointerException("Null resultingSizeState");
        }
        throw new NullPointerException("Null touchReleaseType");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nsu) {
            nsu nsuVar = (nsu) obj;
            if (this.a.equals(nsuVar.a) && this.b.equals(nsuVar.b)) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 74 + String.valueOf(valueOf2).length());
        sb.append("TouchReleaseWithResultingSizeState{touchReleaseType=");
        sb.append(valueOf);
        sb.append(", resultingSizeState=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public nsu() {
    }
}
