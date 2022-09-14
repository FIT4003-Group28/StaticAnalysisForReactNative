package org.spongycastle.pqc.crypto.gmss;

import java.lang.reflect.Array;
import org.spongycastle.crypto.Digest;
import org.spongycastle.pqc.crypto.gmss.util.GMSSRandom;
import org.spongycastle.util.encoders.Hex;
/* loaded from: classes2.dex */
public class GMSSRootSig {
    private long big8;
    private int checksum;
    private int counter;
    private GMSSRandom gmssRandom;
    private byte[] hash;
    private int height;
    private int ii;
    private int k;
    private int keysize;
    private int mdsize;
    private Digest messDigestOTS;
    private int messagesize;
    private byte[] privateKeyOTS;
    private int r;
    private byte[] seed;
    private byte[] sign;
    private int steps;
    private int test;
    private long test8;
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

    public GMSSRootSig(Digest digest, byte[][] bArr, int[] iArr) {
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(this.messDigestOTS);
        this.counter = iArr[0];
        this.test = iArr[1];
        this.ii = iArr[2];
        this.r = iArr[3];
        this.steps = iArr[4];
        this.keysize = iArr[5];
        this.height = iArr[6];
        this.w = iArr[7];
        this.checksum = iArr[8];
        this.mdsize = this.messDigestOTS.getDigestSize();
        this.k = (1 << this.w) - 1;
        this.messagesize = (int) Math.ceil((this.mdsize << 3) / this.w);
        this.privateKeyOTS = bArr[0];
        this.seed = bArr[1];
        this.hash = bArr[2];
        this.sign = bArr[3];
        this.test8 = ((bArr[4][2] & 255) << 16) | (bArr[4][0] & 255) | ((bArr[4][1] & 255) << 8) | ((bArr[4][3] & 255) << 24) | ((bArr[4][4] & 255) << 32) | ((bArr[4][5] & 255) << 40) | ((bArr[4][6] & 255) << 48) | ((bArr[4][7] & 255) << 56);
        this.big8 = ((bArr[4][15] & 255) << 56) | (bArr[4][8] & 255) | ((bArr[4][9] & 255) << 8) | ((bArr[4][10] & 255) << 16) | ((bArr[4][11] & 255) << 24) | ((bArr[4][12] & 255) << 32) | ((bArr[4][13] & 255) << 40) | ((bArr[4][14] & 255) << 48);
    }

    public GMSSRootSig(Digest digest, int i, int i2) {
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(this.messDigestOTS);
        this.mdsize = this.messDigestOTS.getDigestSize();
        this.w = i;
        this.height = i2;
        this.k = (1 << i) - 1;
        this.messagesize = (int) Math.ceil((this.mdsize << 3) / i);
    }

