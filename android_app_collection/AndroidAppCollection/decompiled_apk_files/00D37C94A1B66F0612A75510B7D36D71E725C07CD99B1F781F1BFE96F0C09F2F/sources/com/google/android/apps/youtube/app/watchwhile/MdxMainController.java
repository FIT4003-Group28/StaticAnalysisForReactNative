package com.google.android.apps.youtube.app.watchwhile;

import android.app.Activity;
import android.os.Handler;
import com.google.android.apps.youtube.app.watchwhile.MdxMainController;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class MdxMainController implements f {
    public final axnm a;
    public final axnm b;
    public final axnm c;
    public final axnm d;
    public final axnm e;
    public final axnm f;
    public final axnm g;
    public final axnm h;
    public final axnm i;
    public final axnm j;
    public final axnm k;
    private final yni l;
    private final Handler m;
    private final azqb n;
    private final axnm o;
    private final axnm p;
    private final axnm q;
    private final azqb r;
    private final axnm s;
    private azqb t;
    private final List u = new ArrayList();

    public MdxMainController(yni yniVar, axnm axnmVar, axnm axnmVar2, Handler handler, axnm axnmVar3, axnm axnmVar4, axnm axnmVar5, axnm axnmVar6, axnm axnmVar7, azqb azqbVar, axnm axnmVar8, axnm axnmVar9, axnm axnmVar10, axnm axnmVar11, axnm axnmVar12, axnm axnmVar13, axnm axnmVar14, axnm axnmVar15, azqb azqbVar2) {
        this.l = yniVar;
        this.a = axnmVar;
        this.b = axnmVar2;
        this.m = handler;
        this.c = axnmVar3;
        this.d = axnmVar4;
        this.e = axnmVar5;
        this.f = axnmVar6;
        this.g = axnmVar7;
        this.n = azqbVar;
        this.h = axnmVar8;
        this.i = axnmVar9;
        this.j = axnmVar10;
        this.k = axnmVar11;
        this.o = axnmVar12;
        this.p = axnmVar13;
        this.s = axnmVar14;
        this.q = axnmVar15;
        this.r = azqbVar2;
    }

    private final ivn g(admj admjVar, adij adijVar, azqb azqbVar, adma admaVar) {
        ivn ivnVar = new ivn(admjVar, adijVar, (Activity) this.q.get(), (emo) this.p.get(), azqbVar, admaVar, this.n);
        ((admc) this.g.get()).a(ivnVar);
        return ivnVar;
    }

    private final void h(admj admjVar, adij adijVar, adma admaVar) {
        ((admc) this.g.get()).a(new ivk(admjVar, (fpf) this.e.get(), adijVar, (fpg) this.f.get(), this.m, admaVar));
    }

    private final void i(admj admjVar, adij adijVar, azqb azqbVar, adma admaVar) {
        ((admc) this.g.get()).a(new ivq(admjVar, adijVar, (ems) this.q.get(), azqbVar, admaVar, (akfo) this.h.get()));
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void lc(apy apyVar) {
        ((frw) this.o.get()).a((fry) this.c.get());
        ((adft) this.b.get()).d((acth) this.s.get(), acuo.a(6827), acuo.a(3832));
        this.t = new azqb() { // from class: ogm
            @Override // defpackage.azqb
            public final Object get() {
                return ((iwa) MdxMainController.this.c.get()).b();
            }
        };
    }

    @Override // defpackage.f, defpackage.g
    public final void ld(apy apyVar) {
        ((admc) this.g.get()).d();
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        ((adjj) this.j.get()).g();
        ((admc) this.g.get()).c();
        ((admc) this.g.get()).d();
        ((adgc) this.a.get()).O();
        this.l.m(this.e.get());
        ((adft) this.b.get()).h();
        ((iwb) this.d.get()).b();
        ((admc) this.g.get()).a.b();
        if (ggs.i()) {
            ((admc) this.g.get()).a.c();
        }
        for (Object obj : this.u) {
            this.l.m(obj);
        }
        this.u.clear();
        ((adnd) this.k.get()).a((dt) this.q.get());
    }

    @Override // defpackage.g
    public final void nv(apy apyVar) {
        axnm axnmVar;
        if (ggs.i() || (axnmVar = this.g) == null) {
            return;
        }
        ((admc) axnmVar.get()).a.c();
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        azqb azqbVar;
        ((adgc) this.a.get()).N();
        ((adft) this.b.get()).g();
        ((iwb) this.d.get()).a();
        this.l.g(this.e.get());
        ((admc) this.g.get()).a.a();
        adma admaVar = new adma((acth) this.s.get());
        adij[] values = adij.values();
        int length = values.length;
        for (int i = 0; i < length; i++) {
            adij adijVar = values[i];
            if (adijVar == adij.BROWSE) {
                azqbVar = this.t;
            } else {
                azqbVar = adijVar == adij.WATCH ? this.r : null;
            }
            if (azqbVar != null) {
                i(admj.CAST_TOOLTIP, adijVar, azqbVar, admaVar);
                i(admj.CAST_TOOLTIP_REPRESSED, adijVar, azqbVar, admaVar);
                h(admj.CAST_CLING, adijVar, admaVar);
                h(admj.CAST_CLING_REPRESSED, adijVar, admaVar);
                this.u.add(g(admj.CAST_SNACKBAR, adijVar, azqbVar, admaVar));
                this.u.add(g(admj.CAST_SNACKBAR_REPRESSED, adijVar, azqbVar, admaVar));
            }
        }
        for (Object obj : this.u) {
            this.l.g(obj);
        }
        ((admc) this.g.get()).b();
        ((acxv) this.i.get()).a();
        ((adjj) this.j.get()).f();
        ((adnd) this.k.get()).c = (dt) this.q.get();
    }
}
