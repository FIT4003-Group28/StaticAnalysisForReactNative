package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: acyn  reason: default package */
/* loaded from: classes.dex */
public final class acyn {
    public final dxio<akox> a;
    public final btrm b;
    public final Executor c;
    public final Executor d;
    private final Activity h;
    private final bvnx i;
    @dzsi
    private acyu l;
    @dzsi
    private glg m;
    private final acyt j = new acym(this);
    private final glf k = new glf(this) { // from class: acyh
        private final acyn a;

        {
            this.a = this;
        }

        @Override // defpackage.glf
        public final void a() {
            this.a.c();
        }
    };
    private int n = 0;
    public boolean e = false;
    public boolean f = false;
    public final akzx g = new akzx(this) { // from class: acyi
        private final acyn a;

        {
            this.a = this;
        }

        @Override // defpackage.akzx
        public final void l(akzs akzsVar) {
            final acyn acynVar = this.a;
            if (!akzsVar.a || !acynVar.f) {
                return;
            }
            acynVar.c.execute(new Runnable(acynVar) { // from class: acyk
                private final acyn a;

                {
                    this.a = acynVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.c();
                }
            });
        }
    };

    public acyn(Activity activity, bvnx bvnxVar, dxio<akox> dxioVar, btrm btrmVar, Executor executor, Executor executor2) {
        this.h = activity;
        this.i = bvnxVar;
        this.a = dxioVar;
        this.b = btrmVar;
        this.c = executor;
        this.d = executor2;
    }

    private final Rect d() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.h.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public final void a(@dzsi acyu acyuVar, int i) {
        if (!this.e) {
            bvoo.f(new IllegalStateException("Cannot begin monitoring while fragment stopped."));
            return;
        }
        this.n = i;
        if (dbsd.a(acyuVar, this.l)) {
            return;
        }
        acyu acyuVar2 = this.l;
        if (acyuVar2 != null) {
            acyuVar2.m(this.j);
        }
        this.l = acyuVar;
        if (acyuVar == null) {
            return;
        }
        acyuVar.l(this.j);
        c();
    }

    public final void b(@dzsi glg glgVar) {
        if (!this.e) {
            bvoo.f(new IllegalStateException("Cannot begin monitoring while fragment stopped."));
        } else if (dbsd.a(glgVar, this.m)) {
        } else {
            glg glgVar2 = this.m;
            if (glgVar2 != null) {
                glgVar2.c(this.k);
            }
            this.m = glgVar;
            if (glgVar == null) {
                return;
            }
            glgVar.b(this.k);
            c();
        }
    }

    public final void c() {
        float f;
        akra akraVar;
        if (this.e) {
            int width = d().width();
            glg glgVar = this.m;
            float f2 = 0.0f;
            if (width <= 0 || glgVar == null) {
                f = 0.0f;
            } else {
                f = (glgVar.a() * (true != bvox.b(this.h) ? 1 : -1)) / width;
            }
            int height = d().height();
            acyu acyuVar = this.l;
            if (height > 0 && acyuVar != null) {
                f2 = (acyuVar.u() - Math.min(this.n, acyuVar.c())) / height;
            }
            alae alaeVar = new alae(f, f2);
            this.b.b(new ardq(alaeVar));
            if (this.a.a().f.a().d().e()) {
                this.f = true;
                return;
            }
            if (this.f) {
                alad n = this.a.a().n();
                alae alaeVar2 = n.n;
                Rect d = d();
                int width2 = d.width();
                float f3 = alaeVar2.b;
                float f4 = alaeVar.b;
                int height2 = d.height();
                float f5 = alaeVar2.c;
                float f6 = alaeVar.c;
                akraVar = new akra();
                akyx.h(this.a.a().l(), n, (width2 * (f3 - f4)) / 2.0f, (height2 * (f5 - f6)) / 2.0f, akraVar);
            } else {
                akraVar = this.a.a().n().j;
            }
            alad n2 = this.a.a().n();
            alaa alaaVar = new alaa(n2);
            alaaVar.f = alaeVar;
            alaaVar.d(akraVar);
            alad a = alaaVar.a();
            if (!n2.equals(a)) {
                akzm akznVar = n2.j.equals(akraVar) ? new akzn(this.i) : new akzm(this.i);
                akznVar.a(n2, a);
                akznVar.p(0L);
                this.a.a().r(akznVar);
            }
            this.f = false;
        }
    }
}
