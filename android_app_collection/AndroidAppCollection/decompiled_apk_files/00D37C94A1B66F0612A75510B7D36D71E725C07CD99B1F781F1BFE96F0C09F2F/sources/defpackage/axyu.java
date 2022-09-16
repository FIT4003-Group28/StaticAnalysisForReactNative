package defpackage;

import io.grpc.Status;
/* compiled from: PG */
/* renamed from: axyu  reason: default package */
/* loaded from: classes2.dex */
public final class axyu {
    public final axyt a;
    public final Status b;

    public axyu(axyt axytVar, Status status) {
        axytVar.getClass();
        this.a = axytVar;
        status.getClass();
        this.b = status;
    }

    public static axyu a(axyt axytVar) {
        aqxo.q(axytVar != axyt.TRANSIENT_FAILURE, "state is TRANSIENT_ERROR. Use forError() instead");
        return new axyu(axytVar, Status.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof axyu)) {
            return false;
        }
        axyu axyuVar = (axyu) obj;
        return this.a.equals(axyuVar.a) && this.b.equals(axyuVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        if (this.b.f()) {
            return this.a.toString();
        }
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("(");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
