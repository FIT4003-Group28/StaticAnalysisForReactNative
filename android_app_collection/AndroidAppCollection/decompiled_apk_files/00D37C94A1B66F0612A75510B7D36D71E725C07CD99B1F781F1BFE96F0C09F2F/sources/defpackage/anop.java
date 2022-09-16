package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: PG */
/* renamed from: anop  reason: default package */
/* loaded from: classes.dex */
public final class anop implements anme {
    private static final ThreadLocal a = new anoo();
    private final SecretKey b;

    public anop(byte[] bArr) {
        anus.a(bArr.length);
        this.b = new SecretKeySpec(bArr, "AES");
    }

    @Override // defpackage.anme
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        AlgorithmParameterSpec ivParameterSpec;
        int length = bArr.length;
        if (length <= 2147483619) {
            byte[] bArr3 = new byte[length + 28];
            byte[] a2 = anum.a(12);
            System.arraycopy(a2, 0, bArr3, 0, 12);
            int length2 = a2.length;
            try {
                Class.forName("javax.crypto.spec.GCMParameterSpec");
                ivParameterSpec = new GCMParameterSpec(128, a2, 0, length2);
            } catch (ClassNotFoundException unused) {
                if (amnt.k()) {
                    ivParameterSpec = new IvParameterSpec(a2, 0, length2);
                } else {
                    throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
                }
            }
            ThreadLocal threadLocal = a;
            ((Cipher) threadLocal.get()).init(1, this.b, ivParameterSpec);
            int length3 = bArr.length;
            int doFinal = ((Cipher) threadLocal.get()).doFinal(bArr, 0, length3, bArr3, 12);
            if (doFinal != length3 + 16) {
                throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(doFinal - length3)));
            }
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
