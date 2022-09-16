package defpackage;
/* compiled from: PG */
/* renamed from: fyq  reason: default package */
/* loaded from: classes6.dex */
public final class fyq implements bzef {
    public volatile dzsj<bzdv> a;
    public final dzsj<amub> b;
    final /* synthetic */ fyr c;
    private final amub d;
    private final bzge e;
    private volatile dzsj<bzfw> f;
    private volatile dzsj<bzfm> g;
    private volatile dzsj<bzdn> h;
    private volatile dzsj<bzfj> j;
    private volatile dzsj<bzej> k;
    private volatile dzsj<bzfo> m;
    private volatile Object i = new dxjf();
    private volatile Object l = new dxjf();
    private volatile Object n = new dxjf();
    private volatile Object o = new dxjf();
    private volatile Object p = new dxjf();

    public fyq(fyr fyrVar, amub amubVar, bzge bzgeVar) {
        this.c = fyrVar;
        this.d = amubVar;
        this.e = bzgeVar;
        this.b = dxjd.b(amubVar);
    }

    public final dzsj<bzfw> a() {
        dzsj<bzfw> dzsjVar = this.f;
        if (dzsjVar == null) {
            fyp fypVar = new fyp(this, 1);
            this.f = fypVar;
            return fypVar;
        }
        return dzsjVar;
    }

    public final dzsj<bzfm> b() {
        dzsj<bzfm> dzsjVar = this.g;
        if (dzsjVar == null) {
            fyp fypVar = new fyp(this, 0);
            this.g = fypVar;
            return fypVar;
        }
        return dzsjVar;
    }

    public final dzsj<bzdn> c() {
        dzsj<bzdn> dzsjVar = this.h;
        if (dzsjVar == null) {
            fyp fypVar = new fyp(this, 4);
            this.h = fypVar;
            return fypVar;
        }
        return dzsjVar;
    }

    public final bzda d() {
        Object obj;
        Object obj2 = this.i;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.i;
                if (obj instanceof dxjf) {
                    obj = new bzda(this.d);
                    dxjc.d(this.i, obj);
                    this.i = obj;
                }
            }
            obj2 = obj;
        }
        return (bzda) obj2;
    }

    public final dzsj<bzfj> e() {
        dzsj<bzfj> dzsjVar = this.j;
        if (dzsjVar == null) {
            fyp fypVar = new fyp(this, 5);
            this.j = fypVar;
            return fypVar;
        }
        return dzsjVar;
    }

    public final dzsj<bzej> f() {
        dzsj<bzej> dzsjVar = this.k;
        if (dzsjVar == null) {
            fyp fypVar = new fyp(this, 3);
            this.k = fypVar;
            return fypVar;
        }
        return dzsjVar;
    }

    public final bzds g() {
        return new bzds(b(), f());
    }

    public final bzfo h() {
        Object obj;
        Object obj2 = this.l;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.l;
                if (obj instanceof dxjf) {
                    dzsj<srv> ry = this.c.v.ry();
                    bvjj rB = this.c.v.a.rB();
                    dxjg.e(rB);
                    btrm rz = this.c.v.a.rz();
                    dxjg.e(rz);
                    amub amubVar = this.d;
                    dxjg.e(this.c.v.a.C());
                    dxjg.e(this.c.v.a.rp());
                    bzgn bzgnVar = new bzgn();
                    cqat rR = this.c.v.a.rR();
                    dxjg.e(rR);
                    cjqy tr = this.c.v.a.tr();
                    dxjg.e(tr);
                    bzec i = i();
                    btvo rp = this.c.v.a.rp();
                    dxjg.e(rp);
                    dxjg.e(this.c.v.a.C());
                    obj = new bzfo(ry, rB, rz, amubVar, bzgnVar, rR, tr, i, rp, this.c.b());
                    dxjc.d(this.l, obj);
                    this.l = obj;
                }
            }
            obj2 = obj;
        }
        return (bzfo) obj2;
    }

    @Override // defpackage.bzef
    public final bzec i() {
        Object obj;
        Object obj2 = this.n;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.n;
                if (obj instanceof dxjf) {
                    bzds g = g();
                    bzge bzgeVar = this.e;
                    amub amubVar = this.d;
                    byzk b = this.c.b();
                    dzsj dzsjVar = this.m;
                    if (dzsjVar == null) {
                        dzsjVar = new fyp(this, 6);
                        this.m = dzsjVar;
                    }
                    dxio c = dxjc.c(dzsjVar);
                    bzda d = d();
                    vxv h = this.c.h();
                    cqat rR = this.c.v.a.rR();
                    dxjg.e(rR);
                    obj = new bzec(g, bzgeVar, amubVar, b, c, d, h, rR);
                    dxjc.d(this.n, obj);
                    this.n = obj;
                }
            }
            obj2 = obj;
        }
        return (bzec) obj2;
    }

    @Override // defpackage.bzef
    public final bzfw j() {
        Object obj;
        Object obj2 = this.o;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.o;
                if (obj instanceof dxjf) {
                    btrm rz = this.c.v.a.rz();
                    dxjg.e(rz);
                    ahjq wf = this.c.v.wf();
                    bzfo h = h();
                    cqzw k = k();
                    bvrb tn = this.c.v.a.tn();
                    dxjg.e(tn);
                    btvo rp = this.c.v.a.rp();
                    dxjg.e(rp);
                    obj = new bzfw(rz, wf, h, k, tn, rp, this.c.b(), i(), this.c.v.pI());
                    dxjc.d(this.o, obj);
                    this.o = obj;
                }
            }
            obj2 = obj;
        }
        return (bzfw) obj2;
    }

    @Override // defpackage.bzef
    public final cqzw k() {
        Object obj;
        Object obj2 = this.p;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.p;
                if (obj instanceof dxjf) {
                    amub amubVar = this.d;
                    btrm rz = this.c.v.a.rz();
                    dxjg.e(rz);
                    btvo rp = this.c.v.a.rp();
                    dxjg.e(rp);
                    obj = cqzw.a(amubVar, rz, rp.getNavigationParameters(), null, this.c.v.pI());
                    dxjc.d(this.p, obj);
                    this.p = obj;
                }
            }
            obj2 = obj;
        }
        return (cqzw) obj2;
    }
}
