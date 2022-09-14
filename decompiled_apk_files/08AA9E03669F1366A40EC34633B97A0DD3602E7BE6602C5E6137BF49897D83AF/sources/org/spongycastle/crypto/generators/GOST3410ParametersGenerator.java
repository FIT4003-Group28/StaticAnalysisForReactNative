package org.spongycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.params.GOST3410Parameters;
import org.spongycastle.crypto.params.GOST3410ValidationParameters;
/* loaded from: classes.dex */
public class GOST3410ParametersGenerator {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger TWO = BigInteger.valueOf(2);
    private SecureRandom init_random;
    private int size;
    private int typeproc;

    public void init(int i, int i2, SecureRandom secureRandom) {
        this.size = i;
        this.typeproc = i2;
        this.init_random = secureRandom;
    }

    private int procedure_A(int i, int i2, BigInteger[] bigIntegerArr, int i3) {
        BigInteger[] bigIntegerArr2;
        BigInteger bigInteger;
        int i4;
        BigInteger bigInteger2;
        int i5 = i;
        while (true) {
            if (i5 >= 0 && i5 <= 65536) {
                break;
            }
            i5 = this.init_random.nextInt() / 32768;
        }
        int i6 = i2;
        while (true) {
            if (i6 >= 0 && i6 <= 65536 && i6 / 2 != 0) {
                break;
            }
            i6 = (this.init_random.nextInt() / 32768) + 1;
        }
        BigInteger bigInteger3 = new BigInteger(Integer.toString(i6));
        BigInteger bigInteger4 = new BigInteger("19381");
        BigInteger bigInteger5 = new BigInteger(Integer.toString(i5));
        int i7 = 0;
        BigInteger[] bigIntegerArr3 = {bigInteger5};
        int[] iArr = {i3};
        int i8 = 0;
        int i9 = 0;
        while (iArr[i8] >= 17) {
            int[] iArr2 = new int[iArr.length + 1];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            iArr = new int[iArr2.length];
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            i9 = i8 + 1;
            iArr[i9] = iArr[i8] / 2;
            i8 = i9;
        }
        BigInteger[] bigIntegerArr4 = new BigInteger[i9 + 1];
        int i10 = 16;
        bigIntegerArr4[i9] = new BigInteger("8003", 16);
        int i11 = i9 - 1;
        BigInteger[] bigIntegerArr5 = bigIntegerArr3;
        int i12 = 0;
        while (i12 < i9) {
            int i13 = iArr[i11] / i10;
            while (true) {
                BigInteger[] bigIntegerArr6 = new BigInteger[bigIntegerArr5.length];
                System.arraycopy(bigIntegerArr5, i7, bigIntegerArr6, i7, bigIntegerArr5.length);
                bigIntegerArr2 = new BigInteger[i13 + 1];
                System.arraycopy(bigIntegerArr6, i7, bigIntegerArr2, i7, bigIntegerArr6.length);
                int i14 = 0;
                while (i14 < i13) {
                    int i15 = i14 + 1;
                    bigIntegerArr2[i15] = bigIntegerArr2[i14].multiply(bigInteger4).add(bigInteger3).mod(TWO.pow(i10));
                    i14 = i15;
                }
                BigInteger bigInteger6 = new BigInteger("0");
                for (int i16 = 0; i16 < i13; i16++) {
                    bigInteger6 = bigInteger6.add(bigIntegerArr2[i16].multiply(TWO.pow(i16 * 16)));
                }
                bigIntegerArr2[0] = bigIntegerArr2[i13];
                int i17 = i11 + 1;
                bigInteger = bigInteger3;
                BigInteger add = TWO.pow(iArr[i11] - 1).divide(bigIntegerArr4[i17]).add(TWO.pow(iArr[i11] - 1).multiply(bigInteger6).divide(bigIntegerArr4[i17].multiply(TWO.pow(i13 * 16))));
                if (add.mod(TWO).compareTo(ONE) == 0) {
                    add = add.add(ONE);
                }
                int i18 = 0;
                while (true) {
                    i4 = i13;
                    long j = i18;
                    bigIntegerArr4[i11] = bigIntegerArr4[i17].multiply(add.add(BigInteger.valueOf(j))).add(ONE);
                    bigInteger2 = bigInteger4;
                    if (bigIntegerArr4[i11].compareTo(TWO.pow(iArr[i11])) == 1) {
                        break;
                    }
                    if (TWO.modPow(bigIntegerArr4[i17].multiply(add.add(BigInteger.valueOf(j))), bigIntegerArr4[i11]).compareTo(ONE) == 0 && TWO.modPow(add.add(BigInteger.valueOf(j)), bigIntegerArr4[i11]).compareTo(ONE) != 0) {
                        break;
                    }
                    i18 += 2;
                    i13 = i4;
                    bigInteger4 = bigInteger2;
                }
                bigIntegerArr5 = bigIntegerArr2;
                bigInteger3 = bigInteger;
                i13 = i4;
                bigInteger4 = bigInteger2;
                i7 = 0;
                i10 = 16;
            }
            i11--;
            if (i11 < 0) {
                bigIntegerArr[0] = bigIntegerArr4[0];
                bigIntegerArr[1] = bigIntegerArr4[1];
                return bigIntegerArr2[0].intValue();
            }
            i12++;
            bigIntegerArr5 = bigIntegerArr2;
            bigInteger3 = bigInteger;
            bigInteger4 = bigInteger2;
            i7 = 0;
            i10 = 16;
        }
        return bigIntegerArr5[0].intValue();
    }

