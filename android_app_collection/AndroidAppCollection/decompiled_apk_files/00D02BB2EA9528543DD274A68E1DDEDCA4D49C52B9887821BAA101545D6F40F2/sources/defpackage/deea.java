package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.GZIPInputStream;
/* compiled from: PG */
/* renamed from: deea  reason: default package */
/* loaded from: classes6.dex */
public final class deea {
    public static byte[] a(byte[] bArr, int i, int i2) {
        int read;
        int i3 = (i + i2) - 4;
        int i4 = i2 < 4 ? 0 : ((bArr[i3 + 3] & 255) << 24) + ((bArr[i3 + 2] & 255) << 16) + ((bArr[i3 + 1] & 255) << 8) + (bArr[i3] & 255);
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr, i, i2), Math.min(Math.max(i4, i2) + 10, 8192));
            if (i4 > 10000000) {
                byte[] b = ddak.b(gZIPInputStream);
                gZIPInputStream.close();
                return b;
            }
            byte[] bArr2 = new byte[i4];
            int i5 = 0;
            while (i5 < i4 && (read = gZIPInputStream.read(bArr2, i5, i4 - i5)) != -1) {
                i5 += read;
            }
            if (i5 < i4) {
                byte[] copyOf = Arrays.copyOf(bArr2, i5);
                gZIPInputStream.close();
                return copyOf;
            }
            int read2 = gZIPInputStream.read();
            if (read2 == -1) {
                gZIPInputStream.close();
                return bArr2;
            }
            byte[] b2 = deca.b(bArr2, new byte[]{(byte) read2}, ddak.b(gZIPInputStream));
            gZIPInputStream.close();
            return b2;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
