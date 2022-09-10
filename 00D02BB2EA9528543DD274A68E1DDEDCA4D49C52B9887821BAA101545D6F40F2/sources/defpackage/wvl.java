package defpackage;
/* compiled from: PG */
/* renamed from: wvl  reason: default package */
/* loaded from: classes7.dex */
final class wvl extends wvw {
    private final dpjb a;
    private final dcdc<dpce> b;
    private final String c;
    private final dgaw d;
    private final String e;
    private final drhj f;
    private final String g;
    private final long h;
    private final String i;
    private final String j;

    public wvl(dpjb dpjbVar, dcdc<dpce> dcdcVar, String str, dgaw dgawVar, String str2, drhj drhjVar, String str3, long j, String str4, String str5) {
        this.a = dpjbVar;
        this.b = dcdcVar;
        this.c = str;
        this.d = dgawVar;
        this.e = str2;
        this.f = drhjVar;
        this.g = str3;
        this.h = j;
        this.i = str4;
        this.j = str5;
    }

    @Override // defpackage.wvw
    public final dpjb a() {
        return this.a;
    }

    @Override // defpackage.wvw
    public final dcdc<dpce> b() {
        return this.b;
    }

    @Override // defpackage.wvw
    public final String c() {
        return this.c;
    }

    @Override // defpackage.wvw
    public final dgaw d() {
        return this.d;
    }

    @Override // defpackage.wvw
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        drhj drhjVar;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof wvw) {
            wvw wvwVar = (wvw) obj;
            if (this.a.equals(wvwVar.a()) && dchl.m(this.b, wvwVar.b()) && this.c.equals(wvwVar.c()) && this.d.equals(wvwVar.d()) && this.e.equals(wvwVar.e()) && ((drhjVar = this.f) != null ? drhjVar.equals(wvwVar.f()) : wvwVar.f() == null) && this.g.equals(wvwVar.g()) && this.h == wvwVar.h() && this.i.equals(wvwVar.i()) && ((str = this.j) != null ? str.equals(wvwVar.j()) : wvwVar.j() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.wvw
    public final drhj f() {
        return this.f;
    }

    @Override // defpackage.wvw
    public final String g() {
        return this.g;
    }

    @Override // defpackage.wvw
    public final long h() {
        return this.h;
    }

    public final int hashCode() {
        int i;
        dpjb dpjbVar = this.a;
        int i2 = dpjbVar.bC;
        if (i2 == 0) {
            i2 = dsst.a.b(dpjbVar).c(dpjbVar);
            dpjbVar.bC = i2;
        }
        int hashCode = (((((i2 ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        dgaw dgawVar = this.d;
        int i3 = dgawVar.bC;
        if (i3 == 0) {
            i3 = dsst.a.b(dgawVar).c(dgawVar);
            dgawVar.bC = i3;
        }
        int hashCode2 = (((hashCode ^ i3) * 1000003) ^ this.e.hashCode()) * 1000003;
        drhj drhjVar = this.f;
        int i4 = 0;
        if (drhjVar == null) {
            i = 0;
        } else {
            i = drhjVar.bC;
            if (i == 0) {
                i = dsst.a.b(drhjVar).c(drhjVar);
                drhjVar.bC = i;
            }
        }
        int hashCode3 = this.g.hashCode();
        long j = this.h;
        int hashCode4 = (((((((hashCode2 ^ i) * 1000003) ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.i.hashCode()) * 1000003;
        String str = this.j;
        if (str != null) {
            i4 = str.hashCode();
        }
        return hashCode4 ^ i4;
    }

    @Override // defpackage.wvw
    public final String i() {
        return this.i;
    }

    @Override // defpackage.wvw
    public final String j() {
        return this.j;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String str = this.c;
        String valueOf3 = String.valueOf(this.d);
        String str2 = this.e;
        String valueOf4 = String.valueOf(this.f);
        String str3 = this.g;
        long j = this.h;
        String str4 = this.i;
        String str5 = this.j;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(str).length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = String.valueOf(str2).length();
        int length6 = String.valueOf(valueOf4).length();
        int length7 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(length + 234 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(str4).length() + String.valueOf(str5).length());
        sb.append("TripAttributeParams{vehicleAttributes=");
        sb.append(valueOf);
        sb.append(", lineRenderables=");
        sb.append(valueOf2);
        sb.append(", headsign=");
        sb.append(str);
        sb.append(", scheduledTime=");
        sb.append(valueOf3);
        sb.append(", tripToken=");
        sb.append(str2);
        sb.append(", transitAttributeIdentifier=");
        sb.append(valueOf4);
        sb.append(", ved=");
        sb.append(str3);
        sb.append(", firstStationDepartureTimestampSeconds=");
        sb.append(j);
        sb.append(", departureStationFeatureId=");
        sb.append(str4);
        sb.append(", vehicleToken=");
        sb.append(str5);
        sb.append("}");
        return sb.toString();
    }
}
