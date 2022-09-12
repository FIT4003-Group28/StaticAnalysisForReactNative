package defpackage;
/* compiled from: PG */
/* renamed from: broo  reason: default package */
/* loaded from: classes4.dex */
public final class broo implements btxx {
    private static final dcqe p = dcqe.c("broo");
    private final buxn D;
    public final cjqy a;
    public final cqat b;
    public final bvrb c;
    public final brpe d;
    public long e;
    @dzsi
    public dwiv f;
    @dzsi
    public btzy g;
    @dzsi
    public dwiv h;
    @dzsi
    public btzy i;
    @dzsi
    public ahnc j;
    public final btxz k;
    public boolean l;
    public final dwir m;
    public final bvrj n;
    public final brot o;
    private final btpc q;
    private final avnt r;
    private final brpb s;
    private final long t;
    private boolean u;
    @dzsi
    private final dtaq v;
    private final buad w;
    @dzsi
    private btzc x;
    @dzsi
    private btzc y;
    private final btzi<dwir, dwiv> z = new broj(this);
    private final btzi<dwir, dwiv> A = new brol(this);
    private final btzi<dwir, dwiv> B = new brom(this);
    private final btzi<dwir, dwiv> C = new bron(this);

    public broo(btpc btpcVar, buxl buxlVar, avnt avntVar, cjqy cjqyVar, cqat cqatVar, bvrb bvrbVar, dwir dwirVar, ahnc ahncVar, brpb brpbVar, btxz btxzVar, brot brotVar, bvrj bvrjVar, long j) {
        this.q = btpcVar;
        this.r = avntVar;
        this.v = ahncVar != null ? ahncVar.a() : null;
        buac a = buxlVar.a();
        a.f = ahncVar;
        this.w = a.a();
        this.D = buxlVar.c();
        this.a = cjqyVar;
        this.b = cqatVar;
        this.c = bvrbVar;
        this.m = dwirVar;
        this.s = brpbVar;
        this.d = new brpe(null, cqatVar, null, btxzVar, 2);
        this.k = btxzVar;
        this.o = brotVar;
        this.n = bvrjVar;
        this.t = j;
    }

    public static boolean f(dwiv dwivVar) {
        return dwivVar.c.size() == 0;
    }

    @Override // defpackage.btxx
    public final synchronized void a() {
        boolean z = false;
        dbsk.a(this.x == null);
        if (this.y == null) {
            z = true;
        }
        dbsk.a(z);
        if (this.s == brpb.ONLINE_ONLY) {
            this.d.b(1);
            this.x = this.D.a(this.m, this.B, this.n);
            return;
        }
        if (this.s != brpb.OFFLINE_ONLY && this.q.i()) {
            this.e = this.b.e() + this.t;
            this.x = this.D.a(btul.a(this.m), this.z, this.n);
            this.d.b(3);
            this.y = this.r.a(this.m, this.w, this.A, this.n);
            return;
        }
        this.d.b(2);
        this.y = this.r.a(this.m, this.w, this.C, this.n);
    }

    @Override // defpackage.btxx
    public final synchronized void b() {
        this.l = true;
        btzc btzcVar = this.x;
        if (btzcVar != null) {
            btzcVar.a();
            this.d.a(1, 6, null);
        }
        btzc btzcVar2 = this.y;
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
        dtaq dtaqVar = this.v;
        if (dtaqVar != null) {
            F.g(dtaqVar);
        }
        return F.f();
    }

    public final synchronized void d() {
        if (this.l) {
            return;
        }
        this.u = true;
        dwiv dwivVar = this.h;
        if (dwivVar == null || this.i != null || f(dwivVar)) {
            bvoo.h("Offline request should have succeeded.", new Object[0]);
            return;
        }
        btul.c(this.b, c(this.j), this.m, this.h, this.a);
        this.o.a(this.h, null, true, true, true);
    }

    public final synchronized void e() {
        if (this.l) {
            return;
        }
        b();
        dwiv dwivVar = this.f;
        if (dwivVar != null) {
            btul.b(dwivVar, this.a);
            this.o.a(this.f, null, false, false, !this.u);
            return;
        }
        dwiv dwivVar2 = this.h;
        if (dwivVar2 != null && !f(dwivVar2)) {
            if (this.u) {
                return;
            }
            btul.c(this.b, c(this.j), this.m, this.h, this.a);
            this.o.a(this.h, null, true, false, true);
            return;
        }
        if (this.h != null) {
            btul.c(this.b, c(this.j), this.m, this.h, this.a);
        }
        btzy btzyVar = this.g;
        if (btzyVar != null) {
            bttq bttqVar = btzyVar.p;
            this.k.a(bttqVar);
            this.o.a(this.f, bttqVar, false, false, !this.u);
            return;
        }
        bvoo.h("Online request should have failed.", new Object[0]);
    }
}
