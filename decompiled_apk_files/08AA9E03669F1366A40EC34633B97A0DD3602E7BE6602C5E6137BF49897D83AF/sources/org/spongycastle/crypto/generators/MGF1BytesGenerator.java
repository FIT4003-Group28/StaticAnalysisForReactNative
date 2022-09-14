package org.spongycastle.crypto.generators;

import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.DerivationFunction;
import org.spongycastle.crypto.DerivationParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.params.MGFParameters;
/* loaded from: classes.dex */
public class MGF1BytesGenerator implements DerivationFunction {
    private Digest digest;
    private int hLen;
    private byte[] seed;

    public MGF1BytesGenerator(Digest digest) {
        this.digest = digest;
        this.hLen = digest.getDigestSize();
    }

    @Override // org.spongycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        if (!(derivationParameters instanceof MGFParameters)) {
            throw new IllegalArgumentException("MGF parameters required for MGF1Generator");
        }
        this.seed = ((MGFParameters) derivationParameters).getSeed();
    }

    public Digest getDigest() {
        return this.digest;
    }

    private void ItoOSP(int i, byte[] bArr) {
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) (i >>> 0);
    }

    @Override // org.spongycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i, int i2) {
        int i3;
        if (bArr.length - i2 < i) {
            throw new DataLengthException("output buffer too small");
        }
        byte[] bArr2 = new byte[this.hLen];
        byte[] bArr3 = new byte[4];
        this.digest.reset();
        if (i2 > this.hLen) {
            i3 = 0;
            do {
                ItoOSP(i3, bArr3);
                this.digest.update(this.seed, 0, this.seed.length);
                this.digest.update(bArr3, 0, bArr3.length);
                this.digest.doFinal(bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, (this.hLen * i3) + i, this.hLen);
                i3++;
            } while (i3 < i2 / this.hLen);
        } else {
            i3 = 0;
        }
        if (this.hLen * i3 < i2) {
            ItoOSP(i3, bArr3);
            this.digest.update(this.seed, 0, this.seed.length);
            this.digest.update(bArr3, 0, bArr3.length);
            this.digest.doFinal(bArr2, 0);
            System.arraycopy(bArr2, 0, bArr, i + (this.hLen * i3), i2 - (i3 * this.hLen));
        }
        return i2;
    }
}
