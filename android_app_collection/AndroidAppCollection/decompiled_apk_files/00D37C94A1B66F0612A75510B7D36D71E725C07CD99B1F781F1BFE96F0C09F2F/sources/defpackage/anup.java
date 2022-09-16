package defpackage;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
/* compiled from: PG */
/* renamed from: anup  reason: default package */
/* loaded from: classes.dex */
public final class anup implements annb {
    public final RSAPrivateCrtKey a;
    public final RSAPublicKey b;
    public final int c;
    public final int d;
    public final int e;

    public anup(RSAPrivateCrtKey rSAPrivateCrtKey, int i, int i2, int i3) {
        if (!anpf.e(2)) {
            throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i4 = anus.a;
        anus.b(rSAPrivateCrtKey.getModulus().bitLength());
        anus.c(rSAPrivateCrtKey.getPublicExponent());
        this.a = rSAPrivateCrtKey;
        this.b = (RSAPublicKey) ((KeyFactory) anub.g.a("RSA")).generatePublic(new RSAPublicKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent()));
        this.d = i;
        this.e = i2;
        this.c = i3;
    }
}
