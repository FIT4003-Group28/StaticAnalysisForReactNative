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
/* renamed from: yh  reason: default package */
/* loaded from: classes.dex */
public final class yh {
    public Typeface b;
    public boolean c;
    private final TextView d;
    private aeo e;
    private aeo f;
    private aeo g;
    private aeo h;
    private aeo i;
    private aeo j;
    private aeo k;
    private final yl l;
    public int a = 0;
    private int m = -1;

    public yh(TextView textView) {
        this.d = textView;
        this.l = new yl(textView);
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
            nb.b(text);
            if (Build.VERSION.SDK_INT >= 30) {
                amc.a(editorInfo, text);
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
                amd.b(editorInfo, null, 0, 0);
                return;
            }
            int i3 = editorInfo.inputType & 4095;
            if (i3 == 129 || i3 == 225 || i3 == 18) {
                amd.b(editorInfo, null, 0, 0);
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
                if (amd.a(text, i7, 0)) {
                    i7++;
                    min2--;
                }
                if (amd.a(text, (i2 + min) - 1, 1)) {
                    min--;
                }
                int i8 = min2 + i5;
                int i9 = i8 + min;
                if (i5 != i4) {
                    subSequence = TextUtils.concat(text.subSequence(i7, i7 + min2), text.subSequence(i2, min + i2));
                } else {
                    subSequence = text.subSequence(i7, i9 + i7);
                }
                amd.b(editorInfo, subSequence, min2, i8);
                return;
            } else {
                amd.b(editorInfo, text, i, i2);
                return;
            }
        }
        amc.a(editorInfo, text);
    }

    private final void t(Context context, aeq aeqVar) {
        String g;
        int[] iArr = sj.a;
        this.a = aeqVar.i(2, this.a);
        if (Build.VERSION.SDK_INT >= 28) {
            int i = aeqVar.i(11, -1);
            this.m = i;
            if (i != -1) {
                this.a &= 2;
            }
        }
        int i2 = 10;
        boolean z = false;
        if (aeqVar.p(10) || aeqVar.p(12)) {
            Typeface typeface = null;
            this.b = null;
            if (true == aeqVar.p(12)) {
                i2 = 12;
            }
            int i3 = this.m;
            int i4 = this.a;
            if (!context.isRestricted()) {
                yg ygVar = new yg(this, i3, i4, new WeakReference(this.d));
                try {
                    int i5 = this.a;
                    int resourceId = aeqVar.b.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        if (aeqVar.c == null) {
                            aeqVar.c = new TypedValue();
                        }
                        Context context2 = aeqVar.a;
                        TypedValue typedValue = aeqVar.c;
                        if (!context2.isRestricted()) {
                            typeface = ka.c(context2, resourceId, typedValue, i5, ygVar, true, false);
                        }
                    }
                    if (typeface != null) {
                        if (Build.VERSION.SDK_INT >= 28 && this.m != -1) {
                            this.b = Typeface.create(Typeface.create(typeface, 0), this.m, (this.a & 2) != 0);
                        } else {
                            this.b = typeface;
                        }
                    }
                    this.c = this.b == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.b != null || (g = aeqVar.g(i2)) == null) {
                return;
            }
            if (Build.VERSION.SDK_INT < 28 || this.m == -1) {
                this.b = Typeface.create(g, this.a);
                return;
            }
            Typeface create = Typeface.create(g, 0);
            int i6 = this.m;
            if ((2 & this.a) != 0) {
                z = true;
            }
            this.b = Typeface.create(create, i6, z);
        } else if (!aeqVar.p(1)) {
        } else {
            this.c = false;
            int i7 = aeqVar.i(1, 1);
            if (i7 == 1) {
                this.b = Typeface.SANS_SERIF;
            } else if (i7 == 2) {
                this.b = Typeface.SERIF;
            } else if (i7 != 3) {
            } else {
                this.b = Typeface.MONOSPACE;
            }
        }
    }

    private final void u(Drawable drawable, aeo aeoVar) {
        if (drawable == null || aeoVar == null) {
            return;
        }
        acv.g(drawable, aeoVar, this.d.getDrawableState());
    }

    private static aeo v(Context context, xi xiVar, int i) {
        ColorStateList e = xiVar.e(context, i);
        if (e != null) {
            aeo aeoVar = new aeo();
            aeoVar.d = true;
            aeoVar.a = e;
            return aeoVar;
        }
        return null;
    }

    private final void w() {
        aeo aeoVar = this.k;
        this.e = aeoVar;
        this.f = aeoVar;
        this.g = aeoVar;
        this.h = aeoVar;
        this.i = aeoVar;
        this.j = aeoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.util.AttributeSet r22, int r23) {
        /*
            Method dump skipped, instructions count: 1086
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yh.a(android.util.AttributeSet, int):void");
    }

    public final void b(Context context, int i) {
        String g;
        ColorStateList j;
        ColorStateList j2;
        ColorStateList j3;
        aeq c = aeq.c(context, i, sj.w);
        if (c.p(14)) {
            c(c.h(14, false));
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (c.p(3) && (j3 = c.j(3)) != null) {
                this.d.setTextColor(j3);
            }
            if (c.p(5) && (j2 = c.j(5)) != null) {
                this.d.setLinkTextColor(j2);
            }
            if (c.p(4) && (j = c.j(4)) != null) {
                this.d.setHintTextColor(j);
            }
        }
        if (c.p(0) && c.m(0, -1) == 0) {
            this.d.setTextSize(0, 0.0f);
        }
        t(context, c);
        if (Build.VERSION.SDK_INT >= 26 && c.p(13) && (g = c.g(13)) != null) {
            this.d.setFontVariationSettings(g);
        }
        c.q();
        Typeface typeface = this.b;
        if (typeface != null) {
            this.d.setTypeface(typeface, this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(boolean z) {
        this.d.setAllCaps(z);
    }

    public final void d() {
        if (this.e != null || this.f != null || this.g != null || this.h != null) {
            Drawable[] compoundDrawables = this.d.getCompoundDrawables();
            u(compoundDrawables[0], this.e);
            u(compoundDrawables[1], this.f);
            u(compoundDrawables[2], this.g);
            u(compoundDrawables[3], this.h);
        }
        if (this.i == null && this.j == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
        u(compoundDrawablesRelative[0], this.i);
        u(compoundDrawablesRelative[2], this.j);
    }

    public final void e(int i, float f) {
        if (pu.a || g()) {
            return;
        }
        this.l.h(i, f);
    }

    public final void f() {
        this.l.g();
    }

    public final boolean g() {
        return this.l.j();
    }

    public final void h(int i) {
        yl ylVar = this.l;
        if (ylVar.k()) {
            if (i == 0) {
                ylVar.a = 0;
                ylVar.d = -1.0f;
                ylVar.e = -1.0f;
                ylVar.c = -1.0f;
                ylVar.f = new int[0];
                ylVar.b = false;
            } else if (i == 1) {
                DisplayMetrics displayMetrics = ylVar.i.getResources().getDisplayMetrics();
                ylVar.e(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                if (!ylVar.f()) {
                    return;
                }
                ylVar.g();
            } else {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i);
            }
        }
    }

    public final void i(int i, int i2, int i3, int i4) {
        yl ylVar = this.l;
        if (ylVar.k()) {
            DisplayMetrics displayMetrics = ylVar.i.getResources().getDisplayMetrics();
            ylVar.e(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (!ylVar.f()) {
                return;
            }
            ylVar.g();
        }
    }

    public final void j(int[] iArr, int i) {
        yl ylVar = this.l;
        if (ylVar.k()) {
            int length = iArr.length;
            if (length <= 0) {
                ylVar.g = false;
            } else {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = ylVar.i.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                ylVar.f = yl.l(iArr2);
                if (!ylVar.d()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            }
            if (!ylVar.f()) {
                return;
            }
            ylVar.g();
        }
    }

    public final int k() {
        return this.l.a;
    }

    public final int l() {
        return this.l.a();
    }

    public final int m() {
        return this.l.b();
    }

    public final int n() {
        return this.l.c();
    }

    public final int[] o() {
        return this.l.f;
    }

    public final void p(ColorStateList colorStateList) {
        if (this.k == null) {
            this.k = new aeo();
        }
        aeo aeoVar = this.k;
        aeoVar.a = colorStateList;
        aeoVar.d = colorStateList != null;
        w();
    }

    public final void q(PorterDuff.Mode mode) {
        if (this.k == null) {
            this.k = new aeo();
        }
        aeo aeoVar = this.k;
        aeoVar.b = mode;
        aeoVar.c = mode != null;
        w();
    }

    public final void r() {
        if (!pu.a) {
            f();
        }
    }
}
