package org.spongycastle.crypto.digests;

import org.spongycastle.crypto.ExtendedDigest;
import org.spongycastle.util.Memoable;
import org.spongycastle.util.Pack;
/* loaded from: classes.dex */
public abstract class GeneralDigest implements ExtendedDigest, Memoable {
    private static final int BYTE_LENGTH = 64;
    private long byteCount;
    private final byte[] xBuf;
    private int xBufOff;

    @Override // org.spongycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 64;
    }

    protected abstract void processBlock();

    protected abstract void processLength(long j);

    protected abstract void processWord(byte[] bArr, int i);

    /* JADX INFO: Access modifiers changed from: protected */
    public GeneralDigest() {
        this.xBuf = new byte[4];
        this.xBufOff = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public GeneralDigest(GeneralDigest generalDigest) {
        this.xBuf = new byte[4];
        copyIn(generalDigest);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public GeneralDigest(byte[] bArr) {
        this.xBuf = new byte[4];
        System.arraycopy(bArr, 0, this.xBuf, 0, this.xBuf.length);
        this.xBufOff = Pack.bigEndianToInt(bArr, 4);
        this.byteCount = Pack.bigEndianToLong(bArr, 8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void copyIn(GeneralDigest generalDigest) {
        System.arraycopy(generalDigest.xBuf, 0, this.xBuf, 0, generalDigest.xBuf.length);
        this.xBufOff = generalDigest.xBufOff;
        this.byteCount = generalDigest.byteCount;
    }

    @Override // org.spongycastle.crypto.Digest
    public void update(byte b2) {
        byte[] bArr = this.xBuf;
        int i = this.xBufOff;
        this.xBufOff = i + 1;
        bArr[i] = b2;
        if (this.xBufOff == this.xBuf.length) {
            processWord(this.xBuf, 0);
            this.xBufOff = 0;
        }
        this.byteCount++;
    }

    @Override // org.spongycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
        int i3 = 0;
        int max = Math.max(0, i2);
        if (this.xBufOff != 0) {
            int i4 = 0;
            while (true) {
                if (i4 >= max) {
                    i3 = i4;
                    break;
                }
                byte[] bArr2 = this.xBuf;
                int i5 = this.xBufOff;
                this.xBufOff = i5 + 1;
                int i6 = i4 + 1;
                bArr2[i5] = bArr[i4 + i];
                if (this.xBufOff == 4) {
                    processWord(this.xBuf, 0);
                    this.xBufOff = 0;
                    i3 = i6;
                    break;
                }
                i4 = i6;
            }
        }
        int i7 = ((max - i3) & (-4)) + i3;
        while (i3 < i7) {
            processWord(bArr, i + i3);
            i3 += 4;
        }
        while (i3 < max) {
            byte[] bArr3 = this.xBuf;
            int i8 = this.xBufOff;
            this.xBufOff = i8 + 1;
            bArr3[i8] = bArr[i3 + i];
            i3++;
        }
        this.byteCount += max;
    }

    public void finish() {
        long j = this.byteCount << 3;
        update(Byte.MIN_VALUE);
        while (this.xBufOff != 0) {
            update((byte) 0);
        }
        processLength(j);
        processBlock();
    }

    @Override // org.spongycastle.crypto.Digest
    public void reset() {
        this.byteCount = 0L;
        this.xBufOff = 0;
        for (int i = 0; i < this.xBuf.length; i++) {
            this.xBuf[i] = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void populateState(byte[] bArr) {
        System.arraycopy(this.xBuf, 0, bArr, 0, this.xBufOff);
        Pack.intToBigEndian(this.xBufOff, bArr, 4);
        Pack.longToBigEndian(this.byteCount, bArr, 8);
    }
}
