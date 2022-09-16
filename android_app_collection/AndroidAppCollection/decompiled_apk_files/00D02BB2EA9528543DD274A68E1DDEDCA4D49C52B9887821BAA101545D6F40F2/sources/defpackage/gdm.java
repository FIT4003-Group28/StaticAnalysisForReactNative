package defpackage;

import android.app.Application;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
/* compiled from: PG */
/* renamed from: gdm  reason: default package */
/* loaded from: classes.dex */
public final class gdm implements gdo {
    private final bvsb a;
    private final btmv b;
    private final pez c;
    private final dxio<ahjq> d;
    private final dxio<aeht> e;
    private final awoe f;
    private final dxio<pfk> g;
    private final cjqy h;
    private final auui i;
    private final dxio<bvkx> j;
    private final kuu k;
    private boolean l = false;
    private int m = 0;
    private int n = 0;

    public gdm(bvsb bvsbVar, btmv btmvVar, pez pezVar, dxio<ahjq> dxioVar, dxio<aeht> dxioVar2, awoe awoeVar, dxio<pfk> dxioVar3, cjqy cjqyVar, auui auuiVar, dxio<bvkx> dxioVar4, kuu kuuVar) {
        this.a = bvsbVar;
        this.b = btmvVar;
        this.c = pezVar;
        this.d = dxioVar;
        this.e = dxioVar2;
        this.f = awoeVar;
        this.g = dxioVar3;
        this.h = cjqyVar;
        this.i = auuiVar;
        this.j = dxioVar4;
        this.k = kuuVar;
    }

    private final synchronized void f() {
        cxdy e = bvmo.e("EnvironmentClientManagerImpl::attachCommon()");
        if (this.m + this.n == 0) {
            bvsb bvsbVar = this.a;
            bvsbVar.a.a(bvsbVar.d);
            bvsbVar.c = true;
            btmv btmvVar = this.b;
            if (!btmvVar.h) {
                btmvVar.c.b(ckgx.DEVICE_MAX_HEAP_MEGABYTES, new btmt());
                btmvVar.h = true;
            }
            bvrj.UI_THREAD.c();
            csso cssoVar = btmvVar.b;
            if (cssoVar != null) {
                cssoVar.a(btmvVar.k);
            }
            this.k.a();
            this.h.w();
            this.j.a().j(new Runnable(this) { // from class: gdl
                private final gdm a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    gdm gdmVar = this.a;
                    synchronized (gdmVar) {
                        gdmVar.c();
                    }
                }
            }, bvrj.UI_THREAD, bvkw.ON_STARTUP_FULLY_COMPLETE);
            this.f.c();
        }
        bvmo.f(e);
    }

    private final synchronized void g() {
        if (this.m + this.n == 0) {
            h();
            this.i.c();
            this.k.b();
            this.h.v();
            bvsb bvsbVar = this.a;
            bvsbVar.a.b(bvsbVar.d);
            bvsbVar.c = false;
            btmv btmvVar = this.b;
            bvrj.UI_THREAD.c();
            csso cssoVar = btmvVar.b;
            if (cssoVar != null) {
                cssoVar.b(btmvVar.k);
            }
        }
    }

    private final synchronized void h() {
        if (this.l) {
            this.e.a().g();
            this.l = false;
        }
    }

    @Override // defpackage.gdo
    public final synchronized void a() {
        bvrj.UI_THREAD.c();
        cxdy e = bvmo.e("EnvironmentClientManagerImpl::onattachActivity");
        f();
        if (this.m == 0) {
            pez pezVar = this.c;
            ((pfx) pezVar).h = ((pfx) pezVar).e.a().o();
            ((pfx) pezVar).b();
            ContextDataFilterImpl c = pfx.c(((pfx) pezVar).b.b());
            if (((pfx) pezVar).h != null) {
                Application application = ((pfx) pezVar).a;
                ((pfx) pezVar).g = cmuy.a(application, cmuz.a(application.getPackageName(), ((pfx) pezVar).e.a().m()));
                ((pfx) pezVar).g.b(c, ((pfx) pezVar).j);
            } else {
                ((pfx) pezVar).g = null;
            }
            btrm btrmVar = ((pfx) pezVar).d;
            pfw pfwVar = ((pfx) pezVar).i;
            dceq a = dcet.a();
            a.b(gds.class, new pfy(gds.class, pfwVar));
            btrmVar.g(pfwVar, a.a());
            ((pfx) pezVar).c.a(((pfx) pezVar).f, "ContextDataCache");
            this.g.a().b();
            this.d.a().f();
        }
        this.m++;
        bvmo.f(e);
    }

    @Override // defpackage.gdo
    public final synchronized void b() {
        f();
        this.n++;
    }

    public final synchronized void c() {
        if (this.l || this.m + this.n <= 0) {
            return;
        }
        this.e.a().f();
        this.l = true;
    }

    @Override // defpackage.gdo
    public final synchronized void d() {
        bvrj.UI_THREAD.c();
        this.m--;
        g();
        if (this.m == 0) {
            this.g.a().c();
            this.d.a().g();
            pez pezVar = this.c;
            ((pfx) pezVar).c.d(((pfx) pezVar).f);
            cmva cmvaVar = ((pfx) pezVar).g;
            if (cmvaVar != null) {
                cmvaVar.a(((pfx) pezVar).j);
            }
            ((pfx) pezVar).d.a(((pfx) pezVar).i);
        }
    }

    @Override // defpackage.gdo
    public final synchronized void e() {
        this.n--;
        g();
        if (this.m + this.n == 0) {
            this.f.d();
        }
    }
}
