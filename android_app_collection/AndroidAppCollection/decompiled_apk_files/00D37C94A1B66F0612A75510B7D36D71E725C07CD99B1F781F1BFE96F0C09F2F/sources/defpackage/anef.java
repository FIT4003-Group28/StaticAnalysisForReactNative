package defpackage;

import java.math.RoundingMode;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: anef  reason: default package */
/* loaded from: classes.dex */
public class anef extends aneg {
    private transient aneg a;
    public final aneb b;
    public final Character c;

    public anef(aneb anebVar, Character ch) {
        char charValue;
        this.b = anebVar;
        boolean z = true;
        if (ch != null && (charValue = ch.charValue()) < 128 && anebVar.g[charValue] != -1) {
            z = false;
        }
        aqxo.u(z, "Padding character %s was already in alphabet", ch);
        this.c = ch;
    }

    @Override // defpackage.aneg
    public int a(byte[] bArr, CharSequence charSequence) {
        aneb anebVar;
        bArr.getClass();
        CharSequence g = g(charSequence);
        if (this.b.c(g.length())) {
            int i = 0;
            int i2 = 0;
            while (i < g.length()) {
                long j = 0;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    anebVar = this.b;
                    if (i3 >= anebVar.e) {
                        break;
                    }
                    j <<= anebVar.d;
                    if (i + i3 < g.length()) {
                        j |= this.b.b(g.charAt(i4 + i));
                        i4++;
                    }
                    i3++;
                }
                int i5 = anebVar.f;
                int i6 = (i5 * 8) - (i4 * anebVar.d);
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
        throw new anee(sb.toString());
    }

    public aneg b(aneb anebVar, Character ch) {
        return new anef(anebVar, ch);
    }

    @Override // defpackage.aneg
    public void c(Appendable appendable, byte[] bArr, int i) {
        int i2 = 0;
        aqxo.x(0, i, bArr.length);
        while (i2 < i) {
            h(appendable, bArr, i2, Math.min(this.b.f, i - i2));
            i2 += this.b.f;
        }
    }

    @Override // defpackage.aneg
    public final int d(int i) {
        return (int) (((this.b.d * i) + 7) / 8);
    }

    @Override // defpackage.aneg
    public final int e(int i) {
        aneb anebVar = this.b;
        return anebVar.e * anhg.e(i, anebVar.f, RoundingMode.CEILING);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof anef) {
            anef anefVar = (anef) obj;
            if (this.b.equals(anefVar.b) && akzj.f(this.c, anefVar.c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // defpackage.aneg
    public final aneg f() {
        boolean z;
        aneg anegVar = this.a;
        if (anegVar == null) {
            aneb anebVar = this.b;
            char[] cArr = anebVar.b;
            int length = cArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (akzj.k(cArr[i2])) {
                    char[] cArr2 = anebVar.b;
                    int length2 = cArr2.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length2) {
                            z = false;
                            break;
                        } else if (akzj.j(cArr2[i3])) {
                            z = true;
                            break;
                        } else {
                            i3++;
                        }
                    }
                    aqxo.z(!z, "Cannot call lowerCase() on a mixed-case alphabet");
                    char[] cArr3 = new char[anebVar.b.length];
                    while (true) {
                        char[] cArr4 = anebVar.b;
                        if (i >= cArr4.length) {
                            break;
                        }
                        char c = cArr4[i];
                        if (akzj.k(c)) {
                            c ^= 32;
                        }
                        cArr3[i] = (char) c;
                        i++;
                    }
                    anebVar = new aneb(anebVar.a.concat(".lowerCase()"), cArr3);
                } else {
                    i2++;
                }
            }
            anegVar = anebVar == this.b ? this : b(anebVar, this.c);
            this.a = anegVar;
        }
        return anegVar;
    }

    @Override // defpackage.aneg
    public final CharSequence g(CharSequence charSequence) {
        charSequence.getClass();
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(Appendable appendable, byte[] bArr, int i, int i2) {
        aqxo.x(i, i + i2, bArr.length);
        int i3 = 0;
        aqxo.p(i2 <= this.b.f);
        long j = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            j = (j | (bArr[i + i4] & 255)) << 8;
        }
        int i5 = ((i2 + 1) * 8) - this.b.d;
        while (i3 < i2 * 8) {
            aneb anebVar = this.b;
            appendable.append(anebVar.a(((int) (j >>> (i5 - i3))) & anebVar.c));
            i3 += this.b.d;
        }
        if (this.c != null) {
            while (i3 < this.b.f * 8) {
                appendable.append(this.c.charValue());
                i3 += this.b.d;
            }
        }
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

    public anef(String str, String str2, Character ch) {
        this(new aneb(str, str2.toCharArray()), ch);
    }
}
