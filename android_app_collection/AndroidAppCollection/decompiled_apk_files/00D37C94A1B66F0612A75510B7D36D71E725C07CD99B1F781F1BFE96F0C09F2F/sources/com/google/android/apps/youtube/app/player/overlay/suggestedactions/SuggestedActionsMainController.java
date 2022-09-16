package com.google.android.apps.youtube.app.player.overlay.suggestedactions;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.player.overlay.suggestedactions.SuggestedActionsMainController;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.protos.youtube.api.innertube.SuggestedActionsRendererOuterClass;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class SuggestedActionsMainController implements aiby, f, ahin {
    public final ajrs a;
    public final aypf b;
    public final Set c;
    public final Set d;
    public final knf e;
    public final kob f;
    public final kmt g;
    public final kmy h;
    public final aibz i;
    public final kno j;
    public boolean k;
    public ViewGroup l;
    public avck m;
    public WatchNextResponseModel n;
    public int o;
    public azqb p;
    public String q;
    public aynx r;
    public yye s;
    private final ghd t;
    private final airw u;
    private final aypf v;
    private final Handler w;
    private final azpm x;
    private boolean y;
    private boolean z;

    public SuggestedActionsMainController(knf knfVar, kob kobVar, kmt kmtVar, kmy kmyVar, knp knpVar, acti actiVar, aibz aibzVar, ghd ghdVar, airw airwVar, Handler handler) {
        ajrs ajrsVar = new ajrs();
        this.a = ajrsVar;
        this.i = aibzVar;
        ajrsVar.a(actiVar);
        this.b = new aypf();
        this.c = new HashSet();
        this.d = new HashSet();
        this.e = knfVar;
        this.f = kobVar;
        this.g = kmtVar;
        this.h = kmyVar;
        this.t = ghdVar;
        this.u = airwVar;
        this.w = handler;
        this.v = new aypf();
        this.k = false;
        this.x = azpm.e();
        this.m = null;
        this.n = null;
        this.r = null;
        knv knvVar = new knv(this);
        Context context = (Context) knpVar.a.get();
        context.getClass();
        aafo aafoVar = (aafo) knpVar.b.get();
        aafoVar.getClass();
        ajxz ajxzVar = (ajxz) knpVar.c.get();
        ajxzVar.getClass();
        ajmy ajmyVar = (ajmy) knpVar.d.get();
        ajmyVar.getClass();
        aacz aaczVar = (aacz) knpVar.e.get();
        aaczVar.getClass();
        knx knxVar = (knx) knpVar.f.get();
        knxVar.getClass();
        yve yveVar = (yve) knpVar.g.get();
        yveVar.getClass();
        this.j = new kno(context, aafoVar, ajxzVar, ajmyVar, aaczVar, knxVar, yveVar, knvVar);
    }

    @Override // defpackage.ahin
    public final void a(boolean z) {
        if (this.z == z) {
            return;
        }
        this.z = z;
        o(!z, false);
    }

    public final ViewGroup g() {
        ViewGroup viewGroup = this.l;
        viewGroup.getClass();
        return viewGroup;
    }

    public final ayoi i() {
        return this.x.R();
    }

    public final void j() {
        if (!this.c.isEmpty()) {
            avch avchVar = (avch) this.c.iterator().next();
            l(avchVar);
            this.c.remove(avchVar);
        }
    }

    public final void k(final Runnable runnable) {
        ViewGroup viewGroup = this.l;
        if (viewGroup == null || viewGroup.getChildCount() == 0) {
            if (runnable == null) {
                return;
            }
            runnable.run();
            return;
        }
        o(false, true);
        this.w.postDelayed(new Runnable() { // from class: knu
            @Override // java.lang.Runnable
            public final void run() {
                SuggestedActionsMainController suggestedActionsMainController = SuggestedActionsMainController.this;
                Runnable runnable2 = runnable;
                suggestedActionsMainController.g().removeAllViews();
                suggestedActionsMainController.m();
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        }, this.o);
        g().setTouchDelegate(null);
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    public final void l(final avch avchVar) {
        k(new Runnable() { // from class: knt
            @Override // java.lang.Runnable
            public final void run() {
                final SuggestedActionsMainController suggestedActionsMainController = SuggestedActionsMainController.this;
                avch avchVar2 = avchVar;
                if (suggestedActionsMainController.l == null) {
                    return;
                }
                final View a = suggestedActionsMainController.j.a();
                suggestedActionsMainController.g().addView(a);
                aynx aynxVar = suggestedActionsMainController.r;
                if (aynxVar != null) {
                    final kno knoVar = suggestedActionsMainController.j;
                    asxj asxjVar = knoVar.k.b().e;
                    if (asxjVar == null) {
                        asxjVar = asxj.a;
                    }
                    if (asxjVar.bd) {
                        aypg aypgVar = knoVar.i;
                        if (aypgVar != null) {
                            azof.f((AtomicReference) aypgVar);
                        }
                        knoVar.i = aynxVar.Z(new ayqb() { // from class: knk
                            @Override // defpackage.ayqb
                            public final void a(Object obj) {
                                kno knoVar2 = kno.this;
                                int intValue = ((Integer) obj).intValue();
                                if (intValue == knoVar2.h) {
                                    return;
                                }
                                knoVar2.h = intValue;
                                knoVar2.g(knoVar2.g);
                            }
                        });
                    }
                }
                suggestedActionsMainController.j.oK(suggestedActionsMainController.a, avchVar2);
                ViewGroup viewGroup = suggestedActionsMainController.l;
                if (viewGroup != null) {
                    viewGroup.post(new Runnable() { // from class: kns
                        @Override // java.lang.Runnable
                        public final void run() {
                            SuggestedActionsMainController suggestedActionsMainController2 = SuggestedActionsMainController.this;
                            View view = a;
                            Rect rect = new Rect();
                            float i = zew.i(view.getResources().getDisplayMetrics(), 8);
                            view.getHitRect(rect);
                            rect.top = (int) (rect.top - i);
                            rect.bottom = (int) (rect.bottom + i);
                            suggestedActionsMainController2.g().setTouchDelegate(new TouchDelegate(rect, view));
                        }
                    });
                }
                suggestedActionsMainController.m();
                suggestedActionsMainController.o(true, true);
            }
        });
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    public final void m() {
        azpm azpmVar = this.x;
        ViewGroup viewGroup = this.l;
        boolean z = false;
        if (viewGroup != null && viewGroup.getChildCount() > 0) {
            z = true;
        }
        azpmVar.c(Boolean.valueOf(z));
    }

    public final void n() {
        this.b.c();
        this.c.clear();
        this.d.clear();
        k(null);
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        this.v.c();
    }

    @Override // defpackage.aiby
    public final void nt(int i, long j) {
        boolean z = this.y;
        boolean z2 = i == 1 || i == 2;
        this.y = z2;
        if (z != z2) {
            o(!z2, true);
        }
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        aypf aypfVar = this.v;
        airw airwVar = this.u;
        aypfVar.g(airwVar.ao().I().G(aypa.a()).aa(new ayqb() { // from class: knq
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                aube aubeVar;
                aube aubeVar2;
                avck avckVar;
                knh knhVar;
                SuggestedActionsMainController suggestedActionsMainController = SuggestedActionsMainController.this;
                ahhm ahhmVar = (ahhm) obj;
                if (ahhmVar.a() == null || akzj.f(suggestedActionsMainController.n, ahhmVar.a())) {
                    return;
                }
                WatchNextResponseModel a = ahhmVar.a();
                a.getClass();
                suggestedActionsMainController.n = a;
                suggestedActionsMainController.k(null);
                asgt asgtVar = a.a;
                asgf asgfVar = asgtVar.f;
                if (asgfVar == null) {
                    asgfVar = asgf.a;
                }
                if (asgfVar.b == 78882851) {
                    aubeVar = (aube) asgfVar.c;
                } else {
                    aubeVar = aube.a;
                }
                aunb aunbVar = aubeVar.p;
                if (aunbVar == null) {
                    aunbVar = aunb.a;
                }
                if (!aunbVar.qn(SuggestedActionsRendererOuterClass.suggestedActionsRenderer)) {
                    avckVar = null;
                } else {
                    asgf asgfVar2 = asgtVar.f;
                    if (asgfVar2 == null) {
                        asgfVar2 = asgf.a;
                    }
                    if (asgfVar2.b == 78882851) {
                        aubeVar2 = (aube) asgfVar2.c;
                    } else {
                        aubeVar2 = aube.a;
                    }
                    aunb aunbVar2 = aubeVar2.p;
                    if (aunbVar2 == null) {
                        aunbVar2 = aunb.a;
                    }
                    avckVar = (avck) aunbVar2.qm(SuggestedActionsRendererOuterClass.suggestedActionsRenderer);
                }
                if (avckVar == null || akzj.f(avckVar, suggestedActionsMainController.m)) {
                    return;
                }
                suggestedActionsMainController.m = avckVar;
                aopu<aunb> aopuVar = avckVar.b;
                suggestedActionsMainController.n();
                for (aunb aunbVar3 : aopuVar) {
                    avch avchVar = (avch) aunbVar3.qm(SuggestedActionsRendererOuterClass.suggestedActionRenderer);
                    avcj avcjVar = avchVar.g;
                    if (avcjVar == null) {
                        avcjVar = avcj.a;
                    }
                    if (avcjVar.qn(avce.b)) {
                        knf knfVar = suggestedActionsMainController.e;
                        ezh ezhVar = (ezh) knfVar.a.get();
                        ezhVar.getClass();
                        aizb aizbVar = (aizb) knfVar.b.get();
                        aizbVar.getClass();
                        jvo jvoVar = (jvo) knfVar.c.get();
                        jvoVar.getClass();
                        gca gcaVar = (gca) knfVar.d.get();
                        gcaVar.getClass();
                        fdo fdoVar = (fdo) knfVar.e.get();
                        fdoVar.getClass();
                        kbl kblVar = (kbl) knfVar.f.get();
                        kblVar.getClass();
                        avchVar.getClass();
                        knhVar = new kne(ezhVar, aizbVar, jvoVar, gcaVar, fdoVar, kblVar, avchVar);
                    } else if (avcjVar.qn(avci.b)) {
                        kob kobVar = suggestedActionsMainController.f;
                        yni yniVar = (yni) kobVar.a.get();
                        yniVar.getClass();
                        kbl kblVar2 = (kbl) kobVar.b.get();
                        kblVar2.getClass();
                        avchVar.getClass();
                        knhVar = new koa(yniVar, kblVar2, avchVar);
                    } else if (avcjVar.qn(avcf.b)) {
                        kmt kmtVar = suggestedActionsMainController.g;
                        airw airwVar2 = (airw) kmtVar.a.get();
                        airwVar2.getClass();
                        kbl kblVar3 = (kbl) kmtVar.b.get();
                        kblVar3.getClass();
                        Executor executor = (Executor) kmtVar.c.get();
                        executor.getClass();
                        avchVar.getClass();
                        knhVar = new kms(airwVar2, kblVar3, azpj.b(executor), avchVar);
                    } else if (avcjVar.qn(avcg.b)) {
                        kmy kmyVar = suggestedActionsMainController.h;
                        airw airwVar3 = (airw) kmyVar.a.get();
                        airwVar3.getClass();
                        kbl kblVar4 = (kbl) kmyVar.b.get();
                        kblVar4.getClass();
                        nml nmlVar = (nml) kmyVar.c.get();
                        nmlVar.getClass();
                        ezh ezhVar2 = (ezh) kmyVar.d.get();
                        ezhVar2.getClass();
                        yve yveVar = (yve) kmyVar.e.get();
                        yveVar.getClass();
                        avchVar.getClass();
                        knhVar = new kmx(airwVar3, kblVar4, nmlVar, ezhVar2, yveVar, avchVar);
                    } else {
                        knhVar = null;
                    }
                    if (knhVar != null) {
                        knhVar.c();
                        suggestedActionsMainController.b.d(knhVar.a().aa(new knr(suggestedActionsMainController, 1), kjt.g));
                    }
                }
            }
        }, kjt.g), airwVar.ab().aa(new knr(this), kjt.g));
    }

    public final void o(boolean z, boolean z2) {
        aoob d;
        aoob d2;
        yye yyeVar = this.s;
        if (yyeVar == null || this.l == null) {
            return;
        }
        if (this.k || this.t.isInMultiWindowMode() || this.y || this.z) {
            z = false;
        }
        yyeVar.a(z, z2);
        if (g().getChildCount() == 0) {
            return;
        }
        if (z) {
            kno knoVar = this.j;
            acti actiVar = knoVar.f;
            if (actiVar == null || (d2 = knoVar.d()) == null) {
                return;
            }
            actiVar.u(new acte(d2), null);
            actiVar.u(new acte(actj.SUGGESTED_ACTION_DISMISS_BUTTON), null);
            return;
        }
        kno knoVar2 = this.j;
        acti actiVar2 = knoVar2.f;
        if (actiVar2 == null || (d = knoVar2.d()) == null) {
            return;
        }
        actiVar2.q(new acte(d), null);
        actiVar2.q(new acte(actj.SUGGESTED_ACTION_DISMISS_BUTTON), null);
    }
}
