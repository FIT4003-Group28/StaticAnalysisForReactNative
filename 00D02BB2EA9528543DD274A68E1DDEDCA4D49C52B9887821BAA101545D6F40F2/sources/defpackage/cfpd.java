package defpackage;

import android.content.res.Resources;
import android.os.Handler;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cfpd  reason: default package */
/* loaded from: classes4.dex */
public class cfpd implements cfoa {
    @dzsi
    public final Long a;
    public final Boolean b;
    public final Handler c;
    public final Boolean d;
    public final cfnr e;
    public final bvjj f;
    public final dxio<cezv> g;
    public dier h;
    @dzsi
    public dlno i;
    public boolean j;
    private final Runnable k;
    private final cqrx l;
    private final cqrx m;
    private final cfnt n;
    private final cfob o;
    private cfnu p;
    private cqjg q;

    public cfpd(Resources resources, cqhn cqhnVar, cfns cfnsVar, cfof cfofVar, cfod cfodVar, cfpg cfpgVar, bvjj bvjjVar, dxio<cezv> dxioVar, btvo btvoVar, cpv cpvVar, Executor executor, ckcw ckcwVar, cfnq cfnqVar) {
        this(resources, cqhnVar, cfnsVar, cfofVar, cfodVar, cfpgVar, bvjjVar, dxioVar, btvoVar, cpvVar, executor, ckcwVar, cfnqVar, false, new Handler(), null, false, null, null, cfot.a, null, "", null, null, null);
    }

