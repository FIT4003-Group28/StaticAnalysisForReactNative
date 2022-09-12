package defpackage;

import java.math.RoundingMode;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ddad  reason: default package */
/* loaded from: classes.dex */
class ddad extends ddae {
    final dczy b;
    final Character c;

    public ddad(dczy dczyVar, Character ch) {
        char charValue;
        this.b = dczyVar;
        boolean z = true;
        if (ch != null && (charValue = ch.charValue()) < 128 && dczyVar.g[charValue] != -1) {
            z = false;
        }
        dbsk.g(z, "Padding character %s was already in alphabet", ch);
        this.c = ch;
    }

    @Override // defpackage.ddae
    public int a(byte[] bArr, CharSequence charSequence) {
        dczy dczyVar;
        CharSequence g = g(charSequence);
        if (this.b.b(g.length())) {
            int i = 0;
            int i2 = 0;
            while (i < g.length()) {
                long j = 0;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    dczyVar = this.b;
                    if (i3 >= dczyVar.e) {
                        break;
                    }
                    j <<= dczyVar.d;
                    if (i + i3 < g.length()) {
                        j |= this.b.c(g.charAt(i4 + i));
                        i4++;
                    }
                    i3++;
                }
                int i5 = dczyVar.f;
                int i6 = (i5 * 8) - (i4 * dczyVar.d);
                int i7 = (i5 - 1) * 8;
                while (i7 >= i6) {
                    bArr[i2] = (byte) ((j >>> i7) & 255);
                    i7 -= 8;
                    i2++;
                }
                i += this.b.e;
            }
            return i2;
        }
        int length = g.length();
        StringBuilder sb = new StringBuilder(32);
        sb.append("Invalid input length ");
        sb.append(length);
        throw new ddab(sb.toString());
    }

    @Override // defpackage.ddae
    public void b(Appendable appendable, byte[] bArr, int i) {
        int i2 = 0;
        dbsk.u(0, i, bArr.length);
        while (i2 < i) {
            e(appendable, bArr, i2, Math.min(this.b.f, i - i2));
            i2 += this.b.f;
        }
    }

    public ddae c(dczy dczyVar) {
        return new ddad(dczyVar, null);
    }

    @Override // defpackage.ddae
    public final int d(int i) {
        dczy dczyVar = this.b;
        return dczyVar.e * deay.c(i, dczyVar.f, RoundingMode.CEILING);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(Appendable appendable, byte[] bArr, int i, int i2) {
        dbsk.u(i, i + i2, bArr.length);
        int i3 = 0;
        dbsk.a(i2 <= this.b.f);
        long j = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            j = (j | (bArr[i + i4] & 255)) << 8;
        }
        int i5 = ((i2 + 1) * 8) - this.b.d;
        while (i3 < i2 * 8) {
            dczy dczyVar = this.b;
            appendable.append(dczyVar.a(((int) (j >>> (i5 - i3))) & dczyVar.c));
            i3 += this.b.d;
        }
        if (this.c != null) {
            while (i3 < this.b.f * 8) {
                appendable.append(this.c.charValue());
                i3 += this.b.d;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ddad) {
            ddad ddadVar = (ddad) obj;
            if (this.b.equals(ddadVar.b) && dbsd.a(this.c, ddadVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ddae
    public final int f(int i) {
        return (int) (((this.b.d * i) + 7) / 8);
    }

    @Override // defpackage.ddae
    public final CharSequence g(CharSequence charSequence) {
        dbsk.s(charSequence);
        Character ch = this.c;
        if (ch == null) {
            return charSequence;
        }
        char charValue = ch.charValue();
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == charValue);
        return charSequence.subSequence(0, length + 1);
    }

    @Override // defpackage.ddae
    public final ddae h() {
        return this.c == null ? this : c(this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ Arrays.hashCode(new Object[]{this.c});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.b.a);
        if (8 % this.b.d != 0) {
            if (this.c == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.c);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public ddad(String str, String str2, Character ch) {
        this(new dczy(str, str2.toCharArray()), ch);
    }
}
