package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
/* compiled from: PG */
/* renamed from: anuo  reason: default package */
/* loaded from: classes.dex */
public final class anuo implements annc {
    private final RSAPublicKey a;
    private final int b;

    public anuo(RSAPublicKey rSAPublicKey, int i) {
        if (!anpf.e(2)) {
            throw new GeneralSecurityException("Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i2 = anus.a;
        anus.b(rSAPublicKey.getModulus().bitLength());
        anus.c(rSAPublicKey.getPublicExponent());
        this.a = rSAPublicKey;
        this.b = i;
    }

    @Override // defpackage.annc
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] s;
        int length;
        BigInteger publicExponent = this.a.getPublicExponent();
        BigInteger modulus = this.a.getModulus();
        int bitLength = (modulus.bitLength() + 7) / 8;
        if (bitLength != bArr.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger j = amnt.j(bArr);
        if (j.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        byte[] l = amnt.l(j.modPow(publicExponent, modulus), bitLength);
        int i = this.b;
        int i2 = anus.a;
        MessageDigest messageDigest = (MessageDigest) anub.d.a(amnt.m(this.b));
        messageDigest.update(bArr2);
        byte[] digest = messageDigest.digest();
        int i3 = i - 1;
        int i4 = 2;
        if (i3 == 2) {
            s = amnt.s("3031300d060960864801650304020105000420");
        } else if (i3 != 3) {
            s = amnt.s("3051300d060960864801650304020305000440");
        } else {
            s = amnt.s("3041300d060960864801650304020205000430");
        }
        if (bitLength >= s.length + digest.length + 11) {
            byte[] bArr3 = new byte[bitLength];
            bArr3[0] = 0;
            bArr3[1] = 1;
            int i5 = 0;
            while (i5 < (bitLength - length) - 3) {
                bArr3[i4] = -1;
                i5++;
                i4++;
            }
            int i6 = i4 + 1;
            bArr3[i4] = 0;
            int length2 = s.length;
            System.arraycopy(s, 0, bArr3, i6, length2);
            System.arraycopy(digest, 0, bArr3, i6 + length2, digest.length);
            if (!antz.n(l, bArr3)) {
                throw new GeneralSecurityException("invalid signature");
            }
            return;
        }
        throw new GeneralSecurityException("intended encoded message length too short");
    }
}
