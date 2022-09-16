package defpackage;
/* compiled from: PG */
/* renamed from: anhh  reason: default package */
/* loaded from: classes.dex */
public class anhh {
    public static int b(boolean z, boolean z2) {
        if (z == z2) {
            return 0;
        }
        return !z ? -1 : 1;
    }

    public static int c(boolean... zArr) {
        int i = 0;
        for (boolean z : zArr) {
            if (z) {
                i++;
            }
        }
        return i;
    }

    public static void d(boolean z, String str, long j, long j2) {
        if (z) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 54);
        sb.append("overflow: ");
        sb.append(str);
        sb.append("(");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(")");
        throw new ArithmeticException(sb.toString());
    }

    public static void e(boolean z) {
        if (z) {
            return;
        }
        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
    }

    public static int f(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public String a() {
        throw null;
    }
}
