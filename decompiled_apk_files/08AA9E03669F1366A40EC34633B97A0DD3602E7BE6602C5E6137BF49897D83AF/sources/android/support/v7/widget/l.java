package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.support.v7.a.a;
import android.util.AttributeSet;
import android.widget.ImageView;
/* compiled from: AppCompatImageHelper.java */
/* loaded from: classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private final ImageView f978a;

    /* renamed from: b  reason: collision with root package name */
    private ak f979b;

    /* renamed from: c  reason: collision with root package name */
    private ak f980c;

    /* renamed from: d  reason: collision with root package name */
    private ak f981d;

    public l(ImageView imageView) {
        this.f978a = imageView;
    }

    public void a(AttributeSet attributeSet, int i) {
        int g;
        am a2 = am.a(this.f978a.getContext(), attributeSet, a.j.AppCompatImageView, i, 0);
        try {
            Drawable drawable = this.f978a.getDrawable();
            if (drawable == null && (g = a2.g(a.j.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = android.support.v7.b.a.b.b(this.f978a.getContext(), g)) != null) {
                this.f978a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                u.b(drawable);
            }
            if (a2.f(a.j.AppCompatImageView_tint)) {
                android.support.v4.widget.i.a(this.f978a, a2.d(a.j.AppCompatImageView_tint));
            }
            if (a2.f(a.j.AppCompatImageView_tintMode)) {
                android.support.v4.widget.i.a(this.f978a, u.a(a2.a(a.j.AppCompatImageView_tintMode, -1), null));
            }
        } finally {
            a2.a();
        }
    }

    public void a(int i) {
        if (i != 0) {
            Drawable b2 = android.support.v7.b.a.b.b(this.f978a.getContext(), i);
            if (b2 != null) {
                u.b(b2);
            }
            this.f978a.setImageDrawable(b2);
        } else {
            this.f978a.setImageDrawable(null);
        }
        d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        return Build.VERSION.SDK_INT < 21 || !(this.f978a.getBackground() instanceof RippleDrawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList) {
        if (this.f980c == null) {
            this.f980c = new ak();
        }
        this.f980c.f916a = colorStateList;
        this.f980c.f919d = true;
        d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList b() {
        if (this.f980c != null) {
            return this.f980c.f916a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(PorterDuff.Mode mode) {
        if (this.f980c == null) {
            this.f980c = new ak();
        }
        this.f980c.f917b = mode;
        this.f980c.f918c = true;
        d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode c() {
        if (this.f980c != null) {
            return this.f980c.f917b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        Drawable drawable = this.f978a.getDrawable();
        if (drawable != null) {
            u.b(drawable);
        }
        if (drawable != null) {
            if (e() && a(drawable)) {
                return;
            }
            if (this.f980c != null) {
                h.a(drawable, this.f980c, this.f978a.getDrawableState());
            } else if (this.f979b == null) {
            } else {
                h.a(drawable, this.f979b, this.f978a.getDrawableState());
            }
        }
    }

    private boolean e() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f979b != null : i == 21;
    }

    private boolean a(Drawable drawable) {
        if (this.f981d == null) {
            this.f981d = new ak();
        }
        ak akVar = this.f981d;
        akVar.a();
        ColorStateList a2 = android.support.v4.widget.i.a(this.f978a);
        if (a2 != null) {
            akVar.f919d = true;
            akVar.f916a = a2;
        }
        PorterDuff.Mode b2 = android.support.v4.widget.i.b(this.f978a);
        if (b2 != null) {
            akVar.f918c = true;
            akVar.f917b = b2;
        }
        if (akVar.f919d || akVar.f918c) {
            h.a(drawable, akVar, this.f978a.getDrawableState());
            return true;
        }
        return false;
    }
}
