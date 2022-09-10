package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.animation.DecelerateInterpolator;
/* compiled from: PG */
/* renamed from: bclm  reason: default package */
/* loaded from: classes3.dex */
public final class bclm implements bclj {
    public final dzsj<bcly> a;
    public int b;
    public int c;
    private final dzsj<bclq> d;
    private final bckv e;
    private final int f;
    private double g;
    @dzsi
    private abx h;

    public bclm(Activity activity, dzsj<bcly> dzsjVar, dzsj<bclq> dzsjVar2, bckv bckvVar) {
        int a = jmj.a(activity, 64);
        this.b = 0;
        this.g = 1.0d;
        this.h = null;
        this.c = 2;
        this.e = bckvVar;
        this.a = dzsjVar;
        this.d = dzsjVar2;
        this.f = a;
    }

    @Override // defpackage.bclj, defpackage.bckr
    public final double a() {
        if (!g()) {
            return 1.0d;
        }
        return this.g;
    }

    @Override // defpackage.bclj
    public final int b() {
        if (!g()) {
            return 0;
        }
        return (this.f + this.a.a().i().j().intValue()) - this.a.a().i().k().intValue();
    }

    @Override // defpackage.bclj
    public final int c() {
        if (!g()) {
            return 0;
        }
        return this.b;
    }

    @Override // defpackage.bclj
    public final abx d() {
        if (this.h == null) {
            this.h = new bcll(this);
        }
        return this.h;
    }

    @Override // defpackage.bclj
    public final void e(int i) {
        abs absVar;
        RecyclerView g = this.e.g();
        if (g == null || (absVar = g.l) == null) {
            return;
        }
        absVar.O(0);
        g.n(0);
        if (i == 2 || !g()) {
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(this.b, i == 1 || (i == 3 && (a() > 0.5d ? 1 : (a() == 0.5d ? 0 : -1)) < 0) ? 0 : b());
        ofInt.setDuration(120L);
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: bclk
            private final bclm a;

            {
                this.a = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                bclm bclmVar = this.a;
                bclmVar.b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                bclmVar.f();
            }
        });
        ofInt.start();
    }

    public final void f() {
        double d = 1.0d;
        if (g()) {
            double d2 = this.b;
            double b = b();
            Double.isNaN(d2);
            Double.isNaN(b);
            d = 1.0d - (d2 / b);
        }
        if (deav.c(this.g, d, 0.01d)) {
            return;
        }
        this.g = d;
        if (!this.a.a().k().booleanValue()) {
            return;
        }
        cqkx.p(this.a.a());
        cqkx.p(this.a.a().i());
        for (bclt bcltVar : this.a.a().i().d()) {
            cqkx.p(bcltVar);
        }
        cqkx.p(this.d.a());
    }

    public final boolean g() {
        if (!this.a.a().k().booleanValue()) {
            return false;
        }
        return this.a.a().i().e().booleanValue();
    }
}
