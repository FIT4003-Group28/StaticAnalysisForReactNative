package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: vsk  reason: default package */
/* loaded from: classes7.dex */
public final class vsk implements qbo, alsp, akvy, btph {
    public final akox a;
    public final hwe b;
    @dzsi
    public final dxio<axxl> c;
    public final btrm d;
    public final Object e;
    @dzsi
    public vtf f;
    public final List<hwb> g;
    public boolean h;
    public boolean i;
    @dzsi
    public akrs j;
    @dzsi
    public vtw k;
    @dzsi
    public vue l;
    final vsy m;
    private final Resources n;
    private final vtb o;
    private final vrw p;
    private final aufc q;
    private final Executor r;
    private final crzp<aufb> s;

    public vsk(Resources resources, akox akoxVar, hwe hweVar, @dzsi dxio<axxl> dxioVar, dxio<akzh> dxioVar2, vtb vtbVar, gll gllVar, btrm btrmVar, aufc aufcVar, Executor executor) {
        vrw vrwVar = new vrw(akoxVar, hweVar, dxioVar2, gllVar);
        this.e = new Object();
        this.s = new vsh(this);
        this.m = new vsi(this);
        this.a = akoxVar;
        this.b = hweVar;
        this.c = dxioVar;
        this.o = vtbVar;
        this.p = vrwVar;
        this.d = btrmVar;
        this.n = resources;
        this.q = aufcVar;
        this.g = new ArrayList();
        this.r = executor;
    }

    private final void r(boolean z) {
        bvrj.UI_THREAD.c();
        synchronized (this.e) {
            if (!this.a.i()) {
                return;
            }
            dxio<axxl> dxioVar = this.c;
            if (dxioVar != null) {
                dxioVar.a().a(true);
            }
            this.o.d();
            vtw vtwVar = this.k;
            if (vtwVar != null) {
                this.a.R(vtwVar);
                this.a.B(false);
                this.a.C(false);
            }
            vue vueVar = this.l;
            if (vueVar != null) {
                this.a.R(vueVar);
            }
            this.b.g(this.g);
            this.g.clear();
            if (z) {
                this.b.c();
            }
            this.k = null;
            this.l = null;
            this.j = null;
            eapd.a();
        }
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        throw null;
    }

    @Override // defpackage.alsp
    public final void a() {
        p();
    }

    @Override // defpackage.alsp
    public final void b() {
        p();
    }

    @Override // defpackage.alsp
    public final void c() {
    }

    @Override // defpackage.alsp
    public final void d() {
        p();
    }

    @Override // defpackage.qbo
    public final void e(vuv vuvVar) {
        synchronized (this.e) {
            this.h = false;
        }
        this.o.c(vuvVar, this.m);
        eapd.a();
    }

    @Override // defpackage.qbo
    public final void f() {
        synchronized (this.e) {
            o(this.j, true);
        }
    }

    @Override // defpackage.qbo
    public final void g() {
        bvrj.UI_THREAD.c();
        vrw vrwVar = this.p;
        alad p = vrwVar.b.a().p();
        if (p == null || p.m == 0.0f) {
            return;
        }
        alaa b = alad.b(p);
        b.e = 0.0f;
        vrwVar.b(akyt.e(b.a()));
    }

    @Override // defpackage.qbo
    public final void h() {
        r(true);
    }

    @Override // defpackage.qbo
    public final void i() {
        r(false);
    }

    @Override // defpackage.qbo
    public final void j(alfa alfaVar, boolean z) {
        bvrj.UI_THREAD.c();
        vtw vtwVar = this.k;
        if (vtwVar != null) {
            vtwVar.a(alfaVar, z);
        }
        vue vueVar = this.l;
        if (vueVar != null) {
            vueVar.b(z);
        }
    }

    @Override // defpackage.qbo
    public final void k(amvh amvhVar) {
        vsj vsjVar = new vsj(this, amvhVar);
        synchronized (this.e) {
            vtf vtfVar = this.f;
            if (vtfVar != null) {
                vtfVar.a(amvhVar, vsjVar, this.i);
            }
        }
    }

    @Override // defpackage.qbo
    public final boolean l() {
        synchronized (this.e) {
            vtf vtfVar = this.f;
            if (vtfVar != null) {
                return vtfVar.b();
            }
            return false;
        }
    }