    private long procedure_Aa(long j, long j2, BigInteger[] bigIntegerArr, int i) {
        BigInteger[] bigIntegerArr2;
        BigInteger bigInteger;
        int i2;
        BigInteger bigInteger2;
        long j3 = j;
        while (true) {
            if (j3 >= 0 && j3 <= 4294967296L) {
                break;
            }
            j3 = this.init_random.nextInt() * 2;
        }
        long j4 = j2;
        while (true) {
            if (j4 >= 0 && j4 <= 4294967296L && j4 / 2 != 0) {
                break;
            }
            j4 = (this.init_random.nextInt() * 2) + 1;
        }
        BigInteger bigInteger3 = new BigInteger(Long.toString(j4));
        BigInteger bigInteger4 = new BigInteger("97781173");
        BigInteger bigInteger5 = new BigInteger(Long.toString(j3));
        int i3 = 0;
        BigInteger[] bigIntegerArr3 = {bigInteger5};
        int[] iArr = {i};
        int i4 = 0;
        int i5 = 0;
        while (iArr[i4] >= 33) {
            int[] iArr2 = new int[iArr.length + 1];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            iArr = new int[iArr2.length];
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            i5 = i4 + 1;
            iArr[i5] = iArr[i4] / 2;
            i4 = i5;
        }
        BigInteger[] bigIntegerArr4 = new BigInteger[i5 + 1];
        bigIntegerArr4[i5] = new BigInteger("8000000B", 16);
        int i6 = i5 - 1;
        BigInteger[] bigIntegerArr5 = bigIntegerArr3;
        int i7 = 0;
        while (i7 < i5) {
            int i8 = 32;
            int i9 = iArr[i6] / 32;
            while (true) {
                BigInteger[] bigIntegerArr6 = new BigInteger[bigIntegerArr5.length];
                System.arraycopy(bigIntegerArr5, i3, bigIntegerArr6, i3, bigIntegerArr5.length);
                bigIntegerArr2 = new BigInteger[i9 + 1];
                System.arraycopy(bigIntegerArr6, i3, bigIntegerArr2, i3, bigIntegerArr6.length);
                int i10 = 0;
                while (i10 < i9) {
                    int i11 = i10 + 1;
                    bigIntegerArr2[i11] = bigIntegerArr2[i10].multiply(bigInteger4).add(bigInteger3).mod(TWO.pow(i8));
                    i10 = i11;
                }
                BigInteger bigInteger6 = new BigInteger("0");
                for (int i12 = 0; i12 < i9; i12++) {
                    bigInteger6 = bigInteger6.add(bigIntegerArr2[i12].multiply(TWO.pow(i12 * 32)));
                }
                bigIntegerArr2[0] = bigIntegerArr2[i9];
                int i13 = i6 + 1;
                bigInteger = bigInteger3;
                BigInteger add = TWO.pow(iArr[i6] - 1).divide(bigIntegerArr4[i13]).add(TWO.pow(iArr[i6] - 1).multiply(bigInteger6).divide(bigIntegerArr4[i13].multiply(TWO.pow(i9 * 32))));
                if (add.mod(TWO).compareTo(ONE) == 0) {
                    add = add.add(ONE);
                }
                int i14 = 0;
                while (true) {
                    i2 = i9;
                    long j5 = i14;
                    bigIntegerArr4[i6] = bigIntegerArr4[i13].multiply(add.add(BigInteger.valueOf(j5))).add(ONE);
                    bigInteger2 = bigInteger4;
                    if (bigIntegerArr4[i6].compareTo(TWO.pow(iArr[i6])) == 1) {
                        break;
                    }
                    if (TWO.modPow(bigIntegerArr4[i13].multiply(add.add(BigInteger.valueOf(j5))), bigIntegerArr4[i6]).compareTo(ONE) == 0 && TWO.modPow(add.add(BigInteger.valueOf(j5)), bigIntegerArr4[i6]).compareTo(ONE) != 0) {
                        break;
                    }
                    i14 += 2;
                    i9 = i2;
                    bigInteger4 = bigInteger2;
                }
                bigIntegerArr5 = bigIntegerArr2;
                bigInteger3 = bigInteger;
                i9 = i2;
                bigInteger4 = bigInteger2;
                i3 = 0;
                i8 = 32;
            }
            i6--;
            if (i6 < 0) {
                bigIntegerArr[0] = bigIntegerArr4[0];
                bigIntegerArr[1] = bigIntegerArr4[1];
                return bigIntegerArr2[0].longValue();
            }
            i7++;
            bigIntegerArr5 = bigIntegerArr2;
            bigInteger3 = bigInteger;
            bigInteger4 = bigInteger2;
            i3 = 0;
        }
        return bigIntegerArr5[0].longValue();
    }

