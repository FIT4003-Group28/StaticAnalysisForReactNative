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
/* renamed from: ansr  reason: default package */
/* loaded from: classes.dex */
final class ansr extends anmp {
    public ansr(Class cls) {
        super(cls);
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ aoqu a(aoob aoobVar) {
        return (anrr) aopi.parseFrom(anrr.a, aoobVar, aoos.a());
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ Object b(aoqu aoquVar) {
        anrr anrrVar = (anrr) aoquVar;
        anrs anrsVar = anrrVar.b;
        if (anrsVar == null) {
            anrsVar = anrs.a;
        }
        anus.b(anrrVar.c);
        int c = anqx.c(anrsVar.b);
        if (c == 0) {
            c = 1;
        }
        answ.f(c);
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) anub.f.a("RSA");
        keyPairGenerator.initialize(new RSAKeyGenParameterSpec(anrrVar.c, new BigInteger(1, anrrVar.d.I())));
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        RSAPublicKey rSAPublicKey = (RSAPublicKey) generateKeyPair.getPublic();
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) generateKeyPair.getPrivate();
        aopa createBuilder = anru.a.createBuilder();
        createBuilder.copyOnWrite();
        ((anru) createBuilder.instance).b = 0;
        createBuilder.copyOnWrite();
        anrsVar.getClass();
        ((anru) createBuilder.instance).c = anrsVar;
        aoob x = aoob.x(rSAPublicKey.getPublicExponent().toByteArray());
        createBuilder.copyOnWrite();
        ((anru) createBuilder.instance).e = x;
        aoob x2 = aoob.x(rSAPublicKey.getModulus().toByteArray());
        createBuilder.copyOnWrite();
        ((anru) createBuilder.instance).d = x2;
        anru anruVar = (anru) createBuilder.mo39build();
        aopa createBuilder2 = anrt.a.createBuilder();
        createBuilder2.copyOnWrite();
        ((anrt) createBuilder2.instance).b = 0;
        createBuilder2.copyOnWrite();
        anruVar.getClass();
        ((anrt) createBuilder2.instance).c = anruVar;
        aoob x3 = aoob.x(rSAPrivateCrtKey.getPrivateExponent().toByteArray());
        createBuilder2.copyOnWrite();
        ((anrt) createBuilder2.instance).d = x3;
        aoob x4 = aoob.x(rSAPrivateCrtKey.getPrimeP().toByteArray());
        createBuilder2.copyOnWrite();
        ((anrt) createBuilder2.instance).e = x4;
        aoob x5 = aoob.x(rSAPrivateCrtKey.getPrimeQ().toByteArray());
        createBuilder2.copyOnWrite();
        ((anrt) createBuilder2.instance).f = x5;
        aoob x6 = aoob.x(rSAPrivateCrtKey.getPrimeExponentP().toByteArray());
        createBuilder2.copyOnWrite();
        ((anrt) createBuilder2.instance).g = x6;
        aoob x7 = aoob.x(rSAPrivateCrtKey.getPrimeExponentQ().toByteArray());
        createBuilder2.copyOnWrite();
        ((anrt) createBuilder2.instance).h = x7;
        aoob x8 = aoob.x(rSAPrivateCrtKey.getCrtCoefficient().toByteArray());
        createBuilder2.copyOnWrite();
        ((anrt) createBuilder2.instance).i = x8;
        return (anrt) createBuilder2.mo39build();
    }

    @Override // defpackage.anmp
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("RSA_SSA_PSS_3072_SHA256_F4", new anmo(anss.i(5, 5, 32, 3072, RSAKeyGenParameterSpec.F4), 1));
        hashMap.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", new anmo(anss.i(5, 5, 32, 3072, RSAKeyGenParameterSpec.F4), 3));
        hashMap.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", new anmo(anss.i(5, 5, 32, 3072, RSAKeyGenParameterSpec.F4), 1));
        hashMap.put("RSA_SSA_PSS_4096_SHA512_F4", new anmo(anss.i(6, 6, 64, 4096, RSAKeyGenParameterSpec.F4), 1));
        hashMap.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", new anmo(anss.i(6, 6, 64, 4096, RSAKeyGenParameterSpec.F4), 3));
        hashMap.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", new anmo(anss.i(6, 6, 64, 4096, RSAKeyGenParameterSpec.F4), 1));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ void d(aoqu aoquVar) {
        anrr anrrVar = (anrr) aoquVar;
        anrs anrsVar = anrrVar.b;
        if (anrsVar == null) {
            anrsVar = anrs.a;
        }
        answ.c(anrsVar);
        anus.b(anrrVar.c);
        anus.c(new BigInteger(1, anrrVar.d.I()));
    }
}
