package androidx.appcompat.widget;

import a.g.e.f.f;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
class y {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f1420a;

    /* renamed from: b  reason: collision with root package name */
    private v0 f1421b;

    /* renamed from: c  reason: collision with root package name */
    private v0 f1422c;

    /* renamed from: d  reason: collision with root package name */
    private v0 f1423d;

    /* renamed from: e  reason: collision with root package name */
    private v0 f1424e;

    /* renamed from: f  reason: collision with root package name */
    private v0 f1425f;

    /* renamed from: g  reason: collision with root package name */
    private v0 f1426g;

    /* renamed from: h  reason: collision with root package name */
    private v0 f1427h;
    private final a0 i;
    private int j = 0;
    private int k = -1;
    private Typeface l;
    private boolean m;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a extends f.a {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<y> f1428a;

        /* renamed from: b  reason: collision with root package name */
        private final int f1429b;

        /* renamed from: c  reason: collision with root package name */
        private final int f1430c;

        /* renamed from: androidx.appcompat.widget.y$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private class RunnableC0045a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            private final WeakReference<y> f1431b;

            /* renamed from: c  reason: collision with root package name */
            private final Typeface f1432c;

            RunnableC0045a(a aVar, WeakReference<y> weakReference, Typeface typeface) {
                this.f1431b = weakReference;
                this.f1432c = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                y yVar = this.f1431b.get();
                if (yVar == null) {
                    return;
                }
                yVar.a(this.f1432c);
            }
        }

        a(y yVar, int i, int i2) {
            this.f1428a = new WeakReference<>(yVar);
            this.f1429b = i;
            this.f1430c = i2;
        }

        @Override // a.g.e.f.f.a
        public void a(int i) {
        }

        @Override // a.g.e.f.f.a
        public void a(Typeface typeface) {
            int i;
            y yVar = this.f1428a.get();
            if (yVar == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f1429b) != -1) {
                typeface = Typeface.create(typeface, i, (this.f1430c & 2) != 0);
            }
            yVar.a(new RunnableC0045a(this, this.f1428a, typeface));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(TextView textView) {
        this.f1420a = textView;
        this.i = new a0(this.f1420a);
    }

    private static v0 a(Context context, j jVar, int i) {
        ColorStateList b2 = jVar.b(context, i);
        if (b2 != null) {
            v0 v0Var = new v0();
            v0Var.f1394d = true;
            v0Var.f1391a = b2;
            return v0Var;
        }
        return null;
    }

