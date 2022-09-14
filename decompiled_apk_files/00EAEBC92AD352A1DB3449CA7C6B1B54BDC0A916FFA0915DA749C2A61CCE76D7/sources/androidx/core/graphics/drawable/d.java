package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class d extends Drawable implements Drawable.Callback, c, b {

    /* renamed from: h  reason: collision with root package name */
    static final PorterDuff.Mode f1578h = PorterDuff.Mode.SRC_IN;

    /* renamed from: b  reason: collision with root package name */
    private int f1579b;

    /* renamed from: c  reason: collision with root package name */
    private PorterDuff.Mode f1580c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1581d;

    /* renamed from: e  reason: collision with root package name */
    f f1582e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1583f;

    /* renamed from: g  reason: collision with root package name */
    Drawable f1584g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Drawable drawable) {
        this.f1582e = c();
        a(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(f fVar, Resources resources) {
        this.f1582e = fVar;
        a(resources);
    }

    private void a(Resources resources) {
        Drawable.ConstantState constantState;
        f fVar = this.f1582e;
        if (fVar == null || (constantState = fVar.f1586b) == null) {
            return;
        }
        a(constantState.newDrawable(resources));
    }

    private boolean a(int[] iArr) {
        if (!b()) {
            return false;
        }
        f fVar = this.f1582e;
        ColorStateList colorStateList = fVar.f1587c;
        PorterDuff.Mode mode = fVar.f1588d;
        if (colorStateList == null || mode == null) {
            this.f1581d = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f1581d || colorForState != this.f1579b || mode != this.f1580c) {
                setColorFilter(colorForState, mode);
                this.f1579b = colorForState;
                this.f1580c = mode;
                this.f1581d = true;
                return true;
            }
        }
        return false;
    }

    private f c() {
        return new f(this.f1582e);
    }

    @Override // androidx.core.graphics.drawable.c
    public final Drawable a() {
        return this.f1584g;
    }

    @Override // androidx.core.graphics.drawable.c
    public final void a(Drawable drawable) {
        Drawable drawable2 = this.f1584g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1584g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            f fVar = this.f1582e;
            if (fVar != null) {
                fVar.f1586b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    protected boolean b() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f1584g.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        f fVar = this.f1582e;
        return changingConfigurations | (fVar != null ? fVar.getChangingConfigurations() : 0) | this.f1584g.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        f fVar = this.f1582e;
        if (fVar == null || !fVar.a()) {
            return null;
        }
        this.f1582e.f1585a = getChangingConfigurations();
        return this.f1582e;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f1584g.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f1584g.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f1584g.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f1584g.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f1584g.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f1584g.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f1584g.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f1584g.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f1584g.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f1584g.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        f fVar;
        ColorStateList colorStateList = (!b() || (fVar = this.f1582e) == null) ? null : fVar.f1587c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f1584g.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f1584g.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f1583f && super.mutate() == this) {
            this.f1582e = c();
            Drawable drawable = this.f1584g;
            if (drawable != null) {
                drawable.mutate();
            }
            f fVar = this.f1582e;
            if (fVar != null) {
                Drawable drawable2 = this.f1584g;
                fVar.f1586b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f1583f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1584g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        return this.f1584g.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f1584g.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        this.f1584g.setAutoMirrored(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        this.f1584g.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1584g.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f1584g.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f1584g.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return a(iArr) || this.f1584g.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        this.f1582e.f1587c = colorStateList;
        a(getState());
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        this.f1582e.f1588d = mode;
        a(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f1584g.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
