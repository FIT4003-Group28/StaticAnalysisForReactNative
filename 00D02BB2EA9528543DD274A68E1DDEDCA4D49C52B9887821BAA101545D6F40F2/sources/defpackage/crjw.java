package defpackage;

import android.os.Handler;
import android.text.TextUtils;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: crjw  reason: default package */
/* loaded from: classes5.dex */
public final class crjw implements crgy {
    private final crms A;
    private final crmu B;
    private final croa C;
    private final vzg D;
    private final Executor E;
    private final asik F;
    private final ckcw G;
    public final btrm d;
    public final bvjj e;
    public final jzv f;
    public final Handler g;
    public final Runnable h;
    public final crmt i;
    public final crlb j;
    public final cjqy k;
    public final cqat l;
    public final crlg m;
    public final btvo n;
    public final crlm p;
    public final asac q;
    public final crfm r;
    @dzsi
    public final asbg x;
    private final alhv z;
    public static final dcqe a = dcqe.c("crjw");
    static final long b = TimeUnit.SECONDS.toMillis(5);
    private static final dcep<dqvj> y = dcep.D(dqvj.DRIVE, dqvj.TAXICAB, dqvj.TWO_WHEELER);
    public static final dcep<dqvj> c = dcep.C(dqvj.DRIVE, dqvj.TWO_WHEELER);
    public final Object o = new Object();
    public crqe s = new crqe();
    public boolean t = true;
    public boolean u = false;
    public dqvj v = dqvj.DRIVE;
    public int w = 0;
    private final alht H = new crju(this);

    public crjw(btrm btrmVar, bvjj bvjjVar, final crfm crfmVar, Handler handler, jzv jzvVar, cjqy cjqyVar, crlb crlbVar, cqat cqatVar, crlg crlgVar, asbg asbgVar, crms crmsVar, crmt crmtVar, crmu crmuVar, croa croaVar, vzg vzgVar, crlm crlmVar, btvo btvoVar, alhv alhvVar, Executor executor, asik asikVar, ckcw ckcwVar, asac asacVar) {
        dbsk.t(btrmVar, "eventBus");
        this.d = btrmVar;
        this.e = bvjjVar;
        this.z = alhvVar;
        dbsk.t(crfmVar, "navigationServiceController");
        this.r = crfmVar;
        this.h = new Runnable(crfmVar) { // from class: crjs
            private final crfm a;

            {
                this.a = crfmVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                crfm crfmVar2 = this.a;
                dcqe dcqeVar = crjw.a;
                crfmVar2.d(true);
            }
        };
        dbsk.t(handler, "quitNavigationHandler");
        this.g = handler;
        dbsk.t(jzvVar, "projectedModeController");
        this.f = jzvVar;
        dbsk.t(cjqyVar, "userEvent3Reporter");
        this.k = cjqyVar;
        dbsk.t(crlbVar, "promptScheduler");
        this.j = crlbVar;
        dbsk.t(cqatVar, "clock");
        this.l = cqatVar;
        this.A = crmsVar;
        this.i = crmtVar;
        this.B = crmuVar;
        dbsk.t(crlgVar, "trafficIncidentControllerFactory");
        this.m = crlgVar;
        this.x = asbgVar;
        dbsk.t(croaVar, "navigationSessionStats");
        this.C = croaVar;
        dbsk.t(vzgVar, "resumeNavigationNotificationManager");
        this.D = vzgVar;
        dbsk.s(crlmVar);
        this.p = crlmVar;
        dbsk.s(btvoVar);
        this.n = btvoVar;
        this.E = dehx.b(executor);
        dbsk.s(asikVar);
        this.F = asikVar;
        dbsk.s(ckcwVar);
        this.G = ckcwVar;
        this.q = asacVar;
    }

    private final void k(crqr<? extends aryn> crqrVar) {
        akqq S = crqrVar.a.f().S();
        amvg P = amvh.P();
        P.d = S;
        P.b = crqrVar.a.a();
        P.c = crqrVar.a.g();
        P.j = crqrVar.a.a();
        P.k = true;
        amvh a2 = P.a();
        dccx F = dcdc.F();
        F.g(a2);
        if ((crqrVar instanceof crqq) || (crqrVar instanceof crqp)) {
            for (amvh amvhVar : crqrVar.c.a.af()) {
                if (amvhVar.e(a2, 1.0d)) {
                    crqrVar.d = true;
                    this.d.b(new crht(crqrVar));
                    return;
                }
            }
            amub amubVar = crqrVar.c.a;
            for (int max = Math.max(1, amubVar.ai() - 8); max < amubVar.ai(); max++) {
                amvh ah = amubVar.ah(max);
                if (!ah.y) {
                    F.g(ah);
                }
            }
        }
        amub amubVar2 = crqrVar.c.a;
        this.d.b(new crjr(F.f(), new crjv(this, crqrVar), amubVar2.h, amubVar2.J));
    }