    private void procedure_B(int i, int i2, BigInteger[] bigIntegerArr) {
        int i3;
        int i4 = i;
        while (true) {
            if (i4 >= 0 && i4 <= 65536) {
                break;
            }
            i4 = this.init_random.nextInt() / 32768;
        }
        int i5 = i2;
        while (true) {
            i3 = 1;
            if (i5 >= 0 && i5 <= 65536 && i5 / 2 != 0) {
                break;
            }
            i5 = (this.init_random.nextInt() / 32768) + 1;
        }
        BigInteger[] bigIntegerArr2 = new BigInteger[2];
        BigInteger bigInteger = new BigInteger(Integer.toString(i5));
        BigInteger bigInteger2 = new BigInteger("19381");
        int procedure_A = procedure_A(i4, i5, bigIntegerArr2, 256);
        BigInteger bigInteger3 = bigIntegerArr2[0];
        int procedure_A2 = procedure_A(procedure_A, i5, bigIntegerArr2, 512);
        BigInteger bigInteger4 = bigIntegerArr2[0];
        BigInteger[] bigIntegerArr3 = new BigInteger[65];
        bigIntegerArr3[0] = new BigInteger(Integer.toString(procedure_A2));
        while (true) {
            int i6 = 0;
            while (i6 < 64) {
                int i7 = i6 + 1;
                bigIntegerArr3[i7] = bigIntegerArr3[i6].multiply(bigInteger2).add(bigInteger).mod(TWO.pow(16));
                i6 = i7;
            }
            BigInteger bigInteger5 = new BigInteger("0");
            for (int i8 = 0; i8 < 64; i8++) {
                bigInteger5 = bigInteger5.add(bigIntegerArr3[i8].multiply(TWO.pow(i8 * 16)));
            }
            bigIntegerArr3[0] = bigIntegerArr3[64];
            int i9 = 1024;
            BigInteger add = TWO.pow(1023).divide(bigInteger3.multiply(bigInteger4)).add(TWO.pow(1023).multiply(bigInteger5).divide(bigInteger3.multiply(bigInteger4).multiply(TWO.pow(1024))));
            if (add.mod(TWO).compareTo(ONE) == 0) {
                add = add.add(ONE);
            }
            BigInteger bigInteger6 = add;
            int i10 = 0;
            while (true) {
                long j = i10;
                BigInteger add2 = bigInteger3.multiply(bigInteger4).multiply(bigInteger6.add(BigInteger.valueOf(j))).add(ONE);
                if (add2.compareTo(TWO.pow(i9)) == i3) {
                    break;
                } else if (TWO.modPow(bigInteger3.multiply(bigInteger4).multiply(bigInteger6.add(BigInteger.valueOf(j))), add2).compareTo(ONE) == 0 && TWO.modPow(bigInteger3.multiply(bigInteger6.add(BigInteger.valueOf(j))), add2).compareTo(ONE) != 0) {
                    bigIntegerArr[0] = add2;
                    bigIntegerArr[1] = bigInteger3;
                    return;
                } else {
                    i10 += 2;
                    i3 = 1;
                    i9 = 1024;
                }
            }
        }
    }

