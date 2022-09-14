package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awvu  reason: default package */
/* loaded from: classes.dex */
public final class awvu extends awwt {
    public final dcdc<String> a;
    public final dcep<awvv<?>> b;
    public final dcdc<awwk> c;
    public final boolean d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final Runnable j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final List<awwl> n;
    public final List<deig<Boolean>> o;
    public final int p;
    public final int q;
    public final dcdc<dntv> r;
    public final akqi s;

    public awvu(dcdc<String> dcdcVar, dcep<awvv<?>> dcepVar, dcdc<awwk> dcdcVar2, boolean z, int i, int i2, int i3, int i4, int i5, @dzsi Runnable runnable, boolean z2, boolean z3, boolean z4, List<awwl> list, List<deig<Boolean>> list2, int i6, int i7, dcdc<dntv> dcdcVar3, akqi akqiVar) {
        this.a = dcdcVar;
        this.b = dcepVar;
        this.c = dcdcVar2;
        this.d = z;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = i5;
        this.j = runnable;
        this.k = z2;
        this.l = z3;
        this.m = z4;
        this.n = list;
        this.o = list2;
        this.p = i6;
        this.q = i7;
        this.r = dcdcVar3;
        this.s = akqiVar;
    }

    @Override // defpackage.awwt
    public final dcdc<String> a() {
        return this.a;
    }

    @Override // defpackage.awwt
    public final dcep<awvv<?>> b() {
        return this.b;
    }

    @Override // defpackage.awwt
    public final dcdc<awwk> c() {
        return this.c;
    }

    @Override // defpackage.awwt
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.awwt
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        Runnable runnable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof awwt) {
            awwt awwtVar = (awwt) obj;
            if (dchl.m(this.a, awwtVar.a()) && this.b.equals(awwtVar.b()) && dchl.m(this.c, awwtVar.c()) && this.d == awwtVar.d() && this.e == awwtVar.e() && this.f == awwtVar.f() && this.g == awwtVar.g() && this.h == awwtVar.h() && this.i == awwtVar.i() && ((runnable = this.j) != null ? runnable.equals(awwtVar.j()) : awwtVar.j() == null) && this.k == awwtVar.k() && this.l == awwtVar.l() && this.m == awwtVar.m() && this.n.equals(awwtVar.n()) && this.o.equals(awwtVar.o()) && this.p == awwtVar.p() && this.q == awwtVar.q() && dchl.m(this.r, awwtVar.r()) && this.s.equals(awwtVar.s())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.awwt
    public final int f() {
        return this.f;
    }

    @Override // defpackage.awwt
    public final int g() {
        return this.g;
    }

    @Override // defpackage.awwt
    public final int h() {
        return this.h;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003;
        Runnable runnable = this.j;
        int hashCode2 = (((((hashCode ^ (runnable == null ? 0 : runnable.hashCode())) * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ (true != this.l ? 1237 : 1231)) * 1000003;
        if (true == this.m) {
            i = 1231;
        }
        return ((((((((((((hashCode2 ^ i) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p) * 1000003) ^ this.q) * 1000003) ^ this.r.hashCode()) * 1000003) ^ this.s.hashCode();
    }

    @Override // defpackage.awwt
    public final int i() {
        return this.i;
    }

    @Override // defpackage.awwt
    @dzsi
    public final Runnable j() {
        return this.j;
    }

    @Override // defpackage.awwt
    public final boolean k() {
        return this.k;
    }

    @Override // defpackage.awwt
    public final boolean l() {
        return this.l;
    }

    @Override // defpackage.awwt
    public final boolean m() {
        return this.m;
    }

    @Override // defpackage.awwt
    public final List<awwl> n() {
        return this.n;
    }

    @Override // defpackage.awwt
    public final List<deig<Boolean>> o() {
        return this.o;
    }

    @Override // defpackage.awwt
    public final int p() {
        return this.p;
    }

    @Override // defpackage.awwt
    public final int q() {
        return this.q;
    }

    @Override // defpackage.awwt
    public final dcdc<dntv> r() {
        return this.r;
    }

    @Override // defpackage.awwt
    public final akqi s() {
        return this.s;
    }

    @Override // defpackage.awwt
    public final awws t() {
        return new awvt(this);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        boolean z = this.d;
        int i = this.e;
        int i2 = this.f;
        int i3 = this.g;
        int i4 = this.h;
        int i5 = this.i;
        String valueOf4 = String.valueOf(this.j);
        boolean z2 = this.k;
        boolean z3 = this.l;
        boolean z4 = this.m;
        String valueOf5 = String.valueOf(this.n);
        String valueOf6 = String.valueOf(this.o);
        int i6 = this.p;
        int i7 = this.q;
        String valueOf7 = String.valueOf(this.r);
        String valueOf8 = String.valueOf(this.s);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        StringBuilder sb = new StringBuilder(length + 520 + length2 + length3 + length4 + length5 + length6 + String.valueOf(valueOf7).length() + String.valueOf(valueOf8).length());
        sb.append("RequestOptions{surfaceIds=");
        sb.append(valueOf);
        sb.append(", contentTypes=");
        sb.append(valueOf2);
        sb.append(", prefetchOptionsList=");
        sb.append(valueOf3);
        sb.append(", forceRefetch=");
        sb.append(z);
        sb.append(", maxTransitLines=");
        sb.append(i);
        sb.append(", maxTransitDepartures=");
        sb.append(i2);
        sb.append(", maxNearbyStations=");
        sb.append(i3);
        sb.append(", artificialNetworkResponseLatencyMillis=");
        sb.append(i4);
        sb.append(", artificialResponseBlobBytes=");
        sb.append(i5);
        sb.append(", networkResponseSuccessRunnable=");
        sb.append(valueOf4);
        sb.append(", skipMainLooperQueue=");
        sb.append(z2);
        sb.append(", requestTrends=");
        sb.append(z3);
        sb.append(", requestTransitCommuteV2=");
        sb.append(z4);
        sb.append(", rpcLoggers=");
        sb.append(valueOf5);
        sb.append(", rpcSentFutures=");
        sb.append(valueOf6);
        sb.append(", numRecentHistoryItems=");
        sb.append(i6);
        sb.append(", maxNumPersonalizedHistoryItems=");
        sb.append(i7);
        sb.append(", everydayTrips=");
        sb.append(valueOf7);
        sb.append(", featureId=");
        sb.append(valueOf8);
        sb.append("}");
        return sb.toString();
    }
}