    @Override // defpackage.crgy
    public final void a(crgz crgzVar) {
        synchronized (this.o) {
            this.s = new crqe();
            btrm btrmVar = this.d;
            dceq a2 = dcet.a();
            a2.b(crmj.class, new crjx(0, crmj.class, this));
            a2.b(crmk.class, new crjx(1, crmk.class, this));
            a2.b(crmi.class, new crjx(2, crmi.class, this));
            a2.b(crml.class, new crjx(3, crml.class, this));
            a2.b(crly.class, new crjx(4, crly.class, this));
            a2.b(crlx.class, new crjx(5, crlx.class, this));
            a2.b(crlu.class, new crjx(6, crlu.class, this));
            a2.b(cror.class, new crjx(7, cror.class, this));
            a2.b(crmo.class, new crjx(8, crmo.class, this));
            a2.b(aswg.class, new crjx(9, aswg.class, this));
            a2.b(crmp.class, new crjx(10, crmp.class, this));
            a2.b(crmb.class, new crjx(11, crmb.class, this));
            a2.b(crmf.class, new crjx(12, crmf.class, this));
            a2.b(crsf.class, new crjx(13, crsf.class, this));
            a2.b(crmg.class, new crjx(14, crmg.class, this));
            a2.b(crmd.class, new crjx(15, crmd.class, this));
            a2.b(crmc.class, new crjx(16, crmc.class, this));
            a2.b(criq.class, new crjx(17, criq.class, this));
            a2.b(crhk.class, new crjx(18, crhk.class, this));
            a2.b(crhn.class, new crjx(19, crhn.class, this));
            a2.b(alia.class, new crjx(20, alia.class, this));
            a2.b(alho.class, new crjx(21, alho.class, this));
            a2.b(aryn.class, new crjx(22, aryn.class, this));
            a2.b(alap.class, new crjx(23, alap.class, this));
            a2.b(cric.class, new crjx(24, cric.class, this));
            a2.b(crib.class, new crjx(25, crib.class, this));
            a2.b(cria.class, new crjx(26, cria.class, this));
            a2.b(crmm.class, new crjx(27, crmm.class, this));
            a2.b(cris.class, new crjx(28, cris.class, this));
            a2.b(lnq.class, new crjx(29, lnq.class, this));
            a2.b(aswd.class, new crjx(30, aswd.class, this));
            a2.b(aswc.class, new crjx(31, aswc.class, this));
            a2.b(crhj.class, new crjx(32, crhj.class, this));
            a2.b(crhh.class, new crjx(33, crhh.class, this));
            a2.b(crif.class, new crjx(34, crif.class, this));
            a2.b(ahju.class, new crjx(35, ahju.class, this));
            a2.b(ascc.class, new crjx(36, ascc.class, this));
            btrmVar.g(this, a2.a());
            this.z.b(this.H);
            this.D.a();
            this.A.b();
            this.i.d();
            this.B.a.r(bwrj.COMPLETED_NAVIGATION);
            this.v = crgzVar.b;
            crfo crfoVar = crgzVar.c;
            if (crfoVar != null) {
                this.s.e = crfoVar.b;
                if (crfoVar.h) {
                    this.i.c(crfoVar.a(), true);
                }
                crqe crqeVar = this.s;
                crqeVar.k = crfoVar.e;
                crqeVar.h = crfoVar.g;
            }
            this.u = false;
        }
    }

