package defpackage;
/* compiled from: PG */
/* renamed from: cyux  reason: default package */
/* loaded from: classes5.dex */
final class cyux extends cyxg {
    private final int b;
    private final int c;
    private final long d;
    private final long e;
    private final String f;
    private final String g;
    private final Boolean h;
    private final Boolean i;
    private final Boolean j;
    private final Boolean k;
    private final Boolean l;
    private final Boolean m;
    private final Boolean n;
    private final Boolean o;
    private final Boolean p;
    private final Boolean q;
    private final Integer r;
    private final Integer s;
    private final Integer t;

    public cyux(int i, int i2, long j, long j2, @dzsi String str, @dzsi String str2, @dzsi Boolean bool, @dzsi Boolean bool2, @dzsi Boolean bool3, @dzsi Boolean bool4, @dzsi Boolean bool5, @dzsi Boolean bool6, @dzsi Boolean bool7, @dzsi Boolean bool8, @dzsi Boolean bool9, @dzsi Boolean bool10, @dzsi Integer num, @dzsi Integer num2, @dzsi Integer num3) {
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = j2;
        this.f = str;
        this.g = str2;
        this.h = bool;
        this.i = bool2;
        this.j = bool3;
        this.k = bool4;
        this.l = bool5;
        this.m = bool6;
        this.n = bool7;
        this.o = bool8;
        this.p = bool9;
        this.q = bool10;
        this.r = num;
        this.s = num2;
        this.t = num3;
    }

    @Override // defpackage.cyxg
    public final int a() {
        return this.b;
    }

    @Override // defpackage.cyxg
    public final int b() {
        return this.c;
    }

    @Override // defpackage.cyxg
    public final long c() {
        return this.d;
    }

    @Override // defpackage.cyxg
    public final long d() {
        return this.e;
    }

