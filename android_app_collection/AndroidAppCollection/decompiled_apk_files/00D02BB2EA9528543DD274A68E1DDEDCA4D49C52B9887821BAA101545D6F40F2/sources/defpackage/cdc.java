package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
/* compiled from: PG */
/* renamed from: cdc  reason: default package */
/* loaded from: classes.dex */
public final class cdc implements btn {
    static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    private static final int[] b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    private static final ImageHeaderParser$ImageType d(cda cdaVar) {
        try {
            int b2 = cdaVar.b();
            if (b2 == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int a2 = (b2 << 8) | cdaVar.a();
            if (a2 == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int a3 = (a2 << 8) | cdaVar.a();
            if (a3 == -1991225785) {
                cdaVar.c(21L);
                try {
                    return cdaVar.a() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (ccz unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            } else if (a3 != 1380533830) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            } else {
                cdaVar.c(4L);
                if (((cdaVar.b() << 16) | cdaVar.b()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int b3 = (cdaVar.b() << 16) | cdaVar.b();
                if ((b3 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i = b3 & 255;
                if (i == 88) {
                    cdaVar.c(4L);
                    return (cdaVar.a() & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                } else if (i != 76) {
                    return ImageHeaderParser$ImageType.WEBP;
                } else {
                    cdaVar.c(4L);
                    return (cdaVar.a() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                }
            }
        } catch (ccz unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    @Override // defpackage.btn
    public final ImageHeaderParser$ImageType a(InputStream inputStream) {
        cjn.b(inputStream);
        return d(new cdb(inputStream));
    }

    @Override // defpackage.btn
    public final ImageHeaderParser$ImageType b(ByteBuffer byteBuffer) {
        cjn.b(byteBuffer);
        return d(new ccx(byteBuffer));
    }

    @Override // defpackage.btn
    public final int c(InputStream inputStream, bxl bxlVar) {
        int i;
        ByteOrder byteOrder;
        short c;
        int b2;
        int i2;
        int i3;
        short c2;
        short a2;
        cjn.b(inputStream);
        cdb cdbVar = new cdb(inputStream);
        cjn.b(bxlVar);
        try {
            int b3 = cdbVar.b();
            if ((b3 & 65496) != 65496 && b3 != 19789 && b3 != 18761) {
                return -1;
            }
            while (cdbVar.a() == 255 && (a2 = cdbVar.a()) != 218 && a2 != 217) {
                i = cdbVar.b() - 2;
                if (a2 == 225) {
                    break;
                }
                long j = i;
                if (cdbVar.c(j) != j) {
                    break;
                }
            }
            i = -1;
            if (i == -1) {
                return -1;
            }
            byte[] bArr = (byte[]) bxlVar.b(i, byte[].class);
            int i4 = 0;
            int i5 = 0;
            while (i4 < i) {
                i5 = cdbVar.a.read(bArr, i4, i - i4);
                if (i5 == -1) {
                    break;
                }
                i4 += i5;
            }
            if (i4 == 0 && i5 == -1) {
                throw new ccz();
            }
            if (bArr != null && i > a.length) {
                int i6 = 0;
                while (true) {
                    byte[] bArr2 = a;
                    if (i6 < bArr2.length) {
                        if (bArr[i6] != bArr2[i6]) {
                            break;
                        }
                        i6++;
                    } else {
                        ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
                        short c3 = ccy.c(6, byteBuffer);
                        if (c3 != 18761) {
                            byteOrder = c3 != 19789 ? ByteOrder.BIG_ENDIAN : ByteOrder.BIG_ENDIAN;
                        } else {
                            byteOrder = ByteOrder.LITTLE_ENDIAN;
                        }
                        byteBuffer.order(byteOrder);
                        int b4 = ccy.b(10, byteBuffer) + 6;
                        short c4 = ccy.c(b4, byteBuffer);
                        for (int i7 = 0; i7 < c4; i7++) {
                            int i8 = b4 + 2 + (i7 * 12);
                            if (ccy.c(i8, byteBuffer) == 274 && (c = ccy.c(i8 + 2, byteBuffer)) > 0 && c <= 12 && (b2 = ccy.b(i8 + 4, byteBuffer)) >= 0 && (i2 = b2 + b[c]) <= 4 && (i3 = i8 + 8) >= 0 && i3 <= ccy.a(byteBuffer) && i2 >= 0 && i2 + i3 <= ccy.a(byteBuffer)) {
                                c2 = ccy.c(i3, byteBuffer);
                                break;
                            }
                        }
                    }
                }
            }
            c2 = -1;
            bxlVar.a(bArr);
            return c2;
        } catch (ccz unused) {
            return -1;
        }
    }
}
