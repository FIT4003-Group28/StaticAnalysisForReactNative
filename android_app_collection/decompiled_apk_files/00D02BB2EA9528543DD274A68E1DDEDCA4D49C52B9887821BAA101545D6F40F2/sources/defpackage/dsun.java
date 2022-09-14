package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: dsun  reason: default package */
/* loaded from: classes6.dex */
final class dsun extends dsuk {
    private static int g(byte[] bArr, int i, long j, int i2) {
        if (i2 != 0) {
            if (i2 == 1) {
                return dsuo.c(i, dsui.n(bArr, j));
            }
            if (i2 == 2) {
                return dsuo.d(i, dsui.n(bArr, j), dsui.n(bArr, j + 1));
            }
            throw new AssertionError();
        }
        return dsuo.b(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (defpackage.dsui.n(r28, r4) <= (-65)) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0069, code lost:
        if (defpackage.dsui.n(r28, r4) > (-65)) goto L31;
     */
    @Override // defpackage.dsuk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(int r27, byte[] r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsun.b(int, byte[], int, int):int");
    }

    @Override // defpackage.dsuk
    public final String c(byte[] bArr, int i, int i2) {
        int length = bArr.length;
        if ((i | i2 | ((length - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte n = dsui.n(bArr, i);
            if (!dsuj.a(n)) {
                break;
            }
            i++;
            dsuj.d(n, cArr, i4);
            i4++;
        }
        while (i < i3) {
            int i5 = i + 1;
            byte n2 = dsui.n(bArr, i);
            if (dsuj.a(n2)) {
                int i6 = i4 + 1;
                dsuj.d(n2, cArr, i4);
                i = i5;
                while (true) {
                    i4 = i6;
                    if (i < i3) {
                        byte n3 = dsui.n(bArr, i);
                        if (!dsuj.a(n3)) {
                            break;
                        }
                        i++;
                        i6 = i4 + 1;
                        dsuj.d(n3, cArr, i4);
                    }
                }
            } else if (dsuj.b(n2)) {
                if (i5 < i3) {
                    dsuj.e(n2, dsui.n(bArr, i5), cArr, i4);
                    i = i5 + 1;
                    i4++;
                } else {
                    throw dsrm.j();
                }
            } else if (dsuj.c(n2)) {
                if (i5 < i3 - 1) {
                    int i7 = i5 + 1;
                    dsuj.f(n2, dsui.n(bArr, i5), dsui.n(bArr, i7), cArr, i4);
                    i = i7 + 1;
                    i4++;
                } else {
                    throw dsrm.j();
                }
            } else if (i5 < i3 - 2) {
                int i8 = i5 + 1;
                int i9 = i8 + 1;
                dsuj.g(n2, dsui.n(bArr, i5), dsui.n(bArr, i8), dsui.n(bArr, i9), cArr, i4);
                i4 += 2;
                i = i9 + 1;
            } else {
                throw dsrm.j();
            }
        }
        return new String(cArr, 0, i4);
    }

    @Override // defpackage.dsuk
    public final String d(ByteBuffer byteBuffer, int i, int i2) {
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        long q = dsui.q(byteBuffer) + i;
        long j = i2 + q;
        char[] cArr = new char[i2];
        int i3 = 0;
        while (q < j) {
            byte p = dsui.p(q);
            if (!dsuj.a(p)) {
                break;
            }
            q++;
            dsuj.d(p, cArr, i3);
            i3++;
        }
        while (q < j) {
            long j2 = q + 1;
            byte p2 = dsui.p(q);
            if (dsuj.a(p2)) {
                int i4 = i3 + 1;
                dsuj.d(p2, cArr, i3);
                while (j2 < j) {
                    byte p3 = dsui.p(j2);
                    if (!dsuj.a(p3)) {
                        break;
                    }
                    j2++;
                    dsuj.d(p3, cArr, i4);
                    i4++;
                }
                i3 = i4;
                q = j2;
            } else if (dsuj.b(p2)) {
                if (j2 < j) {
                    q = j2 + 1;
                    dsuj.e(p2, dsui.p(j2), cArr, i3);
                    i3++;
                } else {
                    throw dsrm.j();
                }
            } else if (dsuj.c(p2)) {
                if (j2 < (-1) + j) {
                    long j3 = j2 + 1;
                    dsuj.f(p2, dsui.p(j2), dsui.p(j3), cArr, i3);
                    q = j3 + 1;
                    i3++;
                } else {
                    throw dsrm.j();
                }
            } else if (j2 < (-2) + j) {
                long j4 = j2 + 1;
                long j5 = j4 + 1;
                dsuj.g(p2, dsui.p(j2), dsui.p(j4), dsui.p(j5), cArr, i3);
                i3 += 2;
                q = j5 + 1;
            } else {
                throw dsrm.j();
            }
        }
        return new String(cArr, 0, i3);
    }

    @Override // defpackage.dsuk
    public final int e(CharSequence charSequence, byte[] bArr, int i, int i2) {
        char c;
        long j;
        long j2;
        long j3;
        int i3;
        char charAt;
        long j4 = i;
        long j5 = i2 + j4;
        int length = charSequence.length();
        if (length > i2 || bArr.length - i2 < i) {
            char charAt2 = charSequence.charAt(length - 1);
            StringBuilder sb = new StringBuilder(37);
            sb.append("Failed writing ");
            sb.append(charAt2);
            sb.append(" at index ");
            sb.append(i + i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int i4 = 0;
        while (true) {
            c = 128;
            j = 1;
            if (i4 >= length || (charAt = charSequence.charAt(i4)) >= 128) {
                break;
            }
            dsui.o(bArr, j4, (byte) charAt);
            i4++;
            j4 = 1 + j4;
        }
        if (i4 == length) {
            return (int) j4;
        }
        while (i4 < length) {
            char charAt3 = charSequence.charAt(i4);
            if (charAt3 >= c || j4 >= j5) {
                if (charAt3 < 2048 && j4 <= (-2) + j5) {
                    long j6 = j4 + j;
                    dsui.o(bArr, j4, (byte) ((charAt3 >>> 6) | 960));
                    dsui.o(bArr, j6, (byte) ((charAt3 & '?') | 128));
                    j2 = j6 + j;
                    j3 = j;
                } else if ((charAt3 >= 55296 && charAt3 <= 57343) || j4 > (-3) + j5) {
                    if (j4 <= (-4) + j5) {
                        int i5 = i4 + 1;
                        if (i5 != length) {
                            char charAt4 = charSequence.charAt(i5);
                            if (Character.isSurrogatePair(charAt3, charAt4)) {
                                int codePoint = Character.toCodePoint(charAt3, charAt4);
                                long j7 = j4 + 1;
                                dsui.o(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                                long j8 = j7 + 1;
                                dsui.o(bArr, j7, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j9 = j8 + 1;
                                dsui.o(bArr, j8, (byte) (((codePoint >>> 6) & 63) | 128));
                                j3 = 1;
                                j2 = j9 + 1;
                                dsui.o(bArr, j9, (byte) ((codePoint & 63) | 128));
                                i4 = i5;
                            } else {
                                i4 = i5;
                            }
                        }
                        throw new dsum(i4 - 1, length);
                    } else if (charAt3 < 55296 || charAt3 > 57343 || ((i3 = i4 + 1) != length && Character.isSurrogatePair(charAt3, charSequence.charAt(i3)))) {
                        StringBuilder sb2 = new StringBuilder(46);
                        sb2.append("Failed writing ");
                        sb2.append(charAt3);
                        sb2.append(" at index ");
                        sb2.append(j4);
                        throw new ArrayIndexOutOfBoundsException(sb2.toString());
                    } else {
                        throw new dsum(i4, length);
                    }
                } else {
                    long j10 = j4 + j;
                    dsui.o(bArr, j4, (byte) ((charAt3 >>> '\f') | 480));
                    long j11 = j10 + j;
                    dsui.o(bArr, j10, (byte) (((charAt3 >>> 6) & 63) | 128));
                    dsui.o(bArr, j11, (byte) ((charAt3 & '?') | 128));
                    j2 = j11 + 1;
                    j3 = 1;
                }
                i4++;
                c = 128;
                long j12 = j3;
                j4 = j2;
                j = j12;
            } else {
                long j13 = j4 + j;
                dsui.o(bArr, j4, (byte) charAt3);
                j3 = j;
                j2 = j13;
            }
            i4++;
            c = 128;
            long j122 = j3;
            j4 = j2;
            j = j122;
        }
        return (int) j4;
    }
}
