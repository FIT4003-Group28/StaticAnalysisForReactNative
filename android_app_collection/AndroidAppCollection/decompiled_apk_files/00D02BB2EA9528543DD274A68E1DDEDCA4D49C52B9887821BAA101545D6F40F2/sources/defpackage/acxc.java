package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: acxc  reason: default package */
/* loaded from: classes.dex */
public final class acxc implements acys {
    private static final dcqe c = dcqe.c("acxc");
    public final ckcw a;
    @dzsi
    public acxb b;
    private final acxe d;
    private final cqat e;
    private final ckmm f;
    private final cjqy g;
    private final bvjj h;
    @dzsi
    private Activity i;

    public acxc(Activity activity, acxe acxeVar, ckcw ckcwVar, cqat cqatVar, ckmm ckmmVar, cjqy cjqyVar, bvjj bvjjVar) {
        this.i = activity;
        this.d = acxeVar;
        this.a = ckcwVar;
        this.e = cqatVar;
        this.f = ckmmVar;
        this.g = cjqyVar;
        this.h = bvjjVar;
    }

    private static boolean n(bvjj bvjjVar) {
        dktk b = dktk.b(bvjjVar.s(bvjk.L, dktk.UNKNOWN_ASSISTIVE_TAB_TYPE.o));
        return b != null && b == dktk.TRANSPORTATION;
    }

    private final boolean o() {
        Activity activity = this.i;
        if (activity == null) {
            return false;
        }
        return ((ff) activity).g().H(gfu.ACTIVITY_FRAGMENT.c) instanceof acyf;
    }

    private final void p(ckfd ckfdVar, Long l, boolean z) {
        this.b = new acxb(ckfdVar, l, z);
    }

    private static boolean q(@dzsi acxb acxbVar) {
        if (acxbVar == null) {
            bvoo.h("Attempted to log Goldfinger startup timers with invalid startup state", new Object[0]);
            return false;
        } else if (acxbVar.i == null) {
            bvoo.h("Attempted to log Goldfinger startup timers with invalid initial tab", new Object[0]);
            return false;
        } else if (acxbVar.a != null) {
            return true;
        } else {
            bvoo.h("Attempted to log Goldfinger startup timers with invalid startup type or start time", new Object[0]);
            return false;
        }
    }

    private final void r(final boolean z) {
        this.a.b(ckgx.GOLDFINGER_COMPLETED_ON_FIRST_FRAME, new ckcx(z) { // from class: acwz
            private final boolean a;

            {
                this.a = z;
            }

            @Override // defpackage.ckcx
            public final void a(ddyf ddyfVar) {
                boolean z2 = this.a;
                if (ddyfVar.c) {
                    ddyfVar.bF();
                    ddyfVar.c = false;
                }
                ddyq ddyqVar = (ddyq) ddyfVar.b;
                ddyq ddyqVar2 = ddyq.K;
                ddyqVar.a |= 4194304;
                ddyqVar.s = z2;
            }
        });
    }

    private final void s(boolean z, int i) {
        ddda dddaVar;
        acxb acxbVar = this.b;
        if (!q(acxbVar) || acxbVar == null || acxbVar.i == null) {
            return;
        }
        long e = this.e.e() - acxbVar.b.longValue();
        if (!acxbVar.a()) {
            t(i);
            r(!acxbVar.d);
        }
        if (!acxbVar.e) {
            acxbVar.e = true;
            ckha a = ckfh.a(acxbVar.i, acxbVar.a, ckfg.APPEAR_LOADED);
            ckgz c2 = ckfh.c(acxbVar.i, acxbVar.a, ckfg.APPEAR_LOADED);
            String str = a.b;
            ((ckcp) this.a.a(a)).a(e);
            ((ckco) this.a.a(c2)).a(i - 1);
            if (acxbVar.c) {
                dddaVar = ddda.cF;
            } else {
                dddaVar = ddda.cE;
            }
            cjqy cjqyVar = this.g;
            cjsx i2 = cjsy.i();
            i2.b(dddaVar);
            cjqyVar.k(i2.a());
            if (acxbVar.j) {
                this.f.p(ckof.a);
            }
            dktk dktkVar = dktk.UNKNOWN_ASSISTIVE_TAB_TYPE;
        }
        if (acxbVar.f || z) {
            return;
        }
        acxbVar.f = true;
        ckha a2 = ckfh.a(acxbVar.i, acxbVar.a, ckfg.APPEAR_LOADED_WITH_IMAGES);
        ckgz c3 = ckfh.c(acxbVar.i, acxbVar.a, ckfg.APPEAR_LOADED_WITH_IMAGES);
        if (a2 == null || c3 == null) {
            return;
        }
        ((ckcp) this.a.a(a2)).a(e);
        ((ckco) this.a.a(c3)).a(i - 1);
    }

