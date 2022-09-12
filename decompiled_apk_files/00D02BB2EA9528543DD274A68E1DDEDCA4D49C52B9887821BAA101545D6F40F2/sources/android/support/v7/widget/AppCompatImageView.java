package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
/* compiled from: PG */
/* loaded from: classes.dex */
public class AppCompatImageView extends ImageView {
    private final xc a;
    private final xm b;

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        xc xcVar = this.a;
        if (xcVar != null) {
            xcVar.e();
        }
        xm xmVar = this.b;
        if (xmVar != null) {
            xmVar.f();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return this.b.c() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        xc xcVar = this.a;
        if (xcVar != null) {
            xcVar.g();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        xc xcVar = this.a;
        if (xcVar != null) {
            xcVar.b(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        xm xmVar = this.b;
        if (xmVar != null) {
            xmVar.f();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        xm xmVar = this.b;
        if (xmVar != null) {
            xmVar.f();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        xm xmVar = this.b;
        if (xmVar != null) {
            xmVar.b(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        xm xmVar = this.b;
        if (xmVar != null) {
            xmVar.f();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        xc xcVar = this.a;
        if (xcVar != null) {
            xcVar.c(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        xc xcVar = this.a;
        if (xcVar != null) {
            xcVar.d(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        xm xmVar = this.b;
        if (xmVar != null) {
            xmVar.d(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        xm xmVar = this.b;
        if (xmVar != null) {
            xmVar.e(mode);
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        aen.a(context);
        ael.d(this, getContext());
        xc xcVar = new xc(this);
        this.a = xcVar;
        xcVar.a(attributeSet, i);
        xm xmVar = new xm(this);
        this.b = xmVar;
        xmVar.a(attributeSet, i);
    }
}
