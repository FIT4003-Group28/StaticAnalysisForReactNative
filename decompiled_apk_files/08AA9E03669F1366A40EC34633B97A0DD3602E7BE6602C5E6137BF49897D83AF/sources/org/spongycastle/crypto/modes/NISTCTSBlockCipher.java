package org.spongycastle.crypto.modes;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.BufferedBlockCipher;
import org.spongycastle.crypto.DataLengthException;
/* loaded from: classes.dex */
public class NISTCTSBlockCipher extends BufferedBlockCipher {
    public static final int CS1 = 1;
    public static final int CS2 = 2;
    public static final int CS3 = 3;
    private final int blockSize;
    private final int type;

    public NISTCTSBlockCipher(int i, BlockCipher blockCipher) {
        this.type = i;
        this.cipher = new CBCBlockCipher(blockCipher);
        this.blockSize = blockCipher.getBlockSize();
        this.buf = new byte[this.blockSize * 2];
        this.bufOff = 0;
    }

    @Override // org.spongycastle.crypto.BufferedBlockCipher
    public int getUpdateOutputSize(int i) {
        int i2 = i + this.bufOff;
        int length = i2 % this.buf.length;
        return length == 0 ? i2 - this.buf.length : i2 - length;
    }

    @Override // org.spongycastle.crypto.BufferedBlockCipher
    public int getOutputSize(int i) {
        return i + this.bufOff;
    }

    @Override // org.spongycastle.crypto.BufferedBlockCipher
    public int processByte(byte b2, byte[] bArr, int i) {
        int i2;
        if (this.bufOff == this.buf.length) {
            i2 = this.cipher.processBlock(this.buf, 0, bArr, i);
            System.arraycopy(this.buf, this.blockSize, this.buf, 0, this.blockSize);
            this.bufOff = this.blockSize;
        } else {
            i2 = 0;
        }
        byte[] bArr2 = this.buf;
        int i3 = this.bufOff;
        this.bufOff = i3 + 1;
        bArr2[i3] = b2;
        return i2;
    }

    @Override // org.spongycastle.crypto.BufferedBlockCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int blockSize = getBlockSize();
        int updateOutputSize = getUpdateOutputSize(i2);
        if (updateOutputSize > 0 && updateOutputSize + i3 > bArr2.length) {
            throw new DataLengthException("output buffer too short");
        }
        int length = this.buf.length - this.bufOff;
        int i4 = 0;
        if (i2 > length) {
            System.arraycopy(bArr, i, this.buf, this.bufOff, length);
            int processBlock = this.cipher.processBlock(this.buf, 0, bArr2, i3) + 0;
            System.arraycopy(this.buf, blockSize, this.buf, 0, blockSize);
            this.bufOff = blockSize;
            i2 -= length;
            i += length;
            while (i2 > blockSize) {
                System.arraycopy(bArr, i, this.buf, this.bufOff, blockSize);
                processBlock += this.cipher.processBlock(this.buf, 0, bArr2, i3 + processBlock);
                System.arraycopy(this.buf, blockSize, this.buf, 0, blockSize);
                i2 -= blockSize;
                i += blockSize;
            }
            i4 = processBlock;
        }
        System.arraycopy(bArr, i, this.buf, this.bufOff, i2);
        this.bufOff += i2;
        return i4;
    }

    @Override // org.spongycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] bArr, int i) {
        if (this.bufOff + i > bArr.length) {
            throw new DataLengthException("output buffer to small in doFinal");
        }
        int blockSize = this.cipher.getBlockSize();
        int i2 = this.bufOff - blockSize;
        byte[] bArr2 = new byte[blockSize];
        if (this.forEncryption) {
            if (this.bufOff < blockSize) {
                throw new DataLengthException("need at least one block of input for NISTCTS");
            }
            if (this.bufOff > blockSize) {
                byte[] bArr3 = new byte[blockSize];
                if (this.type == 2 || this.type == 3) {
                    this.cipher.processBlock(this.buf, 0, bArr2, 0);
                    System.arraycopy(this.buf, blockSize, bArr3, 0, i2);
                    this.cipher.processBlock(bArr3, 0, bArr3, 0);
                    if (this.type == 2 && i2 == blockSize) {
                        System.arraycopy(bArr2, 0, bArr, i, blockSize);
                        System.arraycopy(bArr3, 0, bArr, i + blockSize, i2);
                    } else {
                        System.arraycopy(bArr3, 0, bArr, i, blockSize);
                        System.arraycopy(bArr2, 0, bArr, i + blockSize, i2);
                    }
                } else {
                    System.arraycopy(this.buf, 0, bArr2, 0, blockSize);
                    this.cipher.processBlock(bArr2, 0, bArr2, 0);
                    System.arraycopy(bArr2, 0, bArr, i, i2);
                    System.arraycopy(this.buf, this.bufOff - i2, bArr3, 0, i2);
                    this.cipher.processBlock(bArr3, 0, bArr3, 0);
                    System.arraycopy(bArr3, 0, bArr, i + i2, blockSize);
                }
            } else {
                this.cipher.processBlock(this.buf, 0, bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i, blockSize);
            }
        } else if (this.bufOff < blockSize) {
            throw new DataLengthException("need at least one block of input for CTS");
        } else {
            byte[] bArr4 = new byte[blockSize];
            if (this.bufOff > blockSize) {
                if (this.type == 3 || (this.type == 2 && (this.buf.length - this.bufOff) % blockSize != 0)) {
                    if (this.cipher instanceof CBCBlockCipher) {
                        ((CBCBlockCipher) this.cipher).getUnderlyingCipher().processBlock(this.buf, 0, bArr2, 0);
                    } else {
                        this.cipher.processBlock(this.buf, 0, bArr2, 0);
                    }
                    for (int i3 = blockSize; i3 != this.bufOff; i3++) {
                        int i4 = i3 - blockSize;
                        bArr4[i4] = (byte) (bArr2[i4] ^ this.buf[i3]);
                    }
                    System.arraycopy(this.buf, blockSize, bArr2, 0, i2);
                    this.cipher.processBlock(bArr2, 0, bArr, i);
                    System.arraycopy(bArr4, 0, bArr, i + blockSize, i2);
                } else {
                    ((CBCBlockCipher) this.cipher).getUnderlyingCipher().processBlock(this.buf, this.bufOff - blockSize, bArr4, 0);
                    System.arraycopy(this.buf, 0, bArr2, 0, blockSize);
                    if (i2 != blockSize) {
                        System.arraycopy(bArr4, i2, bArr2, i2, blockSize - i2);
                    }
                    this.cipher.processBlock(bArr2, 0, bArr2, 0);
                    System.arraycopy(bArr2, 0, bArr, i, blockSize);
                    for (int i5 = 0; i5 != i2; i5++) {
                        bArr4[i5] = (byte) (bArr4[i5] ^ this.buf[i5]);
                    }
                    System.arraycopy(bArr4, 0, bArr, i + blockSize, i2);
                }
            } else {
                this.cipher.processBlock(this.buf, 0, bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i, blockSize);
            }
        }
        int i6 = this.bufOff;
        reset();
        return i6;
    }
}
