package com.google.android.apps.youtube.app.offline.controller;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.slimstatusbar.SlimStatusBar;
import com.google.android.apps.youtube.app.offline.controller.OfflineSlimStatusBarConnectivityController;
import com.google.android.youtube.R;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class OfflineSlimStatusBarConnectivityController implements f, jvc, afvu, ezg, ynl {
    public final yrj a;
    public final jfq b;
    public ViewGroup c;
    public ViewGroup d;
    public SlimStatusBar e;
    public SlimStatusBar f;
    private final ezh g;
    private final airr h;
    private final afvt i;
    private final afvn j;
    private final yni k;
    private final airw l;
    private final LayoutInflater m;
    private boolean n;
    private boolean o;
    private aypg p;
    private final aacz q;

    public OfflineSlimStatusBarConnectivityController(Context context, yrj yrjVar, sdb sdbVar, ezh ezhVar, airr airrVar, jfq jfqVar, afvt afvtVar, afvn afvnVar, yni yniVar, airw airwVar, aacz aaczVar, byte[] bArr) {
        this.a = yrjVar;
        this.g = ezhVar;
        this.h = airrVar;
        this.b = jfqVar;
        this.i = afvtVar;
        this.j = afvnVar;
        this.k = yniVar;
        this.l = airwVar;
        this.q = aaczVar;
        this.m = LayoutInflater.from(context);
        this.o = !sdbVar.a;
        afvtVar.i(this);
    }

    private final ViewGroup p(boolean z) {
        return z ? this.d : this.c;
    }

    public final SlimStatusBar g(boolean z) {
        if (z) {
            if (this.f == null) {
                this.f = (SlimStatusBar) this.m.inflate(R.layout.slim_status_bar, this.d, false);
            }
            return this.f;
        }
        if (this.e == null) {
            this.e = (SlimStatusBar) this.m.inflate(R.layout.slim_status_bar, this.c, false);
        }
        return this.e;
    }

    public final void h(ahia ahiaVar) {
        if (!this.g.g().b() || this.a.o() || ahiaVar.a() != 8) {
            return;
        }
        this.b.k(true);
        jfq jfqVar = this.b;
        if (jfqVar.h != 0) {
            jfqVar.q(true, false, false);
            return;
        }
        jfqVar.k(true);
        jfqVar.m(true, 500L);
    }

    @Override // defpackage.jvc
    public final void i() {
        this.i.j(this);
    }

    @Override // defpackage.afvu
    public final void j() {
        this.b.q(this.g.g().b(), this.a.o(), this.j.c().g());
    }

    @Override // defpackage.afvu
    public final void k() {
        this.b.q(this.g.g().b(), this.a.o(), this.j.c().g());
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                h((ahia) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ahia.class};
    }

    @Override // defpackage.afvu
    public final void l() {
        this.b.q(this.g.g().b(), this.a.o(), this.j.c().g());
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.jvc
    public final void m(boolean z) {
        boolean o = this.a.o();
        boolean b = this.g.g().b();
        boolean z2 = true;
        if (o == this.o) {
            if (z) {
                if (!o) {
                    final jfq jfqVar = this.b;
                    ViewGroup b2 = jfqVar.b(b);
                    final SlimStatusBar c = jfqVar.c(b);
                    if (!jfq.r(b2, c)) {
                        jfqVar.n(false, b);
                    }
                    jfqVar.h();
                    c.post(new Runnable() { // from class: jfl
                        @Override // java.lang.Runnable
                        public final void run() {
                            jfq jfqVar2 = jfq.this;
                            SlimStatusBar slimStatusBar = c;
                            int i = jfqVar2.b;
                            int i2 = jfqVar2.c;
                            AnimatorSet animatorSet = new AnimatorSet();
                            Animator c2 = jfw.c(slimStatusBar, i, i2, 400L);
                            Animator c3 = jfw.c(slimStatusBar, i2, i, 400L);
                            c3.setStartDelay(200L);
                            animatorSet.playSequentially(c2, c3);
                            jfqVar2.i = animatorSet;
                            jfqVar2.i.start();
                        }
                    });
                    return;
                }
            } else if (!o) {
                return;
            }
            if (!this.j.c().g()) {
                return;
            }
            this.b.q(b, true, this.j.c().g());
            return;
        }
        if (o || !this.g.g().b() || !this.h.d()) {
            jfq jfqVar2 = this.b;
            if (b || !this.j.c().g()) {
                z2 = false;
            }
            jfqVar2.q(b, o, z2);
        }
        this.o = o;
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        if (!eog.aq(this.q)) {
            this.k.m(this);
            return;
        }
        aypg aypgVar = this.p;
        if (aypgVar != null) {
            azof.f((AtomicReference) aypgVar);
        }
        this.p = null;
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        if (eog.aq(this.q)) {
            this.p = this.l.G().j.aa(new ayqb() { // from class: jfh
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    OfflineSlimStatusBarConnectivityController.this.h((ahia) obj);
                }
            }, ick.j);
        } else {
            this.k.g(this);
        }
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pa(ezx ezxVar) {
    }

    @Override // defpackage.ezg
    public final void pb(ezx ezxVar, ezx ezxVar2) {
        if (!akzj.f(p(this.n), p(ezxVar2.b()))) {
            jfq jfqVar = this.b;
            boolean z = this.n;
            jfqVar.h = 0;
            if (z) {
                jfqVar.j();
                jfqVar.e.post(jfqVar.p);
            } else {
                jfqVar.i();
                jfqVar.d.post(jfqVar.l);
            }
        }
        this.n = ezxVar2.b();
        if (ezxVar.b() == ezxVar2.b() || ezxVar2.l()) {
            return;
        }
        if (!this.o) {
            jfq jfqVar2 = this.b;
            jfqVar2.h = 2;
            jfqVar2.q(this.n, false, this.j.c().g());
        } else if (!this.j.c().g()) {
        } else {
            this.b.q(this.n, this.a.o(), this.j.c().g());
        }
    }
}
