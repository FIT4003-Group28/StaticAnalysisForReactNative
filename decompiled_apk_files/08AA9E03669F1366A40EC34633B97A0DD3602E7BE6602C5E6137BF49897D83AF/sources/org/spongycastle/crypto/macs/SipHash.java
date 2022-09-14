package org.spongycastle.crypto.macs;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.util.Pack;
/* loaded from: classes.dex */
public class SipHash implements Mac {

    /* renamed from: c  reason: collision with root package name */
    protected final int f5659c;

    /* renamed from: d  reason: collision with root package name */
    protected final int f5660d;
    protected long k0;
    protected long k1;
    protected long m;
    protected long v0;
    protected long v1;
    protected long v2;
    protected long v3;
    protected int wordCount;
    protected int wordPos;

    protected static long rotateLeft(long j, int i) {
        return (j >>> (-i)) | (j << i);
    }

    @Override // org.spongycastle.crypto.Mac
    public int getMacSize() {
        return 8;
    }

    public SipHash() {
        this.m = 0L;
        this.wordPos = 0;
        this.wordCount = 0;
        this.f5659c = 2;
        this.f5660d = 4;
    }

    public SipHash(int i, int i2) {
        this.m = 0L;
        this.wordPos = 0;
        this.wordCount = 0;
        this.f5659c = i;
        this.f5660d = i2;
    }

    @Override // org.spongycastle.crypto.Mac
    public String getAlgorithmName() {
        return "SipHash-" + this.f5659c + "-" + this.f5660d;
    }

    @Override // org.spongycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("'params' must be an instance of KeyParameter");
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        if (key.length != 16) {
            throw new IllegalArgumentException("'params' must be a 128-bit key");
        }
        this.k0 = Pack.littleEndianToLong(key, 0);
        this.k1 = Pack.littleEndianToLong(key, 8);
        reset();
    }

    @Override // org.spongycastle.crypto.Mac
    public void update(byte b2) {
        this.m >>>= 8;
        this.m |= (b2 & 255) << 56;
        int i = this.wordPos + 1;
        this.wordPos = i;
        if (i == 8) {
            processMessageWord();
            this.wordPos = 0;
        }
    }

    @Override // org.spongycastle.crypto.Mac
    public void update(byte[] bArr, int i, int i2) {
        int i3 = i2 & (-8);
        int i4 = 0;
        if (this.wordPos == 0) {
            while (i4 < i3) {
                this.m = Pack.littleEndianToLong(bArr, i + i4);
                processMessageWord();
                i4 += 8;
            }
            while (i4 < i2) {
                this.m >>>= 8;
                this.m |= (bArr[i + i4] & 255) << 56;
                i4++;
            }
            this.wordPos = i2 - i3;
            return;
        }
        int i5 = this.wordPos << 3;
        int i6 = 0;
        while (i6 < i3) {
            long littleEndianToLong = Pack.littleEndianToLong(bArr, i + i6);
            this.m = (this.m >>> (-i5)) | (littleEndianToLong << i5);
            processMessageWord();
            this.m = littleEndianToLong;
            i6 += 8;
        }
        while (i6 < i2) {
            this.m >>>= 8;
            this.m |= (bArr[i + i6] & 255) << 56;
            int i7 = this.wordPos + 1;
            this.wordPos = i7;
            if (i7 == 8) {
                processMessageWord();
                this.wordPos = 0;
            }
            i6++;
        }
    }

    public long doFinal() {
        this.m >>>= (7 - this.wordPos) << 3;
        this.m >>>= 8;
        this.m |= (((this.wordCount << 3) + this.wordPos) & 255) << 56;
        processMessageWord();
        this.v2 ^= 255;
        applySipRounds(this.f5660d);
        long j = ((this.v0 ^ this.v1) ^ this.v2) ^ this.v3;
        reset();
        return j;
    }

    @Override // org.spongycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) {
        Pack.longToLittleEndian(doFinal(), bArr, i);
        return 8;
    }

    @Override // org.spongycastle.crypto.Mac
    public void reset() {
        this.v0 = this.k0 ^ 8317987319222330741L;
        this.v1 = this.k1 ^ 7237128888997146477L;
        this.v2 = this.k0 ^ 7816392313619706465L;
        this.v3 = this.k1 ^ 8387220255154660723L;
        this.m = 0L;
        this.wordPos = 0;
        this.wordCount = 0;
    }

    protected void processMessageWord() {
        this.wordCount++;
        this.v3 ^= this.m;
        applySipRounds(this.f5659c);
        this.v0 ^= this.m;
    }

    protected void applySipRounds(int i) {
        long j = this.v0;
        long j2 = this.v1;
        long j3 = this.v2;
        long j4 = this.v3;
        for (int i2 = 0; i2 < i; i2++) {
            long j5 = j + j2;
            long j6 = j3 + j4;
            long rotateLeft = rotateLeft(j2, 13) ^ j5;
            long rotateLeft2 = rotateLeft(j4, 16) ^ j6;
            long j7 = j6 + rotateLeft;
            j = rotateLeft(j5, 32) + rotateLeft2;
            j2 = rotateLeft(rotateLeft, 17) ^ j7;
            j4 = rotateLeft(rotateLeft2, 21) ^ j;
            j3 = rotateLeft(j7, 32);
        }
        this.v0 = j;
        this.v1 = j2;
        this.v2 = j3;
        this.v3 = j4;
    }
}
