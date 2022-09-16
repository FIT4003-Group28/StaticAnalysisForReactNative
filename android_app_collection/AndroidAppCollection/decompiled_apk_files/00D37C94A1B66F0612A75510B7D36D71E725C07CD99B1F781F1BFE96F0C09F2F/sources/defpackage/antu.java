package defpackage;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: antu  reason: default package */
/* loaded from: classes.dex */
public final class antu {
    private static final antp b = new antp(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    private static final antr c = new antr(new ants(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    static final byte[] a = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    public static int a(long[] jArr) {
        return anue.g(jArr)[0] & 1;
    }

    public static void b(long[] jArr, long[] jArr2) {
        for (int i = 0; i < jArr2.length; i++) {
            jArr[i] = -jArr2[i];
        }
    }

    public static boolean c(long[] jArr) {
        long[] jArr2 = new long[11];
        System.arraycopy(jArr, 0, jArr2, 0, 10);
        anue.c(jArr2);
        byte[] g = anue.g(jArr2);
        for (int i = 0; i < 32; i++) {
            if (g[i] != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        char c2;
        byte b2;
        int i;
        byte b3;
        byte[] bArr4 = bArr2;
        int i2 = 0;
        if (bArr4.length != 64) {
            return false;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr4, 32, 64);
        int i3 = 31;
        int i4 = 31;
        while (i4 >= 0) {
            int i5 = copyOfRange[i4] & 255;
            int i6 = a[i4] & 255;
            if (i5 != i6) {
                if (i5 >= i6) {
                    return false;
                }
                MessageDigest messageDigest = (MessageDigest) anub.d.a("SHA-512");
                messageDigest.update(bArr4, i2, 32);
                messageDigest.update(bArr3);
                messageDigest.update(bArr);
                byte[] digest = messageDigest.digest();
                long h = h(digest, 39);
                long h2 = h(digest, 42);
                long i7 = i(digest, 44);
                long h3 = (h(digest, 47) >> 2) & 2097151;
                long i8 = (i(digest, 49) >> 7) & 2097151;
                long i9 = (i(digest, 52) >> 4) & 2097151;
                long h4 = (h(digest, 55) >> 1) & 2097151;
                long i10 = (i(digest, 57) >> 6) & 2097151;
                long i11 = i(digest, 60) >> 3;
                long j = (h2 & 2097151) - (i11 * 683901);
                long i12 = ((((i(digest, 36) >> 6) & 2097151) - (i11 * 997805)) + (i10 * 136657)) - (h4 * 683901);
                long i13 = ((((((i(digest, i3) >> 4) & 2097151) + (i11 * 470296)) + (i10 * 654183)) - (h4 * 997805)) + (i9 * 136657)) - (i8 * 683901);
                long i14 = ((i(digest, 15) >> 6) & 2097151) + (h3 * 666643);
                long h5 = (h(digest, 21) & 2097151) + (i9 * 666643) + (i8 * 470296) + (h3 * 654183);
                long h6 = ((((((h(digest, 26) >> 2) & 2097151) + (i10 * 666643)) + (h4 * 470296)) + (i9 * 654183)) - (i8 * 997805)) + (h3 * 136657);
                long j2 = (i14 + 1048576) >> 21;
                long h7 = (h(digest, 18) >> 3) + (i8 * 666643) + (h3 * 470296) + j2;
                long j3 = (h5 + 1048576) >> 21;
                long i15 = ((((((i(digest, 23) >> 5) & 2097151) + (h4 * 666643)) + (i9 * 470296)) + (i8 * 654183)) - (h3 * 997805)) + j3;
                long j4 = (h6 + 1048576) >> 21;
                long i16 = ((((((((i(digest, 28) >> 7) & 2097151) + (i11 * 666643)) + (i10 * 470296)) + (h4 * 654183)) - (i9 * 997805)) + (i8 * 136657)) - (h3 * 683901)) + j4;
                long j5 = (i13 + 1048576) >> 21;
                long h8 = ((((((h(digest, 34) >> 1) & 2097151) + (i11 * 654183)) - (i10 * 997805)) + (h4 * 136657)) - (i9 * 683901)) + j5;
                long j6 = (i12 + 1048576) >> 21;
                long j7 = (((h >> 3) + (i11 * 136657)) - (i10 * 683901)) + j6;
                long j8 = (j + 1048576) >> 21;
                long j9 = ((i7 >> 5) & 2097151) + j8;
                long j10 = (h7 + 1048576) >> 21;
                long j11 = (i15 + 1048576) >> 21;
                long j12 = (i16 + 1048576) >> 21;
                long j13 = (i13 - (j5 << 21)) + j12;
                long j14 = (h8 + 1048576) >> 21;
                long j15 = (i12 - (j6 << 21)) + j14;
                long j16 = h8 - (j14 << 21);
                long j17 = (j7 + 1048576) >> 21;
                long j18 = (j - (j8 << 21)) + j17;
                long j19 = j7 - (j17 << 21);
                long j20 = ((h6 - (j4 << 21)) + j11) - (j9 * 683901);
                long j21 = ((((h5 - (j3 << 21)) + j10) - (j9 * 997805)) + (j18 * 136657)) - (j19 * 683901);
                long j22 = (((((i14 - (j2 << 21)) + (j9 * 470296)) + (j18 * 654183)) - (j19 * 997805)) + (j15 * 136657)) - (j16 * 683901);
                long h9 = (h(digest, i2) & 2097151) + (j13 * 666643);
                long h10 = ((h(digest, 5) >> 2) & 2097151) + (j15 * 666643) + (j16 * 470296) + (j13 * 654183);
                long i17 = ((((((i(digest, 10) >> 4) & 2097151) + (j18 * 666643)) + (j19 * 470296)) + (j15 * 654183)) - (j16 * 997805)) + (j13 * 136657);
                long j23 = (h9 + 1048576) >> 21;
                long i18 = ((i(digest, 2) >> 5) & 2097151) + (j16 * 666643) + (j13 * 470296) + j23;
                long j24 = (h10 + 1048576) >> 21;
                long i19 = ((((((i(digest, 7) >> 7) & 2097151) + (j19 * 666643)) + (j15 * 470296)) + (j16 * 654183)) - (j13 * 997805)) + j24;
                long j25 = (i17 + 1048576) >> 21;
                long h11 = ((((((((h(digest, 13) >> 1) & 2097151) + (j9 * 666643)) + (j18 * 470296)) + (j19 * 654183)) - (j15 * 997805)) + (j16 * 136657)) - (j13 * 683901)) + j25;
                long j26 = (j22 + 1048576) >> 21;
                long j27 = (((((h7 - (j10 << 21)) + (j9 * 654183)) - (j18 * 997805)) + (j19 * 136657)) - (j15 * 683901)) + j26;
                long j28 = (j21 + 1048576) >> 21;
                long j29 = (((i15 - (j11 << 21)) + (j9 * 136657)) - (j18 * 683901)) + j28;
                long j30 = (j20 + 1048576) >> 21;
                long j31 = (i16 - (j12 << 21)) + j30;
                long j32 = (i18 + 1048576) >> 21;
                long j33 = (i19 + 1048576) >> 21;
                long j34 = (h11 + 1048576) >> 21;
                long j35 = (j27 + 1048576) >> 21;
                long j36 = (j29 + 1048576) >> 21;
                long j37 = (j31 + 1048576) >> 21;
                long j38 = (h9 - (j23 << 21)) + (j37 * 666643);
                long j39 = j38 >> 21;
                long j40 = (i18 - (j32 << 21)) + (j37 * 470296) + j39;
                long j41 = j40 >> 21;
                long j42 = (h10 - (j24 << 21)) + j32 + (j37 * 654183) + j41;
                long j43 = j42 >> 21;
                long j44 = ((i19 - (j33 << 21)) - (j37 * 997805)) + j43;
                long j45 = j44 >> 21;
                long j46 = (i17 - (j25 << 21)) + j33 + (j37 * 136657) + j45;
                long j47 = j46 >> 21;
                long j48 = ((h11 - (j34 << 21)) - (j37 * 683901)) + j47;
                long j49 = j48 >> 21;
                long j50 = (j22 - (j26 << 21)) + j34 + j49;
                long j51 = j50 >> 21;
                long j52 = (j27 - (j35 << 21)) + j51;
                long j53 = j52 >> 21;
                long j54 = (j21 - (j28 << 21)) + j35 + j53;
                long j55 = j54 >> 21;
                long j56 = (j29 - (j36 << 21)) + j55;
                long j57 = j56 >> 21;
                long j58 = (j20 - (j30 << 21)) + j36 + j57;
                long j59 = j58 >> 21;
                long j60 = (j31 - (j37 << 21)) + j59;
                long j61 = j60 >> 21;
                long j62 = (j38 - (j39 << 21)) + (666643 * j61);
                long j63 = j62 >> 21;
                long j64 = (j40 - (j41 << 21)) + (470296 * j61) + j63;
                long j65 = j62 - (j63 << 21);
                long j66 = j64 >> 21;
                long j67 = (j42 - (j43 << 21)) + (654183 * j61) + j66;
                long j68 = j64 - (j66 << 21);
                long j69 = j67 >> 21;
                long j70 = ((j44 - (j45 << 21)) - (997805 * j61)) + j69;
                long j71 = j67 - (j69 << 21);
                long j72 = j70 >> 21;
                long j73 = (j46 - (j47 << 21)) + (136657 * j61) + j72;
                long j74 = j70 - (j72 << 21);
                long j75 = j73 >> 21;
                long j76 = ((j48 - (j49 << 21)) - (683901 * j61)) + j75;
                long j77 = j73 - (j75 << 21);
                long j78 = j76 >> 21;
                long j79 = (j50 - (j51 << 21)) + j78;
                long j80 = j76 - (j78 << 21);
                long j81 = j79 >> 21;
                long j82 = (j52 - (j53 << 21)) + j81;
                long j83 = j79 - (j81 << 21);
                long j84 = j82 >> 21;
                long j85 = (j54 - (j55 << 21)) + j84;
                long j86 = j82 - (j84 << 21);
                long j87 = j85 >> 21;
                long j88 = (j56 - (j57 << 21)) + j87;
                long j89 = j85 - (j87 << 21);
                long j90 = j88 >> 21;
                long j91 = (j58 - (j59 << 21)) + j90;
                long j92 = j88 - (j90 << 21);
                long j93 = j91 >> 21;
                long j94 = (j60 - (j61 << 21)) + j93;
                long j95 = j91 - (j93 << 21);
                digest[0] = (byte) j65;
                digest[1] = (byte) (j65 >> 8);
                digest[2] = (byte) ((j65 >> 16) | (j68 << 5));
                digest[3] = (byte) (j68 >> 3);
                digest[4] = (byte) (j68 >> 11);
                digest[5] = (byte) ((j68 >> 19) | (j71 << 2));
                digest[6] = (byte) (j71 >> 6);
                digest[7] = (byte) ((j71 >> 14) | (j74 << 7));
                digest[8] = (byte) (j74 >> 1);
                digest[9] = (byte) (j74 >> 9);
                digest[10] = (byte) ((j74 >> 17) | (j77 << 4));
                digest[11] = (byte) (j77 >> 4);
                digest[12] = (byte) (j77 >> 12);
                digest[13] = (byte) ((j77 >> 20) | (j80 + j80));
                digest[14] = (byte) (j80 >> 7);
                digest[15] = (byte) ((j80 >> 15) | (j83 << 6));
                digest[16] = (byte) (j83 >> 2);
                digest[17] = (byte) (j83 >> 10);
                digest[18] = (byte) ((j83 >> 18) | (j86 << 3));
                digest[19] = (byte) (j86 >> 5);
                digest[20] = (byte) (j86 >> 13);
                digest[21] = (byte) j89;
                digest[22] = (byte) (j89 >> 8);
                digest[23] = (byte) ((j89 >> 16) | (j92 << 5));
                digest[24] = (byte) (j92 >> 3);
                digest[25] = (byte) (j92 >> 11);
                digest[26] = (byte) ((j92 >> 19) | (j95 << 2));
                digest[27] = (byte) (j95 >> 6);
                digest[28] = (byte) ((j95 >> 14) | (j94 << 7));
                digest[29] = (byte) (j94 >> 1);
                digest[30] = (byte) (j94 >> 9);
                digest[i3] = (byte) (j94 >> 17);
                long[] jArr = new long[10];
                long[] h12 = anue.h(bArr3);
                long[] jArr2 = new long[10];
                jArr2[0] = 1;
                long[] jArr3 = new long[10];
                long[] jArr4 = new long[10];
                long[] jArr5 = new long[10];
                long[] jArr6 = new long[10];
                long[] jArr7 = new long[10];
                anue.d(jArr4, h12);
                anue.a(jArr5, jArr4, antw.a);
                anue.e(jArr4, jArr4, jArr2);
                anue.f(jArr5, jArr5, jArr2);
                long[] jArr8 = new long[10];
                anue.d(jArr8, jArr5);
                anue.a(jArr8, jArr8, jArr5);
                anue.d(jArr, jArr8);
                anue.a(jArr, jArr, jArr5);
                anue.a(jArr, jArr, jArr4);
                long[] jArr9 = new long[10];
                long[] jArr10 = new long[10];
                long[] jArr11 = new long[10];
                anue.d(jArr9, jArr);
                anue.d(jArr10, jArr9);
                anue.d(jArr10, jArr10);
                anue.a(jArr10, jArr, jArr10);
                anue.a(jArr9, jArr9, jArr10);
                anue.d(jArr9, jArr9);
                anue.a(jArr9, jArr10, jArr9);
                anue.d(jArr10, jArr9);
                byte[] bArr5 = copyOfRange;
                for (int i20 = 1; i20 < 5; i20++) {
                    anue.d(jArr10, jArr10);
                }
                anue.a(jArr9, jArr10, jArr9);
                anue.d(jArr10, jArr9);
                for (int i21 = 1; i21 < 10; i21++) {
                    anue.d(jArr10, jArr10);
                }
                anue.a(jArr10, jArr10, jArr9);
                anue.d(jArr11, jArr10);
                for (int i22 = 1; i22 < 20; i22++) {
                    anue.d(jArr11, jArr11);
                }
                anue.a(jArr10, jArr11, jArr10);
                anue.d(jArr10, jArr10);
                for (int i23 = 1; i23 < 10; i23++) {
                    anue.d(jArr10, jArr10);
                }
                anue.a(jArr9, jArr10, jArr9);
                anue.d(jArr10, jArr9);
                for (int i24 = 1; i24 < 50; i24++) {
                    anue.d(jArr10, jArr10);
                }
                anue.a(jArr10, jArr10, jArr9);
                anue.d(jArr11, jArr10);
                for (int i25 = 1; i25 < 100; i25++) {
                    anue.d(jArr11, jArr11);
                }
                anue.a(jArr10, jArr11, jArr10);
                anue.d(jArr10, jArr10);
                for (int i26 = 1; i26 < 50; i26++) {
                    anue.d(jArr10, jArr10);
                }
                anue.a(jArr9, jArr10, jArr9);
                anue.d(jArr9, jArr9);
                anue.d(jArr9, jArr9);
                anue.a(jArr, jArr9, jArr);
                anue.a(jArr, jArr, jArr8);
                anue.a(jArr, jArr, jArr4);
                anue.d(jArr6, jArr);
                anue.a(jArr6, jArr6, jArr5);
                anue.e(jArr7, jArr6, jArr4);
                if (c(jArr7)) {
                    anue.f(jArr7, jArr6, jArr4);
                    if (c(jArr7)) {
                        throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                    }
                    anue.a(jArr, jArr, antw.c);
                }
                if (!c(jArr)) {
                    c2 = 31;
                    b2 = 255;
                    i = 7;
                    if (((bArr3[31] & 255) >> 7) != 0) {
                        throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
                    }
                } else {
                    c2 = 31;
                    b2 = 255;
                    i = 7;
                }
                if (a(jArr) == ((bArr3[c2] & b2) >> i)) {
                    b(jArr, jArr);
                }
                anue.a(jArr3, jArr, h12);
                antt anttVar = new antt(new ants(jArr, h12, jArr2), jArr3);
                antq[] antqVarArr = new antq[8];
                antqVarArr[0] = new antq(anttVar);
                antr antrVar = new antr(new ants(), new long[10]);
                k(antrVar, anttVar.a);
                antt anttVar2 = new antt(antrVar);
                for (int i27 = 1; i27 < 8; i27++) {
                    j(antrVar, anttVar2, antqVarArr[i27 - 1]);
                    antqVarArr[i27] = new antq(new antt(antrVar));
                }
                byte[] n = n(digest);
                byte[] n2 = n(bArr5);
                antr antrVar2 = new antr(c);
                antt anttVar3 = new antt();
                int i28 = PrivateKeyType.INVALID;
                while (i28 >= 0 && n[i28] == 0 && n2[i28] == 0) {
                    i28--;
                }
                while (i28 >= 0) {
                    k(antrVar2, new ants(antrVar2));
                    byte b4 = n[i28];
                    if (b4 > 0) {
                        antt.a(anttVar3, antrVar2);
                        b3 = 2;
                        j(antrVar2, anttVar3, antqVarArr[n[i28] / 2]);
                    } else {
                        b3 = 2;
                        if (b4 < 0) {
                            antt.a(anttVar3, antrVar2);
                            m(antrVar2, anttVar3, antqVarArr[(-n[i28]) / 2]);
                        }
                    }
                    byte b5 = n2[i28];
                    if (b5 > 0) {
                        antt.a(anttVar3, antrVar2);
                        j(antrVar2, anttVar3, antw.e[n2[i28] / b3]);
                    } else if (b5 < 0) {
                        antt.a(anttVar3, antrVar2);
                        m(antrVar2, anttVar3, antw.e[(-n2[i28]) / b3]);
                    }
                    i28--;
                }
                byte[] a2 = new ants(antrVar2).a();
                for (int i29 = 0; i29 < 32; i29++) {
                    if (a2[i29] != bArr2[i29]) {
                        return false;
                    }
                }
                return true;
            }
            i4--;
            bArr4 = bArr2;
            copyOfRange = copyOfRange;
            i2 = 0;
            i3 = 31;
        }
        return false;
    }

    public static byte[] e(byte[] bArr) {
        MessageDigest messageDigest = (MessageDigest) anub.d.a("SHA-512");
        messageDigest.update(bArr, 0, 32);
        byte[] digest = messageDigest.digest();
        digest[0] = (byte) (digest[0] & 248);
        int i = digest[31] & Byte.MAX_VALUE;
        digest[31] = (byte) i;
        digest[31] = (byte) (i | 64);
        return digest;
    }

    public static byte[] f(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[64];
        int i2 = 0;
        while (true) {
            if (i2 >= 32) {
                break;
            }
            int i3 = i2 + i2;
            bArr2[i3] = (byte) (bArr[i2] & 15);
            bArr2[i3 + 1] = (byte) ((bArr[i2] & 255) >> 4);
            i2++;
        }
        int i4 = 0;
        byte b2 = 0;
        while (i4 < 63) {
            byte b3 = (byte) (bArr2[i4] + b2);
            bArr2[i4] = b3;
            int i5 = (b3 + 8) >> 4;
            bArr2[i4] = (byte) (b3 - (i5 << 4));
            i4++;
            b2 = i5;
        }
        bArr2[63] = (byte) (bArr2[63] + b2);
        antr antrVar = new antr(c);
        antt anttVar = new antt();
        for (i = 1; i < 64; i += 2) {
            antp antpVar = new antp(b);
            l(antpVar, i / 2, bArr2[i]);
            antt.a(anttVar, antrVar);
            j(antrVar, anttVar, antpVar);
        }
        ants antsVar = new ants();
        ants.b(antsVar, antrVar);
        k(antrVar, antsVar);
        ants.b(antsVar, antrVar);
        k(antrVar, antsVar);
        ants.b(antsVar, antrVar);
        k(antrVar, antsVar);
        ants.b(antsVar, antrVar);
        k(antrVar, antsVar);
        for (int i6 = 0; i6 < 64; i6 += 2) {
            antp antpVar2 = new antp(b);
            l(antpVar2, i6 / 2, bArr2[i6]);
            antt.a(anttVar, antrVar);
            j(antrVar, anttVar, antpVar2);
        }
        ants antsVar2 = new ants(antrVar);
        long[] jArr = new long[10];
        anue.d(jArr, antsVar2.a);
        long[] jArr2 = new long[10];
        anue.d(jArr2, antsVar2.b);
        long[] jArr3 = new long[10];
        anue.d(jArr3, antsVar2.c);
        long[] jArr4 = new long[10];
        anue.d(jArr4, jArr3);
        long[] jArr5 = new long[10];
        anue.e(jArr5, jArr2, jArr);
        anue.a(jArr5, jArr5, jArr3);
        long[] jArr6 = new long[10];
        anue.a(jArr6, jArr, jArr2);
        anue.a(jArr6, jArr6, antw.a);
        anue.f(jArr6, jArr6, jArr4);
        anue.b(jArr6, jArr6);
        if (antz.n(anue.g(jArr5), anue.g(jArr6))) {
            return antsVar2.a();
        }
        throw new IllegalStateException("arithmetic error in scalar multiplication");
    }

    private static int g(int i, int i2) {
        int i3 = ((i ^ i2) ^ (-1)) & PrivateKeyType.INVALID;
        int i4 = i3 & (i3 << 4);
        int i5 = i4 & (i4 << 2);
        return (i5 & (i5 + i5)) >> 7;
    }

    private static long h(byte[] bArr, int i) {
        return ((bArr[i + 2] & 255) << 16) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    private static long i(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | h(bArr, i);
    }

    private static void j(antr antrVar, antt anttVar, antp antpVar) {
        long[] jArr = new long[10];
        long[] jArr2 = antrVar.a.a;
        ants antsVar = anttVar.a;
        anue.f(jArr2, antsVar.b, antsVar.a);
        long[] jArr3 = antrVar.a.b;
        ants antsVar2 = anttVar.a;
        anue.e(jArr3, antsVar2.b, antsVar2.a);
        long[] jArr4 = antrVar.a.b;
        anue.a(jArr4, jArr4, antpVar.b);
        ants antsVar3 = antrVar.a;
        anue.a(antsVar3.c, antsVar3.a, antpVar.a);
        anue.a(antrVar.b, anttVar.b, antpVar.c);
        antpVar.b(antrVar.a.a, anttVar.a.c);
        long[] jArr5 = antrVar.a.a;
        anue.f(jArr, jArr5, jArr5);
        ants antsVar4 = antrVar.a;
        anue.e(antsVar4.a, antsVar4.c, antsVar4.b);
        ants antsVar5 = antrVar.a;
        long[] jArr6 = antsVar5.b;
        anue.f(jArr6, antsVar5.c, jArr6);
        anue.f(antrVar.a.c, jArr, antrVar.b);
        long[] jArr7 = antrVar.b;
        anue.e(jArr7, jArr, jArr7);
    }

    private static void k(antr antrVar, ants antsVar) {
        long[] jArr = new long[10];
        anue.d(antrVar.a.a, antsVar.a);
        anue.d(antrVar.a.c, antsVar.b);
        anue.d(antrVar.b, antsVar.c);
        long[] jArr2 = antrVar.b;
        anue.f(jArr2, jArr2, jArr2);
        anue.f(antrVar.a.b, antsVar.a, antsVar.b);
        anue.d(jArr, antrVar.a.b);
        ants antsVar2 = antrVar.a;
        anue.f(antsVar2.b, antsVar2.c, antsVar2.a);
        ants antsVar3 = antrVar.a;
        long[] jArr3 = antsVar3.c;
        anue.e(jArr3, jArr3, antsVar3.a);
        ants antsVar4 = antrVar.a;
        anue.e(antsVar4.a, jArr, antsVar4.b);
        long[] jArr4 = antrVar.b;
        anue.e(jArr4, jArr4, antrVar.a.c);
    }

    private static void l(antp antpVar, int i, byte b2) {
        int i2 = (b2 & 255) >> 7;
        int i3 = (-i2) & b2;
        int i4 = b2 - (i3 + i3);
        antpVar.a(antw.d[i][0], g(i4, 1));
        antpVar.a(antw.d[i][1], g(i4, 2));
        antpVar.a(antw.d[i][2], g(i4, 3));
        antpVar.a(antw.d[i][3], g(i4, 4));
        antpVar.a(antw.d[i][4], g(i4, 5));
        antpVar.a(antw.d[i][5], g(i4, 6));
        antpVar.a(antw.d[i][6], g(i4, 7));
        antpVar.a(antw.d[i][7], g(i4, 8));
        long[] copyOf = Arrays.copyOf(antpVar.b, 10);
        long[] copyOf2 = Arrays.copyOf(antpVar.a, 10);
        long[] copyOf3 = Arrays.copyOf(antpVar.c, 10);
        b(copyOf3, copyOf3);
        antpVar.a(new antp(copyOf, copyOf2, copyOf3), i2);
    }

    private static void m(antr antrVar, antt anttVar, antp antpVar) {
        long[] jArr = new long[10];
        long[] jArr2 = antrVar.a.a;
        ants antsVar = anttVar.a;
        anue.f(jArr2, antsVar.b, antsVar.a);
        long[] jArr3 = antrVar.a.b;
        ants antsVar2 = anttVar.a;
        anue.e(jArr3, antsVar2.b, antsVar2.a);
        long[] jArr4 = antrVar.a.b;
        anue.a(jArr4, jArr4, antpVar.a);
        ants antsVar3 = antrVar.a;
        anue.a(antsVar3.c, antsVar3.a, antpVar.b);
        anue.a(antrVar.b, anttVar.b, antpVar.c);
        antpVar.b(antrVar.a.a, anttVar.a.c);
        long[] jArr5 = antrVar.a.a;
        anue.f(jArr, jArr5, jArr5);
        ants antsVar4 = antrVar.a;
        anue.e(antsVar4.a, antsVar4.c, antsVar4.b);
        ants antsVar5 = antrVar.a;
        long[] jArr6 = antsVar5.b;
        anue.f(jArr6, antsVar5.c, jArr6);
        anue.e(antrVar.a.c, jArr, antrVar.b);
        long[] jArr7 = antrVar.b;
        anue.f(jArr7, jArr, jArr7);
    }

    private static byte[] n(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[256];
        for (int i2 = 0; i2 < 256; i2++) {
            bArr2[i2] = (byte) (1 & ((bArr[i2 >> 3] & 255) >> (i2 & 7)));
        }
        for (int i3 = 0; i3 < 256; i3++) {
            if (bArr2[i3] != 0) {
                for (int i4 = 1; i4 <= 6 && (i = i3 + i4) < 256; i4++) {
                    byte b2 = bArr2[i];
                    if (b2 != 0) {
                        byte b3 = bArr2[i3];
                        int i5 = b2 << i4;
                        int i6 = b3 + i5;
                        if (i6 > 15) {
                            int i7 = b3 - i5;
                            if (i7 >= -15) {
                                bArr2[i3] = (byte) i7;
                                while (true) {
                                    if (i < 256) {
                                        if (bArr2[i] != 0) {
                                            bArr2[i] = 0;
                                            i++;
                                        } else {
                                            bArr2[i] = 1;
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                        } else {
                            bArr2[i3] = (byte) i6;
                            bArr2[i] = 0;
                        }
                    }
                }
            }
        }
        return bArr2;
    }
}
