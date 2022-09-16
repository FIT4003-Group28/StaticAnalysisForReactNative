package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
/* compiled from: AppCompatImageView.java */
/* loaded from: classes.dex */
public class m extends ImageView implements android.support.v4.j.r, android.support.v4.widget.o {

    /* renamed from: a  reason: collision with root package name */
    private final g f982a;

    /* renamed from: b  reason: collision with root package name */
    private final l f983b;

    public m(Context context) {
        this(context, null);
    }

    public m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public m(Context context, AttributeSet attributeSet, int i) {
        super(aj.a(context), attributeSet, i);
        this.f982a = new g(this);
        this.f982a.a(attributeSet, i);
        this.f983b = new l(this);
        this.f983b.a(attributeSet, i);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        if (this.f983b != null) {
            this.f983b.a(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (this.f983b != null) {
            this.f983b.d();
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        if (this.f983b != null) {
            this.f983b.d();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        if (this.f983b != null) {
            this.f983b.d();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f982a != null) {
            this.f982a.a(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f982a != null) {
            this.f982a.a(drawable);
        }
    }

    @Override // android.support.v4.j.r
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f982a != null) {
            this.f982a.a(colorStateList);
        }
    }

    @Override // android.support.v4.j.r
    public ColorStateList getSupportBackgroundTintList() {
        if (this.f982a != null) {
            return this.f982a.a();
        }
        return null;
    }

    @Override // android.support.v4.j.r
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f982a != null) {
            this.f982a.a(mode);
        }
    }

    @Override // android.support.v4.j.r
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f982a != null) {
            return this.f982a.b();
        }
        return null;
    }

    @Override // android.support.v4.widget.o
    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f983b != null) {
            this.f983b.a(colorStateList);
        }
    }

    @Override // android.support.v4.widget.o
    public ColorStateList getSupportImageTintList() {
        if (this.f983b != null) {
            return this.f983b.b();
        }
        return null;
    }

    @Override // android.support.v4.widget.o
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f983b != null) {
            this.f983b.a(mode);
        }
    }

    @Override // android.support.v4.widget.o
    public PorterDuff.Mode getSupportImageTintMode() {
        if (this.f983b != null) {
            return this.f983b.c();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f982a != null) {
            this.f982a.c();
        }
        if (this.f983b != null) {
            this.f983b.d();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f983b.a() && super.hasOverlappingRendering();
    }
}
