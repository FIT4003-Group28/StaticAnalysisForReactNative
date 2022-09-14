package defpackage;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
/* compiled from: PG */
/* renamed from: cvgr  reason: default package */
/* loaded from: classes5.dex */
public final class cvgr extends cvgs {
    private final byte[] f;
    private final byte[] g;

    public cvgr(int i, byte[] bArr, byte[] bArr2) {
        super(i, bArr, bArr2);
        this.f = new byte[2048];
        this.g = new byte[2048];
    }

    private final byte b() {
        if (this.e == 0) {
            c();
        }
        byte[] bArr = this.g;
        int i = this.e - 1;
        this.e = i;
        return bArr[i];
    }

    private final void c() {
        for (int i = 0; i < 128; i++) {
            long j = this.d;
            this.d = 1 + j;
            int i2 = (((((159 - i) / 32) - 1) * 32) + (i % 32)) * 16;
            int i3 = 0;
            while (j != 0) {
                this.f[i2 + i3] = (byte) (255 & j);
                j >>= 8;
                i3++;
            }
        }
        try {
            this.c.doFinal(this.f, 0, 2048, this.g);
            this.e = 2048;
        } catch (BadPaddingException e) {
            throw new RuntimeException("BadPaddingException in ECB mode", e);
        } catch (IllegalBlockSizeException e2) {
            throw new RuntimeException("Illegal block size when exact block size used", e2);
        } catch (ShortBufferException e3) {
            throw new RuntimeException("Short buffer exception", e3);
        }
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
