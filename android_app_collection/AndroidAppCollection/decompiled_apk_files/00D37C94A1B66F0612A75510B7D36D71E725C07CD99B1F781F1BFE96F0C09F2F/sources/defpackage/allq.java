package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ProgressBar;
/* compiled from: PG */
/* renamed from: allq  reason: default package */
/* loaded from: classes.dex */
public abstract class allq extends ProgressBar {
    public final allr a;
    public int b;
    public final int c;
    public final int d;
    public long e;
    public boolean f;
    public final int g;
    public final Runnable h;
    public final Runnable i;
    private final boolean j;
    private final bol k;
    private final bol l;

    /* JADX INFO: Access modifiers changed from: protected */
    public allq(Context context, AttributeSet attributeSet, int i, int i2) {
        super(alqt.a(context, attributeSet, i, 2132084442), attributeSet, i);
        this.e = -1L;
        this.f = false;
        this.g = 4;
        this.h = new alln(this, 1);
        this.i = new alln(this);
        this.k = new allo(this);
        this.l = new allp(this);
        Context context2 = getContext();
        this.a = a(context2, attributeSet);
        TypedArray a = alli.a(context2, attributeSet, almg.a, i, i2, new int[0]);
        this.c = a.getInt(5, -1);
        this.d = Math.min(a.getInt(3, -1), 1000);
        a.recycle();
        this.j = true;
    }

    public abstract allr a(Context context, AttributeSet attributeSet);

    @Override // android.widget.ProgressBar
    /* renamed from: b */
    public final ally getProgressDrawable() {
        return (ally) super.getProgressDrawable();
    }

    @Override // android.widget.ProgressBar
    /* renamed from: c */
    public final almf getIndeterminateDrawable() {
        return (almf) super.getIndeterminateDrawable();
    }

    protected final void d(boolean z) {
        if (!this.j) {
            return;
        }
        ((almc) getCurrentDrawable()).h(f(), false, z);
    }

    public final void e() {
        if (this.d > 0) {
            this.e = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    final boolean f() {
        if (!lj.aj(this) || getWindowVisibility() != 0) {
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

    public final void g(int i) {
        if (isIndeterminate()) {
            if (getProgressDrawable() == null) {
                return;
            }
            this.b = i;
            this.f = true;
            if (!getIndeterminateDrawable().isVisible() || amyv.p(getContext().getContentResolver()) == 0.0f) {
                bol bolVar = this.k;
                getIndeterminateDrawable();
                bolVar.a();
                return;
            }
            allw allwVar = (allw) getIndeterminateDrawable().b;
            if (allwVar.d.isRunning()) {
                return;
            }
            if (!allwVar.k.isVisible()) {
                allwVar.a();
                return;
            } else {
                allwVar.d.start();
                return;
            }
        }
        super.setProgress(i);
        if (getProgressDrawable() == null) {
            return;
        }
        getProgressDrawable().jumpToCurrentState();
    }

    @Override // android.widget.ProgressBar
    public final Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
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
            ((allw) getIndeterminateDrawable().b).j = this.k;
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().d(this.l);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().d(this.l);
        }
        if (f()) {
            e();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onDetachedFromWindow() {
        removeCallbacks(this.i);
        removeCallbacks(this.h);
        ((almc) getCurrentDrawable()).j();
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().k(this.l);
            ((allw) getIndeterminateDrawable().b).j = null;
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().k(this.l);
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
        int paddingLeft;
        int paddingTop;
        super.onMeasure(i, i2);
        almd almdVar = null;
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() != null) {
                almdVar = getIndeterminateDrawable().a;
            }
        } else if (getProgressDrawable() != null) {
            almdVar = getProgressDrawable().a;
        }
        if (almdVar == null) {
            return;
        }
        int a = almdVar.a();
        int a2 = almdVar.a();
        if (a < 0) {
            paddingLeft = getMeasuredWidth();
        } else {
            paddingLeft = a + getPaddingLeft() + getPaddingRight();
        }
        if (a2 < 0) {
            paddingTop = getMeasuredHeight();
        } else {
            paddingTop = a2 + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(paddingLeft, paddingTop);
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        d(i == 0);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        d(false);
    }

    @Override // android.widget.ProgressBar
    public final synchronized void setIndeterminate(boolean z) {
        if (z == isIndeterminate()) {
            return;
        }
        Drawable currentDrawable = getCurrentDrawable();
        if (currentDrawable != null) {
            ((almc) currentDrawable).j();
        }
        super.setIndeterminate(z);
        Drawable currentDrawable2 = getCurrentDrawable();
        if (currentDrawable2 != null) {
            ((almc) currentDrawable2).h(f(), false, false);
        }
        if ((currentDrawable2 instanceof almf) && f()) {
            ((almf) currentDrawable2).b.b();
        }
        this.f = false;
    }

    @Override // android.widget.ProgressBar
    public final void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else if (drawable instanceof almf) {
            ((almc) drawable).j();
            super.setIndeterminateDrawable(drawable);
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    @Override // android.widget.ProgressBar
    public final synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        g(i);
    }

    @Override // android.widget.ProgressBar
    public final void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else if (drawable instanceof ally) {
            ally allyVar = (ally) drawable;
            allyVar.j();
            super.setProgressDrawable(allyVar);
            allyVar.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }
}
