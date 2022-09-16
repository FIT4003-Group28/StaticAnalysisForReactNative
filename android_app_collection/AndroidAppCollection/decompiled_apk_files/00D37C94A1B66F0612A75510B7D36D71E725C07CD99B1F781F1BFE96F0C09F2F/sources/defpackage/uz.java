package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: uz  reason: default package */
/* loaded from: classes4.dex */
public final class uz {
    public aab a;
    public Typeface c;
    public boolean d;
    private final TextView e;
    private aab f;
    private aab g;
    private aab h;
    private aab i;
    private aab j;
    private aab k;
    private final vc l;
    public int b = 0;
    private int m = -1;

    public uz(TextView textView) {
        this.e = textView;
        this.l = new vc(textView);
    }

    public static final void s(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i;
        int i2;
        CharSequence subSequence;
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (Build.VERSION.SDK_INT < 30) {
            hz.g(text);
            if (Build.VERSION.SDK_INT >= 30) {
                hz.k(editorInfo, text);
                return;
            }
            if (editorInfo.initialSelStart > editorInfo.initialSelEnd) {
                i = editorInfo.initialSelEnd;
            } else {
                i = editorInfo.initialSelStart;
            }
            if (editorInfo.initialSelStart > editorInfo.initialSelEnd) {
                i2 = editorInfo.initialSelStart;
            } else {
                i2 = editorInfo.initialSelEnd;
            }
            int length = text.length();
            if (i < 0 || i2 > length) {
                als.a(editorInfo, null, 0, 0);
                return;
            }
            int i3 = editorInfo.inputType & 4095;
            if (i3 == 129 || i3 == 225 || i3 == 18) {
                als.a(editorInfo, null, 0, 0);
                return;
            } else if (length > 2048) {
                int i4 = i2 - i;
                int i5 = i4 > 1024 ? 0 : i4;
                int i6 = 2048 - i5;
                double d = i6;
                Double.isNaN(d);
                int min = Math.min(text.length() - i2, i6 - Math.min(i, (int) (d * 0.8d)));
                int min2 = Math.min(i, i6 - min);
                int i7 = i - min2;
                if (als.b(text, i7, 0)) {
                    i7++;
                    min2--;
                }
                if (als.b(text, (i2 + min) - 1, 1)) {
                    min--;
                }
                int i8 = min2 + i5;
                int i9 = i8 + min;
                if (i5 != i4) {
                    subSequence = TextUtils.concat(text.subSequence(i7, i7 + min2), text.subSequence(i2, min + i2));
                } else {
                    subSequence = text.subSequence(i7, i9 + i7);
                }
                als.a(editorInfo, subSequence, min2, i8);
                return;
            } else {
                als.a(editorInfo, text, i, i2);
                return;
            }
        }
        hz.k(editorInfo, text);
    }

    private static aab t(Context context, ud udVar, int i) {
        ColorStateList a = udVar.a(context, i);
        if (a != null) {
            aab aabVar = new aab();
            aabVar.d = true;
            aabVar.a = a;
            return aabVar;
        }
        return null;
    }

    private final void u(Drawable drawable, aab aabVar) {
        if (drawable == null || aabVar == null) {
            return;
        }
        yv.h(drawable, aabVar, this.e.getDrawableState());
    }

    private final void v() {
        aab aabVar = this.a;
        this.f = aabVar;
        this.g = aabVar;
        this.h = aabVar;
        this.i = aabVar;
        this.j = aabVar;
        this.k = aabVar;
    }

