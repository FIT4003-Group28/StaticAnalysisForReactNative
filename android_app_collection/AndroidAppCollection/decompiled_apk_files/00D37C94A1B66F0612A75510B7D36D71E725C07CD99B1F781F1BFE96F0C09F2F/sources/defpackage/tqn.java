package defpackage;

import android.util.Base64;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: tqn  reason: default package */
/* loaded from: classes4.dex */
public final class tqn {
    public static int a(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int b(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int c(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int d(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static String e(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }

    public static ArrayList f() {
        return new ArrayList();
    }

    public static boolean g(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean h(Object[] objArr, Object obj) {
        int length = objArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (!tnk.j(objArr[i], obj)) {
                i++;
            } else if (i >= 0) {
                return true;
            }
        }
        return false;
    }
}
