package android.support.v4.b.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
/* compiled from: WrappedDrawableApi14.java */
/* loaded from: classes.dex */
class d extends Drawable implements Drawable.Callback, android.support.v4.b.a.b, c {

    /* renamed from: a  reason: collision with root package name */
    static final PorterDuff.Mode f353a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b  reason: collision with root package name */
    a f354b;

    /* renamed from: c  reason: collision with root package name */
    Drawable f355c;

    /* renamed from: d  reason: collision with root package name */
    private int f356d;
    private PorterDuff.Mode e;
    private boolean f;
    private boolean g;

    protected boolean c() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(a aVar, Resources resources) {
        this.f354b = aVar;
        a(resources);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Drawable drawable) {
        this.f354b = b();
        a(drawable);
    }

    private void a(Resources resources) {
        if (this.f354b == null || this.f354b.f358b == null) {
            return;
        }
        a(this.f354b.f358b.newDrawable(resources));
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f355c.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f355c.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        if (this.f355c != null) {
            this.f355c.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        this.f355c.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | (this.f354b != null ? this.f354b.getChangingConfigurations() : 0) | this.f355c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f355c.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f355c.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f355c.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f355c.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = (!c() || this.f354b == null) ? null : this.f354b.f359c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f355c.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return a(iArr) || this.f355c.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f355c.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f355c.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f355c.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f355c.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f355c.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f355c.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f355c.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f355c.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f355c.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f355c.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f354b == null || !this.f354b.a()) {
            return null;
        }
        this.f354b.f357a = getChangingConfigurations();
        return this.f354b;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.g && super.mutate() == this) {
            this.f354b = b();
            if (this.f355c != null) {
                this.f355c.mutate();
            }
            if (this.f354b != null) {
                this.f354b.f358b = this.f355c != null ? this.f355c.getConstantState() : null;
            }
            this.g = true;
        }
        return this;
    }

    a b() {
        return new b(this.f354b, null);
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

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        return this.f355c.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.b.a.b
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.b.a.b
    public void setTintList(ColorStateList colorStateList) {
        this.f354b.f359c = colorStateList;
        a(getState());
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.b.a.b
    public void setTintMode(PorterDuff.Mode mode) {
        this.f354b.f360d = mode;
        a(getState());
    }

    private boolean a(int[] iArr) {
        if (!c()) {
            return false;
        }
        ColorStateList colorStateList = this.f354b.f359c;
        PorterDuff.Mode mode = this.f354b.f360d;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f || colorForState != this.f356d || mode != this.e) {
                setColorFilter(colorForState, mode);
                this.f356d = colorForState;
                this.e = mode;
                this.f = true;
                return true;
            }
        } else {
            this.f = false;
            clearColorFilter();
        }
        return false;
    }

    @Override // android.support.v4.b.a.c
    public final Drawable a() {
        return this.f355c;
    }

    public final void a(Drawable drawable) {
        if (this.f355c != null) {
            this.f355c.setCallback(null);
        }
        this.f355c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            if (this.f354b != null) {
                this.f354b.f358b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: WrappedDrawableApi14.java */
    /* loaded from: classes.dex */
    public static abstract class a extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        int f357a;

        /* renamed from: b  reason: collision with root package name */
        Drawable.ConstantState f358b;

        /* renamed from: c  reason: collision with root package name */
        ColorStateList f359c;

        /* renamed from: d  reason: collision with root package name */
        PorterDuff.Mode f360d;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public abstract Drawable newDrawable(Resources resources);

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(a aVar, Resources resources) {
            this.f359c = null;
            this.f360d = d.f353a;
            if (aVar != null) {
                this.f357a = aVar.f357a;
                this.f358b = aVar.f358b;
                this.f359c = aVar.f359c;
                this.f360d = aVar.f360d;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return newDrawable(null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f357a | (this.f358b != null ? this.f358b.getChangingConfigurations() : 0);
        }

        boolean a() {
            return this.f358b != null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WrappedDrawableApi14.java */
    /* loaded from: classes.dex */
    public static class b extends a {
        b(a aVar, Resources resources) {
            super(aVar, resources);
        }

        @Override // android.support.v4.b.a.d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new d(this, resources);
        }
    }
}
