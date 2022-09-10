package defpackage;

import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: sry  reason: default package */
/* loaded from: classes7.dex */
public abstract class sry implements qbm {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean y(vun vunVar) {
        dnqh dnqhVar = vunVar.p;
        if (dnqhVar != null) {
            return dnqhVar.j;
        }
        return false;
    }

    @Override // defpackage.qbm
    public final boolean a() {
        return x() == 1;
    }

    @Override // defpackage.qbm
    public final boolean b() {
        return x() == 2 || r();
    }

    @Override // defpackage.qbm
    public final boolean c() {
        return n() != null;
    }

    @Override // defpackage.qbm
    public final boolean d() {
        return x() == 4 && !r() && !t();
    }

    @Override // defpackage.qbm
    @dzsi
    public abstract btzy e();

    @Override // defpackage.qbm
    public abstract boolean f();

    @Override // defpackage.qbm
    @dzsi
    public abstract vun g();

    @Override // defpackage.qbm
    @dzsi
    public abstract dwaw h();

    @Override // defpackage.qbm
    public final dcdc<amvh> i() {
        List asList;
        amte n = n();
        vun g = g();
        if (n == null) {
            dbsk.s(g);
            asList = g.l;
        } else {
            asList = Arrays.asList(n.c);
        }
        amvj.k(asList.size());
        return dcdc.r(asList);
    }

    @Override // defpackage.qbm
    @dzsi
    public final dgas j() {
        amte n = n();
        if (n == null) {
            return null;
        }
        amsy amsyVar = n.a;
        if (amsyVar.n() <= 0) {
            return null;
        }
        return vyb.x(amsyVar.m(0));
    }

    @Override // defpackage.qbm
    @dzsi
    public final dqvj k() {
        amte n = n();
        if (n == null) {
            return null;
        }
        amsy amsyVar = n.a;
        if (amsyVar.n() <= 0) {
            return null;
        }
        dqvj c = dqvj.c(amsyVar.m(0).b().b);
        return c == null ? dqvj.DRIVE : c;
    }

    @Override // defpackage.qbm
    @dzsi
    public final dqvj l() {
        amte n = n();
        if (n != null) {
            return n.d();
        }
        vun g = g();
        if (g == null) {
            return null;
        }
        return g.a();
    }

    @Override // defpackage.qbm
    @dzsi
    public final cjtd m() {
        amte n = n();
        if (n == null) {
            return null;
        }
        amsy amsyVar = n.a;
        if (amsyVar.n() <= 0) {
            return null;
        }
        return vyb.t(amsyVar.m(0));
    }

    @Override // defpackage.qbm
    @dzsi
    public abstract amte n();

    @Override // defpackage.qbm
    public final boolean o() {
        amte n = n();
        return n != null && n.a.t();
    }

    @Override // defpackage.qbm
    public final vwn p(vwo vwoVar) {
        final btzy e = e();
        return vwoVar.b(vwn.o(), new mw(this, e) { // from class: srw
            private final sry a;
            private final btzy b;

            {
                this.a = this;
                this.b = e;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                sry sryVar = this.a;
                btzy btzyVar = this.b;
                vwl vwlVar = (vwl) obj;
                vwlVar.q(sryVar.n());
                vwlVar.f(sryVar.b());
                vwlVar.b(sryVar.v());
                vwlVar.e(btzyVar != null ? btzyVar.p : null);
            }
        });
    }

    @Override // defpackage.qbm
    @dzsi
    public final dpaz q() {
        vun g = g();
        if (g == null) {
            return null;
        }
        return g.u;
    }

    public abstract boolean r();

    @dzsi
    public abstract dnqh s();

    public abstract boolean t();

    @dzsi
    public abstract dndp u();

    public abstract int v();

    public abstract srx w();

    public abstract int x();
}
