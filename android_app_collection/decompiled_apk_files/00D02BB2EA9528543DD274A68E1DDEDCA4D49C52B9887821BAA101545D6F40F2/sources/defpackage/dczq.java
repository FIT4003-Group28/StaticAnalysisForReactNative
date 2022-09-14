package defpackage;

import java.io.Serializable;
import java.nio.charset.Charset;
/* compiled from: PG */
/* renamed from: dczq  reason: default package */
/* loaded from: classes.dex */
public final class dczq extends dcyp implements Serializable {
    public static final dcza a = new dczq(0);
    static final dcza b = new dczq(dcze.a);
    private static final long serialVersionUID = 0;
    private final int c;

    public dczq(int i) {
        this.c = i;
    }

    public static int g(byte[] bArr, int i) {
        return decl.k(bArr[i + 3], bArr[i + 2], bArr[i + 1], bArr[i]);
    }

    public static int h(int i) {
        return Integer.rotateLeft(i * (-862048943), 15) * 461845907;
    }

    public static int i(int i, int i2) {
        return (Integer.rotateLeft(i ^ i2, 13) * 5) - 430675100;
    }

    public static dcyz j(int i, int i2) {
        int i3 = i ^ i2;
        int i4 = (i3 ^ (i3 >>> 16)) * (-2048144789);
        int i5 = (i4 ^ (i4 >>> 13)) * (-1028477387);
        return new dcyx(i5 ^ (i5 >>> 16));
    }

    public static long k(int i) {
        return (((i >>> 18) | 240) & 255) | ((((i >>> 12) & 63) | 128) << 8) | ((((i >>> 6) & 63) | 128) << 16) | (((i & 63) | 128) << 24);
    }

    public static long l(char c) {
        return (((c & '?') | 128) << 16) | (((c >>> '\f') | 480) & 255) | ((((c >>> 6) & 63) | 128) << 8);
    }

    public static long m(char c) {
        return (((c & '?') | 128) << 8) | (((c >>> 6) | 960) & 255);
    }

    @Override // defpackage.dcyp, defpackage.dcza
    public final dcyz a(CharSequence charSequence, Charset charset) {
        long j;
        if (dbrc.c.equals(charset)) {
            int length = charSequence.length();
            int i = this.c;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int i5 = i3 + 4;
                j = 0;
                if (i5 > length) {
                    break;
                }
                char charAt = charSequence.charAt(i3);
                char charAt2 = charSequence.charAt(i3 + 1);
                char charAt3 = charSequence.charAt(i3 + 2);
                char charAt4 = charSequence.charAt(i3 + 3);
                if (charAt >= 128 || charAt2 >= 128 || charAt3 >= 128 || charAt4 >= 128) {
                    break;
                }
                i = i(i, h((charAt2 << '\b') | charAt | (charAt3 << 16) | (charAt4 << 24)));
                i4 += 4;
                i3 = i5;
            }
            while (i3 < length) {
                char charAt5 = charSequence.charAt(i3);
                if (charAt5 < 128) {
                    j |= charAt5 << i2;
                    i2 += 8;
                    i4++;
                } else if (charAt5 < 2048) {
                    j |= m(charAt5) << i2;
                    i2 += 16;
                    i4 += 2;
                } else if (charAt5 < 55296 || charAt5 > 57343) {
                    j |= l(charAt5) << i2;
                    i2 += 24;
                    i4 += 3;
                } else {
                    int codePointAt = Character.codePointAt(charSequence, i3);
                    if (codePointAt == charAt5) {
                        return c(charSequence.toString().getBytes(charset));
                    }
                    i3++;
                    j |= k(codePointAt) << i2;
                    i4 += 4;
                }
                if (i2 >= 32) {
                    i = i(i, h((int) j));
                    j >>>= 32;
                    i2 -= 32;
                }
                i3++;
            }
            return j(h((int) j) ^ i, i4);
        }
        return c(charSequence.toString().getBytes(charset));
    }

    @Override // defpackage.dcyp, defpackage.dcza
    public final dcyz b(int i) {
        return j(i(this.c, h(i)), 4);
    }

    @Override // defpackage.dcyp
    public final dcyz e(byte[] bArr, int i) {
        int i2 = 0;
        dbsk.u(0, i, bArr.length);
        int i3 = this.c;
        int i4 = 0;
        while (true) {
            int i5 = i4 + 4;
            if (i5 > i) {
                break;
            }
            i3 = i(i3, h(g(bArr, i4)));
            i4 = i5;
        }
        int i6 = i4;
        int i7 = 0;
        while (i6 < i) {
            i2 ^= decp.a(bArr[i6]) << i7;
            i6++;
            i7 += 8;
        }
        return j(h(i2) ^ i3, i);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dczq) && this.c == ((dczq) obj).c;
    }

    @Override // defpackage.dcza
    public final dczb f() {
        return new dczp(this.c);
    }

    public final int hashCode() {
        return getClass().hashCode() ^ this.c;
    }

    public final String toString() {
        int i = this.c;
        StringBuilder sb = new StringBuilder(31);
        sb.append("Hashing.murmur3_32(");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
