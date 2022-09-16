package com.google.android.apps.youtube.app.settings;

import android.app.Activity;
import com.google.android.apps.youtube.app.settings.SettingsDataAccess;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class SettingsDataAccess implements f, ynl {
    public final Activity a;
    public final etd b;
    public final fnp c;
    public final acti d;
    public abcn e;
    public final aacz f;
    private final yni g;
    private final abcu h;
    private final akjm i;
    private final Executor j;
    private final azpa k = azpa.ar();
    private final yrj l;
    private final boolean m;

    public SettingsDataAccess(Activity activity, yni yniVar, abcu abcuVar, etd etdVar, aacz aaczVar, fnp fnpVar, akjm akjmVar, Executor executor, yrj yrjVar, acti actiVar) {
        this.a = activity;
        this.g = yniVar;
        this.h = abcuVar;
        this.b = etdVar;
        this.f = aaczVar;
        this.c = fnpVar;
        this.i = akjmVar;
        this.j = executor;
        this.l = yrjVar;
        this.d = actiVar;
        this.m = activity.getIntent().getBooleanExtra("show_offline_items", false);
    }

    public static /* synthetic */ void k(Throwable th) {
        String valueOf = String.valueOf(th.getLocalizedMessage());
        if (valueOf.length() != 0) {
            "Failed to store renderer: ".concat(valueOf);
        }
    }

    private final boolean p() {
        return this.m || !this.l.o();
    }

    public final aypg g(final Runnable runnable) {
        if (this.e == null) {
            try {
                abcn abcnVar = (abcn) this.b.e().c();
                this.e = abcnVar;
                if (abcnVar != null) {
                    l(abcnVar);
                } else {
                    l(new abcn(ascp.a));
                }
            } catch (IOException e) {
                zep.n("Failed to load settings response", e);
            }
        }
        return this.k.ax().n().I().G(aypa.a()).Z(new ayqb() { // from class: lhi
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                abcn abcnVar2 = (abcn) obj;
                runnable.run();
            }
        });
    }

    @Deprecated
    public final List h() {
        if (!n()) {
            return amuk.q();
        }
        return this.e.a();
    }

    public final List i() {
        if (p()) {
            if (!n()) {
                return amuk.q();
            }
            return this.e.b();
        }
        return h();
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i != 0) {
                if (i == 1) {
                    afwb afwbVar = (afwb) obj;
                    m();
                    return null;
                } else if (i == 2) {
                    afwd afwdVar = (afwd) obj;
                    m();
                    return null;
                } else {
                    StringBuilder sb = new StringBuilder(32);
                    sb.append("unsupported op code: ");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
                }
            }
            aabj aabjVar = (aabj) obj;
            ampq f = aabjVar.f();
            ampq e = aabjVar.e();
            if (((Boolean) f.b(lhh.a).e(false)).booleanValue()) {
                Activity activity = this.a;
                arag aragVar = ((atpl) f.c()).c;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
                zag.r(activity, ajgl.b(aragVar), 0);
                return null;
            } else if (!((Boolean) e.b(lhh.b).b(jvb.u).b(jvb.t).e(false)).booleanValue()) {
                return null;
            } else {
                Activity activity2 = this.a;
                arag aragVar2 = ((atoo) e.c()).c;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
                zag.r(activity2, ajgl.b(aragVar2), 0);
                return null;
            }
        }
        return new Class[]{aabj.class, afwb.class, afwd.class};
    }

    public final void l(abcn abcnVar) {
        akjm akjmVar = this.i;
        akjmVar.a.clear();
        akjmVar.b.clear();
        this.k.c(abcnVar);
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void ld(apy apyVar) {
        this.k.sm();
    }

    final void m() {
        if (p()) {
            return;
        }
        abcu abcuVar = this.h;
        ylx.k(abcuVar.d(abcuVar.a(null)), this.j, jou.s, new ylw() { // from class: lhg
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                SettingsDataAccess settingsDataAccess = SettingsDataAccess.this;
                abcn abcnVar = (abcn) obj;
                settingsDataAccess.b.j(abcnVar);
                if (eog.au(settingsDataAccess.f)) {
                    ylx.j(settingsDataAccess.c.a(abcnVar), anjk.a, jou.t);
                }
                if (!abcnVar.equals(settingsDataAccess.e)) {
                    settingsDataAccess.e = abcnVar;
                    settingsDataAccess.d.D(new acte(abcnVar.a.f.I()));
                    settingsDataAccess.l(abcnVar);
                }
            }
        });
    }

    public final boolean n() {
        return this.e != null;
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        this.g.m(this);
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        this.g.g(this);
        m();
    }

    public final aurh o(int i) {
        for (Object obj : i()) {
            if (obj instanceof aurh) {
                aurh aurhVar = (aurh) obj;
                int bh = awwc.bh(aurhVar.e);
                if (bh == 0) {
                    bh = 1;
                }
                if (bh == i) {
                    return aurhVar;
                }
            }
        }
        return null;
    }
}
