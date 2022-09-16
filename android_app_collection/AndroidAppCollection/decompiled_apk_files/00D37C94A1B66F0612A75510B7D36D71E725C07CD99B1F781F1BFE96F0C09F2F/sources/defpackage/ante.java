package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: PG */
/* renamed from: ante  reason: default package */
/* loaded from: classes.dex */
public final class ante implements anmi {
    private static final Collection a = Arrays.asList(64);
    private static final byte[] b = new byte[16];
    private final anuh c;
    private final byte[] d;

    public ante(byte[] bArr) {
        if (anpf.e(1)) {
            Collection collection = a;
            int length = bArr.length;
            if (!collection.contains(Integer.valueOf(length))) {
                StringBuilder sb = new StringBuilder(59);
                sb.append("invalid key size: ");
                sb.append(length);
                sb.append(" bytes; key must have 64 bytes");
                throw new InvalidKeyException(sb.toString());
            }
            int i = length >> 1;
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i);
            this.d = Arrays.copyOfRange(bArr, i, length);
            this.c = new anuh(copyOfRange);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
    }

    @Override // defpackage.anmi
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] p;
        if (bArr.length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher cipher = (Cipher) anub.a.a("AES/CTR/NoPadding");
        byte[][] bArr3 = {bArr2, bArr};
        byte[] a2 = this.c.a(b, 16);
        for (int i = 0; i <= 0; i++) {
            byte[] bArr4 = bArr3[i];
            if (bArr4 == null) {
                bArr4 = new byte[0];
            }
            a2 = antz.p(antz.s(a2), this.c.a(bArr4, 16));
        }
        byte[] bArr5 = bArr3[1];
        int length = bArr5.length;
        if (length >= 16) {
            int length2 = a2.length;
            if (length < length2) {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
            int i2 = length - length2;
            p = Arrays.copyOf(bArr5, length);
            for (int i3 = 0; i3 < a2.length; i3++) {
                int i4 = i2 + i3;
                p[i4] = (byte) (p[i4] ^ a2[i3]);
            }
        } else {
            p = antz.p(antz.r(bArr5), antz.s(a2));
        }
        byte[] a3 = this.c.a(p, 16);
        byte[] bArr6 = (byte[]) a3.clone();
        bArr6[8] = (byte) (bArr6[8] & Byte.MAX_VALUE);
        bArr6[12] = (byte) (bArr6[12] & Byte.MAX_VALUE);
        cipher.init(1, new SecretKeySpec(this.d, "AES"), new IvParameterSpec(bArr6));
        return antz.o(a3, cipher.doFinal(bArr));
    }
}