    @Override // defpackage.cyxg
    @dzsi
    public final String e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        Boolean bool7;
        Boolean bool8;
        Boolean bool9;
        Boolean bool10;
        Integer num;
        Integer num2;
        Integer num3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cyxg) {
            cyxg cyxgVar = (cyxg) obj;
            if (this.b == cyxgVar.a() && this.c == cyxgVar.b() && this.d == cyxgVar.c() && this.e == cyxgVar.d() && ((str = this.f) != null ? str.equals(cyxgVar.e()) : cyxgVar.e() == null) && ((str2 = this.g) != null ? str2.equals(cyxgVar.f()) : cyxgVar.f() == null) && ((bool = this.h) != null ? bool.equals(cyxgVar.g()) : cyxgVar.g() == null) && ((bool2 = this.i) != null ? bool2.equals(cyxgVar.h()) : cyxgVar.h() == null) && ((bool3 = this.j) != null ? bool3.equals(cyxgVar.i()) : cyxgVar.i() == null) && ((bool4 = this.k) != null ? bool4.equals(cyxgVar.j()) : cyxgVar.j() == null) && ((bool5 = this.l) != null ? bool5.equals(cyxgVar.k()) : cyxgVar.k() == null) && ((bool6 = this.m) != null ? bool6.equals(cyxgVar.l()) : cyxgVar.l() == null) && ((bool7 = this.n) != null ? bool7.equals(cyxgVar.m()) : cyxgVar.m() == null) && ((bool8 = this.o) != null ? bool8.equals(cyxgVar.n()) : cyxgVar.n() == null) && ((bool9 = this.p) != null ? bool9.equals(cyxgVar.o()) : cyxgVar.o() == null) && ((bool10 = this.q) != null ? bool10.equals(cyxgVar.p()) : cyxgVar.p() == null) && ((num = this.r) != null ? num.equals(cyxgVar.q()) : cyxgVar.q() == null) && ((num2 = this.s) != null ? num2.equals(cyxgVar.r()) : cyxgVar.r() == null) && ((num3 = this.t) != null ? num3.equals(cyxgVar.s()) : cyxgVar.s() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cyxg
    @dzsi
    public final String f() {
        return this.g;
    }

    @Override // defpackage.cyxg
    @dzsi
    public final Boolean g() {
        return this.h;
    }

    @Override // defpackage.cyxg
    @dzsi
    public final Boolean h() {
        return this.i;
    }

    public final int hashCode() {
        int i = this.b;
        int i2 = this.c;
        long j = this.d;
        long j2 = this.e;
        int i3 = (((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        String str = this.f;
        int i4 = 0;
        int hashCode = (i3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.g;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Boolean bool = this.h;
        int hashCode3 = (hashCode2 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        Boolean bool2 = this.i;
        int hashCode4 = (hashCode3 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
        Boolean bool3 = this.j;
        int hashCode5 = (hashCode4 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003;
        Boolean bool4 = this.k;
        int hashCode6 = (hashCode5 ^ (bool4 == null ? 0 : bool4.hashCode())) * 1000003;
        Boolean bool5 = this.l;
        int hashCode7 = (hashCode6 ^ (bool5 == null ? 0 : bool5.hashCode())) * 1000003;
        Boolean bool6 = this.m;
        int hashCode8 = (hashCode7 ^ (bool6 == null ? 0 : bool6.hashCode())) * 1000003;
        Boolean bool7 = this.n;
        int hashCode9 = (hashCode8 ^ (bool7 == null ? 0 : bool7.hashCode())) * 1000003;
        Boolean bool8 = this.o;
        int hashCode10 = (hashCode9 ^ (bool8 == null ? 0 : bool8.hashCode())) * 1000003;
        Boolean bool9 = this.p;
        int hashCode11 = (hashCode10 ^ (bool9 == null ? 0 : bool9.hashCode())) * 1000003;
        Boolean bool10 = this.q;
        int hashCode12 = (hashCode11 ^ (bool10 == null ? 0 : bool10.hashCode())) * 1000003;
        Integer num = this.r;
        int hashCode13 = (hashCode12 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Integer num2 = this.s;
        int hashCode14 = (hashCode13 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        Integer num3 = this.t;
        if (num3 != null) {
            i4 = num3.hashCode();
        }
        return hashCode14 ^ i4;
    }

    @Override // defpackage.cyxg
    @dzsi
    public final Boolean i() {
        return this.j;
    }

    @Override // defpackage.cyxg
    @dzsi
    public final Boolean j() {
        return this.k;
    }

    @Override // defpackage.cyxg
    @dzsi
    public final Boolean k() {
        return this.l;
    }

    @Override // defpackage.cyxg
    @dzsi
    public final Boolean l() {
        return this.m;
    }

    @Override // defpackage.cyxg
    @dzsi
    public final Boolean m() {
        return this.n;
    }

    @Override // defpackage.cyxg
    @dzsi
    public final Boolean n() {
        return this.o;
    }

    @Override // defpackage.cyxg
    @dzsi
    public final Boolean o() {
        return this.p;
    }

    @Override // defpackage.cyxg
    @dzsi
    public final Boolean p() {
        return this.q;
    }

    @Override // defpackage.cyxg
    @dzsi
    public final Integer q() {
        return this.r;
    }

    @Override // defpackage.cyxg
    @dzsi
    public final Integer r() {
        return this.s;
    }

    @Override // defpackage.cyxg
    @dzsi
    public final Integer s() {
        return this.t;
    }

    public final String toString() {
        int i = this.b;
        int i2 = this.c;
        long j = this.d;
        long j2 = this.e;
        String str = this.f;
        String str2 = this.g;
        String valueOf = String.valueOf(this.h);
        String valueOf2 = String.valueOf(this.i);
        String valueOf3 = String.valueOf(this.j);
        String valueOf4 = String.valueOf(this.k);
        String valueOf5 = String.valueOf(this.l);
        String valueOf6 = String.valueOf(this.m);
        String valueOf7 = String.valueOf(this.n);
        String valueOf8 = String.valueOf(this.o);
        String valueOf9 = String.valueOf(this.p);
        String valueOf10 = String.valueOf(this.q);
        String valueOf11 = String.valueOf(this.r);
        String valueOf12 = String.valueOf(this.s);
        String valueOf13 = String.valueOf(this.t);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(valueOf).length();
        int length4 = String.valueOf(valueOf2).length();
        int length5 = String.valueOf(valueOf3).length();
        int length6 = String.valueOf(valueOf4).length();
        int length7 = String.valueOf(valueOf5).length();
        int length8 = String.valueOf(valueOf6).length();
        int length9 = String.valueOf(valueOf7).length();
        int length10 = String.valueOf(valueOf8).length();
        int length11 = String.valueOf(valueOf9).length();
        int length12 = String.valueOf(valueOf10).length();
        int length13 = String.valueOf(valueOf11).length();
        StringBuilder sb = new StringBuilder(length + 420 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + length12 + length13 + String.valueOf(valueOf12).length() + String.valueOf(valueOf13).length());
        sb.append("RankingFeatureSet{timesContacted=");
        sb.append(i);
        sb.append(", fieldTimesUsed=");
        sb.append(i2);
        sb.append(", lastTimeContacted=");
        sb.append(j);
        sb.append(", fieldLastTimeUsed=");
        sb.append(j2);
        sb.append(", ownerAccountType=");
        sb.append(str);
        sb.append(", ownerAccountName=");
        sb.append(str2);
        sb.append(", isContactStarred=");
        sb.append(valueOf);
        sb.append(", hasPostalAddress=");
        sb.append(valueOf2);
        sb.append(", hasNickname=");
        sb.append(valueOf3);
        sb.append(", hasBirthday=");
        sb.append(valueOf4);
        sb.append(", hasCustomRingtone=");
        sb.append(valueOf5);
        sb.append(", hasAvatar=");
        sb.append(valueOf6);
        sb.append(", isSentToVoicemail=");
        sb.append(valueOf7);
        sb.append(", fieldIsPrimary=");
        sb.append(valueOf8);
        sb.append(", fieldIsSuperPrimary=");
        sb.append(valueOf9);
        sb.append(", isPinned=");
        sb.append(valueOf10);
        sb.append(", pinnedPosition=");
        sb.append(valueOf11);
        sb.append(", numCommunicationChannels=");
        sb.append(valueOf12);
        sb.append(", numRawContacts=");
        sb.append(valueOf13);
        sb.append("}");
        return sb.toString();
    }
}
