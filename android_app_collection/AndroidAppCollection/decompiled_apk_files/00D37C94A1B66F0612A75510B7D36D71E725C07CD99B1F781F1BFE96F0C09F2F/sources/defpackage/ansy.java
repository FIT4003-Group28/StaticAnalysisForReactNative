package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: PG */
/* renamed from: ansy  reason: default package */
/* loaded from: classes.dex */
public final class ansy implements anug {
    private static final ThreadLocal a = new ansx();
    private final SecretKeySpec b;
    private final int c;
    private final int d;

    public ansy(byte[] bArr, int i) {
        if (!anpf.e(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        anus.a(bArr.length);
        this.b = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) a.get()).getBlockSize();
        this.d = blockSize;
        if (i < 12 || i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.c = i;
    }

    @Override // defpackage.anug
    public final byte[] a(byte[] bArr) {
        int length = bArr.length;
        int i = this.c;
        int i2 = Integer.MAX_VALUE - i;
        if (length > i2) {
            StringBuilder sb = new StringBuilder(43);
            sb.append("plaintext length can not exceed ");
            sb.append(i2);
            throw new GeneralSecurityException(sb.toString());
        }
        byte[] bArr2 = new byte[i + length];
        byte[] a2 = anum.a(i);
        System.arraycopy(a2, 0, bArr2, 0, this.c);
        int i3 = this.c;
        Cipher cipher = (Cipher) a.get();
        byte[] bArr3 = new byte[this.d];
        System.arraycopy(a2, 0, bArr3, 0, this.c);
        cipher.init(1, this.b, new IvParameterSpec(bArr3));
        if (cipher.doFinal(bArr, 0, length, bArr2, i3) != length) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
        return bArr2;
    }
}
