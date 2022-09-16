package defpackage;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
/* compiled from: PG */
/* renamed from: anun  reason: default package */
/* loaded from: classes.dex */
public final class anun implements annb {
    public final RSAPrivateCrtKey a;
    public final RSAPublicKey b;
    public final String c;

    public anun(RSAPrivateCrtKey rSAPrivateCrtKey, int i) {
        if (!anpf.e(2)) {
            throw new GeneralSecurityException("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i2 = anus.a;
        anus.b(rSAPrivateCrtKey.getModulus().bitLength());
        anus.c(rSAPrivateCrtKey.getPublicExponent());
        this.a = rSAPrivateCrtKey;
        String t = amnt.t(i);
        StringBuilder sb = new StringBuilder(t.length() + 7);
        sb.append(t);
        sb.append("withRSA");
        this.c = sb.toString();
        this.b = (RSAPublicKey) ((KeyFactory) anub.g.a("RSA")).generatePublic(new RSAPublicKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent()));
    }
}
