package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: bajw  reason: default package */
/* loaded from: classes2.dex */
public final class bajw {
    public static int a(long j) {
        if (j < -2147483648L || j > 2147483647L) {
            StringBuilder sb = new StringBuilder(48);
            sb.append("Value cannot fit in an int: ");
            sb.append(j);
            throw new ArithmeticException(sb.toString());
        }
        return (int) j;
    }

    public static long b(long j, long j2) {
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

    public static long c(long j, int i) {
        long j2 = i;
        long j3 = j * j2;
        if (j3 / j2 == j) {
            return j3;
        }
        StringBuilder sb = new StringBuilder(67);
        sb.append("Multiplication overflows a long: ");
        sb.append(j);
        sb.append(" * ");
        sb.append(i);
        throw new ArithmeticException(sb.toString());
    }

    public static long d(long j, long j2) {
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

    public static void e(bahn bahnVar, int i, int i2, int i3) {
        if (i < i2 || i > i3) {
            throw new bahy(bahnVar.o(), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    public static boolean f(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj2 != null) {
            return obj.equals(obj2);
        }
        return false;
    }

    public static void g(ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            return;
        }
        throw new IllegalArgumentException("byteBuffer must be a direct ByteBuffer.");
    }

    public static void h(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return;
        }
        throw new IllegalArgumentException("ByteBuffer is already full.");
    }

    public static String i() {
        return "94.0.4602.6@8bbe1060";
    }
}