    private final void t(int i) {
        acxd acxdVar = acxd.CONTENT_LOADING;
        int i2 = i - 1;
        final int i3 = 7;
        if (i2 == 0) {
            i3 = 2;
        } else if (i2 == 1) {
            i3 = 3;
        } else if (i2 == 3) {
            i3 = 5;
        } else if (i2 == 4) {
            i3 = 6;
        } else if (i2 != 5) {
            i3 = i2 != 6 ? i2 != 7 ? 1 : 9 : 8;
        }
        this.a.b(ckgx.GOLDFINGER_LOAD_STATUS, new ckcx(i3) { // from class: acxa
            private final int a;

            {
                this.a = i3;
            }

            @Override // defpackage.ckcx
            public final void a(ddyf ddyfVar) {
                int i4 = this.a;
                if (ddyfVar.c) {
                    ddyfVar.bF();
                    ddyfVar.c = false;
                }
                ddyq ddyqVar = (ddyq) ddyfVar.b;
                ddyq ddyqVar2 = ddyq.K;
                ddyqVar.r = i4 - 1;
                ddyqVar.a |= 2097152;
            }
        });
    }

    @Override // defpackage.acys
    public final boolean a() {
        return this.b != null;
    }

    @Override // defpackage.acys
    public final void b(boolean z, long j, boolean z2) {
        if (n(this.h)) {
            return;
        }
        if (z) {
            if (o()) {
                p(ckfd.LUKEWARM, Long.valueOf(j), z2);
            }
        } else {
            p(ckfd.COLD, Long.valueOf(j), z2);
            bvmo.g.a(ckfh.d);
            bvmo.g.a(ckfh.e);
            bvmo.g.a(ckfh.f);
        }
        if (!z2) {
            return;
        }
        this.f.q(ckof.a);
    }

    @Override // defpackage.acys
    public final void c() {
        if (!n(this.h) && o()) {
            p(ckfd.WARM, Long.valueOf(this.e.e()), true);
        }
    }

    @Override // defpackage.acys
    public final void d() {
        this.i = null;
    }

    @Override // defpackage.acys
    public final void e() {
        acxb acxbVar = this.b;
        if (acxbVar == null) {
            return;
        }
        if (!acxbVar.a()) {
            m(4);
        }
        this.b = null;
        bvmo.g.b(ckfh.d);
        bvmo.g.b(ckfh.e);
        bvmo.g.b(ckfh.f);
        ((ckhe) this.a.a(ckfh.j)).e();
        ((ckhe) this.a.a(ckfh.g)).e();
        ((ckhe) this.a.a(ckfh.h)).e();
        ((ckhe) this.a.a(ckfh.i)).e();
    }

    @Override // defpackage.acys
    public final void f() {
        k(ckfh.i);
    }

    @Override // defpackage.acys
    public final void g() {
        k(ckfh.h);
    }

