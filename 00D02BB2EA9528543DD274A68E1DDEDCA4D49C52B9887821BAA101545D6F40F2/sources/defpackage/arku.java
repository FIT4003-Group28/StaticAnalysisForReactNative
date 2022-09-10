package defpackage;

import android.content.res.Configuration;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: arku  reason: default package */
/* loaded from: classes2.dex */
public final class arku implements arka {
    public final dld a;
    public boolean b;
    @dzsi
    public atlq c;
    private final qbo d;
    private final btrm e;
    private boolean f;

    public arku(fd fdVar, dxio<qbt> dxioVar, czt cztVar, btvo btvoVar, btrm btrmVar, arla arlaVar, dle dleVar) {
        qbo f = dxioVar.a().f();
        dbsk.s(f);
        czh czhVar = czh.WALKING_NAVIGATION;
        dhly dhlyVar = btvoVar.getNavigationParameters().J().h;
        dhlx dhlxVar = (dhlyVar == null ? dhly.e : dhlyVar).d;
        dhlx dhlxVar2 = dhlxVar == null ? dhlx.e : dhlxVar;
        arkx arkxVar = ((arjz) arlaVar).c.b;
        boolean z = (arkxVar == null ? arkx.g : arkxVar).e;
        akox a = dleVar.a.a();
        dle.a(a, 1);
        dle.a(dleVar.b.a(), 2);
        cqat a2 = dleVar.c.a();
        dle.a(a2, 3);
        dehq a3 = dleVar.d.a();
        dle.a(a3, 4);
        dle.a(fdVar, 5);
        dle.a(cztVar, 6);
        dle.a(czhVar, 7);
        dle.a(dhlxVar2, 8);
        dld dldVar = new dld(a, a2, a3, fdVar, cztVar, czhVar, dhlxVar2, z);
        this.f = false;
        this.b = false;
        this.c = null;
        this.d = f;
        this.e = btrmVar;
        this.a = dldVar;
    }

    @Override // defpackage.arka
    public final void a(Bundle bundle) {
    }

    @Override // defpackage.arka
    public final void b() {
        this.d.l();
        boolean z = false;
        this.d.j(alfa.SHOW_NONE, false);
        dld dldVar = this.a;
        if (dldVar.n == null) {
            z = true;
        }
        dbsk.l(z);
        dldVar.n = dldVar.e.a(dldVar.c, czs.NONE);
        dldVar.n.a().c(dldVar.u);
        dldVar.d.aj().aC().i(dld.a);
        dldVar.v = true;
        btrm btrmVar = this.e;
        dceq a = dcet.a();
        a.b(bvkb.class, new arkv(bvkb.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a.a());
        this.f = true;
    }

    @Override // defpackage.arka
    public final void c() {
        this.e.a(this);
        dld dldVar = this.a;
        czv czvVar = dldVar.n;
        dbsk.s(czvVar);
        czvVar.a().d(dldVar.u);
        czvVar.c();
        dldVar.n = null;
        dldVar.d.aj().aC().j(dld.a);
        dldVar.v = false;
        dldVar.w = false;
        dldVar.x = false;
        this.f = false;
    }

    @Override // defpackage.arka
    public final void d(Bundle bundle) {
    }

    @Override // defpackage.arka
    public final void e(Configuration configuration) {
    }

    @Override // defpackage.arka
    public final void f() {
    }

    @Override // defpackage.arka
    public final void g(atlq atlqVar, @dzsi atlq atlqVar2) {
        if (!this.f) {
            return;
        }
        i(atlqVar);
    }

    public final void h(@dzsi dae daeVar) {
        SurfaceTexture b;
        this.a.q = daeVar;
        if (daeVar == null || (b = daeVar.b()) == null) {
            return;
        }
        b.setDefaultBufferSize(1000, 1000);
    }

    public final void i(atlq atlqVar) {
        if (!this.b) {
            return;
        }
        atlq atlqVar2 = this.c;
        cray crayVar = null;
        crqf crqfVar = atlqVar == null ? null : atlqVar.m;
        crqf crqfVar2 = atlqVar2 == null ? null : atlqVar2.m;
        cray g = crqfVar == null ? null : crqfVar.g();
        amuo amuoVar = atlqVar == null ? null : atlqVar.o;
        if (crqfVar == null || g == null) {
            this.d.i();
            return;
        }
        if (crqfVar2 != null) {
            crayVar = crqfVar2.g();
        }
        amub amubVar = g.a;
        boolean z = crayVar == null || crayVar.a != amubVar;
        boolean z2 = atlqVar2 == null || atlqVar2.o != amuoVar;
        if ((!z && !z2) || amuoVar == null) {
            return;
        }
        this.c = atlqVar;
        vut I = vuv.I();
        I.A(crqfVar.f());
        I.H(albo.a);
        I.l(false);
        I.E(false);
        I.F(false);
        I.o(amubVar.ag());
        I.x(false);
        vur vurVar = (vur) I;
        vurVar.a = amuoVar;
        I.v(true);
        I.N(vuu.a);
        I.Q(alfa.SHOW_NONE);
        final dld dldVar = this.a;
        dldVar.getClass();
        vurVar.b = new Runnable(dldVar) { // from class: arkt
            private final dld a;

            {
                this.a = dldVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.w = true;
            }
        };
        this.d.e(I.O());
    }
}
