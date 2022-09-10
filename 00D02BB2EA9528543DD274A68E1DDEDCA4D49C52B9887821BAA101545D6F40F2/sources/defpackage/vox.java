package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: vox  reason: default package */
/* loaded from: classes7.dex */
public class vox {
    public final dxio<qbt> a;
    public boolean c;
    public boolean d;
    private final vtn e;
    private final Context f;
    private final hwe g;
    @dzsi
    private vov i;
    private boolean j;
    private int k;
    private int l;
    private int n;
    private boolean o;
    @dzsi
    private List<dvxl> p;
    @dzsi
    private dqvj q;
    @dzsi
    private amvh r;
    public amuh b = amuh.b;
    private dcdc<amvh> h = dcdc.e();
    private dcdc<akqq> m = dcdc.e();

    public vox(dxio<qbt> dxioVar, vtn vtnVar, Context context, hwe hweVar) {
        this.e = vtnVar;
        this.a = dxioVar;
        this.f = context;
        this.g = hweVar;
    }

    private final void f(boolean z) {
        akqq akqqVar;
        amuh amuhVar;
        boolean z2;
        qbo f = this.a.a().f();
        if (f != null) {
            if (this.b.n() && this.h.isEmpty()) {
                return;
            }
            vov vovVar = this.i;
            dbsk.s(vovVar);
            if (!this.b.j()) {
                f.h();
                if (this.h.size() > 1) {
                    amvh amvhVar = this.h.get(1);
                    if (!amvhVar.k() && amvhVar.n() && (akqqVar = amvhVar.e) != null) {
                        this.g.a(amvhVar.d, akra.f(akqqVar));
                        return;
                    }
                }
                this.g.c();
                return;
            }
            amub k = this.b.k();
            vut I = vuv.I();
            if (vovVar == vov.SAME_TRAVEL_MODE) {
                amuh amuhVar2 = this.b;
                amsn amsnVar = (amsn) amuhVar2;
                int i = amsnVar.a;
                amuk c = qho.c(amuhVar2.k().d);
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < amuhVar2.m(); i2++) {
                    amub l = amuhVar2.l(i2);
                    amuk c2 = qho.c(l.d);
                    if (l.h == amuhVar2.k().h && dbsd.a(c, c2)) {
                        arrayList.add(l);
                    } else if (i2 < amsnVar.a) {
                        i--;
                    }
                }
                amuhVar = amuh.f(i, arrayList);
            } else {
                amuhVar = this.b;
            }
            I.A(amuhVar);
            dqvj dqvjVar = this.q;
            I.H((dqvjVar == dqvj.DRIVE || dqvjVar == dqvj.TWO_WHEELER || dqvjVar == dqvj.TAXI) ? albo.a : albq.a);
            ((vur) I).c = this.r;
            I.E(vovVar.i);
            I.o(k.ag());
            I.q(this.j);
            I.r(this.k);
            I.s(this.l);
            I.j(this.n);
            I.D(z);
            amve amveVar = k.d;
            int i3 = this.l;
            if (i3 >= 0) {
                if (i3 != amveVar.d(0).e() - 1) {
                    z2 = false;
                }
                z2 = true;
            } else {
                if (this.k != 0) {
                    z2 = this.j;
                }
                z2 = true;
            }
            I.p(z2);
            I.x(true);
            I.N(vovVar.m);
            I.y(vovVar.j);
            I.Q(vovVar.k == 2 ? alfa.SHOW_ALL : alfa.SHOW_NONE);
            int a = dwan.a(k.J.n);
            I.P((a != 0 && a == 3) ? alfb.DISTANCE : alfb.TIME);
            I.t(vovVar == vov.LAST_MILE);
            I.w(vovVar.l);
            I.K(this.m);
            I.J(this.q != dqvj.WALK);
            I.B(vovVar != vov.WAYPOINTS_ONLY);
            f.e(I.O());
        }
    }

    private final void g() {
        qbo f = this.a.a().f();
        if (f != null) {
            f.h();
        }
    }

    public final void a() {
        bvrj.UI_THREAD.c();
        if (this.c) {
            return;
        }
        this.c = true;
        List<dvxl> list = this.p;
        if (list != null) {
            this.e.l(list);
            this.p = null;
        }
        if (!this.o) {
            return;
        }
        if (this.b.n()) {
            g();
        }
        if (!this.b.n() || !this.h.isEmpty()) {
            f(this.d);
        }
        this.o = false;
        this.d = false;
    }

    public final void b() {
        bvrj.UI_THREAD.c();
        this.c = false;
    }

    public final void c(@dzsi amte amteVar, dcdc<amvh> dcdcVar, int i, vov vovVar, vow vowVar, @dzsi amvh amvhVar) {
        d(amteVar, dcdcVar, i, -1, vovVar, vowVar, amvhVar);
    }

    public final void d(@dzsi amte amteVar, dcdc<amvh> dcdcVar, int i, int i2, vov vovVar, vow vowVar, @dzsi amvh amvhVar) {
        bvrj.UI_THREAD.c();
        this.b = amuh.b;
        this.i = vovVar;
        vlt vltVar = (vlt) vowVar;
        this.j = vltVar.b;
        this.k = vltVar.c;
        this.l = vltVar.d;
        this.h = dcdcVar;
        this.m = vltVar.e;
        this.r = amvhVar;
        this.n = i2;
        if (amteVar != null) {
            this.q = amteVar.c(i);
            amsy amsyVar = amteVar.a;
            if (amsyVar != null && amsyVar.n() > 0 && amsyVar.t()) {
                this.b = amuh.g(amteVar, this.f, i);
            }
        }
        int i3 = this.l;
        if (!this.b.n() && this.b.l(0).z() > 1200 && this.i == vov.LAST_MILE && i3 == -1) {
            this.i = vov.NORMAL;
        }
        if (this.c) {
            if (amteVar != null) {
                this.e.l(amteVar.k());
            }
            f(vltVar.a);
            return;
        }
        this.o = true;
        if (amteVar != null) {
            this.p = amteVar.k();
        }
        if (!vltVar.a) {
            return;
        }
        this.d = true;
    }

    public final void e() {
        bvrj.UI_THREAD.c();
        this.b = amuh.b;
        if (this.c) {
            g();
        } else {
            this.o = true;
        }
    }
}
