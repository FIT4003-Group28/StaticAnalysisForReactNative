package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: uf  reason: default package */
/* loaded from: classes4.dex */
public final class uf {
    private final ImageView a;
    private aab b;

    public uf(ImageView imageView) {
        this.a = imageView;
    }

    public final void a() {
        Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            vs.c(drawable);
        }
        if (drawable == null || Build.VERSION.SDK_INT > 21) {
            return;
        }
        if (this.b == null) {
            this.b = new aab();
        }
        aab aabVar = this.b;
        aabVar.a();
        ColorStateList imageTintList = this.a.getImageTintList();
        if (imageTintList != null) {
            aabVar.d = true;
            aabVar.a = imageTintList;
        }
        PorterDuff.Mode imageTintMode = this.a.getImageTintMode();
        if (imageTintMode != null) {
            aabVar.c = true;
            aabVar.b = imageTintMode;
        }
        if (!aabVar.d && !aabVar.c) {
            return;
        }
        yv.h(drawable, aabVar, this.a.getDrawableState());
    }

    public final void b(AttributeSet attributeSet, int i) {
        Drawable drawable;
        int f;
        aad l = aad.l(this.a.getContext(), attributeSet, pm.f, i, 0);
        ImageView imageView = this.a;
        lj.L(imageView, imageView.getContext(), pm.f, attributeSet, l.b, i, 0);
        try {
            Drawable drawable2 = this.a.getDrawable();
            if (drawable2 == null && (f = l.f(1, -1)) != -1 && (drawable2 = po.b(this.a.getContext(), f)) != null) {
                this.a.setImageDrawable(drawable2);
            }
            if (drawable2 != null) {
                vs.c(drawable2);
            }
            if (l.q(2)) {
                kw.h(this.a, l.g(2));
            }
            if (l.q(3)) {
                ImageView imageView2 = this.a;
                imageView2.setImageTintMode(vs.a(l.c(3, -1), null));
                if (Build.VERSION.SDK_INT == 21 && (drawable = imageView2.getDrawable()) != null && imageView2.getImageTintList() != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView2.getDrawableState());
                    }
                    imageView2.setImageDrawable(drawable);
                }
            }
        } finally {
            l.o();
        }
    }

    public final void c(int i) {
        if (i != 0) {
            Drawable b = po.b(this.a.getContext(), i);
            if (b != null) {
                vs.c(b);
            }
            this.a.setImageDrawable(b);
        } else {
            this.a.setImageDrawable(null);
        }
        a();
    }

    public final boolean d() {
        return !(this.a.getBackground() instanceof RippleDrawable);
    }
}
