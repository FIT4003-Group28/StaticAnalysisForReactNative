package defpackage;
/* compiled from: PG */
/* renamed from: bgef  reason: default package */
/* loaded from: classes3.dex */
public final class bgef implements btxx {
    private static final dcqe n = dcqe.c("bgef");
    public final cqat a;
    public final bvrb b;
    public final ckmp c;
    public final btxz d;
    public long e;
    @dzsi
    public dvzl f;
    @dzsi
    public btzy g;
    public boolean h;
    @dzsi
    public dvzl i;
    @dzsi
    public btzy j;
    public boolean k;
    public final bvrj l;
    public final bdvu m;
    private final btpc o;
    private final avnt p;
    private final dzsj<buqn> q;
    private final btvo r;
    private final long s;
    private long t;
    private boolean u;
    private final dvzj v;
    @dzsi
    private btzc w;
    @dzsi
    private btzc x;
    private final btzi<dvzj, dvzl> y = new bgeb(this);
    private final btzi<dvzj, dvzl> z = new bged(this);
    private final btzi<dvzj, dvzl> A = new bgee(this);

    public bgef(btpc btpcVar, dzsj dzsjVar, avnt avntVar, cqat cqatVar, bvrb bvrbVar, ckmp ckmpVar, btvo btvoVar, btxz btxzVar, dvzj dvzjVar, bdvu bdvuVar, bvrj bvrjVar, long j) {
        this.o = btpcVar;
        this.q = dzsjVar;
        this.p = avntVar;
        this.r = btvoVar;
        this.a = cqatVar;
        this.b = bvrbVar;
        this.c = ckmpVar;
        this.d = btxzVar;
        this.v = dvzjVar;
        this.m = bdvuVar;
        this.l = bvrjVar;
        this.s = j;
    }

    public static boolean f(dvzl dvzlVar) {
        return (dvzlVar.a & 1) == 0;
    }

    @Override // defpackage.btxx
    public final synchronized void a() {
        c(false);
    }

    @Override // defpackage.btxx
    public final synchronized void b() {
        this.k = true;
        btzc btzcVar = this.w;
        if (btzcVar != null && btzcVar.a()) {
            this.c.e(ckmk.PLACESHEET_DETAILS_REQUEST);
        }
        btzc btzcVar2 = this.x;
        if (btzcVar2 != null) {
            btzcVar2.a();
        }
    }

    public final synchronized void c(boolean z) {
        boolean z2 = false;
        dbsk.a(this.w == null);
        if (this.x == null) {
            z2 = true;
        }
        dbsk.a(z2);
        this.t = this.a.e();
        if (!this.o.i()) {
            this.c.e(ckmk.PLACESHEET_DETAILS_REQUEST);
            this.x = this.p.d(this.v, bttv.a, this.A, this.l);
            return;
        }
        this.e = this.a.e() + this.s;
        buqn a = this.q.a();
        if (this.r.getPlaceSheetParameters().J()) {
            a.a().k = !z;
        }
        this.w = a.c().a(this.v, this.y, this.l);
        this.c.a(ckmk.PLACESHEET_DETAILS_REQUEST);
        this.x = this.p.d(this.v, bttv.a, this.z, this.l);
    }

    public final synchronized void e() {
        if (this.k) {
            return;
        }
        b();
        dvzl dvzlVar = this.f;
        if (dvzlVar != null) {
            this.m.a(dvzlVar, null, false, this.h);
            return;
        }
        dvzl dvzlVar2 = this.i;
        if (dvzlVar2 != null && !f(dvzlVar2)) {
            if (this.u) {
                return;
            }
            this.m.a(this.i, null, false, false);
            return;
        }
        btzy btzyVar = this.g;
        if (btzyVar != null) {
            bttq bttqVar = btzyVar.p;
            this.d.a(bttqVar);
            this.m.a(this.f, bttqVar, false, false);
            return;
        }
        bvoo.h("Online request should have failed.", new Object[0]);
    }

    public final synchronized void g() {
        this.c.c(ckmk.PLACESHEET_DETAILS_REQUEST, ckmo.OK);
        this.d.c(btxy.ONLINE, this.a.e() - this.t);
    }

    public final synchronized void h() {
        this.d.c(btxy.OFFLINE, this.a.e() - this.t);
    }

    public final synchronized void d() {
        if (this.k) {
            return;
        }
        this.u = true;
        dvzl dvzlVar = this.i;
        if (dvzlVar == null || this.j != null) {
            bvoo.h("Offline request should have succeeded.", new Object[0]);
        } else {
            this.m.a(dvzlVar, null, true, false);
        }
    }
}
