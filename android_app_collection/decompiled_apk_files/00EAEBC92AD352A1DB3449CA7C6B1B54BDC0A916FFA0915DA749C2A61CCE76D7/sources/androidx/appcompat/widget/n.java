package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
/* loaded from: classes.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private final ImageView f1318a;

    /* renamed from: b  reason: collision with root package name */
    private v0 f1319b;

    /* renamed from: c  reason: collision with root package name */
    private v0 f1320c;

    /* renamed from: d  reason: collision with root package name */
    private v0 f1321d;

    public n(ImageView imageView) {
        this.f1318a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f1321d == null) {
            this.f1321d = new v0();
        }
        v0 v0Var = this.f1321d;
        v0Var.a();
        ColorStateList a2 = androidx.core.widget.e.a(this.f1318a);
        if (a2 != null) {
            v0Var.f1394d = true;
            v0Var.f1391a = a2;
        }
        PorterDuff.Mode b2 = androidx.core.widget.e.b(this.f1318a);
        if (b2 != null) {
            v0Var.f1393c = true;
            v0Var.f1392b = b2;
        }
        if (v0Var.f1394d || v0Var.f1393c) {
            j.a(drawable, v0Var, this.f1318a.getDrawableState());
            return true;
        }
        return false;
    }

    private boolean e() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f1319b != null : i == 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        Drawable drawable = this.f1318a.getDrawable();
        if (drawable != null) {
            e0.b(drawable);
        }
        if (drawable != null) {
            if (e() && a(drawable)) {
                return;
            }
            v0 v0Var = this.f1320c;
            if (v0Var != null) {
                j.a(drawable, v0Var, this.f1318a.getDrawableState());
                return;
            }
            v0 v0Var2 = this.f1319b;
            if (v0Var2 == null) {
                return;
            }
            j.a(drawable, v0Var2, this.f1318a.getDrawableState());
        }
    }

    public void a(int i) {
        if (i != 0) {
            Drawable c2 = a.a.k.a.a.c(this.f1318a.getContext(), i);
            if (c2 != null) {
                e0.b(c2);
            }
            this.f1318a.setImageDrawable(c2);
        } else {
            this.f1318a.setImageDrawable(null);
        }
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList) {
        if (this.f1320c == null) {
            this.f1320c = new v0();
        }
        v0 v0Var = this.f1320c;
        v0Var.f1391a = colorStateList;
        v0Var.f1394d = true;
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(PorterDuff.Mode mode) {
        if (this.f1320c == null) {
            this.f1320c = new v0();
        }
        v0 v0Var = this.f1320c;
        v0Var.f1392b = mode;
        v0Var.f1393c = true;
        a();
    }

    public void a(AttributeSet attributeSet, int i) {
        int g2;
        x0 a2 = x0.a(this.f1318a.getContext(), attributeSet, a.a.j.AppCompatImageView, i, 0);
        try {
            Drawable drawable = this.f1318a.getDrawable();
            if (drawable == null && (g2 = a2.g(a.a.j.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = a.a.k.a.a.c(this.f1318a.getContext(), g2)) != null) {
                this.f1318a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                e0.b(drawable);
            }
            if (a2.g(a.a.j.AppCompatImageView_tint)) {
                androidx.core.widget.e.a(this.f1318a, a2.a(a.a.j.AppCompatImageView_tint));
            }
            if (a2.g(a.a.j.AppCompatImageView_tintMode)) {
                androidx.core.widget.e.a(this.f1318a, e0.a(a2.d(a.a.j.AppCompatImageView_tintMode, -1), null));
            }
        } finally {
            a2.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList b() {
        v0 v0Var = this.f1320c;
        if (v0Var != null) {
            return v0Var.f1391a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode c() {
        v0 v0Var = this.f1320c;
        if (v0Var != null) {
            return v0Var.f1392b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        return Build.VERSION.SDK_INT < 21 || !(this.f1318a.getBackground() instanceof RippleDrawable);
    }
}
