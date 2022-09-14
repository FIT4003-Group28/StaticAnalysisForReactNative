package defpackage;
/* compiled from: PG */
/* renamed from: xcu  reason: default package */
/* loaded from: classes7.dex */
final class xcu extends xdf {
    private final xde a;
    private final cqtd b;

    public xcu(xde xdeVar, cqtd cqtdVar) {
        if (xdeVar != null) {
            this.a = xdeVar;
            this.b = cqtdVar;
            return;
        }
        throw new NullPointerException("Null pinletSize");
    }

    @Override // defpackage.xdf
    public final xde a() {
        return this.a;
    }

    @Override // defpackage.xdf
    public final cqtd b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xdf) {
            xdf xdfVar = (xdf) obj;
            if (this.a.equals(xdfVar.a()) && this.b.equals(xdfVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30 + String.valueOf(valueOf2).length());
        sb.append("PinletSpec{pinletSize=");
        sb.append(valueOf);
        sb.append(", icon=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
