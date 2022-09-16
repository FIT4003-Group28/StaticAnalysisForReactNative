package org.spongycastle.pqc.crypto.gmss.util;

import java.lang.reflect.Array;
import org.spongycastle.crypto.Digest;
/* loaded from: classes2.dex */
public class WinternitzOTSignature {
    private int checksumsize;
    private GMSSRandom gmssRandom;
    private int keysize;
    private int mdsize;
    private Digest messDigestOTS;
    private int messagesize;
    private byte[][] privateKeyOTS;
    private int w;

    public int getLog(int i) {
        int i2 = 1;
        int i3 = 2;
        while (i3 < i) {
            i3 <<= 1;
            i2++;
        }
        return i2;
    }

    public WinternitzOTSignature(byte[] bArr, Digest digest, int i) {
        this.w = i;
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(this.messDigestOTS);
        this.mdsize = this.messDigestOTS.getDigestSize();
        double d2 = i;
        this.messagesize = (int) Math.ceil((this.mdsize << 3) / d2);
        this.checksumsize = getLog((this.messagesize << i) + 1);
        this.keysize = this.messagesize + ((int) Math.ceil(this.checksumsize / d2));
        this.privateKeyOTS = (byte[][]) Array.newInstance(byte.class, this.keysize, this.mdsize);
        byte[] bArr2 = new byte[this.mdsize];
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        for (int i2 = 0; i2 < this.keysize; i2++) {
            this.privateKeyOTS[i2] = this.gmssRandom.nextSeed(bArr2);
        }
    }

    public byte[][] getPrivateKey() {
        return this.privateKeyOTS;
    }

    public byte[] getPublicKey() {
        byte[] bArr = new byte[this.keysize * this.mdsize];
        byte[] bArr2 = new byte[this.mdsize];
        int i = 1 << this.w;
        for (int i2 = 0; i2 < this.keysize; i2++) {
            this.messDigestOTS.update(this.privateKeyOTS[i2], 0, this.privateKeyOTS[i2].length);
            byte[] bArr3 = new byte[this.messDigestOTS.getDigestSize()];
            this.messDigestOTS.doFinal(bArr3, 0);
            for (int i3 = 2; i3 < i; i3++) {
                this.messDigestOTS.update(bArr3, 0, bArr3.length);
                bArr3 = new byte[this.messDigestOTS.getDigestSize()];
                this.messDigestOTS.doFinal(bArr3, 0);
            }
            System.arraycopy(bArr3, 0, bArr, this.mdsize * i2, this.mdsize);
        }
        this.messDigestOTS.update(bArr, 0, bArr.length);
        byte[] bArr4 = new byte[this.messDigestOTS.getDigestSize()];
        this.messDigestOTS.doFinal(bArr4, 0);
        return bArr4;
    }

