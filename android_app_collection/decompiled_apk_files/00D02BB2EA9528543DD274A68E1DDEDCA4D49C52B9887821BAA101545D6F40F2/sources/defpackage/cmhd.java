package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
/* compiled from: PG */
/* renamed from: cmhd  reason: default package */
/* loaded from: classes5.dex */
final class cmhd {
    private static final byte[] h = {0, 7, 8, 15};
    private static final byte[] i = {0, 119, -120, -1};
    private static final byte[] j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public final Paint a;
    public final Paint b;
    public final Canvas c;
    public final cmgw d;
    public final cmgv e;
    public final cmhc f;
    public Bitmap g;

    public cmhd(int i2, int i3) {
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
        this.d = new cmgw(719, 575, 0, 719, 0, 575);
        this.e = new cmgv(0, d(), e(), f());
        this.f = new cmhc(i2, i3);
    }

    public static cmgv a(cmnj cmnjVar, int i2) {
        int j2;
        int i3;
        int j3;
        int j4;
        int i4 = 8;
        int j5 = cmnjVar.j(8);
        cmnjVar.h(8);
        int i5 = i2 - 2;
        int[] d = d();
        int[] e = e();
        int[] f = f();
        while (i5 > 0) {
            int j6 = cmnjVar.j(i4);
            int j7 = cmnjVar.j(i4);
            int i6 = i5 - 2;
            int[] iArr = (j7 & 128) != 0 ? d : (j7 & 64) != 0 ? e : f;
            if ((j7 & 1) != 0) {
                j3 = cmnjVar.j(i4);
                j4 = cmnjVar.j(i4);
                j2 = cmnjVar.j(i4);
                i3 = cmnjVar.j(i4);
                i5 = i6 - 4;
            } else {
                int j8 = cmnjVar.j(2) << 6;
                i5 = i6 - 2;
                j2 = cmnjVar.j(4) << 4;
                i3 = j8;
                j3 = cmnjVar.j(6) << 2;
                j4 = cmnjVar.j(4) << 4;
            }
            if (j3 == 0) {
                i3 = 255;
            }
            if (j3 == 0) {
                j2 = 0;
            }
            int i7 = j5;
            if (j3 == 0) {
                j4 = 0;
            }
            double d2 = j3;
            double d3 = j4 - 128;
            double d4 = j2 - 128;
            Double.isNaN(d3);
            Double.isNaN(d2);
            int B = cmny.B((int) (d2 + (1.402d * d3)), 0, 255);
            Double.isNaN(d4);
            Double.isNaN(d2);
            Double.isNaN(d3);
            int B2 = cmny.B((int) ((d2 - (0.34414d * d4)) - (d3 * 0.71414d)), 0, 255);
            Double.isNaN(d4);
            Double.isNaN(d2);
            iArr[j6] = g((byte) (255 - (i3 & 255)), B, B2, cmny.B((int) (d2 + (d4 * 1.772d)), 0, 255));
            j5 = i7;
            i4 = 8;
        }
        return new cmgv(j5, d, e, f);
    }

    public static cmgx b(cmnj cmnjVar) {
        int j2 = cmnjVar.j(16);
        cmnjVar.h(4);
        int j3 = cmnjVar.j(2);
        boolean i2 = cmnjVar.i();
        cmnjVar.h(1);
        byte[] bArr = cmny.f;
        byte[] bArr2 = cmny.f;
        if (j3 == 1) {
            cmnjVar.h(cmnjVar.j(8) * 16);
        } else if (j3 == 0) {
            int j4 = cmnjVar.j(16);
            int j5 = cmnjVar.j(16);
            if (j4 > 0) {
                bArr = new byte[j4];
                cmnjVar.p(bArr, j4);
            }
            if (j5 > 0) {
                bArr2 = new byte[j5];
                cmnjVar.p(bArr2, j5);
            } else {
                bArr2 = bArr;
            }
        }
        return new cmgx(j2, i2, bArr, bArr2);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmhd.c(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    private static int[] d() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] e() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            if (i2 < 8) {
                iArr[i2] = g(255, 1 != (i2 & 1) ? 0 : 255, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) != 0 ? 255 : 0);
            } else {
                int i3 = 127;
                int i4 = 1 != (i2 & 1) ? 0 : 127;
                int i5 = (i2 & 2) != 0 ? 127 : 0;
                if ((i2 & 4) == 0) {
                    i3 = 0;
                }
                iArr[i2] = g(255, i4, i5, i3);
            }
        }
        return iArr;
    }

    private static int[] f() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            int i3 = 255;
            if (i2 < 8) {
                int i4 = 1 != (i2 & 1) ? 0 : 255;
                int i5 = (i2 & 2) != 0 ? 255 : 0;
                if ((i2 & 4) == 0) {
                    i3 = 0;
                }
                iArr[i2] = g(63, i4, i5, i3);
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
                    iArr[i2] = g(255, i9, i10, i8 + i7);
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
                        iArr[i2] = g(255, i12, i13, i14 + i8);
                    } else if (i6 == 136) {
                        int i15 = (1 != (i2 & 1) ? 0 : 43) + ((i2 & 16) != 0 ? 85 : 0);
                        int i16 = ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0);
                        if ((i2 & 4) == 0) {
                            i11 = 0;
                        }
                        if ((i2 & 64) == 0) {
                            i8 = 0;
                        }
                        iArr[i2] = g(255, i15, i16, i11 + i8);
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
                    iArr[i2] = g(127, i17, i18, i8 + i7);
                }
            }
        }
        return iArr;
    }

    private static int g(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    private static byte[] h(int i2, int i3, cmnj cmnjVar) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) cmnjVar.j(i3);
        }
        return bArr;
    }
}
