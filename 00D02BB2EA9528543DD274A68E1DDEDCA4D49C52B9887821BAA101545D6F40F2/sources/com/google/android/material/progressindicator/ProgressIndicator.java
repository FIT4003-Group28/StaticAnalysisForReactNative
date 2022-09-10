package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ProgressBar;
import com.google.android.apps.maps.R;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ProgressIndicator extends ProgressBar {
    public int a;
    public boolean b;
    public boolean c;
    public int d;
    private final dact e;
    private dabi f;
    private dabr g;
    private daco h;
    private boolean i;
    private boolean j;
    private int k;
    private final Runnable l;
    private final Runnable m;
    private final azu n;
    private final azu o;

    public ProgressIndicator(Context context) {
        this(context, null);
    }

    private final void h() {
        dabz dacnVar;
        if (this.i) {
            dabr dabrVar = this.g;
            setIndeterminateDrawable(new dacb(getContext(), dabrVar, new dabj(this.g), new dabq(this.g)));
            setProgressDrawable(new dabt(getContext(), this.f, dabrVar, new dabj(this.g)));
        } else {
            daco dacoVar = this.h;
            Context context = getContext();
            dacc daccVar = new dacc(this.h);
            if (g()) {
                dacnVar = new dach(this.h);
            } else {
                dacnVar = new dacn(getContext(), this.h);
            }
            setIndeterminateDrawable(new dacb(context, dacoVar, daccVar, dacnVar));
            setProgressDrawable(new dabt(getContext(), this.f, dacoVar, new dacc(this.h)));
        }
        i();
    }

    private final void i() {
        if (!this.j) {
            return;
        }
        getCurrentDrawable().setVisible(e(), false);
    }

    private final boolean j() {
        return isIndeterminate() && this.e.a == 0 && this.f.c.length >= 3;
    }

    public final void a() {
        if (this.k > 0) {
            SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    @Override // android.widget.ProgressBar
    /* renamed from: b */
    public final dabx getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    @Override // android.widget.ProgressBar
    /* renamed from: c */
    public final dabt getProgressDrawable() {
        return (dabt) super.getProgressDrawable();
    }

    @Override // android.widget.ProgressBar
    /* renamed from: d */
    public final dacb getIndeterminateDrawable() {
        return (dacb) super.getIndeterminateDrawable();
    }

    public final boolean e() {
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

    public final int f() {
        return this.f.a;
    }

    public final boolean g() {
        return this.e.f;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().b.g(this.n);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().c(this.o);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().c(this.o);
        }
        if (e()) {
            a();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onDetachedFromWindow() {
        removeCallbacks(this.m);
        removeCallbacks(this.l);
        getCurrentDrawable().i();
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().j(this.o);
            getIndeterminateDrawable().b.h();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().j(this.o);
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
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final synchronized void onMeasure(int i, int i2) {
        daby dabyVar;
        int paddingLeft;
        int paddingTop;
        super.onMeasure(i, i2);
        if (isIndeterminate()) {
            dabyVar = getIndeterminateDrawable().a;
        } else {
            dabyVar = getProgressDrawable().a;
        }
        int a = dabyVar.a();
        int b = dabyVar.b();
        if (a < 0) {
            paddingLeft = getMeasuredWidth();
        } else {
            paddingLeft = a + getPaddingLeft() + getPaddingRight();
        }
        if (b < 0) {
            paddingTop = getMeasuredHeight();
        } else {
            paddingTop = b + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(paddingLeft, paddingTop);
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (this.e.a == 0) {
            int paddingLeft = i - (getPaddingLeft() + getPaddingRight());
            int paddingTop = i2 - (getPaddingTop() + getPaddingBottom());
            dacb indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable != null) {
                indeterminateDrawable.setBounds(0, 0, paddingLeft, paddingTop);
            }
            dabt progressDrawable = getProgressDrawable();
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
        i();
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        i();
    }

    public void setAnimatorDurationScaleProvider(dabh dabhVar) {
        if (getProgressDrawable() != null) {
            getProgressDrawable().e = dabhVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().e = dabhVar;
        }
    }

    public void setCircularInset(int i) {
        if (this.i) {
            dabr dabrVar = this.g;
            if (dabrVar.c == i) {
                return;
            }
            this.e.d = i;
            dabrVar.c = i;
            invalidate();
        }
    }

    public void setCircularRadius(int i) {
        if (this.i) {
            dabr dabrVar = this.g;
            if (dabrVar.b == i) {
                return;
            }
            this.e.e = i;
            dabrVar.b = i;
            invalidate();
        }
    }

    public void setGrowMode(int i) {
        dact dactVar = this.e;
        if (dactVar.c != i) {
            dactVar.c = i;
            if (this.i) {
                this.g.e = dabr.d(i);
                this.g.f = dabr.e(i);
            } else {
                this.h.c = daco.d(i);
                this.h.d = daco.e(i);
            }
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        if (z == isIndeterminate()) {
            return;
        }
        if (!z && g()) {
            return;
        }
        if (e() && z) {
            throw new IllegalStateException("Cannot switch to indeterminate mode while the progress indicator is visible.");
        }
        dabx currentDrawable = getCurrentDrawable();
        if (currentDrawable != null) {
            currentDrawable.i();
        }
        super.setIndeterminate(z);
        dabx currentDrawable2 = getCurrentDrawable();
        if (currentDrawable2 != null) {
            currentDrawable2.a(e(), false, false);
        }
        this.c = false;
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else if (drawable instanceof dacb) {
            ((dacb) drawable).i();
            super.setIndeterminateDrawable(drawable);
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    public void setIndicatorColors(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            iArr = new int[]{czxb.a(getContext(), R.attr.colorPrimary, -1)};
        }
        if (!Arrays.equals(this.f.c, iArr)) {
            this.f.c = iArr;
            getIndeterminateDrawable().b.f();
            if (!j()) {
                this.e.f = false;
            }
            invalidate();
        }
    }

    public void setIndicatorCornerRadius(int i) {
        dabi dabiVar = this.f;
        if (dabiVar.b != i) {
            dabiVar.b = Math.min(i, f() / 2);
            dact dactVar = this.e;
            if (dactVar.a == 0 && dactVar.f && i > 0) {
                throw new IllegalArgumentException("Rounded corners are not supported in linear seamless mode.");
            }
        }
    }

    public void setIndicatorSize(int i) {
        if (f() != i) {
            this.f.a = i;
            requestLayout();
        }
    }

    public void setIndicatorType(int i) {
        if (this.e.a != i) {
            if (!e()) {
                dact dactVar = this.e;
                dactVar.a = i;
                boolean z = true;
                if (i != 1) {
                    z = false;
                }
                this.i = z;
                if (z) {
                    dabr dabrVar = new dabr(dactVar);
                    this.g = dabrVar;
                    this.h = null;
                    this.f = dabrVar.a;
                } else {
                    this.g = null;
                    daco dacoVar = new daco(dactVar);
                    this.h = dacoVar;
                    this.f = dacoVar.a;
                }
                h();
                requestLayout();
                return;
            }
            throw new IllegalStateException("Cannot change indicatorType while the progress indicator is visible.");
        }
    }

    public void setInverse(boolean z) {
        boolean z2 = this.i;
        boolean z3 = false;
        if ((!z2 ? this.h.b == 1 : this.g.d == 1) != z) {
            this.e.b = z;
            if (z2) {
                this.g.d = dabr.c(z);
            } else {
                this.h.b = daco.c(z);
                daco dacoVar = this.h;
                if (dacoVar.b == 1) {
                    z3 = true;
                } else if (od.s(this) == 1) {
                    int i = this.h.b;
                }
                dacoVar.e = z3;
            }
            invalidate();
        }
    }

    public void setLinearSeamless(boolean z) {
        if (this.e.f == z) {
            return;
        }
        if (!e() || !isIndeterminate()) {
            if (j()) {
                this.e.f = z;
                this.h.b = !z;
                if (z == 0) {
                    getIndeterminateDrawable().b(new dacn(getContext(), this.h));
                } else {
                    this.f.b = 0;
                    getIndeterminateDrawable().b(new dach(this.h));
                }
            } else {
                this.e.f = false;
            }
            invalidate();
            return;
        }
        throw new IllegalStateException("Cannot change linearSeamless while the progress indicator is shown in indeterminate mode.");
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        setProgressCompat(i, false);
    }

    public void setProgressCompat(int i, boolean z) {
        if (isIndeterminate()) {
            if (getProgressDrawable() == null || g()) {
                return;
            }
            this.a = i;
            this.b = z;
            this.c = true;
            if (dabh.a(getContext().getContentResolver()) == 0.0f) {
                azu azuVar = this.n;
                getIndeterminateDrawable();
                azuVar.b();
                return;
            }
            getIndeterminateDrawable().b.d();
            return;
        }
        super.setProgress(i);
        if (getProgressDrawable() == null || z) {
            return;
        }
        getProgressDrawable().jumpToCurrentState();
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else if (drawable instanceof dabt) {
            dabt dabtVar = (dabt) drawable;
            dabtVar.i();
            super.setProgressDrawable(dabtVar);
            dabtVar.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }

    public void setTrackColor(int i) {
        dabi dabiVar = this.f;
        if (dabiVar.d != i) {
            dabiVar.d = i;
            getIndeterminateDrawable().b.f();
            invalidate();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i == 0 || i == 4 || i == 8) {
            this.d = i;
            return;
        }
        throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
    }

    public ProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.progressIndicatorStyle);
    }

    public ProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 2132018779);
    }

    public ProgressIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(daib.a(context, attributeSet, i, 2132018779), attributeSet, i);
        boolean z = false;
        this.c = false;
        this.d = 4;
        this.l = new dacp(this);
        this.m = new dacq(this);
        this.n = new dacr(this);
        this.o = new dacs(this);
        this.j = true;
        Context context2 = getContext();
        dact dactVar = new dact(context2, attributeSet, i, i2);
        this.e = dactVar;
        this.f = dactVar.g;
        z = dactVar.a == 1 ? true : z;
        this.i = z;
        if (z) {
            dabr dabrVar = new dabr(dactVar);
            this.g = dabrVar;
            this.h = null;
            this.f = dabrVar.a;
        } else {
            this.g = null;
            daco dacoVar = new daco(dactVar);
            this.h = dacoVar;
            this.f = dacoVar.a;
        }
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, dacu.a, i, i2);
        obtainStyledAttributes.getInt(12, -1);
        this.k = Math.min(obtainStyledAttributes.getInt(11, -1), 1000);
        obtainStyledAttributes.recycle();
        h();
    }
}
