package defpackage;

import j$.util.Optional;
/* compiled from: PG */
/* renamed from: eor  reason: default package */
/* loaded from: classes3.dex */
public final class eor {
    public final aovi a;
    public final boolean b;
    public final Optional c;

    public eor() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eor) {
            eor eorVar = (eor) obj;
            if (this.a.equals(eorVar.a) && this.b == eorVar.b && this.c.equals(eorVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 98 + String.valueOf(valueOf2).length());
        sb.append("AboutThisAdWebViewListenerData{aboutThisAdEndpoint=");
        sb.append(valueOf);
        sb.append(", isAdAlreadyPaused=");
        sb.append(z);
        sb.append(", hideEnclosingEvent=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public eor(aovi aoviVar, boolean z, Optional optional) {
        if (aoviVar != null) {
            this.a = aoviVar;
            this.b = z;
            if (optional != null) {
                this.c = optional;
                return;
            }
            throw new NullPointerException("Null hideEnclosingEvent");
        }
        throw new NullPointerException("Null aboutThisAdEndpoint");
    }
}
