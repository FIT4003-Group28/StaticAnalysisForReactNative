package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
/* loaded from: classes.dex */
public class o extends ImageView implements a.g.m.u, androidx.core.widget.l {

    /* renamed from: b  reason: collision with root package name */
    private final e f1323b;

    /* renamed from: c  reason: collision with root package name */
    private final n f1324c;

    public o(Context context) {
        this(context, null);
    }

    public o(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public o(Context context, AttributeSet attributeSet, int i) {
        super(u0.b(context), attributeSet, i);
        this.f1323b = new e(this);
        this.f1323b.a(attributeSet, i);
        this.f1324c = new n(this);
        this.f1324c.a(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1323b;
        if (eVar != null) {
            eVar.a();
        }
        n nVar = this.f1324c;
        if (nVar != null) {
            nVar.a();
        }
    }

    @Override // a.g.m.u
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1323b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // a.g.m.u
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1323b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // androidx.core.widget.l
    public ColorStateList getSupportImageTintList() {
        n nVar = this.f1324c;
        if (nVar != null) {
            return nVar.b();
        }
        return null;
    }

    @Override // androidx.core.widget.l
    public PorterDuff.Mode getSupportImageTintMode() {
        n nVar = this.f1324c;
        if (nVar != null) {
            return nVar.c();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f1324c.d() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1323b;
        if (eVar != null) {
            eVar.a(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f1323b;
        if (eVar != null) {
            eVar.a(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        n nVar = this.f1324c;
        if (nVar != null) {
            nVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        n nVar = this.f1324c;
        if (nVar != null) {
            nVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        n nVar = this.f1324c;
        if (nVar != null) {
            nVar.a(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        n nVar = this.f1324c;
        if (nVar != null) {
            nVar.a();
        }
    }

    @Override // a.g.m.u
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1323b;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    @Override // a.g.m.u
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1323b;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    @Override // androidx.core.widget.l
    public void setSupportImageTintList(ColorStateList colorStateList) {
        n nVar = this.f1324c;
        if (nVar != null) {
            nVar.a(colorStateList);
        }
    }

    @Override // androidx.core.widget.l
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        n nVar = this.f1324c;
        if (nVar != null) {
            nVar.a(mode);
        }
    }
}
