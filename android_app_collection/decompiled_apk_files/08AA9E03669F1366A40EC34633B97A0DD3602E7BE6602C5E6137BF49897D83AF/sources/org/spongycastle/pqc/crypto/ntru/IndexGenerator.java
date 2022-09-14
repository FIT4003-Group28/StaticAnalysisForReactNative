package org.spongycastle.pqc.crypto.ntru;

import org.spongycastle.crypto.Digest;
import org.spongycastle.util.Arrays;
/* loaded from: classes2.dex */
public class IndexGenerator {
    private int N;
    private BitString buf;

    /* renamed from: c  reason: collision with root package name */
    private int f5683c;
    private int hLen;
    private Digest hashAlg;
    private int minCallsR;
    private byte[] seed;
    private int totLen = 0;
    private int remLen = 0;
    private int counter = 0;
    private boolean initialized = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public IndexGenerator(byte[] bArr, NTRUEncryptionParameters nTRUEncryptionParameters) {
        this.seed = bArr;
        this.N = nTRUEncryptionParameters.N;
        this.f5683c = nTRUEncryptionParameters.f5685c;
        this.minCallsR = nTRUEncryptionParameters.minCallsR;
        this.hashAlg = nTRUEncryptionParameters.hashAlg;
        this.hLen = this.hashAlg.getDigestSize();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int nextIndex() {
        int leadingAsInt;
        if (!this.initialized) {
            this.buf = new BitString();
            byte[] bArr = new byte[this.hashAlg.getDigestSize()];
            while (this.counter < this.minCallsR) {
                appendHash(this.buf, bArr);
                this.counter++;
            }
            this.totLen = this.minCallsR * 8 * this.hLen;
            this.remLen = this.totLen;
            this.initialized = true;
        }
        do {
            this.totLen += this.f5683c;
            BitString trailing = this.buf.getTrailing(this.remLen);
            if (this.remLen < this.f5683c) {
                int i = this.f5683c - this.remLen;
                int i2 = this.counter + (((this.hLen + i) - 1) / this.hLen);
                byte[] bArr2 = new byte[this.hashAlg.getDigestSize()];
                while (this.counter < i2) {
                    appendHash(trailing, bArr2);
                    this.counter++;
                    if (i > this.hLen * 8) {
                        i -= this.hLen * 8;
                    }
                }
                this.remLen = (this.hLen * 8) - i;
                this.buf = new BitString();
                this.buf.appendBits(bArr2);
            } else {
                this.remLen -= this.f5683c;
            }
            leadingAsInt = trailing.getLeadingAsInt(this.f5683c);
        } while (leadingAsInt >= (1 << this.f5683c) - ((1 << this.f5683c) % this.N));
        return leadingAsInt % this.N;
    }

    private void appendHash(BitString bitString, byte[] bArr) {
        this.hashAlg.update(this.seed, 0, this.seed.length);
        putInt(this.hashAlg, this.counter);
        this.hashAlg.doFinal(bArr, 0);
        bitString.appendBits(bArr);
    }

    private void putInt(Digest digest, int i) {
        digest.update((byte) (i >> 24));
        digest.update((byte) (i >> 16));
        digest.update((byte) (i >> 8));
        digest.update((byte) i);
    }

    /* loaded from: classes2.dex */
    public static class BitString {
        byte[] bytes = new byte[4];
        int lastByteBits;
        int numBytes;

        void appendBits(byte[] bArr) {
            for (int i = 0; i != bArr.length; i++) {
                appendBits(bArr[i]);
            }
        }

        public void appendBits(byte b2) {
            if (this.numBytes == this.bytes.length) {
                this.bytes = IndexGenerator.copyOf(this.bytes, this.bytes.length * 2);
            }
            if (this.numBytes == 0) {
                this.numBytes = 1;
                this.bytes[0] = b2;
                this.lastByteBits = 8;
            } else if (this.lastByteBits == 8) {
                byte[] bArr = this.bytes;
                int i = this.numBytes;
                this.numBytes = i + 1;
                bArr[i] = b2;
            } else {
                int i2 = 8 - this.lastByteBits;
                byte[] bArr2 = this.bytes;
                int i3 = this.numBytes - 1;
                int i4 = b2 & 255;
                bArr2[i3] = (byte) (bArr2[i3] | (i4 << this.lastByteBits));
                byte[] bArr3 = this.bytes;
                int i5 = this.numBytes;
                this.numBytes = i5 + 1;
                bArr3[i5] = (byte) (i4 >> i2);
            }
        }

        public BitString getTrailing(int i) {
            BitString bitString = new BitString();
            bitString.numBytes = (i + 7) / 8;
            bitString.bytes = new byte[bitString.numBytes];
            for (int i2 = 0; i2 < bitString.numBytes; i2++) {
                bitString.bytes[i2] = this.bytes[i2];
            }
            bitString.lastByteBits = i % 8;
            if (bitString.lastByteBits == 0) {
                bitString.lastByteBits = 8;
            } else {
                int i3 = 32 - bitString.lastByteBits;
                bitString.bytes[bitString.numBytes - 1] = (byte) ((bitString.bytes[bitString.numBytes - 1] << i3) >>> i3);
            }
            return bitString;
        }

        public int getLeadingAsInt(int i) {
            int i2 = (((this.numBytes - 1) * 8) + this.lastByteBits) - i;
            int i3 = i2 / 8;
            int i4 = i2 % 8;
            int i5 = (this.bytes[i3] & 255) >>> i4;
            int i6 = 8 - i4;
            while (true) {
                i3++;
                if (i3 < this.numBytes) {
                    i5 |= (this.bytes[i3] & 255) << i6;
                    i6 += 8;
                } else {
                    return i5;
                }
            }
        }

        public byte[] getBytes() {
            return Arrays.clone(this.bytes);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] copyOf(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        if (i >= bArr.length) {
            i = bArr.length;
        }
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return bArr2;
    }
}
