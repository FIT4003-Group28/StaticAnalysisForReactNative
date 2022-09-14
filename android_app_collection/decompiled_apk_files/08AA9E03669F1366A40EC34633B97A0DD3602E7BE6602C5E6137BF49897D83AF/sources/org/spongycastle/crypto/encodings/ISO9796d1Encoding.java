package org.spongycastle.crypto.encodings;

import java.math.BigInteger;
import org.spongycastle.crypto.AsymmetricBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.crypto.params.RSAKeyParameters;
/* loaded from: classes.dex */
public class ISO9796d1Encoding implements AsymmetricBlockCipher {
    private int bitSize;
    private AsymmetricBlockCipher engine;
    private boolean forEncryption;
    private BigInteger modulus;
    private int padBits = 0;
    private static final BigInteger SIXTEEN = BigInteger.valueOf(16);
    private static final BigInteger SIX = BigInteger.valueOf(6);
    private static byte[] shadows = {14, 3, 5, 8, 9, 4, 2, 15, 0, 13, 11, 6, 7, 10, 12, 1};
    private static byte[] inverse = {8, 15, 6, 1, 5, 2, 11, 12, 3, 4, 13, 10, 14, 9, 0, 7};

    public ISO9796d1Encoding(AsymmetricBlockCipher asymmetricBlockCipher) {
        this.engine = asymmetricBlockCipher;
    }

    public AsymmetricBlockCipher getUnderlyingCipher() {
        return this.engine;
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        RSAKeyParameters rSAKeyParameters;
        if (cipherParameters instanceof ParametersWithRandom) {
            rSAKeyParameters = (RSAKeyParameters) ((ParametersWithRandom) cipherParameters).getParameters();
        } else {
            rSAKeyParameters = (RSAKeyParameters) cipherParameters;
        }
        this.engine.init(z, cipherParameters);
        this.modulus = rSAKeyParameters.getModulus();
        this.bitSize = this.modulus.bitLength();
        this.forEncryption = z;
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        int inputBlockSize = this.engine.getInputBlockSize();
        return this.forEncryption ? (inputBlockSize + 1) / 2 : inputBlockSize;
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        int outputBlockSize = this.engine.getOutputBlockSize();
        return this.forEncryption ? outputBlockSize : (outputBlockSize + 1) / 2;
    }

    public void setPadBits(int i) {
        if (i > 7) {
            throw new IllegalArgumentException("padBits > 7");
        }
        this.padBits = i;
    }

    public int getPadBits() {
        return this.padBits;
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i, int i2) {
        if (this.forEncryption) {
            return encodeBlock(bArr, i, i2);
        }
        return decodeBlock(bArr, i, i2);
    }

    private byte[] encodeBlock(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[(this.bitSize + 7) / 8];
        int i3 = 1;
        int i4 = this.padBits + 1;
        int i5 = (this.bitSize + 13) / 16;
        int i6 = 0;
        while (i6 < i5) {
            if (i6 > i5 - i2) {
                int i7 = i5 - i6;
                System.arraycopy(bArr, (i + i2) - i7, bArr2, bArr2.length - i5, i7);
            } else {
                System.arraycopy(bArr, i, bArr2, bArr2.length - (i6 + i2), i2);
            }
            i6 += i2;
        }
        for (int length = bArr2.length - (i5 * 2); length != bArr2.length; length += 2) {
            byte b2 = bArr2[(bArr2.length - i5) + (length / 2)];
            bArr2[length] = (byte) ((shadows[(b2 & 255) >>> 4] << 4) | shadows[b2 & 15]);
            bArr2[length + 1] = b2;
        }
        int length2 = bArr2.length - (i2 * 2);
        bArr2[length2] = (byte) (bArr2[length2] ^ i4);
        bArr2[bArr2.length - 1] = (byte) ((bArr2[bArr2.length - 1] << 4) | 6);
        int i8 = 8 - ((this.bitSize - 1) % 8);
        if (i8 != 8) {
            bArr2[0] = (byte) (bArr2[0] & (255 >>> i8));
            bArr2[0] = (byte) ((128 >>> i8) | bArr2[0]);
            i3 = 0;
        } else {
            bArr2[0] = 0;
            bArr2[1] = (byte) (bArr2[1] | 128);
        }
        return this.engine.processBlock(bArr2, i3, bArr2.length - i3);
    }

    private byte[] decodeBlock(byte[] bArr, int i, int i2) {
        byte[] processBlock = this.engine.processBlock(bArr, i, i2);
        int i3 = (this.bitSize + 13) / 16;
        BigInteger bigInteger = new BigInteger(1, processBlock);
        if (!bigInteger.mod(SIXTEEN).equals(SIX)) {
            if (this.modulus.subtract(bigInteger).mod(SIXTEEN).equals(SIX)) {
                bigInteger = this.modulus.subtract(bigInteger);
            } else {
                throw new InvalidCipherTextException("resulting integer iS or (modulus - iS) is not congruent to 6 mod 16");
            }
        }
        byte[] convertOutputDecryptOnly = convertOutputDecryptOnly(bigInteger);
        if ((convertOutputDecryptOnly[convertOutputDecryptOnly.length - 1] & 15) != 6) {
            throw new InvalidCipherTextException("invalid forcing byte in block");
        }
        convertOutputDecryptOnly[convertOutputDecryptOnly.length - 1] = (byte) (((convertOutputDecryptOnly[convertOutputDecryptOnly.length - 1] & 255) >>> 4) | (inverse[(convertOutputDecryptOnly[convertOutputDecryptOnly.length - 2] & 255) >> 4] << 4));
        convertOutputDecryptOnly[0] = (byte) ((shadows[(convertOutputDecryptOnly[1] & 255) >>> 4] << 4) | shadows[convertOutputDecryptOnly[1] & 15]);
        int i4 = 0;
        boolean z = false;
        int i5 = 1;
        for (int length = convertOutputDecryptOnly.length - 1; length >= convertOutputDecryptOnly.length - (i3 * 2); length -= 2) {
            int i6 = (shadows[(convertOutputDecryptOnly[length] & 255) >>> 4] << 4) | shadows[convertOutputDecryptOnly[length] & 15];
            int i7 = length - 1;
            if (((convertOutputDecryptOnly[i7] ^ i6) & 255) != 0) {
                if (!z) {
                    i5 = (convertOutputDecryptOnly[i7] ^ i6) & 255;
                    i4 = i7;
                    z = true;
                } else {
                    throw new InvalidCipherTextException("invalid tsums in block");
                }
            }
        }
        convertOutputDecryptOnly[i4] = 0;
        byte[] bArr2 = new byte[(convertOutputDecryptOnly.length - i4) / 2];
        for (int i8 = 0; i8 < bArr2.length; i8++) {
            bArr2[i8] = convertOutputDecryptOnly[(i8 * 2) + i4 + 1];
        }
        this.padBits = i5 - 1;
        return bArr2;
    }

    private static byte[] convertOutputDecryptOnly(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] == 0) {
            byte[] bArr = new byte[byteArray.length - 1];
            System.arraycopy(byteArray, 1, bArr, 0, bArr.length);
            return bArr;
        }
        return byteArray;
    }
}
