package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
/* compiled from: PG */
/* renamed from: ahum  reason: default package */
/* loaded from: classes.dex */
public final class ahum extends aizc {
    public ahuk a;
    public final Animation b;
    public final Animation c;
    public final Animation.AnimationListener d;
    public final ColorDrawable e;
    private final ValueAnimator f;
    private boolean g;
    private final long h;

    public ahum(Context context) {
        super(context);
        this.e = new ColorDrawable(Color.argb(140, 0, 0, 0));
        this.g = false;
        long integer = context.getResources().getInteger(17694720);
        this.h = integer;
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        this.b = alphaAnimation;
        alphaAnimation.setDuration(integer);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        this.c = alphaAnimation2;
        alphaAnimation2.setDuration(integer);
        ahul ahulVar = new ahul(this);
        this.d = ahulVar;
        alphaAnimation2.setAnimationListener(ahulVar);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f = valueAnimator;
        valueAnimator.setDuration(integer);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.addUpdateListener(new ahuj(this));
        lj.av(this);
        d();
    }

    public static void a(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.clearAnimation();
            if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt);
            }
        }
    }

    @Override // defpackage.aizf
    public final ViewGroup.LayoutParams c() {
        return new aizh(-1, -1, false);
    }

    public final void d() {
        removeAllViews();
        setVisibility(8);
    }

    public final void e(boolean z) {
        if (this.g == z) {
            return;
        }
        this.g = z;
        lj.V(this, true != z ? 0 : 4);
        if (z) {
            this.f.start();
            setForeground(this.e);
            return;
        }
        clearAnimation();
        animate().alpha(1.0f).setDuration(this.h).start();
        setForeground(null);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.g;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ahuk ahukVar;
        if (super.onTouchEvent(motionEvent) || (ahukVar = this.a) == null) {
            return false;
        }
        ahukVar.i(motionEvent);
        return false;
    }
}
