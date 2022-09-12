package defpackage;

import com.google.ar.core.ImageMetadata;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
/* compiled from: PG */
/* renamed from: eanr  reason: default package */
/* loaded from: classes6.dex */
public final class eanr extends Writer {
    protected final eanm a;
    OutputStream b;
    byte[] c;
    final int d;
    int e;
    int f = 0;

    public eanr(eanm eanmVar, OutputStream outputStream) {
        this.a = eanmVar;
        this.b = outputStream;
        byte[] a = eanmVar.a();
        this.c = a;
        this.d = a.length - 4;
        this.e = 0;
    }

    private final int a(int i) {
        int i2 = this.f;
        this.f = 0;
        if (i < 56320 || i > 57343) {
            throw new IOException("Broken surrogate pair: first char 0x" + Integer.toHexString(i2) + ", second 0x" + Integer.toHexString(i) + "; illegal combination");
        }
        return ((i2 - 55296) << 10) + ImageMetadata.CONTROL_AE_ANTIBANDING_MODE + (i - 56320);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(char c) {
        write(c);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    /* renamed from: append  reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ Appendable mo19append(char c) {
        write(c);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        OutputStream outputStream = this.b;
        if (outputStream != null) {
            int i = this.e;
            if (i > 0) {
                outputStream.write(this.c, 0, i);
                this.e = 0;
            }
            OutputStream outputStream2 = this.b;
            this.b = null;
            byte[] bArr = this.c;
            if (bArr != null) {
                this.c = null;
                this.a.d(bArr);
            }
            outputStream2.close();
            int i2 = this.f;
            this.f = 0;
            if (i2 <= 0) {
                return;
            }
            b(i2);
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        OutputStream outputStream = this.b;
        if (outputStream != null) {
            int i = this.e;
            if (i > 0) {
                outputStream.write(this.c, 0, i);
                this.e = 0;
            }
            this.b.flush();
        }
    }

    @Override // java.io.Writer
    public final void write(int i) {
        int i2;
        if (this.f > 0) {
            i = a(i);
        } else if (i >= 55296 && i <= 57343) {
            if (i > 56319) {
                b(i);
            }
            this.f = i;
            return;
        }
        int i3 = this.e;
        int i4 = 0;
        if (i3 >= this.d) {
            this.b.write(this.c, 0, i3);
            this.e = 0;
            i3 = 0;
        } else {
            i4 = i3;
        }
        if (i < 128) {
            byte[] bArr = this.c;
            this.e = i3 + 1;
            bArr[i3] = (byte) i;
            return;
        }
        if (i < 2048) {
            byte[] bArr2 = this.c;
            int i5 = i4 + 1;
            bArr2[i4] = (byte) ((i >> 6) | 192);
            i2 = i5 + 1;
            bArr2[i5] = (byte) ((i & 63) | 128);
        } else if (i <= 65535) {
            byte[] bArr3 = this.c;
            int i6 = i4 + 1;
            bArr3[i4] = (byte) ((i >> 12) | 224);
            int i7 = i6 + 1;
            bArr3[i6] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i7] = (byte) ((i & 63) | 128);
            i2 = i7 + 1;
        } else {
            if (i > 1114111) {
                b(i);
            }
            byte[] bArr4 = this.c;
            int i8 = i4 + 1;
            bArr4[i4] = (byte) ((i >> 18) | 240);
            int i9 = i8 + 1;
            bArr4[i8] = (byte) (((i >> 12) & 63) | 128);
            int i10 = i9 + 1;
            bArr4[i9] = (byte) (((i >> 6) & 63) | 128);
            i2 = i10 + 1;
            bArr4[i10] = (byte) ((i & 63) | 128);
        }
        this.e = i2;
    }

    private static final void b(int i) {
        if (i > 1114111) {
            throw new IOException("Illegal character point (0x" + Integer.toHexString(i) + ") to output; max is 0x10FFFF as per RFC 4627");
        } else if (i < 55296) {
            throw new IOException("Illegal character point (0x" + Integer.toHexString(i) + ") to output");
        } else if (i <= 56319) {
            throw new IOException("Unmatched first part of surrogate pair (0x" + Integer.toHexString(i) + ")");
        } else {
            throw new IOException("Unmatched second part of surrogate pair (0x" + Integer.toHexString(i) + ")");
        }
    }

    @Override // java.io.Writer
    public final void write(String str) {
        write(str, 0, str.length());
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) {
        if (i2 < 2) {
            if (i2 != 1) {
                return;
            }
            write(str.charAt(i));
            return;
        }
        if (this.f > 0) {
            i2--;
            write(a(str.charAt(i)));
            i++;
        }
        int i3 = this.e;
        byte[] bArr = this.c;
        int i4 = this.d;
        int i5 = i2 + i;
        while (i < i5) {
            if (i3 >= i4) {
                this.b.write(bArr, 0, i3);
                i3 = 0;
            }
            int i6 = i + 1;
            char charAt = str.charAt(i);
            if (charAt < 128) {
                int i7 = i3 + 1;
                bArr[i3] = (byte) charAt;
                int i8 = i5 - i6;
                int i9 = i4 - i7;
                if (i8 > i9) {
                    i8 = i9;
                }
                int i10 = i8 + i6;
                i3 = i7;
                while (i6 < i10) {
                    int i11 = i6 + 1;
                    char charAt2 = str.charAt(i6);
                    if (charAt2 >= 128) {
                        charAt = charAt2;
                        i6 = i11;
                    } else {
                        bArr[i3] = (byte) charAt2;
                        i6 = i11;
                        i3++;
                    }
                }
                i = i6;
            }
            if (charAt < 2048) {
                int i12 = i3 + 1;
                bArr[i3] = (byte) ((charAt >> 6) | 192);
                i3 = i12 + 1;
                bArr[i12] = (byte) ((charAt & '?') | 128);
                i = i6;
            } else if (charAt < 55296 || charAt > 57343) {
                int i13 = i3 + 1;
                bArr[i3] = (byte) ((charAt >> '\f') | 224);
                int i14 = i13 + 1;
                bArr[i13] = (byte) (((charAt >> 6) & 63) | 128);
                bArr[i14] = (byte) ((charAt & '?') | 128);
                i = i6;
                i3 = i14 + 1;
            } else {
                if (charAt > 56319) {
                    this.e = i3;
                    b(charAt);
                }
                this.f = charAt;
                if (i6 >= i5) {
                    break;
                }
                i = i6 + 1;
                int a = a(str.charAt(i6));
                if (a > 1114111) {
                    this.e = i3;
                    b(a);
                }
                int i15 = i3 + 1;
                bArr[i3] = (byte) ((a >> 18) | 240);
                int i16 = i15 + 1;
                bArr[i15] = (byte) (((a >> 12) & 63) | 128);
                int i17 = i16 + 1;
                bArr[i16] = (byte) (((a >> 6) & 63) | 128);
                i3 = i17 + 1;
                bArr[i17] = (byte) ((a & 63) | 128);
            }
        }
        this.e = i3;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr) {
        write(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        if (i2 < 2) {
            if (i2 != 1) {
                return;
            }
            write(cArr[i]);
            return;
        }
        if (this.f > 0) {
            i2--;
            write(a(cArr[i]));
            i++;
        }
        int i3 = this.e;
        byte[] bArr = this.c;
        int i4 = this.d;
        int i5 = i2 + i;
        while (i < i5) {
            if (i3 >= i4) {
                this.b.write(bArr, 0, i3);
                i3 = 0;
            }
            int i6 = i + 1;
            char c = cArr[i];
            if (c < 128) {
                int i7 = i3 + 1;
                bArr[i3] = (byte) c;
                int i8 = i5 - i6;
                int i9 = i4 - i7;
                if (i8 > i9) {
                    i8 = i9;
                }
                int i10 = i8 + i6;
                i3 = i7;
                while (i6 < i10) {
                    int i11 = i6 + 1;
                    char c2 = cArr[i6];
                    if (c2 >= 128) {
                        c = c2;
                        i6 = i11;
                    } else {
                        bArr[i3] = (byte) c2;
                        i6 = i11;
                        i3++;
                    }
                }
                i = i6;
            }
            if (c < 2048) {
                int i12 = i3 + 1;
                bArr[i3] = (byte) ((c >> 6) | 192);
                i3 = i12 + 1;
                bArr[i12] = (byte) ((c & '?') | 128);
                i = i6;
            } else if (c < 55296 || c > 57343) {
                int i13 = i3 + 1;
                bArr[i3] = (byte) ((c >> '\f') | 224);
                int i14 = i13 + 1;
                bArr[i13] = (byte) (((c >> 6) & 63) | 128);
                bArr[i14] = (byte) ((c & '?') | 128);
                i = i6;
                i3 = i14 + 1;
            } else {
                if (c > 56319) {
                    this.e = i3;
                    b(c);
                }
                this.f = c;
                if (i6 >= i5) {
                    break;
                }
                i = i6 + 1;
                int a = a(cArr[i6]);
                if (a > 1114111) {
                    this.e = i3;
                    b(a);
                }
                int i15 = i3 + 1;
                bArr[i3] = (byte) ((a >> 18) | 240);
                int i16 = i15 + 1;
                bArr[i15] = (byte) (((a >> 12) & 63) | 128);
                int i17 = i16 + 1;
                bArr[i16] = (byte) (((a >> 6) & 63) | 128);
                i3 = i17 + 1;
                bArr[i17] = (byte) ((a & 63) | 128);
            }
        }
        this.e = i3;
    }
}
