package defpackage;
/* compiled from: PG */
/* renamed from: ammc  reason: default package */
/* loaded from: classes.dex */
public final class ammc implements aliz {
    public final ckme a;
    @dzsi
    public final ckmm b;
    private final ckcw l;
    private final ckhe m;
    private final ckhe n;
    private final ckhe o;
    private boolean c = false;
    private boolean d = false;
    private boolean e = false;
    private boolean f = false;
    private boolean g = true;
    private boolean h = false;
    private long i = 0;
    private boolean j = false;
    private boolean k = false;
    private boolean p = false;
    private boolean q = false;

    public ammc(ckcw ckcwVar, ckme ckmeVar, @dzsi ckmm ckmmVar) {
        this.l = ckcwVar;
        this.b = ckmmVar;
        this.a = ckmeVar;
        ckhf ckhfVar = ckgi.f.get(ckmeVar);
        dbsk.s(ckhfVar);
        this.m = (ckhe) ckcwVar.a(ckhfVar);
        ckhf ckhfVar2 = ckgi.g.get(ckmeVar);
        dbsk.s(ckhfVar2);
        this.n = (ckhe) ckcwVar.a(ckhfVar2);
        this.o = (ckhe) ckcwVar.a(ckip.p);
    }

    private final void r() {
        int i = 2;
        this.l.b(ckgx.TILE_CACHE_STATE, new amma(this.c ? this.d ? 2 : 1 : 3));
        if (!this.e) {
            i = 3;
        } else if (!this.f) {
            i = 1;
        }
        this.l.b(ckgx.BASE_TILE_CACHE_STATE, new ammb(i));
    }

    private final void s(dcdn<ckme, ckha> dcdnVar) {
        ckcy ckcyVar = bvmo.g;
        ckha ckhaVar = dcdnVar.get(this.a);
        dbsk.s(ckhaVar);
        ckcyVar.c(ckhaVar);
    }

    private final long t(int i) {
        int i2 = akry.BASE.I.Z;
        int i3 = i - 1;
        if (i != 0) {
            if (i3 == 0) {
                return ((ckco) this.l.a(ckgh.by)).c(i2);
            }
            if (i3 == 1) {
                return ((ckco) this.l.a(ckgh.bx)).c(i2);
            }
            if (i3 == 2) {
                return ((ckco) this.l.a(ckgh.bz)).c(i2);
            }
            if (i3 == 3) {
                return ((ckco) this.l.a(ckgh.bw)).c(i2);
            }
            if (i3 == 4) {
                return ((ckco) this.l.a(ckgh.bv)).c(i2);
            }
            if (i3 == 5) {
                return ((ckco) this.l.a(ckev.c)).c(i2);
            }
            return 0L;
        }
        throw null;
    }

    @Override // defpackage.aliz
    public final synchronized void a() {
        this.j = true;
    }

    public final synchronized void b(akry akryVar) {
        if (akryVar == akry.BASE) {
            this.e = true;
        }
        this.c = true;
    }

    public final synchronized void c(akry akryVar) {
        if (akryVar == akry.BASE) {
            this.f = true;
        }
        this.d = true;
    }

    public final synchronized void d() {
        this.g = false;
    }

    public final synchronized void e() {
        bvmn bvmnVar = bvmo.a;
        dbsk.s(bvmp.a.get(this.a));
        if (this.g) {
            r();
            s(ckgi.a);
            ((ckhe) this.l.a(ckee.n)).c();
        }
    }

    public final synchronized void f() {
        if (this.g) {
            r();
            s(ckgi.b);
            bvmo.b(ddda.cN);
        }
        bvmn bvmnVar = bvmo.a;
        dbsk.s(bvmp.b.get(this.a));
        ckmm ckmmVar = this.b;
        if (ckmmVar != null) {
            cwsv cwsvVar = ckoh.e.get(this.a);
            dbsk.s(cwsvVar);
            ckmmVar.p(cwsvVar);
            ckmm ckmmVar2 = this.b;
            cwsv cwsvVar2 = ckoh.h.get(this.a);
            dbsk.s(cwsvVar2);
            ckmmVar2.p(cwsvVar2);
        }
    }

