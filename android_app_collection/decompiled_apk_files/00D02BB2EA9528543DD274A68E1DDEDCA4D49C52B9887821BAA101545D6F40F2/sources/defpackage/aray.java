package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aray  reason: default package */
/* loaded from: classes.dex */
public final class aray {
    private arcr A;
    public final duwy a;
    public final btrm b;
    public final Executor c;
    public final dxio<akfa> d;
    public akox e;
    public Resources f;
    ardc g;
    arde h;
    volatile ardh i;
    @dzsi
    public volatile arci j;
    boolean l;
    boolean m;
    public boolean n;
    private final dkiy u;
    private final btpa v;
    private final bvjj w;
    @dzsi
    private final pnq x;
    @dzsi
    private final pot y;
    private final cqat z;
    public volatile ardz k = ardz.NONE;
    public boolean o = false;
    public boolean p = false;
    @dzsi
    public volatile String q = null;
    public volatile boolean r = false;
    boolean s = false;
    private int B = -1;
    pnv t = pnv.a;

    public aray(duwy duwyVar, dkiy dkiyVar, btrm btrmVar, btpa btpaVar, bvjj bvjjVar, pnq pnqVar, pot potVar, Executor executor, cqat cqatVar, dxio dxioVar) {
        this.a = duwyVar;
        this.u = dkiyVar;
        this.b = btrmVar;
        this.v = btpaVar;
        this.w = bvjjVar;
        this.x = pnqVar;
        this.y = potVar;
        this.c = executor;
        this.z = cqatVar;
        this.d = dxioVar;
    }

    public final boolean a(ardy ardyVar) {
        arde ardeVar = this.h;
        if (ardeVar == null) {
            if (this.g == null) {
                this.g = new ardc(this.f, this.e.aj().aj());
            }
            if (this.A == null) {
                this.A = new arcr(this.g);
            }
            this.h = new arde(this.a, this.b, this.f, this.A, this.e.w(), this.B, this.v, this.w, ardyVar, this.c);
        } else if (ardyVar.j != ardeVar.e()) {
            arde ardeVar2 = this.h;
            ardeVar2.a.a.b(ardeVar2.e, ardyVar.k);
            ardeVar2.a.a.b(ardeVar2.f, ardyVar.n);
            ardeVar2.e.f = ardyVar.l;
            ardeVar2.f.f = ardyVar.o;
            ardeVar2.b.c.b = ardyVar.q;
            synchronized (ardeVar2) {
                ardeVar2.d = ardyVar;
            }
        }
        this.h.b(true);
        if (this.j == this.h) {
            return false;
        }
        if (this.j != null) {
            this.j.b(false);
        }
        this.j = this.h;
        return true;
    }

    public final boolean b() {
        boolean z;
        boolean z2;
        ardz ardzVar = this.k;
        ardz ardzVar2 = ardz.NAVIGATION_CUSTOM_3D_CHEVRON;
        boolean z3 = false;
        boolean z4 = ardzVar == ardzVar2;
        if (this.l != this.e.z()) {
            this.l = this.e.z();
            z = true;
        } else {
            z = false;
        }
        boolean z5 = this.m;
        if (z5 == z4 && z5 == this.r) {
            z2 = false;
        } else {
            if (this.r && ardzVar == ardzVar2) {
                this.m = true;
            } else if (ardzVar != ardzVar2) {
                this.m = false;
            }
            z2 = true;
        }
        if (this.i == null) {
            this.i = c();
        } else if (z2) {
            this.i.f();
            this.i = c();
            if (this.s && this.m) {
                ardh ardhVar = this.i;
                dbsk.s(ardhVar);
                ardhVar.e();
                this.s = false;
            }
        } else if (z) {
            this.i.d(d());
        }
        if (this.j != this.i) {
            z3 = true;
        }
        ardh ardhVar2 = this.i;
        dbsk.s(ardhVar2);
        this.j = ardhVar2;
        this.j.b(true);
        return z3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ardh c() {
        if (this.g == null) {
            this.g = new ardc(this.f, this.e.aj().aj());
        }
        arcv arcvVar = new arcv(d(), this.g);
        if (this.k == ardz.NAVIGATION_CUSTOM_3D_CHEVRON && !this.r && this.w.i(bvjk.jn) && this.w.i(bvjk.jm)) {
            int s = this.w.s(bvjk.jm, 0);
            String str = "";
            String z = this.w.z(bvjk.jn, str);
            pot potVar = this.y;
            if (potVar != null) {
                str = potVar.e(s);
            }
            g(z, s, str, new Runnable(this) { // from class: arat
                private final aray a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    final aray arayVar = this.a;
                    arayVar.r = true;
                    arayVar.c.execute(new Runnable(arayVar) { // from class: arau
                        private final aray a;

                        {
                            this.a = arayVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            aray arayVar2 = this.a;
                            if (arayVar2.e != null && arayVar2.f != null) {
                                arayVar2.b();
                            }
                            arayVar2.b.b(new arbt());
                        }
                    });
                }
            });
        }
        return new ardh(this.f, arcvVar, this.n, this.q, this.o, this.k == ardz.NAVIGATION_CUSTOM_3D_CHEVRON ? this.t : pnv.a, this.z, this.b, this.u, this.c);
    }

    public final void e(int i) {
        arde ardeVar = this.h;
        if (ardeVar != null) {
            ardeVar.b.c.d = i;
        }
        this.B = i;
    }

    public final void f() {
        if (this.e == null) {
            return;
        }
        if (this.t.a().h()) {
            this.e.aj().aF().k().b(this.t.a());
            this.t = pnv.a;
        }
        this.r = false;
        this.m = false;
        pnq pnqVar = this.x;
        if (pnqVar == null) {
            return;
        }
        pnqVar.t();
    }

    public final void g(String str, int i, String str2, @dzsi Runnable runnable) {
        pnq pnqVar = this.x;
        if (pnqVar == null) {
            return;
        }
        if (this.t.a().h()) {
            pns b = this.t.b();
            if (b.a().equals(dbsg.i(str)) && b.c() == i) {
                if (runnable == null) {
                    return;
                }
                runnable.run();
                return;
            }
            f();
        }
        deha.q(pnqVar.d(str, this.e.aj().aF().k(), i, str2), new arax(this, runnable), this.c);
    }

    public final arcw d() {
        arcw arcwVar = this.l ? arcw.p : arcw.o;
        if (this.e.r.b()) {
            arcw arcwVar2 = new arcw(arcwVar);
            arcwVar2.e = R.dimen.text_size_medium;
            return arcwVar2;
        }
        return arcwVar;
    }
}
