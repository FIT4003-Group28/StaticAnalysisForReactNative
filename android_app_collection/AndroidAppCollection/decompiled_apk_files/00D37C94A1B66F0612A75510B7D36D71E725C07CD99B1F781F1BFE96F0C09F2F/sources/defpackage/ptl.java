package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: ptl  reason: default package */
/* loaded from: classes4.dex */
final class ptl {
    private static final byte[] h = {0, 7, 8, 15};
    private static final byte[] i = {0, 119, -120, -1};
    private static final byte[] j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public final Paint a;
    public final Paint b;
    public final Canvas c;
    public final pte d;
    public final ptd e;
    public final ptk f;
    public Bitmap g;

    public ptl(int i2, int i3) {
        Paint paint = new Paint();
        this.a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.c = new Canvas();
        this.d = new pte(719, 575, 0, 719, 0, 575);
        this.e = new ptd(0, f(), g(), h());
        this.f = new ptk(i2, i3);
    }

    public static ptd a(pwt pwtVar, int i2) {
        int d;
        int i3;
        int d2;
        int d3;
        int i4 = 8;
        int d4 = pwtVar.d(8);
        pwtVar.l(8);
        int i5 = i2 - 2;
        int[] f = f();
        int[] g = g();
        int[] h2 = h();
        while (i5 > 0) {
            int d5 = pwtVar.d(i4);
            int d6 = pwtVar.d(i4);
            int i6 = i5 - 2;
            int[] iArr = (d6 & 128) != 0 ? f : (d6 & 64) != 0 ? g : h2;
            if ((d6 & 1) != 0) {
                d2 = pwtVar.d(i4);
                d3 = pwtVar.d(i4);
                d = pwtVar.d(i4);
                i3 = pwtVar.d(i4);
                i5 = i6 - 4;
            } else {
                int d7 = pwtVar.d(2) << 6;
                i5 = i6 - 2;
                d = pwtVar.d(4) << 4;
                i3 = d7;
                d2 = pwtVar.d(6) << 2;
                d3 = pwtVar.d(4) << 4;
            }
            if (d2 == 0) {
                i3 = PrivateKeyType.INVALID;
            }
            if (d2 == 0) {
                d = 0;
            }
            int i7 = d4;
            if (d2 == 0) {
                d3 = 0;
            }
            double d8 = d2;
            double d9 = d3 - 128;
            double d10 = d - 128;
            Double.isNaN(d9);
            Double.isNaN(d8);
            int c = pxi.c((int) (d8 + (1.402d * d9)), 0, PrivateKeyType.INVALID);
            Double.isNaN(d10);
            Double.isNaN(d8);
            Double.isNaN(d9);
            int c2 = pxi.c((int) ((d8 - (0.34414d * d10)) - (d9 * 0.71414d)), 0, PrivateKeyType.INVALID);
            Double.isNaN(d10);
            Double.isNaN(d8);
            iArr[d5] = d((byte) (255 - (i3 & PrivateKeyType.INVALID)), c, c2, pxi.c((int) (d8 + (d10 * 1.772d)), 0, PrivateKeyType.INVALID));
            d4 = i7;
            i4 = 8;
        }
        return new ptd(d4, f, g, h2);
    }

