package defpackage;

import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: anoy  reason: default package */
/* loaded from: classes.dex */
final class anoy extends anmp {
    public anoy(Class cls) {
        super(cls);
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ aoqu a(aoob aoobVar) {
        return (anqp) aopi.parseFrom(anqp.a, aoobVar, aoos.a());
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ Object b(aoqu aoquVar) {
        anqp anqpVar = (anqp) aoquVar;
        anqq anqqVar = anqpVar.b;
        if (anqqVar == null) {
            anqqVar = anqq.a;
        }
        anqt anqtVar = anqqVar.b;
        if (anqtVar == null) {
            anqtVar = anqt.a;
        }
        int e = anqx.e(anqtVar.b);
        if (e == 0) {
            e = 1;
        }
        KeyPair h = antz.h(anpf.c(e));
        ECPrivateKey eCPrivateKey = (ECPrivateKey) h.getPrivate();
        ECPoint w = ((ECPublicKey) h.getPublic()).getW();
        aopa createBuilder = anqs.a.createBuilder();
        createBuilder.copyOnWrite();
        ((anqs) createBuilder.instance).b = 0;
        anqq anqqVar2 = anqpVar.b;
        if (anqqVar2 == null) {
            anqqVar2 = anqq.a;
        }
        createBuilder.copyOnWrite();
        anqqVar2.getClass();
        ((anqs) createBuilder.instance).c = anqqVar2;
        aoob x = aoob.x(w.getAffineX().toByteArray());
        createBuilder.copyOnWrite();
        ((anqs) createBuilder.instance).d = x;
        aoob x2 = aoob.x(w.getAffineY().toByteArray());
        createBuilder.copyOnWrite();
        ((anqs) createBuilder.instance).e = x2;
        anqs anqsVar = (anqs) createBuilder.mo39build();
        aopa createBuilder2 = anqr.a.createBuilder();
        createBuilder2.copyOnWrite();
        ((anqr) createBuilder2.instance).b = 0;
        createBuilder2.copyOnWrite();
        anqsVar.getClass();
        ((anqr) createBuilder2.instance).c = anqsVar;
        aoob x3 = aoob.x(eCPrivateKey.getS().toByteArray());
        createBuilder2.copyOnWrite();
        ((anqr) createBuilder2.instance).d = x3;
        return (anqr) createBuilder2.mo39build();
    }

    @Override // defpackage.anmp
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", anoz.i(3, anpf.f("AES128_GCM"), anoz.c, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", anoz.i(3, anpf.f("AES128_GCM"), anoz.c, 3));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", anoz.i(4, anpf.f("AES128_GCM"), anoz.c, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", anoz.i(4, anpf.f("AES128_GCM"), anoz.c, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", anoz.i(4, anpf.f("AES128_GCM"), anoz.c, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", anoz.i(3, anpf.f("AES128_CTR_HMAC_SHA256"), anoz.c, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", anoz.i(3, anpf.f("AES128_CTR_HMAC_SHA256"), anoz.c, 3));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", anoz.i(4, anpf.f("AES128_CTR_HMAC_SHA256"), anoz.c, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", anoz.i(4, anpf.f("AES128_CTR_HMAC_SHA256"), anoz.c, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ void d(aoqu aoquVar) {
        anqq anqqVar = ((anqp) aoquVar).b;
        if (anqqVar == null) {
            anqqVar = anqq.a;
        }
        anpf.a(anqqVar);
    }
}
