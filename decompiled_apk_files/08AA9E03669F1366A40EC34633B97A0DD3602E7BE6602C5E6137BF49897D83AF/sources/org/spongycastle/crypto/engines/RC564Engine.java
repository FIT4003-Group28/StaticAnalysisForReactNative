package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.RC5Parameters;
/* loaded from: classes.dex */
public class RC564Engine implements BlockCipher {
    private static final long P64 = -5196783011329398165L;
    private static final long Q64 = -7046029254386353131L;
    private static final int bytesPerWord = 8;
    private static final int wordSize = 64;
    private boolean forEncryption;
    private int _noRounds = 12;
    private long[] _S = null;

    private long rotateLeft(long j, long j2) {
        long j3 = j2 & 63;
        return (j >>> ((int) (64 - j3))) | (j << ((int) j3));
    }

    private long rotateRight(long j, long j2) {
        long j3 = j2 & 63;
        return (j << ((int) (64 - j3))) | (j >>> ((int) j3));
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "RC5-64";
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
        if (!(cipherParameters instanceof RC5Parameters)) {
            throw new IllegalArgumentException("invalid parameter passed to RC564 init - " + cipherParameters.getClass().getName());
        }
        RC5Parameters rC5Parameters = (RC5Parameters) cipherParameters;
        this.forEncryption = z;
        this._noRounds = rC5Parameters.getRounds();
        setKey(rC5Parameters.getKey());
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        return this.forEncryption ? encryptBlock(bArr, i, bArr2, i2) : decryptBlock(bArr, i, bArr2, i2);
    }

    private void setKey(byte[] bArr) {
        int length;
        long[] jArr = new long[(bArr.length + 7) / 8];
        for (int i = 0; i != bArr.length; i++) {
            int i2 = i / 8;
            jArr[i2] = jArr[i2] + ((bArr[i] & 255) << ((i % 8) * 8));
        }
        this._S = new long[(this._noRounds + 1) * 2];
        this._S[0] = -5196783011329398165L;
        for (int i3 = 1; i3 < this._S.length; i3++) {
            this._S[i3] = this._S[i3 - 1] + Q64;
        }
        if (jArr.length > this._S.length) {
            length = jArr.length * 3;
        } else {
            length = this._S.length * 3;
        }
        long j = 0;
        int i4 = 0;
        long j2 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            long[] jArr2 = this._S;
            j2 = rotateLeft(this._S[i5] + j2 + j, 3L);
            jArr2[i5] = j2;
            j = rotateLeft(jArr[i4] + j2 + j, j + j2);
            jArr[i4] = j;
            i5 = (i5 + 1) % this._S.length;
            i4 = (i4 + 1) % jArr.length;
        }
    }

    private int encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        long bytesToWord = bytesToWord(bArr, i) + this._S[0];
        long bytesToWord2 = bytesToWord(bArr, i + 8) + this._S[1];
        for (int i3 = 1; i3 <= this._noRounds; i3++) {
            int i4 = i3 * 2;
            bytesToWord = rotateLeft(bytesToWord ^ bytesToWord2, bytesToWord2) + this._S[i4];
            bytesToWord2 = rotateLeft(bytesToWord2 ^ bytesToWord, bytesToWord) + this._S[i4 + 1];
        }
        wordToBytes(bytesToWord, bArr2, i2);
        wordToBytes(bytesToWord2, bArr2, i2 + 8);
        return 16;
    }

    private int decryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        long bytesToWord = bytesToWord(bArr, i);
        long bytesToWord2 = bytesToWord(bArr, i + 8);
        for (int i3 = this._noRounds; i3 >= 1; i3--) {
            int i4 = i3 * 2;
            bytesToWord2 = rotateRight(bytesToWord2 - this._S[i4 + 1], bytesToWord) ^ bytesToWord;
            bytesToWord = rotateRight(bytesToWord - this._S[i4], bytesToWord2) ^ bytesToWord2;
        }
        wordToBytes(bytesToWord - this._S[0], bArr2, i2);
        wordToBytes(bytesToWord2 - this._S[1], bArr2, i2 + 8);
        return 16;
    }

    private long bytesToWord(byte[] bArr, int i) {
        long j = 0;
        for (int i2 = 7; i2 >= 0; i2--) {
            j = (j << 8) + (bArr[i2 + i] & 255);
        }
        return j;
    }

    private void wordToBytes(long j, byte[] bArr, int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            bArr[i2 + i] = (byte) j;
            j >>>= 8;
        }
    }
}