    public final synchronized void g() {
        if (this.g) {
            s(ckgi.c);
            bvmo.b(ddda.cM);
            dbsk.s(bvmp.d.get(this.a));
            int[] a = ckgg.a();
            for (int i = 0; i < 6; i++) {
                int i2 = a[i];
                long t = t(i2);
                ckcp ckcpVar = (ckcp) this.l.a(ckgh.bC);
                int i3 = i2 - 1;
                if (i2 != 0) {
                    ckcpVar.b(i3, t);
                } else {
                    throw null;
                }
            }
            ckmm ckmmVar = this.b;
            if (ckmmVar != null) {
                cwsv cwsvVar = ckoh.f.get(this.a);
                dbsk.s(cwsvVar);
                ckmmVar.p(cwsvVar);
                ckmm ckmmVar2 = this.b;
                cwsv cwsvVar2 = ckoh.i.get(this.a);
                dbsk.s(cwsvVar2);
                ckmmVar2.p(cwsvVar2);
                ckmm ckmmVar3 = this.b;
                cwsv cwsvVar3 = ckoh.l.get(this.a);
                dbsk.s(cwsvVar3);
                ckmmVar3.g(cwsvVar3);
            }
        }
        s(ckgi.h);
    }

    public final synchronized void h() {
        ckcw ckcwVar = this.l;
        ckgu ckguVar = ckgi.d.get(this.a);
        dbsk.s(ckguVar);
        ((ckcn) ckcwVar.a(ckguVar)).a();
        q(ckgi.b);
        q(ckgi.c);
        ckmm ckmmVar = this.b;
        if (ckmmVar != null) {
            cwsv cwsvVar = ckoh.e.get(this.a);
            dbsk.s(cwsvVar);
            ckmmVar.r(cwsvVar);
            ckmm ckmmVar2 = this.b;
            cwsv cwsvVar2 = ckoh.f.get(this.a);
            dbsk.s(cwsvVar2);
            ckmmVar2.r(cwsvVar2);
            ckmm ckmmVar3 = this.b;
            cwsv cwsvVar3 = ckoh.h.get(this.a);
            dbsk.s(cwsvVar3);
            ckmmVar3.r(cwsvVar3);
            ckmm ckmmVar4 = this.b;
            cwsv cwsvVar4 = ckoh.i.get(this.a);
            dbsk.s(cwsvVar4);
            ckmmVar4.r(cwsvVar4);
        }
    }

    public final synchronized void i() {
        this.p = true;
        this.m.c();
        this.n.c();
    }

    public final synchronized void j() {
        this.q = true;
        this.o.c();
    }

    public final synchronized void k() {
        if (this.p) {
            this.m.d();
        } else {
            this.m.a();
        }
    }

    public final synchronized void l() {
        if (this.q) {
            this.o.d();
        } else {
            this.o.a();
        }
    }

    public final synchronized void m() {
        bvmn bvmnVar = bvmo.a;
        if (this.p) {
            this.n.d();
        } else {
            this.n.a();
        }
    }

    public final synchronized void n(long j) {
        if (this.k) {
            return;
        }
        if (this.h) {
            return;
        }
        long j2 = this.i;
        if (j2 == 0) {
            this.i = j;
        } else if (j2 == j) {
        } else {
            if (this.j) {
                this.l.b(ckgx.FIRST_VIEWPORT_STATE, new amlx());
            } else {
                this.l.b(ckgx.FIRST_VIEWPORT_STATE, new amly());
            }
            this.i = j;
            this.h = true;
        }
    }

    public final synchronized void o() {
        if (!this.k) {
            if (this.g) {
                s(ckgi.e);
                bvmo.b(ddda.cC);
                dbsk.s(bvmp.c.get(this.a));
                int[] a = ckgg.a();
                for (int i = 0; i < 6; i++) {
                    int i2 = a[i];
                    long t = t(i2);
                    ckcp ckcpVar = (ckcp) this.l.a(ckgh.bB);
                    int i3 = i2 - 1;
                    if (i2 != 0) {
                        ckcpVar.b(i3, t);
                    } else {
                        throw null;
                    }
                }
                ckmm ckmmVar = this.b;
                if (ckmmVar != null) {
                    cwsv cwsvVar = ckoh.g.get(this.a);
                    dbsk.s(cwsvVar);
                    ckmmVar.p(cwsvVar);
                    ckmm ckmmVar2 = this.b;
                    cwsv cwsvVar2 = ckoh.j.get(this.a);
                    dbsk.s(cwsvVar2);
                    ckmmVar2.p(cwsvVar2);
                }
            } else {
                q(ckgi.e);
            }
            this.k = true;
        }
    }

    public final void p(dcdn<ckme, ckha> dcdnVar) {
        ckcy ckcyVar = bvmo.g;
        ckha ckhaVar = dcdnVar.get(this.a);
        dbsk.s(ckhaVar);
        ckcyVar.a(ckhaVar);
    }

    public final void q(dcdn<ckme, ckha> dcdnVar) {
        ckcy ckcyVar = bvmo.g;
        ckha ckhaVar = dcdnVar.get(this.a);
        dbsk.s(ckhaVar);
        ckcyVar.b(ckhaVar);
    }
}
