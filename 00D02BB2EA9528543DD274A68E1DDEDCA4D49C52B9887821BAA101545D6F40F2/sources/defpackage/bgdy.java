package defpackage;
/* compiled from: PG */
/* renamed from: bgdy  reason: default package */
/* loaded from: classes3.dex */
public final class bgdy implements btxx {
    private static final dcqe m = dcqe.c("bgdy");
    public final cqat a;
    public final bvrb b;
    public long c;
    public boolean d;
    @dzsi
    public dwcy e;
    @dzsi
    public btzy f;
    @dzsi
    public dwcy g;
    @dzsi
    public btzy h;
    public final btxz i;
    public final bvrj j;
    @dzsi
    public bvpk k;
    public final bgds l;
    private final btpc n;
    private final avnt o;
    private final long p;
    private final dwcw q;
    @dzsi
    private btzc r;
    @dzsi
    private btzc s;
    private final btzi<dwcw, dwcy> t = new bgdu(this);
    private final btzi<dwcw, dwcy> u = new bgdw(this);
    private final btzi<dwcw, dwcy> v = new bgdx(this);
    private final bupz w;

    public bgdy(btpc btpcVar, bupz bupzVar, avnt avntVar, cqat cqatVar, bvrb bvrbVar, dwcw dwcwVar, btxz btxzVar, bgds bgdsVar, bvrj bvrjVar, long j) {
        this.n = btpcVar;
        this.o = avntVar;
        this.w = bupzVar;
        this.a = cqatVar;
        this.b = bvrbVar;
        this.q = dwcwVar;
        this.i = btxzVar;
        this.l = bgdsVar;
        this.j = bvrjVar;
        this.p = j;
    }

    public static boolean d(dwcy dwcyVar) {
        return (dwcyVar.a & 1) == 0;
    }

    @Override // defpackage.btxx
    public final synchronized void a() {
        boolean z = true;
        dbsk.a(this.r == null);
        if (this.s != null) {
            z = false;
        }
        dbsk.a(z);
        if (!this.n.i()) {
            this.s = this.o.c(this.q, bttv.a, this.v, this.j);
            return;
        }
        this.c = this.a.e() + this.p;
        this.r = this.w.a(this.q, this.t, this.j);
        this.s = this.o.c(this.q, bttv.a, this.u, this.j);
    }

    @Override // defpackage.btxx
    public final synchronized void b() {
        this.d = true;
        btzc btzcVar = this.r;
        if (btzcVar != null) {
            btzcVar.a();
        }
        btzc btzcVar2 = this.s;
        if (btzcVar2 != null) {
            btzcVar2.a();
        }
        bvpk bvpkVar = this.k;
        if (bvpkVar != null) {
            bvpkVar.b();
        }
    }

    public final synchronized void c() {
        if (this.d) {
            return;
        }
        b();
        boolean z = false;
        if (this.e != null) {
            if (this.f == null) {
                z = true;
            }
            dbsk.a(z);
            this.l.a(this.e, null);
            return;
        }
        dwcy dwcyVar = this.g;
        if (dwcyVar != null && !d(dwcyVar)) {
            this.l.a(this.g, null);
            return;
        }
        btzy btzyVar = this.f;
        if (btzyVar != null) {
            bttq bttqVar = btzyVar.p;
            this.i.a(bttqVar);
            this.l.a(this.e, bttqVar);
            return;
        }
        bvoo.h("Online request should have failed.", new Object[0]);
    }
}