    public static ptf b(pwt pwtVar) {
        int d = pwtVar.d(16);
        pwtVar.l(4);
        int d2 = pwtVar.d(2);
        boolean n = pwtVar.n();
        pwtVar.l(1);
        byte[] bArr = pxi.f;
        byte[] bArr2 = pxi.f;
        if (d2 == 1) {
            pwtVar.l(pwtVar.d(8) * 16);
        } else if (d2 == 0) {
            int d3 = pwtVar.d(16);
            int d4 = pwtVar.d(16);
            if (d3 > 0) {
                bArr = new byte[d3];
                pwtVar.p(bArr, d3);
            }
            if (d4 > 0) {
                bArr2 = new byte[d4];
                pwtVar.p(bArr2, d4);
            } else {
                bArr2 = bArr;
            }
        }
        return new ptf(d, n, bArr, bArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ee A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0228 A[LOOP:3: B:87:0x016f->B:116:0x0228, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0145 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0222 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0118 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014b A[LOOP:2: B:40:0x00ab->B:74:0x014b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017e  */
    /* JADX WARN: Type inference failed for: r3v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(byte[] r24, int[] r25, int r26, int r27, int r28, android.graphics.Paint r29, android.graphics.Canvas r30) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ptl.c(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    private static int d(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    private static byte[] e(int i2, int i3, pwt pwtVar) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) pwtVar.d(i3);
        }
        return bArr;
    }

    private static int[] f() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] g() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            if (i2 < 8) {
                iArr[i2] = d(PrivateKeyType.INVALID, 1 != (i2 & 1) ? 0 : PrivateKeyType.INVALID, (i2 & 2) != 0 ? PrivateKeyType.INVALID : 0, (i2 & 4) != 0 ? PrivateKeyType.INVALID : 0);
            } else {
                int i3 = 127;
                int i4 = 1 != (i2 & 1) ? 0 : 127;
                int i5 = (i2 & 2) != 0 ? 127 : 0;
                if ((i2 & 4) == 0) {
                    i3 = 0;
                }
                iArr[i2] = d(PrivateKeyType.INVALID, i4, i5, i3);
            }
        }
        return iArr;
    }

    private static int[] h() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            int i3 = PrivateKeyType.INVALID;
            if (i2 < 8) {
                int i4 = 1 != (i2 & 1) ? 0 : PrivateKeyType.INVALID;
                int i5 = (i2 & 2) != 0 ? PrivateKeyType.INVALID : 0;
                if ((i2 & 4) == 0) {
                    i3 = 0;
                }
                iArr[i2] = d(63, i4, i5, i3);
            } else {
                int i6 = i2 & 136;
                int i7 = 170;
                int i8 = 85;
                if (i6 == 0) {
                    int i9 = (1 != (i2 & 1) ? 0 : 85) + ((i2 & 16) != 0 ? 170 : 0);
                    int i10 = ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0);
                    if ((i2 & 4) == 0) {
                        i8 = 0;
                    }
                    if ((i2 & 64) == 0) {
                        i7 = 0;
                    }
                    iArr[i2] = d(PrivateKeyType.INVALID, i9, i10, i8 + i7);
                } else if (i6 != 8) {
                    int i11 = 43;
                    if (i6 == 128) {
                        int i12 = (1 != (i2 & 1) ? 0 : 43) + 127 + ((i2 & 16) != 0 ? 85 : 0);
                        int i13 = ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0);
                        if ((i2 & 4) == 0) {
                            i11 = 0;
                        }
                        int i14 = i11 + 127;
                        if ((i2 & 64) == 0) {
                            i8 = 0;
                        }
                        iArr[i2] = d(PrivateKeyType.INVALID, i12, i13, i14 + i8);
                    } else if (i6 == 136) {
                        int i15 = (1 != (i2 & 1) ? 0 : 43) + ((i2 & 16) != 0 ? 85 : 0);
                        int i16 = ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0);
                        if ((i2 & 4) == 0) {
                            i11 = 0;
                        }
                        if ((i2 & 64) == 0) {
                            i8 = 0;
                        }
                        iArr[i2] = d(PrivateKeyType.INVALID, i15, i16, i11 + i8);
                    }
                } else {
                    int i17 = (1 != (i2 & 1) ? 0 : 85) + ((i2 & 16) != 0 ? 170 : 0);
                    int i18 = ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0);
                    if ((i2 & 4) == 0) {
                        i8 = 0;
                    }
                    if ((i2 & 64) == 0) {
                        i7 = 0;
                    }
                    iArr[i2] = d(127, i17, i18, i8 + i7);
                }
            }
        }
        return iArr;
    }
}
