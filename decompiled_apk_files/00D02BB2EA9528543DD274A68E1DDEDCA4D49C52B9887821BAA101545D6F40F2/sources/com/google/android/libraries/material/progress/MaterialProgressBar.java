package com.google.android.libraries.material.progress;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ProgressBar;
import com.google.android.apps.maps.R;
/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public class MaterialProgressBar extends ProgressBar {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private csmy f;
    private Drawable g;

    public MaterialProgressBar(Context context) {
        super(context, null, 16842872);
        super.getProgress();
    }

    private final void f() {
        if (isIndeterminate()) {
            if (this.a != 0) {
                setMinimumHeight(this.d);
            } else {
                setMinimumHeight(0);
            }
        } else if (this.b != 0) {
            setMinimumHeight(this.d);
        } else {
            setMinimumHeight(0);
        }
    }

    private final void g(TypedArray typedArray, boolean z) {
        int[] iArr;
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelSize3;
        int[] iArr2 = csnh.a;
        int i = typedArray.getInt(7, 3);
        if (typedArray.hasValue(1)) {
            iArr = getResources().getIntArray(typedArray.getResourceId(1, -1));
        } else {
            iArr = typedArray.hasValue(0) ? new int[]{typedArray.getColor(0, 0)} : null;
        }
        if (iArr == null) {
            iArr = getResources().getIntArray(R.array.material_google_colors);
        }
        if (i == 1) {
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.material_progress_circle_size_small);
        } else if (i == 2) {
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.material_progress_circle_size_medium);
        } else if (i == 3) {
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.material_progress_circle_size_large);
        } else {
            throw new IllegalStateException("Invalid progress circle size");
        }
        this.c = dimensionPixelSize;
        if (i == 1) {
            dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.material_progress_circle_stroke_width_small);
        } else if (i == 2) {
            dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.material_progress_circle_stroke_width_medium);
        } else if (i == 3) {
            dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.material_progress_circle_stroke_width_large);
        } else {
            throw new IllegalStateException("Invalid progress circle size");
        }
        if (i == 1) {
            dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.material_progress_circle_inset_small);
        } else if (i == 2) {
            dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.material_progress_circle_inset_medium);
        } else if (i == 3) {
            dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.material_progress_circle_inset_large);
        } else {
            throw new IllegalStateException("Invalid progress circle size");
        }
        if (z) {
            this.g = getContext().getDrawable(2131232934);
            csmy csmyVar = new csmy(dimensionPixelSize2, dimensionPixelSize3, iArr);
            this.f = csmyVar;
            setIndeterminateDrawable(csmyVar);
            return;
        }
        setProgressDrawable(new csmu(dimensionPixelSize2, dimensionPixelSize3, iArr[0]));
    }

    private final void h(TypedArray typedArray, boolean z) {
        int color;
        int[] iArr = csnh.a;
        if (typedArray.hasValue(0)) {
            color = typedArray.getColor(0, -1);
        } else {
            color = getResources().getColor(R.color.quantum_googblue);
        }
        int i = color;
        int color2 = typedArray.getColor(8, -1);
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{16842803});
        float f = obtainStyledAttributes.getFloat(0, 0.2f);
        obtainStyledAttributes.recycle();
        int i2 = typedArray.getInt(6, 0);
        float f2 = color2 != -1 ? 1.0f : f;
        if (z) {
            setIndeterminateDrawable(new csnf(this.d, i, color2, f2, this.a == 2, i(i2)));
        } else {
            setProgressDrawable(new csnb(this.d, i, color2, f2, i(i2)));
        }
    }

    private static int i(int i) {
        if (i != 0) {
            if (i == 1) {
                return 1;
            }
            if (i == 2) {
                return 2;
            }
            StringBuilder sb = new StringBuilder(59);
            sb.append("Invalid attribute value for mtrlLinearGrowFrom: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        return 0;
    }

    private final int j() {
        return isIndeterminate() ? this.a : this.b;
    }

    private final void k() {
        if (j() == 0 && isIndeterminate()) {
            if (csla.a(getContext())) {
                if (d() != this.g) {
                    this.f.b();
                    this.f.setCallback(null);
                    unscheduleDrawable(this.f);
                    setIndeterminateDrawable(this.g);
                    onSizeChanged(getWidth(), getHeight(), getWidth(), getHeight());
                }
            } else if (d() != this.f) {
                this.g.setVisible(false, false);
                this.g.setCallback(null);
                unscheduleDrawable(this.g);
                setIndeterminateDrawable(this.f);
                onSizeChanged(getWidth(), getHeight(), getWidth(), getHeight());
            }
        }
        Drawable d = d();
        if (d == null) {
            return;
        }
        boolean c = c();
        if (!(d instanceof csmr) || c) {
            d.setVisible(c, true);
        } else {
            ((csmr) d).b();
        }
    }

    public final void a() {
        f();
        if (isIndeterminate()) {
            getProgressDrawable().setVisible(false, false);
            getIndeterminateDrawable().setVisible(c(), true);
            return;
        }
        getProgressDrawable().setVisible(c(), true);
        getIndeterminateDrawable().setVisible(false, false);
    }

    public final void b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, csnh.a, i, i2);
        this.d = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.e = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        int i3 = obtainStyledAttributes.getInt(3, 0);
        this.a = i3;
        if (i3 == 0) {
            g(obtainStyledAttributes, true);
        } else if (i3 == 1 || i3 == 2) {
            h(obtainStyledAttributes, true);
        } else {
            throw new IllegalArgumentException("Invalid determinate progress style");
        }
        int i4 = obtainStyledAttributes.getInt(2, 1);
        this.b = i4;
        if (i4 == 0) {
            g(obtainStyledAttributes, false);
        } else if (i4 == 1) {
            h(obtainStyledAttributes, false);
        } else {
            throw new IllegalArgumentException("Invalid determinate progress style");
        }
        obtainStyledAttributes.recycle();
    }

    public final boolean c() {
        if (!od.ak(this) || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            } else if (!(parent instanceof View)) {
                return true;
            } else {
                view = (View) parent;
            }
        }
        return false;
    }

    public final Drawable d() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public final void e() {
        if (getVisibility() != 0) {
            setVisibility(0);
        } else if (!c()) {
        } else {
            d().setVisible(true, false);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (c()) {
            e();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onDetachedFromWindow() {
        if (d() instanceof csmr) {
            ((csmr) d()).b();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final synchronized void onDraw(Canvas canvas) {
        int save = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        d().draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (j() == 0) {
            setMeasuredDimension(this.c + getPaddingLeft() + getPaddingRight(), this.c + getPaddingTop() + getPaddingBottom());
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int i3 = this.d;
        int i4 = this.e;
        setMeasuredDimension(measuredWidth, resolveSizeAndState(i3 + i4 + i4 + getPaddingTop() + getPaddingBottom(), i2, 0));
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (j() != 0) {
            int paddingLeft = i - (getPaddingLeft() + getPaddingRight());
            int paddingTop = i2 - (getPaddingTop() + getPaddingBottom());
            Drawable indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable != null) {
                indeterminateDrawable.setBounds(0, 0, paddingLeft, paddingTop);
            }
            Drawable progressDrawable = getProgressDrawable();
            if (progressDrawable == null) {
                return;
            }
            progressDrawable.setBounds(0, 0, paddingLeft, paddingTop);
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        k();
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        k();
    }

    public void setColor(int i) {
        if (this.b != 0) {
            ((csnb) getProgressDrawable()).c(i);
        } else {
            ((csmu) getProgressDrawable()).c(i);
        }
        if (this.a != 0) {
            ((csnf) getIndeterminateDrawable()).c(i);
        } else {
            this.f.c(new int[]{i});
        }
    }

    public void setColors(int[] iArr) {
        if (iArr.length != 0) {
            if (this.b != 0) {
                ((csnb) getProgressDrawable()).c(iArr[0]);
            } else {
                ((csmu) getProgressDrawable()).c(iArr[0]);
            }
            if (this.a != 0) {
                ((csnf) getIndeterminateDrawable()).c(iArr[0]);
                return;
            } else {
                this.f.c(iArr);
                return;
            }
        }
        throw new IllegalArgumentException("You must provide at least one color");
    }

    public void setGrowFrom(int i) {
        float f = 0.0f;
        if (this.b != 0) {
            csnb csnbVar = (csnb) getProgressDrawable();
            csnbVar.c = i;
            float f2 = i != 2 ? 0.0f : 1.0f;
            csnbVar.e = f2;
            csnbVar.d.setFloatValues(f2);
            csnbVar.invalidateSelf();
        }
        if (this.a != 0) {
            csnf csnfVar = (csnf) getIndeterminateDrawable();
            csnfVar.c = i;
            if (i == 2) {
                f = 1.0f;
            }
            csnfVar.f = f;
            csnfVar.e.setFloatValues(f);
            csnfVar.invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        super.setIndeterminate(z);
        f();
        Drawable d = d();
        if (d != null) {
            d.setVisible(c(), false);
        }
    }

    public void setLinearBarHeight(int i) {
        this.d = i;
        if (this.b != 0) {
            csnb csnbVar = (csnb) getProgressDrawable();
            csnbVar.a = i;
            csnbVar.invalidateSelf();
        }
        if (this.a != 0) {
            csnf csnfVar = (csnf) getIndeterminateDrawable();
            csnfVar.a = i;
            csnfVar.invalidateSelf();
        }
        f();
    }

    public void setLinearBarInset(int i) {
        this.e = i;
        f();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        super.setProgress(i);
    }

    public void setProgressImmediately(int i) {
        if (!isIndeterminate()) {
            setProgress(i);
            if (this.b != 1) {
                return;
            }
            ((csnb) getProgressDrawable()).d();
        }
    }

    public void setTrackColor(int i) {
        if (this.b != 0) {
            csnb csnbVar = (csnb) getProgressDrawable();
            csnbVar.b = i;
            csnbVar.invalidateSelf();
        }
        if (this.a != 0) {
            csnf csnfVar = (csnf) getIndeterminateDrawable();
            csnfVar.b = i;
            csnfVar.invalidateSelf();
        }
    }

    public MaterialProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.getProgress();
        b(context, attributeSet, 0, 2132018552);
        a();
    }

    public MaterialProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.getProgress();
        b(context, attributeSet, i, 2132018552);
        a();
    }
}
