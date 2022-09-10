package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.List;
/* compiled from: PG */
/* renamed from: cmid  reason: default package */
/* loaded from: classes5.dex */
public final class cmid extends cmfy {
    private final cmnk f = new cmnk();
    private final boolean g;
    private final int h;
    private final int i;
    private final String j;
    private final float k;
    private final int l;

    public cmid(List<byte[]> list) {
        String str = "sans-serif";
        boolean z = true;
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.h = 0;
            this.i = -1;
            this.j = str;
            this.g = false;
            this.k = 0.85f;
            this.l = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.h = bArr[24];
        this.i = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.j = true == "Serif".equals(cmny.s(bArr, 43, bArr.length + (-43))) ? "serif" : str;
        int i = bArr[25] * 20;
        this.l = i;
        z = (bArr[0] & 32) == 0 ? false : z;
        this.g = z;
        if (z) {
            this.k = cmny.D(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
        } else {
            this.k = 0.85f;
        }
    }

    private static void n(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            int i7 = i & 1;
            int i8 = i & 2;
            if (i7 != 0) {
                if (i8 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (i8 != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            if ((i & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            } else if (i7 != 0 || i8 != 0) {
            } else {
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
            }
        }
    }

    private static void o(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    private static void p(boolean z) {
        if (z) {
            return;
        }
        throw new cmgc("Unexpected subtitle format.");
    }

    @Override // defpackage.cmfy
    protected final cmga m(byte[] bArr, int i, boolean z) {
        String z2;
        int i2;
        int i3;
        this.f.c(bArr, i);
        cmnk cmnkVar = this.f;
        int i4 = 1;
        p(cmnkVar.d() >= 2);
        int m = cmnkVar.m();
        if (m == 0) {
            z2 = "";
        } else {
            if (cmnkVar.d() >= 2) {
                byte[] bArr2 = cmnkVar.a;
                int i5 = cmnkVar.b;
                int i6 = (bArr2[i5 + 1] & 255) | ((bArr2[i5] & 255) << 8);
                if (i6 == 65279 || i6 == 65534) {
                    z2 = cmnkVar.z(m, dbrc.d);
                }
            }
            z2 = cmnkVar.z(m, dbrc.c);
        }
        if (z2.isEmpty()) {
            return cmie.a;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(z2);
        n(spannableStringBuilder, this.h, 0, 0, spannableStringBuilder.length(), 16711680);
        o(spannableStringBuilder, this.i, -1, 0, spannableStringBuilder.length(), 16711680);
        String str = this.j;
        int length = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f = this.k;
        for (int i7 = 8; this.f.d() >= i7; i7 = 8) {
            cmnk cmnkVar2 = this.f;
            int i8 = cmnkVar2.b;
            int r = cmnkVar2.r();
            int r2 = this.f.r();
            if (r2 == 1937013100) {
                p(this.f.d() >= 2);
                int m2 = this.f.m();
                int i9 = 0;
                while (i9 < m2) {
                    cmnk cmnkVar3 = this.f;
                    p(cmnkVar3.d() >= 12);
                    int m3 = cmnkVar3.m();
                    int m4 = cmnkVar3.m();
                    cmnkVar3.h(2);
                    int l = cmnkVar3.l();
                    cmnkVar3.h(i4);
                    int r3 = cmnkVar3.r();
                    if (m4 > spannableStringBuilder.length()) {
                        int length2 = spannableStringBuilder.length();
                        StringBuilder sb = new StringBuilder(68);
                        sb.append("Truncating styl end (");
                        sb.append(m4);
                        sb.append(") to cueText.length() (");
                        sb.append(length2);
                        sb.append(").");
                        sb.toString();
                        i2 = spannableStringBuilder.length();
                    } else {
                        i2 = m4;
                    }
                    if (m3 >= i2) {
                        StringBuilder sb2 = new StringBuilder(60);
                        sb2.append("Ignoring styl with start (");
                        sb2.append(m3);
                        sb2.append(") >= end (");
                        sb2.append(i2);
                        sb2.append(").");
                        sb2.toString();
                        i3 = i9;
                    } else {
                        int i10 = i2;
                        i3 = i9;
                        n(spannableStringBuilder, l, this.h, m3, i10, 0);
                        o(spannableStringBuilder, r3, this.i, m3, i10, 0);
                    }
                    i9 = i3 + 1;
                    i4 = 1;
                }
            } else if (r2 == 1952608120 && this.g) {
                p(this.f.d() >= 2);
                f = cmny.D(this.f.m() / this.l, 0.0f, 0.95f);
            }
            this.f.f(i8 + r);
            i4 = 1;
        }
        cmfv cmfvVar = new cmfv();
        cmfvVar.a = spannableStringBuilder;
        cmfvVar.b(f, 0);
        cmfvVar.d = 0;
        return new cmie(cmfvVar.a());
    }
}
