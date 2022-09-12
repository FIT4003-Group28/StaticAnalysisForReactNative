package defpackage;
/* compiled from: PG */
/* renamed from: qak  reason: default package */
/* loaded from: classes7.dex */
final class qak extends qcl {
    private final dndr a;
    private final akqi b;
    private final akqq c;
    private final boolean d;
    private final String e;

    public qak(@dzsi dndr dndrVar, @dzsi akqi akqiVar, @dzsi akqq akqqVar, boolean z, @dzsi String str) {
        this.a = dndrVar;
        this.b = akqiVar;
        this.c = akqqVar;
        this.d = z;
        this.e = str;
    }

    @Override // defpackage.qcl
    @dzsi
    public final dndr a() {
        return this.a;
    }

    @Override // defpackage.qcl
    @dzsi
    public final akqi b() {
        return this.b;
    }

    @Override // defpackage.qcl
    @dzsi
    public final akqq c() {
        return this.c;
    }

    @Override // defpackage.qcl
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.qcl
    @dzsi
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof qcl) {
            qcl qclVar = (qcl) obj;
            dndr dndrVar = this.a;
            if (dndrVar != null ? dndrVar.equals(qclVar.a()) : qclVar.a() == null) {
                akqi akqiVar = this.b;
                if (akqiVar != null ? akqiVar.equals(qclVar.b()) : qclVar.b() == null) {
                    akqq akqqVar = this.c;
                    if (akqqVar != null ? akqqVar.equals(qclVar.c()) : qclVar.c() == null) {
                        if (this.d == qclVar.d() && ((str = this.e) != null ? str.equals(qclVar.e()) : qclVar.e() == null)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        dndr dndrVar = this.a;
        int i = 0;
        int hashCode = ((dndrVar == null ? 0 : dndrVar.hashCode()) ^ 1000003) * 1000003;
        akqi akqiVar = this.b;
        int hashCode2 = (hashCode ^ (akqiVar == null ? 0 : akqiVar.hashCode())) * 1000003;
        akqq akqqVar = this.c;
        int hashCode3 = (((hashCode2 ^ (akqqVar == null ? 0 : akqqVar.hashCode())) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003;
        String str = this.e;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode3 ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        boolean z = this.d;
        String str = this.e;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 81 + length2 + String.valueOf(valueOf3).length() + String.valueOf(str).length());
        sb.append("CommuteWaypoint{aliasType=");
        sb.append(valueOf);
        sb.append(", featureId=");
        sb.append(valueOf2);
        sb.append(", latLng=");
        sb.append(valueOf3);
        sb.append(", useCurrentLocation=");
        sb.append(z);
        sb.append(", name=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
