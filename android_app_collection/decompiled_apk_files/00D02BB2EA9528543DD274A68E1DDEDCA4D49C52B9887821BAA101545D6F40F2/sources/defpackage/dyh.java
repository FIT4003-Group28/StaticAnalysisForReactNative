package defpackage;
/* compiled from: PG */
/* renamed from: dyh  reason: default package */
/* loaded from: classes6.dex */
final class dyh extends dxr {
    private final akqi a;
    private final String b;
    private final int c;
    private final akqi d;
    private final String e;
    private final akqi f;
    private final String g;
    private final float h;
    private final double i;
    private final double j;
    private final dsza k;
    private final dcdc<dfmg> l;

    public dyh(@dzsi akqi akqiVar, @dzsi String str, int i, @dzsi akqi akqiVar2, @dzsi String str2, @dzsi akqi akqiVar3, @dzsi String str3, float f, double d, double d2, @dzsi dsza dszaVar, dcdc<dfmg> dcdcVar) {
        this.a = akqiVar;
        this.b = str;
        this.c = i;
        this.d = akqiVar2;
        this.e = str2;
        this.f = akqiVar3;
        this.g = str3;
        this.h = f;
        this.i = d;
        this.j = d2;
        this.k = dszaVar;
        this.l = dcdcVar;
    }

    @Override // defpackage.dxr
    @dzsi
    public final akqi a() {
        return this.a;
    }

    @Override // defpackage.dxr
    @dzsi
    public final String b() {
        return this.b;
    }

    @Override // defpackage.dxr
    public final int c() {
        return this.c;
    }

    @Override // defpackage.dxr
    @dzsi
    public final akqi d() {
        return this.d;
    }

    @Override // defpackage.dxr
    @dzsi
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        akqi akqiVar;
        String str;
        akqi akqiVar2;
        String str2;
        dsza dszaVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dxr) {
            dxr dxrVar = (dxr) obj;
            akqi akqiVar3 = this.a;
            if (akqiVar3 != null ? akqiVar3.equals(dxrVar.a()) : dxrVar.a() == null) {
                String str3 = this.b;
                if (str3 != null ? str3.equals(dxrVar.b()) : dxrVar.b() == null) {
                    if (this.c == dxrVar.c() && ((akqiVar = this.d) != null ? akqiVar.equals(dxrVar.d()) : dxrVar.d() == null) && ((str = this.e) != null ? str.equals(dxrVar.e()) : dxrVar.e() == null) && ((akqiVar2 = this.f) != null ? akqiVar2.equals(dxrVar.f()) : dxrVar.f() == null) && ((str2 = this.g) != null ? str2.equals(dxrVar.g()) : dxrVar.g() == null) && Float.floatToIntBits(this.h) == Float.floatToIntBits(dxrVar.h()) && Double.doubleToLongBits(this.i) == Double.doubleToLongBits(dxrVar.i()) && Double.doubleToLongBits(this.j) == Double.doubleToLongBits(dxrVar.j()) && ((dszaVar = this.k) != null ? dszaVar.equals(dxrVar.k()) : dxrVar.k() == null) && dchl.m(this.l, dxrVar.l())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.dxr
    @dzsi
    public final akqi f() {
        return this.f;
    }

    @Override // defpackage.dxr
    @dzsi
    public final String g() {
        return this.g;
    }

    @Override // defpackage.dxr
    public final float h() {
        return this.h;
    }

    public final int hashCode() {
        akqi akqiVar = this.a;
        int i = 0;
        int hashCode = ((akqiVar == null ? 0 : akqiVar.hashCode()) ^ 1000003) * 1000003;
        String str = this.b;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c) * 1000003;
        akqi akqiVar2 = this.d;
        int hashCode3 = (hashCode2 ^ (akqiVar2 == null ? 0 : akqiVar2.hashCode())) * 1000003;
        String str2 = this.e;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        akqi akqiVar3 = this.f;
        int hashCode5 = (hashCode4 ^ (akqiVar3 == null ? 0 : akqiVar3.hashCode())) * 1000003;
        String str3 = this.g;
        int hashCode6 = (((((((hashCode5 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ Float.floatToIntBits(this.h)) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.i) >>> 32) ^ Double.doubleToLongBits(this.i)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.j) >>> 32) ^ Double.doubleToLongBits(this.j)))) * 1000003;
        dsza dszaVar = this.k;
        if (dszaVar != null && (i = dszaVar.bC) == 0) {
            i = dsst.a.b(dszaVar).c(dszaVar);
            dszaVar.bC = i;
        }
        return ((hashCode6 ^ i) * 1000003) ^ this.l.hashCode();
    }

    @Override // defpackage.dxr
    public final double i() {
        return this.i;
    }

    @Override // defpackage.dxr
    public final double j() {
        return this.j;
    }

    @Override // defpackage.dxr
    @dzsi
    public final dsza k() {
        return this.k;
    }

    @Override // defpackage.dxr
    public final dcdc<dfmg> l() {
        return this.l;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        int i = this.c;
        String valueOf2 = String.valueOf(this.d);
        String str2 = this.e;
        String valueOf3 = String.valueOf(this.f);
        String str3 = this.g;
        float f = this.h;
        double d = this.i;
        double d2 = this.j;
        String valueOf4 = String.valueOf(this.k);
        String valueOf5 = String.valueOf(this.l);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(str2).length();
        int length5 = String.valueOf(valueOf3).length();
        int length6 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(length + 308 + length2 + length3 + length4 + length5 + length6 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("ArVenueLocation{venueFeatureId=");
        sb.append(valueOf);
        sb.append(", venueName=");
        sb.append(str);
        sb.append(", numVenueBuildings=");
        sb.append(i);
        sb.append(", buildingFeatureId=");
        sb.append(valueOf2);
        sb.append(", buildingName=");
        sb.append(str2);
        sb.append(", levelFeatureId=");
        sb.append(valueOf3);
        sb.append(", levelName=");
        sb.append(str3);
        sb.append(", levelNumber=");
        sb.append(f);
        sb.append(", levelMinAltitudeMetersWgs84=");
        sb.append(d);
        sb.append(", levelMaxAltitudeMetersWgs84=");
        sb.append(d2);
        sb.append(", latLngAlt=");
        sb.append(valueOf4);
        sb.append(", levelChangePoints=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
