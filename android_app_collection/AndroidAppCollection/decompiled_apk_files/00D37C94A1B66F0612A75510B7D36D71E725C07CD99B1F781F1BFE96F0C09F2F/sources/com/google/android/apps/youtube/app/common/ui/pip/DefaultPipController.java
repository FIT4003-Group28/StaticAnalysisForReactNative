package com.google.android.apps.youtube.app.common.ui.pip;

import android.app.PictureInPictureParams;
import android.graphics.Rect;
import android.util.Rational;
import android.view.View;
import com.google.android.apps.youtube.app.common.ui.pip.DefaultPipController;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import j$.util.function.Function;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class DefaultPipController implements gdi {
    public static final Rational a = new Rational(16, 9);
    private final azqb A;
    private final azqb B;
    private final aadd C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    public final dt b;
    public final azqb c;
    public final azqb d;
    public final azqb e;
    public final azqb f;
    public final azqb g;
    public final azqb i;
    public final azqb j;
    public final azqb k;
    public View n;
    public adny o;
    public View.OnLayoutChangeListener p;
    public boolean q;
    public boolean r;
    public PlayerResponseModel s;
    public boolean t;
    public boolean u;
    public boolean w;
    public boolean x;
    public final aypf l = new aypf();
    public ezx v = ezx.NONE;
    public Rational y = a;
    public final boolean m = akg.e();
    public final aiza h = new aiza() { // from class: gcp
        @Override // defpackage.aiza
        public final void d(int i, int i2) {
            DefaultPipController defaultPipController = DefaultPipController.this;
            Rational rational = new Rational(i, i2);
            if (rational.floatValue() < 0.5f || rational.floatValue() > 2.35f) {
                rational = DefaultPipController.a;
            }
            if (akzj.f(defaultPipController.y, rational)) {
                return;
            }
            defaultPipController.y = rational;
            defaultPipController.k(new gcr(defaultPipController, 2), new gcr(defaultPipController));
        }
    };
    public final gcs z = new gcs(this);

    public DefaultPipController(dt dtVar, azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, aadd aaddVar) {
        this.b = dtVar;
        this.A = azqbVar;
        this.B = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
        this.e = azqbVar5;
        this.f = azqbVar6;
        this.g = azqbVar7;
        this.i = azqbVar8;
        this.j = azqbVar9;
        this.k = azqbVar10;
        this.C = aaddVar;
    }

    private final void n(ajbf ajbfVar) {
        if (!gdo.d(ajbfVar) || gdo.c(ajbfVar.c())) {
            return;
        }
        if (gdo.d(ajbfVar) && gdo.a(ajbfVar.c())) {
            return;
        }
        ((gdk) this.c.get()).a(ajbfVar, ((airr) this.e.get()).p(), ((airr) this.e.get()).g());
    }

    @Override // defpackage.gdi
    public final ankt g(View view, ezx ezxVar) {
        boolean z = false;
        if (!this.q) {
            return anlz.q(false);
        }
        adnt e = ((adoa) this.i.get()).e();
        if (e == null || e.a() != 1) {
            ajbf n = ((airr) this.e.get()).n();
            gdo gdoVar = (gdo) this.B.get();
            if (gdoVar.a.isInPictureInPictureMode() || gdoVar.a.isChangingConfigurations() || !gdo.d(n) || !gdo.b(n.c(), ((airr) gdoVar.b.get()).d(), ((ezh) gdoVar.c.get()).g())) {
                n(n);
                return anlz.q(false);
            }
            PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
            builder.setAspectRatio(this.y);
            builder.setActions(((gde) this.d.get()).a());
            if (!eog.D(this.C)) {
                Rect rect = new Rect();
                view.getGlobalVisibleRect(rect);
                etk.l(this.y.floatValue(), rect, rect);
                builder.setSourceRectHint(rect);
            } else if (akzj.f(ezxVar, ezx.WATCH_WHILE_MAXIMIZED)) {
                Rect rect2 = new Rect();
                view.getRootView().getGlobalVisibleRect(rect2);
                etk.m(this.y.floatValue(), rect2, rect2);
                builder.setSourceRectHint(rect2);
            }
            ((gdk) this.c.get()).b();
            try {
                z = this.b.enterPictureInPictureMode(builder.build());
            } catch (IllegalStateException e2) {
                afus.c(2, 25, "Error entering picture and picture", e2);
            }
            return anlz.q(Boolean.valueOf(z));
        }
        return anlz.q(false);
    }

    @Override // defpackage.gdi
    public final void h() {
        if (!this.m || this.G || !this.v.h()) {
            return;
        }
        n(((airr) this.e.get()).n());
    }

    @Override // defpackage.gdi
    public final void i(boolean z) {
        if (z) {
            ((airr) this.e.get()).X(2);
        } else if (this.D && !this.r) {
            ((airr) this.e.get()).K();
        }
        gde gdeVar = (gde) this.d.get();
        if (z) {
            gdeVar.b();
        } else {
            gdeVar.c();
        }
        this.r = false;
    }

    @Override // defpackage.gdi
    public final void j(boolean z) {
        if (!this.b.isInPictureInPictureMode() || this.x || this.F == z) {
            return;
        }
        boolean z2 = false;
        if (z && ((airr) this.e.get()).d()) {
            z2 = true;
        }
        if (z2) {
            ((airr) this.e.get()).a();
        } else if (!z && this.E && !((airr) this.e.get()).d()) {
            ((airr) this.e.get()).b();
        }
        this.E = z2;
        this.F = z;
    }

    public final void k(Function... functionArr) {
        PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
        boolean z = false;
        for (Function function : functionArr) {
            z |= ((Boolean) function.apply(builder)).booleanValue();
        }
        if (z) {
            this.b.setPictureInPictureParams(builder.build());
        }
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.gdi
    public final boolean l() {
        return this.m;
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    public final boolean m(PictureInPictureParams.Builder builder) {
        if (!this.m) {
            return false;
        }
        boolean z = this.G;
        boolean z2 = !this.t && gdo.b(this.s, this.u, this.v);
        this.G = z2;
        if (z == z2) {
            return false;
        }
        builder.setAutoEnterEnabled(z2);
        return true;
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        View view;
        this.D = true;
        if (this.q) {
            this.l.c();
            ((aizb) this.g.get()).c(this.h);
            if (this.o != null) {
                ((adoa) this.i.get()).i(this.o);
                this.o = null;
            }
            View.OnLayoutChangeListener onLayoutChangeListener = this.p;
            if (onLayoutChangeListener != null && (view = this.n) != null) {
                view.removeOnLayoutChangeListener(onLayoutChangeListener);
                this.p = null;
                this.n = null;
            }
            ((gde) this.d.get()).p = null;
            gde gdeVar = (gde) this.d.get();
            gdeVar.e.k(gdeVar.h);
            gdeVar.d.c.a.remove(gdeVar.i);
            gdeVar.f.c();
            gdeVar.c();
        }
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        this.D = false;
        this.q = false;
        ylx.p(apyVar, ((gdh) this.A.get()).a(), etg.f, new zdt() { // from class: gco
            @Override // defpackage.zdt
            public final void a(Object obj) {
                DefaultPipController defaultPipController = DefaultPipController.this;
                boolean z = ((gdg) obj) == gdg.ENABLED;
                defaultPipController.q = z;
                if (z) {
                    defaultPipController.k(new gcr(defaultPipController, 2));
                    ((aizb) defaultPipController.g.get()).a(defaultPipController.h);
                    defaultPipController.l.d(((airw) defaultPipController.f.get()).ao().I().aa(new gcq(defaultPipController), fzc.f));
                    if (defaultPipController.m) {
                        defaultPipController.o = new gct(defaultPipController);
                        ((adoa) defaultPipController.i.get()).g(defaultPipController.o);
                        defaultPipController.l.d(((airw) defaultPipController.f.get()).G().i.I().aa(new gcq(defaultPipController, 2), fzc.f));
                        defaultPipController.l.d(((ezh) defaultPipController.k.get()).h().B().at(new gcq(defaultPipController, 1), fzc.f));
                    }
                    ((gde) defaultPipController.d.get()).p = defaultPipController.z;
                    gde gdeVar = (gde) defaultPipController.d.get();
                    gdeVar.e.b(gdeVar.h);
                    gdeVar.d.s(gdeVar.i);
                    gdeVar.f.c();
                    gdeVar.f.d(gdeVar.b.G().i.I().aa(new gcw(gdeVar), fzc.g));
                    gdeVar.f.d(gdeVar.b.G().a.I().aa(new gcw(gdeVar, 1), fzc.g));
                    gdeVar.f.d(gdeVar.c.d.I().aa(new gcw(gdeVar, 2), fzc.g));
                    gdeVar.b();
                }
            }
        });
    }
}
