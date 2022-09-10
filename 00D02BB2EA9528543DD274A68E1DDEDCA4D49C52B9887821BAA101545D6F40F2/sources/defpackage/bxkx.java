package defpackage;
/* compiled from: PG */
/* renamed from: bxkx  reason: default package */
/* loaded from: classes4.dex */
public final class bxkx {
    private static final dcqe a = dcqe.c("bxkx");
    private bxkw b = bxkw.NOT_STARTED;
    @dzsi
    private bxkz c;
    @dzsi
    private dcdc<bxmh> d;
    @dzsi
    private dspd e;
    @dzsi
    private ddfz f;
    @dzsi
    private drgv g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private long n;
    private long o;

    private final synchronized void u(bxkw bxkwVar) {
        bxkw bxkwVar2 = this.b;
        if (bxkwVar2 != bxkwVar) {
            bvoo.h("Unexpected round trip state: expected <%s> but actually <%s>\n%s", bxkwVar, bxkwVar2, this);
        }
    }

    public final synchronized void a(bxkz bxkzVar) {
        u(bxkw.NOT_STARTED);
        this.c = bxkzVar;
        this.h = true;
        this.b = bxkw.FETCHER_REQUESTED;
    }

    public final synchronized void b(cqat cqatVar) {
        u(bxkw.FETCHER_REQUESTED);
        this.n = cqatVar.e();
        this.i = true;
        this.b = bxkw.CONNECTION_REQUESTED;
    }

    public final synchronized void c(cqat cqatVar, dcdc<bxmh> dcdcVar, @dzsi dspd dspdVar, @dzsi ddfz ddfzVar, @dzsi drgv drgvVar) {
        if (this.b != bxkw.CONNECTION_RESPONSE_RECEIVED) {
            u(bxkw.CONNECTION_REQUESTED);
        }
        this.d = dcdcVar;
        if (!dcdcVar.isEmpty()) {
            dwjj dwjjVar = dcdcVar.get(0).b;
            if (dwjjVar == null) {
                dwjjVar = dwjj.k;
            }
            dxbp dxbpVar = dwjjVar.b;
            if (dxbpVar == null) {
                dxbpVar = dxbp.x;
            }
            int a2 = dxbi.a(dxbpVar.f);
            if (a2 != 0 && a2 == 3) {
                f();
            }
        }
        this.e = dspdVar;
        this.f = ddfzVar;
        this.g = drgvVar;
        this.o = cqatVar.e();
        this.j = true;
        this.b = bxkw.CONNECTION_RESPONSE_RECEIVED;
    }

    public final synchronized void d(boolean z) {
        if (z) {
            return;
        }
        u(bxkw.CONNECTION_RESPONSE_RECEIVED);
        this.k = true;
        this.b = bxkw.SUGGESTIONS_OUT_OF_SYNC;
    }

    public final synchronized void e() {
        this.l = true;
    }

    public final synchronized void f() {
        this.m = true;
    }

    @dzsi
    public final synchronized bxkz g() {
        return this.c;
    }

    @dzsi
    public final synchronized dcdc<bxmh> h() {
        return this.d;
    }

    @dzsi
    public final synchronized ddfz i() {
        return this.f;
    }

    @dzsi
    public final synchronized drgv j() {
        return this.g;
    }

    public final synchronized boolean k() {
        return this.h;
    }

    public final synchronized boolean l() {
        return this.i;
    }

    public final synchronized boolean m() {
        return this.j;
    }

    public final synchronized boolean n() {
        return this.k;
    }

    public final synchronized boolean o() {
        return this.l;
    }

    public final synchronized boolean p() {
        return this.m;
    }

    public final synchronized int q() {
        return (int) (this.o - this.n);
    }

    public final synchronized boolean r() {
        boolean z;
        if (this.n != 0) {
            if (this.o != 0) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    @dzsi
    public final synchronized void s() {
    }

    public final synchronized void t() {
    }

    public final synchronized String toString() {
        dbsb c;
        c = dbsc.c(bxkx.class);
        c.b("state", this.b);
        bxkz bxkzVar = this.c;
        String str = null;
        c.b("triggeringQuery", bxkzVar == null ? null : ((bxky) bxkzVar).a);
        c.h("fetcherRequestLogged", this.h);
        c.h("connectionRequestLogged", this.i);
        int i = 0;
        c.h("connectionRejectedRequestLogged", false);
        c.h("connectionResponseLogged", this.j);
        c.h("outOfSyncResponseLogged", this.k);
        c.h("connectionFailureLogged", this.l);
        c.h("offlineSuggestionsDisplayed", this.m);
        c.g("roundTripTime", this.o - this.n);
        dcdc<bxmh> dcdcVar = this.d;
        c.f("suggestionCount", dcdcVar == null ? 0 : dcdcVar.size());
        dspd dspdVar = this.e;
        if (dspdVar != null) {
            i = dspdVar.c();
        }
        c.f("experimentInfoSize", i);
        ddfz ddfzVar = this.f;
        if (ddfzVar != null) {
            str = ddfzVar.toString();
        }
        c.b("searchboxExperimentInfo", str);
        return c.toString();
    }
}
