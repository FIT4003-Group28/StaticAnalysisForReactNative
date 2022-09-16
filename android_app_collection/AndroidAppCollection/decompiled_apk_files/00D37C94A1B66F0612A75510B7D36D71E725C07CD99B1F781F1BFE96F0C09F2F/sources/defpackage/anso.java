package defpackage;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
/* compiled from: PG */
/* renamed from: anso  reason: default package */
/* loaded from: classes.dex */
final class anso extends anmq {
    public anso(Class cls) {
        super(cls);
    }

    @Override // defpackage.anmq
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        anrq anrqVar = (anrq) obj;
        int i = 1;
        RSAPublicKey rSAPublicKey = (RSAPublicKey) ((KeyFactory) anub.g.a("RSA")).generatePublic(new RSAPublicKeySpec(new BigInteger(1, anrqVar.d.I()), new BigInteger(1, anrqVar.e.I())));
        anro anroVar = anrqVar.c;
        if (anroVar == null) {
            anroVar = anro.a;
        }
        int c = anqx.c(anroVar.b);
        if (c != 0) {
            i = c;
        }
        return new anuo(rSAPublicKey, answ.f(i));
    }
}
