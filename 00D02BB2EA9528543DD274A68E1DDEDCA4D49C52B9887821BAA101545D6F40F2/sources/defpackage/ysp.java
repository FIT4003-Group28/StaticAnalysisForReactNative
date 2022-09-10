package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ysp  reason: default package */
/* loaded from: classes7.dex */
public final class ysp extends ytb {
    public final String a;
    public final doza b;
    public final String c;
    public final dcdc<dozz> d;
    public final dcdc<dbsi<String, List<ysx>>> e;
    public final akqi f;
    public final drij g;
    public final dcdc<dpce> h;
    public final double i;

    public ysp(String str, @dzsi doza dozaVar, @dzsi String str2, dcdc<dozz> dcdcVar, dcdc<dbsi<String, List<ysx>>> dcdcVar2, akqi akqiVar, drij drijVar, dcdc<dpce> dcdcVar3, double d) {
        this.a = str;
        this.b = dozaVar;
        this.c = str2;
        this.d = dcdcVar;
        this.e = dcdcVar2;
        this.f = akqiVar;
        this.g = drijVar;
        this.h = dcdcVar3;
        this.i = d;
    }

    @Override // defpackage.ytb
    public final String a() {
        return this.a;
    }

    @Override // defpackage.ytb
    @dzsi
    public final doza b() {
        return this.b;
    }

    @Override // defpackage.ytb
    @dzsi
    public final String c() {
        return this.c;
    }

    @Override // defpackage.ytb
    public final dcdc<dozz> d() {
        return this.d;
    }

    @Override // defpackage.ytb
    public final dcdc<dbsi<String, List<ysx>>> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        doza dozaVar;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ytb) {
            ytb ytbVar = (ytb) obj;
            if (this.a.equals(ytbVar.a()) && ((dozaVar = this.b) != null ? dozaVar.equals(ytbVar.b()) : ytbVar.b() == null) && ((str = this.c) != null ? str.equals(ytbVar.c()) : ytbVar.c() == null) && dchl.m(this.d, ytbVar.d()) && dchl.m(this.e, ytbVar.e()) && this.f.equals(ytbVar.f()) && this.g.equals(ytbVar.g()) && dchl.m(this.h, ytbVar.h()) && Double.doubleToLongBits(this.i) == Double.doubleToLongBits(ytbVar.i())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ytb
    public final akqi f() {
        return this.f;
    }

    @Override // defpackage.ytb
    public final drij g() {
        return this.g;
    }

    @Override // defpackage.ytb
    public final dcdc<dpce> h() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        doza dozaVar = this.b;
        int i = 0;
        int hashCode2 = (hashCode ^ (dozaVar == null ? 0 : dozaVar.hashCode())) * 1000003;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        int hashCode3 = (((((((hashCode2 ^ i) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003;
        drij drijVar = this.g;
        int i2 = drijVar.bC;
        if (i2 == 0) {
            i2 = dsst.a.b(drijVar).c(drijVar);
            drijVar.bC = i2;
        }
        return ((((hashCode3 ^ i2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.i) >>> 32) ^ Double.doubleToLongBits(this.i)));
    }

    @Override // defpackage.ytb
    public final double i() {
        return this.i;
    }

    @Override // defpackage.ytb
    public final yta j() {
        return new yso(this);
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String str2 = this.c;
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.g);
        String valueOf6 = String.valueOf(this.h);
        double d = this.i;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(str2).length();
        int length4 = String.valueOf(valueOf2).length();
        int length5 = String.valueOf(valueOf3).length();
        int length6 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 247 + length2 + length3 + length4 + length5 + length6 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("NearbyTransitLineStation{stationName=");
        sb.append(str);
        sb.append(", stationNoticeSeverity=");
        sb.append(valueOf);
        sb.append(", stationNoticeDataElementReference=");
        sb.append(str2);
        sb.append(", stationNotices=");
        sb.append(valueOf2);
        sb.append(", headsignAndDepartures=");
        sb.append(valueOf3);
        sb.append(", stationFeatureId=");
        sb.append(valueOf4);
        sb.append(", departureStop=");
        sb.append(valueOf5);
        sb.append(", renderableComponents=");
        sb.append(valueOf6);
        sb.append(", distanceToStationMeters=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
