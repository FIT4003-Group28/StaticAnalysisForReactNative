package defpackage;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cmgi  reason: default package */
/* loaded from: classes5.dex */
final class cmgi {
    public final List<cmgh> a = new ArrayList();
    public final List<SpannableString> b = new ArrayList();
    public final StringBuilder c = new StringBuilder();
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public cmgi(int i, int i2) {
        a(i);
        this.h = i2;
    }

    private static void h(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
    }

    private static void i(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
    }

    private static void j(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
        if (i3 == -1) {
            return;
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
    }

    public final void a(int i) {
        this.g = i;
        this.a.clear();
        this.b.clear();
        this.c.setLength(0);
        this.d = 15;
        this.e = 0;
        this.f = 0;
    }

    public final boolean b() {
        return this.a.isEmpty() && this.b.isEmpty() && this.c.length() == 0;
    }

    public final void c(int i, boolean z) {
        this.a.add(new cmgh(i, z, this.c.length()));
    }

    public final void d() {
        cmgh cmghVar;
        int i;
        int length = this.c.length();
        if (length > 0) {
            this.c.delete(length - 1, length);
            int size = this.a.size();
            while (true) {
                size--;
                if (size < 0 || (i = (cmghVar = this.a.get(size)).c) != length) {
                    return;
                }
                cmghVar.c = i - 1;
            }
        }
    }

    public final void e(char c) {
        if (this.c.length() < 32) {
            this.c.append(c);
        }
    }

    public final cmfw f(int i) {
        float f;
        int i2 = this.e + this.f;
        int i3 = 32 - i2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i4 = 0; i4 < this.b.size(); i4++) {
            spannableStringBuilder.append(cmny.J(this.b.get(i4), i3));
            spannableStringBuilder.append('\n');
        }
        spannableStringBuilder.append(cmny.J(g(), i3));
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int length = i3 - spannableStringBuilder.length();
        int i5 = i2 - length;
        if (i == Integer.MIN_VALUE) {
            i = (this.g != 2 || (Math.abs(i5) >= 3 && length >= 0)) ? (this.g != 2 || i5 <= 0) ? 0 : 2 : 1;
        }
        if (i != 1) {
            if (i == 2) {
                i2 = 32 - length;
            }
            f = ((i2 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f = 0.5f;
        }
        int i6 = this.d;
        if (i6 > 7) {
            i6 -= 17;
        } else if (this.g == 1) {
            i6 -= this.h - 1;
        }
        cmfv cmfvVar = new cmfv();
        cmfvVar.a = spannableStringBuilder;
        cmfvVar.c = Layout.Alignment.ALIGN_NORMAL;
        cmfvVar.b(i6, 1);
        cmfvVar.e = f;
        cmfvVar.f = i;
        return cmfvVar.a();
    }

    public final SpannableString g() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.c);
        int length = spannableStringBuilder.length();
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = 0;
        int i6 = -1;
        boolean z = false;
        while (i < this.a.size()) {
            cmgh cmghVar = this.a.get(i);
            boolean z2 = cmghVar.b;
            int i7 = cmghVar.a;
            if (i7 != 8) {
                boolean z3 = i7 == 7;
                if (i7 != 7) {
                    i3 = cmgj.a[i7];
                }
                z = z3;
            }
            int i8 = cmghVar.c;
            i++;
            if (i8 != (i < this.a.size() ? this.a.get(i).c : length)) {
                if (i2 != -1 && !z2) {
                    h(spannableStringBuilder, i2, i8);
                    i2 = -1;
                } else if (i2 == -1 && z2) {
                    i2 = i8;
                }
                if (i4 != -1 && !z) {
                    i(spannableStringBuilder, i4, i8);
                    i4 = -1;
                } else if (i4 == -1 && z) {
                    i4 = i8;
                }
                if (i3 != i6) {
                    j(spannableStringBuilder, i5, i8, i6);
                    i6 = i3;
                    i5 = i8;
                }
            }
        }
        if (i2 != -1 && i2 != length) {
            h(spannableStringBuilder, i2, length);
        }
        if (i4 != -1 && i4 != length) {
            i(spannableStringBuilder, i4, length);
        }
        if (i5 != length) {
            j(spannableStringBuilder, i5, length, i6);
        }
        return new SpannableString(spannableStringBuilder);
    }
}
