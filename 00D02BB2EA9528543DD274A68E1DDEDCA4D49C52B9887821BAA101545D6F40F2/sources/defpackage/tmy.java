package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: tmy  reason: default package */
/* loaded from: classes7.dex */
public final class tmy {
    public final bwpo a;
    public final tmw b;
    @dzsi
    tmx d;
    @dzsi
    bwpn e;
    boolean f;
    boolean g;
    private final tna j;
    private final dxio<bwjz> k;
    private final Activity l;
    private final vxa m;
    public final bwnj c = new bwnj();
    final tmu i = new tmu(this);
    final wte h = new tmv(this);

    public tmy(tna tnaVar, bwpo bwpoVar, dxio<bwjz> dxioVar, Activity activity, vxa vxaVar, tmw tmwVar) {
        dbsk.a(tmwVar instanceof fd);
        this.j = tnaVar;
        this.a = bwpoVar;
        this.m = vxaVar;
        this.k = dxioVar;
        this.l = activity;
        this.b = tmwVar;
    }

    public final void a(bwnj bwnjVar) {
        this.c.a(bwnjVar);
    }

    public final void b() {
        tmx tmxVar = this.d;
        if (tmxVar != null) {
            tmxVar.d();
        }
        this.f = true;
    }

    public final void c() {
        tmx tmxVar = this.d;
        if (tmxVar != null) {
            tmxVar.e();
        }
        this.f = false;
    }

    public final void d(boolean z) {
        tmx tmxVar = this.d;
        if (tmxVar != null) {
            tmxVar.g(z);
        }
        this.g = z;
    }

    public final bwpn e() {
        bwpn bwpnVar = this.e;
        boolean z = false;
        if ((bwpnVar == null) == (this.d == null)) {
            z = true;
        }
        dbsk.l(z);
        if (bwpnVar == null) {
            bwpnVar = this.a.a(this.c);
            tna tnaVar = this.j;
            bwnj bwnjVar = this.c;
            tmw tmwVar = this.b;
            gga a = tnaVar.a.a();
            tna.a(a, 1);
            cjzo a2 = tnaVar.b.a();
            tna.a(a2, 2);
            cjqy a3 = tnaVar.c.a();
            tna.a(a3, 3);
            bwjz a4 = tnaVar.d.a();
            tna.a(a4, 4);
            btrm a5 = tnaVar.e.a();
            tna.a(a5, 5);
            dxio a6 = ((dxjh) tnaVar.f).a();
            tna.a(a6, 6);
            eeu a7 = tnaVar.g.a();
            tna.a(a7, 7);
            bvrb a8 = tnaVar.h.a();
            tna.a(a8, 8);
            nut a9 = tnaVar.i.a();
            tna.a(a9, 9);
            qbt a10 = tnaVar.j.a();
            tna.a(a10, 10);
            ahjq a11 = tnaVar.k.a();
            tna.a(a11, 11);
            ckcw a12 = tnaVar.l.a();
            tna.a(a12, 12);
            bwjy a13 = tnaVar.m.a();
            tna.a(a13, 13);
            tna.a(bwnjVar, 14);
            tna.a(bwpnVar, 15);
            tmx tmxVar = new tmx(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, bwnjVar, bwpnVar, tmwVar);
            tmxVar.g(this.g);
            if (this.f) {
                tmxVar.d();
            }
            this.d = tmxVar;
            this.e = bwpnVar;
        }
        return bwpnVar;
    }

    public final void f(dtja dtjaVar, dtjs dtjsVar, dtjt dtjtVar, bxla bxlaVar) {
        tmx tmxVar = this.d;
        dbsk.s(tmxVar);
        synchronized (tmxVar.b) {
            tmxVar.b.L();
            tmxVar.b.c(dtjaVar);
            tmxVar.b.k(dtjsVar);
            tmxVar.b.E(dtjtVar);
            tmxVar.b.X(bwnl.a);
            tmxVar.b.m(bxlaVar);
            tmxVar.h();
            tmxVar.f(true);
        }
    }

    @dzsi
    public final nxe g(dthb dthbVar) {
        dcdc h = dcdc.h(new wsx(this.i, this.l, this.m), new wsz(this.h, dbpy.a, this.l), new nvu(this.k));
        int size = h.size();
        int i = 0;
        while (i < size) {
            nxe nxeVar = (nxe) h.get(i);
            i++;
            if (nxeVar.a(dthbVar)) {
                return nxeVar;
            }
        }
        return null;
    }
}
