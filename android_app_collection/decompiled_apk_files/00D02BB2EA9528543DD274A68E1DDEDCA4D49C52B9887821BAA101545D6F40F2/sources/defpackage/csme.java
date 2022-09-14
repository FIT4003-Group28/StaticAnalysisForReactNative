package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import com.google.android.gms.location.FusedLocationProviderApi;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: csme  reason: default package */
/* loaded from: classes5.dex */
public final class csme extends ViewGroup {
    private static final int[] A;
    static final boolean a;
    public static final /* synthetic */ int z = 0;
    private final int[] B;
    private final Rect C;
    private final Rect D;
    private int E;
    private View F;
    private Drawable G;
    private float H;
    private boolean I;
    private final csmi J;
    private final ni K;
    private ni L;
    private boolean M;
    private boolean N;
    private Paint O;
    private int P;
    private final cslo Q;
    private Map<View, Integer> R;
    private final View.OnAttachStateChangeListener S;
    public final Rect b;
    public final Rect c;
    public final Rect d;
    public final Rect e;
    public final csmj f;
    public final csmh g;
    public cslg h;
    public View i;
    public int j;
    public boolean k;
    public ImageView l;
    public Animator m;
    public csmd n;
    public boolean o;
    public float p;
    public float q;
    public boolean r;
    public Interpolator s;
    public Interpolator t;
    public boolean u;
    public boolean v;
    public boolean w;
    public csma x;
    public final AccessibilityManager y;

    static {
        a = Build.VERSION.SDK_INT >= 22;
        A = new int[]{R.attr.materialButtonOutlinedStyle};
    }

    public csme(Context context) {
        this(context, cslo.Legacy);
    }

    private final void o(Rect rect, View view) {
        r(this.B, view);
        int[] iArr = this.B;
        int i = iArr[0];
        rect.set(i, iArr[1], view.getMeasuredWidth() + i, this.B[1] + view.getMeasuredHeight());
    }

    private final void p() {
        View view = this.i;
        if (view == null) {
            return;
        }
        this.k = view.isDrawingCacheEnabled();
        this.i.setDrawingCacheEnabled(true);
        ImageView imageView = new ImageView(getContext());
        this.l = imageView;
        imageView.setElevation(this.i.getElevation());
        this.l.setOutlineProvider(new cslw(this));
        if (this.O != null) {
            q();
        }
        addView(this.l);
    }

    private final void q() {
        ImageView imageView = this.l;
        if (imageView != null) {
            imageView.setImageTintList(ColorStateList.valueOf(this.P));
        }
    }

    private final void r(int[] iArr, View view) {
        getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - i;
        iArr[1] = iArr[1] - i2;
    }

    private final boolean s() {
        return this.H != 1.0f;
    }

    private final Animator.AnimatorListener t(Runnable runnable) {
        return new cslq(this, runnable);
    }

