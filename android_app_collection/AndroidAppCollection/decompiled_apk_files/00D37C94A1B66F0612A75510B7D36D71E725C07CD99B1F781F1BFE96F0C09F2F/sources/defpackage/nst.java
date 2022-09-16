package defpackage;
/* compiled from: PG */
/* renamed from: nst  reason: default package */
/* loaded from: classes3.dex */
public final class nst {
    public final nsr a;
    public final ampq b;

    public nst(nsr nsrVar, ampq ampqVar) {
        if (nsrVar != null) {
            this.a = nsrVar;
            this.b = ampqVar;
            return;
        }
        throw new NullPointerException("Null sizeState");
    }

    public static nst a(nsr nsrVar) {
        return b(nsrVar, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static nst b(nsr nsrVar, aynx aynxVar) {
        return new nst(nsrVar, ampq.i(aynxVar));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nst) {
            nst nstVar = (nst) obj;
            if (this.a.equals(nstVar.a) && this.b.equals(nstVar.b)) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46 + String.valueOf(valueOf2).length());
        sb.append("SizeStateRequest{sizeState=");
        sb.append(valueOf);
        sb.append(", customAnimation=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public nst() {
    }
}
