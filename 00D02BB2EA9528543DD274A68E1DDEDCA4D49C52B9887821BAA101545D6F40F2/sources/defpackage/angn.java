package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: angn  reason: default package */
/* loaded from: classes2.dex */
public final class angn extends anhy {
    public final anhw a;
    public final anhu b;
    public final anhu c;
    public final anhu d;
    public final eapd e;
    public final eaou f;
    public final eapg g;
    public final String h;
    public final dbsg<String> i;
    public final int j;

    public angn(anhw anhwVar, anhu anhuVar, anhu anhuVar2, anhu anhuVar3, @dzsi eapd eapdVar, @dzsi eaou eaouVar, @dzsi eapg eapgVar, @dzsi String str, dbsg<String> dbsgVar, int i) {
        this.a = anhwVar;
        this.b = anhuVar;
        this.c = anhuVar2;
        this.d = anhuVar3;
        this.e = eapdVar;
        this.f = eaouVar;
        this.g = eapgVar;
        this.h = str;
        this.i = dbsgVar;
        this.j = i;
    }

    @Override // defpackage.anhy
    public final anhw a() {
        return this.a;
    }

    @Override // defpackage.anhy
    public final anhu b() {
        return this.b;
    }

    @Override // defpackage.anhy
    public final anhu c() {
        return this.c;
    }

    @Override // defpackage.anhy
    public final anhu d() {
        return this.d;
    }

    @Override // defpackage.anhy
    @dzsi
    public final eapd e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        eapd eapdVar;
        eaou eaouVar;
        eapg eapgVar;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof anhy) {
            anhy anhyVar = (anhy) obj;
            if (this.a.equals(anhyVar.a()) && this.b.equals(anhyVar.b()) && this.c.equals(anhyVar.c()) && this.d.equals(anhyVar.d()) && ((eapdVar = this.e) != null ? eapdVar.equals(anhyVar.e()) : anhyVar.e() == null) && ((eaouVar = this.f) != null ? eaouVar.equals(anhyVar.f()) : anhyVar.f() == null) && ((eapgVar = this.g) != null ? eapgVar.equals(anhyVar.g()) : anhyVar.g() == null) && ((str = this.h) != null ? str.equals(anhyVar.h()) : anhyVar.h() == null) && this.i.equals(anhyVar.i())) {
                int i = this.j;
                int k = anhyVar.k();
                if (i == 0) {
                    throw null;
                }
                if (i == k) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.anhy
    @dzsi
    public final eaou f() {
        return this.f;
    }

    @Override // defpackage.anhy
    @dzsi
    public final eapg g() {
        return this.g;
    }

    @Override // defpackage.anhy
    @dzsi
    public final String h() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        eapd eapdVar = this.e;
        int i = 0;
        int hashCode2 = (hashCode ^ (eapdVar == null ? 0 : eapdVar.hashCode())) * 1000003;
        eaou eaouVar = this.f;
        int hashCode3 = (hashCode2 ^ (eaouVar == null ? 0 : eaouVar.hashCode())) * 1000003;
        eapg eapgVar = this.g;
        int hashCode4 = (hashCode3 ^ (eapgVar == null ? 0 : eapgVar.hashCode())) * 1000003;
        String str = this.h;
        if (str != null) {
            i = str.hashCode();
        }
        int hashCode5 = (((hashCode4 ^ i) * 1000003) ^ this.i.hashCode()) * 1000003;
        int i2 = this.j;
        if (i2 != 0) {
            return hashCode5 ^ i2;
        }
        throw null;
    }

    @Override // defpackage.anhy
    public final dbsg<String> i() {
        return this.i;
    }

    @Override // defpackage.anhy
    public final anhq j() {
        return new angm(this);
    }

    @Override // defpackage.anhy
    public final int k() {
        return this.j;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String valueOf7 = String.valueOf(this.g);
        String str = this.h;
        String valueOf8 = String.valueOf(this.i);
        int i = this.j;
        String str2 = i != 1 ? i != 2 ? "null" : "PUSH" : "POP_TO_PREVIOUS";
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        StringBuilder sb = new StringBuilder(length + 156 + length2 + length3 + length4 + length5 + length6 + String.valueOf(valueOf7).length() + String.valueOf(str).length() + String.valueOf(valueOf8).length() + str2.length());
        sb.append("StartTimelineParams{target=");
        sb.append(valueOf);
        sb.append(", showOobeOption=");
        sb.append(valueOf2);
        sb.append(", showNotificationsOptOutBanner=");
        sb.append(valueOf3);
        sb.append(", showAccountSelection=");
        sb.append(valueOf4);
        sb.append(", instant=");
        sb.append(valueOf5);
        sb.append(", timezone=");
        sb.append(valueOf6);
        sb.append(", day=");
        sb.append(valueOf7);
        sb.append(", placeId=");
        sb.append(str);
        sb.append(", ved=");
        sb.append(valueOf8);
        sb.append(", transition=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
