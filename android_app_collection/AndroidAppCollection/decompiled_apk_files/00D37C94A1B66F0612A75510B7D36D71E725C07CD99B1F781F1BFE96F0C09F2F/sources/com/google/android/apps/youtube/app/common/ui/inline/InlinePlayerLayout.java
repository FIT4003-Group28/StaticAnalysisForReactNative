package com.google.android.apps.youtube.app.common.ui.inline;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EdgeEffect;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class InlinePlayerLayout extends ViewGroup implements ezg, fel {
    public EdgeEffect a;
    public EdgeEffect b;
    public final zao c;
    public final ezr d;
    public InlinePlayerOverlayLayout e;
    int f;
    int g;
    private final float h;
    private View i;
    private boolean j;

    InlinePlayerLayout(Context context, float f, zao zaoVar) {
        super(context);
        this.h = f;
        this.c = zaoVar;
        this.d = new ezr();
        h();
    }

    private final void g() {
        setVisibility(8);
    }

    private final void h() {
        this.c.c = new fzh(this);
    }

    private static final void i(View view, int i, int i2, float f, float f2) {
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setTranslationX(i);
        view.setTranslationY(i2);
        view.setScaleX(f);
        view.setScaleY(f2);
    }

    @Override // defpackage.fel
    public final void a(View view) {
        InlinePlayerOverlayLayout inlinePlayerOverlayLayout = this.e;
        if (inlinePlayerOverlayLayout == null) {
            addView(view);
        } else {
            inlinePlayerOverlayLayout.addView(view);
        }
    }

    @Override // defpackage.fel
    public final void b(View view, View view2) {
        aqxo.y(!f());
        view.getClass();
        this.i = view;
        addView(view, 0);
        InlinePlayerOverlayLayout inlinePlayerOverlayLayout = this.e;
        if (inlinePlayerOverlayLayout == null) {
            addView(view2, 1);
        } else {
            inlinePlayerOverlayLayout.addView(view2);
        }
    }

    @Override // defpackage.fel
    public final void c(View view, View view2) {
        if (view != this.i) {
            return;
        }
        aqxo.y(f());
        InlinePlayerOverlayLayout inlinePlayerOverlayLayout = this.e;
        if (inlinePlayerOverlayLayout == null) {
            removeView(view2);
        } else {
            inlinePlayerOverlayLayout.removeView(view2);
        }
        removeView(this.i);
        this.i = null;
        g();
    }

    @Override // defpackage.fel
    public final void d(View view) {
        InlinePlayerOverlayLayout inlinePlayerOverlayLayout = this.e;
        if (inlinePlayerOverlayLayout == null) {
            removeView(view);
        } else {
            inlinePlayerOverlayLayout.removeView(view);
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        canvas.save();
        canvas.clipRect(this.c.d.b);
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    public final void e() {
        float f;
        if (!f()) {
            return;
        }
        zaj zajVar = this.c.d;
        if (zajVar.e()) {
            Rect rect = zajVar.a;
            int i = rect.left;
            int i2 = rect.top;
            float f2 = 1.0f;
            if (this.j || (rect.width() == this.f && rect.height() == this.g)) {
                f = 1.0f;
            } else {
                float width = this.f == 0 ? 1.0f : rect.width() / this.f;
                if (this.g != 0) {
                    f2 = rect.height() / this.g;
                }
                this.f = rect.width();
                this.g = rect.height();
                if (!lj.ak(this)) {
                    requestLayout();
                }
                f = f2;
                f2 = width;
            }
            if (getVisibility() == 8) {
                setVisibility(0);
            }
            this.d.a(this.f, this.g, false);
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                View view = this.i;
                if (childAt == view) {
                    view.setPivotX(0.0f);
                    this.i.setPivotY(0.0f);
                    this.i.setTranslationX(i);
                    this.i.setTranslationY(i2);
                } else {
                    i(childAt, i, i2, f2, f);
                }
            }
            return;
        }
        g();
    }

    public final boolean f() {
        return this.i != null;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        EdgeEffect edgeEffect = this.a;
        boolean z = false;
        if (edgeEffect != null && !edgeEffect.isFinished() && this.a.draw(canvas)) {
            z = true;
        }
        EdgeEffect edgeEffect2 = this.b;
        if (edgeEffect2 != null && !edgeEffect2.isFinished()) {
            int save = canvas.save();
            canvas.rotate(180.0f);
            canvas.translate(-getWidth(), -getHeight());
            z |= this.b.draw(canvas);
            canvas.restoreToCount(save);
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        EdgeEffect edgeEffect = this.a;
        if (edgeEffect != null) {
            edgeEffect.setSize(i3 - i, i4 - i2);
        }
        EdgeEffect edgeEffect2 = this.b;
        if (edgeEffect2 != null) {
            edgeEffect2.setSize(i3 - i, i4 - i2);
        }
        e();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (z || childAt.getVisibility() != 8) {
                childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int round;
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        if (this.j) {
            round = View.MeasureSpec.getSize(i2);
        } else {
            round = Math.round(size / this.h);
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int i4 = this.f;
            if (i4 <= 0 || this.g <= 0 || this.j) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(round, 1073741824));
            } else {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(this.g, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        e();
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        i(view, 0, 0, 1.0f, 1.0f);
    }

    @Override // defpackage.ezg
    public final void pa(ezx ezxVar) {
        boolean z = this.j;
        boolean b = ezxVar.b();
        this.j = b;
        if (z != b && b) {
            requestLayout();
        }
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pb(ezx ezxVar, ezx ezxVar2) {
        hqb.m(this, ezxVar2);
    }

    @Override // android.view.View, defpackage.fel
    public final void setAlpha(float f) {
    }

    public InlinePlayerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = context.getResources().getFraction(R.fraction.aspect_ratio_16_9_exact, 1, 1);
        this.c = new zao(this);
        this.d = new ezr();
        h();
    }
}
