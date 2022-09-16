package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: ho  reason: default package */
/* loaded from: classes3.dex */
public class ho extends Drawable implements Drawable.Callback, hn {
    static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    hq b;
    public Drawable c;
    private int d;
    private PorterDuff.Mode e;
    private boolean f;
    private boolean g;

    public ho(Drawable drawable) {
        this.b = c();
        a(drawable);
    }

    private final hq c() {
        return new hq(this.b);
    }

    private final boolean d(int[] iArr) {
        if (!b()) {
            return false;
        }
        hq hqVar = this.b;
        ColorStateList colorStateList = hqVar.c;
        PorterDuff.Mode mode = hqVar.d;
        if (colorStateList == null || mode == null) {
            this.f = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f || colorForState != this.d || mode != this.e) {
                setColorFilter(colorForState, mode);
                this.d = colorForState;
                this.e = mode;
                this.f = true;
                return true;
            }
        }
        return false;
    }

    public final void a(Drawable drawable) {
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            hq hqVar = this.b;
            if (hqVar != null) {
                hqVar.b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean b() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.c.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        hq hqVar = this.b;
        return changingConfigurations | (hqVar != null ? hqVar.getChangingConfigurations() : 0) | this.c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        hq hqVar = this.b;
        if (hqVar == null || hqVar.b == null) {
            return null;
        }
        hqVar.a = getChangingConfigurations();
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.c.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.c.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.c.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getLayoutDirection() {
        return iy.k(this.c);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.c.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.c.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.c.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.c.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.c.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.c.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.c.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        hq hqVar;
        ColorStateList colorStateList = null;
        if (b() && (hqVar = this.b) != null) {
            colorStateList = hqVar.c;
        }
        return (colorStateList != null && colorStateList.isStateful()) || this.c.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.c.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.g && super.mutate() == this) {
            this.b = c();
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.mutate();
            }
            hq hqVar = this.b;
            if (hqVar != null) {
                Drawable drawable2 = this.c;
                hqVar.b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.g = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        return iy.n(this.c, i);
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        return this.c.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.c.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        this.c.setAutoMirrored(z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i) {
        this.c.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.c.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.c.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return d(iArr) || this.c.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.b.c = colorStateList;
        d(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.b.d = mode;
        d(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.c.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public ho(hq hqVar, Resources resources) {
        Drawable.ConstantState constantState;
        this.b = hqVar;
        if (hqVar == null || (constantState = hqVar.b) == null) {
            return;
        }
        a(constantState.newDrawable(resources));
    }
}
