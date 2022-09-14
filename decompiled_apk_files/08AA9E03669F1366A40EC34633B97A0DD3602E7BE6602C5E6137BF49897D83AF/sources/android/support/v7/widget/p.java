package android.support.v7.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.a.a.b;
import android.support.v7.a.a;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import java.lang.ref.WeakReference;
/* compiled from: AppCompatTextHelper.java */
/* loaded from: classes.dex */
class p {

    /* renamed from: a  reason: collision with root package name */
    final TextView f1001a;

    /* renamed from: b  reason: collision with root package name */
    private ak f1002b;

    /* renamed from: c  reason: collision with root package name */
    private ak f1003c;

    /* renamed from: d  reason: collision with root package name */
    private ak f1004d;
    private ak e;
    private final s f;
    private int g = 0;
    private Typeface h;
    private boolean i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static p a(TextView textView) {
        if (Build.VERSION.SDK_INT >= 17) {
            return new q(textView);
        }
        return new p(textView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(TextView textView) {
        this.f1001a = textView;
        this.f = new s(this.f1001a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"NewApi"})
    public void a(AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        boolean z;
        boolean z2;
        Context context = this.f1001a.getContext();
        h a2 = h.a();
        am a3 = am.a(context, attributeSet, a.j.AppCompatTextHelper, i, 0);
        int g = a3.g(a.j.AppCompatTextHelper_android_textAppearance, -1);
        if (a3.f(a.j.AppCompatTextHelper_android_drawableLeft)) {
            this.f1002b = a(context, a2, a3.g(a.j.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (a3.f(a.j.AppCompatTextHelper_android_drawableTop)) {
            this.f1003c = a(context, a2, a3.g(a.j.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (a3.f(a.j.AppCompatTextHelper_android_drawableRight)) {
            this.f1004d = a(context, a2, a3.g(a.j.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (a3.f(a.j.AppCompatTextHelper_android_drawableBottom)) {
            this.e = a(context, a2, a3.g(a.j.AppCompatTextHelper_android_drawableBottom, 0));
        }
        a3.a();
        boolean z3 = this.f1001a.getTransformationMethod() instanceof PasswordTransformationMethod;
        ColorStateList colorStateList3 = null;
        if (g != -1) {
            am a4 = am.a(context, g, a.j.TextAppearance);
            if (z3 || !a4.f(a.j.TextAppearance_textAllCaps)) {
                z = false;
                z2 = false;
            } else {
                z2 = a4.a(a.j.TextAppearance_textAllCaps, false);
                z = true;
            }
            a(context, a4);
            if (Build.VERSION.SDK_INT < 23) {
                ColorStateList d2 = a4.f(a.j.TextAppearance_android_textColor) ? a4.d(a.j.TextAppearance_android_textColor) : null;
                colorStateList2 = a4.f(a.j.TextAppearance_android_textColorHint) ? a4.d(a.j.TextAppearance_android_textColorHint) : null;
                if (a4.f(a.j.TextAppearance_android_textColorLink)) {
                    colorStateList3 = a4.d(a.j.TextAppearance_android_textColorLink);
                }
                ColorStateList colorStateList4 = d2;
                colorStateList = colorStateList3;
                colorStateList3 = colorStateList4;
            } else {
                colorStateList = null;
                colorStateList2 = null;
            }
            a4.a();
        } else {
            colorStateList = null;
            colorStateList2 = null;
            z = false;
            z2 = false;
        }
        am a5 = am.a(context, attributeSet, a.j.TextAppearance, i, 0);
        if (!z3 && a5.f(a.j.TextAppearance_textAllCaps)) {
            z2 = a5.a(a.j.TextAppearance_textAllCaps, false);
            z = true;
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (a5.f(a.j.TextAppearance_android_textColor)) {
                colorStateList3 = a5.d(a.j.TextAppearance_android_textColor);
            }
            if (a5.f(a.j.TextAppearance_android_textColorHint)) {
                colorStateList2 = a5.d(a.j.TextAppearance_android_textColorHint);
            }
            if (a5.f(a.j.TextAppearance_android_textColorLink)) {
                colorStateList = a5.d(a.j.TextAppearance_android_textColorLink);
            }
        }
        a(context, a5);
        a5.a();
        if (colorStateList3 != null) {
            this.f1001a.setTextColor(colorStateList3);
        }
        if (colorStateList2 != null) {
            this.f1001a.setHintTextColor(colorStateList2);
        }
        if (colorStateList != null) {
            this.f1001a.setLinkTextColor(colorStateList);
        }
        if (!z3 && z) {
            a(z2);
        }
        if (this.h != null) {
            this.f1001a.setTypeface(this.h, this.g);
        }
        this.f.a(attributeSet, i);
        if (!android.support.v4.widget.b.f628a || this.f.a() == 0) {
            return;
        }
        int[] e = this.f.e();
        if (e.length <= 0) {
            return;
        }
        if (this.f1001a.getAutoSizeStepGranularity() != -1.0f) {
            this.f1001a.setAutoSizeTextTypeUniformWithConfiguration(this.f.c(), this.f.d(), this.f.b(), 0);
        } else {
            this.f1001a.setAutoSizeTextTypeUniformWithPresetSizes(e, 0);
        }
    }

    private void a(Context context, am amVar) {
        String c2;
        this.g = amVar.a(a.j.TextAppearance_android_textStyle, this.g);
        boolean z = true;
        if (amVar.f(a.j.TextAppearance_android_fontFamily) || amVar.f(a.j.TextAppearance_fontFamily)) {
            this.h = null;
            int i = amVar.f(a.j.TextAppearance_fontFamily) ? a.j.TextAppearance_fontFamily : a.j.TextAppearance_android_fontFamily;
            if (!context.isRestricted()) {
                final WeakReference weakReference = new WeakReference(this.f1001a);
                try {
                    this.h = amVar.a(i, this.g, new b.a() { // from class: android.support.v7.widget.p.1
                        @Override // android.support.v4.a.a.b.a
                        public void a(int i2) {
                        }

                        @Override // android.support.v4.a.a.b.a
                        public void a(Typeface typeface) {
                            p.this.a(weakReference, typeface);
                        }
                    });
                    if (this.h != null) {
                        z = false;
                    }
                    this.i = z;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.h != null || (c2 = amVar.c(i)) == null) {
                return;
            }
            this.h = Typeface.create(c2, this.g);
        } else if (!amVar.f(a.j.TextAppearance_android_typeface)) {
        } else {
            this.i = false;
            switch (amVar.a(a.j.TextAppearance_android_typeface, 1)) {
                case 1:
                    this.h = Typeface.SANS_SERIF;
                    return;
                case 2:
                    this.h = Typeface.SERIF;
                    return;
                case 3:
                    this.h = Typeface.MONOSPACE;
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.i) {
            this.h = typeface;
            TextView textView = weakReference.get();
            if (textView == null) {
                return;
            }
            textView.setTypeface(typeface, this.g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Context context, int i) {
        ColorStateList d2;
        am a2 = am.a(context, i, a.j.TextAppearance);
        if (a2.f(a.j.TextAppearance_textAllCaps)) {
            a(a2.a(a.j.TextAppearance_textAllCaps, false));
        }
        if (Build.VERSION.SDK_INT < 23 && a2.f(a.j.TextAppearance_android_textColor) && (d2 = a2.d(a.j.TextAppearance_android_textColor)) != null) {
            this.f1001a.setTextColor(d2);
        }
        a(context, a2);
        a2.a();
        if (this.h != null) {
            this.f1001a.setTypeface(this.h, this.g);
        }
    }

    void a(boolean z) {
        this.f1001a.setAllCaps(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        if (this.f1002b == null && this.f1003c == null && this.f1004d == null && this.e == null) {
            return;
        }
        Drawable[] compoundDrawables = this.f1001a.getCompoundDrawables();
        a(compoundDrawables[0], this.f1002b);
        a(compoundDrawables[1], this.f1003c);
        a(compoundDrawables[2], this.f1004d);
        a(compoundDrawables[3], this.e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Drawable drawable, ak akVar) {
        if (drawable == null || akVar == null) {
            return;
        }
        h.a(drawable, akVar, this.f1001a.getDrawableState());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static ak a(Context context, h hVar, int i) {
        ColorStateList b2 = hVar.b(context, i);
        if (b2 != null) {
            ak akVar = new ak();
            akVar.f919d = true;
            akVar.f916a = b2;
            return akVar;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z, int i, int i2, int i3, int i4) {
        if (!android.support.v4.widget.b.f628a) {
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, float f) {
        if (android.support.v4.widget.b.f628a || c()) {
            return;
        }
        b(i, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        this.f.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        return this.f.g();
    }

    private void b(int i, float f) {
        this.f.a(i, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        this.f.a(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, int i2, int i3, int i4) {
        this.f.a(i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int[] iArr, int i) {
        this.f.a(iArr, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        return this.f.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.f.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.f.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return this.f.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] h() {
        return this.f.e();
    }
}
