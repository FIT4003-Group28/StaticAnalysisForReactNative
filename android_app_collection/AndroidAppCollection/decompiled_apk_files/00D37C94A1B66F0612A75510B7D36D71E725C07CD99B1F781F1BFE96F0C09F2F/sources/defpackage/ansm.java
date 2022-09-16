package defpackage;

import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAKeyGenParameterSpec;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ansm  reason: default package */
/* loaded from: classes.dex */
final class ansm extends anmp {
    public ansm(Class cls) {
        super(cls);
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ aoqu a(aoob aoobVar) {
        return (anrn) aopi.parseFrom(anrn.a, aoobVar, aoos.a());
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ Object b(aoqu aoquVar) {
        anrn anrnVar = (anrn) aoquVar;
        anro anroVar = anrnVar.b;
        if (anroVar == null) {
            anroVar = anro.a;
        }
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) anub.f.a("RSA");
        keyPairGenerator.initialize(new RSAKeyGenParameterSpec(anrnVar.c, new BigInteger(1, anrnVar.d.I())));
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        RSAPublicKey rSAPublicKey = (RSAPublicKey) generateKeyPair.getPublic();
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) generateKeyPair.getPrivate();
        aopa createBuilder = anrq.a.createBuilder();
        createBuilder.copyOnWrite();
        ((anrq) createBuilder.instance).b = 0;
        createBuilder.copyOnWrite();
        anroVar.getClass();
        ((anrq) createBuilder.instance).c = anroVar;
        aoob x = aoob.x(rSAPublicKey.getPublicExponent().toByteArray());
        createBuilder.copyOnWrite();
        ((anrq) createBuilder.instance).e = x;
        aoob x2 = aoob.x(rSAPublicKey.getModulus().toByteArray());
        createBuilder.copyOnWrite();
        ((anrq) createBuilder.instance).d = x2;
        anrq anrqVar = (anrq) createBuilder.mo39build();
        aopa createBuilder2 = anrp.a.createBuilder();
        createBuilder2.copyOnWrite();
        ((anrp) createBuilder2.instance).b = 0;
        createBuilder2.copyOnWrite();
        anrqVar.getClass();
        ((anrp) createBuilder2.instance).c = anrqVar;
        aoob x3 = aoob.x(rSAPrivateCrtKey.getPrivateExponent().toByteArray());
        createBuilder2.copyOnWrite();
        ((anrp) createBuilder2.instance).d = x3;
        aoob x4 = aoob.x(rSAPrivateCrtKey.getPrimeP().toByteArray());
        createBuilder2.copyOnWrite();
        ((anrp) createBuilder2.instance).e = x4;
        aoob x5 = aoob.x(rSAPrivateCrtKey.getPrimeQ().toByteArray());
        createBuilder2.copyOnWrite();
        ((anrp) createBuilder2.instance).f = x5;
        aoob x6 = aoob.x(rSAPrivateCrtKey.getPrimeExponentP().toByteArray());
        createBuilder2.copyOnWrite();
        ((anrp) createBuilder2.instance).g = x6;
        aoob x7 = aoob.x(rSAPrivateCrtKey.getPrimeExponentQ().toByteArray());
        createBuilder2.copyOnWrite();
        ((anrp) createBuilder2.instance).h = x7;
        aoob x8 = aoob.x(rSAPrivateCrtKey.getCrtCoefficient().toByteArray());
        createBuilder2.copyOnWrite();
        ((anrp) createBuilder2.instance).i = x8;
        return (anrp) createBuilder2.mo39build();
    }

    @Override // defpackage.anmp
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("RSA_SSA_PKCS1_3072_SHA256_F4", new anmo(ansn.i(5, 3072, RSAKeyGenParameterSpec.F4), 1));
        hashMap.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", new anmo(ansn.i(5, 3072, RSAKeyGenParameterSpec.F4), 3));
        hashMap.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", new anmo(ansn.i(5, 3072, RSAKeyGenParameterSpec.F4), 3));
        hashMap.put("RSA_SSA_PKCS1_4096_SHA512_F4", new anmo(ansn.i(6, 4096, RSAKeyGenParameterSpec.F4), 1));
        hashMap.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", new anmo(ansn.i(6, 4096, RSAKeyGenParameterSpec.F4), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ void d(aoqu aoquVar) {
        anrn anrnVar = (anrn) aoquVar;
        anro anroVar = anrnVar.b;
        if (anroVar == null) {
            anroVar = anro.a;
        }
        answ.b(anroVar);
        anus.b(anrnVar.c);
        anus.c(new BigInteger(1, anrnVar.d.I()));
    }
}
