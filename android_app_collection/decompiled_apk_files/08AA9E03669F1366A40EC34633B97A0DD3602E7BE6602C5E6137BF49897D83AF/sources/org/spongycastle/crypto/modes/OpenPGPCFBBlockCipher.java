package org.spongycastle.crypto.modes;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
/* loaded from: classes.dex */
public class OpenPGPCFBBlockCipher implements BlockCipher {
    private byte[] FR;
    private byte[] FRE;
    private byte[] IV;
    private int blockSize;
    private BlockCipher cipher;
    private int count;
    private boolean forEncryption;

    public OpenPGPCFBBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
        this.blockSize = blockCipher.getBlockSize();
        this.IV = new byte[this.blockSize];
        this.FR = new byte[this.blockSize];
        this.FRE = new byte[this.blockSize];
    }

    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/OpenPGPCFB";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        return this.forEncryption ? encryptBlock(bArr, i, bArr2, i2) : decryptBlock(bArr, i, bArr2, i2);
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
        this.count = 0;
        System.arraycopy(this.IV, 0, this.FR, 0, this.FR.length);
        this.cipher.reset();
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        this.forEncryption = z;
        reset();
        this.cipher.init(true, cipherParameters);
    }

    private byte encryptByte(byte b2, int i) {
        return (byte) (b2 ^ this.FRE[i]);
    }

    private int encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.blockSize + i > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (this.blockSize + i2 > bArr2.length) {
            throw new DataLengthException("output buffer too short");
        }
        int i3 = 2;
        if (this.count > this.blockSize) {
            byte encryptByte = encryptByte(bArr[i], this.blockSize - 2);
            bArr2[i2] = encryptByte;
            this.FR[this.blockSize - 2] = encryptByte;
            byte encryptByte2 = encryptByte(bArr[i + 1], this.blockSize - 1);
            bArr2[i2 + 1] = encryptByte2;
            this.FR[this.blockSize - 1] = encryptByte2;
            this.cipher.processBlock(this.FR, 0, this.FRE, 0);
            while (i3 < this.blockSize) {
                byte[] bArr3 = this.FR;
                int i4 = i3 - 2;
                byte encryptByte3 = encryptByte(bArr[i + i3], i4);
                bArr2[i2 + i3] = encryptByte3;
                bArr3[i4] = encryptByte3;
                i3++;
            }
        } else if (this.count == 0) {
            this.cipher.processBlock(this.FR, 0, this.FRE, 0);
            for (int i5 = 0; i5 < this.blockSize; i5++) {
                byte[] bArr4 = this.FR;
                byte encryptByte4 = encryptByte(bArr[i + i5], i5);
                bArr2[i2 + i5] = encryptByte4;
                bArr4[i5] = encryptByte4;
            }
            this.count += this.blockSize;
        } else if (this.count == this.blockSize) {
            this.cipher.processBlock(this.FR, 0, this.FRE, 0);
            bArr2[i2] = encryptByte(bArr[i], 0);
            bArr2[i2 + 1] = encryptByte(bArr[i + 1], 1);
            System.arraycopy(this.FR, 2, this.FR, 0, this.blockSize - 2);
            System.arraycopy(bArr2, i2, this.FR, this.blockSize - 2, 2);
            this.cipher.processBlock(this.FR, 0, this.FRE, 0);
            while (i3 < this.blockSize) {
                byte[] bArr5 = this.FR;
                int i6 = i3 - 2;
                byte encryptByte5 = encryptByte(bArr[i + i3], i6);
                bArr2[i2 + i3] = encryptByte5;
                bArr5[i6] = encryptByte5;
                i3++;
            }
            this.count += this.blockSize;
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
        int i3 = 2;
        if (this.count > this.blockSize) {
            byte b2 = bArr[i];
            this.FR[this.blockSize - 2] = b2;
            bArr2[i2] = encryptByte(b2, this.blockSize - 2);
            byte b3 = bArr[i + 1];
            this.FR[this.blockSize - 1] = b3;
            bArr2[i2 + 1] = encryptByte(b3, this.blockSize - 1);
            this.cipher.processBlock(this.FR, 0, this.FRE, 0);
            while (i3 < this.blockSize) {
                byte b4 = bArr[i + i3];
                int i4 = i3 - 2;
                this.FR[i4] = b4;
                bArr2[i2 + i3] = encryptByte(b4, i4);
                i3++;
            }
        } else if (this.count == 0) {
            this.cipher.processBlock(this.FR, 0, this.FRE, 0);
            for (int i5 = 0; i5 < this.blockSize; i5++) {
                int i6 = i + i5;
                this.FR[i5] = bArr[i6];
                bArr2[i5] = encryptByte(bArr[i6], i5);
            }
            this.count += this.blockSize;
        } else if (this.count == this.blockSize) {
            this.cipher.processBlock(this.FR, 0, this.FRE, 0);
            byte b5 = bArr[i];
            byte b6 = bArr[i + 1];
            bArr2[i2] = encryptByte(b5, 0);
            bArr2[i2 + 1] = encryptByte(b6, 1);
            System.arraycopy(this.FR, 2, this.FR, 0, this.blockSize - 2);
            this.FR[this.blockSize - 2] = b5;
            this.FR[this.blockSize - 1] = b6;
            this.cipher.processBlock(this.FR, 0, this.FRE, 0);
            while (i3 < this.blockSize) {
                byte b7 = bArr[i + i3];
                int i7 = i3 - 2;
                this.FR[i7] = b7;
                bArr2[i2 + i3] = encryptByte(b7, i7);
                i3++;
            }
            this.count += this.blockSize;
        }
        return this.blockSize;
    }
}