    private void procedure_Bb(long j, long j2, BigInteger[] bigIntegerArr) {
        long j3 = j;
        while (true) {
            if (j3 >= 0 && j3 <= 4294967296L) {
                break;
            }
            j3 = this.init_random.nextInt() * 2;
        }
        long j4 = j2;
        while (true) {
            if (j4 >= 0 && j4 <= 4294967296L && j4 / 2 != 0) {
                break;
            }
            j4 = (this.init_random.nextInt() * 2) + 1;
        }
        BigInteger[] bigIntegerArr2 = new BigInteger[2];
        BigInteger bigInteger = new BigInteger(Long.toString(j4));
        BigInteger bigInteger2 = new BigInteger("97781173");
        long j5 = j4;
        long procedure_Aa = procedure_Aa(j3, j5, bigIntegerArr2, 256);
        BigInteger bigInteger3 = bigIntegerArr2[0];
        long procedure_Aa2 = procedure_Aa(procedure_Aa, j5, bigIntegerArr2, 512);
        BigInteger bigInteger4 = bigIntegerArr2[0];
        BigInteger[] bigIntegerArr3 = new BigInteger[33];
        bigIntegerArr3[0] = new BigInteger(Long.toString(procedure_Aa2));
        while (true) {
            int i = 0;
            while (i < 32) {
                int i2 = i + 1;
                bigIntegerArr3[i2] = bigIntegerArr3[i].multiply(bigInteger2).add(bigInteger).mod(TWO.pow(32));
                i = i2;
            }
            BigInteger bigInteger5 = new BigInteger("0");
            for (int i3 = 0; i3 < 32; i3++) {
                bigInteger5 = bigInteger5.add(bigIntegerArr3[i3].multiply(TWO.pow(i3 * 32)));
            }
            bigIntegerArr3[0] = bigIntegerArr3[32];
            int i4 = 1024;
            BigInteger add = TWO.pow(1023).divide(bigInteger3.multiply(bigInteger4)).add(TWO.pow(1023).multiply(bigInteger5).divide(bigInteger3.multiply(bigInteger4).multiply(TWO.pow(1024))));
            if (add.mod(TWO).compareTo(ONE) == 0) {
                add = add.add(ONE);
            }
            int i5 = 0;
            while (true) {
                long j6 = i5;
                BigInteger add2 = bigInteger3.multiply(bigInteger4).multiply(add.add(BigInteger.valueOf(j6))).add(ONE);
                if (add2.compareTo(TWO.pow(i4)) == 1) {
                    break;
                } else if (TWO.modPow(bigInteger3.multiply(bigInteger4).multiply(add.add(BigInteger.valueOf(j6))), add2).compareTo(ONE) == 0 && TWO.modPow(bigInteger3.multiply(add.add(BigInteger.valueOf(j6))), add2).compareTo(ONE) != 0) {
                    bigIntegerArr[0] = add2;
                    bigIntegerArr[1] = bigInteger3;
                    return;
                } else {
                    i5 += 2;
                    i4 = 1024;
                }
            }
        }
    }

    private BigInteger procedure_C(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger subtract = bigInteger.subtract(ONE);
        BigInteger divide = subtract.divide(bigInteger2);
        int bitLength = bigInteger.bitLength();
        while (true) {
            BigInteger bigInteger3 = new BigInteger(bitLength, this.init_random);
            if (bigInteger3.compareTo(ONE) > 0 && bigInteger3.compareTo(subtract) < 0) {
                BigInteger modPow = bigInteger3.modPow(divide, bigInteger);
                if (modPow.compareTo(ONE) != 0) {
                    return modPow;
                }
            }
        }
    }

    public GOST3410Parameters generateParameters() {
        BigInteger[] bigIntegerArr = new BigInteger[2];
        if (this.typeproc == 1) {
            int nextInt = this.init_random.nextInt();
            int nextInt2 = this.init_random.nextInt();
            int i = this.size;
            if (i == 512) {
                procedure_A(nextInt, nextInt2, bigIntegerArr, 512);
            } else if (i == 1024) {
                procedure_B(nextInt, nextInt2, bigIntegerArr);
            } else {
                throw new IllegalArgumentException("Ooops! key size 512 or 1024 bit.");
            }
            BigInteger bigInteger = bigIntegerArr[0];
            BigInteger bigInteger2 = bigIntegerArr[1];
            return new GOST3410Parameters(bigInteger, bigInteger2, procedure_C(bigInteger, bigInteger2), new GOST3410ValidationParameters(nextInt, nextInt2));
        }
        long nextLong = this.init_random.nextLong();
        long nextLong2 = this.init_random.nextLong();
        int i2 = this.size;
        if (i2 == 512) {
            procedure_Aa(nextLong, nextLong2, bigIntegerArr, 512);
        } else if (i2 == 1024) {
            procedure_Bb(nextLong, nextLong2, bigIntegerArr);
        } else {
            throw new IllegalStateException("Ooops! key size 512 or 1024 bit.");
        }
        BigInteger bigInteger3 = bigIntegerArr[0];
        BigInteger bigInteger4 = bigIntegerArr[1];
        return new GOST3410Parameters(bigInteger3, bigInteger4, procedure_C(bigInteger3, bigInteger4), new GOST3410ValidationParameters(nextLong, nextLong2));
    }
}
