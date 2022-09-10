package defpackage;
/* compiled from: PG */
/* renamed from: qat  reason: default package */
/* loaded from: classes7.dex */
final class qat extends qdc {
    private final dpce a;
    private final String b;
    private final String c;
    private final String d;
    private final eapd e;
    private final String f;

    public qat(@dzsi dpce dpceVar, String str, @dzsi String str2, @dzsi String str3, @dzsi eapd eapdVar, @dzsi String str4) {
        this.a = dpceVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = eapdVar;
        this.f = str4;
    }

    @Override // defpackage.qdc
    @dzsi
    public final dpce a() {
        return this.a;
    }

    @Override // defpackage.qdc
    public final String b() {
        return this.b;
    }

    @Override // defpackage.qdc
    @dzsi
    public final String c() {
        return this.c;
    }

    @Override // defpackage.qdc
    @dzsi
    public final String d() {
        return this.d;
    }

    @Override // defpackage.qdc
    @dzsi
    public final eapd e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        eapd eapdVar;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof qdc) {
            qdc qdcVar = (qdc) obj;
            dpce dpceVar = this.a;
            if (dpceVar != null ? dpceVar.equals(qdcVar.a()) : qdcVar.a() == null) {
                if (this.b.equals(qdcVar.b()) && ((str = this.c) != null ? str.equals(qdcVar.c()) : qdcVar.c() == null) && ((str2 = this.d) != null ? str2.equals(qdcVar.d()) : qdcVar.d() == null) && ((eapdVar = this.e) != null ? eapdVar.equals(qdcVar.e()) : qdcVar.e() == null) && ((str3 = this.f) != null ? str3.equals(qdcVar.f()) : qdcVar.f() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.qdc
    @dzsi
    public final String f() {
        return this.f;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        String valueOf2 = String.valueOf(this.e);
        String str4 = this.f;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(str2).length();
        int length4 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(length + 143 + length2 + length3 + length4 + String.valueOf(valueOf2).length() + String.valueOf(str4).length());
        sb.append("StartTransitLineParams{chipWhileLoading=");
        sb.append(valueOf);
        sb.append(", lineFeatureId=");
        sb.append(str);
        sb.append(", originStationFeatureId=");
        sb.append(str2);
        sb.append(", destinationStationFeatureId=");
        sb.append(str3);
        sb.append(", departureTime=");
        sb.append(valueOf2);
        sb.append(", vehicleToken=");
        sb.append(str4);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        int i;
        dpce dpceVar = this.a;
        int i2 = 0;
        if (dpceVar == null) {
            i = 0;
        } else {
            i = dpceVar.bC;
            if (i == 0) {
                i = dsst.a.b(dpceVar).c(dpceVar);
                dpceVar.bC = i;
            }
        }
        int hashCode = (((i ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.d;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        eapd eapdVar = this.e;
        int hashCode4 = (hashCode3 ^ (eapdVar == null ? 0 : eapdVar.hashCode())) * 1000003;
        String str3 = this.f;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode4 ^ i2;
    }
}
