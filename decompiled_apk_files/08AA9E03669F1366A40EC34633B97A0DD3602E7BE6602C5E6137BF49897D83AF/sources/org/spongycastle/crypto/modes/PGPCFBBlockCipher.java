package org.spongycastle.crypto.modes;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.params.ParametersWithIV;
/* loaded from: classes.dex */
public class PGPCFBBlockCipher implements BlockCipher {
    private byte[] FR;
    private byte[] FRE;
    private byte[] IV;
    private int blockSize;
    private BlockCipher cipher;
    private int count;
    private boolean forEncryption;
    private boolean inlineIv;
    private byte[] tmp;

    public PGPCFBBlockCipher(BlockCipher blockCipher, boolean z) {
        this.cipher = blockCipher;
        this.inlineIv = z;
        this.blockSize = blockCipher.getBlockSize();
        this.IV = new byte[this.blockSize];
        this.FR = new byte[this.blockSize];
        this.FRE = new byte[this.blockSize];
        this.tmp = new byte[this.blockSize];
    }

    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        if (this.inlineIv) {
            return this.cipher.getAlgorithmName() + "/PGPCFBwithIV";
        }
        return this.cipher.getAlgorithmName() + "/PGPCFB";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        return this.inlineIv ? this.forEncryption ? encryptBlockWithIV(bArr, i, bArr2, i2) : decryptBlockWithIV(bArr, i, bArr2, i2) : this.forEncryption ? encryptBlock(bArr, i, bArr2, i2) : decryptBlock(bArr, i, bArr2, i2);
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
        this.count = 0;
        for (int i = 0; i != this.FR.length; i++) {
            if (this.inlineIv) {
                this.FR[i] = 0;
            } else {
                this.FR[i] = this.IV[i];
            }
        }
        this.cipher.reset();
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        this.forEncryption = z;
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv = parametersWithIV.getIV();
            if (iv.length < this.IV.length) {
                System.arraycopy(iv, 0, this.IV, this.IV.length - iv.length, iv.length);
                for (int i = 0; i < this.IV.length - iv.length; i++) {
                    this.IV[i] = 0;
                }
            } else {
                System.arraycopy(iv, 0, this.IV, 0, this.IV.length);
            }
            reset();
            this.cipher.init(true, parametersWithIV.getParameters());
            return;
        }
        reset();
        this.cipher.init(true, cipherParameters);
    }

    private byte encryptByte(byte b2, int i) {
        return (byte) (b2 ^ this.FRE[i]);
    }

    private int encryptBlockWithIV(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.blockSize + i > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (this.count == 0) {
            if ((this.blockSize * 2) + i2 + 2 > bArr2.length) {
                throw new DataLengthException("output buffer too short");
            }
            this.cipher.processBlock(this.FR, 0, this.FRE, 0);
            for (int i3 = 0; i3 < this.blockSize; i3++) {
                bArr2[i2 + i3] = encryptByte(this.IV[i3], i3);
            }
            System.arraycopy(bArr2, i2, this.FR, 0, this.blockSize);
            this.cipher.processBlock(this.FR, 0, this.FRE, 0);
            bArr2[this.blockSize + i2] = encryptByte(this.IV[this.blockSize - 2], 0);
            bArr2[this.blockSize + i2 + 1] = encryptByte(this.IV[this.blockSize - 1], 1);
            System.arraycopy(bArr2, i2 + 2, this.FR, 0, this.blockSize);
            this.cipher.processBlock(this.FR, 0, this.FRE, 0);
            for (int i4 = 0; i4 < this.blockSize; i4++) {
                bArr2[this.blockSize + i2 + 2 + i4] = encryptByte(bArr[i + i4], i4);
            }
            System.arraycopy(bArr2, i2 + this.blockSize + 2, this.FR, 0, this.blockSize);
            this.count += (this.blockSize * 2) + 2;
            return (this.blockSize * 2) + 2;
        }
        if (this.count >= this.blockSize + 2) {
            if (this.blockSize + i2 > bArr2.length) {
                throw new DataLengthException("output buffer too short");
            }
            this.cipher.processBlock(this.FR, 0, this.FRE, 0);
            for (int i5 = 0; i5 < this.blockSize; i5++) {
                bArr2[i2 + i5] = encryptByte(bArr[i + i5], i5);
            }
            System.arraycopy(bArr2, i2, this.FR, 0, this.blockSize);
        }
        return this.blockSize;
    }

    private int decryptBlockWithIV(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.blockSize + i > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (this.blockSize + i2 > bArr2.length) {
            throw new DataLengthException("output buffer too short");
        }
        if (this.count == 0) {
            for (int i3 = 0; i3 < this.blockSize; i3++) {
                this.FR[i3] = bArr[i + i3];
            }
            this.cipher.processBlock(this.FR, 0, this.FRE, 0);
            this.count += this.blockSize;
            return 0;
        } else if (this.count == this.blockSize) {
            System.arraycopy(bArr, i, this.tmp, 0, this.blockSize);
            System.arraycopy(this.FR, 2, this.FR, 0, this.blockSize - 2);
            this.FR[this.blockSize - 2] = this.tmp[0];
            this.FR[this.blockSize - 1] = this.tmp[1];
            this.cipher.processBlock(this.FR, 0, this.FRE, 0);
            for (int i4 = 0; i4 < this.blockSize - 2; i4++) {
                bArr2[i2 + i4] = encryptByte(this.tmp[i4 + 2], i4);
            }
            System.arraycopy(this.tmp, 2, this.FR, 0, this.blockSize - 2);
            this.count += 2;
            return this.blockSize - 2;
        } else {
            if (this.count >= this.blockSize + 2) {
                System.arraycopy(bArr, i, this.tmp, 0, this.blockSize);
                bArr2[i2 + 0] = encryptByte(this.tmp[0], this.blockSize - 2);
                bArr2[i2 + 1] = encryptByte(this.tmp[1], this.blockSize - 1);
                System.arraycopy(this.tmp, 0, this.FR, this.blockSize - 2, 2);
                this.cipher.processBlock(this.FR, 0, this.FRE, 0);
                for (int i5 = 0; i5 < this.blockSize - 2; i5++) {
                    bArr2[i2 + i5 + 2] = encryptByte(this.tmp[i5 + 2], i5);
                }
                System.arraycopy(this.tmp, 2, this.FR, 0, this.blockSize - 2);
            }
            return this.blockSize;
        }
    }

    private int encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.blockSize + i > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (this.blockSize + i2 > bArr2.length) {
            throw new DataLengthException("output buffer too short");
        }
        this.cipher.processBlock(this.FR, 0, this.FRE, 0);
        for (int i3 = 0; i3 < this.blockSize; i3++) {
            bArr2[i2 + i3] = encryptByte(bArr[i + i3], i3);
        }
        for (int i4 = 0; i4 < this.blockSize; i4++) {
            this.FR[i4] = bArr2[i2 + i4];
        }
        return this.blockSize;
    }

    private int decryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.blockSize + i > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (this.blockSize + i2 > bArr2.length) {
            throw new DataLengthException("output buffer too short");
        }
        this.cipher.processBlock(this.FR, 0, this.FRE, 0);
        for (int i3 = 0; i3 < this.blockSize; i3++) {
            bArr2[i2 + i3] = encryptByte(bArr[i + i3], i3);
        }
        for (int i4 = 0; i4 < this.blockSize; i4++) {
            this.FR[i4] = bArr[i + i4];
        }
        return this.blockSize;
    }
}
