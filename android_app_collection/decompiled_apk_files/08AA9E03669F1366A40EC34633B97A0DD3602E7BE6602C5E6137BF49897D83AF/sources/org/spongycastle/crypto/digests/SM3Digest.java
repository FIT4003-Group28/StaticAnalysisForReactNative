package org.spongycastle.crypto.digests;

import org.spongycastle.util.Memoable;
import org.spongycastle.util.Pack;
/* loaded from: classes.dex */
public class SM3Digest extends GeneralDigest {
    private static final int BLOCK_SIZE = 16;
    private static final int DIGEST_LENGTH = 32;
    private static final int[] T = new int[64];
    private int[] V;
    private int[] W;
    private int[] W1;
    private int[] inwords;
    private int xOff;

    private int FF0(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    private int FF1(int i, int i2, int i3) {
        return (i & i3) | (i & i2) | (i2 & i3);
    }

    private int GG0(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    private int GG1(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    private int P0(int i) {
        return (i ^ ((i << 9) | (i >>> 23))) ^ ((i << 17) | (i >>> 15));
    }

    private int P1(int i) {
        return (i ^ ((i << 15) | (i >>> 17))) ^ ((i << 23) | (i >>> 9));
    }

    @Override // org.spongycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SM3";
    }

    @Override // org.spongycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    static {
        int i;
        int i2 = 0;
        while (true) {
            if (i2 >= 16) {
                break;
            }
            T[i2] = (2043430169 >>> (32 - i2)) | (2043430169 << i2);
            i2++;
        }
        for (i = 16; i < 64; i++) {
            int i3 = i % 32;
            T[i] = (2055708042 >>> (32 - i3)) | (2055708042 << i3);
        }
    }

    public SM3Digest() {
        this.V = new int[8];
        this.inwords = new int[16];
        this.W = new int[68];
        this.W1 = new int[64];
        reset();
    }

    public SM3Digest(SM3Digest sM3Digest) {
        super(sM3Digest);
        this.V = new int[8];
        this.inwords = new int[16];
        this.W = new int[68];
        this.W1 = new int[64];
        copyIn(sM3Digest);
    }

    private void copyIn(SM3Digest sM3Digest) {
        System.arraycopy(sM3Digest.V, 0, this.V, 0, this.V.length);
        System.arraycopy(sM3Digest.inwords, 0, this.inwords, 0, this.inwords.length);
        this.xOff = sM3Digest.xOff;
    }

    @Override // org.spongycastle.util.Memoable
    public Memoable copy() {
        return new SM3Digest(this);
    }

    @Override // org.spongycastle.util.Memoable
    public void reset(Memoable memoable) {
        SM3Digest sM3Digest = (SM3Digest) memoable;
        super.copyIn((GeneralDigest) sM3Digest);
        copyIn(sM3Digest);
    }

    @Override // org.spongycastle.crypto.digests.GeneralDigest, org.spongycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.V[0] = 1937774191;
        this.V[1] = 1226093241;
        this.V[2] = 388252375;
        this.V[3] = -628488704;
        this.V[4] = -1452330820;
        this.V[5] = 372324522;
        this.V[6] = -477237683;
        this.V[7] = -1325724082;
        this.xOff = 0;
    }

