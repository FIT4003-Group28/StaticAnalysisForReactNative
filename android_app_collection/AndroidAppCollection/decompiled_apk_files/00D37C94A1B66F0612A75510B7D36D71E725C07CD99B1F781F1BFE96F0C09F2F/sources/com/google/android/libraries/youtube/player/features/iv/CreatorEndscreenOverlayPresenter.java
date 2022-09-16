package com.google.android.libraries.youtube.player.features.iv;

import android.content.Context;
import android.os.Handler;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class CreatorEndscreenOverlayPresenter implements View.OnLayoutChangeListener, f, ahuy, ahvl, ahuk, ahuh {
    private final ahvh A;
    private boolean B;
    private boolean C;
    private ahur D;
    private ajbg E;
    public final Context a;
    public final ajmy b;
    public final airr c;
    public final acwm d;
    public final Set e;
    public final Handler f;
    public final ahum g;
    public boolean i;
    public boolean j;
    public boolean k;
    public ahvm l;
    public ajbf m;
    public aqve p;
    public Vibrator q;
    public final ahuv r;
    public final ahut s;
    public final yzm t;
    public final kbv u;
    public jzq v;
    private final aafo w;
    private final ahzf x;
    private final ViewGroup y;
    private final acti z;
    public final List h = new ArrayList(6);
    public String n = "";
    public String o = "";
    private final Runnable F = new ahup(this, 1);

    public CreatorEndscreenOverlayPresenter(Context context, ahum ahumVar, jzq jzqVar, ajmy ajmyVar, aafo aafoVar, ahzf ahzfVar, ViewGroup viewGroup, kbv kbvVar, airr airrVar, afwu afwuVar, afzo afzoVar, acti actiVar, yzm yzmVar) {
        this.a = context;
        this.v = jzqVar;
        ajmyVar.getClass();
        this.b = ajmyVar;
        aafoVar.getClass();
        this.w = aafoVar;
        ahzfVar.getClass();
        this.x = ahzfVar;
        viewGroup.getClass();
        this.y = viewGroup;
        this.u = kbvVar;
        this.c = airrVar;
        this.d = new acwm(afwuVar, afzoVar, "iv");
        this.z = actiVar;
        ahumVar.getClass();
        this.g = ahumVar;
        ahumVar.a = this;
        ahumVar.addOnLayoutChangeListener(this);
        this.f = new Handler(context.getMainLooper());
        this.A = new ahvh(context, this);
        yzmVar.getClass();
        this.t = yzmVar;
        this.e = Collections.newSetFromMap(new WeakHashMap());
        afzoVar.e(new ahun(this));
        this.r = new ahuv(this);
        this.s = new ahut(this);
    }

    public static void j(Animation animation, Animation.AnimationListener animationListener) {
        animation.setAnimationListener(null);
        animation.cancel();
        animation.setAnimationListener(animationListener);
    }

    private final void v() {
        ahvm ahvmVar = this.l;
        if (ahvmVar == null) {
            return;
        }
        ahvmVar.a(true);
        zdg.d(this.y.getRootView());
    }

    private final void w(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        this.z.u(new acte(bArr), null);
    }

    private final void x() {
        if (t()) {
            this.f.post(this.F);
        }
    }

    @Override // defpackage.ahuh
    public final void g(boolean z) {
        this.g.e(z);
    }

    @Override // defpackage.ahuh
    public final void h(boolean z) {
        if (this.B == z) {
            return;
        }
        this.B = z;
        s();
    }

    @Override // defpackage.ahuk
    public final void i(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            if (this.c.d()) {
                this.c.a();
            } else {
                this.c.b();
            }
        }
    }

    @Override // defpackage.ahuy
    public final void k(ahuz ahuzVar) {
        ahuzVar.c().clearAnimation();
        ahuzVar.c().startAnimation(ahuzVar.i);
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    public final void l(boolean z) {
        for (ahus ahusVar : this.e) {
            ahusVar.a(z);
        }
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void ld(apy apyVar) {
        q();
    }

    @Override // defpackage.ahvl
    public final void m() {
        this.d.a(this.l.c.b.x);
        v();
        if (this.C) {
            this.c.b();
            this.x.nf();
        }
    }

    @Override // defpackage.ahvl
    public final void n(ahuz ahuzVar) {
        aqvc aqvcVar = ahuzVar.b;
        if ((aqvcVar.b & 524288) != 0) {
            aafo aafoVar = this.w;
            apzg apzgVar = aqvcVar.t;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, null);
            v();
        }
    }

    @Override // defpackage.g
    public final /* synthetic */ void nA(apy apyVar) {
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void nz(apy apyVar) {
    }

    @Override // defpackage.ahuy
    public final void o(ahuz ahuzVar) {
        if (ahuzVar.i()) {
            this.C = this.c.d();
            this.c.M();
            this.d.a(ahuzVar.b.w);
            if (this.l == null) {
                this.l = new ahvm(this.a, this, this.y);
            }
            ahvm ahvmVar = this.l;
            ahvmVar.c = ahuzVar;
            ahvmVar.b.k.setVisibility(8);
            ahvmVar.b.l.setVisibility(8);
            ahvmVar.b.j.setVisibility(8);
            ahvmVar.b.h.setVisibility(8);
            ahvmVar.b.h.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
            ahvmVar.b.g.setVisibility(8);
            ahvmVar.b.m.setVisibility(8);
            ahuzVar.g(ahvmVar.b);
            if (ahvmVar.b.a.getParent() == null) {
                ahvmVar.b.a.clearAnimation();
                ahvmVar.e.reset();
                ahvmVar.a.addView(ahvmVar.b.a);
                ahvmVar.b.a.startAnimation(ahvmVar.d);
            }
            ahvmVar.c();
            this.f.post(new ahup(this));
            return;
        }
        n(ahuzVar);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.i) {
            if (i == i5 && i3 == i7 && i2 == i6 && i4 == i8) {
                return;
            }
            x();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0144 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(defpackage.ajbf r10, com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r11) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter.p(ajbf, com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel):void");
    }

    public final void q() {
        ajbf ajbfVar = this.m;
        if (ajbfVar != null) {
            ajbk d = ajbfVar.d();
            if (d != null) {
                ahur ahurVar = this.D;
                if (ahurVar != null) {
                    d.i(ahurVar);
                    this.D = null;
                }
                ajbg ajbgVar = this.E;
                if (ajbgVar != null) {
                    d.i(ajbgVar);
                    this.E = null;
                }
                for (ahuz ahuzVar : this.h) {
                    ahuzVar.n();
                }
                d.j(ahuz.class);
            }
            this.m = null;
        }
        ahvm ahvmVar = this.l;
        if (ahvmVar != null) {
            ahvmVar.a(false);
        }
        this.h.clear();
        this.g.d();
        if (this.i) {
            this.i = false;
            s();
            l(false);
        }
    }

    @Override // defpackage.ahuy
    public final void r(ahuz ahuzVar) {
        ahum ahumVar = this.g;
        j(ahuzVar.i, ahuzVar.g);
        if (ahuzVar.c().getParent() == null) {
            ahumVar.addView(ahuzVar.c());
            ahuzVar.c().startAnimation(ahuzVar.h);
        }
        this.d.a(ahuzVar.b.v);
        w(ahuzVar.b.y.I());
    }

    public final boolean t() {
        return !this.u.a().isEmpty();
    }

    @Override // defpackage.ahuy
    public final void u() {
        v();
        if (this.C) {
            this.c.b();
            this.x.nf();
        }
    }

    public final void s() {
        if (!this.i || this.j || this.k || this.B) {
            ahum ahumVar = this.g;
            if (ahumVar.getVisibility() != 0) {
                return;
            }
            if (!ahumVar.c.hasEnded() && ahumVar.c.hasStarted()) {
                return;
            }
            ahum.a(ahumVar);
            ahumVar.startAnimation(ahumVar.c);
            return;
        }
        ahum ahumVar2 = this.g;
        j(ahumVar2.c, ahumVar2.d);
        ahumVar2.setVisibility(0);
        if (ahumVar2.b.hasEnded() || !ahumVar2.b.hasStarted()) {
            ahumVar2.startAnimation(ahumVar2.b);
        }
        x();
        w(this.p.f.I());
    }
}
