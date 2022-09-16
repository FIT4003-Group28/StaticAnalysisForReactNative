package defpackage;
/* compiled from: PG */
/* renamed from: pcp  reason: default package */
/* loaded from: classes4.dex */
public final class pcp {
    private static final String[] h = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    private static final int[] i = {44100, 48000, 32000};
    private static final int[] j = {32, 64, 96, 128, 160, 192, 224, 256, 288, 320, 352, 384, 416, 448};
    private static final int[] k = {32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, 192, 224, 256};
    private static final int[] l = {32, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384};
    private static final int[] m = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320};
    private static final int[] n = {8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160};
    public int a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    public static int a(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if ((i2 & (-2097152)) != -2097152 || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i8 = i[i6];
        if (i3 == 2) {
            i8 /= 2;
        } else if (i3 == 0) {
            i8 /= 4;
        }
        int i9 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return ((((i3 == 3 ? j[i5 - 1] : k[i5 - 1]) * 12000) / i8) + i9) * 4;
        }
        if (i3 == 3) {
            i7 = i4 == 2 ? l[i5 - 1] : m[i5 - 1];
        } else {
            i7 = n[i5 - 1];
        }
        int i10 = 144000;
        if (i3 == 3) {
            return ((i7 * 144000) / i8) + i9;
        }
        if (i4 == 1) {
            i10 = 72000;
        }
        return ((i10 * i7) / i8) + i9;
    }

    public static boolean b(int i2, pcp pcpVar) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if ((i2 & (-2097152)) != -2097152 || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return false;
        }
        int i10 = i[i6];
        int i11 = 2;
        if (i3 == 2) {
            i10 /= 2;
        } else if (i3 == 0) {
            i10 /= 4;
        }
        int i12 = (i2 >>> 9) & 1;
        int i13 = 1152;
        if (i4 == 3) {
            i7 = i3 == 3 ? j[i5 - 1] : k[i5 - 1];
            i8 = (((i7 * 12000) / i10) + i12) * 4;
            i9 = 384;
        } else {
            int i14 = 144000;
            if (i3 == 3) {
                i7 = i4 == 2 ? l[i5 - 1] : m[i5 - 1];
                i8 = i12 + ((144000 * i7) / i10);
                i9 = 1152;
            } else {
                i7 = n[i5 - 1];
                if (i4 == 1) {
                    i13 = 576;
                }
                if (i4 == 1) {
                    i14 = 72000;
                }
                int i15 = i13;
                i8 = i12 + ((i14 * i7) / i10);
                i9 = i15;
            }
        }
        String str = h[3 - i4];
        if (((i2 >> 6) & 3) == 3) {
            i11 = 1;
        }
        pcpVar.a = i3;
        pcpVar.b = str;
        pcpVar.c = i8;
        pcpVar.d = i10;
        pcpVar.e = i11;
        pcpVar.f = i7 * 1000;
        pcpVar.g = i9;
        return true;
    }
}
