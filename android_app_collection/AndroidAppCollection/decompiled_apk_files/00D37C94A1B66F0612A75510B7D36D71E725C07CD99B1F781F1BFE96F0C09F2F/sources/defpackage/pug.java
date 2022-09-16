package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import java.util.List;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: pug  reason: default package */
/* loaded from: classes4.dex */
public final class pug extends psi {
    private final pwu a;
    private final boolean b;
    private final int c;
    private final int d;
    private final String e;
    private final float f;
    private final int g;

    public pug(List list) {
        super("Tx3gDecoder");
        this.a = new pwu();
        String str = "sans-serif";
        boolean z = true;
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.c = 0;
            this.d = -1;
            this.e = str;
            this.b = false;
            this.f = 0.85f;
            this.g = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.c = bArr[24];
        this.d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.e = true == "Serif".equals(pxi.B(bArr, 43, bArr.length + (-43))) ? "serif" : str;
        int i = bArr[25] * 20;
        this.g = i;
        z = (bArr[0] & 32) == 0 ? false : z;
        this.b = z;
        if (z) {
            this.f = pxi.a(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
        } else {
            this.f = 0.85f;
        }
    }

    private static void s(boolean z) {
        if (z) {
            return;
        }
        throw new psm("Unexpected subtitle format.");
    }

    private static void t(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & PrivateKeyType.INVALID) << 24)), i3, i4, i5 | 33);
        }
    }

    private static void u(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
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

    @Override // defpackage.psi
    protected final psk g(byte[] bArr, int i, boolean z) {
        String w;
        int i2;
        int i3;
        this.a.E(bArr, i);
        pwu pwuVar = this.a;
        int i4 = 1;
        s(pwuVar.a() >= 2);
        int m = pwuVar.m();
        if (m == 0) {
            w = "";
        } else {
            if (pwuVar.a() >= 2) {
                byte[] bArr2 = pwuVar.a;
                int i5 = pwuVar.b;
                int i6 = (bArr2[i5 + 1] & 255) | ((bArr2[i5] & 255) << 8);
                if (i6 == 65279 || i6 == 65534) {
                    w = pwuVar.w(m, amoz.e);
                }
            }
            w = pwuVar.w(m, amoz.c);
        }
        if (w.isEmpty()) {
            return puh.a;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(w);
        u(spannableStringBuilder, this.c, 0, 0, spannableStringBuilder.length(), 16711680);
        t(spannableStringBuilder, this.d, -1, 0, spannableStringBuilder.length(), 16711680);
        String str = this.e;
        int length = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f = this.f;
        for (int i7 = 8; this.a.a() >= i7; i7 = 8) {
            pwu pwuVar2 = this.a;
            int i8 = pwuVar2.b;
            int d = pwuVar2.d();
            int d2 = this.a.d();
            if (d2 == 1937013100) {
                s(this.a.a() >= 2);
                int m2 = this.a.m();
                int i9 = 0;
                while (i9 < m2) {
                    pwu pwuVar3 = this.a;
                    s(pwuVar3.a() >= 12);
                    int m3 = pwuVar3.m();
                    int m4 = pwuVar3.m();
                    pwuVar3.H(2);
                    int i10 = pwuVar3.i();
                    pwuVar3.H(i4);
                    int d3 = pwuVar3.d();
                    if (m4 > spannableStringBuilder.length()) {
                        int length2 = spannableStringBuilder.length();
                        StringBuilder sb = new StringBuilder(68);
                        sb.append("Truncating styl end (");
                        sb.append(m4);
                        sb.append(") to cueText.length() (");
                        sb.append(length2);
                        sb.append(").");
                        Log.w("Tx3gDecoder", sb.toString());
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
                        Log.w("Tx3gDecoder", sb2.toString());
                        i3 = i9;
                    } else {
                        int i11 = i2;
                        i3 = i9;
                        u(spannableStringBuilder, i10, this.c, m3, i11, 0);
                        t(spannableStringBuilder, d3, this.d, m3, i11, 0);
                    }
                    i9 = i3 + 1;
                    i4 = 1;
                }
            } else if (d2 == 1952608120 && this.b) {
                s(this.a.a() >= 2);
                f = pxi.a(this.a.m() / this.g, 0.0f, 0.95f);
            }
            this.a.G(i8 + d);
            i4 = 1;
        }
        psf psfVar = new psf();
        psfVar.a = spannableStringBuilder;
        psfVar.b(f, 0);
        psfVar.e = 0;
        return new puh(psfVar.a());
    }
}
