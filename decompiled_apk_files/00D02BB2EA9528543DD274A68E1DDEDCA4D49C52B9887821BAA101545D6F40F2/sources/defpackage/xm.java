package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: xm  reason: default package */
/* loaded from: classes.dex */
public final class xm {
    private final ImageView a;
    private aeo b;
    private aeo c;

    public xm(ImageView imageView) {
        this.a = imageView;
    }

    public final void a(AttributeSet attributeSet, int i) {
        Drawable drawable;
        Drawable drawable2;
        int o;
        aeq b = aeq.b(this.a.getContext(), attributeSet, sj.f, i, 0);
        ImageView imageView = this.a;
        od.a(imageView, imageView.getContext(), sj.f, attributeSet, b.b, i, 0);
        try {
            Drawable drawable3 = this.a.getDrawable();
            if (drawable3 == null && (o = b.o(1, -1)) != -1 && (drawable3 = sl.b(this.a.getContext(), o)) != null) {
                this.a.setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                ze.b(drawable3);
            }
            if (b.p(2)) {
                ImageView imageView2 = this.a;
                imageView2.setImageTintList(b.j(2));
                if (Build.VERSION.SDK_INT == 21 && (drawable2 = imageView2.getDrawable()) != null && imageView2.getImageTintList() != null) {
                    if (drawable2.isStateful()) {
                        drawable2.setState(imageView2.getDrawableState());
                    }
                    imageView2.setImageDrawable(drawable2);
                }
            }
            if (b.p(3)) {
                ImageView imageView3 = this.a;
                imageView3.setImageTintMode(ze.d(b.i(3, -1), null));
                if (Build.VERSION.SDK_INT == 21 && (drawable = imageView3.getDrawable()) != null && imageView3.getImageTintList() != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView3.getDrawableState());
                    }
                    imageView3.setImageDrawable(drawable);
                }
            }
        } finally {
            b.q();
        }
    }

    public final void b(int i) {
        if (i != 0) {
            Drawable b = sl.b(this.a.getContext(), i);
            if (b != null) {
                ze.b(b);
            }
            this.a.setImageDrawable(b);
        } else {
            this.a.setImageDrawable(null);
        }
        f();
    }

    public final boolean c() {
        return !(this.a.getBackground() instanceof RippleDrawable);
    }

    public final void d(ColorStateList colorStateList) {
        if (this.b == null) {
            this.b = new aeo();
        }
        aeo aeoVar = this.b;
        aeoVar.a = colorStateList;
        aeoVar.d = true;
        f();
    }

    public final void e(PorterDuff.Mode mode) {
        if (this.b == null) {
            this.b = new aeo();
        }
        aeo aeoVar = this.b;
        aeoVar.b = mode;
        aeoVar.c = true;
        f();
    }

    public final void f() {
        Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            ze.b(drawable);
        }
        if (drawable != null) {
            if (Build.VERSION.SDK_INT <= 21) {
                if (this.c == null) {
                    this.c = new aeo();
                }
                aeo aeoVar = this.c;
                aeoVar.a();
                ColorStateList imageTintList = this.a.getImageTintList();
                if (imageTintList != null) {
                    aeoVar.d = true;
                    aeoVar.a = imageTintList;
                }
                PorterDuff.Mode imageTintMode = this.a.getImageTintMode();
                if (imageTintMode != null) {
                    aeoVar.c = true;
                    aeoVar.b = imageTintMode;
                }
                if (aeoVar.d || aeoVar.c) {
                    acv.g(drawable, aeoVar, this.a.getDrawableState());
                    return;
                }
            }
            aeo aeoVar2 = this.b;
            if (aeoVar2 == null) {
                return;
            }
            acv.g(drawable, aeoVar2, this.a.getDrawableState());
        }
    }
}
