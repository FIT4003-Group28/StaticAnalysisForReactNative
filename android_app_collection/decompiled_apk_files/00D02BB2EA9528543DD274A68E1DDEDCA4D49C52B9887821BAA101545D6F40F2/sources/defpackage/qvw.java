package defpackage;
/* compiled from: PG */
/* renamed from: qvw  reason: default package */
/* loaded from: classes7.dex */
final class qvw extends qvx {
    private final dndr a;
    private final azva b;
    private final qvt c;

    public qvw(dndr dndrVar, @dzsi azva azvaVar, qvt qvtVar) {
        if (dndrVar != null) {
            this.a = dndrVar;
            this.b = azvaVar;
            this.c = qvtVar;
            return;
        }
        throw new NullPointerException("Null aliasType");
    }

    @Override // defpackage.qvx
    public final dndr a() {
        return this.a;
    }

    @Override // defpackage.qvx
    @dzsi
    public final azva b() {
        return this.b;
    }

    @Override // defpackage.qvx
    public final qvt c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        azva azvaVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof qvx) {
            qvx qvxVar = (qvx) obj;
            if (this.a.equals(qvxVar.a()) && ((azvaVar = this.b) != null ? azvaVar.equals(qvxVar.b()) : qvxVar.b() == null) && this.c.equals(qvxVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        azva azvaVar = this.b;
        return ((hashCode ^ (azvaVar == null ? 0 : azvaVar.hashCode())) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 50 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("DropDownItemData{aliasType=");
        sb.append(valueOf);
        sb.append(", alias=");
        sb.append(valueOf2);
        sb.append(", destination=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
