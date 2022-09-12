package defpackage;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewPropertyAnimator;
/* compiled from: PG */
/* renamed from: cqgq  reason: default package */
/* loaded from: classes.dex */
public class cqgq {
    @dzsi
    public Float a;
    @dzsi
    public Float b;
    @dzsi
    public TimeInterpolator c;
    @dzsi
    public Integer d;
    @dzsi
    public Long e;
    @dzsi
    public Float f;
    @dzsi
    public Float g;
    @dzsi
    public cqgp<?> h;
    @dzsi
    public cqgp<?> i;
    @dzsi
    private Integer j;
    @dzsi
    private Integer k;
    @dzsi
    private Float l;
    @dzsi
    private cqtv m;
    @dzsi
    private Float n;
    private boolean o;

    public void a(View view, @dzsi cqkp cqkpVar, boolean z) {
        ViewPropertyAnimator animate = view.animate();
        Integer num = this.j;
        if (num != null || this.h != null) {
            animate.withStartAction(new cqgn(this, num, view, cqkpVar));
        }
        Integer num2 = this.k;
        if (num2 != null || this.i != null) {
            animate.withEndAction(new cqgo(this, num2, view, cqkpVar));
        }
        Float f = this.a;
        if (f != null) {
            animate.alpha(f.floatValue());
        }
        Float f2 = this.l;
        if (f2 != null) {
            animate.translationX(f2.floatValue() * view.getMeasuredWidth());
        }
        cqtv cqtvVar = this.m;
        if (cqtvVar != null) {
            animate.translationY(cqtvVar.e(view.getContext()));
        } else {
            Float f3 = this.n;
            if (f3 != null) {
                animate.translationY(f3.floatValue() * view.getMeasuredHeight());
            }
        }
        Float f4 = this.b;
        if (f4 != null) {
            animate.rotation(f4.floatValue());
        }
        Float f5 = this.f;
        if (f5 != null) {
            animate.scaleX(f5.floatValue());
        }
        Float f6 = this.g;
        if (f6 != null) {
            animate.scaleY(f6.floatValue());
        }
        TimeInterpolator timeInterpolator = this.c;
        if (timeInterpolator != null) {
            animate.setInterpolator(timeInterpolator);
        }
        if (this.o && z) {
            animate.setDuration(0L);
            animate.setStartDelay(0L);
        } else {
            Integer num3 = this.d;
            if (num3 != null) {
                animate.setDuration(num3.intValue());
            }
            Long l = this.e;
            if (l != null) {
                animate.setStartDelay(l.longValue());
            }
        }
        animate.start();
    }

    public final <T extends cqkp> cqnf<T> b() {
        return cqjv.j(cqfe.ANIMATE, this);
    }

    public final void c() {
        this.k = 8;
    }

    public final void d() {
        this.k = 4;
    }

    public final void e() {
        this.j = 4;
    }

    public final void f() {
        this.o = true;
    }

    public final void g(Float f) {
        this.l = f;
    }

    public final void h(cqtv cqtvVar) {
        this.m = cqtvVar;
        this.n = null;
    }

    public final void i(Float f) {
        this.n = f;
        this.m = null;
    }

    public final void j() {
        this.j = 0;
    }
}
