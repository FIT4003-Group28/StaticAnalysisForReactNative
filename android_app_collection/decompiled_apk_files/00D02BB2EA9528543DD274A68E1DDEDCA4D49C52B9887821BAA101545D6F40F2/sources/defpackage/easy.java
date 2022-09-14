package defpackage;
/* compiled from: PG */
/* renamed from: easy  reason: default package */
/* loaded from: classes.dex */
public final class easy {
    public static long a(long j, long j2) {
        long j3 = j + j2;
        if ((j ^ j3) >= 0 || (j ^ j2) < 0) {
            return j3;
        }
        StringBuilder sb = new StringBuilder(79);
        sb.append("The calculation caused an overflow: ");
        sb.append(j);
        sb.append(" + ");
        sb.append(j2);
        throw new ArithmeticException(sb.toString());
    }

    public static long b(long j, long j2) {
        long j3 = j - j2;
        if ((j ^ j3) >= 0 || (j ^ j2) >= 0) {
            return j3;
        }
        StringBuilder sb = new StringBuilder(79);
        sb.append("The calculation caused an overflow: ");
        sb.append(j);
        sb.append(" - ");
        sb.append(j2);
        throw new ArithmeticException(sb.toString());
    }

    public static int d(long j) {
        if (j < -2147483648L || j > 2147483647L) {
            StringBuilder sb = new StringBuilder(48);
            sb.append("Value cannot fit in an int: ");
            sb.append(j);
            throw new ArithmeticException(sb.toString());
        }
        return (int) j;
    }

    public static void e(eaon eaonVar, int i, int i2, int i3) {
        if (i < i2 || i > i3) {
            throw new eapb(eaonVar.a(), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    public static void f(eaop eaopVar, int i, int i2, int i3) {
        if (i < i2 || i > i3) {
            throw new eapb(eaopVar, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    public static boolean g(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj2 != null) {
            return obj.equals(obj2);
        }
        return false;
    }

    public static long c(long j, int i) {
        if (i == -1) {
            if (j != Long.MIN_VALUE) {
                return -j;
            }
            StringBuilder sb = new StringBuilder(67);
            sb.append("Multiplication overflows a long: ");
            sb.append(j);
            sb.append(" * ");
            sb.append(i);
            throw new ArithmeticException(sb.toString());
        } else if (i == 0) {
            return 0L;
        } else {
            if (i == 1) {
                return j;
            }
            long j2 = i;
            long j3 = j * j2;
            if (j3 / j2 == j) {
                return j3;
            }
            StringBuilder sb2 = new StringBuilder(67);
            sb2.append("Multiplication overflows a long: ");
            sb2.append(j);
            sb2.append(" * ");
            sb2.append(i);
            throw new ArithmeticException(sb2.toString());
        }
    }
}
