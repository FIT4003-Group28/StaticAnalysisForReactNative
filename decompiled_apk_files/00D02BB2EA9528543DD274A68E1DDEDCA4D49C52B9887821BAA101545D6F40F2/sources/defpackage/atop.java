package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: atop  reason: default package */
/* loaded from: classes2.dex */
public final class atop {
    public final cpv a;
    @dzsi
    public atxz b;
    @dzsi
    public cqkf<? extends atxz> c;
    private final asum g;
    private final cqkj h;
    private final btvo i;
    private final atlt j;
    @dzsi
    public CharSequence d = null;
    public boolean e = false;
    public final ecs f = new aton(this);
    private final View.OnAttachStateChangeListener k = new atoo();

    public atop(asum asumVar, cqkj cqkjVar, btvo btvoVar, cpv cpvVar, atlt atltVar) {
        dbsk.s(asumVar);
        this.g = asumVar;
        dbsk.s(cqkjVar);
        this.h = cqkjVar;
        this.i = btvoVar;
        this.a = cpvVar;
        this.j = atltVar;
    }

    private final void f() {
        cqkf<? extends atxz> cqkfVar = this.c;
        if (cqkfVar != null) {
            cqkfVar.c().addOnAttachStateChangeListener(this.k);
        }
        atxz atxzVar = this.b;
        dbsk.s(atxzVar);
        atxzVar.Ob();
        this.b = null;
        this.c = null;
        this.d = null;
        asus o = this.g.o();
        if (o != null) {
            o.r(false);
        }
    }

    @dzsi
    public final View a() {
        cqkf<? extends atxz> cqkfVar = this.c;
        if (cqkfVar != null) {
            return cqkfVar.c();
        }
        return null;
    }

    public final void b() {
        cqkf<? extends atxz> c;
        if (this.b != null) {
            f();
        }
        asum asumVar = this.g;
        dbsk.s(asumVar);
        atxz m = asumVar.m();
        if (m != null) {
            if (!m.af()) {
                atxx U = m.U();
                atxx atxxVar = atxx.DEFAULT;
                switch (U.ordinal()) {
                    case 0:
                    case 2:
                    case 4:
                    case 8:
                        c = this.h.c(new atpz(), null);
                        break;
                    case 1:
                        c = this.h.c(new atpm(), null);
                        break;
                    case 3:
                        c = this.h.c(new atqj(), null);
                        break;
                    case 5:
                        c = this.h.c(new atsd(), null);
                        break;
                    case 6:
                        if (this.i.getUgcParameters().aL()) {
                            c = this.h.c(new atqu(), null);
                            break;
                        } else {
                            c = this.h.c(new atqr(), null);
                            break;
                        }
                    case 7:
                        c = this.h.c(new atrl(), null);
                        break;
                    case 9:
                        c = this.h.c(new atqy(), null);
                        break;
                    case 10:
                        c = this.h.c(new atqh(), null);
                        break;
                    default:
                        c = this.h.c(new atpz(), null);
                        break;
                }
                this.c = c;
                c.e(m);
            }
            m.Oa();
            if (m.W()) {
                this.d = m.Y();
            }
            asus o = this.g.o();
            if (o != null) {
                o.r(m.X());
            }
            this.e = m.X();
            this.b = m;
            m.aj(true);
            e();
        }
    }

    public final boolean c() {
        atxz atxzVar = this.b;
        if (atxzVar == null) {
            return false;
        }
        atxzVar.o();
        return true;
    }

    public final void d() {
        if (this.b != null) {
            f();
        }
    }

    public final void e() {
        atxz atxzVar = this.b;
        if (atxzVar == null) {
            return;
        }
        atxzVar.ah(this.h.d.getResources().getConfiguration().orientation == 2 ? this.j.b() : -1);
        cqkf<? extends atxz> cqkfVar = this.c;
        if (cqkfVar == null) {
            return;
        }
        cqkfVar.g();
    }
}
