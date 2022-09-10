package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aoxf  reason: default package */
/* loaded from: classes2.dex */
public final class aoxf extends aoyg {
    public final aoyj a;
    public final aoyf b;
    public final dcdc<aoxt> c;
    public final dcdc<aoxt> d;
    public final eapd e;
    public final dspd f;
    public final dbsg<bttq> g;

    public aoxf(aoyj aoyjVar, aoyf aoyfVar, dcdc<aoxt> dcdcVar, dcdc<aoxt> dcdcVar2, eapd eapdVar, @dzsi dspd dspdVar, dbsg<bttq> dbsgVar) {
        this.a = aoyjVar;
        this.b = aoyfVar;
        this.c = dcdcVar;
        this.d = dcdcVar2;
        this.e = eapdVar;
        this.f = dspdVar;
        this.g = dbsgVar;
    }

    @Override // defpackage.aoyg
    public final aoyj a() {
        return this.a;
    }

    @Override // defpackage.aoyg
    public final aoyf b() {
        return this.b;
    }

    @Override // defpackage.aoyg
    public final dcdc<aoxt> c() {
        return this.c;
    }

    @Override // defpackage.aoyg
    public final dcdc<aoxt> d() {
        return this.d;
    }

    @Override // defpackage.aoyg
    public final eapd e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        dspd dspdVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aoyg) {
            aoyg aoygVar = (aoyg) obj;
            if (this.a.equals(aoygVar.a()) && this.b.equals(aoygVar.b()) && dchl.m(this.c, aoygVar.c()) && dchl.m(this.d, aoygVar.d()) && this.e.equals(aoygVar.e()) && ((dspdVar = this.f) != null ? dspdVar.equals(aoygVar.f()) : aoygVar.f() == null) && this.g.equals(aoygVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aoyg
    @dzsi
    public final dspd f() {
        return this.f;
    }

    @Override // defpackage.aoyg
    public final dbsg<bttq> g() {
        return this.g;
    }

    @Override // defpackage.aoyg
    public final aoye h() {
        return new aoxe(this);
    }

    public final int hashCode() {
        int hashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        dspd dspdVar = this.f;
        return ((hashCode ^ (dspdVar == null ? 0 : dspdVar.hashCode())) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String valueOf7 = String.valueOf(this.g);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        StringBuilder sb = new StringBuilder(length + 131 + length2 + length3 + length4 + length5 + String.valueOf(valueOf6).length() + String.valueOf(valueOf7).length());
        sb.append("VisitedPlacesList{key=");
        sb.append(valueOf);
        sb.append(", stateType=");
        sb.append(valueOf2);
        sb.append(", partiallyLoadedPlaces=");
        sb.append(valueOf3);
        sb.append(", fullyLoadedPlaces=");
        sb.append(valueOf4);
        sb.append(", creationTimestamp=");
        sb.append(valueOf5);
        sb.append(", continuationToken=");
        sb.append(valueOf6);
        sb.append(", errorCode=");
        sb.append(valueOf7);
        sb.append("}");
        return sb.toString();
    }
}
