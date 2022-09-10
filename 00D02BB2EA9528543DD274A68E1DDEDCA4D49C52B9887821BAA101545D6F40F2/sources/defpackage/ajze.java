package defpackage;
/* compiled from: PG */
/* renamed from: ajze  reason: default package */
/* loaded from: classes2.dex */
public final class ajze extends ajzp {
    public final ajzo a;
    public final dcdn<String, Boolean> b;

    public ajze(ajzo ajzoVar, dcdn<String, Boolean> dcdnVar) {
        if (ajzoVar != null) {
            this.a = ajzoVar;
            if (dcdnVar != null) {
                this.b = dcdnVar;
                return;
            }
            throw new NullPointerException("Null permissionsResults");
        }
        throw new NullPointerException("Null result");
    }

    @Override // defpackage.ajzp
    public final ajzo a() {
        return this.a;
    }

    @Override // defpackage.ajzp
    public final dcdn<String, Boolean> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajzp) {
            ajzp ajzpVar = (ajzp) obj;
            if (this.a.equals(ajzpVar.a()) && this.b.equals(ajzpVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36 + String.valueOf(valueOf2).length());
        sb.append("Result{result=");
        sb.append(valueOf);
        sb.append(", permissionsResults=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
