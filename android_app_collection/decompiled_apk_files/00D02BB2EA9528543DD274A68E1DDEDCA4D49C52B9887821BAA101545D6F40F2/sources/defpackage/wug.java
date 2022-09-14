package defpackage;

import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: wug  reason: default package */
/* loaded from: classes7.dex */
public final class wug extends wuv {
    public final String a;
    public final amuk b;
    public final Intent c;
    public final cjta d;
    public final boolean e;
    public final String f;
    public final dgas g;
    public final dquj h;
    public final boolean i;
    public final wur j;
    public final wus k;
    public final drgz l;
    public final wup m;
    public final String n;
    public final String o;
    public final boolean p;
    public final String q;
    public final wuu r;
    public final int s;
    public final dpej t;
    public final int u;

    public wug(String str, amuk amukVar, @dzsi Intent intent, @dzsi cjta cjtaVar, boolean z, @dzsi String str2, @dzsi dgas dgasVar, @dzsi dquj dqujVar, boolean z2, @dzsi wur wurVar, @dzsi wus wusVar, @dzsi drgz drgzVar, @dzsi wup wupVar, @dzsi String str3, @dzsi String str4, boolean z3, @dzsi String str5, int i, @dzsi wuu wuuVar, int i2, dpej dpejVar) {
        this.a = str;
        this.b = amukVar;
        this.c = intent;
        this.d = cjtaVar;
        this.e = z;
        this.f = str2;
        this.g = dgasVar;
        this.h = dqujVar;
        this.i = z2;
        this.j = wurVar;
        this.k = wusVar;
        this.l = drgzVar;
        this.m = wupVar;
        this.n = str3;
        this.o = str4;
        this.p = z3;
        this.q = str5;
        this.u = i;
        this.r = wuuVar;
        this.s = i2;
        this.t = dpejVar;
    }

    @Override // defpackage.wuv
    public final String a() {
        return this.a;
    }

    @Override // defpackage.wuv
    public final amuk b() {
        return this.b;
    }

    @Override // defpackage.wuv
    @dzsi
    public final Intent c() {
        return this.c;
    }

    @Override // defpackage.wuv
    @dzsi
    public final cjta d() {
        return this.d;
    }

