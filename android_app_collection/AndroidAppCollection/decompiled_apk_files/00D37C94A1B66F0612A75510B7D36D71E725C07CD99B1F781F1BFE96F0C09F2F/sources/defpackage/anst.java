package defpackage;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
/* compiled from: PG */
/* renamed from: anst  reason: default package */
/* loaded from: classes.dex */
final class anst extends anmq {
    public anst(Class cls) {
        super(cls);
    }

    @Override // defpackage.anmq
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        anru anruVar = (anru) obj;
        int i = 1;
        RSAPublicKey rSAPublicKey = (RSAPublicKey) ((KeyFactory) anub.g.a("RSA")).generatePublic(new RSAPublicKeySpec(new BigInteger(1, anruVar.d.I()), new BigInteger(1, anruVar.e.I())));
        anrs anrsVar = anruVar.c;
        if (anrsVar == null) {
            anrsVar = anrs.a;
        }
        int c = anqx.c(anrsVar.b);
        if (c == 0) {
            c = 1;
        }
        int f = answ.f(c);
        int c2 = anqx.c(anrsVar.c);
        if (c2 != 0) {
            i = c2;
        }
        return new anuq(rSAPublicKey, f, answ.f(i), anrsVar.d);
    }
}
