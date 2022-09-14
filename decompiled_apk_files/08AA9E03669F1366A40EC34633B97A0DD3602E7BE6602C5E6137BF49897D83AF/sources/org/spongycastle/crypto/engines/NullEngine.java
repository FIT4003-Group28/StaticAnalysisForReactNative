package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;
/* loaded from: classes.dex */
public class NullEngine implements BlockCipher {
    protected static final int DEFAULT_BLOCK_SIZE = 1;
    private final int blockSize;
    private boolean initialised;

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Null";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
    }

    public NullEngine() {
        this(1);
    }

    public NullEngine(int i) {
        this.blockSize = i;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        this.initialised = true;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.blockSize;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (!this.initialised) {
            throw new IllegalStateException("Null engine not initialised");
        }
        if (this.blockSize + i > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (this.blockSize + i2 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        for (int i3 = 0; i3 < this.blockSize; i3++) {
            bArr2[i2 + i3] = bArr[i + i3];
        }
        return this.blockSize;
    }
}
