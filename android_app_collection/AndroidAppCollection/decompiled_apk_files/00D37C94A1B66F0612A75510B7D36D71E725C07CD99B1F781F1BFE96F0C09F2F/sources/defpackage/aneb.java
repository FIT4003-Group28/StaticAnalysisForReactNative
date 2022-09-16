package defpackage;

import java.math.RoundingMode;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aneb  reason: default package */
/* loaded from: classes.dex */
public final class aneb {
    public final String a;
    public final char[] b;
    final int c;
    final int d;
    final int e;
    final int f;
    public final byte[] g;
    private final boolean[] h;

    public aneb(String str, char[] cArr) {
        int numberOfLeadingZeros;
        str.getClass();
        this.a = str;
        cArr.getClass();
        this.b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            if (length > 0) {
                switch (anhf.a[roundingMode.ordinal()]) {
                    case 1:
                        anhh.e(((length + (-1)) & length) == 0);
                    case 2:
                    case 3:
                        numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(length);
                        break;
                    case 4:
                    case 5:
                        numberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(length - 1);
                        break;
                    case 6:
                    case 7:
                    case 8:
                        int numberOfLeadingZeros2 = Integer.numberOfLeadingZeros(length);
                        numberOfLeadingZeros = (31 - numberOfLeadingZeros2) + ((((-1257966797) >>> numberOfLeadingZeros2) - length) >>> 31);
                        break;
                    default:
                        throw new AssertionError();
                }
                this.d = numberOfLeadingZeros;
                int min = Math.min(8, Integer.lowestOneBit(numberOfLeadingZeros));
                try {
                    this.e = 8 / min;
                    this.f = numberOfLeadingZeros / min;
                    this.c = length - 1;
                    byte[] bArr = new byte[128];
                    Arrays.fill(bArr, (byte) -1);
                    for (int i = 0; i < cArr.length; i++) {
                        char c = cArr[i];
                        aqxo.r(c < 128, "Non-ASCII character: %s", c);
                        aqxo.r(bArr[c] == -1, "Duplicate character: %s", c);
                        bArr[c] = (byte) i;
                    }
                    this.g = bArr;
                    boolean[] zArr = new boolean[this.e];
                    for (int i2 = 0; i2 < this.f; i2++) {
                        zArr[anhg.e(i2 * 8, this.d, RoundingMode.CEILING)] = true;
                    }
                    this.h = zArr;
                    return;
                } catch (ArithmeticException e) {
                    String str2 = new String(cArr);
                    throw new IllegalArgumentException(str2.length() != 0 ? "Illegal alphabet ".concat(str2) : new String("Illegal alphabet "), e);
                }
            }
            StringBuilder sb = new StringBuilder(27);
            sb.append("x");
            sb.append(" (");
            sb.append(0);
            sb.append(") must be > 0");
            throw new IllegalArgumentException(sb.toString());
        } catch (ArithmeticException e2) {
            int length2 = cArr.length;
            StringBuilder sb2 = new StringBuilder(35);
            sb2.append("Illegal alphabet length ");
            sb2.append(length2);
            throw new IllegalArgumentException(sb2.toString(), e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final char a(int i) {
        return this.b[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b(char c) {
        if (c > 127) {
            String valueOf = String.valueOf(Integer.toHexString(c));
            throw new anee(valueOf.length() != 0 ? "Unrecognized character: 0x".concat(valueOf) : new String("Unrecognized character: 0x"));
        }
        byte b = this.g[c];
        if (b != -1) {
            return b;
        }
        if (c <= ' ' || c == 127) {
            String valueOf2 = String.valueOf(Integer.toHexString(c));
            throw new anee(valueOf2.length() != 0 ? "Unrecognized character: 0x".concat(valueOf2) : new String("Unrecognized character: 0x"));
        }
        StringBuilder sb = new StringBuilder(25);
        sb.append("Unrecognized character: ");
        sb.append(c);
        throw new anee(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c(int i) {
        return this.h[i % this.e];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aneb) {
            return Arrays.equals(this.b, ((aneb) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }

    public final String toString() {
        return this.a;
    }
}
