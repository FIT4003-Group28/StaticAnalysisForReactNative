package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: PG */
/* renamed from: anuh  reason: default package */
/* loaded from: classes.dex */
public final class anuh implements anpq {
    private final SecretKey a;
    private final byte[] b;
    private final byte[] c;

    public anuh(byte[] bArr) {
        anus.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.a = secretKeySpec;
        Cipher b = b();
        b.init(1, secretKeySpec);
        byte[] s = antz.s(b.doFinal(new byte[16]));
        this.b = s;
        this.c = antz.s(s);
    }

    private static Cipher b() {
        if (!anpf.e(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        return (Cipher) anub.a.a("AES/ECB/NoPadding");
    }

    @Override // defpackage.anpq
    public final byte[] a(byte[] bArr, int i) {
        byte[] p;
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher b = b();
        b.init(1, this.a);
        int length = bArr.length;
        double d = length;
        Double.isNaN(d);
        int max = Math.max(1, (int) Math.ceil(d / 16.0d));
        if (max * 16 == length) {
            p = antz.q(bArr, (max - 1) * 16, this.b, 0, 16);
        } else {
            p = antz.p(antz.r(Arrays.copyOfRange(bArr, (max - 1) * 16, length)), this.c);
        }
        byte[] bArr2 = new byte[16];
        for (int i2 = 0; i2 < max - 1; i2++) {
            bArr2 = b.doFinal(antz.q(bArr2, 0, bArr, i2 * 16, 16));
        }
        return Arrays.copyOf(b.doFinal(antz.p(p, bArr2)), i);
    }
}
