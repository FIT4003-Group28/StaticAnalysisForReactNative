package com.google.android.apps.youtube.app.search.voice;

import android.animation.LayoutTransition;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.slimstatusbar.SlimStatusBar;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ConnectivitySlimStatusBarController implements f, jvc, afvu {
    private final LayoutInflater a;
    private final afvt b;
    private final afvn c;
    private final yrj d;
    private final yni e;
    private final lbx f;
    private ViewGroup g;
    private SlimStatusBar h;
    private boolean i;

    public ConnectivitySlimStatusBarController(yrj yrjVar, afvt afvtVar, afvn afvnVar, yni yniVar, Context context, lbx lbxVar) {
        this.a = LayoutInflater.from(context);
        this.d = yrjVar;
        this.b = afvtVar;
        this.c = afvnVar;
        this.e = yniVar;
        this.f = lbxVar;
        this.i = yrjVar.o();
        afvtVar.i(this);
    }

    public final void g(ViewGroup viewGroup) {
        if (this.g != null) {
            this.h = null;
        }
        viewGroup.getClass();
        this.g = viewGroup;
        if (this.h == null) {
            this.h = (SlimStatusBar) this.a.inflate(R.layout.slim_status_bar, viewGroup, false);
        }
        lbx lbxVar = this.f;
        SlimStatusBar slimStatusBar = this.h;
        boolean o = this.d.o();
        lbxVar.l = viewGroup;
        lbxVar.m = slimStatusBar;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setStartDelay(1, 0L);
        layoutTransition.setDuration(lbxVar.d);
        layoutTransition.addTransitionListener(new lbw());
        lbxVar.n = layoutTransition;
        if (o) {
            lbxVar.o = 0;
        } else {
            lbxVar.o = 2;
        }
        lbxVar.e = lbxVar.a(true, false);
        lbxVar.f = lbxVar.a(false, false);
        lbxVar.h = lbxVar.a(true, true);
        lbxVar.g = new lbt(lbxVar);
        lbxVar.i = new lbt(lbxVar, 1);
        lbxVar.j = new lbt(lbxVar, 2);
    }

    @Override // defpackage.jvc
    public final void i() {
        this.b.j(this);
    }

    @Override // defpackage.afvu
    public final void j() {
        this.f.f(this.d.o(), this.c.c().g());
    }

    @Override // defpackage.afvu
    public final void k() {
        this.f.f(this.d.o(), this.c.c().g());
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.afvu
    public final void l() {
        this.f.f(this.d.o(), this.c.c().g());
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.jvc
    public final void m(boolean z) {
        boolean o = this.d.o();
        boolean g = this.c.c().g();
        if (o != this.i) {
            this.f.f(o, g);
            this.i = o;
            return;
        }
        if (z) {
            if (!o) {
                lbx lbxVar = this.f;
                if (!lbx.g(lbxVar.l, lbxVar.m)) {
                    lbxVar.c();
                }
                lbxVar.b();
                lbxVar.m.post(new lbt(lbxVar, 3));
                return;
            }
        } else if (!o) {
            return;
        }
        if (!g) {
            return;
        }
        this.f.f(true, true);
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        this.e.m(this);
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        this.e.g(this);
    }
}