    private final void w(Context context, aad aadVar) {
        String n;
        int[] iArr = pm.a;
        this.b = aadVar.c(2, this.b);
        if (Build.VERSION.SDK_INT >= 28) {
            int c = aadVar.c(11, -1);
            this.m = c;
            if (c != -1) {
                this.b &= 2;
            }
        }
        int i = 10;
        boolean z = false;
        if (aadVar.q(10) || aadVar.q(12)) {
            Typeface typeface = null;
            this.c = null;
            if (true == aadVar.q(12)) {
                i = 12;
            }
            int i2 = this.m;
            int i3 = this.b;
            if (!context.isRestricted()) {
                ux uxVar = new ux(this, i2, i3, new WeakReference(this.e));
                try {
                    int i4 = this.b;
                    int resourceId = aadVar.b.getResourceId(i, 0);
                    if (resourceId != 0) {
                        if (aadVar.c == null) {
                            aadVar.c = new TypedValue();
                        }
                        typeface = gw.e(aadVar.a, resourceId, aadVar.c, i4, uxVar);
                    }
                    if (typeface != null) {
                        if (Build.VERSION.SDK_INT >= 28 && this.m != -1) {
                            this.c = Typeface.create(Typeface.create(typeface, 0), this.m, (this.b & 2) != 0);
                        } else {
                            this.c = typeface;
                        }
                    }
                    this.d = this.c == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.c != null || (n = aadVar.n(i)) == null) {
                return;
            }
            if (Build.VERSION.SDK_INT < 28 || this.m == -1) {
                this.c = Typeface.create(n, this.b);
                return;
            }
            Typeface create = Typeface.create(n, 0);
            int i5 = this.m;
            if ((this.b & 2) != 0) {
                z = true;
            }
            this.c = Typeface.create(create, i5, z);
        } else if (!aadVar.q(1)) {
        } else {
            this.d = false;
            int c2 = aadVar.c(1, 1);
            if (c2 == 1) {
                this.c = Typeface.SANS_SERIF;
            } else if (c2 == 2) {
                this.c = Typeface.SERIF;
            } else if (c2 != 3) {
            } else {
                this.c = Typeface.MONOSPACE;
            }
        }
    }

    public final int a() {
        return this.l.a();
    }

    public final int b() {
        return this.l.b();
    }

    public final int c() {
        return this.l.c();
    }

    public final int d() {
        return this.l.a;
    }

    public final void e() {
        if (this.f != null || this.g != null || this.h != null || this.i != null) {
            Drawable[] compoundDrawables = this.e.getCompoundDrawables();
            u(compoundDrawables[0], this.f);
            u(compoundDrawables[1], this.g);
            u(compoundDrawables[2], this.h);
            u(compoundDrawables[3], this.i);
        }
        if (this.j == null && this.k == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.e.getCompoundDrawablesRelative();
        u(compoundDrawablesRelative[0], this.j);
        u(compoundDrawablesRelative[2], this.k);
    }

    public final void f() {
        this.l.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(android.util.AttributeSet r22, int r23) {
        /*
            Method dump skipped, instructions count: 1086
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uz.g(android.util.AttributeSet, int):void");
    }

    public final void h(Context context, int i) {
        String n;
        ColorStateList g;
        ColorStateList g2;
        ColorStateList g3;
        aad j = aad.j(context, i, pm.w);
        if (j.q(14)) {
            i(j.p(14, false));
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (j.q(3) && (g3 = j.g(3)) != null) {
                this.e.setTextColor(g3);
            }
            if (j.q(5) && (g2 = j.g(5)) != null) {
                this.e.setLinkTextColor(g2);
            }
            if (j.q(4) && (g = j.g(4)) != null) {
                this.e.setHintTextColor(g);
            }
        }
        if (j.q(0) && j.b(0, -1) == 0) {
            this.e.setTextSize(0, 0.0f);
        }
        w(context, j);
        if (Build.VERSION.SDK_INT >= 26 && j.q(13) && (n = j.n(13)) != null) {
            this.e.setFontVariationSettings(n);
        }
        j.o();
        Typeface typeface = this.c;
        if (typeface != null) {
            this.e.setTypeface(typeface, this.b);
        }
    }

    public final void i(boolean z) {
        this.e.setAllCaps(z);
    }

    public final void j(int i, int i2, int i3, int i4) {
        vc vcVar = this.l;
        if (vcVar.k()) {
            DisplayMetrics displayMetrics = vcVar.i.getResources().getDisplayMetrics();
            vcVar.g(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (!vcVar.i()) {
                return;
            }
            vcVar.e();
        }
    }

    public final void k(int[] iArr, int i) {
        vc vcVar = this.l;
        if (vcVar.k()) {
            int length = iArr.length;
            if (length <= 0) {
                vcVar.g = false;
            } else {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = vcVar.i.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                vcVar.f = vc.l(iArr2);
                if (!vcVar.j()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            }
            if (!vcVar.i()) {
                return;
            }
            vcVar.e();
        }
    }

    public final void l(int i) {
        vc vcVar = this.l;
        if (vcVar.k()) {
            if (i == 0) {
                vcVar.a = 0;
                vcVar.d = -1.0f;
                vcVar.e = -1.0f;
                vcVar.c = -1.0f;
                vcVar.f = new int[0];
                vcVar.b = false;
            } else if (i == 1) {
                DisplayMetrics displayMetrics = vcVar.i.getResources().getDisplayMetrics();
                vcVar.g(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                if (!vcVar.i()) {
                    return;
                }
                vcVar.e();
            } else {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i);
            }
        }
    }

    public final void m(ColorStateList colorStateList) {
        if (this.a == null) {
            this.a = new aab();
        }
        aab aabVar = this.a;
        aabVar.a = colorStateList;
        aabVar.d = colorStateList != null;
        v();
    }

    public final void n(PorterDuff.Mode mode) {
        if (this.a == null) {
            this.a = new aab();
        }
        aab aabVar = this.a;
        aabVar.b = mode;
        aabVar.c = mode != null;
        v();
    }

    public final void o(int i, float f) {
        if (my.a || p()) {
            return;
        }
        this.l.f(i, f);
    }

    public final boolean p() {
        return this.l.h();
    }

    public final int[] q() {
        return this.l.f;
    }

    public final void r() {
        if (!my.a) {
            f();
        }
    }
}