    @Override // defpackage.wuv
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        Intent intent;
        cjta cjtaVar;
        String str;
        dgas dgasVar;
        dquj dqujVar;
        wur wurVar;
        wus wusVar;
        drgz drgzVar;
        wup wupVar;
        String str2;
        String str3;
        String str4;
        wuu wuuVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof wuv) {
            wuv wuvVar = (wuv) obj;
            if (this.a.equals(wuvVar.a()) && this.b.equals(wuvVar.b()) && ((intent = this.c) != null ? intent.equals(wuvVar.c()) : wuvVar.c() == null) && ((cjtaVar = this.d) != null ? cjtaVar.equals(wuvVar.d()) : wuvVar.d() == null) && this.e == wuvVar.e() && ((str = this.f) != null ? str.equals(wuvVar.f()) : wuvVar.f() == null) && ((dgasVar = this.g) != null ? dgasVar.equals(wuvVar.g()) : wuvVar.g() == null) && ((dqujVar = this.h) != null ? dqujVar.equals(wuvVar.h()) : wuvVar.h() == null) && this.i == wuvVar.i() && ((wurVar = this.j) != null ? wurVar.equals(wuvVar.j()) : wuvVar.j() == null) && ((wusVar = this.k) != null ? wusVar.equals(wuvVar.k()) : wuvVar.k() == null) && ((drgzVar = this.l) != null ? drgzVar.equals(wuvVar.l()) : wuvVar.l() == null) && ((wupVar = this.m) != null ? wupVar.equals(wuvVar.m()) : wuvVar.m() == null) && ((str2 = this.n) != null ? str2.equals(wuvVar.n()) : wuvVar.n() == null) && ((str3 = this.o) != null ? str3.equals(wuvVar.o()) : wuvVar.o() == null) && this.p == wuvVar.p() && ((str4 = this.q) != null ? str4.equals(wuvVar.q()) : wuvVar.q() == null)) {
                int i = this.u;
                int v = wuvVar.v();
                if (i == 0) {
                    throw null;
                }
                if (i == v && ((wuuVar = this.r) != null ? wuuVar.equals(wuvVar.r()) : wuvVar.r() == null) && this.s == wuvVar.s() && this.t.equals(wuvVar.t())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.wuv
    @dzsi
    public final String f() {
        return this.f;
    }

    @Override // defpackage.wuv
    @dzsi
    public final dgas g() {
        return this.g;
    }

    @Override // defpackage.wuv
    @dzsi
    public final dquj h() {
        return this.h;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        Intent intent = this.c;
        int i4 = 0;
        int hashCode2 = (hashCode ^ (intent == null ? 0 : intent.hashCode())) * 1000003;
        cjta cjtaVar = this.d;
        int i5 = 1237;
        int hashCode3 = (((hashCode2 ^ (cjtaVar == null ? 0 : cjtaVar.hashCode())) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003;
        String str = this.f;
        int hashCode4 = (hashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        dgas dgasVar = this.g;
        if (dgasVar == null) {
            i = 0;
        } else {
            i = dgasVar.bC;
            if (i == 0) {
                i = dsst.a.b(dgasVar).c(dgasVar);
                dgasVar.bC = i;
            }
        }
        int i6 = (hashCode4 ^ i) * 1000003;
        dquj dqujVar = this.h;
        if (dqujVar == null) {
            i2 = 0;
        } else {
            i2 = dqujVar.bC;
            if (i2 == 0) {
                i2 = dsst.a.b(dqujVar).c(dqujVar);
                dqujVar.bC = i2;
            }
        }
        int i7 = (((i6 ^ i2) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003;
        wur wurVar = this.j;
        int hashCode5 = (i7 ^ (wurVar == null ? 0 : wurVar.hashCode())) * 1000003;
        wus wusVar = this.k;
        int hashCode6 = (hashCode5 ^ (wusVar == null ? 0 : wusVar.hashCode())) * 1000003;
        drgz drgzVar = this.l;
        if (drgzVar == null) {
            i3 = 0;
        } else {
            i3 = drgzVar.bC;
            if (i3 == 0) {
                i3 = dsst.a.b(drgzVar).c(drgzVar);
                drgzVar.bC = i3;
            }
        }
        int i8 = (hashCode6 ^ i3) * 1000003;
        wup wupVar = this.m;
        int hashCode7 = (i8 ^ (wupVar == null ? 0 : wupVar.hashCode())) * 1000003;
        String str2 = this.n;
        int hashCode8 = (hashCode7 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.o;
        int hashCode9 = (hashCode8 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        if (true == this.p) {
            i5 = 1231;
        }
        int i9 = (hashCode9 ^ i5) * 1000003;
        String str4 = this.q;
        int hashCode10 = (i9 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        int i10 = this.u;
        if (i10 != 0) {
            int i11 = (hashCode10 ^ i10) * 1000003;
            wuu wuuVar = this.r;
            if (wuuVar != null) {
                i4 = wuuVar.hashCode();
            }
            return ((((i11 ^ i4) * 1000003) ^ this.s) * 1000003) ^ this.t.hashCode();
        }
        throw null;
    }

    @Override // defpackage.wuv
    public final boolean i() {
        return this.i;
    }

    @Override // defpackage.wuv
    @dzsi
    public final wur j() {
        return this.j;
    }

    @Override // defpackage.wuv
    @dzsi
    public final wus k() {
        return this.k;
    }

    @Override // defpackage.wuv
    @dzsi
    public final drgz l() {
        return this.l;
    }

    @Override // defpackage.wuv
    @dzsi
    public final wup m() {
        return this.m;
    }

    @Override // defpackage.wuv
    @dzsi
    public final String n() {
        return this.n;
    }

    @Override // defpackage.wuv
    @dzsi
    public final String o() {
        return this.o;
    }

    @Override // defpackage.wuv
    public final boolean p() {
        return this.p;
    }

    @Override // defpackage.wuv
    @dzsi
    public final String q() {
        return this.q;
    }

    @Override // defpackage.wuv
    @dzsi
    public final wuu r() {
        return this.r;
    }

    @Override // defpackage.wuv
    public final int s() {
        return this.s;
    }

    @Override // defpackage.wuv
    public final dpej t() {
        return this.t;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        boolean z = this.e;
        String str2 = this.f;
        String valueOf4 = String.valueOf(this.g);
        String valueOf5 = String.valueOf(this.h);
        boolean z2 = this.i;
        String valueOf6 = String.valueOf(this.j);
        String valueOf7 = String.valueOf(this.k);
        String valueOf8 = String.valueOf(this.l);
        String valueOf9 = String.valueOf(this.m);
        String str3 = this.n;
        String str4 = this.o;
        boolean z3 = this.p;
        String str5 = this.q;
        int i = this.u;
        String str6 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "SUCCEEDED" : "FAILED" : "LOADING" : "UNSUPPORTED" : "UNKNOWN";
        String valueOf10 = String.valueOf(this.r);
        int i2 = this.s;
        String valueOf11 = String.valueOf(this.t);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = String.valueOf(str2).length();
        int length6 = String.valueOf(valueOf4).length();
        int length7 = String.valueOf(valueOf5).length();
        int length8 = String.valueOf(valueOf6).length();
        int length9 = String.valueOf(valueOf7).length();
        int length10 = String.valueOf(valueOf8).length();
        StringBuilder sb = new StringBuilder(length + 383 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + String.valueOf(valueOf9).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + str6.length() + String.valueOf(valueOf10).length() + String.valueOf(valueOf11).length());
        sb.append("TaxiProduct{name=");
        sb.append(str);
        sb.append(", serviceProvider=");
        sb.append(valueOf);
        sb.append(", intent=");
        sb.append(valueOf2);
        sb.append(", loggingParamsBuilder=");
        sb.append(valueOf3);
        sb.append(", isRickshaw=");
        sb.append(z);
        sb.append(", partnerAppLinkText=");
        sb.append(str2);
        sb.append(", waitingTime=");
        sb.append(valueOf4);
        sb.append(", fareEstimate=");
        sb.append(valueOf5);
        sb.append(", isGoogleConfidential=");
        sb.append(z2);
        sb.append(", category=");
        sb.append(valueOf6);
        sb.append(", fareAnnotation=");
        sb.append(valueOf7);
        sb.append(", fareBreakdown=");
        sb.append(valueOf8);
        sb.append(", availability=");
        sb.append(valueOf9);
        sb.append(", disclaimer=");
        sb.append(str3);
        sb.append(", details=");
        sb.append(str4);
        sb.append(", showAdLabel=");
        sb.append(z3);
        sb.append(", promotionText=");
        sb.append(str5);
        sb.append(", tripEstimateStatus=");
        sb.append(str6);
        sb.append(", tripEstimateParameters=");
        sb.append(valueOf10);
        sb.append(", directionsTripIndex=");
        sb.append(i2);
        sb.append(", drivingDelayCategory=");
        sb.append(valueOf11);
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.wuv
    public final wuq u() {
        return new wuf(this);
    }

    @Override // defpackage.wuv
    public final int v() {
        return this.u;
    }
}
