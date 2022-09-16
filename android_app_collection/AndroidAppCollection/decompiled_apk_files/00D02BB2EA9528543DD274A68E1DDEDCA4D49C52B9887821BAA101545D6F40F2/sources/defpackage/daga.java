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
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: daga  reason: default package */
/* loaded from: classes5.dex */
public final class daga extends LinearLayout {
    ValueAnimator a;
    int b;
    float c;
    final /* synthetic */ dagg d;
    private int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daga(dagg daggVar, Context context) {
        super(context);
        this.d = daggVar;
        this.b = -1;
        this.e = -1;
        setWillNotDraw(false);
    }

    private final void d() {
        View childAt = getChildAt(this.b);
        dagg daggVar = this.d;
        Drawable drawable = daggVar.l;
        RectF b = dafr.b(daggVar, childAt);
        drawable.setBounds((int) b.left, drawable.getBounds().top, (int) b.right, drawable.getBounds().bottom);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i) {
        Rect bounds = this.d.l.getBounds();
        this.d.l.setBounds(bounds.left, 0, bounds.right, i);
        requestLayout();
    }

    public final void b(View view, View view2, float f) {
        if (view != null && view.getWidth() > 0) {
            dagg daggVar = this.d;
            daggVar.z.a(daggVar, view, view2, f, daggVar.l);
        } else {
            Drawable drawable = this.d.l;
            drawable.setBounds(-1, drawable.getBounds().top, -1, this.d.l.getBounds().bottom);
        }
        od.i(this);
    }

    public final void c(boolean z, int i, int i2) {
        View childAt = getChildAt(this.b);
        View childAt2 = getChildAt(i);
        if (childAt2 == null) {
            d();
            return;
        }
        dafy dafyVar = new dafy(this, childAt, childAt2);
        if (z) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.a = valueAnimator;
            valueAnimator.setInterpolator(czum.b);
            valueAnimator.setDuration(i2);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(dafyVar);
            valueAnimator.addListener(new dafz(this, i));
            valueAnimator.start();
            return;
        }
        this.a.removeAllUpdateListeners();
        this.a.addUpdateListener(dafyVar);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int height = this.d.l.getBounds().height();
        if (height < 0) {
            height = this.d.l.getIntrinsicHeight();
        }
        int i = this.d.u;
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
        if (this.d.l.getBounds().width() > 0) {
            Rect bounds = this.d.l.getBounds();
            this.d.l.setBounds(bounds.left, i2, bounds.right, height);
            dagg daggVar = this.d;
            Drawable drawable = daggVar.l;
            if (daggVar.m != 0) {
                drawable = ks.b(drawable);
                if (Build.VERSION.SDK_INT == 21) {
                    drawable.setColorFilter(this.d.m, PorterDuff.Mode.SRC_IN);
                } else {
                    drawable.setTint(this.d.m);
                }
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
            d();
        } else {
            c(false, this.b, -1);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            return;
        }
        dagg daggVar = this.d;
        if (daggVar.s != 1 && daggVar.v != 2) {
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
        int b = (int) dabd.b(getContext(), 16);
        if (i3 * childCount <= getMeasuredWidth() - (b + b)) {
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
            dagg daggVar2 = this.d;
            daggVar2.s = 0;
            daggVar2.q(false);
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
