package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: decl  reason: default package */
/* loaded from: classes.dex */
public final class decl extends decm {
    public static int a(long j) {
        int i = (int) j;
        dbsk.f(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    public static int b(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j >= -2147483648L) {
            return (int) j;
        }
        return Integer.MIN_VALUE;
    }

    public static int c(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i <= i2 ? 0 : 1;
    }

    public static boolean d(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static int e(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int f(int... iArr) {
        dbsk.a(iArr.length > 0);
        int i = iArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            if (i3 < i) {
                i = i3;
            }
        }
        return i;
    }

    public static int g(int... iArr) {
        dbsk.a(iArr.length > 0);
        int i = iArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            if (i3 > i) {
                i = i3;
            }
        }
        return i;
    }

    public static int h(int i, int i2, int i3) {
        dbsk.h(i2 <= i3, "min (%s) must be less than or equal to max (%s)", i2, i3);
        return Math.min(Math.max(i, i2), i3);
    }

    public static byte[] i(int i) {
        return new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i};
    }

    public static int j(byte[] bArr) {
        int length = bArr.length;
        dbsk.h(length >= 4, "array too small: %s < %s", length, 4);
        return k(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int k(byte b, byte b2, byte b3, byte b4) {
        return (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    public static int[] l(Collection<? extends Number> collection) {
        if (collection instanceof deck) {
            deck deckVar = (deck) collection;
            return Arrays.copyOfRange(deckVar.a, deckVar.b, deckVar.c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            dbsk.s(obj);
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static List<Integer> m(int... iArr) {
        int length = iArr.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        return new deck(iArr, 0, length);
    }
}