    public final void m() {
        this.q.i().a(this.s, dege.a);
        this.a.s.a(this);
        synchronized (this.e) {
            this.f = new vtf(this.a.aj(), this.n);
        }
        this.a.aj().aE().k(this);
        this.o.a();
    }

    public final void n() {
        this.q.i().c(this.s);
        this.a.s.b(this);
        synchronized (this.e) {
            vtf vtfVar = this.f;
            if (vtfVar != null) {
                vtfVar.d();
                this.f = null;
            }
        }
        this.a.aj().aE().l(this);
        this.o.b();
    }

    public final void o(@dzsi akrs akrsVar, boolean z) {
        akrs akrsVar2 = akrsVar;
        bvrj.UI_THREAD.c();
        synchronized (this.e) {
            this.h = true;
        }
        if (akrsVar2 != null) {
            vrw vrwVar = this.p;
            bvrj.UI_THREAD.c();
            if (!vrwVar.c.h()) {
                return;
            }
            hwe hweVar = vrwVar.a;
            Rect rect = new Rect();
            hweVar.k(null, rect);
            int height = rect.height();
            Rect[] c = vrwVar.c.c();
            akra f = akra.f(vrwVar.a.f());
            if (z && f != null) {
                int length = c.length;
                int i = 0;
                while (i < length) {
                    Rect rect2 = c[i];
                    double width = rect2.width();
                    double height2 = rect2.height();
                    double d = akrsVar2.b;
                    int i2 = length;
                    double d2 = akrsVar2.c;
                    akra akraVar = new akra();
                    akrsVar2.a(akraVar);
                    akra E = f.E(akraVar);
                    akra akraVar2 = f;
                    Rect[] rectArr = c;
                    E.Y(Math.toRadians(akrsVar2.d));
                    double d3 = E.b;
                    Double.isNaN(d2);
                    Double.isNaN(d3);
                    double d4 = d3 + (d2 / 2.0d);
                    vrw vrwVar2 = vrwVar;
                    double d5 = height;
                    Double.isNaN(height2);
                    Double.isNaN(d5);
                    int i3 = i;
                    double max = Math.max((double) dcyn.a, (height2 - d5) / d4);
                    Double.isNaN(d2);
                    if (d2 * max >= height2) {
                        Double.isNaN(height2);
                        Double.isNaN(d2);
                        max = height2 / d2;
                    }
                    Double.isNaN(width);
                    Double.isNaN(d);
                    double d6 = width / d;
                    Double.isNaN(d);
                    if (d * max > width) {
                        max = d6;
                    }
                    Double.isNaN(d2);
                    Double.isNaN(d5);
                    rect2.top += (int) Math.round(Math.max((double) dcyn.a, ((d4 - d2) * max) + d5));
                    i = i3 + 1;
                    akrsVar2 = akrsVar;
                    length = i2;
                    f = akraVar2;
                    c = rectArr;
                    vrwVar = vrwVar2;
                }
            }
            vrw vrwVar3 = vrwVar;
            ArrayList b = dchl.b(c);
            double d7 = akrsVar.b;
            double d8 = akrsVar.c;
            Double.isNaN(d7);
            Double.isNaN(d8);
            Rect rect3 = (Rect) dcln.a.g(new vth(d7 / d8)).m(b);
            if (vrwVar3.a(new vuw(rect3.left, vrwVar3.b.a().y() - rect3.right, rect3.top, vrwVar3.b.a().z() - rect3.bottom), akrsVar)) {
                return;
            }
            vrwVar3.a(new vuw(0, 0, 0, 0), akrsVar);
        }
    }

    public final void p() {
        vuv vuvVar;
        synchronized (this.e) {
            this.h = false;
        }
        vtb vtbVar = this.o;
        vsy vsyVar = this.m;
        synchronized (vtbVar.z) {
            vuvVar = vtbVar.z.a;
        }
        if (vuvVar != null) {
            vut F = vuvVar.F();
            F.C();
            F.D(false);
            vtbVar.e(F.O(), true, vsyVar);
        }
        eapd.a();
    }

    @Override // defpackage.akvy
    public final void q(dmyo dmyoVar) {
        this.r.execute(new Runnable(this) { // from class: vsg
            private final vsk a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.p();
            }
        });
    }
}