    @Override // org.spongycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        Pack.intToBigEndian(this.V[0], bArr, i + 0);
        Pack.intToBigEndian(this.V[1], bArr, i + 4);
        Pack.intToBigEndian(this.V[2], bArr, i + 8);
        Pack.intToBigEndian(this.V[3], bArr, i + 12);
        Pack.intToBigEndian(this.V[4], bArr, i + 16);
        Pack.intToBigEndian(this.V[5], bArr, i + 20);
        Pack.intToBigEndian(this.V[6], bArr, i + 24);
        Pack.intToBigEndian(this.V[7], bArr, i + 28);
        reset();
        return 32;
    }

    @Override // org.spongycastle.crypto.digests.GeneralDigest
    protected void processWord(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        this.inwords[this.xOff] = (bArr[i3 + 1] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
        this.xOff++;
        if (this.xOff >= 16) {
            processBlock();
        }
    }

    @Override // org.spongycastle.crypto.digests.GeneralDigest
    protected void processLength(long j) {
        if (this.xOff > 14) {
            this.inwords[this.xOff] = 0;
            this.xOff++;
            processBlock();
        }
        while (this.xOff < 14) {
            this.inwords[this.xOff] = 0;
            this.xOff++;
        }
        int[] iArr = this.inwords;
        int i = this.xOff;
        this.xOff = i + 1;
        iArr[i] = (int) (j >>> 32);
        int[] iArr2 = this.inwords;
        int i2 = this.xOff;
        this.xOff = i2 + 1;
        iArr2[i2] = (int) j;
    }

    @Override // org.spongycastle.crypto.digests.GeneralDigest
    protected void processBlock() {
        int i;
        int i2;
        int i3 = 0;
        while (true) {
            i = 16;
            if (i3 >= 16) {
                break;
            }
            this.W[i3] = this.inwords[i3];
            i3++;
        }
        for (int i4 = 16; i4 < 68; i4++) {
            int i5 = this.W[i4 - 3];
            int i6 = (i5 >>> 17) | (i5 << 15);
            int i7 = this.W[i4 - 13];
            this.W[i4] = (P1(i6 ^ (this.W[i4 - 16] ^ this.W[i4 - 9])) ^ ((i7 >>> 25) | (i7 << 7))) ^ this.W[i4 - 6];
        }
        int i8 = 0;
        while (true) {
            i2 = 64;
            if (i8 >= 64) {
                break;
            }
            this.W1[i8] = this.W[i8] ^ this.W[i8 + 4];
            i8++;
        }
        int i9 = this.V[0];
        int i10 = this.V[1];
        int i11 = this.V[2];
        int i12 = this.V[3];
        int i13 = this.V[4];
        int i14 = this.V[5];
        int i15 = this.V[6];
        int i16 = this.V[7];
        int i17 = i14;
        int i18 = i13;
        int i19 = i12;
        int i20 = i11;
        int i21 = i10;
        int i22 = i9;
        int i23 = 0;
        while (i23 < i) {
            int i24 = (i22 << 12) | (i22 >>> 20);
            int i25 = i24 + i18 + T[i23];
            int i26 = (i25 << 7) | (i25 >>> 25);
            int FF0 = FF0(i22, i21, i20) + i19;
            int i27 = (i21 << 9) | (i21 >>> 23);
            i23++;
            i16 = i15;
            i15 = (i17 << 19) | (i17 >>> 13);
            i17 = i18;
            i18 = P0(GG0(i18, i17, i15) + i16 + i26 + this.W[i23]);
            i = 16;
            i21 = i22;
            i22 = FF0 + (i26 ^ i24) + this.W1[i23];
            i19 = i20;
            i20 = i27;
        }
        int i28 = i21;
        int i29 = 16;
        int i30 = i22;
        int i31 = i19;
        int i32 = i20;
        int i33 = i17;
        int i34 = i18;
        while (i29 < i2) {
            int i35 = (i30 << 12) | (i30 >>> 20);
            int i36 = i35 + i34 + T[i29];
            int i37 = (i36 << 7) | (i36 >>> 25);
            int FF1 = FF1(i30, i28, i32) + i31;
            int GG1 = GG1(i34, i33, i15) + i16 + i37 + this.W[i29];
            int i38 = (i28 >>> 23) | (i28 << 9);
            i29++;
            i16 = i15;
            i15 = (i33 << 19) | (i33 >>> 13);
            i2 = 64;
            int i39 = i32;
            i32 = i38;
            i28 = i30;
            i30 = FF1 + (i37 ^ i35) + this.W1[i29];
            i31 = i39;
            int i40 = i34;
            i34 = P0(GG1);
            i33 = i40;
        }
        int[] iArr = this.V;
        iArr[0] = iArr[0] ^ i30;
        int[] iArr2 = this.V;
        iArr2[1] = i28 ^ iArr2[1];
        int[] iArr3 = this.V;
        iArr3[2] = iArr3[2] ^ i32;
        int[] iArr4 = this.V;
        iArr4[3] = iArr4[3] ^ i31;
        int[] iArr5 = this.V;
        iArr5[4] = iArr5[4] ^ i34;
        int[] iArr6 = this.V;
        iArr6[5] = iArr6[5] ^ i33;
        int[] iArr7 = this.V;
        iArr7[6] = iArr7[6] ^ i15;
        int[] iArr8 = this.V;
        iArr8[7] = iArr8[7] ^ i16;
        this.xOff = 0;
    }
}
