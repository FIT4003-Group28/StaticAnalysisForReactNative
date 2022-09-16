package org.spongycastle.crypto.digests;

import java.lang.reflect.Array;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.ExtendedDigest;
import org.spongycastle.crypto.engines.GOST28147Engine;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithSBox;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Memoable;
import org.spongycastle.util.Pack;
/* loaded from: classes.dex */
public class GOST3411Digest implements ExtendedDigest, Memoable {
    private static final byte[] C2 = {0, -1, 0, -1, 0, -1, 0, -1, -1, 0, -1, 0, -1, 0, -1, 0, 0, -1, -1, 0, -1, 0, 0, -1, -1, 0, 0, 0, -1, -1, 0, -1};
    private static final int DIGEST_LENGTH = 32;
    private byte[][] C;
    private byte[] H;
    private byte[] K;
    private byte[] L;
    private byte[] M;
    byte[] S;
    private byte[] Sum;
    byte[] U;
    byte[] V;
    byte[] W;

    /* renamed from: a  reason: collision with root package name */
    byte[] f5651a;
    private long byteCount;
    private BlockCipher cipher;
    private byte[] sBox;
    short[] wS;
    short[] w_S;
    private byte[] xBuf;
    private int xBufOff;

    @Override // org.spongycastle.crypto.Digest
    public String getAlgorithmName() {
        return "GOST3411";
    }

