package c.e.a.b.d.f;

import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;
/* loaded from: classes.dex */
public final class h {
    static {
        new g();
    }

    public static InputStream a(InputStream inputStream, long j) {
        return new j(inputStream, 1048577L);
    }

    public static byte[] a(InputStream inputStream) {
        int i;
        e.a(inputStream);
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int i2 = 8192;
        for (int i3 = 0; i3 < 2147483639; i3 = i) {
            byte[] bArr = new byte[Math.min(i2, 2147483639 - i3)];
            arrayDeque.add(bArr);
            i = i3;
            int i4 = 0;
            while (i4 < bArr.length) {
                int read = inputStream.read(bArr, i4, bArr.length - i4);
                if (read == -1) {
                    return a(arrayDeque, i);
                }
                i4 += read;
                i += read;
            }
            i2 = l.a(i2, 2);
        }
        if (inputStream.read() == -1) {
            return a(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    private static byte[] a(Queue<byte[]> queue, int i) {
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