    @Override // defpackage.acys
    public final boolean h(boolean z) {
        acxb acxbVar = this.b;
        if (acxbVar == null || acxbVar.a()) {
            return true;
        }
        acxd a = this.d.a();
        a.toString();
        int ordinal = a.ordinal();
        if (ordinal == 0) {
            acxbVar.d = true;
            return false;
        }
        int i = 2;
        if (ordinal == 1) {
            if (true != acxbVar.c) {
                i = 1;
            }
            acxb acxbVar2 = this.b;
            if (q(acxbVar2) && acxbVar2 != null && acxbVar2.i != null) {
                long e = this.e.e() - acxbVar2.b.longValue();
                if (!acxbVar2.g) {
                    ckha a2 = ckfh.a(acxbVar2.i, acxbVar2.a, ckfg.ACTIONABLE_CONTENT);
                    ckgz c2 = ckfh.c(acxbVar2.i, acxbVar2.a, ckfg.ACTIONABLE_CONTENT);
                    if (a2 != null && c2 != null) {
                        ((ckcp) this.a.a(a2)).a(e);
                        ((ckco) this.a.a(c2)).a(i - 1);
                        acxbVar2.g = true;
                    }
                }
            }
            return false;
        } else if (ordinal == 2) {
            if (true != acxbVar.c) {
                i = 1;
            }
            s(true, i);
            return false;
        } else if (ordinal == 3) {
            m(6);
            return true;
        } else if (ordinal != 4) {
            if (ordinal != 5) {
                return true;
            }
            m(true != z ? 8 : 7);
            return true;
        } else {
            if (true != acxbVar.c) {
                i = 1;
            }
            s(false, i);
            return true;
        }
    }

    @Override // defpackage.acys
    public final void i(dktk dktkVar) {
        acxb acxbVar = this.b;
        if (acxbVar == null || acxbVar.a()) {
            return;
        }
        acxbVar.i = dktkVar;
    }

    @Override // defpackage.acys
    public final void j(final boolean z) {
        this.a.b(ckgx.GOLDFINGER_UI_RENDERED, new ckcx(z) { // from class: acwy
            private final boolean a;

            {
                this.a = z;
            }

            @Override // defpackage.ckcx
            public final void a(ddyf ddyfVar) {
                boolean z2 = this.a;
                if (ddyfVar.c) {
                    ddyfVar.bF();
                    ddyfVar.c = false;
                }
                ddyq ddyqVar = (ddyq) ddyfVar.b;
                ddyq ddyqVar2 = ddyq.K;
                ddyqVar.a |= 1073741824;
                ddyqVar.y = z2;
            }
        });
    }

    public final void k(ckhf ckhfVar) {
        if (!l()) {
            return;
        }
        ((ckhe) this.a.a(ckhfVar)).c();
    }

    public final boolean l() {
        acxb acxbVar = this.b;
        return acxbVar != null && acxbVar.a == ckfd.COLD;
    }

    public final void m(int i) {
        acxb acxbVar = this.b;
        if (!q(acxbVar) || acxbVar == null || acxbVar.i == null) {
            return;
        }
        long e = this.e.e() - acxbVar.b.longValue();
        if (!acxbVar.a()) {
            t(i);
            r(!acxbVar.d);
        }
        if (!acxbVar.g) {
            ckha b = ckfh.b(acxbVar.i, acxbVar.a, ckfg.ACTIONABLE_CONTENT);
            ckgz c2 = ckfh.c(acxbVar.i, acxbVar.a, ckfg.ACTIONABLE_CONTENT);
            if (b != null && c2 != null) {
                ((ckcp) this.a.a(b)).a(e);
                ((ckco) this.a.a(c2)).a(i - 1);
                acxbVar.g = true;
            }
        }
        if (!acxbVar.e) {
            ckha b2 = ckfh.b(acxbVar.i, acxbVar.a, ckfg.APPEAR_LOADED);
            ckgz c3 = ckfh.c(acxbVar.i, acxbVar.a, ckfg.APPEAR_LOADED);
            if (b2 != null && c3 != null) {
                ((ckcp) this.a.a(b2)).a(e);
                ((ckco) this.a.a(c3)).a(i - 1);
                acxbVar.e = true;
            }
        }
        if (acxbVar.f) {
            return;
        }
        ckha b3 = ckfh.b(acxbVar.i, acxbVar.a, ckfg.APPEAR_LOADED_WITH_IMAGES);
        ckgz c4 = ckfh.c(acxbVar.i, acxbVar.a, ckfg.APPEAR_LOADED_WITH_IMAGES);
        if (b3 == null || c4 == null) {
            return;
        }
        ((ckcp) this.a.a(b3)).a(e);
        ((ckco) this.a.a(c4)).a(i - 1);
        acxbVar.f = true;
    }
}
