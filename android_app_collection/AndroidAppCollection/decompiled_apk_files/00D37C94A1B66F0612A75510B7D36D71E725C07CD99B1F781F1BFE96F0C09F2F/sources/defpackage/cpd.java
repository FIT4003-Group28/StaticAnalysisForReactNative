package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: cpd  reason: default package */
/* loaded from: classes3.dex */
public final class cpd implements chp {
    static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    private static final int[] b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    private static final int e(cpb cpbVar, clb clbVar) {
        int i;
        ByteOrder byteOrder;
        short f;
        int e;
        int i2;
        int i3;
        short f2;
        short d;
        try {
            int a2 = cpbVar.a();
            if ((a2 & 65496) != 65496 && a2 != 19789 && a2 != 18761) {
                return -1;
            }
            while (cpbVar.d() == 255 && (d = cpbVar.d()) != 218 && d != 217) {
                i = cpbVar.a() - 2;
                if (d == 225) {
                    break;
                }
                long j = i;
                if (cpbVar.c(j) != j) {
                    break;
                }
            }
            i = -1;
            if (i == -1) {
                return -1;
            }
            byte[] bArr = (byte[]) clbVar.a(i, byte[].class);
            if (cpbVar.b(bArr, i) == i && i > a.length) {
                int i4 = 0;
                while (true) {
                    byte[] bArr2 = a;
                    if (i4 < bArr2.length) {
                        if (bArr[i4] != bArr2[i4]) {
                            break;
                        }
                        i4++;
                    } else {
                        ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
                        short f3 = akf.f(6, byteBuffer);
                        if (f3 != 18761) {
                            byteOrder = f3 != 19789 ? ByteOrder.BIG_ENDIAN : ByteOrder.BIG_ENDIAN;
                        } else {
                            byteOrder = ByteOrder.LITTLE_ENDIAN;
                        }
                        byteBuffer.order(byteOrder);
                        int e2 = akf.e(10, byteBuffer) + 6;
                        short f4 = akf.f(e2, byteBuffer);
                        for (int i5 = 0; i5 < f4; i5++) {
                            int i6 = e2 + 2 + (i5 * 12);
                            if (akf.f(i6, byteBuffer) == 274 && (f = akf.f(i6 + 2, byteBuffer)) > 0 && f <= 12 && (e = akf.e(i6 + 4, byteBuffer)) >= 0 && (i2 = e + b[f]) <= 4 && (i3 = i6 + 8) >= 0 && i3 <= byteBuffer.remaining() && i2 >= 0 && i2 + i3 <= byteBuffer.remaining()) {
                                f2 = akf.f(i3, byteBuffer);
                                break;
                            }
                        }
                    }
                }
            }
            f2 = -1;
            clbVar.c(bArr);
            return f2;
        } catch (cpa unused) {
            return -1;
        }
    }

    private static final ImageHeaderParser$ImageType f(cpb cpbVar) {
        try {
            int a2 = cpbVar.a();
            if (a2 == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int d = (a2 << 8) | cpbVar.d();
            if (d == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int d2 = (d << 8) | cpbVar.d();
            if (d2 == -1991225785) {
                cpbVar.c(21L);
                try {
                    return cpbVar.d() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (cpa unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            } else if (d2 != 1380533830) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            } else {
                cpbVar.c(4L);
                if (((cpbVar.a() << 16) | cpbVar.a()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int a3 = (cpbVar.a() << 16) | cpbVar.a();
                if ((a3 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i = a3 & PrivateKeyType.INVALID;
                if (i == 88) {
                    cpbVar.c(4L);
                    return (cpbVar.d() & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                } else if (i == 76) {
                    cpbVar.c(4L);
                    return (cpbVar.d() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                } else {
                    return ImageHeaderParser$ImageType.WEBP;
                }
            }
        } catch (cpa unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    @Override // defpackage.chp
    public final int a(InputStream inputStream, clb clbVar) {
        hy.N(inputStream);
        cpc cpcVar = new cpc(inputStream);
        hy.N(clbVar);
        return e(cpcVar, clbVar);
    }

    @Override // defpackage.chp
    public final int b(ByteBuffer byteBuffer, clb clbVar) {
        hy.N(byteBuffer);
        coz cozVar = new coz(byteBuffer);
        hy.N(clbVar);
        return e(cozVar, clbVar);
    }

    @Override // defpackage.chp
    public final ImageHeaderParser$ImageType c(InputStream inputStream) {
        hy.N(inputStream);
        return f(new cpc(inputStream));
    }

    @Override // defpackage.chp
    public final ImageHeaderParser$ImageType d(ByteBuffer byteBuffer) {
        hy.N(byteBuffer);
        return f(new coz(byteBuffer));
    }
}
