package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: dsuk  reason: default package */
/* loaded from: classes.dex */
abstract class dsuk {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final String f(ByteBuffer byteBuffer, int i, int i2) {
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = byteBuffer.get(i);
            if (!dsuj.a(b)) {
                break;
            }
            i++;
            dsuj.d(b, cArr, i4);
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte b2 = byteBuffer.get(i);
            if (dsuj.a(b2)) {
                int i7 = i5 + 1;
                dsuj.d(b2, cArr, i5);
                i = i6;
                while (true) {
                    i5 = i7;
                    if (i < i3) {
                        byte b3 = byteBuffer.get(i);
                        if (!dsuj.a(b3)) {
                            break;
                        }
                        i++;
                        i7 = i5 + 1;
                        dsuj.d(b3, cArr, i5);
                    }
                }
            } else if (dsuj.b(b2)) {
                if (i6 < i3) {
                    dsuj.e(b2, byteBuffer.get(i6), cArr, i5);
                    i = i6 + 1;
                    i5++;
                } else {
                    throw dsrm.j();
                }
            } else if (dsuj.c(b2)) {
                if (i6 < i3 - 1) {
                    int i8 = i6 + 1;
                    dsuj.f(b2, byteBuffer.get(i6), byteBuffer.get(i8), cArr, i5);
                    i = i8 + 1;
                    i5++;
                } else {
                    throw dsrm.j();
                }
            } else if (i6 < i3 - 2) {
                int i9 = i6 + 1;
                int i10 = i9 + 1;
                dsuj.g(b2, byteBuffer.get(i6), byteBuffer.get(i9), byteBuffer.get(i10), cArr, i5);
                i5 += 2;
                i = i10 + 1;
            } else {
                throw dsrm.j();
            }
        }
        return new String(cArr, 0, i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(byte[] bArr, int i, int i2) {
        return b(0, bArr, i, i2) == 0;
    }

    public abstract int b(int i, byte[] bArr, int i2, int i3);

    public abstract String c(byte[] bArr, int i, int i2);

    public abstract String d(ByteBuffer byteBuffer, int i, int i2);

    public abstract int e(CharSequence charSequence, byte[] bArr, int i, int i2);
}
