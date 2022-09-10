package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: cmcs  reason: default package */
/* loaded from: classes5.dex */
public final class cmcs extends cmbz {
    public static final cmcq a = cmcq.a;
    private final cmcq b;

    public cmcs() {
        this(null);
    }

    public cmcs(cmcq cmcqVar) {
        this.b = cmcqVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0083, code lost:
        if ((r10 & 128) != 0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean d(defpackage.cmnk r19, int r20, int r21, boolean r22) {
        /*
            r1 = r19
            r0 = r20
            int r2 = r1.b
        L6:
            int r3 = r19.d()     // Catch: java.lang.Throwable -> Lac
            r4 = 1
            r5 = r21
            if (r3 < r5) goto La8
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L20
            int r7 = r19.r()     // Catch: java.lang.Throwable -> Lac
            long r8 = r19.p()     // Catch: java.lang.Throwable -> Lac
            int r10 = r19.m()     // Catch: java.lang.Throwable -> Lac
            goto L2a
        L20:
            int r7 = r19.o()     // Catch: java.lang.Throwable -> Lac
            int r8 = r19.o()     // Catch: java.lang.Throwable -> Lac
            long r8 = (long) r8
            r10 = 0
        L2a:
            r11 = 0
            if (r7 != 0) goto L39
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L39
            if (r10 == 0) goto L35
            goto L39
        L35:
            r1.f(r2)
            return r4
        L39:
            r7 = 4
            if (r0 != r7) goto L68
            if (r22 != 0) goto L68
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L4a
            r1.f(r2)
            return r6
        L4a:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r11 = r11 & r15
            r15 = 14
            long r11 = r11 << r15
            long r11 = r11 | r13
            r13 = 24
            long r8 = r8 >> r13
            r13 = 21
            long r8 = r8 << r13
            long r8 = r8 | r11
        L68:
            if (r0 != r7) goto L78
            r3 = r10 & 64
            if (r3 == 0) goto L6f
            goto L70
        L6f:
            r4 = 0
        L70:
            r3 = r10 & 1
            r18 = r4
            r4 = r3
            r3 = r18
            goto L88
        L78:
            if (r0 != r3) goto L86
            r3 = r10 & 32
            if (r3 == 0) goto L80
            r3 = 1
            goto L81
        L80:
            r3 = 0
        L81:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L87
            goto L88
        L86:
            r3 = 0
        L87:
            r4 = 0
        L88:
            if (r4 == 0) goto L8c
            int r3 = r3 + 4
        L8c:
            long r3 = (long) r3
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L95
            r1.f(r2)
            return r6
        L95:
            int r3 = r19.d()     // Catch: java.lang.Throwable -> Lac
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto La2
            r1.f(r2)
            return r6
        La2:
            int r3 = (int) r8
            r1.h(r3)     // Catch: java.lang.Throwable -> Lac
            goto L6
        La8:
            r1.f(r2)
            return r4
        Lac:
            r0 = move-exception
            r1.f(r2)
            goto Lb2
        Lb1:
            throw r0
        Lb2:
            goto Lb1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmcs.d(cmnk, int, int, boolean):boolean");
    }

    private static int e(cmnk cmnkVar, int i) {
        byte[] bArr = cmnkVar.a;
        int i2 = cmnkVar.b;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 < i2 + i) {
                if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                    System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                    i--;
                }
                i3 = i4;
            } else {
                return i;
            }
        }
    }

    private static String f(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    private static String g(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    private static int h(byte[] bArr, int i, int i2) {
        int i3 = i(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return i3;
        }
        while (true) {
            int length = bArr.length;
            if (i3 >= length - 1) {
                return length;
            }
            if (i3 % 2 == 0 && bArr[i3 + 1] == 0) {
                return i3;
            }
            i3 = i(bArr, i3 + 1);
        }
    }

    private static int i(byte[] bArr, int i) {
        while (true) {
            int length = bArr.length;
            if (i < length) {
                if (bArr[i] == 0) {
                    return i;
                }
                i++;
            } else {
                return length;
            }
        }
    }

    private static int j(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    private static byte[] k(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return cmny.f;
        }
        return Arrays.copyOfRange(bArr, i, i2);
    }

    private static String l(byte[] bArr, int i, int i2, String str) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x024d, code lost:
        if (r9 == 67) goto L104;
     */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04de A[Catch: all -> 0x0507, UnsupportedEncodingException -> 0x050b, TRY_LEAVE, TryCatch #3 {UnsupportedEncodingException -> 0x050b, all -> 0x0507, blocks: (B:228:0x04de, B:141:0x0269, B:143:0x027a, B:145:0x0284, B:155:0x02be, B:144:0x027f, B:149:0x0290, B:151:0x02a8, B:153:0x02b4, B:154:0x02b9, B:167:0x02fe, B:175:0x0346, B:178:0x0373, B:181:0x0384, B:182:0x038c, B:184:0x0390, B:186:0x0397, B:187:0x039b, B:194:0x03bc, B:198:0x03e1, B:200:0x03ec, B:201:0x0417, B:202:0x0423, B:204:0x0427, B:206:0x042e, B:207:0x0432, B:211:0x0447, B:220:0x0471, B:222:0x04a6, B:223:0x04b5, B:226:0x04cc), top: B:244:0x00e6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.exoplayer2.metadata.id3.Id3Frame m(int r33, defpackage.cmnk r34, boolean r35, int r36, defpackage.cmcq r37) {
        /*
            Method dump skipped, instructions count: 1319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmcs.m(int, cmnk, boolean, int, cmcq):com.google.android.exoplayer2.metadata.id3.Id3Frame");
    }

    @Override // defpackage.cmbz
    protected final Metadata b(cmbw cmbwVar, ByteBuffer byteBuffer) {
        return c(byteBuffer.array(), byteBuffer.limit());
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
        if ((r7 & 64) != 0) goto L3;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.exoplayer2.metadata.Metadata c(byte[] r12, int r13) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmcs.c(byte[], int):com.google.android.exoplayer2.metadata.Metadata");
    }
}
