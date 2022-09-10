package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ysn  reason: default package */
/* loaded from: classes7.dex */
public final class ysn extends ysz {
    public final double a;
    public final doza b;
    public final dcdc<dozz> c;
    public final dcdc<dpce> d;
    public final akqi e;
    public final dgsn f;
    public final jhk g;
    public final int h;
    public final dcdc<ytb> i;
    public final akqq j;

    public ysn(double d, @dzsi doza dozaVar, dcdc<dozz> dcdcVar, dcdc<dpce> dcdcVar2, akqi akqiVar, dgsn dgsnVar, @dzsi jhk jhkVar, int i, dcdc<ytb> dcdcVar3, akqq akqqVar) {
        this.a = d;
        this.b = dozaVar;
        this.c = dcdcVar;
        this.d = dcdcVar2;
        this.e = akqiVar;
        this.f = dgsnVar;
        this.g = jhkVar;
        this.h = i;
        this.i = dcdcVar3;
        this.j = akqqVar;
    }

    @Override // defpackage.ysz
    public final double a() {
        return this.a;
    }

    @Override // defpackage.ysz
    @dzsi
    public final doza b() {
        return this.b;
    }

    @Override // defpackage.ysz
    public final dcdc<dozz> c() {
        return this.c;
    }

    @Override // defpackage.ysz
    public final dcdc<dpce> d() {
        return this.d;
    }

    @Override // defpackage.ysz
    public final akqi e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        doza dozaVar;
        jhk jhkVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ysz) {
            ysz yszVar = (ysz) obj;
            if (Double.doubleToLongBits(this.a) == Double.doubleToLongBits(yszVar.a()) && ((dozaVar = this.b) != null ? dozaVar.equals(yszVar.b()) : yszVar.b() == null) && dchl.m(this.c, yszVar.c()) && dchl.m(this.d, yszVar.d()) && this.e.equals(yszVar.e()) && this.f.equals(yszVar.f()) && ((jhkVar = this.g) != null ? jhkVar.equals(yszVar.g()) : yszVar.g() == null) && this.h == yszVar.h() && dchl.m(this.i, yszVar.i()) && this.j.equals(yszVar.j())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ysz
    public final dgsn f() {
        return this.f;
    }

    @Override // defpackage.ysz
    @dzsi
    public final jhk g() {
        return this.g;
    }

    @Override // defpackage.ysz
    public final int h() {
        return this.h;
    }

    public final int hashCode() {
        int doubleToLongBits = (((int) ((Double.doubleToLongBits(this.a) >>> 32) ^ Double.doubleToLongBits(this.a))) ^ 1000003) * 1000003;
        doza dozaVar = this.b;
        int i = 0;
        int hashCode = (((((((((doubleToLongBits ^ (dozaVar == null ? 0 : dozaVar.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003;
        jhk jhkVar = this.g;
        if (jhkVar != null) {
            i = jhkVar.hashCode();
        }
        return this.j.hashCode() ^ ((((((hashCode ^ i) * 1000003) ^ this.h) * 1000003) ^ this.i.hashCode()) * 1000003);
    }

    @Override // defpackage.ysz
    public final dcdc<ytb> i() {
        return this.i;
    }

    @Override // defpackage.ysz
    public final akqq j() {
        return this.j;
    }

    @Override // defpackage.ysz
    public final ysy k() {
        return new ysm(this);
    }

    public final String toString() {
        double d = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        String valueOf5 = String.valueOf(this.f);
        String valueOf6 = String.valueOf(this.g);
        int i = this.h;
        String valueOf7 = String.valueOf(this.i);
        String valueOf8 = String.valueOf(this.j);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        StringBuilder sb = new StringBuilder(length + 238 + length2 + length3 + length4 + length5 + length6 + String.valueOf(valueOf7).length() + String.valueOf(valueOf8).length());
        sb.append("NearbyTransitLine{distanceToNearestStationMeters=");
        sb.append(d);
        sb.append(", lineNoticeSeverity=");
        sb.append(valueOf);
        sb.append(", lineNotices=");
        sb.append(valueOf2);
        sb.append(", renderableComponents=");
        sb.append(valueOf3);
        sb.append(", lineFeatureId=");
        sb.append(valueOf4);
        sb.append(", vehicleTypeCategory=");
        sb.append(valueOf5);
        sb.append(", vehicleTypeIcon=");
        sb.append(valueOf6);
        sb.append(", lineColor=");
        sb.append(i);
        sb.append(", stations=");
        sb.append(valueOf7);
        sb.append(", queryLocation=");
        sb.append(valueOf8);
        sb.append("}");
        return sb.toString();
    }
}
