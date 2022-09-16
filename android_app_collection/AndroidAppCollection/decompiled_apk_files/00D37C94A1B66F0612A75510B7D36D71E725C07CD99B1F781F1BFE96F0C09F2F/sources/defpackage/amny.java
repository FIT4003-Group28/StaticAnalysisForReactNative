package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: PG */
/* renamed from: amny  reason: default package */
/* loaded from: classes.dex */
public final class amny {
    public byte[] a;
    public int b = 0;
    private int c = 1;
    private int d = 16;
    private ByteOrder e;

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a5, code lost:
        throw new java.io.IOException("Unsupported bits per sample in WAV file.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.amny a(java.io.InputStream r11) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amny.a(java.io.InputStream):amny");
    }

    private final int b(InputStream inputStream) {
        return ByteBuffer.wrap(d(inputStream, 4)).order(this.e).getInt();
    }

    private final int c(InputStream inputStream) {
        return ByteBuffer.wrap(d(inputStream, 2)).order(this.e).getShort();
    }

    private static byte[] d(InputStream inputStream, int i) {
        if (i >= 0) {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read == -1) {
                    throw new IOException("Unexpected end of file while reading WAV file.");
                }
                i2 += read;
            }
            return bArr;
        }
        throw new IOException("Invalid negative data length in WAV file.");
    }

    private static String e(InputStream inputStream) {
        return new String(d(inputStream, 4));
    }
}
