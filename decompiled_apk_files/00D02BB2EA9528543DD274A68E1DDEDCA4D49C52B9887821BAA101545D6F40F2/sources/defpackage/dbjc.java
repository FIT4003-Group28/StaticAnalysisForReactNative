package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: dbjc  reason: default package */
/* loaded from: classes5.dex */
public final class dbjc {
    public static ByteBuffer a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read > 0) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        byteArrayOutputStream.flush();
                        return ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
                    }
                }
            } catch (IOException e) {
                if (String.valueOf(e.getMessage()).length() != 0) {
                    return null;
                }
                new String("Failed to read stream - ");
            }
        }
        return null;
    }

    public static byte[] b(ByteBuffer byteBuffer) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        int limit = byteBuffer.limit();
        while (byteBuffer.position() < limit) {
            int position = byteBuffer.position();
            byteBuffer.get(bArr, 0, Math.min(8192, limit - position));
            byteArrayOutputStream.write(bArr, 0, byteBuffer.position() - position);
        }
        byteArrayOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }
}
