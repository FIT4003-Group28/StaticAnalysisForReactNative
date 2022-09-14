package c.d.h.e;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
/* loaded from: classes.dex */
public class h extends Drawable implements Drawable.Callback, t, s, d {

    /* renamed from: b  reason: collision with root package name */
    private Drawable f3034b;

    /* renamed from: c  reason: collision with root package name */
    private final e f3035c = new e();

    /* renamed from: d  reason: collision with root package name */
    protected t f3036d;

    static {
        new Matrix();
    }

    public h(Drawable drawable) {
        this.f3034b = drawable;
        f.a(this.f3034b, this, this);
    }

    @Override // c.d.h.e.d
    public Drawable a() {
        return getCurrent();
    }

    @Override // c.d.h.e.d
    public Drawable a(Drawable drawable) {
        return b(drawable);
    }

    @Override // c.d.h.e.t
    public void a(Matrix matrix) {
        b(matrix);
    }

    @Override // c.d.h.e.t
    public void a(RectF rectF) {
        t tVar = this.f3036d;
        if (tVar != null) {
            tVar.a(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // c.d.h.e.s
    public void a(t tVar) {
        this.f3036d = tVar;
    }

    public Drawable b(Drawable drawable) {
        Drawable c2 = c(drawable);
        invalidateSelf();
        return c2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(Matrix matrix) {
        t tVar = this.f3036d;
        if (tVar != null) {
            tVar.a(matrix);
        } else {
            matrix.reset();
        }
    }

    protected Drawable c(Drawable drawable) {
        Drawable drawable2 = this.f3034b;
        f.a(drawable2, null, null);
        f.a(drawable, null, null);
        f.a(drawable, this.f3035c);
        f.a(drawable, this);
        f.a(drawable, this, this);
        this.f3034b = drawable;
        return drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f3034b;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f3034b;
        return drawable == null ? super.getConstantState() : drawable.getConstantState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f3034b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f3034b;
        return drawable == null ? super.getIntrinsicHeight() : drawable.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f3034b;
        return drawable == null ? super.getIntrinsicWidth() : drawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f3034b;
        if (drawable == null) {
            return 0;
        }
        return drawable.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f3034b;
        return drawable == null ? super.getPadding(rect) : drawable.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f3034b;
        if (drawable == null) {
            return false;
        }
        return drawable.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f3034b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3034b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        Drawable drawable = this.f3034b;
        return drawable == null ? super.onLevelChange(i) : drawable.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f3034b;
        return drawable == null ? super.onStateChange(iArr) : drawable.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f3035c.a(i);
        Drawable drawable = this.f3034b;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f3035c.a(colorFilter);
        Drawable drawable = this.f3034b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f3035c.a(z);
        Drawable drawable = this.f3034b;
        if (drawable != null) {
            drawable.setDither(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f3035c.b(z);
        Drawable drawable = this.f3034b;
        if (drawable != null) {
            drawable.setFilterBitmap(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void setHotspot(float f2, float f3) {
        Drawable drawable = this.f3034b;
        if (drawable != null) {
            drawable.setHotspot(f2, f3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f3034b;
        return drawable == null ? visible : drawable.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
