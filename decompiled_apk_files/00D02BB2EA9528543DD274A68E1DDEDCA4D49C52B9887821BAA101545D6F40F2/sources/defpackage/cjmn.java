package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.view.Window;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cjmn  reason: default package */
/* loaded from: classes4.dex */
public final class cjmn implements cjmt {
    @dzsi
    cjmm c;
    public boolean e;
    public final Activity f;
    public final eff g;
    public final dbsg<asil> h;
    public final dxio<gcg> i;
    private final Executor j;
    private final dxio<afwr> l;
    private final acyp m;
    private final dxio<gce> n;
    int a = 0;
    int b = 0;
    public cjmu d = cjmu.LEGACY;
    private final crzp<Boolean> o = new cjmi(this);
    private final crzp<Boolean> p = new cjmj(this);
    private final crzo<cjmr> k = new crzo<>();

    public cjmn(Activity activity, eff effVar, dbsg<asil> dbsgVar, dxio<afwr> dxioVar, acyp acypVar, dxio<gcg> dxioVar2, dxio<gce> dxioVar3, Executor executor) {
        this.f = activity;
        this.g = effVar;
        this.h = dbsgVar;
        this.j = executor;
        this.l = dxioVar;
        this.m = acypVar;
        this.i = dxioVar2;
        this.n = dxioVar3;
        q(activity.getResources());
    }

    private final void s(boolean z) {
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        View decorView = this.f.getWindow().getDecorView();
        if (z) {
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
        } else {
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        }
    }

    @Override // defpackage.cjmt
    public final void a() {
        if (this.i.a().a()) {
            this.n.a().g().d(this.o, this.j);
        }
        if (this.m.c()) {
            this.g.c().d(this.p, this.j);
        }
    }

    @Override // defpackage.cjmt
    public final void b() {
        if (this.i.a().a()) {
            this.n.a().g().c(this.o);
        }
        if (this.m.c()) {
            this.g.c().c(this.p);
        }
    }

    @Override // defpackage.cjmt
    public final void c() {
        this.f.getWindow().getDecorView().findViewById(16908290).setOnApplyWindowInsetsListener(new cjmk(this));
    }

    @Override // defpackage.cjmt
    public final void d() {
        this.f.getWindow().getDecorView().findViewById(16908290).setOnApplyWindowInsetsListener(null);
    }

    @Override // defpackage.cjmt
    public final int e() {
        return this.a;
    }

    @Override // defpackage.cjmt
    public final int f(efe efeVar) {
        eff effVar = this.g;
        if (!effVar.b.isEmpty() && effVar.b.keySet().iterator().next().ordinal() < efeVar.ordinal()) {
            return 0;
        }
        return this.a;
    }

    @Override // defpackage.cjmt
    public final int g() {
        if (this.g.a) {
            return 0;
        }
        return this.a;
    }

    @Override // defpackage.cjmt
    public final int h() {
        return this.b;
    }

    @Override // defpackage.cjmt
    public final void i() {
        int i = this.b;
        this.b = 0;
        if (i != 0) {
            r();
        }
    }

    @Override // defpackage.cjmt
    public final Animator j(cjmu cjmuVar) {
        if (Build.VERSION.SDK_INT < 23) {
            return ValueAnimator.ofInt(0);
        }
        if (cjmuVar == this.d || this.e) {
            this.d = cjmuVar;
            return ValueAnimator.ofInt(0);
        }
        m();
        int statusBarColor = this.f.getWindow().getStatusBarColor();
        int a = cjmuVar.a(this.f);
        cjmm cjmmVar = new cjmm(statusBarColor, a);
        this.c = cjmmVar;
        cjmmVar.addListener(new cjml(this, cjmuVar, a));
        this.c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: cjmg
            private final cjmn a;

            {
                this.a = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.n(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        return this.c;
    }

    @Override // defpackage.cjmt
    public final void k(cjmu cjmuVar) {
        l(cjmuVar, false);
    }

    public final void l(cjmu cjmuVar, boolean z) {
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        if (!z && this.d == cjmuVar) {
            return;
        }
        this.d = cjmuVar;
        if (this.e) {
            return;
        }
        m();
        n(cjmuVar.a(this.f));
        p();
    }

    final void m() {
        cjmm cjmmVar = this.c;
        if (cjmmVar != null) {
            cjmmVar.cancel();
            this.c = null;
        }
    }

    public final void n(int i) {
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        this.f.getWindow().setStatusBarColor(i);
    }

    @Override // defpackage.cjmt
    public final cjmu o() {
        return this.d;
    }

    @Override // defpackage.cjmt
    public final void p() {
        if (this.e) {
            return;
        }
        boolean z = this.i.a().a() && this.n.a().h();
        int i = this.d.i;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            s(false);
        } else if (i2 == 1) {
            s(true);
        } else if (i2 == 2) {
            s(!z);
        } else if (i2 != 3) {
        } else {
            if (!z) {
                s(!this.l.a().l().d(afwm.SATELLITE));
            } else {
                s(false);
            }
        }
    }

    @Override // defpackage.cjmt
    public final void q(Resources resources) {
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            this.a = resources.getDimensionPixelSize(identifier);
        }
        this.j.execute(new Runnable(this) { // from class: cjmh
            private final cjmn a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Window window = this.a.f.getWindow();
                window.setSoftInputMode(16);
                window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 1024);
                window.addFlags(Integer.MIN_VALUE);
            }
        });
    }

    public final void r() {
        crzo<cjmr> crzoVar = this.k;
        cjmo cjmoVar = new cjmo();
        cjmoVar.a = Integer.valueOf(this.a);
        cjmoVar.b = Integer.valueOf(this.b);
        String str = cjmoVar.a == null ? " systemWindowTopInsetPx" : "";
        if (cjmoVar.b == null) {
            str = str.concat(" systemWindowBottomInsetPx");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        } else {
            crzoVar.a(new cjmp(cjmoVar.a.intValue(), cjmoVar.b.intValue()));
        }
    }
}
