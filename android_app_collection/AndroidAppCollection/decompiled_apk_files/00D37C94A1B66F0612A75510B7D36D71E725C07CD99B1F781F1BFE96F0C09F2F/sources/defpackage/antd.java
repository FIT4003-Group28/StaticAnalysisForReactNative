package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: PG */
/* renamed from: antd  reason: default package */
/* loaded from: classes.dex */
public final class antd implements anme {
    private static final ThreadLocal a = new antc();
    private final SecretKey b;

    public antd(byte[] bArr) {
        if (!anpf.e(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        anus.a(bArr.length);
        this.b = new SecretKeySpec(bArr, "AES");
    }

    @Override // defpackage.anme
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        AlgorithmParameterSpec gCMParameterSpec;
        int length = bArr.length;
        if (length <= 2147483619) {
            byte[] bArr3 = new byte[length + 28];
            byte[] a2 = anum.a(12);
            System.arraycopy(a2, 0, bArr3, 0, 12);
            int length2 = a2.length;
            if (!amnt.k() || amnt.i() > 19) {
                gCMParameterSpec = new GCMParameterSpec(128, a2, 0, length2);
            } else {
                gCMParameterSpec = new IvParameterSpec(a2, 0, length2);
            }
            ThreadLocal threadLocal = a;
            ((Cipher) threadLocal.get()).init(1, this.b, gCMParameterSpec);
            int doFinal = ((Cipher) threadLocal.get()).doFinal(bArr, 0, length, bArr3, 12);
            if (doFinal != length + 16) {
                throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(doFinal - length)));
            }
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
