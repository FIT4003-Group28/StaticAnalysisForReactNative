package defpackage;
/* compiled from: PG */
/* renamed from: alvv  reason: default package */
/* loaded from: classes2.dex */
public final class alvv extends alyo {
    public final alyn a;
    public final dbsg<alyg> b;

    public alvv(alyn alynVar, dbsg<alyg> dbsgVar) {
        if (alynVar != null) {
            this.a = alynVar;
            this.b = dbsgVar;
            return;
        }
        throw new NullPointerException("Null code");
    }

    @Override // defpackage.alyo
    public final alyn a() {
        return this.a;
    }

    @Override // defpackage.alyo
    public final dbsg<alyg> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof alyo) {
            alyo alyoVar = (alyo) obj;
            if (this.a.equals(alyoVar.a()) && this.b.equals(alyoVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26 + String.valueOf(valueOf2).length());
        sb.append("UnpackResult{code=");
        sb.append(valueOf);
        sb.append(", tile=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
