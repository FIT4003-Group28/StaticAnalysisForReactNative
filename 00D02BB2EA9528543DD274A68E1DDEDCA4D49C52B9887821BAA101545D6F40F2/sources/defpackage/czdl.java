package defpackage;
/* compiled from: PG */
/* renamed from: czdl  reason: default package */
/* loaded from: classes5.dex */
final class czdl extends czdi {
    private final cyvt a;
    private final cyvs b;

    public czdl(cyvt cyvtVar, cyvs cyvsVar) {
        if (cyvtVar != null) {
            this.a = cyvtVar;
            this.b = cyvsVar;
            return;
        }
        throw new NullPointerException("Null resultBuilder");
    }

    @Override // defpackage.czdi
    public final cyvt b() {
        return this.a;
    }

    @Override // defpackage.czdi
    public final cyvs c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof czdi) {
            czdi czdiVar = (czdi) obj;
            if (this.a.equals(czdiVar.b()) && this.b.equals(czdiVar.c())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44 + String.valueOf(valueOf2).length());
        sb.append("InternalResultTuple{resultBuilder=");
        sb.append(valueOf);
        sb.append(", result=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
