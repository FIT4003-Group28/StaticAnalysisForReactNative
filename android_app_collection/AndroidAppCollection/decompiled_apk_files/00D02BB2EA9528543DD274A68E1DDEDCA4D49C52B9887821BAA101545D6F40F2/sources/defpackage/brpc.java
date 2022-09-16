package defpackage;
/* compiled from: PG */
/* renamed from: brpc  reason: default package */
/* loaded from: classes4.dex */
public final class brpc implements btxx {
    private static final dcqe o = dcqe.c("brpc");
    private final buxn B;
    public final cjqy a;
    public final cqat b;
    public final bvrb c;
    public final brpe d;
    public long e;
    public boolean f;
    @dzsi
    public dwiv g;
    @dzsi
    public btzy h;
    @dzsi
    public dwiv i;
    @dzsi
    public btzy j;
    @dzsi
    public ahnc k;
    public final dwir l;
    public final brpa m;
    public final bvrj n;
    private final btpc p;
    private final avnt q;
    private final brpb r;
    private final long s;
    @dzsi
    private final dtaq t;
    private final buad u;
    @dzsi
    private btzc v;
    @dzsi
    private btzc w;
    private final btzi<dwir, dwiv> x = new brov(this);
    private final btzi<dwir, dwiv> y = new brox(this);
    private final btzi<dwir, dwiv> z = new broy(this);
    private final btzi<dwir, dwiv> A = new broz(this);

    public brpc(btpc btpcVar, buxl buxlVar, avnt avntVar, avoo avooVar, cjqy cjqyVar, cqat cqatVar, bvrb bvrbVar, dxio<avij> dxioVar, dwir dwirVar, @dzsi ahnc ahncVar, brpb brpbVar, btxz btxzVar, brpa brpaVar, bvrj bvrjVar, long j) {
        this.p = btpcVar;
        this.q = avntVar;
        buac a = buxlVar.a();
        this.t = ahncVar != null ? ahncVar.a() : null;
        a.f = ahncVar;
        this.u = a.a();
        this.B = buxlVar.c();
        this.a = cjqyVar;
        this.b = cqatVar;
        this.c = bvrbVar;
        this.l = dwirVar;
        this.r = brpbVar;
        this.d = new brpe(dxioVar, cqatVar, avooVar, btxzVar, 1);
        this.m = brpaVar;
        this.n = bvrjVar;
        this.s = j;
    }

    public static boolean e(dwiv dwivVar) {
        return dwivVar.c.size() == 0;
    }

    @Override // defpackage.btxx
    public final synchronized void a() {
        boolean z = false;
        dbsk.a(this.v == null);
        if (this.w == null) {
            z = true;
        }
        dbsk.a(z);
        if (this.r == brpb.ONLINE_ONLY) {
            this.d.b(1);
            this.v = this.B.a(this.l, this.z, this.n);
            return;
        }
        if (this.r != brpb.OFFLINE_ONLY && this.p.i()) {
            this.e = this.b.e() + this.s;
            this.v = this.B.a(btul.a(this.l), this.x, this.n);
            this.d.b(3);
            this.w = this.q.a(this.l, this.u, this.y, this.n);
            return;
        }
        this.d.b(2);
        this.w = this.q.a(this.l, this.u, this.A, this.n);
    }

    @Override // defpackage.btxx
    public final synchronized void b() {
        this.f = true;
        btzc btzcVar = this.v;
        if (btzcVar != null) {
            btzcVar.a();
            this.d.a(1, 6, null);
        }
        btzc btzcVar2 = this.w;
        if (btzcVar2 != null) {
            btzcVar2.a();
            this.d.a(2, 6, null);
        }
    }

    public final dcdc<dtaq> c(@dzsi ahnc ahncVar) {
        dccx F = dcdc.F();
        if (ahncVar != null) {
            F.g(ahncVar.a());
        }
        dtaq dtaqVar = this.t;
        if (dtaqVar != null) {
            F.g(dtaqVar);
        }
        return F.f();
    }

    public final synchronized void d() {
        if (this.f) {
            return;
        }
        this.f = true;
        b();
        dwiv dwivVar = this.g;
        if (dwivVar != null) {
            btul.b(dwivVar, this.a);
            this.m.a(this.g, null, false);
            return;
        }
        dwiv dwivVar2 = this.i;
        if (dwivVar2 != null && !e(dwivVar2)) {
            btul.c(this.b, c(this.k), this.l, this.i, this.a);
            this.m.a(this.i, null, true);
            return;
        }
        if (this.i != null) {
            btul.c(this.b, c(this.k), this.l, this.i, this.a);
        }
        btzy btzyVar = this.h;
        if (btzyVar != null) {
            this.m.a(this.g, btzyVar.p, false);
        } else {
            bvoo.h("Online request should have failed.", new Object[0]);
        }
    }
}
