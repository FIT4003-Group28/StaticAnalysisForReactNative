package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: dbzq  reason: default package */
/* loaded from: classes.dex */
final class dbzq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i) {
        return Math.max(4, dccj.c(i + 1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object b(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            if (i <= 256) {
                return new byte[i];
            }
            return i <= 65536 ? new short[i] : new int[i];
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("must be power of 2 between 2^1 and 2^30: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        if (obj instanceof short[]) {
            return (char) ((short[]) obj)[i];
        }
        return ((int[]) obj)[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(int i, int i2) {
        return i & (i2 ^ (-1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(int i, int i2, int i3) {
        return (i & (i3 ^ (-1))) | (i2 & i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int b = dccj.b(obj);
        int i4 = b & i;
        int d = d(obj3, i4);
        if (d == 0) {
            return -1;
        }
        int g = g(b, i);
        int i5 = -1;
        while (true) {
            i2 = d - 1;
            i3 = iArr[i2];
            if (g(i3, i) != g || !dbsd.a(obj, objArr[i2]) || (objArr2 != null && !dbsd.a(obj2, objArr2[i2]))) {
                int i6 = i3 & i;
                if (i6 == 0) {
                    return -1;
                }
                i5 = i2;
                d = i6;
            }
        }
        int i7 = i3 & i;
        if (i5 == -1) {
            e(obj3, i4, i7);
        } else {
            iArr[i5] = h(iArr[i5], i7, i);
        }
        return i2;
    }
}
