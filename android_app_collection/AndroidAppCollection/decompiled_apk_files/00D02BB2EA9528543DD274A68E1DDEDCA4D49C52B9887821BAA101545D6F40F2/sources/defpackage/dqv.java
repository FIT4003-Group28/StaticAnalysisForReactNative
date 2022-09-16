package defpackage;
/* compiled from: PG */
/* renamed from: dqv  reason: default package */
/* loaded from: classes6.dex */
final class dqv extends dpf {
    private final ddho a;
    private final dpe b;

    public dqv(dpe dpeVar, ddho ddhoVar) {
        this.b = dpeVar;
        this.a = ddhoVar;
    }

    @Override // defpackage.dpf
    public final ddho a() {
        return this.a;
    }

    @Override // defpackage.dpf
    public final dpe b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dpf) {
            dpf dpfVar = (dpf) obj;
            if (this.b.equals(dpfVar.b()) && this.a.equals(dpfVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36 + String.valueOf(valueOf2).length());
        sb.append("Result{launcher=");
        sb.append(valueOf);
        sb.append(", entrypointVeType=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
