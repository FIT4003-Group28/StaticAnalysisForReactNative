package com.facebook.f.e;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
/* compiled from: ForwardingDrawable.java */
/* loaded from: classes.dex */
public class g extends Drawable implements Drawable.Callback, c, p, q {

    /* renamed from: d  reason: collision with root package name */
    private static final Matrix f2423d = new Matrix();

    /* renamed from: a  reason: collision with root package name */
    private Drawable f2424a;

    /* renamed from: b  reason: collision with root package name */
    protected q f2425b;

    /* renamed from: c  reason: collision with root package name */
    private final d f2426c = new d();

    public g(Drawable drawable) {
        this.f2424a = drawable;
        e.a(this.f2424a, this, this);
    }

    public Drawable b(Drawable drawable) {
        Drawable c2 = c(drawable);
        invalidateSelf();
        return c2;
    }

    protected Drawable c(Drawable drawable) {
        Drawable drawable2 = this.f2424a;
        e.a(drawable2, null, null);
        e.a(drawable, null, null);
        e.a(drawable, this.f2426c);
        e.a(drawable, this);
        e.a(drawable, this, this);
        this.f2424a = drawable;
        return drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f2424a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f2426c.a(i);
        this.f2424a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2426c.a(colorFilter);
        this.f2424a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f2426c.a(z);
        this.f2424a.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f2426c.b(z);
        this.f2424a.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        super.setVisible(z, z2);
        return this.f2424a.setVisible(z, z2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f2424a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f2424a.getConstantState();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f2424a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        return this.f2424a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        return this.f2424a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f2424a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f2424a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f2424a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f2424a.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f2424a.mutate();
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f2424a;
    }

    @Override // com.facebook.f.e.c
    public Drawable a(Drawable drawable) {
        return b(drawable);
    }

    @Override // com.facebook.f.e.c
    public Drawable a() {
        return getCurrent();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    @Override // com.facebook.f.e.p
    public void a(q qVar) {
        this.f2425b = qVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(Matrix matrix) {
        if (this.f2425b != null) {
            this.f2425b.a(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // com.facebook.f.e.q
    public void a(Matrix matrix) {
        b(matrix);
    }

    @Override // com.facebook.f.e.q
    public void a(RectF rectF) {
        if (this.f2425b != null) {
            this.f2425b.a(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void setHotspot(float f, float f2) {
        this.f2424a.setHotspot(f, f2);
    }
}
