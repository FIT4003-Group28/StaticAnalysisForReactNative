package defpackage;
/* compiled from: PG */
/* renamed from: cucs  reason: default package */
/* loaded from: classes5.dex */
public final class cucs extends cufb {
    private final int a;
    private final cufa b;

    public cucs(int i, cufa cufaVar) {
        this.a = i;
        this.b = cufaVar;
    }

    @Override // defpackage.cufb
    public final int a() {
        return this.a;
    }

    @Override // defpackage.cufb
    public final cufa b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cufb) {
            cufb cufbVar = (cufb) obj;
            if (this.a == cufbVar.a() && this.b.equals(cufbVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
        sb.append("CloudAnnotation{type=");
        sb.append(i);
        sb.append(", metadata=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