    public byte[] getSignature(byte[] bArr) {
        byte[] bArr2 = new byte[this.keysize * this.mdsize];
        byte[] bArr3 = new byte[this.mdsize];
        this.messDigestOTS.update(bArr, 0, bArr.length);
        byte[] bArr4 = new byte[this.messDigestOTS.getDigestSize()];
        this.messDigestOTS.doFinal(bArr4, 0);
        if (8 % this.w == 0) {
            int i = 8 / this.w;
            int i2 = (1 << this.w) - 1;
            byte[] bArr5 = new byte[this.mdsize];
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < bArr4.length) {
                byte[] bArr6 = bArr5;
                int i6 = i5;
                int i7 = i4;
                for (int i8 = 0; i8 < i; i8++) {
                    int i9 = bArr4[i3] & i2;
                    i7 += i9;
                    System.arraycopy(this.privateKeyOTS[i6], 0, bArr6, 0, this.mdsize);
                    while (i9 > 0) {
                        this.messDigestOTS.update(bArr6, 0, bArr6.length);
                        bArr6 = new byte[this.messDigestOTS.getDigestSize()];
                        this.messDigestOTS.doFinal(bArr6, 0);
                        i9--;
                    }
                    System.arraycopy(bArr6, 0, bArr2, this.mdsize * i6, this.mdsize);
                    bArr4[i3] = (byte) (bArr4[i3] >>> this.w);
                    i6++;
                }
                i3++;
                i4 = i7;
                i5 = i6;
                bArr5 = bArr6;
            }
            int i10 = (this.messagesize << this.w) - i4;
            int i11 = 0;
            while (i11 < this.checksumsize) {
                System.arraycopy(this.privateKeyOTS[i5], 0, bArr5, 0, this.mdsize);
                for (int i12 = i10 & i2; i12 > 0; i12--) {
                    this.messDigestOTS.update(bArr5, 0, bArr5.length);
                    bArr5 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr5, 0);
                }
                System.arraycopy(bArr5, 0, bArr2, this.mdsize * i5, this.mdsize);
                i10 >>>= this.w;
                i5++;
                i11 += this.w;
            }
        } else if (this.w < 8) {
            int i13 = this.mdsize / this.w;
            int i14 = (1 << this.w) - 1;
            byte[] bArr7 = new byte[this.mdsize];
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            while (i15 < i13) {
                int i19 = i16;
                long j = 0;
                for (int i20 = 0; i20 < this.w; i20++) {
                    j ^= (bArr4[i19] & 255) << (i20 << 3);
                    i19++;
                }
                int i21 = 0;
                while (i21 < 8) {
                    int i22 = i21;
                    int i23 = (int) (i14 & j);
                    i18 += i23;
                    System.arraycopy(this.privateKeyOTS[i17], 0, bArr7, 0, this.mdsize);
                    while (i23 > 0) {
                        this.messDigestOTS.update(bArr7, 0, bArr7.length);
                        bArr7 = new byte[this.messDigestOTS.getDigestSize()];
                        this.messDigestOTS.doFinal(bArr7, 0);
                        i23--;
                    }
                    System.arraycopy(bArr7, 0, bArr2, this.mdsize * i17, this.mdsize);
                    j >>>= this.w;
                    i17++;
                    i21 = i22 + 1;
                }
                i15++;
                i16 = i19;
            }
            int i24 = this.mdsize % this.w;
            long j2 = 0;
            for (int i25 = 0; i25 < i24; i25++) {
                j2 ^= (bArr4[i16] & 255) << (i25 << 3);
                i16++;
            }
            int i26 = i24 << 3;
            int i27 = 0;
            while (i27 < i26) {
                int i28 = (int) (j2 & i14);
                i18 += i28;
                System.arraycopy(this.privateKeyOTS[i17], 0, bArr7, 0, this.mdsize);
                while (i28 > 0) {
                    this.messDigestOTS.update(bArr7, 0, bArr7.length);
                    bArr7 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr7, 0);
                    i28--;
                }
                System.arraycopy(bArr7, 0, bArr2, this.mdsize * i17, this.mdsize);
                j2 >>>= this.w;
                i17++;
                i27 += this.w;
            }
            int i29 = (this.messagesize << this.w) - i18;
            int i30 = 0;
            while (i30 < this.checksumsize) {
                System.arraycopy(this.privateKeyOTS[i17], 0, bArr7, 0, this.mdsize);
                for (int i31 = i29 & i14; i31 > 0; i31--) {
                    this.messDigestOTS.update(bArr7, 0, bArr7.length);
                    bArr7 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr7, 0);
                }
                System.arraycopy(bArr7, 0, bArr2, this.mdsize * i17, this.mdsize);
                i29 >>>= this.w;
                i17++;
                i30 += this.w;
            }
        } else if (this.w < 57) {
            int i32 = (this.mdsize << 3) - this.w;
            int i33 = (1 << this.w) - 1;
            byte[] bArr8 = new byte[this.mdsize];
            int i34 = 0;
            int i35 = 0;
            int i36 = 0;
            while (i34 <= i32) {
                int i37 = i34 % 8;
                i34 += this.w;
                long j3 = 0;
                int i38 = 0;
                for (int i39 = i34 >>> 3; i39 < ((i34 + 7) >>> 3); i39++) {
                    j3 ^= (bArr4[i39] & 255) << (i38 << 3);
                    i38++;
                }
                long j4 = (j3 >>> i37) & i33;
                i35 = (int) (i35 + j4);
                System.arraycopy(this.privateKeyOTS[i36], 0, bArr8, 0, this.mdsize);
                while (j4 > 0) {
                    this.messDigestOTS.update(bArr8, 0, bArr8.length);
                    bArr8 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr8, 0);
                    j4--;
                }
                System.arraycopy(bArr8, 0, bArr2, this.mdsize * i36, this.mdsize);
                i36++;
            }
            int i40 = i34 >>> 3;
            if (i40 < this.mdsize) {
                int i41 = i34 % 8;
                int i42 = 0;
                long j5 = 0;
                while (i40 < this.mdsize) {
                    j5 ^= (bArr4[i40] & 255) << (i42 << 3);
                    i42++;
                    i40++;
                }
                long j6 = (j5 >>> i41) & i33;
                i35 = (int) (i35 + j6);
                System.arraycopy(this.privateKeyOTS[i36], 0, bArr8, 0, this.mdsize);
                while (j6 > 0) {
                    this.messDigestOTS.update(bArr8, 0, bArr8.length);
                    bArr8 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr8, 0);
                    j6--;
                }
                System.arraycopy(bArr8, 0, bArr2, this.mdsize * i36, this.mdsize);
                i36++;
            }
            int i43 = (this.messagesize << this.w) - i35;
            int i44 = 0;
            while (i44 < this.checksumsize) {
                System.arraycopy(this.privateKeyOTS[i36], 0, bArr8, 0, this.mdsize);
                for (long j7 = i43 & i33; j7 > 0; j7--) {
                    this.messDigestOTS.update(bArr8, 0, bArr8.length);
                    bArr8 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr8, 0);
                }
                System.arraycopy(bArr8, 0, bArr2, this.mdsize * i36, this.mdsize);
                i43 >>>= this.w;
                i36++;
                i44 += this.w;
            }
        }
        return bArr2;
    }
}
