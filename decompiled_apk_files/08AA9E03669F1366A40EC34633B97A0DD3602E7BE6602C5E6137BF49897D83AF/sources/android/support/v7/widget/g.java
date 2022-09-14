package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.a.a;
import android.util.AttributeSet;
import android.view.View;
/* compiled from: AppCompatBackgroundHelper.java */
/* loaded from: classes.dex */
class g {

    /* renamed from: a  reason: collision with root package name */
    private final View f966a;

    /* renamed from: d  reason: collision with root package name */
    private ak f969d;
    private ak e;
    private ak f;

    /* renamed from: c  reason: collision with root package name */
    private int f968c = -1;

    /* renamed from: b  reason: collision with root package name */
    private final h f967b = h.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(View view) {
        this.f966a = view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(AttributeSet attributeSet, int i) {
        am a2 = am.a(this.f966a.getContext(), attributeSet, a.j.ViewBackgroundHelper, i, 0);
        try {
            if (a2.f(a.j.ViewBackgroundHelper_android_background)) {
                this.f968c = a2.g(a.j.ViewBackgroundHelper_android_background, -1);
                ColorStateList b2 = this.f967b.b(this.f966a.getContext(), this.f968c);
                if (b2 != null) {
                    b(b2);
                }
            }
            if (a2.f(a.j.ViewBackgroundHelper_backgroundTint)) {
                android.support.v4.j.s.a(this.f966a, a2.d(a.j.ViewBackgroundHelper_backgroundTint));
            }
            if (a2.f(a.j.ViewBackgroundHelper_backgroundTintMode)) {
                android.support.v4.j.s.a(this.f966a, u.a(a2.a(a.j.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            a2.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        this.f968c = i;
        b(this.f967b != null ? this.f967b.b(this.f966a.getContext(), i) : null);
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Drawable drawable) {
        this.f968c = -1;
        b((ColorStateList) null);
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new ak();
        }
        this.e.f916a = colorStateList;
        this.e.f919d = true;
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList a() {
        if (this.e != null) {
            return this.e.f916a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new ak();
        }
        this.e.f917b = mode;
        this.e.f918c = true;
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode b() {
        if (this.e != null) {
            return this.e.f917b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        Drawable background = this.f966a.getBackground();
        if (background != null) {
            if (d() && b(background)) {
                return;
            }
            if (this.e != null) {
                h.a(background, this.e, this.f966a.getDrawableState());
            } else if (this.f969d == null) {
            } else {
                h.a(background, this.f969d, this.f966a.getDrawableState());
            }
        }
    }

    void b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f969d == null) {
                this.f969d = new ak();
            }
            this.f969d.f916a = colorStateList;
            this.f969d.f919d = true;
        } else {
            this.f969d = null;
        }
        c();
    }

    private boolean d() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f969d != null : i == 21;
    }

    private boolean b(Drawable drawable) {
        if (this.f == null) {
            this.f = new ak();
        }
        ak akVar = this.f;
        akVar.a();
        ColorStateList l = android.support.v4.j.s.l(this.f966a);
        if (l != null) {
            akVar.f919d = true;
            akVar.f916a = l;
        }
        PorterDuff.Mode m = android.support.v4.j.s.m(this.f966a);
        if (m != null) {
            akVar.f918c = true;
            akVar.f917b = m;
        }
        if (akVar.f919d || akVar.f918c) {
            h.a(drawable, akVar, this.f966a.getDrawableState());
            return true;
        }
        return false;
    }
}