    private static Animation l(float f) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(irf.a);
        return alphaAnimation;
    }

    @Override // defpackage.cfoa
    public Boolean a() {
        return Boolean.valueOf(this.j);
    }

    @Override // defpackage.cfoa
    public cqjg b() {
        return this.q;
    }

    @Override // defpackage.cfoa
    public cfnu c() {
        return this.p;
    }

    @Override // defpackage.cfoa
    public cfnt d() {
        return this.n;
    }

    @Override // defpackage.cfoa
    public cfob e() {
        return this.o;
    }

    @Override // defpackage.cfoa
    public cqrx f() {
        return this.l;
    }

    @Override // defpackage.cfoa
    public cqrx g() {
        return this.m;
    }

    public final void h() {
        this.j = false;
        cqkx.p(this);
        this.k.run();
    }

    public final void i(boolean z) {
        cqjg cqjgVar;
        this.f.S(bvjk.dY, z);
        if (!this.d.booleanValue() || !z) {
            cqjgVar = cfme.a;
        } else {
            cqjgVar = cfma.a;
        }
        j(cqjgVar);
    }

    public final void j(cqjg cqjgVar) {
        this.q = cqjgVar;
        cqkx.p(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(cfof cfofVar, cfnr cfnrVar) {
        dieq dieqVar = this.h.b;
        if (dieqVar == null) {
            dieqVar = dieq.f;
        }
        dieq dieqVar2 = dieqVar;
        dddi j = cfnr.j(this.h);
        Runnable runnable = cfnrVar.a == cfnq.DIRECTIONS ? new Runnable(this) { // from class: cfoz
            private final cfpd a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cfpd cfpdVar = this.a;
                Boolean bool = cfpdVar.d;
                dbsk.s(bool);
                if (bool.booleanValue()) {
                    cfpdVar.i(true);
                } else {
                    cfpdVar.h();
                }
            }
        } : null;
        mw mwVar = new mw(this) { // from class: cfpa
            private final cfpd a;

            {
                this.a = this;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                cfpd cfpdVar = this.a;
                cfpdVar.c.postDelayed(new Runnable(cfpdVar, (dspd) obj) { // from class: cfoy
                    private final cfpd a;
                    private final dspd b;

                    {
                        this.a = cfpdVar;
                        this.b = r2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        final cfpd cfpdVar2 = this.a;
                        dspd dspdVar = this.b;
                        cfpdVar2.e.e(dspdVar, cfpdVar2.h);
                        if (cfpdVar2.a != null) {
                            cfpdVar2.f.Z(bvjk.jC, cfpdVar2.a.longValue());
                        }
                        dlno dlnoVar = cfpdVar2.i;
                        if (dlnoVar != null && !cfnr.i(dlnoVar, cfpdVar2.h, dspdVar).isEmpty()) {
                            dlno dlnoVar2 = cfpdVar2.i;
                            dbsk.s(dlnoVar2);
                            cedo g = cedo.g(dlnoVar2.b);
                            dlno dlnoVar3 = cfpdVar2.i;
                            dbsk.s(dlnoVar3);
                            if (cfpdVar2.g.a().e(dlnoVar3, cfnr.i(cfpdVar2.i, cfpdVar2.h, dspdVar), g)) {
                                cfpdVar2.h();
                                return;
                            }
                        }
                        cfpdVar2.j(cfnl.a);
                        cfpdVar2.c.postDelayed(new Runnable(cfpdVar2) { // from class: cfpb
                            private final cfpd a;

                            {
                                this.a = cfpdVar2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.a.h();
                            }
                        }, 3000L);
                    }
                }, 300L);
            }
        };
        cfos a = cfofVar.a.a();
        cfof.a(a, 1);
        cfoq a2 = cfofVar.b.a();
        cfof.a(a2, 2);
        cfok a3 = cfofVar.c.a();
        cfof.a(a3, 3);
        cfof.a(dieqVar2, 4);
        cfof.a(j, 5);
        cfof.a(mwVar, 7);
        this.p = new cfoe(a, a2, a3, dieqVar2, j, runnable, mwVar);
    }

    public cfpd(Resources resources, cqhn cqhnVar, cfns cfnsVar, final cfof cfofVar, cfod cfodVar, cfpg cfpgVar, bvjj bvjjVar, dxio<cezv> dxioVar, btvo btvoVar, cpv cpvVar, final Executor executor, final ckcw ckcwVar, cfnq cfnqVar, boolean z, Handler handler, @dzsi Long l, boolean z2, @dzsi String str, @dzsi dqvj dqvjVar, Runnable runnable, @dzsi String str2, String str3, @dzsi String str4, @dzsi dpum dpumVar, @dzsi String str5) {
        this.h = dier.d;
        this.j = false;
        this.q = cfme.a;
        this.b = Boolean.valueOf(z);
        this.a = l;
        this.c = handler;
        this.k = runnable;
        cfnr a = cfnsVar.a(cfnqVar, handler);
        this.e = a;
        this.f = bvjjVar;
        this.g = dxioVar;
        Animation l2 = l(1.0f);
        l2.setAnimationListener(new cfpc(this, cpvVar));
        this.l = cqrv.a(l2);
        this.m = cqrv.a(l(0.0f));
        k(cfofVar, a);
        String string = resources.getString(R.string.ARRIVAL_DASHBOARD_SENTIMENT_SURVEY_COLLAPSED);
        Runnable runnable2 = new Runnable(this) { // from class: cfou
            private final cfpd a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.i(false);
            }
        };
        cfod.a(string, 1);
        cfod.a(runnable2, 2);
        cqhn a2 = cfodVar.a.a();
        cfod.a(a2, 3);
        this.n = new cfoc(string, runnable2, a2);
        String string2 = resources.getString(R.string.ARRIVAL_DASHBOARD_SENTIMENT_SURVEY_THANKYOU);
        if (string2 != null) {
            this.o = new cfpf(string2);
            if (z) {
                a.a(str2, str3, str4, dpumVar, str5, l, z2, dqvjVar, str, new bvqg(this, cfofVar, ckcwVar, executor) { // from class: cfov
                    private final cfpd a;
                    private final cfof b;
                    private final ckcw c;
                    private final Executor d;

                    {
                        this.a = this;
                        this.b = cfofVar;
                        this.c = ckcwVar;
                        this.d = executor;
                    }

                    @Override // defpackage.bvqg
                    public final void NU(Object obj) {
                        final cfpd cfpdVar = this.a;
                        cfof cfofVar2 = this.b;
                        ckcw ckcwVar2 = this.c;
                        Executor executor2 = this.d;
                        dier dierVar = (dier) obj;
                        cfnr cfnrVar = cfpdVar.e;
                        if (!cfpdVar.h.equals(dier.d)) {
                            return;
                        }
                        if (cfnrVar.c()) {
                            ckcm ckcmVar = (ckcm) ckcwVar2.a(ckkp.d);
                            dlno dlnoVar = dierVar.c;
                            if (dlnoVar == null) {
                                dlnoVar = dlno.f;
                            }
                            ckcmVar.a(dlnoVar.b.equals(cfnrVar.a.d));
                        }
                        cfpdVar.h = dierVar;
                        cfpdVar.k(cfofVar2, cfnrVar);
                        boolean z3 = false;
                        if (cfpdVar.b.booleanValue() && cfnr.h(cfpdVar.h) && cfpdVar.a != null && cfpdVar.f.w(bvjk.jC, 0L) != cfpdVar.a.longValue()) {
                            z3 = true;
                        }
                        cfpdVar.j = z3;
                        executor2.execute(new Runnable(cfpdVar) { // from class: cfox
                            private final cfpd a;

                            {
                                this.a = cfpdVar;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                cqkx.p(this.a);
                            }
                        });
                    }
                });
                a.d(str2, str3, str4, dpumVar, null, l, z2, dqvjVar, str, new bvqg(this) { // from class: cfow
                    private final cfpd a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.bvqg
                    public final void NU(Object obj) {
                        cfpd cfpdVar = this.a;
                        dlno dlnoVar = ((dier) obj).c;
                        if (dlnoVar == null) {
                            dlnoVar = dlno.f;
                        }
                        cfpdVar.i = dlnoVar;
                    }
                }, false);
            }
            Boolean valueOf = Boolean.valueOf(cfnqVar == cfnq.DIRECTIONS);
            this.d = valueOf;
            if (!valueOf.booleanValue() || !bvjjVar.m(bvjk.dY, false)) {
                return;
            }
            this.q = cfma.a;
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }
}
