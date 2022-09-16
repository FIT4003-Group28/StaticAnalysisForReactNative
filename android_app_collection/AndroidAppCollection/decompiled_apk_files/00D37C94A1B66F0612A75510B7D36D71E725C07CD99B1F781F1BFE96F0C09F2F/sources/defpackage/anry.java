package defpackage;

import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: anry  reason: default package */
/* loaded from: classes.dex */
final class anry extends anmp {
    public anry(Class cls) {
        super(cls);
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ aoqu a(aoob aoobVar) {
        return (anqk) aopi.parseFrom(anqk.a, aoobVar, aoos.a());
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ Object b(aoqu aoquVar) {
        anql anqlVar = ((anqk) aoquVar).b;
        if (anqlVar == null) {
            anqlVar = anql.a;
        }
        int e = anqx.e(anqlVar.c);
        if (e == 0) {
            e = 1;
        }
        KeyPair h = antz.h(answ.d(e));
        ECPoint w = ((ECPublicKey) h.getPublic()).getW();
        aopa createBuilder = anqn.a.createBuilder();
        createBuilder.copyOnWrite();
        ((anqn) createBuilder.instance).b = 0;
        createBuilder.copyOnWrite();
        anqlVar.getClass();
        ((anqn) createBuilder.instance).c = anqlVar;
        aoob x = aoob.x(w.getAffineX().toByteArray());
        createBuilder.copyOnWrite();
        ((anqn) createBuilder.instance).d = x;
        aoob x2 = aoob.x(w.getAffineY().toByteArray());
        createBuilder.copyOnWrite();
        ((anqn) createBuilder.instance).e = x2;
        anqn anqnVar = (anqn) createBuilder.mo39build();
        aopa createBuilder2 = anqm.a.createBuilder();
        createBuilder2.copyOnWrite();
        ((anqm) createBuilder2.instance).b = 0;
        createBuilder2.copyOnWrite();
        anqnVar.getClass();
        ((anqm) createBuilder2.instance).c = anqnVar;
        aoob x3 = aoob.x(((ECPrivateKey) h.getPrivate()).getS().toByteArray());
        createBuilder2.copyOnWrite();
        ((anqm) createBuilder2.instance).d = x3;
        return (anqm) createBuilder2.mo39build();
    }

    @Override // defpackage.anmp
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("ECDSA_P256", anrz.i(5, 4, 4, 1));
        hashMap.put("ECDSA_P256_IEEE_P1363", anrz.i(5, 4, 3, 1));
        hashMap.put("ECDSA_P256_RAW", anrz.i(5, 4, 3, 3));
        hashMap.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", anrz.i(5, 4, 3, 3));
        hashMap.put("ECDSA_P384", anrz.i(6, 5, 4, 1));
        hashMap.put("ECDSA_P384_IEEE_P1363", anrz.i(6, 5, 3, 1));
        hashMap.put("ECDSA_P521", anrz.i(6, 6, 4, 1));
        hashMap.put("ECDSA_P521_IEEE_P1363", anrz.i(6, 6, 3, 1));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ void d(aoqu aoquVar) {
        anql anqlVar = ((anqk) aoquVar).b;
        if (anqlVar == null) {
            anqlVar = anql.a;
        }
        answ.a(anqlVar);
    }
}
