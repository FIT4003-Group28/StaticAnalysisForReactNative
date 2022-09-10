package defpackage;

import android.app.Application;
import android.util.DisplayMetrics;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: awux  reason: default package */
/* loaded from: classes.dex */
public final class awux {
    public final akpe a;
    public final dxio<akox> b;
    public final dxio<ahjq> c;
    public final dehq d;
    public final dxio<acys> e;
    public final dxio<ahth> f;
    public final dxio<bvpz> g;
    public volatile boolean h;
    @dzsi
    public volatile awuw j;
    @dzsi
    public alad k;
    @dzsi
    public awuv m;
    @dzsi
    public Runnable n;
    private final Application o;
    @dzsi
    private dhjx p;
    @dzsi
    private alad q;
    public volatile boolean i = false;
    public volatile boolean l = false;

    public awux(Application application, eeu eeuVar, akpe akpeVar, dxio<ahth> dxioVar, dxio<akox> dxioVar2, dxio<ahjq> dxioVar3, dehq dehqVar, dxio<acys> dxioVar4, dxio<bvpz> dxioVar5) {
        this.o = application;
        this.a = akpeVar;
        this.b = dxioVar2;
        this.c = dxioVar3;
        this.d = dehqVar;
        this.e = dxioVar4;
        this.f = dxioVar;
        this.g = dxioVar5;
        this.h = ((efh) eeuVar).f;
    }

    @dzsi
    private static dhjx g(@dzsi dhjx dhjxVar) {
        if (dhjxVar != null) {
            dhkd dhkdVar = dhjxVar.d;
            if (dhkdVar == null) {
                dhkdVar = dhkd.d;
            }
            if (dhkdVar.b <= 0) {
                return null;
            }
            dhkd dhkdVar2 = dhjxVar.d;
            if (dhkdVar2 == null) {
                dhkdVar2 = dhkd.d;
            }
            if (dhkdVar2.c <= 0) {
                return null;
            }
            return dhjxVar;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(Runnable runnable) {
        this.i = true;
        this.n = runnable;
        bvqj.c(this.b.a().k, new bvqg(this) { // from class: awuq
            private final awux a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                awux awuxVar = this.a;
                akoq akoqVar = (akoq) obj;
                if (!awuxVar.i) {
                    return;
                }
                awuv awuvVar = new awuv(awuxVar, awuxVar.b.a().l().p());
                awuxVar.b.a().j().k(awuvVar);
                awuxVar.m = awuvVar;
            }
        }, dege.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b() {
        awuv awuvVar = this.m;
        if (awuvVar != null) {
            this.b.a().j().l(awuvVar);
        }
        this.m = null;
        this.k = null;
        this.p = null;
        this.q = null;
        this.l = false;
        this.i = false;
        this.n = null;
    }

    public final synchronized alad c(GmmLocation gmmLocation) {
        alaa a;
        akpe akpeVar = this.a;
        a = alad.a();
        akpeVar.f(a, gmmLocation.B());
        return a.a();
    }

    public final void d() {
        bvqj.c(this.b.a().k, new bvqg(this) { // from class: awut
            private final awux a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                awux awuxVar = this.a;
                akoq akoqVar = (akoq) obj;
                if (awuxVar.j == null) {
                    return;
                }
                dbsz<dhjx> dbszVar = awuxVar.j.b;
                awuxVar.j = null;
                awuxVar.e(awuxVar.f(awuxVar.b.a().l().p()), dbszVar);
                awuxVar.h = false;
            }
        }, dege.a);
    }

    public final void e(alad aladVar, dbsz<dhjx> dbszVar) {
        dhjx g;
        synchronized (this) {
            if (!aladVar.equals(this.q) || g(this.p) == null) {
                alaa b = alad.b(aladVar);
                b.d = 0.0f;
                b.e = 0.0f;
                alad a = b.a();
                DisplayMetrics displayMetrics = this.o.getResources().getDisplayMetrics();
                this.p = alad.d(a, displayMetrics.density, 30.0f, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            if (!this.l) {
                this.e.a().g();
            }
            this.q = aladVar;
            g = g(this.p);
        }
        if (g != null) {
            this.l = true;
            dbszVar.NU(g);
        }
    }

    public final alad f(alad aladVar) {
        alaa b = alad.b(aladVar);
        this.b.a().o(b);
        return b.a();
    }
}
