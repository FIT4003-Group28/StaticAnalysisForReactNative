package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: aosi  reason: default package */
/* loaded from: classes.dex */
public final class aosi {
    public static final aphq a;

    static {
        boolean z = aosg.a;
        a = new aphq();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0100, code lost:
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(java.lang.CharSequence r7, byte[] r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aosi.a(java.lang.CharSequence, byte[], int, int):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                throw new aosh(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(i3 + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    public static int c(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static int d(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    public static int e(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b <= -12) {
                return b;
            }
            return -1;
        } else if (i3 == 1) {
            return c(b, bArr[i]);
        } else {
            if (i3 == 2) {
                return d(b, bArr[i], bArr[i + 1]);
            }
            throw new AssertionError();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String f(ByteBuffer byteBuffer, int i, int i2) {
        if (byteBuffer.hasArray()) {
            return aphq.o(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2);
        } else if (!byteBuffer.isDirect()) {
            return aphq.n(byteBuffer, i, i2);
        } else {
            return aphq.n(byteBuffer, i, i2);
        }
    }

    public static String g(byte[] bArr, int i, int i2) {
        return aphq.o(bArr, i, i2);
    }

    public static boolean h(byte[] bArr, int i, int i2) {
        return aphq.q(bArr, i, i2);
    }
}
