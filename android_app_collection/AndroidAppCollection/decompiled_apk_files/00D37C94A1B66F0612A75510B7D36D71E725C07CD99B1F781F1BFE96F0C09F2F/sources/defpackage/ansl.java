package defpackage;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;
/* compiled from: PG */
/* renamed from: ansl  reason: default package */
/* loaded from: classes.dex */
final class ansl extends anmq {
    public ansl(Class cls) {
        super(cls);
    }

    @Override // defpackage.anmq
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        anrp anrpVar = (anrp) obj;
        KeyFactory keyFactory = (KeyFactory) anub.g.a("RSA");
        anrq anrqVar = anrpVar.c;
        if (anrqVar == null) {
            anrqVar = anrq.a;
        }
        int i = 1;
        BigInteger bigInteger = new BigInteger(1, anrqVar.d.I());
        anrq anrqVar2 = anrpVar.c;
        if (anrqVar2 == null) {
            anrqVar2 = anrq.a;
        }
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(bigInteger, new BigInteger(1, anrqVar2.e.I()), new BigInteger(1, anrpVar.d.I()), new BigInteger(1, anrpVar.e.I()), new BigInteger(1, anrpVar.f.I()), new BigInteger(1, anrpVar.g.I()), new BigInteger(1, anrpVar.h.I()), new BigInteger(1, anrpVar.i.I())));
        anrq anrqVar3 = anrpVar.c;
        if (anrqVar3 == null) {
            anrqVar3 = anrq.a;
        }
        anro anroVar = anrqVar3.c;
        if (anroVar == null) {
            anroVar = anro.a;
        }
        anrq anrqVar4 = anrpVar.c;
        if (anrqVar4 == null) {
            anrqVar4 = anrq.a;
        }
        BigInteger bigInteger2 = new BigInteger(1, anrqVar4.d.I());
        anrq anrqVar5 = anrpVar.c;
        if (anrqVar5 == null) {
            anrqVar5 = anrq.a;
        }
        RSAPublicKey rSAPublicKey = (RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger2, new BigInteger(1, anrqVar5.e.I())));
        int c = anqx.c(anroVar.b);
        if (c == 0) {
            c = 1;
        }
        anur.b(rSAPrivateCrtKey, rSAPublicKey, answ.f(c));
        int c2 = anqx.c(anroVar.b);
        if (c2 != 0) {
            i = c2;
        }
        return new anun(rSAPrivateCrtKey, answ.f(i));
    }
}
