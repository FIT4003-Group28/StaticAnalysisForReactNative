package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: anuq  reason: default package */
/* loaded from: classes.dex */
public final class anuq implements annc {
    private final RSAPublicKey a;
    private final int b;
    private final int c;
    private final int d;

    public anuq(RSAPublicKey rSAPublicKey, int i, int i2, int i3) {
        if (!anpf.e(2)) {
            throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i4 = anus.a;
        anus.b(rSAPublicKey.getModulus().bitLength());
        anus.c(rSAPublicKey.getPublicExponent());
        this.a = rSAPublicKey;
        this.c = i;
        this.d = i2;
        this.b = i3;
    }

    @Override // defpackage.annc
    public final void a(byte[] bArr, byte[] bArr2) {
        BigInteger publicExponent = this.a.getPublicExponent();
        BigInteger modulus = this.a.getModulus();
        int bitLength = modulus.bitLength();
        int bitLength2 = (modulus.bitLength() + 6) / 8;
        if ((bitLength + 7) / 8 != bArr.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger j = amnt.j(bArr);
        if (j.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        byte[] l = amnt.l(j.modPow(publicExponent, modulus), bitLength2);
        int bitLength3 = modulus.bitLength() - 1;
        int i = anus.a;
        MessageDigest messageDigest = (MessageDigest) anub.d.a(amnt.m(this.c));
        byte[] digest = messageDigest.digest(bArr2);
        int digestLength = messageDigest.getDigestLength();
        int length = l.length;
        if (length < this.b + digestLength + 2) {
            throw new GeneralSecurityException("inconsistent");
        }
        if (l[length - 1] != -68) {
            throw new GeneralSecurityException("inconsistent");
        }
        int i2 = length - digestLength;
        int i3 = i2 - 1;
        byte[] copyOf = Arrays.copyOf(l, i3);
        int length2 = copyOf.length;
        byte[] copyOfRange = Arrays.copyOfRange(l, length2, length2 + digestLength);
        int i4 = 0;
        while (true) {
            int i5 = digestLength;
            long j2 = (length * 8) - bitLength3;
            if (i4 < j2) {
                if (((copyOf[i4 / 8] >> (7 - (i4 % 8))) & 1) != 0) {
                    throw new GeneralSecurityException("inconsistent");
                }
                i4++;
                digestLength = i5;
            } else {
                byte[] o = amnt.o(copyOfRange, i3, this.d);
                int length3 = o.length;
                byte[] bArr3 = new byte[length3];
                for (int i6 = 0; i6 < length3; i6++) {
                    bArr3[i6] = (byte) (o[i6] ^ copyOf[i6]);
                }
                for (int i7 = 0; i7 <= j2; i7++) {
                    int i8 = i7 / 8;
                    bArr3[i8] = (byte) (bArr3[i8] & ((1 << (7 - (i7 % 8))) ^ (-1)));
                }
                int i9 = 0;
                while (true) {
                    int i10 = this.b;
                    int i11 = (i2 - i10) - 2;
                    if (i9 < i11) {
                        if (bArr3[i9] != 0) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        i9++;
                    } else if (bArr3[i11] != 1) {
                        throw new GeneralSecurityException("inconsistent");
                    } else {
                        byte[] copyOfRange2 = Arrays.copyOfRange(bArr3, length3 - i10, length3);
                        int i12 = i5 + 8;
                        byte[] bArr4 = new byte[this.b + i12];
                        System.arraycopy(digest, 0, bArr4, 8, digest.length);
                        System.arraycopy(copyOfRange2, 0, bArr4, i12, copyOfRange2.length);
                        if (!antz.n(messageDigest.digest(bArr4), copyOfRange)) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        return;
                    }
                }
            }
        }
    }
}
