package defpackage;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: psg  reason: default package */
/* loaded from: classes4.dex */
public final class psg {
    public static final psg a;
    public final CharSequence b;
    public final Layout.Alignment c;
    public final Layout.Alignment d;
    public final Bitmap e;
    public final float f;
    public final int g;
    public final int h;
    public final float i;
    public final int j;
    public final float k;
    public final float l;
    public final boolean m;
    public final int n;
    public final int o;
    public final float p;
    public final int q;
    public final float r;

    static {
        psf psfVar = new psf();
        psfVar.a = "";
        a = psfVar.a();
    }

    public psg(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6) {
        if (charSequence == null) {
            ptx.a(bitmap);
        } else {
            ptx.c(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.b = SpannedString.valueOf(charSequence);
        } else {
            this.b = charSequence != null ? charSequence.toString() : null;
        }
        this.c = alignment;
        this.d = alignment2;
        this.e = bitmap;
        this.f = f;
        this.g = i;
        this.h = i2;
        this.i = f2;
        this.j = i3;
        this.k = f4;
        this.l = f5;
        this.m = z;
        this.n = i5;
        this.o = i4;
        this.p = f3;
        this.q = i6;
        this.r = f6;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            psg psgVar = (psg) obj;
            if (TextUtils.equals(this.b, psgVar.b) && this.c == psgVar.c && this.d == psgVar.d && ((bitmap = this.e) != null ? !((bitmap2 = psgVar.e) == null || !bitmap.sameAs(bitmap2)) : psgVar.e == null) && this.f == psgVar.f && this.g == psgVar.g && this.h == psgVar.h && this.i == psgVar.i && this.j == psgVar.j && this.k == psgVar.k && this.l == psgVar.l && this.m == psgVar.m && this.n == psgVar.n && this.o == psgVar.o && this.p == psgVar.p && this.q == psgVar.q && this.r == psgVar.r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e, Float.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), Float.valueOf(this.i), Integer.valueOf(this.j), Float.valueOf(this.k), Float.valueOf(this.l), Boolean.valueOf(this.m), Integer.valueOf(this.n), Integer.valueOf(this.o), Float.valueOf(this.p), Integer.valueOf(this.q), Float.valueOf(this.r)});
    }
}
