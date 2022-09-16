package defpackage;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: anpl  reason: default package */
/* loaded from: classes.dex */
final class anpl extends anmp {
    public anpl(Class cls) {
        super(cls);
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ aoqu a(aoob aoobVar) {
        return (anqz) aopi.parseFrom(anqz.a, aoobVar, aoos.a());
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ Object b(aoqu aoquVar) {
        anqz anqzVar = (anqz) aoquVar;
        aopa createBuilder = anqy.a.createBuilder();
        createBuilder.copyOnWrite();
        ((anqy) createBuilder.instance).b = 0;
        anra anraVar = anqzVar.b;
        if (anraVar == null) {
            anraVar = anra.a;
        }
        createBuilder.copyOnWrite();
        anraVar.getClass();
        ((anqy) createBuilder.instance).c = anraVar;
        aoob x = aoob.x(anum.a(anqzVar.c));
        createBuilder.copyOnWrite();
        ((anqy) createBuilder.instance).d = x;
        return (anqy) createBuilder.mo39build();
    }

    @Override // defpackage.anmp
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", anpm.k(32, 16, 5, 1));
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", anpm.k(32, 16, 5, 3));
        hashMap.put("HMAC_SHA256_256BITTAG", anpm.k(32, 32, 5, 1));
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", anpm.k(32, 32, 5, 3));
        hashMap.put("HMAC_SHA512_128BITTAG", anpm.k(64, 16, 6, 1));
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", anpm.k(64, 16, 6, 3));
        hashMap.put("HMAC_SHA512_256BITTAG", anpm.k(64, 32, 6, 1));
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", anpm.k(64, 32, 6, 3));
        hashMap.put("HMAC_SHA512_512BITTAG", anpm.k(64, 64, 6, 1));
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", anpm.k(64, 64, 6, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ void d(aoqu aoquVar) {
        anqz anqzVar = (anqz) aoquVar;
        if (anqzVar.c >= 16) {
            anra anraVar = anqzVar.b;
            if (anraVar == null) {
                anraVar = anra.a;
            }
            anpm.i(anraVar);
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
