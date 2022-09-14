package org.spongycastle.pqc.crypto.gmss.util;

import org.spongycastle.crypto.Digest;
/* loaded from: classes2.dex */
public class WinternitzOTSVerify {
    private Digest messDigestOTS;
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

    public WinternitzOTSVerify(Digest digest, int i) {
        this.w = i;
        this.messDigestOTS = digest;
    }

    public int getSignatureLength() {
        int digestSize = this.messDigestOTS.getDigestSize();
        int i = ((digestSize << 3) + (this.w - 1)) / this.w;
        return digestSize * (i + (((getLog((i << this.w) + 1) + this.w) - 1) / this.w));
    }

    public byte[] Verify(byte[] bArr, byte[] bArr2) {
        int i;
        byte[] bArr3 = bArr2;
        int digestSize = this.messDigestOTS.getDigestSize();
        byte[] bArr4 = new byte[digestSize];
        this.messDigestOTS.update(bArr, 0, bArr.length);
        byte[] bArr5 = new byte[this.messDigestOTS.getDigestSize()];
        this.messDigestOTS.doFinal(bArr5, 0);
        int i2 = digestSize << 3;
        int i3 = ((this.w - 1) + i2) / this.w;
        int log = getLog((i3 << this.w) + 1);
        int i4 = ((((this.w + log) - 1) / this.w) + i3) * digestSize;
        if (i4 != bArr3.length) {
            return null;
        }
        byte[] bArr6 = new byte[i4];
        int i5 = 8;
        if (8 % this.w == 0) {
            int i6 = 8 / this.w;
            int i7 = (1 << this.w) - 1;
            byte[] bArr7 = new byte[digestSize];
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i8 < bArr5.length) {
                byte[] bArr8 = bArr7;
                int i11 = i10;
                int i12 = i9;
                int i13 = 0;
                while (i13 < i6) {
                    int i14 = bArr5[i8] & i7;
                    i12 += i14;
                    int i15 = i6;
                    int i16 = i11 * digestSize;
                    System.arraycopy(bArr3, i16, bArr8, 0, digestSize);
                    while (i14 < i7) {
                        this.messDigestOTS.update(bArr8, 0, bArr8.length);
                        bArr8 = new byte[this.messDigestOTS.getDigestSize()];
                        this.messDigestOTS.doFinal(bArr8, 0);
                        i14++;
                        i12 = i12;
                    }
                    System.arraycopy(bArr8, 0, bArr6, i16, digestSize);
                    bArr5[i8] = (byte) (bArr5[i8] >>> this.w);
                    i11++;
                    i13++;
                    i6 = i15;
                    bArr3 = bArr2;
                }
                i8++;
                i9 = i12;
                i10 = i11;
                bArr7 = bArr8;
                bArr3 = bArr2;
            }
            int i17 = (i3 << this.w) - i9;
            int i18 = 0;
            while (i18 < log) {
                int i19 = i10 * digestSize;
                System.arraycopy(bArr2, i19, bArr7, 0, digestSize);
                for (int i20 = i17 & i7; i20 < i7; i20++) {
                    this.messDigestOTS.update(bArr7, 0, bArr7.length);
                    bArr7 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr7, 0);
                }
                System.arraycopy(bArr7, 0, bArr6, i19, digestSize);
                i17 >>>= this.w;
                i10++;
                i18 += this.w;
            }
        } else if (this.w < 8) {
            int i21 = digestSize / this.w;
            int i22 = (1 << this.w) - 1;
            byte[] bArr9 = new byte[digestSize];
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            while (i23 < i21) {
                int i27 = i24;
                long j = 0;
                for (int i28 = 0; i28 < this.w; i28++) {
                    j ^= (bArr5[i27] & 255) << (i28 << 3);
                    i27++;
                }
                byte[] bArr10 = bArr9;
                int i29 = 0;
                while (i29 < i5) {
                    int i30 = log;
                    int i31 = (int) (j & i22);
                    i25 += i31;
                    int i32 = i26 * digestSize;
                    System.arraycopy(bArr3, i32, bArr10, 0, digestSize);
                    while (i31 < i22) {
                        this.messDigestOTS.update(bArr10, 0, bArr10.length);
                        bArr10 = new byte[this.messDigestOTS.getDigestSize()];
                        this.messDigestOTS.doFinal(bArr10, 0);
                        i31++;
                    }
                    System.arraycopy(bArr10, 0, bArr6, i32, digestSize);
                    j >>>= this.w;
                    i26++;
                    i29++;
                    log = i30;
                    i5 = 8;
                }
                i23++;
                bArr9 = bArr10;
                i24 = i27;
                i5 = 8;
            }
            int i33 = log;
            int i34 = digestSize % this.w;
            long j2 = 0;
            for (int i35 = 0; i35 < i34; i35++) {
                j2 ^= (bArr5[i24] & 255) << (i35 << 3);
                i24++;
            }
            int i36 = i34 << 3;
            byte[] bArr11 = bArr9;
            int i37 = 0;
            while (i37 < i36) {
                int i38 = (int) (j2 & i22);
                i25 += i38;
                int i39 = i26 * digestSize;
                System.arraycopy(bArr3, i39, bArr11, 0, digestSize);
                while (i38 < i22) {
                    this.messDigestOTS.update(bArr11, 0, bArr11.length);
                    bArr11 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr11, 0);
                    i38++;
                }
                System.arraycopy(bArr11, 0, bArr6, i39, digestSize);
                j2 >>>= this.w;
                i26++;
                i37 += this.w;
            }
            int i40 = (i3 << this.w) - i25;
            int i41 = 0;
            while (i41 < i33) {
                int i42 = i26 * digestSize;
                System.arraycopy(bArr3, i42, bArr11, 0, digestSize);
                for (int i43 = i40 & i22; i43 < i22; i43++) {
                    this.messDigestOTS.update(bArr11, 0, bArr11.length);
                    bArr11 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr11, 0);
                }
                System.arraycopy(bArr11, 0, bArr6, i42, digestSize);
                i40 >>>= this.w;
                i26++;
                i41 += this.w;
            }
        } else if (this.w < 57) {
            int i44 = i2 - this.w;
            int i45 = (1 << this.w) - 1;
            byte[] bArr12 = new byte[digestSize];
            int i46 = 0;
            int i47 = 0;
            int i48 = 0;
            while (i46 <= i44) {
                int i49 = i46 >>> 3;
                int i50 = i46 % 8;
                i46 += this.w;
                int i51 = i49;
                int i52 = 0;
                long j3 = 0;
                while (i51 < ((i46 + 7) >>> 3)) {
                    j3 ^= (bArr5[i51] & 255) << (i52 << 3);
                    i52++;
                    i51++;
                    i3 = i3;
                    i44 = i44;
                }
                int i53 = i44;
                int i54 = i3;
                long j4 = i45;
                long j5 = (j3 >>> i50) & j4;
                int i55 = i45;
                i47 = (int) (i47 + j5);
                int i56 = i48 * digestSize;
                System.arraycopy(bArr3, i56, bArr12, 0, digestSize);
                while (j5 < j4) {
                    this.messDigestOTS.update(bArr12, 0, bArr12.length);
                    bArr12 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr12, 0);
                    j5++;
                    i46 = i46;
                    i47 = i47;
                }
                System.arraycopy(bArr12, 0, bArr6, i56, digestSize);
                i48++;
                i3 = i54;
                i44 = i53;
                i45 = i55;
            }
            int i57 = i3;
            int i58 = i45;
            int i59 = i46 >>> 3;
            if (i59 < digestSize) {
                int i60 = i46 % 8;
                int i61 = 0;
                long j6 = 0;
                while (i59 < digestSize) {
                    j6 ^= (bArr5[i59] & 255) << (i61 << 3);
                    i61++;
                    i59++;
                }
                long j7 = i58;
                long j8 = (j6 >>> i60) & j7;
                i = i58;
                i47 = (int) (i47 + j8);
                int i62 = i48 * digestSize;
                System.arraycopy(bArr3, i62, bArr12, 0, digestSize);
                while (j8 < j7) {
                    this.messDigestOTS.update(bArr12, 0, bArr12.length);
                    bArr12 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr12, 0);
                    j8++;
                }
                System.arraycopy(bArr12, 0, bArr6, i62, digestSize);
                i48++;
            } else {
                i = i58;
            }
            int i63 = (i57 << this.w) - i47;
            int i64 = 0;
            while (i64 < log) {
                int i65 = i48 * digestSize;
                System.arraycopy(bArr3, i65, bArr12, 0, digestSize);
                byte[] bArr13 = bArr6;
                byte[] bArr14 = bArr12;
                int i66 = i;
                for (long j9 = i63 & i; j9 < i66; j9++) {
                    this.messDigestOTS.update(bArr14, 0, bArr14.length);
                    bArr14 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr14, 0);
                }
                System.arraycopy(bArr14, 0, bArr13, i65, digestSize);
                i63 >>>= this.w;
                i48++;
                i64 += this.w;
                i = i66;
                bArr6 = bArr13;
                bArr12 = bArr14;
            }
        }
        byte[] bArr15 = bArr6;
        byte[] bArr16 = new byte[digestSize];
        this.messDigestOTS.update(bArr15, 0, bArr15.length);
        byte[] bArr17 = new byte[this.messDigestOTS.getDigestSize()];
        this.messDigestOTS.doFinal(bArr17, 0);
        return bArr17;
    }
}