    @Override // org.spongycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 32;
    }

    @Override // org.spongycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    public GOST3411Digest() {
        this.H = new byte[32];
        this.L = new byte[32];
        this.M = new byte[32];
        this.Sum = new byte[32];
        this.C = (byte[][]) Array.newInstance(byte.class, 4, 32);
        this.xBuf = new byte[32];
        this.cipher = new GOST28147Engine();
        this.K = new byte[32];
        this.f5651a = new byte[8];
        this.wS = new short[16];
        this.w_S = new short[16];
        this.S = new byte[32];
        this.U = new byte[32];
        this.V = new byte[32];
        this.W = new byte[32];
        this.sBox = GOST28147Engine.getSBox("D-A");
        this.cipher.init(true, new ParametersWithSBox(null, this.sBox));
        reset();
    }

    public GOST3411Digest(byte[] bArr) {
        this.H = new byte[32];
        this.L = new byte[32];
        this.M = new byte[32];
        this.Sum = new byte[32];
        this.C = (byte[][]) Array.newInstance(byte.class, 4, 32);
        this.xBuf = new byte[32];
        this.cipher = new GOST28147Engine();
        this.K = new byte[32];
        this.f5651a = new byte[8];
        this.wS = new short[16];
        this.w_S = new short[16];
        this.S = new byte[32];
        this.U = new byte[32];
        this.V = new byte[32];
        this.W = new byte[32];
        this.sBox = Arrays.clone(bArr);
        this.cipher.init(true, new ParametersWithSBox(null, this.sBox));
        reset();
    }

    public GOST3411Digest(GOST3411Digest gOST3411Digest) {
        this.H = new byte[32];
        this.L = new byte[32];
        this.M = new byte[32];
        this.Sum = new byte[32];
        this.C = (byte[][]) Array.newInstance(byte.class, 4, 32);
        this.xBuf = new byte[32];
        this.cipher = new GOST28147Engine();
        this.K = new byte[32];
        this.f5651a = new byte[8];
        this.wS = new short[16];
        this.w_S = new short[16];
        this.S = new byte[32];
        this.U = new byte[32];
        this.V = new byte[32];
        this.W = new byte[32];
        reset(gOST3411Digest);
    }

    @Override // org.spongycastle.crypto.Digest
    public void update(byte b2) {
        byte[] bArr = this.xBuf;
        int i = this.xBufOff;
        this.xBufOff = i + 1;
        bArr[i] = b2;
        if (this.xBufOff == this.xBuf.length) {
            sumByteArray(this.xBuf);
            processBlock(this.xBuf, 0);
            this.xBufOff = 0;
        }
        this.byteCount++;
    }

    @Override // org.spongycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
        while (this.xBufOff != 0 && i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
        while (i2 > this.xBuf.length) {
            System.arraycopy(bArr, i, this.xBuf, 0, this.xBuf.length);
            sumByteArray(this.xBuf);
            processBlock(this.xBuf, 0);
            i += this.xBuf.length;
            i2 -= this.xBuf.length;
            this.byteCount += this.xBuf.length;
        }
        while (i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
    }

    private byte[] P(byte[] bArr) {
        for (int i = 0; i < 8; i++) {
            int i2 = i * 4;
            this.K[i2] = bArr[i];
            this.K[i2 + 1] = bArr[i + 8];
            this.K[i2 + 2] = bArr[i + 16];
            this.K[i2 + 3] = bArr[i + 24];
        }
        return this.K;
    }

    private byte[] A(byte[] bArr) {
        for (int i = 0; i < 8; i++) {
            this.f5651a[i] = (byte) (bArr[i] ^ bArr[i + 8]);
        }
        System.arraycopy(bArr, 8, bArr, 0, 24);
        System.arraycopy(this.f5651a, 0, bArr, 24, 8);
        return bArr;
    }

    private void E(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, int i2) {
        this.cipher.init(true, new KeyParameter(bArr));
        this.cipher.processBlock(bArr3, i2, bArr2, i);
    }

    private void fw(byte[] bArr) {
        cpyBytesToShort(bArr, this.wS);
        this.w_S[15] = (short) (((((this.wS[0] ^ this.wS[1]) ^ this.wS[2]) ^ this.wS[3]) ^ this.wS[12]) ^ this.wS[15]);
        System.arraycopy(this.wS, 1, this.w_S, 0, 15);
        cpyShortToBytes(this.w_S, bArr);
    }

    protected void processBlock(byte[] bArr, int i) {
        System.arraycopy(bArr, i, this.M, 0, 32);
        System.arraycopy(this.H, 0, this.U, 0, 32);
        System.arraycopy(this.M, 0, this.V, 0, 32);
        for (int i2 = 0; i2 < 32; i2++) {
            this.W[i2] = (byte) (this.U[i2] ^ this.V[i2]);
        }
        E(P(this.W), this.S, 0, this.H, 0);
        for (int i3 = 1; i3 < 4; i3++) {
            byte[] A = A(this.U);
            for (int i4 = 0; i4 < 32; i4++) {
                this.U[i4] = (byte) (A[i4] ^ this.C[i3][i4]);
            }
            this.V = A(A(this.V));
            for (int i5 = 0; i5 < 32; i5++) {
                this.W[i5] = (byte) (this.U[i5] ^ this.V[i5]);
            }
            int i6 = i3 * 8;
            E(P(this.W), this.S, i6, this.H, i6);
        }
        for (int i7 = 0; i7 < 12; i7++) {
            fw(this.S);
        }
        for (int i8 = 0; i8 < 32; i8++) {
            this.S[i8] = (byte) (this.S[i8] ^ this.M[i8]);
        }
        fw(this.S);
        for (int i9 = 0; i9 < 32; i9++) {
            this.S[i9] = (byte) (this.H[i9] ^ this.S[i9]);
        }
        for (int i10 = 0; i10 < 61; i10++) {
            fw(this.S);
        }
        System.arraycopy(this.S, 0, this.H, 0, this.H.length);
    }

    private void finish() {
        Pack.longToLittleEndian(this.byteCount * 8, this.L, 0);
        while (this.xBufOff != 0) {
            update((byte) 0);
        }
        processBlock(this.L, 0);
        processBlock(this.Sum, 0);
    }

    @Override // org.spongycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        System.arraycopy(this.H, 0, bArr, i, this.H.length);
        reset();
        return 32;
    }

    @Override // org.spongycastle.crypto.Digest
    public void reset() {
        this.byteCount = 0L;
        this.xBufOff = 0;
        for (int i = 0; i < this.H.length; i++) {
            this.H[i] = 0;
        }
        for (int i2 = 0; i2 < this.L.length; i2++) {
            this.L[i2] = 0;
        }
        for (int i3 = 0; i3 < this.M.length; i3++) {
            this.M[i3] = 0;
        }
        for (int i4 = 0; i4 < this.C[1].length; i4++) {
            this.C[1][i4] = 0;
        }
        for (int i5 = 0; i5 < this.C[3].length; i5++) {
            this.C[3][i5] = 0;
        }
        for (int i6 = 0; i6 < this.Sum.length; i6++) {
            this.Sum[i6] = 0;
        }
        for (int i7 = 0; i7 < this.xBuf.length; i7++) {
            this.xBuf[i7] = 0;
        }
        System.arraycopy(C2, 0, this.C[2], 0, C2.length);
    }

    private void sumByteArray(byte[] bArr) {
        int i = 0;
        for (int i2 = 0; i2 != this.Sum.length; i2++) {
            int i3 = (this.Sum[i2] & 255) + (bArr[i2] & 255) + i;
            this.Sum[i2] = (byte) i3;
            i = i3 >>> 8;
        }
    }

    private void cpyBytesToShort(byte[] bArr, short[] sArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            int i2 = i * 2;
            sArr[i] = (short) ((bArr[i2] & 255) | ((bArr[i2 + 1] << 8) & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB));
        }
    }

    private void cpyShortToBytes(short[] sArr, byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            int i2 = i * 2;
            bArr[i2 + 1] = (byte) (sArr[i] >> 8);
            bArr[i2] = (byte) sArr[i];
        }
    }

    @Override // org.spongycastle.util.Memoable
    public Memoable copy() {
        return new GOST3411Digest(this);
    }

    @Override // org.spongycastle.util.Memoable
    public void reset(Memoable memoable) {
        GOST3411Digest gOST3411Digest = (GOST3411Digest) memoable;
        this.sBox = gOST3411Digest.sBox;
        this.cipher.init(true, new ParametersWithSBox(null, this.sBox));
        reset();
        System.arraycopy(gOST3411Digest.H, 0, this.H, 0, gOST3411Digest.H.length);
        System.arraycopy(gOST3411Digest.L, 0, this.L, 0, gOST3411Digest.L.length);
        System.arraycopy(gOST3411Digest.M, 0, this.M, 0, gOST3411Digest.M.length);
        System.arraycopy(gOST3411Digest.Sum, 0, this.Sum, 0, gOST3411Digest.Sum.length);
        System.arraycopy(gOST3411Digest.C[1], 0, this.C[1], 0, gOST3411Digest.C[1].length);
        System.arraycopy(gOST3411Digest.C[2], 0, this.C[2], 0, gOST3411Digest.C[2].length);
        System.arraycopy(gOST3411Digest.C[3], 0, this.C[3], 0, gOST3411Digest.C[3].length);
        System.arraycopy(gOST3411Digest.xBuf, 0, this.xBuf, 0, gOST3411Digest.xBuf.length);
        this.xBufOff = gOST3411Digest.xBufOff;
        this.byteCount = gOST3411Digest.byteCount;
    }
}
