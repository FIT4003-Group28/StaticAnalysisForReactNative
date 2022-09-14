package com.facebook.f.e;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
/* compiled from: ArrayDrawable.java */
/* loaded from: classes.dex */
public class a extends Drawable implements Drawable.Callback, p, q {

    /* renamed from: a  reason: collision with root package name */
    private q f2406a;

    /* renamed from: c  reason: collision with root package name */
    private final Drawable[] f2408c;

    /* renamed from: d  reason: collision with root package name */
    private final c[] f2409d;

    /* renamed from: b  reason: collision with root package name */
    private final d f2407b = new d();
    private final Rect e = new Rect();
    private boolean f = false;
    private boolean g = false;
    private boolean h = false;

    public a(Drawable[] drawableArr) {
        com.facebook.common.d.i.a(drawableArr);
        this.f2408c = drawableArr;
        for (int i = 0; i < this.f2408c.length; i++) {
            e.a(this.f2408c[i], this, this);
        }
        this.f2409d = new c[this.f2408c.length];
    }

    public int a() {
        return this.f2408c.length;
    }

    public Drawable a(int i) {
        boolean z = false;
        com.facebook.common.d.i.a(i >= 0);
        if (i < this.f2408c.length) {
            z = true;
        }
        com.facebook.common.d.i.a(z);
        return this.f2408c[i];
    }

    public Drawable a(int i, Drawable drawable) {
        boolean z = true;
        com.facebook.common.d.i.a(i >= 0);
        if (i >= this.f2408c.length) {
            z = false;
        }
        com.facebook.common.d.i.a(z);
        Drawable drawable2 = this.f2408c[i];
        if (drawable != drawable2) {
            if (drawable != null && this.h) {
                drawable.mutate();
            }
            e.a(this.f2408c[i], null, null);
            e.a(drawable, null, null);
            e.a(drawable, this.f2407b);
            e.a(drawable, this);
            e.a(drawable, this, this);
            this.g = false;
            this.f2408c[i] = drawable;
            invalidateSelf();
        }
        return drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i = -1;
        for (int i2 = 0; i2 < this.f2408c.length; i2++) {
            Drawable drawable = this.f2408c[i2];
            if (drawable != null) {
                i = Math.max(i, drawable.getIntrinsicWidth());
            }
        }
        if (i > 0) {
            return i;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i = -1;
        for (int i2 = 0; i2 < this.f2408c.length; i2++) {
            Drawable drawable = this.f2408c[i2];
            if (drawable != null) {
                i = Math.max(i, drawable.getIntrinsicHeight());
            }
        }
        if (i > 0) {
            return i;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        for (int i = 0; i < this.f2408c.length; i++) {
            Drawable drawable = this.f2408c[i];
            if (drawable != null) {
                drawable.setBounds(rect);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!this.g) {
            this.f = false;
            int i = 0;
            while (true) {
                boolean z = true;
                if (i >= this.f2408c.length) {
                    break;
                }
                Drawable drawable = this.f2408c[i];
                boolean z2 = this.f;
                if (drawable == null || !drawable.isStateful()) {
                    z = false;
                }
                this.f = z2 | z;
                i++;
            }
            this.g = true;
        }
        return this.f;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z = false;
        for (int i = 0; i < this.f2408c.length; i++) {
            Drawable drawable = this.f2408c[i];
            if (drawable != null && drawable.setState(iArr)) {
                z = true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        boolean z = false;
        for (int i2 = 0; i2 < this.f2408c.length; i2++) {
            Drawable drawable = this.f2408c[i2];
            if (drawable != null && drawable.setLevel(i)) {
                z = true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        for (int i = 0; i < this.f2408c.length; i++) {
            Drawable drawable = this.f2408c[i];
            if (drawable != null) {
                drawable.draw(canvas);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        Rect rect2 = this.e;
        for (int i = 0; i < this.f2408c.length; i++) {
            Drawable drawable = this.f2408c[i];
            if (drawable != null) {
                drawable.getPadding(rect2);
                rect.left = Math.max(rect.left, rect2.left);
                rect.top = Math.max(rect.top, rect2.top);
                rect.right = Math.max(rect.right, rect2.right);
                rect.bottom = Math.max(rect.bottom, rect2.bottom);
            }
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        for (int i = 0; i < this.f2408c.length; i++) {
            Drawable drawable = this.f2408c[i];
            if (drawable != null) {
                drawable.mutate();
            }
        }
        this.h = true;
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.f2408c.length == 0) {
            return -2;
        }
        int i = -1;
        for (int i2 = 1; i2 < this.f2408c.length; i2++) {
            Drawable drawable = this.f2408c[i2];
            if (drawable != null) {
                i = Drawable.resolveOpacity(i, drawable.getOpacity());
            }
        }
        return i;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f2407b.a(i);
        for (int i2 = 0; i2 < this.f2408c.length; i2++) {
            Drawable drawable = this.f2408c[i2];
            if (drawable != null) {
                drawable.setAlpha(i);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2407b.a(colorFilter);
        for (int i = 0; i < this.f2408c.length; i++) {
            Drawable drawable = this.f2408c[i];
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f2407b.a(z);
        for (int i = 0; i < this.f2408c.length; i++) {
            Drawable drawable = this.f2408c[i];
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f2407b.b(z);
        for (int i = 0; i < this.f2408c.length; i++) {
            Drawable drawable = this.f2408c[i];
            if (drawable != null) {
                drawable.setFilterBitmap(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        for (int i = 0; i < this.f2408c.length; i++) {
            Drawable drawable = this.f2408c[i];
            if (drawable != null) {
                drawable.setVisible(z, z2);
            }
        }
        return visible;
    }

    public c b(int i) {
        boolean z = false;
        com.facebook.common.d.i.a(i >= 0);
        if (i < this.f2409d.length) {
            z = true;
        }
        com.facebook.common.d.i.a(z);
        if (this.f2409d[i] == null) {
            this.f2409d[i] = c(i);
        }
        return this.f2409d[i];
    }

    private c c(final int i) {
        return new c() { // from class: com.facebook.f.e.a.1
            @Override // com.facebook.f.e.c
            public Drawable a(Drawable drawable) {
                return a.this.a(i, drawable);
            }

            @Override // com.facebook.f.e.c
            public Drawable a() {
                return a.this.a(i);
            }
        };
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
        this.f2406a = qVar;
    }

    @Override // com.facebook.f.e.q
    public void a(Matrix matrix) {
        if (this.f2406a != null) {
            this.f2406a.a(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // com.facebook.f.e.q
    public void a(RectF rectF) {
        if (this.f2406a != null) {
            this.f2406a.a(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void setHotspot(float f, float f2) {
        for (int i = 0; i < this.f2408c.length; i++) {
            Drawable drawable = this.f2408c[i];
            if (drawable != null) {
                drawable.setHotspot(f, f2);
            }
        }
    }
}
