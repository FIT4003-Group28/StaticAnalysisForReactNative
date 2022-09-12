package defpackage;
/* compiled from: PG */
/* renamed from: qap  reason: default package */
/* loaded from: classes7.dex */
final class qap extends qct {
    public final dbsg<dnqh> a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final qbs m;
    public final qbn n;
    public final boolean o;
    public final Integer p;
    public final String q;
    public final duqc r;
    public final crmw s;
    public final int t;

    public qap(dbsg<dnqh> dbsgVar, boolean z, boolean z2, boolean z3, int i, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, qbs qbsVar, @dzsi qbn qbnVar, boolean z12, @dzsi Integer num, @dzsi String str, @dzsi duqc duqcVar, @dzsi crmw crmwVar) {
        this.a = dbsgVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.t = i;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = z8;
        this.j = z9;
        this.k = z10;
        this.l = z11;
        this.m = qbsVar;
        this.n = qbnVar;
        this.o = z12;
        this.p = num;
        this.q = str;
        this.r = duqcVar;
        this.s = crmwVar;
    }

    @Override // defpackage.qcz
    public final dbsg<dnqh> a() {
        return this.a;
    }

    @Override // defpackage.qcz
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.qcz
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.qcz
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.qcz
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        qbn qbnVar;
        Integer num;
        String str;
        duqc duqcVar;
        crmw crmwVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof qct) {
            qct qctVar = (qct) obj;
            if (this.a.equals(qctVar.a()) && this.b == qctVar.b() && this.c == qctVar.c() && this.d == qctVar.d()) {
                int i = this.t;
                int t = qctVar.t();
                if (i == 0) {
                    throw null;
                }
                if (t == 1 && this.e == qctVar.e() && this.f == qctVar.f() && this.g == qctVar.g() && this.h == qctVar.h() && this.i == qctVar.i() && this.j == qctVar.j() && this.k == qctVar.k() && this.l == qctVar.l() && this.m.equals(qctVar.m()) && ((qbnVar = this.n) != null ? qbnVar.equals(qctVar.n()) : qctVar.n() == null) && this.o == qctVar.o() && ((num = this.p) != null ? num.equals(qctVar.p()) : qctVar.p() == null) && ((str = this.q) != null ? str.equals(qctVar.q()) : qctVar.q() == null) && ((duqcVar = this.r) != null ? duqcVar.equals(qctVar.r()) : qctVar.r() == null) && ((crmwVar = this.s) != null ? crmwVar.equals(qctVar.s()) : qctVar.s() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.qct
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.qct
    public final boolean g() {
        return this.g;
    }

    @Override // defpackage.qct
    public final boolean h() {
        return this.h;
    }

    public final int hashCode() {
        int i;
        int i2 = 1237;
        int i3 = ((((true != this.b ? 1237 : 1231) ^ 2097800333) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003;
        int i4 = true != this.d ? 1237 : 1231;
        int i5 = this.t;
        qcu.b(i5);
        int hashCode = (((((((((((((((((((((i3 ^ i4) * 1000003) ^ i5) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ (true != this.l ? 1237 : 1231)) * 1000003) ^ this.m.hashCode()) * 1000003;
        qbn qbnVar = this.n;
        int i6 = 0;
        int hashCode2 = (hashCode ^ (qbnVar == null ? 0 : qbnVar.hashCode())) * 1000003;
        if (true == this.o) {
            i2 = 1231;
        }
        int i7 = (hashCode2 ^ i2) * 1000003;
        Integer num = this.p;
        int hashCode3 = (i7 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.q;
        int hashCode4 = (hashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        duqc duqcVar = this.r;
        if (duqcVar == null) {
            i = 0;
        } else {
            i = duqcVar.bC;
            if (i == 0) {
                i = dsst.a.b(duqcVar).c(duqcVar);
                duqcVar.bC = i;
            }
        }
        int i8 = (hashCode4 ^ i) * 1000003;
        crmw crmwVar = this.s;
        if (crmwVar != null) {
            i6 = crmwVar.hashCode();
        }
        return i8 ^ i6;
    }

    @Override // defpackage.qct
    public final boolean i() {
        return this.i;
    }

    @Override // defpackage.qct
    public final boolean j() {
        return this.j;
    }

    @Override // defpackage.qct
    public final boolean k() {
        return this.k;
    }

    @Override // defpackage.qct, defpackage.qcz
    public final boolean l() {
        return this.l;
    }

    @Override // defpackage.qct, defpackage.qcz
    public final qbs m() {
        return this.m;
    }

    @Override // defpackage.qct, defpackage.qcz
    @dzsi
    public final qbn n() {
        return this.n;
    }

    @Override // defpackage.qct
    public final boolean o() {
        return this.o;
    }

    @Override // defpackage.qct
    @dzsi
    public final Integer p() {
        return this.p;
    }

    @Override // defpackage.qct
    @dzsi
    public final String q() {
        return this.q;
    }

    @Override // defpackage.qct
    @dzsi
    public final duqc r() {
        return this.r;
    }

    @Override // defpackage.qct
    @dzsi
    public final crmw s() {
        return this.s;
    }

    @Override // defpackage.qcz
    public final int t() {
        return this.t;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        boolean z2 = this.c;
        boolean z3 = this.d;
        String a = qcu.a(this.t);
        boolean z4 = this.e;
        boolean z5 = this.f;
        boolean z6 = this.g;
        boolean z7 = this.h;
        boolean z8 = this.i;
        boolean z9 = this.j;
        boolean z10 = this.k;
        boolean z11 = this.l;
        String valueOf2 = String.valueOf(this.m);
        String valueOf3 = String.valueOf(this.n);
        boolean z12 = this.o;
        String valueOf4 = String.valueOf(this.p);
        String str = this.q;
        String valueOf5 = String.valueOf(this.r);
        String valueOf6 = String.valueOf(this.s);
        int length = String.valueOf(valueOf).length();
        int length2 = a.length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = String.valueOf(valueOf4).length();
        int length6 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 477 + length2 + length3 + length4 + length5 + length6 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("Prefetched{loggingParams=");
        sb.append(valueOf);
        sb.append(", showShareTripDialog=");
        sb.append(z);
        sb.append(", maySearch=");
        sb.append(z2);
        sb.append(", isMultimodalLeg=");
        sb.append(z3);
        sb.append(", promoType=");
        sb.append(a);
        sb.append(", skipRouteSelection=");
        sb.append(z4);
        sb.append(", showFromMyLocation=");
        sb.append(z5);
        sb.append(", show2wPromo=");
        sb.append(z6);
        sb.append(", shouldRefresh=");
        sb.append(z7);
        sb.append(", hasBeenOfferedRefinement=");
        sb.append(z8);
        sb.append(", popDirectionsOnNavExit=");
        sb.append(z9);
        sb.append(", showResumeNavigationNotification=");
        sb.append(z10);
        sb.append(", replaceTopmostDirectionsFragment=");
        sb.append(z11);
        sb.append(", resultViewMode=");
        sb.append(valueOf2);
        sb.append(", fetcher=");
        sb.append(valueOf3);
        sb.append(", showTransitGuidanceUpdate=");
        sb.append(z12);
        sb.append(", transitStepGroupIndex=");
        sb.append(valueOf4);
        sb.append(", eventTrackFile=");
        sb.append(str);
        sb.append(", clientDetails=");
        sb.append(valueOf5);
        sb.append(", earlyNavExitParams=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }
}