    public void initSign(byte[] bArr, byte[] bArr2) {
        int i;
        this.hash = new byte[this.mdsize];
        this.messDigestOTS.update(bArr2, 0, bArr2.length);
        this.hash = new byte[this.messDigestOTS.getDigestSize()];
        this.messDigestOTS.doFinal(this.hash, 0);
        byte[] bArr3 = new byte[this.mdsize];
        System.arraycopy(this.hash, 0, bArr3, 0, this.mdsize);
        int log = getLog((this.messagesize << this.w) + 1);
        if (8 % this.w == 0) {
            int i2 = 8 / this.w;
            int i3 = 0;
            int i4 = 0;
            while (i3 < this.mdsize) {
                int i5 = i4;
                for (int i6 = 0; i6 < i2; i6++) {
                    i5 += bArr3[i3] & this.k;
                    bArr3[i3] = (byte) (bArr3[i3] >>> this.w);
                }
                i3++;
                i4 = i5;
            }
            this.checksum = (this.messagesize << this.w) - i4;
            int i7 = this.checksum;
            int i8 = 0;
            while (i8 < log) {
                i4 += this.k & i7;
                i7 >>>= this.w;
                i8 += this.w;
            }
            i = i4;
        } else if (this.w < 8) {
            int i9 = this.mdsize / this.w;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (i10 < i9) {
                int i13 = i11;
                long j = 0;
                for (int i14 = 0; i14 < this.w; i14++) {
                    j ^= (bArr3[i13] & 255) << (i14 << 3);
                    i13++;
                }
                int i15 = 0;
                while (i15 < 8) {
                    i12 += (int) (this.k & j);
                    j >>>= this.w;
                    i15++;
                    i9 = i9;
                }
                i10++;
                i11 = i13;
            }
            int i16 = this.mdsize % this.w;
            long j2 = 0;
            for (int i17 = 0; i17 < i16; i17++) {
                j2 ^= (bArr3[i11] & 255) << (i17 << 3);
                i11++;
            }
            int i18 = i16 << 3;
            int i19 = 0;
            while (i19 < i18) {
                i12 += (int) (this.k & j2);
                j2 >>>= this.w;
                i19 += this.w;
            }
            this.checksum = (this.messagesize << this.w) - i12;
            int i20 = this.checksum;
            i = i12;
            int i21 = 0;
            while (i21 < log) {
                i += this.k & i20;
                i20 >>>= this.w;
                i21 += this.w;
            }
        } else if (this.w < 57) {
            int i22 = 0;
            int i23 = 0;
            while (i22 <= (this.mdsize << 3) - this.w) {
                int i24 = i22 % 8;
                i22 += this.w;
                int i25 = (i22 + 7) >>> 3;
                long j3 = 0;
                int i26 = 0;
                for (int i27 = i22 >>> 3; i27 < i25; i27++) {
                    j3 ^= (bArr3[i27] & 255) << (i26 << 3);
                    i26++;
                }
                i23 = (int) (i23 + ((j3 >>> i24) & this.k));
            }
            int i28 = i22 >>> 3;
            if (i28 < this.mdsize) {
                int i29 = i22 % 8;
                int i30 = 0;
                long j4 = 0;
                while (i28 < this.mdsize) {
                    j4 ^= (bArr3[i28] & 255) << (i30 << 3);
                    i30++;
                    i28++;
                }
                i23 = (int) (i23 + ((j4 >>> i29) & this.k));
            }
            this.checksum = (this.messagesize << this.w) - i23;
            i = i23;
            int i31 = this.checksum;
            int i32 = 0;
            while (i32 < log) {
                i += this.k & i31;
                i31 >>>= this.w;
                i32 += this.w;
            }
        } else {
            i = 0;
        }
        this.keysize = this.messagesize + ((int) Math.ceil(log / this.w));
        this.steps = (int) Math.ceil((this.keysize + i) / (1 << this.height));
        this.sign = new byte[this.keysize * this.mdsize];
        this.counter = 0;
        this.test = 0;
        this.ii = 0;
        this.test8 = 0L;
        this.r = 0;
        this.privateKeyOTS = new byte[this.mdsize];
        this.seed = new byte[this.mdsize];
        System.arraycopy(bArr, 0, this.seed, 0, this.mdsize);
    }

    public boolean updateSign() {
        for (int i = 0; i < this.steps; i++) {
            if (this.counter < this.keysize) {
                oneStep();
            }
            if (this.counter == this.keysize) {
                return true;
            }
        }
        return false;
    }

    public byte[] getSig() {
        return this.sign;
    }

