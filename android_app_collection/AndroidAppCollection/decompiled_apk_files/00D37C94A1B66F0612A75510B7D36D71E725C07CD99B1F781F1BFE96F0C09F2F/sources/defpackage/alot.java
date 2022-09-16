package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;
/* compiled from: PG */
/* renamed from: alot  reason: default package */
/* loaded from: classes.dex */
public final class alot extends LinearLayout {
    public ValueAnimator a;
    public int b;
    public float c;
    public final /* synthetic */ TabLayout d;
    private int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alot(TabLayout tabLayout, Context context) {
        super(context);
        this.d = tabLayout;
        this.b = -1;
        this.e = -1;
        setWillNotDraw(false);
    }

    private final void c() {
        View childAt = getChildAt(this.b);
        TabLayout tabLayout = this.d;
        Drawable drawable = tabLayout.i;
        RectF m = anqx.m(tabLayout, childAt);
        drawable.setBounds((int) m.left, drawable.getBounds().top, (int) m.right, drawable.getBounds().bottom);
    }

    public final void a(View view, View view2, float f) {
        if (view != null && view.getWidth() > 0) {
            TabLayout tabLayout = this.d;
            tabLayout.w.a(tabLayout, view, view2, f, tabLayout.i);
        } else {
            Drawable drawable = this.d.i;
            drawable.setBounds(-1, drawable.getBounds().top, -1, this.d.i.getBounds().bottom);
        }
        lj.G(this);
    }

    public final void b(boolean z, int i, int i2) {
        View childAt = getChildAt(this.b);
        View childAt2 = getChildAt(i);
        if (childAt2 == null) {
            c();
            return;
        }
        alor alorVar = new alor(this, childAt, childAt2);
        if (z) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.a = valueAnimator;
            valueAnimator.setInterpolator(alhv.b);
            valueAnimator.setDuration(i2);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(alorVar);
            valueAnimator.addListener(new alos(this, i));
            valueAnimator.start();
            return;
        }
        this.a.removeAllUpdateListeners();
        this.a.addUpdateListener(alorVar);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int height = this.d.i.getBounds().height();
        if (height < 0) {
            height = this.d.i.getIntrinsicHeight();
        }
        int i = this.d.q;
        int i2 = 0;
        if (i == 0) {
            i2 = getHeight() - height;
            height = getHeight();
        } else if (i == 1) {
            i2 = (getHeight() - height) / 2;
            height = (getHeight() + height) / 2;
        } else if (i != 2) {
            height = i != 3 ? 0 : getHeight();
        }
        if (this.d.i.getBounds().width() > 0) {
            Rect bounds = this.d.i.getBounds();
            this.d.i.setBounds(bounds.left, i2, bounds.right, height);
            TabLayout tabLayout = this.d;
            Drawable drawable = tabLayout.i;
            if (tabLayout.j != 0) {
                drawable = iy.l(drawable);
                if (Build.VERSION.SDK_INT == 21) {
                    drawable.setColorFilter(this.d.j, PorterDuff.Mode.SRC_IN);
                } else {
                    drawable.setTint(this.d.j);
                }
            } else if (Build.VERSION.SDK_INT != 21) {
                drawable.setTintList(null);
            } else {
                drawable.setColorFilter(null);
            }
            drawable.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            c();
        } else {
            b(false, this.b, -1);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            return;
        }
        TabLayout tabLayout = this.d;
        if (tabLayout.o != 1 && tabLayout.r != 2) {
            return;
        }
        int childCount = getChildCount();
        int i3 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 0) {
                i3 = Math.max(i3, childAt.getMeasuredWidth());
            }
        }
        if (i3 <= 0) {
            return;
        }
        int t = (int) amyv.t(getContext(), 16);
        if (i3 * childCount <= getMeasuredWidth() - (t + t)) {
            boolean z = false;
            for (int i5 = 0; i5 < childCount; i5++) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                    layoutParams.width = i3;
                    layoutParams.weight = 0.0f;
                    z = true;
                }
            }
            if (!z) {
                return;
            }
        } else {
            TabLayout tabLayout2 = this.d;
            tabLayout2.o = 0;
            tabLayout2.k(false);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (Build.VERSION.SDK_INT >= 23 || this.e == i) {
            return;
        }
        requestLayout();
        this.e = i;
    }
}
