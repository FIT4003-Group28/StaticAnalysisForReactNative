package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.params.KeyParameter;
/* loaded from: classes.dex */
public class RC6Engine implements BlockCipher {
    private static final int LGW = 5;
    private static final int P32 = -1209970333;
    private static final int Q32 = -1640531527;
    private static final int _noRounds = 20;
    private static final int bytesPerWord = 4;
    private static final int wordSize = 32;
    private int[] _S = null;
    private boolean forEncryption;

    private int rotateLeft(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    private int rotateRight(int i, int i2) {
        return (i << (-i2)) | (i >>> i2);
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "RC6";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("invalid parameter passed to RC6 init - " + cipherParameters.getClass().getName());
        }
        this.forEncryption = z;
        setKey(((KeyParameter) cipherParameters).getKey());
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int blockSize = getBlockSize();
        if (this._S == null) {
            throw new IllegalStateException("RC6 engine not initialised");
        }
        if (i + blockSize > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (blockSize + i2 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.forEncryption) {
            return encryptBlock(bArr, i, bArr2, i2);
        }
        return decryptBlock(bArr, i, bArr2, i2);
    }

    private void setKey(byte[] bArr) {
        int length;
        int length2 = (bArr.length + 3) / 4;
        int[] iArr = new int[((bArr.length + 4) - 1) / 4];
        for (int length3 = bArr.length - 1; length3 >= 0; length3--) {
            int i = length3 / 4;
            iArr[i] = (iArr[i] << 8) + (bArr[length3] & 255);
        }
        this._S = new int[44];
        this._S[0] = P32;
        for (int i2 = 1; i2 < this._S.length; i2++) {
            this._S[i2] = this._S[i2 - 1] + Q32;
        }
        if (iArr.length > this._S.length) {
            length = iArr.length * 3;
        } else {
            length = this._S.length * 3;
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            int[] iArr2 = this._S;
            i4 = rotateLeft(this._S[i3] + i4 + i5, 3);
            iArr2[i3] = i4;
            i5 = rotateLeft(iArr[i6] + i4 + i5, i5 + i4);
            iArr[i6] = i5;
            i3 = (i3 + 1) % this._S.length;
            i6 = (i6 + 1) % iArr.length;
        }
    }

    private int encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int bytesToWord = bytesToWord(bArr, i);
        int bytesToWord2 = bytesToWord(bArr, i + 4);
        int bytesToWord3 = bytesToWord(bArr, i + 8);
        int bytesToWord4 = bytesToWord(bArr, i + 12);
        int i3 = bytesToWord2 + this._S[0];
        int i4 = bytesToWord;
        int i5 = i3;
        int i6 = bytesToWord3;
        int i7 = bytesToWord4 + this._S[1];
        int i8 = 1;
        while (i8 <= 20) {
            int rotateLeft = rotateLeft(((i5 * 2) + 1) * i5, 5);
            int rotateLeft2 = rotateLeft(((i7 * 2) + 1) * i7, 5);
            int i9 = i8 * 2;
            i8++;
            int i10 = i7;
            i7 = rotateLeft(i4 ^ rotateLeft, rotateLeft2) + this._S[i9];
            i4 = i5;
            i5 = rotateLeft(i6 ^ rotateLeft2, rotateLeft) + this._S[i9 + 1];
            i6 = i10;
        }
        int i11 = i4 + this._S[42];
        int i12 = i6 + this._S[43];
        wordToBytes(i11, bArr2, i2);
        wordToBytes(i5, bArr2, i2 + 4);
        wordToBytes(i12, bArr2, i2 + 8);
        wordToBytes(i7, bArr2, i2 + 12);
        return 16;
    }

    private int decryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int bytesToWord = bytesToWord(bArr, i);
        int bytesToWord2 = bytesToWord(bArr, i + 4);
        int bytesToWord3 = bytesToWord(bArr, i + 8);
        int bytesToWord4 = bytesToWord(bArr, i + 12);
        int i3 = bytesToWord3 - this._S[43];
        int i4 = bytesToWord - this._S[42];
        int i5 = 20;
        while (i5 >= 1) {
            int rotateLeft = rotateLeft(((i4 * 2) + 1) * i4, 5);
            int rotateLeft2 = rotateLeft(((i3 * 2) + 1) * i3, 5);
            int i6 = i5 * 2;
            i5--;
            int i7 = i4;
            i4 = rotateRight(bytesToWord4 - this._S[i6], rotateLeft2) ^ rotateLeft;
            bytesToWord4 = i3;
            i3 = rotateRight(bytesToWord2 - this._S[i6 + 1], rotateLeft) ^ rotateLeft2;
            bytesToWord2 = i7;
        }
        int i8 = bytesToWord4 - this._S[1];
        wordToBytes(i4, bArr2, i2);
        wordToBytes(bytesToWord2 - this._S[0], bArr2, i2 + 4);
        wordToBytes(i3, bArr2, i2 + 8);
        wordToBytes(i8, bArr2, i2 + 12);
        return 16;
    }

    private int bytesToWord(byte[] bArr, int i) {
        int i2 = 0;
        for (int i3 = 3; i3 >= 0; i3--) {
            i2 = (i2 << 8) + (bArr[i3 + i] & 255);
        }
        return i2;
    }

    private void wordToBytes(int i, byte[] bArr, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            bArr[i3 + i2] = (byte) i;
            i >>>= 8;
        }
    }
}
