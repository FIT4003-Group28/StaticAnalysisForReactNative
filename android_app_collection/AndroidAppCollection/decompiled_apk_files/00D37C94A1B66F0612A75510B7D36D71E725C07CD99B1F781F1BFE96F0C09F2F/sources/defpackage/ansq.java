package defpackage;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;
/* compiled from: PG */
/* renamed from: ansq  reason: default package */
/* loaded from: classes.dex */
final class ansq extends anmq {
    public ansq(Class cls) {
        super(cls);
    }

    @Override // defpackage.anmq
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        anrt anrtVar = (anrt) obj;
        KeyFactory keyFactory = (KeyFactory) anub.g.a("RSA");
        anru anruVar = anrtVar.c;
        if (anruVar == null) {
            anruVar = anru.a;
        }
        int i = 1;
        BigInteger bigInteger = new BigInteger(1, anruVar.d.I());
        anru anruVar2 = anrtVar.c;
        if (anruVar2 == null) {
            anruVar2 = anru.a;
        }
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(bigInteger, new BigInteger(1, anruVar2.e.I()), new BigInteger(1, anrtVar.d.I()), new BigInteger(1, anrtVar.e.I()), new BigInteger(1, anrtVar.f.I()), new BigInteger(1, anrtVar.g.I()), new BigInteger(1, anrtVar.h.I()), new BigInteger(1, anrtVar.i.I())));
        anru anruVar3 = anrtVar.c;
        if (anruVar3 == null) {
            anruVar3 = anru.a;
        }
        anrs anrsVar = anruVar3.c;
        if (anrsVar == null) {
            anrsVar = anrs.a;
        }
        anru anruVar4 = anrtVar.c;
        if (anruVar4 == null) {
            anruVar4 = anru.a;
        }
        BigInteger bigInteger2 = new BigInteger(1, anruVar4.d.I());
        anru anruVar5 = anrtVar.c;
        if (anruVar5 == null) {
            anruVar5 = anru.a;
        }
        RSAPublicKey rSAPublicKey = (RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger2, new BigInteger(1, anruVar5.e.I())));
        int c = anqx.c(anrsVar.b);
        if (c == 0) {
            c = 1;
        }
        int f = answ.f(c);
        int c2 = anqx.c(anrsVar.c);
        if (c2 == 0) {
            c2 = 1;
        }
        anur.c(rSAPrivateCrtKey, rSAPublicKey, f, answ.f(c2), anrsVar.d);
        int c3 = anqx.c(anrsVar.b);
        if (c3 == 0) {
            c3 = 1;
        }
        int f2 = answ.f(c3);
        int c4 = anqx.c(anrsVar.c);
        if (c4 != 0) {
            i = c4;
        }
        return new anup(rSAPrivateCrtKey, f2, answ.f(i), anrsVar.d);
    }
}
