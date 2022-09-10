package defpackage;

import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qhj  reason: default package */
/* loaded from: classes7.dex */
public final class qhj extends qhy {
    private final amuk a;
    private final Intent b;
    private final String c;
    private final qhq d;
    private final dcdc<qhq> e;
    private final qhq f;
    private final dcdc<qhq> g;
    private final String h;
    private final qic i;
    private final qic j;

    public qhj(amuk amukVar, @dzsi Intent intent, @dzsi String str, qhq qhqVar, dcdc<qhq> dcdcVar, qhq qhqVar2, dcdc<qhq> dcdcVar2, @dzsi String str2, @dzsi qic qicVar, @dzsi qic qicVar2) {
        this.a = amukVar;
        this.b = intent;
        this.c = str;
        this.d = qhqVar;
        this.e = dcdcVar;
        this.f = qhqVar2;
        this.g = dcdcVar2;
        this.h = str2;
        this.i = qicVar;
        this.j = qicVar2;
    }

    @Override // defpackage.qhy
    public final amuk a() {
        return this.a;
    }

    @Override // defpackage.qhy
    @dzsi
    public final Intent b() {
        return this.b;
    }

    @Override // defpackage.qhy
    @dzsi
    public final String c() {
        return this.c;
    }

    @Override // defpackage.qhy
    public final qhq d() {
        return this.d;
    }

    @Override // defpackage.qhy
    public final dcdc<qhq> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        Intent intent;
        String str;
        String str2;
        qic qicVar;
        qic qicVar2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof qhy) {
            qhy qhyVar = (qhy) obj;
            if (this.a.equals(qhyVar.a()) && ((intent = this.b) != null ? intent.equals(qhyVar.b()) : qhyVar.b() == null) && ((str = this.c) != null ? str.equals(qhyVar.c()) : qhyVar.c() == null) && this.d.equals(qhyVar.d()) && dchl.m(this.e, qhyVar.e()) && this.f.equals(qhyVar.f()) && dchl.m(this.g, qhyVar.g()) && ((str2 = this.h) != null ? str2.equals(qhyVar.h()) : qhyVar.h() == null) && ((qicVar = this.i) != null ? qicVar.equals(qhyVar.i()) : qhyVar.i() == null) && ((qicVar2 = this.j) != null ? qicVar2.equals(qhyVar.j()) : qhyVar.j() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.qhy
    public final qhq f() {
        return this.f;
    }

    @Override // defpackage.qhy
    public final dcdc<qhq> g() {
        return this.g;
    }

    @Override // defpackage.qhy
    @dzsi
    public final String h() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Intent intent = this.b;
        int i = 0;
        int hashCode2 = (hashCode ^ (intent == null ? 0 : intent.hashCode())) * 1000003;
        String str = this.c;
        int hashCode3 = (((((((((hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003;
        String str2 = this.h;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        qic qicVar = this.i;
        int hashCode5 = (hashCode4 ^ (qicVar == null ? 0 : qicVar.hashCode())) * 1000003;
        qic qicVar2 = this.j;
        if (qicVar2 != null) {
            i = qicVar2.hashCode();
        }
        return hashCode5 ^ i;
    }

    @Override // defpackage.qhy
    @dzsi
    public final qic i() {
        return this.i;
    }

    @Override // defpackage.qhy
    @dzsi
    public final qic j() {
        return this.j;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String str = this.c;
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        String valueOf5 = String.valueOf(this.f);
        String valueOf6 = String.valueOf(this.g);
        String str2 = this.h;
        String valueOf7 = String.valueOf(this.i);
        String valueOf8 = String.valueOf(this.j);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(str).length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = String.valueOf(valueOf4).length();
        int length6 = String.valueOf(valueOf5).length();
        int length7 = String.valueOf(valueOf6).length();
        int length8 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 221 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + String.valueOf(valueOf7).length() + String.valueOf(valueOf8).length());
        sb.append("DockedBikesharingResult{provider=");
        sb.append(valueOf);
        sb.append(", intent=");
        sb.append(valueOf2);
        sb.append(", partnerAppLinkText=");
        sb.append(str);
        sb.append(", recommendedPickupStation=");
        sb.append(valueOf3);
        sb.append(", alternativePickupStations=");
        sb.append(valueOf4);
        sb.append(", recommendedDropOffStation=");
        sb.append(valueOf5);
        sb.append(", alternativeDropOffStations=");
        sb.append(valueOf6);
        sb.append(", iconId=");
        sb.append(str2);
        sb.append(", walkToStation=");
        sb.append(valueOf7);
        sb.append(", walkToDestination=");
        sb.append(valueOf8);
        sb.append("}");
        return sb.toString();
    }
}
