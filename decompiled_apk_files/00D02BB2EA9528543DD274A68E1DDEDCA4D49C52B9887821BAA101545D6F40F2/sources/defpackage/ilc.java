package defpackage;
/* compiled from: PG */
/* renamed from: ilc  reason: default package */
/* loaded from: classes6.dex */
public final class ilc extends ilx {
    public final eapg a;
    public final eapd b;
    public final int c;

    public ilc(int i, @dzsi eapg eapgVar, @dzsi eapd eapdVar) {
        this.c = i;
        this.a = eapgVar;
        this.b = eapdVar;
    }

    @Override // defpackage.ilx
    @dzsi
    public final eapg a() {
        return this.a;
    }

    @Override // defpackage.ilx
    @dzsi
    public final eapd b() {
        return this.b;
    }

    @Override // defpackage.ilx
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        eapg eapgVar;
        eapd eapdVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ilx) {
            ilx ilxVar = (ilx) obj;
            if (this.c == ilxVar.c() && ((eapgVar = this.a) != null ? eapgVar.equals(ilxVar.a()) : ilxVar.a() == null) && ((eapdVar = this.b) != null ? eapdVar.equals(ilxVar.b()) : ilxVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.c ^ 1000003) * 1000003;
        eapg eapgVar = this.a;
        int i2 = 0;
        int hashCode = (i ^ (eapgVar == null ? 0 : eapgVar.hashCode())) * 1000003;
        eapd eapdVar = this.b;
        if (eapdVar != null) {
            i2 = eapdVar.hashCode();
        }
        return hashCode ^ i2;
    }

    public final String toString() {
        int i = this.c;
        String str = i != 1 ? i != 2 ? i != 3 ? "HERE_NOW" : "NOT_HERE_NOW" : "NOT_BEEN_HERE" : "MARK_AS_VISITED";
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(str.length() + 51 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("VisitsOperation{operation=");
        sb.append(str);
        sb.append(", today=");
        sb.append(valueOf);
        sb.append(", operationTime=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
