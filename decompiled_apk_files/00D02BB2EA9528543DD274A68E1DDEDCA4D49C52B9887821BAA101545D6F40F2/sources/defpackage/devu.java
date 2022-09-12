package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: PG */
/* renamed from: devu  reason: default package */
/* loaded from: classes6.dex */
public class devu {
    public int a;
    public ByteBuffer b;
    final devw c;
    private int d;
    private int e;

    static {
        new devt();
    }

    public devu() {
        if (devw.a == null) {
            devw.a = new devx();
        }
        this.c = devw.a;
    }

    public final int g(int i) {
        if (i < this.e) {
            return this.b.getShort(this.d + i);
        }
        return 0;
    }

    public final int h(int i) {
        return i + this.b.getInt(i);
    }

    public final String i(int i) {
        ByteBuffer byteBuffer = this.b;
        int i2 = i + byteBuffer.getInt(i);
        int i3 = byteBuffer.getInt(i2);
        int i4 = i2 + 4;
        if (!byteBuffer.hasArray()) {
            if ((i4 | i3 | ((byteBuffer.limit() - i4) - i3)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i4), Integer.valueOf(i3)));
            }
            int i5 = i4 + i3;
            char[] cArr = new char[i3];
            int i6 = 0;
            while (i4 < i5) {
                byte b = byteBuffer.get(i4);
                if (!devv.a(b)) {
                    break;
                }
                i4++;
                devv.d(b, cArr, i6);
                i6++;
            }
            while (i4 < i5) {
                int i7 = i4 + 1;
                byte b2 = byteBuffer.get(i4);
                if (devv.a(b2)) {
                    devv.d(b2, cArr, i6);
                    i6++;
                    i4 = i7;
                    while (i4 < i5) {
                        byte b3 = byteBuffer.get(i4);
                        if (!devv.a(b3)) {
                            break;
                        }
                        i4++;
                        devv.d(b3, cArr, i6);
                        i6++;
                    }
                } else if (devv.b(b2)) {
                    if (i7 < i5) {
                        i4 = i7 + 1;
                        devv.e(b2, byteBuffer.get(i7), cArr, i6);
                        i6++;
                    } else {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                } else if (devv.c(b2)) {
                    if (i7 < i5 - 1) {
                        int i8 = i7 + 1;
                        devv.f(b2, byteBuffer.get(i7), byteBuffer.get(i8), cArr, i6);
                        i4 = i8 + 1;
                        i6++;
                    } else {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                } else if (i7 < i5 - 2) {
                    int i9 = i7 + 1;
                    int i10 = i9 + 1;
                    devv.g(b2, byteBuffer.get(i7), byteBuffer.get(i9), byteBuffer.get(i10), cArr, i6);
                    i6 += 2;
                    i4 = i10 + 1;
                } else {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
            }
            return new String(cArr, 0, i6);
        }
        byte[] array = byteBuffer.array();
        int arrayOffset = byteBuffer.arrayOffset() + i4;
        int length = array.length;
        if ((arrayOffset | i3 | ((length - arrayOffset) - i3)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(arrayOffset), Integer.valueOf(i3)));
        }
        int i11 = arrayOffset + i3;
        char[] cArr2 = new char[i3];
        int i12 = 0;
        while (arrayOffset < i11) {
            byte b4 = array[arrayOffset];
            if (!devv.a(b4)) {
                break;
            }
            arrayOffset++;
            devv.d(b4, cArr2, i12);
            i12++;
        }
        while (arrayOffset < i11) {
            int i13 = arrayOffset + 1;
            byte b5 = array[arrayOffset];
            if (devv.a(b5)) {
                devv.d(b5, cArr2, i12);
                i12++;
                arrayOffset = i13;
                while (arrayOffset < i11) {
                    byte b6 = array[arrayOffset];
                    if (!devv.a(b6)) {
                        break;
                    }
                    arrayOffset++;
                    devv.d(b6, cArr2, i12);
                    i12++;
                }
            } else if (devv.b(b5)) {
                if (i13 < i11) {
                    arrayOffset = i13 + 1;
                    devv.e(b5, array[i13], cArr2, i12);
                    i12++;
                } else {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
            } else if (devv.c(b5)) {
                if (i13 < i11 - 1) {
                    int i14 = i13 + 1;
                    devv.f(b5, array[i13], array[i14], cArr2, i12);
                    arrayOffset = i14 + 1;
                    i12++;
                } else {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
            } else if (i13 < i11 - 2) {
                int i15 = i13 + 1;
                int i16 = i15 + 1;
                devv.g(b5, array[i13], array[i15], array[i16], cArr2, i12);
                i12 += 2;
                arrayOffset = i16 + 1;
            } else {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
        }
        return new String(cArr2, 0, i12);
    }

    public final int j(int i) {
        int i2 = i + this.a;
        return this.b.getInt(i2 + this.b.getInt(i2));
    }

    public final int k(int i) {
        int i2 = i + this.a;
        return i2 + this.b.getInt(i2) + 4;
    }

    public final ByteBuffer l(int i, int i2) {
        int g = g(i);
        if (g == 0) {
            return null;
        }
        ByteBuffer order = this.b.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int k = k(g);
        order.position(k);
        order.limit(k + (j(g) * i2));
        return order;
    }

    public final void m(int i, ByteBuffer byteBuffer) {
        short s;
        this.b = byteBuffer;
        if (byteBuffer != null) {
            this.a = i;
            int i2 = i - byteBuffer.getInt(i);
            this.d = i2;
            s = this.b.getShort(i2);
        } else {
            s = 0;
            this.a = 0;
            this.d = 0;
        }
        this.e = s;
    }
}
