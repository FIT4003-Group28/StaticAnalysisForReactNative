package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
/* compiled from: PG */
/* renamed from: ddak  reason: default package */
/* loaded from: classes5.dex */
public final class ddak {
    static {
        new ddai();
    }

    public static long a(InputStream inputStream, OutputStream outputStream) {
        dbsk.s(inputStream);
        dbsk.s(outputStream);
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }

    public static byte[] b(InputStream inputStream) {
        dbsk.s(inputStream);
        return g(inputStream, new ArrayDeque(20), 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] c(InputStream inputStream, long j) {
        dbsk.f(j >= 0, "expectedSize (%s) must be non-negative", j);
        if (j > 2147483639) {
            StringBuilder sb = new StringBuilder(62);
            sb.append(j);
            sb.append(" bytes is too large to fit in a byte array");
            throw new OutOfMemoryError(sb.toString());
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = i;
        while (i2 > 0) {
            int i3 = i - i2;
            int read = inputStream.read(bArr, i3, i2);
            if (read == -1) {
                return Arrays.copyOf(bArr, i3);
            }
            i2 -= read;
        }
        int read2 = inputStream.read();
        if (read2 == -1) {
            return bArr;
        }
        ArrayDeque arrayDeque = new ArrayDeque(22);
        arrayDeque.add(bArr);
        arrayDeque.add(new byte[]{(byte) read2});
        return g(inputStream, arrayDeque, i + 1);
    }

    public static void d(InputStream inputStream, byte[] bArr) {
        e(inputStream, bArr, 0, bArr.length);
    }

    public static void e(InputStream inputStream, byte[] bArr, int i, int i2) {
        dbsk.s(bArr);
        int i3 = 0;
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(String.format("len (%s) cannot be negative", Integer.valueOf(i2)));
        }
        dbsk.u(i, i + i2, bArr.length);
        while (i3 < i2) {
            int read = inputStream.read(bArr, i + i3, i2 - i3);
            if (read == -1) {
                break;
            }
            i3 += read;
        }
        if (i3 == i2) {
            return;
        }
        StringBuilder sb = new StringBuilder(81);
        sb.append("reached end of stream after reading ");
        sb.append(i3);
        sb.append(" bytes; ");
        sb.append(i2);
        sb.append(" bytes expected");
        throw new EOFException(sb.toString());
    }

    public static InputStream f(InputStream inputStream) {
        return new ddaj(inputStream);
    }

    private static byte[] g(InputStream inputStream, Queue<byte[]> queue, int i) {
        int i2 = 8192;
        while (i < 2147483639) {
            int min = Math.min(i2, 2147483639 - i);
            byte[] bArr = new byte[min];
            queue.add(bArr);
            int i3 = 0;
            while (i3 < min) {
                int read = inputStream.read(bArr, i3, min - i3);
                if (read == -1) {
                    return h(queue, i);
                }
                i3 += read;
                i += read;
            }
            long j = i2;
            i2 = decl.b(j + j);
        }
        if (inputStream.read() == -1) {
            return h(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    private static byte[] h(Queue<byte[]> queue, int i) {
        byte[] bArr = new byte[i];
        int i2 = i;
        while (i2 > 0) {
            byte[] remove = queue.remove();
            int min = Math.min(i2, remove.length);
            System.arraycopy(remove, 0, bArr, i - i2, min);
            i2 -= min;
        }
        return bArr;
    }
}
