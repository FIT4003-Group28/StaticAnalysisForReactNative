package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.graphics.Point;
import android.view.View;
import android.view.ViewAnimationUtils;
/* compiled from: PG */
/* renamed from: aeux  reason: default package */
/* loaded from: classes2.dex */
public abstract class aeux implements egr {
    private int e;
    private int f;
    private float g;

    private final void e(View view) {
        Point d = d();
        if (d == null) {
            d = new Point(view.getWidth() / 2, view.getWidth() / 2);
        }
        this.e = d.x;
        int i = d.y;
        this.f = i;
        int i2 = this.e;
        int width = view.getWidth();
        double d2 = i2;
        double d3 = i;
        double d4 = i2 - width;
        double height = i - view.getHeight();
        this.g = (float) Math.max(Math.max(Math.hypot(d2, d3), Math.hypot(d4, d3)), Math.max(Math.hypot(d2, height), Math.hypot(d4, height)));
    }

    private final Animator f(View view, float f, float f2) {
        return ViewAnimationUtils.createCircularReveal(view, this.e, this.f, f, f2);
    }

    @Override // defpackage.egr
    public final Animator a(View view) {
        e(view);
        Animator f = f(view, 0.0f, this.g);
        f.setDuration(283L);
        f.setInterpolator(pq.a(0.75f, 0.0f, 0.35f, 1.0f));
        return f;
    }

    @Override // defpackage.egr
    public final Animator b(View view) {
        e(view);
        float f = this.g;
        Animator f2 = f(view, f, f);
        f2.setDuration(100L);
        Animator f3 = f(view, this.g, 0.0f);
        f3.setDuration(250L);
        f3.setInterpolator(new aoo());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(f2, f3);
        return animatorSet;
    }

    @Override // defpackage.egr
    public final void c(View view) {
    }

    @dzsi
    public abstract Point d();
}