    @Override // defpackage.crgy
    public final void b(boolean z) {
        this.g.removeCallbacks(this.h);
        this.d.a(this);
        this.z.c(this.H);
        synchronized (this.o) {
            if (d()) {
                crqo crqoVar = this.s.m;
                dbsk.s(crqoVar);
                if (crqoVar.b().c() >= 1000.0d) {
                    ddom e = this.C.e();
                    dcdc<akra> d = this.C.d();
                    crmu crmuVar = this.B;
                    croa croaVar = this.C;
                    crmuVar.a(e, d, croaVar.f, croaVar.g, croaVar.h);
                    dqvj c2 = dqvj.c(e.e);
                    if (c2 == null) {
                        c2 = dqvj.DRIVE;
                    }
                    if (c2 == dqvj.DRIVE && this.e.m(bvjk.eQ, true)) {
                        int i = e.t;
                        int i2 = e.o;
                        int s = this.e.s(bvjk.eV, 0);
                        int s2 = this.e.s(bvjk.eW, 0);
                        int s3 = this.e.s(bvjk.eY, 0);
                        this.e.W(bvjk.eV, s + i);
                        this.e.W(bvjk.eW, s2 + i2);
                        this.e.W(bvjk.eY, s3 + this.w);
                        this.e.ao(bvjk.eX);
                    }
                }
            }
        }
        if (this.n.getUgcParameters().ay()) {
            synchronized (this.o) {
                if (!d()) {
                    return;
                }
                crqo crqoVar2 = this.s.m;
                dbsk.s(crqoVar2);
                cray b2 = crqoVar2.b();
                amub amubVar = b2.a;
                if (!this.F.a() && y.contains(amubVar.h)) {
                    if (c()) {
                        return;
                    }
                    GmmLocation gmmLocation = this.s.a;
                    amuo r = amubVar.r();
                    if (b2.j.d() >= 60.0d && (gmmLocation == null || r == null || gmmLocation.E(r.c) >= 250.0f)) {
                        return;
                    }
                    i();
                }
            }
        }
    }

    public final boolean c() {
        boolean z;
        synchronized (this.o) {
            z = this.s.j;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d() {
        boolean z;
        synchronized (this.o) {
            z = this.s.m != null;
        }
        return z;
    }

    public final void e() {
        final crqf b2 = this.s.b();
        this.E.execute(new Runnable(this, b2) { // from class: crjt
            private final crjw a;
            private final crqf b;

            {
                this.a = this;
                this.b = b2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.d.b(new crhp(this.b, null));
            }
        });
    }

    public final void f(crqo crqoVar, GmmLocation gmmLocation) {
        synchronized (this.o) {
            if (!d()) {
                return;
            }
            crqe crqeVar = this.s;
            crqeVar.m = crqoVar;
            crqeVar.a = gmmLocation;
            String d = crqoVar.b() != null ? crqoVar.b().d() : null;
            if (d == null || TextUtils.isEmpty(d)) {
                this.s.a(gmmLocation);
            } else {
                this.s.b = d;
            }
            crlb crlbVar = this.j;
            crqo crqoVar2 = this.s.m;
            dbsk.s(crqoVar2);
            crlbVar.g(crqoVar2.e);
            e();
        }
    }

    public final void g(aryr aryrVar) {
        cjtd cjtdVar = aryrVar.i;
        if (cjtdVar != null) {
            String str = cjtdVar.e;
            if (aryrVar.f && str != null) {
                this.k.p(dvnp.SEARCH, str, null);
            }
        }
        crqo crqoVar = this.s.m;
        dbsk.s(crqoVar);
        crqq crqqVar = new crqq(aryrVar, crqoVar.b());
        k(crqqVar);
        this.j.e(crqqVar);
    }

    public final void h(alap alapVar) {
        arys arysVar = null;
        if (akqi.d(alapVar.g) && !alapVar.g.equals(akqi.a)) {
            arysVar = new arys(alapVar.q, alapVar.r, alapVar.g);
        }
        if (arysVar == null || j()) {
            return;
        }
        alxk alxkVar = alapVar.c;
        int i = alxkVar == null ? 0 : alxkVar.b;
        if (i == 2) {
            return;
        }
        ckco ckcoVar = (ckco) this.G.a(ckhi.aY);
        int i2 = -1;
        if (i != 0) {
            i2 = (-1) + i;
        }
        ckcoVar.a(i2);
        crqo crqoVar = this.s.m;
        dbsk.s(crqoVar);
        crqp crqpVar = new crqp(arysVar, crqoVar.b());
        k(crqpVar);
        this.j.e(crqpVar);
    }

    public final void i() {
        synchronized (this.o) {
            crqo crqoVar = this.s.m;
            dbsk.s(crqoVar);
            amub a2 = crqoVar.a();
            amvh l = a2.l();
            ily ilyVar = new ily();
            ilyVar.I(l);
            this.A.a.o(bwrj.ARRIVED_AT_PLACEMARK, ilyVar.d());
            this.i.c(a2.d(), false);
            ddom e = this.C.e();
            dcdc<akra> d = this.C.d();
            crmu crmuVar = this.B;
            croa croaVar = this.C;
            crmuVar.a(e, d, croaVar.f, croaVar.g, croaVar.h);
        }
    }

    public final boolean j() {
        return this.f.a();
    }
}
