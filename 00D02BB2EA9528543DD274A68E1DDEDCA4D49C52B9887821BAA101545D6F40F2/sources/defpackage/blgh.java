package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ScrollView;
/* compiled from: PG */
/* renamed from: blgh  reason: default package */
/* loaded from: classes3.dex */
public final class blgh extends ScrollView {
    public final Context a;
    @dzsi
    public Runnable b;
    public cqrp c;
    int d;
    @dzsi
    public ValueAnimator e;
    private boolean i;
    private int j;
    private static final Interpolator g = new OvershootInterpolator();
    private static final cqrp h = cqrp.d(24.0d);
    static final cqkv f = new blgi();

    public blgh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = cqrp.d(100.0d);
        this.i = false;
        this.j = 0;
        this.d = 0;
        this.e = null;
        this.a = context;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> c(cqmp<T>... cqmpVarArr) {
        return new cqmh(blgh.class, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> d(cqlc<T, Runnable> cqlcVar) {
        return cqjv.g(blgg.ON_SWIPE_AWAY, cqlcVar, f);
    }

    public final void a(int i, long j, @dzsi Interpolator interpolator, @dzsi Runnable runnable) {
        if (this.e != null) {
            if (runnable == null) {
                return;
            }
            runnable.run();
            return;
        }
        int i2 = this.d;
        ValueAnimator ofInt = ValueAnimator.ofInt(i2, i);
        this.e = ofInt;
        ofInt.addListener(new blgf(this, runnable));
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: blge
            private final blgh a;

            {
                this.a = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.b(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        if (interpolator != null) {
            ofInt.setInterpolator(interpolator);
        }
        ofInt.setDuration(j);
        b(i2);
        ofInt.start();
    }

    public final void b(int i) {
        overScrollBy(0, 0, 0, i, 0, getChildCount() > 0 ? Math.max(0, getChildAt(0).getHeight() - this.a.getResources().getDisplayMetrics().heightPixels) : 0, 0, 0, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setOverScrollMode(0);
        this.d = -this.a.getResources().getDisplayMetrics().heightPixels;
        a(0, 300L, irf.a, null);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        onTouchEvent(motionEvent);
        return false;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        b(this.d);
    }

    @Override // android.widget.ScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            scrollBy(0, 0);
        }
        if (this.b == null || motionEvent.getAction() != 1) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.i) {
            int i = this.a.getResources().getDisplayMetrics().heightPixels;
            a(this.d > 0 ? this.j + i : -i, 200L, null, this.b);
            return false;
        }
        int i2 = this.d;
        int i3 = this.j;
        if (i2 > i3 || i2 < 0) {
            a(i2 > 0 ? i3 : 0, 300L, g, null);
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected final boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        this.d = i4;
        this.j = i6;
        int i9 = i4 <= 0 ? -(i4 + i2) : i4 >= i6 ? (i4 + i2) - i6 : 0;
        int e = this.c.e(this.a);
        boolean z2 = true;
        if (!z || i9 <= e || (i2 != 0 && Integer.signum(i4) != Integer.signum(i2))) {
            z2 = false;
        }
        this.i = z2;
        int i10 = this.a.getResources().getDisplayMetrics().heightPixels;
        setBackgroundColor((decl.h((int) (((i10 - i9) / i10) * 230.0f), 0, 230) << 24) | 3289650);
        return super.overScrollBy(i, i2, i3, i4, i5, i6, i7, (z || this.e != null) ? i10 : h.e(this.a), z);
    }
}
