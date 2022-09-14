package org.spongycastle.crypto.modes;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.SkippingStreamCipher;
import org.spongycastle.crypto.StreamBlockCipher;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Pack;
/* loaded from: classes.dex */
public class SICBlockCipher extends StreamBlockCipher implements SkippingStreamCipher {
    private byte[] IV;
    private final int blockSize;
    private int byteCount;
    private final BlockCipher cipher;
    private byte[] counter;
    private byte[] counterOut;

    public SICBlockCipher(BlockCipher blockCipher) {
        super(blockCipher);
        this.cipher = blockCipher;
        this.blockSize = this.cipher.getBlockSize();
        this.IV = new byte[this.blockSize];
        this.counter = new byte[this.blockSize];
        this.counterOut = new byte[this.blockSize];
        this.byteCount = 0;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.IV = Arrays.clone(parametersWithIV.getIV());
            if (this.blockSize < this.IV.length) {
                throw new IllegalArgumentException("CTR/SIC mode requires IV no greater than: " + this.blockSize + " bytes.");
            }
            int i = 8;
            if (8 > this.blockSize / 2) {
                i = this.blockSize / 2;
            }
            if (this.blockSize - this.IV.length > i) {
                throw new IllegalArgumentException("CTR/SIC mode requires IV of at least: " + (this.blockSize - i) + " bytes.");
            }
            if (parametersWithIV.getParameters() != null) {
                this.cipher.init(true, parametersWithIV.getParameters());
            }
            reset();
            return;
        }
        throw new IllegalArgumentException("CTR/SIC mode requires ParametersWithIV");
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/SIC";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        processBytes(bArr, i, this.blockSize, bArr2, i2);
        return this.blockSize;
    }

    @Override // org.spongycastle.crypto.StreamBlockCipher
    protected byte calculateByte(byte b2) {
        if (this.byteCount == 0) {
            this.cipher.processBlock(this.counter, 0, this.counterOut, 0);
            byte[] bArr = this.counterOut;
            int i = this.byteCount;
            this.byteCount = i + 1;
            return (byte) (b2 ^ bArr[i]);
        }
        byte[] bArr2 = this.counterOut;
        int i2 = this.byteCount;
        this.byteCount = i2 + 1;
        byte b3 = (byte) (b2 ^ bArr2[i2]);
        if (this.byteCount == this.counter.length) {
            this.byteCount = 0;
            incrementCounterAt(0);
            checkCounter();
        }
        return b3;
    }

    private void checkCounter() {
        if (this.IV.length < this.blockSize) {
            for (int i = 0; i != this.IV.length; i++) {
                if (this.counter[i] != this.IV[i]) {
                    throw new IllegalStateException("Counter in CTR/SIC mode out of range.");
                }
            }
        }
    }

    private void incrementCounterAt(int i) {
        byte b2;
        int length = this.counter.length - i;
        do {
            length--;
            if (length < 0) {
                return;
            }
            byte[] bArr = this.counter;
            b2 = (byte) (bArr[length] + 1);
            bArr[length] = b2;
        } while (b2 == 0);
    }

    private void incrementCounter(int i) {
        byte b2 = this.counter[this.counter.length - 1];
        byte[] bArr = this.counter;
        int length = this.counter.length - 1;
        bArr[length] = (byte) (bArr[length] + i);
        if (b2 == 0 || this.counter[this.counter.length - 1] >= b2) {
            return;
        }
        incrementCounterAt(1);
    }

    private void decrementCounterAt(int i) {
        byte[] bArr;
        byte b2;
        int length = this.counter.length - i;
        do {
            length--;
            if (length < 0) {
                return;
            }
            b2 = (byte) (bArr[length] - 1);
            this.counter[length] = b2;
        } while (b2 == -1);
    }

    private void adjustCounter(long j) {
        long j2;
        long j3;
        int i = 5;
        if (j >= 0) {
            long j4 = (this.byteCount + j) / this.blockSize;
            if (j4 > 255) {
                j3 = j4;
                while (i >= 1) {
                    long j5 = 1 << (i * 8);
                    while (j3 >= j5) {
                        incrementCounterAt(i);
                        j3 -= j5;
                    }
                    i--;
                }
            } else {
                j3 = j4;
            }
            incrementCounter((int) j3);
            this.byteCount = (int) ((j + this.byteCount) - (this.blockSize * j4));
            return;
        }
        long j6 = ((-j) - this.byteCount) / this.blockSize;
        if (j6 > 255) {
            j2 = j6;
            while (i >= 1) {
                long j7 = 1 << (i * 8);
                while (j2 > j7) {
                    decrementCounterAt(i);
                    j2 -= j7;
                }
                i--;
            }
        } else {
            j2 = j6;
        }
        for (long j8 = 0; j8 != j2; j8++) {
            decrementCounterAt(0);
        }
        int i2 = (int) (this.byteCount + j + (this.blockSize * j6));
        if (i2 >= 0) {
            this.byteCount = 0;
            return;
        }
        decrementCounterAt(0);
        this.byteCount = this.blockSize + i2;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
        Arrays.fill(this.counter, (byte) 0);
        System.arraycopy(this.IV, 0, this.counter, 0, this.IV.length);
        this.cipher.reset();
        this.byteCount = 0;
    }

    @Override // org.spongycastle.crypto.SkippingCipher
    public long skip(long j) {
        adjustCounter(j);
        checkCounter();
        this.cipher.processBlock(this.counter, 0, this.counterOut, 0);
        return j;
    }

    @Override // org.spongycastle.crypto.SkippingCipher
    public long seekTo(long j) {
        reset();
        return skip(j);
    }

    @Override // org.spongycastle.crypto.SkippingCipher
    public long getPosition() {
        int i;
        byte[] bArr = new byte[this.counter.length];
        System.arraycopy(this.counter, 0, bArr, 0, bArr.length);
        for (int length = bArr.length - 1; length >= 1; length--) {
            if (length < this.IV.length) {
                i = (bArr[length] & 255) - (this.IV[length] & 255);
            } else {
                i = bArr[length] & 255;
            }
            if (i < 0) {
                int i2 = length - 1;
                bArr[i2] = (byte) (bArr[i2] - 1);
                i += 256;
            }
            bArr[length] = (byte) i;
        }
        return (Pack.bigEndianToLong(bArr, bArr.length - 8) * this.blockSize) + this.byteCount;
    }
}
