package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amvz  reason: default package */
/* loaded from: classes2.dex */
public final class amvz extends amwb {
    public final dcdc<bvrt<dqts>> A;
    public final int B;
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final doyd h;
    public final boolean i;
    public final String j;
    public final String k;
    public final boolean l;
    public final String m;
    public final Long n;
    public final Long o;
    public final String p;
    public final bvrt<dgas> q;
    public final bvrt<dgas> r;
    public final bvrt<dgas> s;
    public final bvrt<dgas> t;
    public final float u;
    public final boolean v;
    public final bvrt<dowb> w;
    public final bvrt<dpad> x;
    public final bvrt<dotj> y;
    public final bvrt<dnpq> z;

    public amvz(long j, String str, @dzsi String str2, @dzsi String str3, @dzsi String str4, @dzsi String str5, @dzsi String str6, @dzsi doyd doydVar, boolean z, @dzsi String str7, @dzsi String str8, boolean z2, @dzsi String str9, @dzsi Long l, @dzsi Long l2, @dzsi String str10, @dzsi int i, @dzsi bvrt<dgas> bvrtVar, @dzsi bvrt<dgas> bvrtVar2, @dzsi bvrt<dgas> bvrtVar3, @dzsi bvrt<dgas> bvrtVar4, float f, boolean z3, @dzsi bvrt<dowb> bvrtVar5, @dzsi bvrt<dpad> bvrtVar6, @dzsi bvrt<dotj> bvrtVar7, @dzsi bvrt<dnpq> bvrtVar8, @dzsi dcdc<bvrt<dqts>> dcdcVar) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = doydVar;
        this.i = z;
        this.j = str7;
        this.k = str8;
        this.l = z2;
        this.m = str9;
        this.n = l;
        this.o = l2;
        this.p = str10;
        this.B = i;
        this.q = bvrtVar;
        this.r = bvrtVar2;
        this.s = bvrtVar3;
        this.t = bvrtVar4;
        this.u = f;
        this.v = z3;
        this.w = bvrtVar5;
        this.x = bvrtVar6;
        this.y = bvrtVar7;
        this.z = bvrtVar8;
        this.A = dcdcVar;
    }

    @Override // defpackage.amwb
    @dzsi
    public final dcdc<bvrt<dqts>> A() {
        return this.A;
    }

    @Override // defpackage.amwb
    public final amwa B() {
        return new amvy(this);
    }

    @Override // defpackage.amwb
    @dzsi
    public final int C() {
        return this.B;
    }

    @Override // defpackage.amwb
    public final long a() {
        return this.a;
    }

    @Override // defpackage.amwb
    public final String b() {
        return this.b;
    }

    @Override // defpackage.amwb
    @dzsi
    public final String c() {
        return this.c;
    }

    @Override // defpackage.amwb
    @dzsi
    public final String d() {
        return this.d;
    }

    @Override // defpackage.amwb
    @dzsi
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        doyd doydVar;
        String str6;
        String str7;
        String str8;
        Long l;
        Long l2;
        String str9;
        int i;
        bvrt<dgas> bvrtVar;
        bvrt<dgas> bvrtVar2;
        bvrt<dgas> bvrtVar3;
        bvrt<dgas> bvrtVar4;
        bvrt<dowb> bvrtVar5;
        bvrt<dpad> bvrtVar6;
        bvrt<dotj> bvrtVar7;
        bvrt<dnpq> bvrtVar8;
        dcdc<bvrt<dqts>> dcdcVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof amwb) {
            amwb amwbVar = (amwb) obj;
            if (this.a == amwbVar.a() && this.b.equals(amwbVar.b()) && ((str = this.c) != null ? str.equals(amwbVar.c()) : amwbVar.c() == null) && ((str2 = this.d) != null ? str2.equals(amwbVar.d()) : amwbVar.d() == null) && ((str3 = this.e) != null ? str3.equals(amwbVar.e()) : amwbVar.e() == null) && ((str4 = this.f) != null ? str4.equals(amwbVar.f()) : amwbVar.f() == null) && ((str5 = this.g) != null ? str5.equals(amwbVar.g()) : amwbVar.g() == null) && ((doydVar = this.h) != null ? doydVar.equals(amwbVar.h()) : amwbVar.h() == null) && this.i == amwbVar.i() && ((str6 = this.j) != null ? str6.equals(amwbVar.j()) : amwbVar.j() == null) && ((str7 = this.k) != null ? str7.equals(amwbVar.k()) : amwbVar.k() == null) && this.l == amwbVar.l() && ((str8 = this.m) != null ? str8.equals(amwbVar.m()) : amwbVar.m() == null) && ((l = this.n) != null ? l.equals(amwbVar.n()) : amwbVar.n() == null) && ((l2 = this.o) != null ? l2.equals(amwbVar.o()) : amwbVar.o() == null) && ((str9 = this.p) != null ? str9.equals(amwbVar.p()) : amwbVar.p() == null) && ((i = this.B) != 0 ? i == amwbVar.C() : amwbVar.C() == 0) && ((bvrtVar = this.q) != null ? bvrtVar.equals(amwbVar.q()) : amwbVar.q() == null) && ((bvrtVar2 = this.r) != null ? bvrtVar2.equals(amwbVar.r()) : amwbVar.r() == null) && ((bvrtVar3 = this.s) != null ? bvrtVar3.equals(amwbVar.s()) : amwbVar.s() == null) && ((bvrtVar4 = this.t) != null ? bvrtVar4.equals(amwbVar.t()) : amwbVar.t() == null) && Float.floatToIntBits(this.u) == Float.floatToIntBits(amwbVar.u()) && this.v == amwbVar.v() && ((bvrtVar5 = this.w) != null ? bvrtVar5.equals(amwbVar.w()) : amwbVar.w() == null) && ((bvrtVar6 = this.x) != null ? bvrtVar6.equals(amwbVar.x()) : amwbVar.x() == null) && ((bvrtVar7 = this.y) != null ? bvrtVar7.equals(amwbVar.y()) : amwbVar.y() == null) && ((bvrtVar8 = this.z) != null ? bvrtVar8.equals(amwbVar.z()) : amwbVar.z() == null) && ((dcdcVar = this.A) != null ? dchl.m(dcdcVar, amwbVar.A()) : amwbVar.A() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.amwb
    @dzsi
    public final String f() {
        return this.f;
    }

    @Override // defpackage.amwb
    @dzsi
    public final String g() {
        return this.g;
    }

    @Override // defpackage.amwb
    @dzsi
    public final doyd h() {
        return this.h;
    }

    public final int hashCode() {
        long j = this.a;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.d;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.e;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.g;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        doyd doydVar = this.h;
        int i2 = 1237;
        int hashCode7 = (((hashCode6 ^ (doydVar == null ? 0 : doydVar.hashCode())) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003;
        String str6 = this.j;
        int hashCode8 = (hashCode7 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.k;
        int hashCode9 = (((hashCode8 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003) ^ (true != this.l ? 1237 : 1231)) * 1000003;
        String str8 = this.m;
        int hashCode10 = (hashCode9 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        Long l = this.n;
        int hashCode11 = (hashCode10 ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Long l2 = this.o;
        int hashCode12 = (hashCode11 ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
        String str9 = this.p;
        int hashCode13 = (hashCode12 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        int i3 = this.B;
        if (i3 == 0) {
            i3 = 0;
        }
        int i4 = (hashCode13 ^ i3) * 1000003;
        bvrt<dgas> bvrtVar = this.q;
        int hashCode14 = (i4 ^ (bvrtVar == null ? 0 : bvrtVar.hashCode())) * 1000003;
        bvrt<dgas> bvrtVar2 = this.r;
        int hashCode15 = (hashCode14 ^ (bvrtVar2 == null ? 0 : bvrtVar2.hashCode())) * 1000003;
        bvrt<dgas> bvrtVar3 = this.s;
        int hashCode16 = (hashCode15 ^ (bvrtVar3 == null ? 0 : bvrtVar3.hashCode())) * 1000003;
        bvrt<dgas> bvrtVar4 = this.t;
        int hashCode17 = (((hashCode16 ^ (bvrtVar4 == null ? 0 : bvrtVar4.hashCode())) * 1000003) ^ Float.floatToIntBits(this.u)) * 1000003;
        if (true == this.v) {
            i2 = 1231;
        }
        int i5 = (hashCode17 ^ i2) * 1000003;
        bvrt<dowb> bvrtVar5 = this.w;
        int hashCode18 = (i5 ^ (bvrtVar5 == null ? 0 : bvrtVar5.hashCode())) * 1000003;
        bvrt<dpad> bvrtVar6 = this.x;
        int hashCode19 = (hashCode18 ^ (bvrtVar6 == null ? 0 : bvrtVar6.hashCode())) * 1000003;
        bvrt<dotj> bvrtVar7 = this.y;
        int hashCode20 = (hashCode19 ^ (bvrtVar7 == null ? 0 : bvrtVar7.hashCode())) * 1000003;
        bvrt<dnpq> bvrtVar8 = this.z;
        int hashCode21 = (hashCode20 ^ (bvrtVar8 == null ? 0 : bvrtVar8.hashCode())) * 1000003;
        dcdc<bvrt<dqts>> dcdcVar = this.A;
        if (dcdcVar != null) {
            i = dcdcVar.hashCode();
        }
        return hashCode21 ^ i;
    }

    @Override // defpackage.amwb
    public final boolean i() {
        return this.i;
    }

    @Override // defpackage.amwb
    @dzsi
    public final String j() {
        return this.j;
    }

    @Override // defpackage.amwb
    @dzsi
    public final String k() {
        return this.k;
    }

    @Override // defpackage.amwb
    public final boolean l() {
        return this.l;
    }

    @Override // defpackage.amwb
    @dzsi
    public final String m() {
        return this.m;
    }

    @Override // defpackage.amwb
    @dzsi
    public final Long n() {
        return this.n;
    }

    @Override // defpackage.amwb
    @dzsi
    public final Long o() {
        return this.o;
    }

    @Override // defpackage.amwb
    @dzsi
    public final String p() {
        return this.p;
    }

    @Override // defpackage.amwb
    @dzsi
    public final bvrt<dgas> q() {
        return this.q;
    }

    @Override // defpackage.amwb
    @dzsi
    public final bvrt<dgas> r() {
        return this.r;
    }

    @Override // defpackage.amwb
    @dzsi
    public final bvrt<dgas> s() {
        return this.s;
    }

    @Override // defpackage.amwb
    @dzsi
    public final bvrt<dgas> t() {
        return this.t;
    }

    public final String toString() {
        long j = this.a;
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        String str4 = this.e;
        String str5 = this.f;
        String str6 = this.g;
        String valueOf = String.valueOf(this.h);
        boolean z = this.i;
        String str7 = this.j;
        String str8 = this.k;
        boolean z2 = this.l;
        String str9 = this.m;
        String valueOf2 = String.valueOf(this.n);
        String valueOf3 = String.valueOf(this.o);
        String str10 = this.p;
        int i = this.B;
        String valueOf4 = String.valueOf(i != 0 ? Integer.toString(i - 1) : "null");
        String valueOf5 = String.valueOf(this.q);
        String valueOf6 = String.valueOf(this.r);
        String valueOf7 = String.valueOf(this.s);
        String valueOf8 = String.valueOf(this.t);
        float f = this.u;
        boolean z3 = this.v;
        String valueOf9 = String.valueOf(this.w);
        String valueOf10 = String.valueOf(this.x);
        String valueOf11 = String.valueOf(this.y);
        String valueOf12 = String.valueOf(this.z);
        String valueOf13 = String.valueOf(this.A);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(str4).length();
        int length5 = String.valueOf(str5).length();
        int length6 = String.valueOf(str6).length();
        int length7 = String.valueOf(valueOf).length();
        int length8 = String.valueOf(str7).length();
        int length9 = String.valueOf(str8).length();
        int length10 = String.valueOf(str9).length();
        int length11 = String.valueOf(valueOf2).length();
        int length12 = String.valueOf(valueOf3).length();
        int length13 = String.valueOf(str10).length();
        int length14 = String.valueOf(valueOf4).length();
        int length15 = String.valueOf(valueOf5).length();
        int length16 = String.valueOf(valueOf6).length();
        int length17 = String.valueOf(valueOf7).length();
        int length18 = String.valueOf(valueOf8).length();
        int length19 = String.valueOf(valueOf9).length();
        int length20 = String.valueOf(valueOf10).length();
        StringBuilder sb = new StringBuilder(length + 600 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + length12 + length13 + length14 + length15 + length16 + length17 + length18 + length19 + length20 + String.valueOf(valueOf11).length() + String.valueOf(valueOf12).length() + String.valueOf(valueOf13).length());
        sb.append("TrafficIncidentMetadata{incidentId=");
        sb.append(j);
        sb.append(", captionText=");
        sb.append(str);
        sb.append(", shortCaptionText=");
        sb.append(str2);
        sb.append(", freetext=");
        sb.append(str3);
        sb.append(", scheduleText=");
        sb.append(str4);
        sb.append(", eventMid=");
        sb.append(str5);
        sb.append(", infoSheetIconUrl=");
        sb.append(str6);
        sb.append(", type=");
        sb.append(valueOf);
        sb.append(", isAlongTheRoute=");
        sb.append(z);
        sb.append(", ei=");
        sb.append(str7);
        sb.append(", ved=");
        sb.append(str8);
        sb.append(", isUserModerationEnabled=");
        sb.append(z2);
        sb.append(", moderationQuestionText=");
        sb.append(str9);
        sb.append(", confirmCount=");
        sb.append(valueOf2);
        sb.append(", denyCount=");
        sb.append(valueOf3);
        sb.append(", userModerationText=");
        sb.append(str10);
        sb.append(", audioAlertMethod=");
        sb.append(valueOf4);
        sb.append(", wrappedDelayProto=");
        sb.append(valueOf5);
        sb.append(", wrappedAgeProto=");
        sb.append(valueOf6);
        sb.append(", wrappedLastUpdateTimeProto=");
        sb.append(valueOf7);
        sb.append(", wrappedLastReportTimeProto=");
        sb.append(valueOf8);
        sb.append(", speedMetersPerSecond=");
        sb.append(f);
        sb.append(", shouldHaveIcon=");
        sb.append(z3);
        sb.append(", wrappedDistanceProto=");
        sb.append(valueOf9);
        sb.append(", wrappedAttributionProto=");
        sb.append(valueOf10);
        sb.append(", wrappedAudioComponentProto=");
        sb.append(valueOf11);
        sb.append(", wrappedMoreInfoLinkProto=");
        sb.append(valueOf12);
        sb.append(", wrappedDynamicClosureProtos=");
        sb.append(valueOf13);
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.amwb
    public final float u() {
        return this.u;
    }

    @Override // defpackage.amwb
    public final boolean v() {
        return this.v;
    }

    @Override // defpackage.amwb
    @dzsi
    public final bvrt<dowb> w() {
        return this.w;
    }

    @Override // defpackage.amwb
    @dzsi
    public final bvrt<dpad> x() {
        return this.x;
    }

    @Override // defpackage.amwb
    @dzsi
    public final bvrt<dotj> y() {
        return this.y;
    }

    @Override // defpackage.amwb
    @dzsi
    public final bvrt<dnpq> z() {
        return this.z;
    }
}
