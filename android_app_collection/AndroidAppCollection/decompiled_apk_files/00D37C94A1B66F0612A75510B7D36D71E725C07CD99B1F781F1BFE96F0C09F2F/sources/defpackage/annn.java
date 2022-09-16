package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: annn  reason: default package */
/* loaded from: classes.dex */
final class annn extends anmp {
    public annn(Class cls) {
        super(cls);
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ aoqu a(aoob aoobVar) {
        return (anpv) aopi.parseFrom(anpv.a, aoobVar, aoos.a());
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ Object b(aoqu aoquVar) {
        anpv anpvVar = (anpv) aoquVar;
        anmp a = new annr().a();
        anpx anpxVar = anpvVar.b;
        if (anpxVar == null) {
            anpxVar = anpx.a;
        }
        Object b = a.b(anpxVar);
        anmp a2 = new anpm().a();
        anqz anqzVar = anpvVar.c;
        if (anqzVar == null) {
            anqzVar = anqz.a;
        }
        Object b2 = a2.b(anqzVar);
        aopa createBuilder = anpu.a.createBuilder();
        createBuilder.copyOnWrite();
        b.getClass();
        ((anpu) createBuilder.instance).c = (anpw) b;
        createBuilder.copyOnWrite();
        b2.getClass();
        ((anpu) createBuilder.instance).d = (anqy) b2;
        createBuilder.copyOnWrite();
        ((anpu) createBuilder.instance).b = 0;
        return (anpu) createBuilder.mo39build();
    }

    @Override // defpackage.anmp
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", anno.i(16, 16, 1));
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", anno.i(16, 16, 3));
        hashMap.put("AES256_CTR_HMAC_SHA256", anno.i(32, 32, 1));
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", anno.i(32, 32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ void d(aoqu aoquVar) {
        anpv anpvVar = (anpv) aoquVar;
        anmp a = new annr().a();
        anpx anpxVar = anpvVar.b;
        if (anpxVar == null) {
            anpxVar = anpx.a;
        }
        a.d(anpxVar);
        anmp a2 = new anpm().a();
        anqz anqzVar = anpvVar.c;
        if (anqzVar == null) {
            anqzVar = anqz.a;
        }
        a2.d(anqzVar);
        anpx anpxVar2 = anpvVar.b;
        if (anpxVar2 == null) {
            anpxVar2 = anpx.a;
        }
        anus.a(anpxVar2.c);
    }
}
