package defpackage;

import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: PG */
/* renamed from: cvgs  reason: default package */
/* loaded from: classes5.dex */
public abstract class cvgs {
    final int a;
    final long b;
    final Cipher c;
    protected long d;
    int e;

    public cvgs(int i, byte[] bArr, byte[] bArr2) {
        int i2 = (i + 7) / 8;
        this.a = i2;
        this.b = (1 << (i - ((i2 - 1) * 8))) - 1;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.reset();
        messageDigest.update(decl.i(i));
        messageDigest.update(bArr);
        messageDigest.update((byte) 2);
        messageDigest.update(decl.i(bArr2.length));
        messageDigest.update(bArr2);
        byte[] digest = messageDigest.digest();
        Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
        this.c = cipher;
        cipher.init(1, new SecretKeySpec(digest, "AES"));
        this.d = 0L;
        this.e = 0;
    }

    public abstract long a();
}
