package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: eaoe  reason: default package */
/* loaded from: classes6.dex */
public final class eaoe {
    public static final char[] a;
    public static final int[] b;
    public static final int[] c;
    public static final int[] d;
    public static final int[] e;
    public static final int[] f;
    public static final int[] g;
    static final int[] h;
    private static final byte[] i;

    static {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        a = charArray;
        int length = charArray.length;
        i = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            i[i2] = (byte) a[i2];
        }
        int[] iArr = new int[256];
        for (int i3 = 0; i3 < 32; i3++) {
            iArr[i3] = -1;
        }
        iArr[34] = 1;
        iArr[92] = 1;
        b = iArr;
        int[] iArr2 = new int[256];
        System.arraycopy(iArr, 0, iArr2, 0, 256);
        for (int i4 = 128; i4 < 256; i4++) {
            iArr2[i4] = (i4 & 224) == 192 ? 2 : (i4 & 240) == 224 ? 3 : (i4 & 248) == 240 ? 4 : -1;
        }
        c = iArr2;
        int[] iArr3 = new int[256];
        Arrays.fill(iArr3, -1);
        for (int i5 = 33; i5 < 256; i5++) {
            if (Character.isJavaIdentifierPart((char) i5)) {
                iArr3[i5] = 0;
            }
        }
        iArr3[64] = 0;
        iArr3[35] = 0;
        iArr3[42] = 0;
        iArr3[45] = 0;
        iArr3[43] = 0;
        d = iArr3;
        int[] iArr4 = new int[256];
        System.arraycopy(iArr3, 0, iArr4, 0, 256);
        Arrays.fill(iArr4, 128, 128, 0);
        e = iArr4;
        int[] iArr5 = new int[256];
        f = iArr5;
        System.arraycopy(c, 128, iArr5, 128, 128);
        Arrays.fill(iArr5, 0, 32, -1);
        iArr5[9] = 0;
        iArr5[10] = 10;
        iArr5[13] = 13;
        iArr5[42] = 42;
        int[] iArr6 = new int[128];
        for (int i6 = 0; i6 < 32; i6++) {
            iArr6[i6] = -1;
        }
        iArr6[34] = 34;
        iArr6[92] = 92;
        iArr6[8] = 98;
        iArr6[9] = 116;
        iArr6[12] = 102;
        iArr6[10] = 110;
        iArr6[13] = 114;
        g = iArr6;
        int[] iArr7 = new int[128];
        h = iArr7;
        Arrays.fill(iArr7, -1);
        for (int i7 = 0; i7 < 10; i7++) {
            h[i7 + 48] = i7;
        }
        for (int i8 = 0; i8 < 6; i8++) {
            int i9 = i8 + 10;
            int[] iArr8 = h;
            iArr8[i8 + 97] = i9;
            iArr8[i8 + 65] = i9;
        }
    }

    public static int a(int i2) {
        if (i2 > 127) {
            return -1;
        }
        return h[i2];
    }

    public static char[] b() {
        return (char[]) a.clone();
    }

    public static byte[] c() {
        return (byte[]) i.clone();
    }
}
