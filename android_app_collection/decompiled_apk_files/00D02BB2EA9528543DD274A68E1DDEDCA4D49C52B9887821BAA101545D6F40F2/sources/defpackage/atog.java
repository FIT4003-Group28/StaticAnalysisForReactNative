package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
/* compiled from: PG */
/* renamed from: atog  reason: default package */
/* loaded from: classes2.dex */
public final class atog extends jnk {
    public static final cqkv q = new atoh();
    private int A;
    private float B;
    private boolean C;
    private int D;
    @dzsi
    public atof r;
    public boolean s;
    public long t;
    @dzsi
    public Animator u;
    public int v;
    private final Context w;
    private final GestureDetector x;
    private final GestureDetector.OnGestureListener y;
    private int z;

    public atog(Context context) {
        super(context);
        this.s = false;
        this.D = -1;
        this.v = 1;
        this.w = context;
        atoe atoeVar = new atoe(this);
        this.y = atoeVar;
        this.x = new GestureDetector(context, atoeVar, r());
        s(context);
    }

    public static <T extends cqkp> cqnf<T> p(Long l) {
        return cqjv.i(iug.DURATION, l, q);
    }

    private static Handler r() {
        return new Handler(Looper.getMainLooper());
    }

    private final void s(Context context) {
        this.z = ViewConfiguration.get(context).getScaledPagingTouchSlop();
        this.A = context.getResources().getDisplayMetrics().widthPixels;
    }

    private final float t(float f, float f2) {
        return (q() ? f2 - f : f - f2) / this.A;
    }

    private final void u(float f, int i) {
        Interpolator aonVar;
        if (i == 2) {
            aonVar = new aoo();
        } else {
            aonVar = new aon();
        }
        v(f, i, aonVar).start();
    }

    private final Animator v(float f, int i, Interpolator interpolator) {
        if (i == 1) {
            return ValueAnimator.ofFloat(new float[0]);
        }
        float f2 = i == 2 ? 0.0f : 1.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.setInterpolator(interpolator);
        ofFloat.setDuration(Math.abs(f2 - f) * ((float) this.t));
        final float f3 = q() ? -this.A : this.A;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this, f3) { // from class: atoc
            private final atog a;
            private final float b;

            {
                this.a = this;
                this.b = f3;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue() * this.b);
            }
        });
        if (this.s) {
            ofFloat.addListener(new atod(this, f2, f3, i));
        }
        return ofFloat;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
        if (r5 != 6) goto L27;
     */
    @Override // defpackage.jnk, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atog.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.z = ViewConfiguration.get(this.w).getScaledPagingTouchSlop();
        this.A = this.w.getResources().getDisplayMetrics().widthPixels;
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        if (view == this && i == 0) {
            this.C = false;
            this.D = -1;
            u(t(getTranslationX(), 0.0f), 2);
        }
    }

    public final boolean q() {
        return od.s(this) == 1;
    }

    public atog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.s = false;
        this.D = -1;
        this.v = 1;
        this.w = context;
        atoe atoeVar = new atoe(this);
        this.y = atoeVar;
        this.x = new GestureDetector(context, atoeVar, r());
        s(context);
    }

    public atog(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.s = false;
        this.D = -1;
        this.v = 1;
        this.w = context;
        atoe atoeVar = new atoe(this);
        this.y = atoeVar;
        this.x = new GestureDetector(context, atoeVar, r());
        s(context);
    }
}
