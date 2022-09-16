package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Signature;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import javax.crypto.Cipher;
/* compiled from: PG */
/* renamed from: anur  reason: default package */
/* loaded from: classes.dex */
public final class anur {
    private static final aoob a = aoob.z("Tink and Wycheproof.");

    public static final void a(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey, int i, int i2) {
        antj antjVar = new antj(eCPrivateKey, i, i2);
        antk antkVar = new antk(eCPublicKey, i, i2);
        try {
            aoob aoobVar = a;
            byte[] I = aoobVar.I();
            Signature signature = (Signature) anub.c.a(antjVar.b);
            signature.initSign(antjVar.a);
            signature.update(I);
            byte[] sign = signature.sign();
            int i3 = 1;
            if (antjVar.c == 1) {
                int a2 = antz.a(antjVar.a.getParams().getCurve());
                int i4 = a2 + a2;
                if (!antz.f(sign)) {
                    throw new GeneralSecurityException("Invalid DER encoding");
                }
                byte[] bArr = new byte[i4];
                int i5 = ((sign[1] & 255) >= 128 ? 3 : 2) + 1;
                int i6 = i5 + 1;
                int i7 = sign[i5];
                int i8 = sign[i6] == 0 ? 1 : 0;
                System.arraycopy(sign, i6 + i8, bArr, ((i4 / 2) - i7) + i8, i7 - i8);
                int i9 = i6 + i7 + 1;
                int i10 = i9 + 1;
                int i11 = sign[i9];
                if (sign[i10] != 0) {
                    i3 = 0;
                }
                System.arraycopy(sign, i10 + i3, bArr, (i4 - i11) + i3, i11 - i3);
                sign = bArr;
            }
            antkVar.a(sign, aoobVar.I());
        } catch (GeneralSecurityException e) {
            throw new GeneralSecurityException("ECDSA signing with private key followed by verifying with public key failed. The key may be corrupted.", e);
        }
    }

    public static final void b(RSAPrivateCrtKey rSAPrivateCrtKey, RSAPublicKey rSAPublicKey, int i) {
        anun anunVar = new anun(rSAPrivateCrtKey, i);
        anuo anuoVar = new anuo(rSAPublicKey, i);
        try {
            aoob aoobVar = a;
            byte[] I = aoobVar.I();
            Signature signature = (Signature) anub.c.a(anunVar.c);
            signature.initSign(anunVar.a);
            signature.update(I);
            byte[] sign = signature.sign();
            Signature signature2 = (Signature) anub.c.a(anunVar.c);
            signature2.initVerify(anunVar.b);
            signature2.update(I);
            if (signature2.verify(sign)) {
                anuoVar.a(sign, aoobVar.I());
                return;
            }
            throw new RuntimeException("Security bug: RSA signature computation error");
        } catch (GeneralSecurityException e) {
            throw new GeneralSecurityException("RSA PKCS1 signing with private key followed by verifying with public key failed. The key may be corrupted.", e);
        }
    }

    public static final void c(RSAPrivateCrtKey rSAPrivateCrtKey, RSAPublicKey rSAPublicKey, int i, int i2, int i3) {
        byte[] bArr;
        anup anupVar = new anup(rSAPrivateCrtKey, i, i2, i3);
        anuq anuqVar = new anuq(rSAPublicKey, i, i2, i3);
        try {
            byte[] I = a.I();
            int bitLength = anupVar.b.getModulus().bitLength() - 1;
            int i4 = anus.a;
            MessageDigest messageDigest = (MessageDigest) anub.d.a(amnt.m(anupVar.d));
            byte[] digest = messageDigest.digest(I);
            int digestLength = messageDigest.getDigestLength();
            int i5 = ((bitLength - 1) / 8) + 1;
            int i6 = anupVar.c;
            if (i5 >= digestLength + i6 + 2) {
                byte[] a2 = anum.a(i6);
                int i7 = digestLength + 8;
                byte[] bArr2 = new byte[anupVar.c + i7];
                System.arraycopy(digest, 0, bArr2, 8, digestLength);
                int length = a2.length;
                System.arraycopy(a2, 0, bArr2, i7, length);
                byte[] digest2 = messageDigest.digest(bArr2);
                int i8 = (i5 - digestLength) - 1;
                byte[] bArr3 = new byte[i8];
                int i9 = (i5 - anupVar.c) - digestLength;
                bArr3[i9 - 2] = 1;
                System.arraycopy(a2, 0, bArr3, i9 - 1, length);
                byte[] o = amnt.o(digest2, i8, anupVar.e);
                byte[] bArr4 = new byte[i8];
                for (int i10 = 0; i10 < i8; i10++) {
                    bArr4[i10] = (byte) (bArr3[i10] ^ o[i10]);
                }
                int i11 = 0;
                while (true) {
                    bArr = bArr4;
                    if (i11 >= (i5 * 8) - bitLength) {
                        break;
                    }
                    int i12 = i11 / 8;
                    bArr[i12] = (byte) (((1 << (7 - (i11 % 8))) ^ (-1)) & bArr[i12]);
                    i11++;
                    bArr4 = bArr;
                }
                int i13 = digestLength + i8;
                byte[] bArr5 = new byte[i13 + 1];
                System.arraycopy(bArr, 0, bArr5, 0, i8);
                System.arraycopy(digest2, 0, bArr5, i8, digest2.length);
                bArr5[i13] = -68;
                Cipher cipher = (Cipher) anub.a.a("RSA/ECB/NOPADDING");
                cipher.init(2, anupVar.a);
                byte[] doFinal = cipher.doFinal(bArr5);
                Cipher cipher2 = (Cipher) anub.a.a("RSA/ECB/NOPADDING");
                cipher2.init(1, anupVar.b);
                if (new BigInteger(1, bArr5).equals(new BigInteger(1, cipher2.doFinal(doFinal)))) {
                    anuqVar.a(doFinal, a.I());
                    return;
                }
                throw new RuntimeException("Security bug: RSA signature computation error");
            }
            throw new GeneralSecurityException("encoding error");
        } catch (GeneralSecurityException e) {
            throw new GeneralSecurityException("RSA PSS signing with private key followed by verifying with public key failed. The key may be corrupted.", e);
        }
    }
}
