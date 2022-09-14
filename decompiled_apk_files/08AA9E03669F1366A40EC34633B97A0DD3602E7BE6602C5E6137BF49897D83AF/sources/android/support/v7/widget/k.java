package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
/* compiled from: AppCompatImageButton.java */
/* loaded from: classes.dex */
public class k extends ImageButton implements android.support.v4.j.r, android.support.v4.widget.o {

    /* renamed from: a  reason: collision with root package name */
    private final g f976a;

    /* renamed from: b  reason: collision with root package name */
    private final l f977b;

    public k(Context context, AttributeSet attributeSet, int i) {
        super(aj.a(context), attributeSet, i);
        this.f976a = new g(this);
        this.f976a.a(attributeSet, i);
        this.f977b = new l(this);
        this.f977b.a(attributeSet, i);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.f977b.a(i);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (this.f977b != null) {
            this.f977b.d();
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        if (this.f977b != null) {
            this.f977b.d();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        if (this.f977b != null) {
            this.f977b.d();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f976a != null) {
            this.f976a.a(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f976a != null) {
            this.f976a.a(drawable);
        }
    }

    @Override // android.support.v4.j.r
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f976a != null) {
            this.f976a.a(colorStateList);
        }
    }

    @Override // android.support.v4.j.r
    public ColorStateList getSupportBackgroundTintList() {
        if (this.f976a != null) {
            return this.f976a.a();
        }
        return null;
    }

    @Override // android.support.v4.j.r
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f976a != null) {
            this.f976a.a(mode);
        }
    }

    @Override // android.support.v4.j.r
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f976a != null) {
            return this.f976a.b();
        }
        return null;
    }

    @Override // android.support.v4.widget.o
    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f977b != null) {
            this.f977b.a(colorStateList);
        }
    }

    @Override // android.support.v4.widget.o
    public ColorStateList getSupportImageTintList() {
        if (this.f977b != null) {
            return this.f977b.b();
        }
        return null;
    }

    @Override // android.support.v4.widget.o
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f977b != null) {
            this.f977b.a(mode);
        }
    }

    @Override // android.support.v4.widget.o
    public PorterDuff.Mode getSupportImageTintMode() {
        if (this.f977b != null) {
            return this.f977b.c();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f976a != null) {
            this.f976a.c();
        }
        if (this.f977b != null) {
            this.f977b.d();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f977b.a() && super.hasOverlappingRendering();
    }
}
