package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: dxet  reason: default package */
/* loaded from: classes6.dex */
public final class dxet {
    public static final void a(int i, InputStream inputStream, OutputStream outputStream, byte[] bArr) {
        while (i > 0) {
            int read = inputStream.read(bArr, 0, Math.min(bArr.length, i));
            if (read != -1) {
                outputStream.write(bArr, 0, read);
                i -= read;
            } else {
                throw new EOFException("cannot read " + i);
            }
        }
    }

    public static final void b(long j, int i, dxes dxesVar, OutputStream outputStream, ByteBuffer byteBuffer) {
        int i2;
        dxesVar.a(j);
        while (i > 0) {
            byteBuffer.clear().limit(Math.min(byteBuffer.capacity(), i));
            if (!dxesVar.a.hasRemaining()) {
                i2 = -1;
            } else {
                i2 = 0;
                while (dxesVar.a.hasRemaining() && byteBuffer.hasRemaining()) {
                    byteBuffer.put(dxesVar.a.get());
                    i2++;
                }
            }
            if (i2 != -1) {
                outputStream.write(byteBuffer.array(), 0, i2);
                i -= i2;
            } else {
                throw new EOFException("in copy " + j + " " + i);
            }
        }
    }
}
