package defpackage;

import java.io.CharConversionException;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: eanq  reason: default package */
/* loaded from: classes6.dex */
public final class eanq extends eanl {
    final boolean g;
    char h;
    int i;
    int j;

    public eanq(eanm eanmVar, InputStream inputStream, byte[] bArr, int i, int i2, boolean z) {
        super(eanmVar, inputStream, bArr, i, i2);
        this.h = (char) 0;
        this.i = 0;
        this.j = 0;
        this.g = z;
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        byte[] bArr = this.c;
        if (bArr == null) {
            return -1;
        }
        if (i2 <= 0) {
            return i2;
        }
        if (i < 0 || (i3 = i + i2) > cArr.length) {
            throw new ArrayIndexOutOfBoundsException("read(buf," + i + "," + i2 + "), cbuf[" + cArr.length + "]");
        }
        char c = this.h;
        if (c != 0) {
            i4 = i + 1;
            cArr[i] = c;
            this.h = (char) 0;
        } else {
            int i8 = this.e;
            int i9 = this.d;
            int i10 = i8 - i9;
            if (i10 < 4) {
                this.j += i8 - i10;
                if (i10 > 0) {
                    if (i9 > 0) {
                        for (int i11 = 0; i11 < i10; i11++) {
                            byte[] bArr2 = this.c;
                            bArr2[i11] = bArr2[this.d + i11];
                        }
                        this.d = 0;
                    }
                    this.e = i10;
                } else {
                    this.d = 0;
                    int read = this.b.read(bArr);
                    if (read <= 0) {
                        this.e = 0;
                        if (read < 0) {
                            a();
                            return -1;
                        }
                        b();
                    }
                    this.e = read;
                }
                while (true) {
                    int i12 = this.e;
                    if (i12 >= 4) {
                        break;
                    }
                    InputStream inputStream = this.b;
                    byte[] bArr3 = this.c;
                    int read2 = inputStream.read(bArr3, i12, bArr3.length - i12);
                    if (read2 <= 0) {
                        if (read2 >= 0) {
                            b();
                        } else {
                            a();
                            int i13 = this.e;
                            int i14 = this.j;
                            throw new CharConversionException("Unexpected EOF in the middle of a 4-byte UTF-32 char: got " + i13 + ", needed 4, at char #" + this.i + ", byte #" + (i14 + i13) + ")");
                        }
                    }
                    this.e += read2;
                }
            }
            i4 = i;
        }
        while (i4 < i3) {
            int i15 = this.d;
            if (this.g) {
                byte[] bArr4 = this.c;
                i5 = (bArr4[i15] << 24) | ((bArr4[i15 + 1] & 255) << 16) | ((bArr4[i15 + 2] & 255) << 8);
                i6 = bArr4[i15 + 3] & 255;
            } else {
                byte[] bArr5 = this.c;
                i5 = (bArr5[i15] & 255) | ((bArr5[i15 + 1] & 255) << 8) | ((bArr5[i15 + 2] & 255) << 16);
                i6 = bArr5[i15 + 3] << 24;
            }
            int i16 = i6 | i5;
            int i17 = i15 + 4;
            this.d = i17;
            if (i16 > 65535) {
                if (i16 <= 1114111) {
                    int i18 = i16 - 65536;
                    i7 = i4 + 1;
                    cArr[i4] = (char) ((i18 >> 10) + 55296);
                    i16 = 56320 | (i18 & 1023);
                    if (i7 >= i3) {
                        this.h = (char) i16;
                        i4 = i7;
                        break;
                    }
                    i4 = i7;
                } else {
                    int i19 = this.j;
                    int i20 = this.d;
                    int i21 = this.i;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid UTF-32 character 0x");
                    sb.append(Integer.toHexString(i16));
                    sb.append("(above " + Integer.toHexString(1114111) + ") ");
                    sb.append(" at char #");
                    sb.append(i21 + (i4 - i));
                    sb.append(", byte #");
                    sb.append((i19 + i20) - 1);
                    sb.append(")");
                    throw new CharConversionException(sb.toString());
                }
            }
            i7 = i4 + 1;
            cArr[i4] = (char) i16;
            if (i17 >= this.e) {
                i4 = i7;
                break;
            }
            i4 = i7;
        }
        int i22 = i4 - i;
        this.i += i22;
        return i22;
    }
}
