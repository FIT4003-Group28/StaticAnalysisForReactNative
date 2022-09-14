package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: dsul  reason: default package */
/* loaded from: classes.dex */
final class dsul extends dsuk {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0084, code lost:
        if (r13[r14] <= (-65)) goto L11;
     */
    @Override // defpackage.dsuk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(int r12, byte[] r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsul.b(int, byte[], int, int):int");
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
            byte b = bArr[i];
            if (!dsuj.a(b)) {
                break;
            }
            i++;
            dsuj.d(b, cArr, i4);
            i4++;
        }
        while (i < i3) {
            int i5 = i + 1;
            byte b2 = bArr[i];
            if (dsuj.a(b2)) {
                int i6 = i4 + 1;
                dsuj.d(b2, cArr, i4);
                i = i5;
                while (true) {
                    i4 = i6;
                    if (i < i3) {
                        byte b3 = bArr[i];
                        if (!dsuj.a(b3)) {
                            break;
                        }
                        i++;
                        i6 = i4 + 1;
                        dsuj.d(b3, cArr, i4);
                    }
                }
            } else if (dsuj.b(b2)) {
                if (i5 < i3) {
                    dsuj.e(b2, bArr[i5], cArr, i4);
                    i = i5 + 1;
                    i4++;
                } else {
                    throw dsrm.j();
                }
            } else if (dsuj.c(b2)) {
                if (i5 < i3 - 1) {
                    int i7 = i5 + 1;
                    dsuj.f(b2, bArr[i5], bArr[i7], cArr, i4);
                    i = i7 + 1;
                    i4++;
                } else {
                    throw dsrm.j();
                }
            } else if (i5 < i3 - 2) {
                int i8 = i5 + 1;
                int i9 = i8 + 1;
                dsuj.g(b2, bArr[i5], bArr[i8], bArr[i9], cArr, i4);
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
        return f(byteBuffer, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        return r10 + r0;
     */
    @Override // defpackage.dsuk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int e(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsul.e(java.lang.CharSequence, byte[], int, int):int");
    }
}
