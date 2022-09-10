package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: awvt  reason: default package */
/* loaded from: classes.dex */
public final class awvt extends awws {
    public Runnable a;
    private dcdc<String> b;
    private dcep<awvv<?>> c;
    private dcdc<awwk> d;
    private Boolean e;
    private Integer f;
    private Integer g;
    private Integer h;
    private Integer i;
    private Integer j;
    private Boolean k;
    private Boolean l;
    private Boolean m;
    private List<awwl> n;
    private List<deig<Boolean>> o;
    private Integer p;
    private Integer q;
    private dcdc<dntv> r;
    private akqi s;

    public awvt() {
    }

    public awvt(awwt awwtVar) {
        awvu awvuVar = (awvu) awwtVar;
        this.b = awvuVar.a;
        this.c = awvuVar.b;
        this.d = awvuVar.c;
        this.e = Boolean.valueOf(awvuVar.d);
        this.f = Integer.valueOf(awvuVar.e);
        this.g = Integer.valueOf(awvuVar.f);
        this.h = Integer.valueOf(awvuVar.g);
        this.i = Integer.valueOf(awvuVar.h);
        this.j = Integer.valueOf(awvuVar.i);
        this.a = awvuVar.j;
        this.k = Boolean.valueOf(awvuVar.k);
        this.l = Boolean.valueOf(awvuVar.l);
        this.m = Boolean.valueOf(awvuVar.m);
        this.n = awvuVar.n;
        this.o = awvuVar.o;
        this.p = Integer.valueOf(awvuVar.p);
        this.q = Integer.valueOf(awvuVar.q);
        this.r = awvuVar.r;
        this.s = awvuVar.s;
    }

    @Override // defpackage.awws
    public final void b(int i) {
        this.i = Integer.valueOf(i);
    }

    @Override // defpackage.awws
    public final void c(int i) {
        this.j = Integer.valueOf(i);
    }

    @Override // defpackage.awws
    public final void d(Set<awvv<?>> set) {
        this.c = dcep.K(set);
    }

    @Override // defpackage.awws
    public final void e(awvv<?>... awvvVarArr) {
        this.c = dcep.M(awvvVarArr);
    }

    @Override // defpackage.awws
    public final void f(List<dntv> list) {
        this.r = dcdc.r(list);
    }

    @Override // defpackage.awws
    public final void g(akqi akqiVar) {
        if (akqiVar != null) {
            this.s = akqiVar;
            return;
        }
        throw new NullPointerException("Null featureId");
    }

    @Override // defpackage.awws
    public final void h(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    @Override // defpackage.awws
    public final void i(int i) {
        this.h = Integer.valueOf(i);
    }

    @Override // defpackage.awws
    public final void j(int i) {
        this.q = Integer.valueOf(i);
    }

    @Override // defpackage.awws
    public final void k(int i) {
        this.g = Integer.valueOf(i);
    }

    @Override // defpackage.awws
    public final void l(int i) {
        this.f = Integer.valueOf(i);
    }

    @Override // defpackage.awws
    public final void m(int i) {
        this.p = Integer.valueOf(i);
    }

    @Override // defpackage.awws
    public final void n(List<awwk> list) {
        this.d = dcdc.r(list);
    }

    @Override // defpackage.awws
    public final void o(boolean z) {
        this.m = Boolean.valueOf(z);
    }

    @Override // defpackage.awws
    public final void p(boolean z) {
        this.l = Boolean.valueOf(z);
    }

    @Override // defpackage.awws
    public final void q(List<awwl> list) {
        if (list != null) {
            this.n = list;
            return;
        }
        throw new NullPointerException("Null rpcLoggers");
    }

    @Override // defpackage.awws
    public final void r(List<deig<Boolean>> list) {
        if (list != null) {
            this.o = list;
            return;
        }
        throw new NullPointerException("Null rpcSentFutures");
    }

    @Override // defpackage.awws
    public final void s(boolean z) {
        this.k = Boolean.valueOf(z);
    }

    @Override // defpackage.awws
    public final void t(List<String> list) {
        this.b = dcdc.r(list);
    }

    @Override // defpackage.awws
    public final awwt a() {
        String str = this.b == null ? " surfaceIds" : "";
        if (this.c == null) {
            str = str.concat(" contentTypes");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" prefetchOptionsList");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" forceRefetch");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" maxTransitLines");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" maxTransitDepartures");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" maxNearbyStations");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" artificialNetworkResponseLatencyMillis");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" artificialResponseBlobBytes");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" skipMainLooperQueue");
        }
        if (this.l == null) {
            str = String.valueOf(str).concat(" requestTrends");
        }
        if (this.m == null) {
            str = String.valueOf(str).concat(" requestTransitCommuteV2");
        }
        if (this.n == null) {
            str = String.valueOf(str).concat(" rpcLoggers");
        }
        if (this.o == null) {
            str = String.valueOf(str).concat(" rpcSentFutures");
        }
        if (this.p == null) {
            str = String.valueOf(str).concat(" numRecentHistoryItems");
        }
        if (this.q == null) {
            str = String.valueOf(str).concat(" maxNumPersonalizedHistoryItems");
        }
        if (this.r == null) {
            str = String.valueOf(str).concat(" everydayTrips");
        }
        if (this.s == null) {
            str = String.valueOf(str).concat(" featureId");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new awvu(this.b, this.c, this.d, this.e.booleanValue(), this.f.intValue(), this.g.intValue(), this.h.intValue(), this.i.intValue(), this.j.intValue(), this.a, this.k.booleanValue(), this.l.booleanValue(), this.m.booleanValue(), this.n, this.o, this.p.intValue(), this.q.intValue(), this.r, this.s);
    }
}
