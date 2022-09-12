package defpackage;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
/* compiled from: PG */
/* renamed from: cvgq  reason: default package */
/* loaded from: classes5.dex */
public final class cvgq extends cvgs {
    private final byte[] f;
    private final byte[] g;

    public cvgq(int i, byte[] bArr, byte[] bArr2) {
        super(i, bArr, bArr2);
        this.f = new byte[512];
        this.g = new byte[512];
    }

    private final byte b() {
        int i = this.e;
        if (i == 0) {
            for (int i2 = 0; i2 < 32; i2++) {
                long j = this.d;
                this.d = 1 + j;
                int i3 = 0;
                while (j != 0) {
                    this.f[(i2 * 16) + i3] = (byte) (255 & j);
                    j >>= 8;
                    i3++;
                }
            }
            try {
                this.c.doFinal(this.f, 0, 512, this.g);
                i = 512;
            } catch (BadPaddingException e) {
                throw new RuntimeException("BadPaddingException in ECB mode", e);
            } catch (IllegalBlockSizeException e2) {
                throw new RuntimeException("Illegal block size when exact block size used", e2);
            } catch (ShortBufferException e3) {
                throw new RuntimeException("Short buffer exception", e3);
            }
        }
        int i4 = i - 1;
        this.e = i4;
        return this.g[i4];
    }

    @Override // defpackage.cvgs
    public final long a() {
        long b = b() & this.b;
        for (int i = this.a - 2; i >= 0; i--) {
            b = (b << 8) | (b() & 255);
        }
        return b;
    }
}