    private final void u(boolean z2) {
        Map<View, Integer> map;
        View view;
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        int childCount = viewGroup.getChildCount();
        if (z2) {
            this.R = new HashMap();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != this) {
                    this.R.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    od.m(childAt, 4);
                }
            }
        }
        if (!a && (view = this.i) != null && z2) {
            ViewParent parent2 = view.getParent();
            while (true) {
                if (parent2 instanceof ViewGroup) {
                    if (parent2 != parent) {
                        ViewGroup viewGroup2 = (ViewGroup) parent2;
                        for (int i2 = 0; i2 < viewGroup2.getChildCount(); i2++) {
                            View childAt2 = viewGroup2.getChildAt(i2);
                            if (childAt2 != view) {
                                this.R.put(childAt2, Integer.valueOf(childAt2.getImportantForAccessibility()));
                                od.m(childAt2, 4);
                            }
                        }
                        parent2 = viewGroup2.getParent();
                        view = viewGroup2;
                    } else {
                        od.m(view, 1);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z2 || (map = this.R) == null) {
            return;
        }
        for (View view2 : map.keySet()) {
            od.m(view2, this.R.get(view2).intValue());
        }
        this.R = null;
    }

    public final void a(View view) {
        czhx.b(od.ak(this), "Must be attached to window before showing");
        this.i = view;
        if (a) {
            csma csmaVar = new csma(this, view);
            this.x = csmaVar;
            od.c(this, csmaVar);
        }
        if (l()) {
            TextView textView = (TextView) view;
            this.j = textView.getCurrentTextColor();
            textView.setTextColor(this.E);
        }
        if (k()) {
            p();
        }
        if (getVisibility() == 8) {
            setVisibility(4);
        }
        view.addOnAttachStateChangeListener(this.S);
    }

    public final void b() {
        czhx.b(getParent() != null, "View must be attached to view hierarchy");
        setVisibility(0);
        this.o = false;
    }

    public final void c(Runnable runnable) {
        if (!this.o) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.h.a(), "alpha", 0.0f).setDuration(200L);
            duration.setInterpolator(j(csku.b));
            float exactCenterX = this.b.exactCenterX();
            float f = this.f.h;
            float exactCenterY = this.b.exactCenterY();
            csmj csmjVar = this.f;
            float f2 = csmjVar.i;
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(csmjVar, PropertyValuesHolder.ofFloat("scale", csmjVar.getScale(), 0.0f), PropertyValuesHolder.ofFloat("translationX", csmjVar.getTranslationX(), exactCenterX - f), PropertyValuesHolder.ofFloat("translationY", csmjVar.getTranslationY(), exactCenterY - f2), PropertyValuesHolder.ofInt("alpha", csmjVar.getAlpha(), 0));
            ofPropertyValuesHolder.setInterpolator(csku.b);
            Animator duration2 = ofPropertyValuesHolder.setDuration(200L).setDuration(200L);
            Animator duration3 = this.g.d().setDuration(200L);
            AnimatorSet animatorSet = new AnimatorSet();
            AnimatorSet.Builder with = animatorSet.play(duration).with(duration2).with(duration3);
            if (k()) {
                with.with(ObjectAnimator.ofFloat(this.l, FusedLocationProviderApi.EXTRA_KEY_ELEVATION_WGS84_M, 0.0f).setDuration(200L));
            }
            animatorSet.addListener(t(runnable));
            e(animatorSet);
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    public final void d(Runnable runnable) {
        if (!this.o) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.h.a(), "alpha", 0.0f).setDuration(200L);
            duration.setInterpolator(j(csku.b));
            csmj csmjVar = this.f;
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(csmjVar, PropertyValuesHolder.ofFloat("scale", csmjVar.getScale(), 1.125f), PropertyValuesHolder.ofInt("alpha", csmjVar.getAlpha(), 0));
            ofPropertyValuesHolder.setInterpolator(csku.b);
            Animator duration2 = ofPropertyValuesHolder.setDuration(200L).setDuration(200L);
            Animator duration3 = this.g.d().setDuration(200L);
            AnimatorSet animatorSet = new AnimatorSet();
            AnimatorSet.Builder with = animatorSet.play(duration).with(duration2).with(duration3);
            if (k()) {
                with.with(ObjectAnimator.ofFloat(this.l, FusedLocationProviderApi.EXTRA_KEY_ELEVATION_WGS84_M, 0.0f).setDuration(200L));
            }
            animatorSet.addListener(t(runnable));
            e(animatorSet);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        csma csmaVar = this.x;
        if (csmaVar == null || !csmaVar.k(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final void e(Animator animator) {
        Animator animator2 = this.m;
        if (animator2 != null) {
            animator2.cancel();
        }
        if (animator != null) {
            this.m = animator;
            animator.start();
        }
    }

    public final boolean f(float f, float f2) {
        return this.C.contains(Math.round(f), Math.round(f2));
    }

    public final void g() {
        if (!this.o) {
            this.n.a();
        }
        View view = this.i;
        if (view != null) {
            view.performClick();
        }
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public final void h() {
        if (!this.o) {
            this.n.b();
        }
    }

    public final Interpolator i(final Interpolator interpolator, final float f) {
        final float d = this.f.d(this.D);
        final float f2 = this.f.g;
        return new Interpolator(interpolator, f, f2, d) { // from class: cslp
            private final Interpolator a;
            private final float b;
            private final float c;
            private final float d;

            {
                this.a = interpolator;
                this.b = f;
                this.c = f2;
                this.d = d;
            }

            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f3) {
                Interpolator interpolator2 = this.a;
                float f4 = this.b;
                float f5 = this.c;
                float f6 = this.d;
                int i = csme.z;
                float interpolation = interpolator2.getInterpolation(f3);
                return csmm.b((((((1.0f - interpolation) * f4) + interpolation) * f5) - f6) / (f5 - f6));
            }
        };
    }

    public final Interpolator j(Interpolator interpolator) {
        return new cslz(interpolator, this.f.g, this.f.d(this.D));
    }

    public final boolean k() {
        return this.I;
    }

    public final boolean l() {
        return this.E != 0 && (this.i instanceof TextView);
    }

    public final Animator m() {
        ObjectAnimator objectAnimator;
        csmh csmhVar = this.g;
        Context context = getContext();
        csmk csmkVar = csmk.PULSE_WITH_INNER_CIRCLE;
        int ordinal = csmhVar.g.ordinal();
        if (ordinal == 0) {
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator duration = ObjectAnimator.ofFloat(csmhVar, "scale", 1.0f, 1.1f).setDuration(500L);
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(csmhVar, "scale", 1.1f, 1.0f).setDuration(500L);
            ObjectAnimator duration3 = ObjectAnimator.ofPropertyValuesHolder(csmhVar, PropertyValuesHolder.ofFloat("pulseScale", 1.1f, 2.0f), PropertyValuesHolder.ofFloat("pulseAlpha", 1.0f, 0.0f)).setDuration(500L);
            animatorSet.play(duration).with(ObjectAnimator.ofFloat(csmhVar, "pulseAlpha", 0.0f).setDuration(500L));
            animatorSet.play(duration2).with(duration3).after(duration);
            objectAnimator = animatorSet;
        } else if (ordinal == 1) {
            objectAnimator = ObjectAnimator.ofPropertyValuesHolder(csmhVar, PropertyValuesHolder.ofFloat("scale", 0.0f, 2.0f), PropertyValuesHolder.ofInt("alpha", 255, 0)).setDuration(1000L);
        } else {
            throw new IllegalStateException("No implementation for animation type.");
        }
        objectAnimator.setInterpolator(csku.c);
        objectAnimator.setStartDelay(500L);
        csko.b(objectAnimator);
        objectAnimator.addListener(new csmg(context));
        return objectAnimator;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.N = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        View view = this.i;
        if (view != null) {
            view.removeOnAttachStateChangeListener(this.S);
        }
        Animator animator = this.m;
        if (animator != null) {
            animator.removeAllListeners();
            this.m.cancel();
            this.m = null;
        }
        this.N = false;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        canvas.save();
        if (this.F != null) {
            canvas.clipRect(this.C);
        }
        this.f.draw(canvas);
        if (!this.u) {
            this.g.draw(canvas);
        }
        if (this.G != null) {
            canvas.translate(this.b.exactCenterX() - (this.G.getBounds().width() / 2.0f), this.b.exactCenterY() - (this.G.getBounds().height() / 2.0f));
            this.G.draw(canvas);
        } else if (this.i == null) {
            throw new IllegalStateException("Neither target view nor drawable was set");
        } else {
            if (!k()) {
                czhx.b(this.i != null, "Target view must be set before draw");
                canvas.translate(this.b.left, this.b.top);
                if (s()) {
                    canvas.save();
                    float f = this.H;
                    canvas.scale(f, f);
                }
                Paint paint = this.O;
                if (paint != null) {
                    int saveLayer = canvas.saveLayer(null, paint, 31);
                    this.i.draw(canvas);
                    canvas.restoreToCount(saveLayer);
                } else {
                    this.i.draw(canvas);
                }
                if (s()) {
                    canvas.restore();
                }
            } else {
                this.i.invalidate();
                this.l.setImageBitmap(this.i.getDrawingCache());
            }
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int height;
        int f;
        boolean z3 = true;
        czhx.b(this.i != null, "Target view must be set before layout");
        this.N = true;
        r(this.B, this.i);
        Rect rect = this.b;
        int[] iArr = this.B;
        int i5 = iArr[0];
        rect.set(i5, iArr[1], this.i.getWidth() + i5, this.B[1] + this.i.getHeight());
        Drawable drawable = this.G;
        if (drawable != null) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.libraries_material_featurehighlight_min_tap_target_size) / 2;
            int max = Math.max(drawable.getBounds().height() / 2, dimensionPixelSize);
            int max2 = Math.max(drawable.getBounds().width() / 2, dimensionPixelSize);
            int centerX = this.b.centerX();
            int centerY = this.b.centerY();
            this.b.set(centerX - max2, centerY - max, centerX + max2, centerY + max);
        }
        Rect rect2 = this.b;
        float f2 = this.H;
        int width = rect2.width();
        float f3 = f2 - 1.0f;
        int height2 = rect2.height();
        float f4 = (width * f3) / 2.0f;
        rect2.left = (int) (rect2.left - f4);
        rect2.right = (int) (rect2.right + f4);
        float f5 = (height2 * f3) / 2.0f;
        rect2.top = (int) (rect2.top - f5);
        rect2.bottom = (int) (rect2.bottom + f5);
        if (this.G == null && k()) {
            if (this.l == null) {
                z3 = false;
            }
            czhx.b(z3, "Target view mock must be created before layout");
            this.l.layout(this.b.left, this.b.top, this.b.right, this.b.bottom);
        }
        View view = this.F;
        if (view != null) {
            o(this.C, view);
        } else {
            this.C.set(i, i2, i3, i4);
        }
        this.f.setBounds(this.C);
        if (!this.u) {
            this.g.setBounds(this.C);
        }
        csmi csmiVar = this.J;
        Rect rect3 = this.b;
        Rect rect4 = this.C;
        View a2 = csmiVar.d.h.a();
        if (rect3.isEmpty() || rect4.isEmpty()) {
            a2.layout(0, 0, 0, 0);
        } else {
            int centerY2 = rect3.centerY();
            int centerX2 = rect3.centerX();
            if (!csmiVar.f) {
                csmh csmhVar = csmiVar.d.g;
                csmhVar.e = rect3.exactCenterX();
                csmhVar.f = rect3.exactCenterY();
                csmhVar.d = Math.max(csmhVar.a, (Math.max(rect3.width(), rect3.height()) / 2.0f) + csmhVar.b);
                csmhVar.invalidateSelf();
                csmh csmhVar2 = csmiVar.d.g;
                Rect rect5 = csmiVar.b;
                float f6 = csmhVar2.d + csmhVar2.c;
                rect5.set(Math.round(csmhVar2.e - f6), Math.round(csmhVar2.f - f6), Math.round(csmhVar2.e + f6), Math.round(csmhVar2.f + f6));
            }
            int i6 = csmiVar.g;
            if (i6 != 48 && (i6 == 80 || centerY2 < rect4.centerY())) {
                csmiVar.b(a2, rect4.width(), rect4.bottom - csmiVar.b.bottom);
                int a3 = csmiVar.a(a2, rect4.left, rect4.right, a2.getMeasuredWidth(), centerX2);
                int i7 = csmiVar.f ? rect3.bottom + csmiVar.c : csmiVar.b.bottom;
                a2.layout(a3, i7, a2.getMeasuredWidth() + a3, a2.getMeasuredHeight() + i7);
            } else {
                csmiVar.b(a2, rect4.width(), (csmiVar.f ? rect3.top : csmiVar.b.top) - rect4.top);
                int a4 = csmiVar.a(a2, rect4.left, rect4.right, a2.getMeasuredWidth(), centerX2);
                int i8 = csmiVar.f ? rect3.top - csmiVar.c : csmiVar.b.top;
                a2.layout(a4, i8 - a2.getMeasuredHeight(), a2.getMeasuredWidth() + a4, i8);
            }
        }
        csmiVar.a.set(a2.getLeft(), a2.getTop(), a2.getRight(), a2.getBottom());
        csmj csmjVar = csmiVar.d.f;
        Rect rect6 = csmiVar.a;
        boolean z4 = csmiVar.f;
        csmjVar.b.set(rect3);
        csmjVar.c.set(rect6);
        float exactCenterX = rect3.exactCenterX();
        float exactCenterY = rect3.exactCenterY();
        if (z4) {
            int centerY3 = rect3.centerY();
            int centerY4 = rect4.centerY();
            int i9 = csmjVar.d;
            int i10 = i9 + i9;
            csmjVar.h = exactCenterX / 2.0f;
            if (centerY3 < centerY4) {
                height = rect6.bottom;
                f = csmj.f(height, exactCenterX, i10);
                csmjVar.i = -f;
            } else {
                height = rect4.height() - rect6.top;
                f = csmj.f(height, exactCenterX, i10);
                csmjVar.i = rect4.height() + f;
            }
            csmjVar.g = height + f + i10;
        } else {
            Rect bounds = csmjVar.getBounds();
            if (Math.min(exactCenterY - bounds.top, bounds.bottom - exactCenterY) < csmjVar.a) {
                csmjVar.h = exactCenterX;
                csmjVar.i = exactCenterY;
            } else {
                csmjVar.h = exactCenterX <= bounds.exactCenterX() ? rect6.exactCenterX() + csmjVar.e : rect6.exactCenterX() - csmjVar.e;
                exactCenterY = exactCenterY <= bounds.exactCenterY() ? rect6.exactCenterY() + csmjVar.f : rect6.exactCenterY() - csmjVar.f;
                csmjVar.i = exactCenterY;
            }
            csmjVar.g = csmjVar.d + Math.max(csmj.g(csmjVar.h, exactCenterY, rect3), csmj.g(csmjVar.h, csmjVar.i, rect6));
        }
        csmjVar.invalidateSelf();
        o(this.D, this.h.a());
        o(this.c, this.h.d());
        o(this.d, this.h.g());
        o(this.e, this.h.j());
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(resolveSize(View.MeasureSpec.getSize(i), i), resolveSize(View.MeasureSpec.getSize(i2), i2));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.M = this.b.contains((int) motionEvent.getX(), (int) motionEvent.getY());
            actionMasked = 0;
        }
        if (!this.M || this.i == null) {
            this.K.a(motionEvent);
            if (actionMasked == 1 && this.r) {
                this.r = false;
                this.t = null;
                this.s = null;
                if (this.p > getResources().getDimension(R.dimen.libraries_material_featurehighlight_swipe_to_dismiss_threshold)) {
                    h();
                } else {
                    Animator animator = this.m;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ObjectAnimator duration = ObjectAnimator.ofFloat(this.h.a(), "alpha", 1.0f).setDuration(150L);
                    duration.setInterpolator(i(csku.a, 1.0f - this.q));
                    float exactCenterX = this.b.exactCenterX();
                    float f = this.f.h;
                    float exactCenterY = this.b.exactCenterY();
                    csmj csmjVar = this.f;
                    Animator duration2 = csmjVar.e(exactCenterX - f, exactCenterY - csmjVar.i, 1.0f - this.q).setDuration(150L);
                    Animator duration3 = this.g.c(1.0f - this.q).setDuration(150L);
                    AnimatorSet animatorSet = new AnimatorSet();
                    AnimatorSet.Builder with = animatorSet.play(duration).with(duration2).with(duration3);
                    if (k()) {
                        with.with(ObjectAnimator.ofFloat(this.l, FusedLocationProviderApi.EXTRA_KEY_ELEVATION_WGS84_M, this.i.getElevation()).setDuration(150L));
                    }
                    animatorSet.addListener(new csly(this));
                    e(animatorSet);
                }
                if (!this.o) {
                    this.n.c();
                }
            }
        } else {
            ni niVar = this.L;
            if (niVar != null) {
                niVar.a(motionEvent);
                if (actionMasked == 1) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.setAction(3);
                }
            }
            this.i.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setBodyTextAlignment(int i) {
        this.h.setBodyTextAlignment(i);
    }

    public void setBodyTextAppearance(int i) {
        this.h.setBodyTextAppearance(i);
    }

    public void setBodyTextColor(ColorStateList colorStateList) {
        this.h.setBodyTextColor(colorStateList);
    }

    public void setBodyTextSize(float f) {
        this.h.setBodyTextSize(f);
    }

    public void setCallback(csmd csmdVar) {
        this.h.setCallback(csmdVar);
        this.n = csmdVar;
    }

    public void setCenterThreshold(int i) {
        this.f.a = i;
    }

    public void setConfiningView(View view) {
        this.F = view;
    }

    public void setContent(cslg cslgVar) {
        cslg cslgVar2 = this.h;
        if (cslgVar2 != null) {
            removeView(cslgVar2.a());
        }
        czhx.d(cslgVar);
        this.h = cslgVar;
        addView(cslgVar.a(), 0);
    }

    public void setContentMaxWidth(int i) {
        this.J.e = i;
    }

    public void setDismissActionRippleColor(ColorStateList colorStateList) {
        this.h.setDismissActionRippleColor(colorStateList);
    }

    public void setDismissActionStrokeColor(ColorStateList colorStateList) {
        this.h.setDismissActionStrokeColor(colorStateList);
    }

    public void setDismissActionTextAlignment(int i) {
        this.h.setDismissActionTextAlignment(i);
    }

    public void setDismissActionTextAppearance(int i) {
        this.h.setDismissActionTextAppearance(i);
    }

    public void setDismissActionTextColor(ColorStateList colorStateList) {
        this.h.setDismissActionTextColor(colorStateList);
    }

    public void setHeaderTextAlignment(int i) {
        this.h.setHeaderTextAlignment(i);
    }

    public void setHeaderTextAppearance(int i) {
        this.h.setHeaderTextAppearance(i);
    }

    public void setHeaderTextColor(ColorStateList colorStateList) {
        this.h.setHeaderTextColor(colorStateList);
    }

    public void setHeaderTextSize(float f) {
        this.h.setHeaderTextSize(f);
    }

    @Deprecated
    public void setInnerColor(int i) {
        setPulseColor(i);
    }

    public void setOffsets(int i, int i2) {
        csmj csmjVar = this.f;
        csmjVar.f = i;
        csmjVar.e = i2;
    }

    public void setOuterColor(int i) {
        this.f.a(i);
    }

    public void setOuterVisualPadding(int i) {
        this.f.d = i;
    }

    public void setPinToClosestVerticalEdge(boolean z2) {
        this.u = z2;
        this.J.f = z2;
    }

    public void setPulseAnimationType(csmk csmkVar) {
        this.g.g = csmkVar;
        if (this.o || this.u || !this.N) {
            return;
        }
        e(m());
    }

    public void setPulseColor(int i) {
        setPulseColor(i, kc.f(i, getContext().getResources().getInteger(this.Q == cslo.Legacy ? R.integer.libraries_material_featurehighlight_pulse_base_alpha : R.integer.libraries_material_featurehighlight_gm_pulse_base_alpha)));
    }

    public void setScrimColor(int i) {
        this.f.b(i);
    }

    public void setSwipeToDismissEnabled(boolean z2) {
        this.v = z2;
    }

    public void setTapToDismissEnabled(boolean z2) {
        this.w = z2;
    }

    public void setTargetDrawable(Drawable drawable) {
        this.G = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            drawable.setCallback(this);
        }
    }

    public void setTargetScale(float f) {
        float f2 = this.H;
        this.H = f;
        if (!this.N || f2 == f) {
            return;
        }
        requestLayout();
    }

    public void setTargetShadowEnabled(boolean z2) {
        this.I = z2;
        if (this.i != null) {
            if (z2) {
                p();
                return;
            }
            ImageView imageView = this.l;
            if (imageView == null) {
                return;
            }
            removeView(imageView);
            this.l = null;
        }
    }

    public void setTargetTextColor(int i) {
        this.E = i;
    }

    public void setTargetViewTintColor(int i) {
        this.P = i;
        Paint paint = new Paint();
        paint.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        this.O = paint;
        if (k()) {
            q();
        }
    }

    public void setText(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        this.h.setText(charSequence, charSequence2, charSequence3);
    }

    public void setTextVerticalGravityHint(int i) {
        this.J.g = i;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i == getVisibility()) {
            super.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i != 8 && i != 4) {
            if (i != 0) {
                return;
            }
            sendAccessibilityEvent(32);
            u(true);
            return;
        }
        u(false);
        ViewParent u = od.u(this);
        if (!(u instanceof View)) {
            return;
        }
        ((View) u).sendAccessibilityEvent(32);
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f || drawable == this.g || drawable == this.G;
    }

    public csme(Context context, cslo csloVar) {
        super(context);
        this.B = new int[2];
        this.b = new Rect();
        this.C = new Rect();
        this.D = new Rect();
        this.c = new Rect();
        this.d = new Rect();
        this.e = new Rect();
        this.H = 1.0f;
        this.o = false;
        this.p = 0.0f;
        this.q = 0.0f;
        this.r = false;
        this.v = true;
        this.w = true;
        this.N = false;
        this.S = new cslr(this);
        setId(R.id.featurehighlight_view);
        setWillNotDraw(false);
        csmh csmhVar = new csmh(context);
        this.g = csmhVar;
        csmhVar.setCallback(this);
        csmj csmjVar = new csmj(context);
        this.f = csmjVar;
        csmjVar.setCallback(this);
        this.J = new csmi(this);
        this.y = (AccessibilityManager) getContext().getSystemService("accessibility");
        ni niVar = new ni(context, new csls(this));
        this.K = niVar;
        niVar.b(false);
        ni niVar2 = new ni(getContext(), new cslt(this));
        this.L = niVar2;
        niVar2.b(false);
        this.Q = csloVar;
        cslo csloVar2 = cslo.Legacy;
        int i = R.layout.gm_text_content;
        if (csloVar == csloVar2) {
            i = R.layout.text_content;
        } else {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(A);
            boolean hasValue = obtainStyledAttributes.hasValue(0);
            obtainStyledAttributes.recycle();
            if (!hasValue) {
                context = new uf(context, 2132018351);
            }
        }
        setContent((cslg) LayoutInflater.from(context).inflate(i, (ViewGroup) this, false));
        setCallback(new csmc(this));
        setVisibility(8);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public void setPulseColor(int i, int i2) {
        this.g.a(i);
        this.g.b(i2);
    }
}
