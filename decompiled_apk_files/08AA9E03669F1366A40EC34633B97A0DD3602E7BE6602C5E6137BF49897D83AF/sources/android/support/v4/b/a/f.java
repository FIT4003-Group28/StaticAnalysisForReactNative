package android.support.v4.b.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.support.v4.b.a.d;
import android.util.Log;
import java.lang.reflect.Method;
/* compiled from: WrappedDrawableApi21.java */
/* loaded from: classes.dex */
class f extends e {

    /* renamed from: d  reason: collision with root package name */
    private static Method f361d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(Drawable drawable) {
        super(drawable);
        d();
    }

    f(d.a aVar, Resources resources) {
        super(aVar, resources);
        d();
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        this.f355c.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f355c.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f355c.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.f355c.getDirtyBounds();
    }

    @Override // android.support.v4.b.a.d, android.graphics.drawable.Drawable, android.support.v4.b.a.b
    public void setTintList(ColorStateList colorStateList) {
        if (c()) {
            super.setTintList(colorStateList);
        } else {
            this.f355c.setTintList(colorStateList);
        }
    }

    @Override // android.support.v4.b.a.d, android.graphics.drawable.Drawable, android.support.v4.b.a.b
    public void setTint(int i) {
        if (c()) {
            super.setTint(i);
        } else {
            this.f355c.setTint(i);
        }
    }

    @Override // android.support.v4.b.a.d, android.graphics.drawable.Drawable, android.support.v4.b.a.b
    public void setTintMode(PorterDuff.Mode mode) {
        if (c()) {
            super.setTintMode(mode);
        } else {
            this.f355c.setTintMode(mode);
        }
    }

    @Override // android.support.v4.b.a.d, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (super.setState(iArr)) {
            invalidateSelf();
            return true;
        }
        return false;
    }

    @Override // android.support.v4.b.a.d
    protected boolean c() {
        if (Build.VERSION.SDK_INT == 21) {
            Drawable drawable = this.f355c;
            return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
        }
        return false;
    }

    @Override // android.support.v4.b.a.e, android.support.v4.b.a.d
    d.a b() {
        return new a(this.f354b, null);
    }

    /* compiled from: WrappedDrawableApi21.java */
    /* loaded from: classes.dex */
    private static class a extends d.a {
        a(d.a aVar, Resources resources) {
            super(aVar, resources);
        }

        @Override // android.support.v4.b.a.d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new f(this, resources);
        }
    }

    private void d() {
        if (f361d == null) {
            try {
                f361d = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }
}
