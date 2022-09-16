package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
/* loaded from: classes.dex */
class e {

    /* renamed from: a  reason: collision with root package name */
    private final View f1232a;

    /* renamed from: d  reason: collision with root package name */
    private v0 f1235d;

    /* renamed from: e  reason: collision with root package name */
    private v0 f1236e;

    /* renamed from: f  reason: collision with root package name */
    private v0 f1237f;

    /* renamed from: c  reason: collision with root package name */
    private int f1234c = -1;

    /* renamed from: b  reason: collision with root package name */
    private final j f1233b = j.b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(View view) {
        this.f1232a = view;
    }

    private boolean b(Drawable drawable) {
        if (this.f1237f == null) {
            this.f1237f = new v0();
        }
        v0 v0Var = this.f1237f;
        v0Var.a();
        ColorStateList h2 = a.g.m.v.h(this.f1232a);
        if (h2 != null) {
            v0Var.f1394d = true;
            v0Var.f1391a = h2;
        }
        PorterDuff.Mode i = a.g.m.v.i(this.f1232a);
        if (i != null) {
            v0Var.f1393c = true;
            v0Var.f1392b = i;
        }
        if (v0Var.f1394d || v0Var.f1393c) {
            j.a(drawable, v0Var, this.f1232a.getDrawableState());
            return true;
        }
        return false;
    }

    private boolean d() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f1235d != null : i == 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        Drawable background = this.f1232a.getBackground();
        if (background != null) {
            if (d() && b(background)) {
                return;
            }
            v0 v0Var = this.f1236e;
            if (v0Var != null) {
                j.a(background, v0Var, this.f1232a.getDrawableState());
                return;
            }
            v0 v0Var2 = this.f1235d;
            if (v0Var2 == null) {
                return;
            }
            j.a(background, v0Var2, this.f1232a.getDrawableState());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        this.f1234c = i;
        j jVar = this.f1233b;
        a(jVar != null ? jVar.b(this.f1232a.getContext(), i) : null);
        a();
    }

    void a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1235d == null) {
                this.f1235d = new v0();
            }
            v0 v0Var = this.f1235d;
            v0Var.f1391a = colorStateList;
            v0Var.f1394d = true;
        } else {
            this.f1235d = null;
        }
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(PorterDuff.Mode mode) {
        if (this.f1236e == null) {
            this.f1236e = new v0();
        }
        v0 v0Var = this.f1236e;
        v0Var.f1392b = mode;
        v0Var.f1393c = true;
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Drawable drawable) {
        this.f1234c = -1;
        a((ColorStateList) null);
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(AttributeSet attributeSet, int i) {
        x0 a2 = x0.a(this.f1232a.getContext(), attributeSet, a.a.j.ViewBackgroundHelper, i, 0);
        try {
            if (a2.g(a.a.j.ViewBackgroundHelper_android_background)) {
                this.f1234c = a2.g(a.a.j.ViewBackgroundHelper_android_background, -1);
                ColorStateList b2 = this.f1233b.b(this.f1232a.getContext(), this.f1234c);
                if (b2 != null) {
                    a(b2);
                }
            }
            if (a2.g(a.a.j.ViewBackgroundHelper_backgroundTint)) {
                a.g.m.v.a(this.f1232a, a2.a(a.a.j.ViewBackgroundHelper_backgroundTint));
            }
            if (a2.g(a.a.j.ViewBackgroundHelper_backgroundTintMode)) {
                a.g.m.v.a(this.f1232a, e0.a(a2.d(a.a.j.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            a2.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList b() {
        v0 v0Var = this.f1236e;
        if (v0Var != null) {
            return v0Var.f1391a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(ColorStateList colorStateList) {
        if (this.f1236e == null) {
            this.f1236e = new v0();
        }
        v0 v0Var = this.f1236e;
        v0Var.f1391a = colorStateList;
        v0Var.f1394d = true;
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode c() {
        v0 v0Var = this.f1236e;
        if (v0Var != null) {
            return v0Var.f1392b;
        }
        return null;
    }
}