    private void oneStep() {
        int i;
        if (8 % this.w == 0) {
            if (this.test == 0) {
                this.privateKeyOTS = this.gmssRandom.nextSeed(this.seed);
                if (this.ii < this.mdsize) {
                    this.test = this.hash[this.ii] & this.k;
                    this.hash[this.ii] = (byte) (this.hash[this.ii] >>> this.w);
                } else {
                    this.test = this.checksum & this.k;
                    this.checksum >>>= this.w;
                }
            } else if (this.test > 0) {
                this.messDigestOTS.update(this.privateKeyOTS, 0, this.privateKeyOTS.length);
                this.privateKeyOTS = new byte[this.messDigestOTS.getDigestSize()];
                this.messDigestOTS.doFinal(this.privateKeyOTS, 0);
                this.test--;
            }
            if (this.test != 0) {
                return;
            }
            System.arraycopy(this.privateKeyOTS, 0, this.sign, this.counter * this.mdsize, this.mdsize);
            this.counter++;
            if (this.counter % (8 / this.w) != 0) {
                return;
            }
            this.ii++;
        } else if (this.w < 8) {
            if (this.test == 0) {
                if (this.counter % 8 == 0 && this.ii < this.mdsize) {
                    this.big8 = 0L;
                    if (this.counter < ((this.mdsize / this.w) << 3)) {
                        for (int i2 = 0; i2 < this.w; i2++) {
                            this.big8 ^= (this.hash[this.ii] & 255) << (i2 << 3);
                            this.ii++;
                        }
                    } else {
                        for (int i3 = 0; i3 < this.mdsize % this.w; i3++) {
                            this.big8 ^= (this.hash[this.ii] & 255) << (i3 << 3);
                            this.ii++;
                        }
                    }
                }
                if (this.counter == this.messagesize) {
                    this.big8 = this.checksum;
                }
                this.test = (int) (this.big8 & this.k);
                this.privateKeyOTS = this.gmssRandom.nextSeed(this.seed);
            } else if (this.test > 0) {
                this.messDigestOTS.update(this.privateKeyOTS, 0, this.privateKeyOTS.length);
                this.privateKeyOTS = new byte[this.messDigestOTS.getDigestSize()];
                this.messDigestOTS.doFinal(this.privateKeyOTS, 0);
                this.test--;
            }
            if (this.test != 0) {
                return;
            }
            System.arraycopy(this.privateKeyOTS, 0, this.sign, this.counter * this.mdsize, this.mdsize);
            this.big8 >>>= this.w;
            this.counter++;
        } else if (this.w < 57) {
            if (this.test8 == 0) {
                this.big8 = 0L;
                this.ii = 0;
                int i4 = this.r % 8;
                int i5 = this.r >>> 3;
                if (i5 < this.mdsize) {
                    if (this.r <= (this.mdsize << 3) - this.w) {
                        this.r += this.w;
                        i = (this.r + 7) >>> 3;
                    } else {
                        i = this.mdsize;
                        this.r += this.w;
                    }
                    while (i5 < i) {
                        this.big8 ^= (this.hash[i5] & 255) << (this.ii << 3);
                        this.ii++;
                        i5++;
                    }
                    this.big8 >>>= i4;
                    this.test8 = this.big8 & this.k;
                } else {
                    this.test8 = this.checksum & this.k;
                    this.checksum >>>= this.w;
                }
                this.privateKeyOTS = this.gmssRandom.nextSeed(this.seed);
            } else if (this.test8 > 0) {
                this.messDigestOTS.update(this.privateKeyOTS, 0, this.privateKeyOTS.length);
                this.privateKeyOTS = new byte[this.messDigestOTS.getDigestSize()];
                this.messDigestOTS.doFinal(this.privateKeyOTS, 0);
                this.test8--;
            }
            if (this.test8 != 0) {
                return;
            }
            System.arraycopy(this.privateKeyOTS, 0, this.sign, this.counter * this.mdsize, this.mdsize);
            this.counter++;
        }
    }

    public byte[][] getStatByte() {
        byte[][] bArr = (byte[][]) Array.newInstance(byte.class, 5, this.mdsize);
        bArr[0] = this.privateKeyOTS;
        bArr[1] = this.seed;
        bArr[2] = this.hash;
        bArr[3] = this.sign;
        bArr[4] = getStatLong();
        return bArr;
    }

    public int[] getStatInt() {
        return new int[]{this.counter, this.test, this.ii, this.r, this.steps, this.keysize, this.height, this.w, this.checksum};
    }

    public byte[] getStatLong() {
        return new byte[]{(byte) (this.test8 & 255), (byte) ((this.test8 >> 8) & 255), (byte) ((this.test8 >> 16) & 255), (byte) ((this.test8 >> 24) & 255), (byte) ((this.test8 >> 32) & 255), (byte) ((this.test8 >> 40) & 255), (byte) ((this.test8 >> 48) & 255), (byte) ((this.test8 >> 56) & 255), (byte) (this.big8 & 255), (byte) ((this.big8 >> 8) & 255), (byte) ((this.big8 >> 16) & 255), (byte) ((this.big8 >> 24) & 255), (byte) ((this.big8 >> 32) & 255), (byte) ((this.big8 >> 40) & 255), (byte) ((this.big8 >> 48) & 255), (byte) ((this.big8 >> 56) & 255)};
    }

    public String toString() {
        int[] iArr = new int[9];
        int[] statInt = getStatInt();
        byte[][] bArr = (byte[][]) Array.newInstance(byte.class, 5, this.mdsize);
        byte[][] statByte = getStatByte();
        String str = "" + this.big8 + "  ";
        for (int i = 0; i < 9; i++) {
            str = str + statInt[i] + " ";
        }
        for (int i2 = 0; i2 < 5; i2++) {
            str = str + new String(Hex.encode(statByte[i2])) + " ";
        }
        return str;
    }
}
