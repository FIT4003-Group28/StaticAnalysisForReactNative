package defpackage;

import j$.util.Optional;
/* compiled from: PG */
/* renamed from: gjj  reason: default package */
/* loaded from: classes3.dex */
public final class gjj {
    public final Optional a;
    public final boolean b;

    public gjj(Optional optional, boolean z) {
        if (optional != null) {
            this.a = optional;
            this.b = z;
            return;
        }
        throw new NullPointerException("Null downloadedVideo");
    }

    public static gjj a(Optional optional, boolean z) {
        return new gjj(optional, z);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gjj) {
            gjj gjjVar = (gjj) obj;
            if (this.a.equals(gjjVar.a) && this.b == gjjVar.b) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 68);
        sb.append("AsyncResolutionResult{downloadedVideo=");
        sb.append(valueOf);
        sb.append(", shouldCompleteResolve=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    public gjj() {
    }
}
