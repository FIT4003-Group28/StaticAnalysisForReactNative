package defpackage;

import java.math.RoundingMode;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: dczy  reason: default package */
/* loaded from: classes.dex */
final class dczy {
    public final String a;
    public final char[] b;
    final int c;
    final int d;
    final int e;
    final int f;
    public final byte[] g;
    private final boolean[] h;

    public dczy(String str, char[] cArr) {
        this.a = str;
        this.b = (char[]) dbsk.s(cArr);
        try {
            int length = cArr.length;
            int b = deay.b(length, RoundingMode.UNNECESSARY);
            this.d = b;
            int min = Math.min(8, Integer.lowestOneBit(b));
            try {
                this.e = 8 / min;
                this.f = b / min;
                this.c = length - 1;
                byte[] bArr = new byte[128];
                Arrays.fill(bArr, (byte) -1);
                int i = 0;
                while (true) {
                    boolean z = true;
                    if (i >= cArr.length) {
                        break;
                    }
                    char c = cArr[i];
                    dbsk.d(c < 128, "Non-ASCII character: %s", c);
                    if (bArr[c] != -1) {
                        z = false;
                    }
                    dbsk.d(z, "Duplicate character: %s", c);
                    bArr[c] = (byte) i;
                    i++;
                }
                this.g = bArr;
                boolean[] zArr = new boolean[this.e];
                for (int i2 = 0; i2 < this.f; i2++) {
                    zArr[deay.c(i2 * 8, this.d, RoundingMode.CEILING)] = true;
                }
                this.h = zArr;
            } catch (ArithmeticException e) {
                String str2 = new String(cArr);
                throw new IllegalArgumentException(str2.length() != 0 ? "Illegal alphabet ".concat(str2) : new String("Illegal alphabet "), e);
            }
        } catch (ArithmeticException e2) {
            int length2 = cArr.length;
            StringBuilder sb = new StringBuilder(35);
            sb.append("Illegal alphabet length ");
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString(), e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final char a(int i) {
        return this.b[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(int i) {
        return this.h[i % this.e];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dczy) {
            return Arrays.equals(this.b, ((dczy) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }

    public final String toString() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c(char c) {
        if (c > 127) {
            String valueOf = String.valueOf(Integer.toHexString(c));
            throw new ddab(valueOf.length() != 0 ? "Unrecognized character: 0x".concat(valueOf) : new String("Unrecognized character: 0x"));
        }
        byte b = this.g[c];
        if (b != -1) {
            return b;
        }
        if (c <= ' ' || c == 127) {
            String valueOf2 = String.valueOf(Integer.toHexString(c));
            throw new ddab(valueOf2.length() != 0 ? "Unrecognized character: 0x".concat(valueOf2) : new String("Unrecognized character: 0x"));
        }
        StringBuilder sb = new StringBuilder(25);
        sb.append("Unrecognized character: ");
        sb.append(c);
        throw new ddab(sb.toString());
    }
}
