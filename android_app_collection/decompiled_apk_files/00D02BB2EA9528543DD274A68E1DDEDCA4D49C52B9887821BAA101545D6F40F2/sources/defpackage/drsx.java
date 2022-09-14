package defpackage;
/* compiled from: PG */
/* renamed from: drsx  reason: default package */
/* loaded from: classes6.dex */
public final class drsx {
    public static final /* synthetic */ int b = 0;
    static final int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 31, -1, -1, 10, 11, 12, -1, 13, 14, 15, -1, 16, 17, 18, 19, 20, -1, 21, 22, 23, 24, 25, -1, 26, 27, 28, 29, 30, -1, -1, -1, -1, -1};
    private static final String[] c = {"/m/", "/g/", "/t/", "/x/", "/n/", "/p/", "/r/", "/s/"};

    public static char a(int i) {
        return "0123456789bcdfghjklmnpqrstvwxyz_".charAt(i);
    }

    public static int b(char c2) {
        return a[c2];
    }

    public static final String c(int i) {
        boolean z = false;
        if (i >= 0 && i < 6) {
            z = true;
        }
        dbsk.e(z, "Invalid graph ID: %i", i);
        return c[i];
    }

    public static final int d(long j) {
        return (int) ((j >>> 59) & 7);
    }

    public static final int e(long j) {
        return (int) (j >>> 62);
    }

    public static long f(String str) {
        if (str.length() == 32) {
            String substring = str.substring(0, 16);
            String substring2 = str.substring(16, 32);
            long e = decu.e(substring, 16);
            long e2 = decu.e(substring2, 16);
            long j = e + 7925586850557696993L;
            if (j >= 8 || ((-17179869184L) & e2) != Long.MIN_VALUE) {
                String valueOf = String.valueOf(str);
                throw new IllegalArgumentException(valueOf.length() != 0 ? "Invalid GUID: ".concat(valueOf) : new String("Invalid GUID: "));
            }
            return g((int) j, e2 & 17179869183L);
        }
        throw new IllegalArgumentException("Invalid GUID length");
    }

    public static final long g(int i, long j) {
        if (((-576460752303423488L) & j) == 0) {
            return j | (i << 59);
        }
        String hexString = Long.toHexString(576460752303423487L);
        String c2 = c(i);
        String hexString2 = Long.toHexString(j);
        int length = String.valueOf(hexString).length();
        StringBuilder sb = new StringBuilder(length + 42 + String.valueOf(c2).length() + String.valueOf(hexString2).length());
        sb.append("MID exceeds max size 0x");
        sb.append(hexString);
        sb.append(" for namespace ");
        sb.append(c2);
        sb.append(": 0x");
        sb.append(hexString2);
        throw new IllegalArgumentException(sb.toString());
    }
}