    private void a(Context context, x0 x0Var) {
        String d2;
        Typeface create;
        Typeface typeface;
        this.j = x0Var.d(a.a.j.TextAppearance_android_textStyle, this.j);
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 28) {
            this.k = x0Var.d(a.a.j.TextAppearance_android_textFontWeight, -1);
            if (this.k != -1) {
                this.j = (this.j & 2) | 0;
            }
        }
        if (!x0Var.g(a.a.j.TextAppearance_android_fontFamily) && !x0Var.g(a.a.j.TextAppearance_fontFamily)) {
            if (!x0Var.g(a.a.j.TextAppearance_android_typeface)) {
                return;
            }
            this.m = false;
            int d3 = x0Var.d(a.a.j.TextAppearance_android_typeface, 1);
            if (d3 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (d3 == 2) {
                typeface = Typeface.SERIF;
            } else if (d3 != 3) {
                return;
            } else {
                typeface = Typeface.MONOSPACE;
            }
            this.l = typeface;
            return;
        }
        this.l = null;
        int i = x0Var.g(a.a.j.TextAppearance_fontFamily) ? a.a.j.TextAppearance_fontFamily : a.a.j.TextAppearance_android_fontFamily;
        int i2 = this.k;
        int i3 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface a2 = x0Var.a(i, this.j, new a(this, i2, i3));
                if (a2 != null) {
                    if (Build.VERSION.SDK_INT >= 28 && this.k != -1) {
                        a2 = Typeface.create(Typeface.create(a2, 0), this.k, (this.j & 2) != 0);
                    }
                    this.l = a2;
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (d2 = x0Var.d(i)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
            create = Typeface.create(d2, this.j);
        } else {
            Typeface create2 = Typeface.create(d2, 0);
            int i4 = this.k;
            if ((this.j & 2) != 0) {
                z = true;
            }
            create = Typeface.create(create2, i4, z);
        }
        this.l = create;
    }

    private void a(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (Build.VERSION.SDK_INT >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] compoundDrawablesRelative = this.f1420a.getCompoundDrawablesRelative();
            TextView textView = this.f1420a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
        } else {
            if (Build.VERSION.SDK_INT >= 17) {
                Drawable[] compoundDrawablesRelative2 = this.f1420a.getCompoundDrawablesRelative();
                if (compoundDrawablesRelative2[0] != null || compoundDrawablesRelative2[2] != null) {
                    TextView textView2 = this.f1420a;
                    Drawable drawable7 = compoundDrawablesRelative2[0];
                    if (drawable2 == null) {
                        drawable2 = compoundDrawablesRelative2[1];
                    }
                    Drawable drawable8 = compoundDrawablesRelative2[2];
                    if (drawable4 == null) {
                        drawable4 = compoundDrawablesRelative2[3];
                    }
                    textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                    return;
                }
            }
            Drawable[] compoundDrawables = this.f1420a.getCompoundDrawables();
            TextView textView3 = this.f1420a;
            if (drawable == null) {
                drawable = compoundDrawables[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawables[1];
            }
            if (drawable3 == null) {
                drawable3 = compoundDrawables[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawables[3];
            }
            textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }

    private void a(Drawable drawable, v0 v0Var) {
        if (drawable == null || v0Var == null) {
            return;
        }
        j.a(drawable, v0Var, this.f1420a.getDrawableState());
    }

    private void b(int i, float f2) {
        this.i.a(i, f2);
    }

    private void l() {
        v0 v0Var = this.f1427h;
        this.f1421b = v0Var;
        this.f1422c = v0Var;
        this.f1423d = v0Var;
        this.f1424e = v0Var;
        this.f1425f = v0Var;
        this.f1426g = v0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        if (this.f1421b != null || this.f1422c != null || this.f1423d != null || this.f1424e != null) {
            Drawable[] compoundDrawables = this.f1420a.getCompoundDrawables();
            a(compoundDrawables[0], this.f1421b);
            a(compoundDrawables[1], this.f1422c);
            a(compoundDrawables[2], this.f1423d);
            a(compoundDrawables[3], this.f1424e);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (this.f1425f == null && this.f1426g == null) {
                return;
            }
            Drawable[] compoundDrawablesRelative = this.f1420a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f1425f);
            a(compoundDrawablesRelative[2], this.f1426g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        this.i.b(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, float f2) {
        if (androidx.core.widget.b.f1622a || j()) {
            return;
        }
        b(i, f2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, int i2, int i3, int i4) {
        this.i.a(i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Context context, int i) {
        String d2;
        ColorStateList a2;
        x0 a3 = x0.a(context, i, a.a.j.TextAppearance);
        if (a3.g(a.a.j.TextAppearance_textAllCaps)) {
            a(a3.a(a.a.j.TextAppearance_textAllCaps, false));
        }
        if (Build.VERSION.SDK_INT < 23 && a3.g(a.a.j.TextAppearance_android_textColor) && (a2 = a3.a(a.a.j.TextAppearance_android_textColor)) != null) {
            this.f1420a.setTextColor(a2);
        }
        if (a3.g(a.a.j.TextAppearance_android_textSize) && a3.c(a.a.j.TextAppearance_android_textSize, -1) == 0) {
            this.f1420a.setTextSize(0, 0.0f);
        }
        a(context, a3);
        if (Build.VERSION.SDK_INT >= 26 && a3.g(a.a.j.TextAppearance_fontVariationSettings) && (d2 = a3.d(a.a.j.TextAppearance_fontVariationSettings)) != null) {
            this.f1420a.setFontVariationSettings(d2);
        }
        a3.a();
        Typeface typeface = this.l;
        if (typeface != null) {
            this.f1420a.setTypeface(typeface, this.j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList) {
        if (this.f1427h == null) {
            this.f1427h = new v0();
        }
        v0 v0Var = this.f1427h;
        v0Var.f1391a = colorStateList;
        v0Var.f1394d = colorStateList != null;
        l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(PorterDuff.Mode mode) {
        if (this.f1427h == null) {
            this.f1427h = new v0();
        }
        v0 v0Var = this.f1427h;
        v0Var.f1392b = mode;
        v0Var.f1393c = mode != null;
        l();
    }

    public void a(Typeface typeface) {
        if (this.m) {
            this.f1420a.setTypeface(typeface);
            this.l = typeface;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0117  */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.util.AttributeSet r19, int r20) {
        /*
            Method dump skipped, instructions count: 825
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.y.a(android.util.AttributeSet, int):void");
    }

    public void a(Runnable runnable) {
        this.f1420a.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        this.f1420a.setAllCaps(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z, int i, int i2, int i3, int i4) {
        if (!androidx.core.widget.b.f1622a) {
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int[] iArr, int i) {
        this.i.a(iArr, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        this.i.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.i.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        return this.i.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.i.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] f() {
        return this.i.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return this.i.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList h() {
        v0 v0Var = this.f1427h;
        if (v0Var != null) {
            return v0Var.f1391a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode i() {
        v0 v0Var = this.f1427h;
        if (v0Var != null) {
            return v0Var.f1392b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean j() {
        return this.i.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k() {
        a();
    }
}
